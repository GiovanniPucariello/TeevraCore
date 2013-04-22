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
 * $Id: IsNullValidation.java
 * $Revision: 
 * $Author: mbafna
 * $DateTime: Nov 25, 2008 
 */

package com.headstrong.fusion.services.validator.rules.nullchecks;

import java.util.Map;

import com.headstrong.fusion.services.validator.rulemanager.Rule;
import com.headstrong.fusion.services.validator.rulemanager.RuleVO;
import com.headstrong.fusion.services.validator.rulemanager.exception.RuleOperationFailedException;

/**
 * 
 */
public class IsNullValidation implements Rule {

	/**
	 * Returns {@link RuleVO} for {@link IsNullValidation}
	 * 
	 * @return
	 */
	public static final RuleVO getRuleVO() {
		RuleVO ruleVO = new RuleVO();
		ruleVO.setAliasName("isnull");
		ruleVO.setClassName(IsNullValidation.class.getName());
		ruleVO.addInParameter(OPERAND);
		return ruleVO;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.services.validator.rulemanager.Rule#validate(java.util.Map,
	 *      java.lang.StringBuffer)
	 */
	public Object validate(Map<String, Object> data, StringBuffer sb)
			throws RuleOperationFailedException {
		if ((data.get(OPERAND) == null) || (data.get(OPERAND).toString().length()==0)){
			return true;
		} else {
			return false;
		}
	}
}
