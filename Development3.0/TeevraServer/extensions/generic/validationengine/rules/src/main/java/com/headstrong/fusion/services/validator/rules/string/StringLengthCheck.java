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
 * $Id: StringLengthCheck.java
 * $Revision: 
 * $Author: MBafna
 * $DateTime: Dec 12, 2008 
 */

package com.headstrong.fusion.services.validator.rules.string;

import java.util.Map;

import com.headstrong.fusion.commons.util.FusionUtil;
import com.headstrong.fusion.services.validator.rulemanager.Rule;
import com.headstrong.fusion.services.validator.rulemanager.RuleVO;
import com.headstrong.fusion.services.validator.rulemanager.exception.RuleOperationFailedException;

/**
 * 
 */
public class StringLengthCheck implements Rule {

	private static String MINLENGTH = "minlength";
	private static String MAXLENGTH = "maxlength";

	/**
	 * Returns {@link RuleVO} for {@link StringLengthCheck}
	 * 
	 * @return
	 */
	public static final RuleVO getRuleVO() {
		RuleVO ruleVO = new RuleVO();
		ruleVO.setAliasName("stringlength");
		ruleVO.setClassName(StringLengthCheck.class.getName());
		ruleVO.addInParameter(OPERAND);
		ruleVO.addInParameter(MINLENGTH);
		ruleVO.addInParameter(MAXLENGTH);
		return ruleVO;
	}

	public Object validate(Map<String, Object> data, StringBuffer sb)
			throws RuleOperationFailedException {

		Object operand = data.get(OPERAND);
		
		if (operand==null) {
			sb.append("Operand cannot be null");
			return false;
		}
		
		String stOperand=(String)operand;

		Object minLength = data.get(MINLENGTH);
		try {

			if ((minLength != null)  && (stOperand.length() < FusionUtil.parseInt(minLength))) {
					sb.append(operand).append(" length is less than ").append(minLength);
					return false;
				}
			
		} catch (Exception e) {
			throw new RuleOperationFailedException(minLength +" is not an integer",e);
		}

		Object maxLength = data.get(MAXLENGTH);
		try {
			if ((maxLength != null) && (stOperand.length() > FusionUtil.parseInt(maxLength))) {
					sb.append(operand).append(" length is greater than ").append(
							maxLength);
					return false;
				}
			
		} catch (Exception e) {
			throw new RuleOperationFailedException(maxLength +" is not an integer",e);
		}

		return true;
	}

}
