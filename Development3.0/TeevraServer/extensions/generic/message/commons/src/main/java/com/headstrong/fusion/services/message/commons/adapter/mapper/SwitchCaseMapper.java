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
 * $Id: SwitchCaseMapper.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jun 15, 2009 
 */

package com.headstrong.fusion.services.message.commons.adapter.mapper;

import java.util.List;
import java.util.Map;

import com.headstrong.fusion.bo.BusinessObject;
import com.headstrong.fusion.bo.impl.exception.InvalidAttributeExpressionException;
import com.headstrong.fusion.commons.expression.evaluator.EvaluationContext;
import com.headstrong.fusion.commons.expression.evaluator.Expression;
import com.headstrong.fusion.commons.expression.evaluator.util.DefaultEvaluationContext;
import com.headstrong.fusion.services.message.commons.adapter.mapper.config.Statement;
import com.headstrong.fusion.services.message.commons.adapter.mapper.config.SwitchCaseStatement;
import com.headstrong.fusion.services.message.commons.adapter.mapper.config.SwitchType;
import com.headstrong.fusion.services.message.commons.adapter.mapper.exception.MappingException;

/**
 * Maps the field based on switch case statements.
 */
public class SwitchCaseMapper implements Mapper {

	private static final String DEFAULT = "default";

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.headstrong.fusion.services.adapter.message.euronext.mapper.Mapper
	 * #map(com.headstrong.fusion.bo.BusinessObject,
	 * com.headstrong.fusion.bo.BusinessObject)
	 */
	public void map(Map<String, Object> headers, Statement statement,
			BusinessObject source, BusinessObject target)
			throws MappingException, InvalidAttributeExpressionException {
		if (!(statement instanceof SwitchCaseStatement)) {
			throw new MappingException("invalid configuration provided");
		}
		// copy the source field data to target field.
		SwitchCaseStatement switchCaseStatement = (SwitchCaseStatement) statement;
		// evaluate the expression ... and get the result.
		Expression expression = switchCaseStatement.getExpression();
		Object result = null;
		try {
			EvaluationContext evaluationContext = new DefaultEvaluationContext();
			evaluationContext.set(EvaluationContext.HEADER, headers);
			evaluationContext.set(EvaluationContext.BUSINESS_OBJECT, source);
			result = expression.evaluate(evaluationContext);
		} catch (Exception e) {

			throw new MappingException("Error evaluating the expression "
					+ expression, e);
		}
		// Mapper mapper =
		// MapperFactory.getMapper(FieldMapping.class.getName());

		/*
		 * for (Entry<String, List<FieldMapping>> switchCase :
		 * switchCaseStatement .getCases().entrySet()) { if
		 * (switchCase.getKey().equals(result.toString())) { // maps to the
		 * case. for (FieldMapping mapping : switchCase.getValue()) {
		 * mapper.map(headers, mapping, source, target); } } }
		 */
		// modified by Arun to support default cases
		if (result == null) {
			result = DEFAULT;
		}
		List<Statement> statements = switchCaseStatement.getCases().get(
				result.toString());
		if (SwitchType.Mandatory.equals(switchCaseStatement.getType())
				&& statements == null) {
			throw new MappingException(
					"Switch expression matching is mandatory " + "{expression:"
							+ switchCaseStatement.getExpression() + "}" + ".");

		} else {
			if (statements == null) {
				statements = switchCaseStatement.getCases().get(DEFAULT);
			}
			if (statements != null) {
				for (Statement mapping : statements) {
					Mapper mapper = MapperFactory.getMapper(mapping.getClass()
							.getName());
					mapper.map(headers, mapping, source, target);
				}
			}

		}
	}
}
