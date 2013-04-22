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
 * $Id: AddRule.java
 * $Revision: 
 * $Author: mbafna
 * $DateTime: Nov 6, 2008 
 */

package com.headstrong.fusion.services.transformer.rules.mathrules;

import java.text.NumberFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.util.FusionUtil;
import com.headstrong.fusion.services.transformer.rulemanager.Rule;
import com.headstrong.fusion.services.transformer.rulemanager.RuleVO;
import com.headstrong.fusion.services.transformer.rulemanager.exception.RuleOperationFailedException;
import com.headstrong.fusion.services.transformer.rules.stringrules.SubStringRule;

/**
 * <code>AddRule</code> is the {@link Rule} that performs Arithmetic operation
 * Add.
 * <p>
 * The input Parameters required by this rule includes:
 * <ul>
 * <li>operand : operand list to be added
 * </ul>
 * <p>
 * The output parameters set by this rule includes :
 * <ul>
 * <li>result : The sum of the operands passed in {@link Double}
 * <ul>
 */
public class AddRule implements Rule {
	private static final Logger logger = LoggerFactory
			.getLogger(SubStringRule.class);

	private static NumberFormat nf = NumberFormat.getInstance(Locale.US);
	static {
		nf.setGroupingUsed(false);
	}

	/**
	 * Get the {@link RuleVO} for {@link AddRule}
	 * 
	 * @precondition
	 * @postcondition
	 * @return
	 */
	public static final RuleVO getRuleVO() {
		RuleVO ruleVO = new RuleVO();
		ruleVO.setAliasName("add");
		ruleVO.setClassName(AddRule.class.getName());
		ruleVO.addInParameter(OPERAND);
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
				logger.debug("Addrule operating on :" + data);
			}

			Double sum = 0.0;
			Object operandData = data.get(OPERAND);
			if (operandData instanceof List) {
				for (Object operand : (List) operandData) {
					sum = sum + FusionUtil.parseDouble(operand);
				}

			} else if (operandData != null) {
				sum = FusionUtil.parseDouble(operandData);
			}

			Map<String, Object> resultMap = new HashMap<String, Object>();
			resultMap.put(RESULT, nf.format(sum));
			return resultMap;
		} catch (Exception e) {
			logger.error("Error while operating rule on :" + data);
			throw new RuleOperationFailedException(
					"Error while operating rule on :", e);
		}

	}

}
