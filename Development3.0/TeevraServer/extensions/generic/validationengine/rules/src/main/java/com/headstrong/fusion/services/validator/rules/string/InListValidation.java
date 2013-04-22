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
 * $Id: InListValidation.java
 * $Revision: 
 * $Author: mbafna
 * $DateTime: Nov 24, 2008 
 */

package com.headstrong.fusion.services.validator.rules.string;

import java.util.List;
import java.util.Map;

import com.headstrong.fusion.services.validator.rulemanager.Rule;
import com.headstrong.fusion.services.validator.rulemanager.RuleVO;
import com.headstrong.fusion.services.validator.rulemanager.exception.RuleOperationFailedException;

/**
 * 
 */
public class InListValidation implements Rule {

	public static final String ENUM = "enum";

	/**
	 * Returns {@link RuleVO} for {@link NotInListValidation}
	 * 
	 * @return
	 */
	public static final RuleVO getRuleVO() {
		RuleVO ruleVO = new RuleVO();
		ruleVO.setAliasName("inlist");
		ruleVO.setClassName(InListValidation.class.getName());
		ruleVO.addInParameter(OPERAND);
		ruleVO.addInParameter(ENUM);
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
		String operand = data.get(OPERAND).toString();
		try {
			Object enumObject=data.get(ENUM);
			if (enumObject instanceof List ) {
				for (Object enumData:(List)enumObject) {
					if ((enumData!=null) && (enumData.toString().equals(operand))) {
						return true;
					}
				}
			}
			else if ((enumObject!=null) && (enumObject.toString().equals(operand))) {
				return true;
			}
		} catch (Exception e) {
			String errorMsg="Error while operating rule :" + e;
			throw new RuleOperationFailedException(
					errorMsg);
		}
		return false;
	}

}
