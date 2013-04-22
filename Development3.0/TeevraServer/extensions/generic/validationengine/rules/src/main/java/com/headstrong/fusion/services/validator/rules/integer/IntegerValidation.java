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
 * $Id: IntegerValidation.java
 * $Revision: 
 * $Author: mbafna
 * $DateTime: Nov 24, 2008 
 */

package com.headstrong.fusion.services.validator.rules.integer;

import java.util.Map;

import com.headstrong.fusion.commons.util.FusionUtil;
import com.headstrong.fusion.services.validator.rulemanager.Rule;
import com.headstrong.fusion.services.validator.rulemanager.RuleVO;
import com.headstrong.fusion.services.validator.rulemanager.exception.RuleOperationFailedException;

/**
 * 
 */
public class IntegerValidation implements Rule {

	private static String MINVALUE = "minvalue";
	private static String MAXVALUE = "maxvalue";

	/**
	 * Returns {@link RuleVO} for {@link IntegerValidation}
	 * 
	 * @return
	 */
	public static final RuleVO getRuleVO() {
		RuleVO ruleVO = new RuleVO();
		ruleVO.setAliasName("integervalidation");
		ruleVO.setClassName(IntegerValidation.class.getName());
		ruleVO.addInParameter(OPERAND);
		ruleVO.addInParameter(MINVALUE);
		ruleVO.addInParameter(MAXVALUE);
		return ruleVO;
	}

	public Object validate(Map<String, Object> data, StringBuffer sb)
			throws RuleOperationFailedException {

		Object operand = data.get(OPERAND);
		int value = 0;
		try {
			value = FusionUtil.parseInt(operand);
		} catch (Exception e) {
			sb.append(operand).append(" is not an integer").append(
					e.getMessage());
			return false;
		}

		Object minValue = data.get(MINVALUE);
		try {

			if ((minValue != null)  && (value < FusionUtil.parseInt(minValue))) {
					sb.append(operand).append("is less than ").append(minValue);
					return false;
				}
			
		} catch (Exception e) {
			throw new RuleOperationFailedException(minValue +" is not an integer",e);
		}

		Object maxValue = data.get(MAXVALUE);
		try {
			if ((maxValue != null) && (value > FusionUtil.parseInt(maxValue))) {
					sb.append(operand).append("is greater than ").append(
							maxValue);
					return false;
				}
			
		} catch (Exception e) {
			throw new RuleOperationFailedException(maxValue +" is not an integer",e);
		}

		return true;
	}

}
