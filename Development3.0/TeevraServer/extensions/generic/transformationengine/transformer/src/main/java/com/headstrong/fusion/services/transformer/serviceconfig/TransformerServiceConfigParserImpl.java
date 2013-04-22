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
 * $Id: TransformerServiceConfigParserImpl.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Nov 10, 2008 
 */

package com.headstrong.fusion.services.transformer.serviceconfig;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.jdom.Attribute;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.jdom.xpath.XPath;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.FusionConstants;
import com.headstrong.fusion.commons.expression.evaluator.Expression;
import com.headstrong.fusion.commons.expression.evaluator.parser.ExpressionParser;
import com.headstrong.fusion.commons.expression.evaluator.parser.ParseException;
import com.headstrong.fusion.services.config.exception.ServiceConfigurationParseException;

/**
 * Parses transformation service configuration.
 * 
 */
public class TransformerServiceConfigParserImpl implements
		TransformerServiceConfigParser {

	private static final Logger logger = LoggerFactory
			.getLogger(TransformerServiceConfigParserImpl.class);
	private static final String RULESET = "ruleset";
	private static final String RULE = "rule";
	private static final String INPUT = "input";
	private static final String OUTPUT = "output";
	private static final String CONDITION = "conditionExpr";
	private static ExpressionParser parser = new ExpressionParser();

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.services.config.parse.ServiceConfigurationParser#parseConfiguration(java.lang.Object)
	 */
	@SuppressWarnings("unchecked")
	public Object parseConfiguration(Object configuration)
			throws ServiceConfigurationParseException {

		TransformerServiceConfig serviceConfig = new TransformerServiceConfig();

		SAXBuilder builder = new SAXBuilder();
		Document document = null;
		try {
			document = builder
					.build(new StringReader(configuration.toString()));
		} catch (JDOMException e) {
			logger.error("Error parsing the configuration", e);
			throw new ServiceConfigurationParseException(e);
		} catch (IOException e) {
			logger.error("Error parsing the configuration", e);
			throw new ServiceConfigurationParseException(e);
		}
		Element root = null;
		try {
			root = (Element) XPath.selectSingleNode(document, RULESET);
		} catch (JDOMException e) {
			logger.error("Error parsing the configuration", e);
			throw new ServiceConfigurationParseException(e);
		}

		/**
		 * Select all fields.
		 */
		List<Element> rules = null;
		try {
			rules = (List<Element>) XPath.selectNodes(root, RULE);
		} catch (JDOMException e) {
			logger.error("Error parsing the configuration", e);
			throw new ServiceConfigurationParseException(e);
		}

		String ruleName = null;
		String sequenceId = null;
		Expression condition = null;

		for (Element rule : rules) {

			RuleSet ruleSet = new RuleSet();
			/**
			 * 
			 */
			Attribute ruleNameAttr = rule.getAttribute("name");
			Attribute ruleSequenceAttr = rule.getAttribute("sequence");
			
			ruleName = ruleNameAttr.getValue().trim();
			sequenceId = ruleSequenceAttr.getValue().trim();

			ruleSet.setRuleName(ruleName);
			ruleSet.setSequenceId(Integer.parseInt(sequenceId));

			try {
				// set of input fields.
				List<Element> inputElements = (List<Element>) XPath
						.selectNodes(rule, INPUT);

				List<FieldSet> inputFieldSet = new ArrayList<FieldSet>();
				for (Element inputElement : inputElements) {
					inputFieldSet.add(createFieldSet(inputElement, ruleName,
							true));
				}
				ruleSet.setInputFields(inputFieldSet);

				//set of output fields
				List<Element> outputElements = (List<Element>) XPath
						.selectNodes(rule, OUTPUT);

				List<FieldSet> outputFieldSet = new ArrayList<FieldSet>();
				for (Element outputElement : outputElements) {
					outputFieldSet.add(createFieldSet(outputElement, ruleName,
							false));
				}
				ruleSet.setOutputFields(outputFieldSet);
				
				//condition
				try {
					List<Element> conditionElements = (List<Element>) XPath
					.selectNodes(rule, CONDITION);
					if ((conditionElements != null) && (conditionElements.size() > 0)) {
						Element conditionElement = conditionElements.get(0);
						String conditionExpr = conditionElement.getTextTrim();
						if(conditionExpr.trim().length() != 0){
							condition = parser.parse(conditionExpr.trim());
							ruleSet.setCondition(condition);
						}
					}
				} catch (ParseException e1) {
					throw new ServiceConfigurationParseException(e1);
				}
			} catch (JDOMException e) {
				logger.error("Error parsing the configuration", e);
				throw new ServiceConfigurationParseException(e);
			}

			serviceConfig.addRule(ruleSet);
		}

		Collections.sort(serviceConfig.getRules());

		return serviceConfig;
	}

	/**
	 * @precondition
	 * @postcondition
	 * @param fieldElement
	 * @param ruleName
	 * @param expr
	 * @return
	 * @throws ServiceConfigurationParseException
	 */
	private FieldSet createFieldSet(Element fieldElement, String ruleName,
			boolean expr) throws ServiceConfigurationParseException {
		FieldSet fieldSet = new FieldSet();

		Attribute fieldNameAttr = fieldElement.getAttribute("name");
		Attribute fieldValueAttr = fieldElement.getAttribute("value");
		Attribute fieldTypeAttr = fieldElement.getAttribute("type");

		fieldSet.setParamName(fieldNameAttr.getValue().trim());
		fieldSet.setParamType(fieldTypeAttr.getValue().trim());
		String paramValue = fieldValueAttr.getValue().trim();
		if ((FusionConstants.ARITHMETIC_EXPRESSION.equals(ruleName)) && (expr)) {
			ExpressionParser parser = new ExpressionParser();
			try {
				fieldSet.setParamValue(parser.parse(paramValue));
			} catch (ParseException e) {
				logger.error("Error parsing the given string expression", e);
				throw new ServiceConfigurationParseException(e);
			}
		} else {
			fieldSet.setParamValue(paramValue);
		}
		return fieldSet;
	}

}
