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
 * $Id: StringTrimRule.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Aug 17, 2010 
 */

package com.headstrong.fusion.services.transformer.rules.stringrules;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.services.transformer.rulemanager.Rule;
import com.headstrong.fusion.services.transformer.rulemanager.RuleVO;
import com.headstrong.fusion.services.transformer.rulemanager.exception.RuleOperationFailedException;

/**
 * 
 */
public class StringTrimRule implements Rule {

	private static final Logger logger = LoggerFactory
			.getLogger(StringTrimRule.class);

	/**
	 * Returns {@link RuleVO} for {@link SubStringRule}
	 * 
	 * @return
	 */
	public static final RuleVO getRuleVO() {
		RuleVO ruleVO = new RuleVO();
		ruleVO.setAliasName("stringtrim");
		ruleVO.setClassName(StringTrimRule.class.getName());
		ruleVO.addInParameter(OPERAND);
		ruleVO.addOutParameter(RESULT);
		return ruleVO;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.services.transformer.rulemanager.Rule#operate(java.util.Map)
	 */
	@Override
	public Object operate(Map<String, Object> data)
			throws RuleOperationFailedException {
		try {

			String operand = (String) data.get(OPERAND);

			String result = operand.trim();

			Map<String, Object> resultMap = new HashMap<String, Object>();
			resultMap.put(RESULT, result);
			return resultMap;
		} catch (Exception e) {
			logger.error("Error while operating rule Trim on :" + data);
			throw new RuleOperationFailedException(
					"Error while operating rule Trim on :", e);
		}
	}
}
