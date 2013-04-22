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
 * $Id: SimpleMappingRule.java
 * $Revision: 
 * $Author: mbafna
 * $DateTime: Nov 6, 2008 
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
 * <code>SimpleMappingRule</code> is the rule which maps the input to output
 * without any transformation. The Input parameters includes:
 * <ul>
 * <li>operand :InputString
 * </ul>
 * The Output Parameters that are set by this rule includes :
 * <ul>
 * <li>result: Output result
 * </ul>
 */
public class SimpleMappingRule implements Rule {

	private static final Logger logger = LoggerFactory
			.getLogger(SimpleMappingRule.class);

	/**
	 * Returns {@link RuleVO} for {@link SubStringRule}
	 * 
	 * @return
	 */
	public static final RuleVO getRuleVO() {
		RuleVO ruleVO = new RuleVO();
		ruleVO.setAliasName("simplemapping");
		ruleVO.setClassName(SimpleMappingRule.class.getName());
		ruleVO.addInParameter(OPERAND);
		ruleVO.addOutParameter(RESULT);
		return ruleVO;
	}

	public Object operate(Map<String, Object> data)
			throws RuleOperationFailedException {

		if (logger.isDebugEnabled()) {
			logger.debug("simplemapping operating on :" + data);
		}
		Object operand = data.get(OPERAND);
		Object result = operand;

		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put(RESULT, result);
		return resultMap;
	}

}
