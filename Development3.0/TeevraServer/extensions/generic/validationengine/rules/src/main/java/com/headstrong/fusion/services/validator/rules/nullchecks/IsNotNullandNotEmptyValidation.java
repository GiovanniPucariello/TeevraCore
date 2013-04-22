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
 * $Id: IsNotNullandNotEmptyValidation.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Jul 24, 2009 
 */

package com.headstrong.fusion.services.validator.rules.nullchecks;

import java.util.List;
import java.util.Map;

import com.headstrong.fusion.services.validator.rulemanager.Rule;
import com.headstrong.fusion.services.validator.rulemanager.RuleVO;
import com.headstrong.fusion.services.validator.rulemanager.exception.RuleOperationFailedException;

/**
 * Validates if the given Operand is not null and not empty as well
 */
public class IsNotNullandNotEmptyValidation implements Rule {

	/**
	 * Returns {@link RuleVO} for {@link IsNotNullandNotEmptyValidation}
	 * 
	 * @return
	 */
	public static final RuleVO getRuleVO() {
		RuleVO ruleVO = new RuleVO();
		ruleVO.setAliasName("isnotnullandnotempty");
		ruleVO.setClassName(IsNotNullandNotEmptyValidation.class.getName());
		ruleVO.addInParameter(OPERAND);
		return ruleVO;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.services.validator.rulemanager.Rule#validate(java.util.Map,
	 *      java.lang.StringBuffer)
	 */
	@SuppressWarnings("unchecked")
	public Object validate(Map<String, Object> data, StringBuffer sb)
			throws RuleOperationFailedException {
		
		boolean isNotNullAndNotEmpty = true;
		Object operand = data.get(OPERAND);
		if (operand == null || operand.toString().trim().length() ==0) {
			isNotNullAndNotEmpty = false;
		} else if (operand instanceof List) {
			for (Object childOperand : (List<Object>) operand) {
				if (childOperand == null || childOperand.toString().trim().length() ==0) {
					isNotNullAndNotEmpty = false;
					break;
				}
			}
		}
		return isNotNullAndNotEmpty;
	}

}
