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
 * $Id: ArithmeticExpressionRule.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Jun 25, 2009 
 */

package com.headstrong.fusion.services.transformer.rules.mathrules;

import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.FusionConstants;
import com.headstrong.fusion.commons.expression.evaluator.EvaluationContext;
import com.headstrong.fusion.commons.expression.evaluator.Expression;
import com.headstrong.fusion.commons.expression.evaluator.util.DefaultEvaluationContext;
import com.headstrong.fusion.services.transformer.rulemanager.Rule;
import com.headstrong.fusion.services.transformer.rulemanager.RuleVO;
import com.headstrong.fusion.services.transformer.rulemanager.exception.RuleOperationFailedException;

/**
 * <code>ArithmeticExpressionRule</code> is the {@link Rule} that performs the
 * given complex Arithmetic operation
 * <p>
 * The input Parameters required by this rule includes:
 * <ul>
 * <li>expression : Expression object obtained from the arithmetic expression
 * </ul>
 * <p>
 * The output parameters set by this rule includes :
 * <ul>
 * <li>result : The arithmetic result of the expression passed in
 * {@link Double}
 * <ul>
 */
public class ArithmeticExpressionRule implements Rule {

	private static final Logger logger = LoggerFactory
			.getLogger(ArithmeticExpressionRule.class);

	public static final String EXPRESSION = "expression";

	private static NumberFormat nf = NumberFormat.getInstance(Locale.US);
	static {
		nf.setGroupingUsed(false);
	}

	/**
	 * Get the {@link RuleVO} for {@link ArithmeticExpressionRule}
	 * 
	 * @precondition
	 * @postcondition
	 * @return
	 */
	public static final RuleVO getRuleVO() {
		RuleVO ruleVO = new RuleVO();
		ruleVO.setAliasName(FusionConstants.ARITHMETIC_EXPRESSION);
		ruleVO.setClassName(ArithmeticExpressionRule.class.getName());
		ruleVO.addInParameter(EXPRESSION);
		ruleVO.addOutParameter(RESULT);
		return ruleVO;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.services.transformer.rulemanager.Rule#operate(java.util.Map)
	 */
	@SuppressWarnings("unchecked")
	public Object operate(Map<String, Object> data)
			throws RuleOperationFailedException {
		try {
			if (logger.isDebugEnabled()) {
				logger.debug("Expression rule operating on :" + data);
			}

			Expression exp = (Expression) data.get(EXPRESSION);

			EvaluationContext ctx = new DefaultEvaluationContext();
			ctx.set(EvaluationContext.BUSINESS_OBJECT, data
					.get(FusionConstants.INPUT_BO));
			ctx
					.set(EvaluationContext.HEADER, data
							.get(FusionConstants.HEADERS));
			Map<String, Object> tempFields = (Map<String, Object>) data
					.get(FusionConstants.TEMP_FIELDS);

			// take each key from tempFields and do the following for each key
			for (Map.Entry<String, Object> entry : tempFields.entrySet()) {
				Object tempValue = entry.getValue();
				try {
					ctx.set(entry.getKey(), Double.parseDouble(tempValue
							.toString()));
				} catch (NumberFormatException e) {
					continue;
				}
			}
			Object result = exp.evaluate(ctx);
			Map<String, Object> resultMap = new HashMap<String, Object>();
			resultMap.put(RESULT, nf.format(result));
			return resultMap;
		} catch (Exception e) {
			logger.error("Error while operating rule on :" + data);
			throw new RuleOperationFailedException(
					"Error while operating rule on :", e);
		}
	}

}
