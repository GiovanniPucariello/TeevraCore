/*
 * The information in this document is subject to change without notice and 
 * does not represent a commitment by Headstrong Corporation. The software 
 * and/or databases described in this document are furnished under a license 
 * agreement and may be used or copied only in accordance with the terms of 
 * the agreement. 
 * 
 * Copyright © 2008 Headstrong Corporation
 * All rights reserved.
 * 
 * $Id: CBRProcessor.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Nov 27, 2008 
 */

package com.headstrong.fusion.messaging.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Pattern;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.commons.jexl.Expression;
import org.apache.commons.jexl.ExpressionFactory;
import org.apache.commons.jexl.JexlContext;
import org.apache.commons.jexl.JexlHelper;

import com.headstrong.fusion.commons.FusionConstants;
import com.headstrong.fusion.config.CBREndPointConfig;
import com.headstrong.fusion.config.When;

/**
 * Content Based Grouping of message is done by the processor.
 * 
 */
public class CBRProcessor implements Processor {

	private CBREndPointConfig config;
	private Map<When, Expression> expressions;

	private static final String HEADER = "header";
	private static final String BODY = "message";

	public CBRProcessor(CBREndPointConfig config) throws Exception {
		this.config = config;
		this.initializeExpressions();
	}

	/**
	 * CBR Expression Samples.
	 * <p>
	 * HEADER ONLY (#header{type}.equals("type1"))
	 * <p>
	 * COMPLETE (#header{type}.equals("type1") &&
	 * #body{parent.child}.equals("data"))
	 * <p>
	 * #header refers to the header data and #body refers to the field in the
	 * message body. All the field references would be replaced with actual
	 * method calls on the header and message bean.
	 * 
	 * @throws Exception
	 */
	private void initializeExpressions() throws Exception {
		Map<When, Expression> expressions = new HashMap<When, Expression>();
		for (When when : this.getConfig().getWhen()) {
			String expression = when.getExpression();
			for (Entry<String, String> field : getTokens(expression, "#header")
					.entrySet()) {
				expression = expression.replaceAll(Pattern
						.quote(field.getKey()), HEADER + ".get(\""
						+ field.getValue() + "\")");
			}

			for (Entry<String, String> field : getTokens(expression, "#body")
					.entrySet()) {
				expression = expression.replaceAll(Pattern
						.quote(field.getKey()), BODY + ".getValue(\""
						+ field.getValue() + "\")");
			}
			// create JEXL- expression
			Expression jexlExpr = ExpressionFactory
					.createExpression(expression);
			expressions.put(when, jexlExpr);
		}
		this.setExpressions(expressions);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.camel.Processor#process(org.apache.camel.Exchange)
	 */
	@SuppressWarnings("unchecked")
	public void process(Exchange exchange) throws Exception {

		Object inputMessage = exchange.getIn().getBody();
		Object header = exchange.getIn().getHeaders();

		// Size of the list of sub-lists being created after content based
		// sub-grouping.
		int size = config.getWhen().size()
				+ (config.getOtherwise() == null ? 0 : 1);

		if (inputMessage instanceof List) {
			List<List<Object>> outputList = new ArrayList<List<Object>>(size);
			this.initializeList(outputList, size);
			for (Object message : (List<Object>) inputMessage) {
				boolean matchFound = false;
				for (When when : config.getWhen()) {
					Expression expression = this.getExpressions().get(when);
					if (expression != null
							&& this.evaluateExpression(expression, header,
									message)) {
						// since the list is already initialized null check
						// is not required.
						List<Object> subList = outputList.get(config.getWhen()
								.indexOf(when));
						subList.add(message);
						matchFound = true;
						break;
					}
				}
				if (!matchFound && config.getOtherwise() != null) {
					// put it in the last index element.
					List<Object> subList = outputList.get(size - 1);
					subList.add(message);
				}
			}
			this.clearEmptySubLists(outputList);
			exchange.getIn().setBody(outputList);
		} else {
			List<Object> outputList = new ArrayList<Object>(size);
			this.initializeListWithNull(outputList, size);
			boolean matchFound = false;
			for (When when : config.getWhen()) {
				Expression expression = this.getExpressions().get(when);
				if (expression != null) {
					JexlContext jc = JexlHelper.createContext();
					// Now evaluate the expression, getting the result
					jc.getVars().put(HEADER, header);
					jc.getVars().put(BODY, inputMessage);
					if (this.evaluateExpression(expression, header,
							inputMessage)) {
						outputList.set(config.getWhen().indexOf(when),
								inputMessage);
						matchFound = true;
						break;
					}
				}
			}
			if (!matchFound && config.getOtherwise() != null) {
				outputList.set(size - 1, inputMessage);
			}
			exchange.getIn().setBody(outputList);
		}
	}

	@SuppressWarnings("unchecked")
	private boolean evaluateExpression(Expression expression, Object header,
			Object body) throws Exception {
		Boolean expressionResult = false;
		JexlContext jc = JexlHelper.createContext();
		// Now evaluate the expression, getting the result
		jc.getVars().put(HEADER, header);
		jc.getVars().put(BODY, body);
		// FIXME To avoid runtime exceptions.
		Object result = expression.evaluate(jc);
		if ( result != null ) {
			expressionResult = (Boolean) result;
		}
		return expressionResult;
	}

	/**
	 * Initializes the list with empty sublists.
	 * 
	 * @param list
	 * @param size
	 */
	@SuppressWarnings("unchecked")
	private void initializeListWithNull(List list, int size) {
		for (int i = 0; i < size; i++) {
			list.add(FusionConstants.EMPTY_STRING);
		}
	}

	/**
	 * Initializes the list with empty sublists.
	 * 
	 * @param list
	 * @param size
	 */
	@SuppressWarnings("unchecked")
	private void initializeList(List list, int size) {
		for (int i = 0; i < size; i++) {
			list.add(new ArrayList<Object>());
		}
	}

	/**
	 * Sets the index values to null if the sublist at that index is empty.
	 * Required for the content based router.
	 * 
	 * @param list
	 */
	private void clearEmptySubLists(List<List<Object>> list) {
		for (int i = 0; i < list.size(); i++) {
			List<Object> subList = list.get(i);
			if (subList != null && subList.isEmpty()) {
				list.set(i, FusionConstants.EMPTY_LIST);
			}
		}
	}

	/**
	 * @return the config
	 */
	public CBREndPointConfig getConfig() {
		return config;
	}

	/**
	 * @param config
	 *            the config to set
	 */
	public void setConfig(CBREndPointConfig config) {
		this.config = config;
	}

	/**
	 * @return the expressions
	 */
	public Map<When, Expression> getExpressions() {
		return expressions;
	}

	/**
	 * @param expressions
	 *            the expressions to set
	 */
	public void setExpressions(Map<When, Expression> expressions) {
		this.expressions = expressions;
	}

	/**
	 * 
	 * @precondition
	 * @postcondition
	 * @param str
	 * @param identifier
	 * @return
	 */
	private Map<String, String> getTokens(String str, String identifier) {
		int identifierIndex = 0;
		int fieldIndex = 0;
		Map<String, String> tokens = new HashMap<String, String>();
		while (true) {
			identifierIndex = str.indexOf(identifier, fieldIndex);
			if (identifierIndex != -1) {
				fieldIndex = identifierIndex + identifier.length() + 1;
				String token = str.substring(identifierIndex, str.indexOf("}",
						fieldIndex) + 1);
				String field = str.substring(fieldIndex, str.indexOf("}",
						fieldIndex));
				tokens.put(token, field);
			} else {
				break;
			}
		}
		return tokens;
	}

}
