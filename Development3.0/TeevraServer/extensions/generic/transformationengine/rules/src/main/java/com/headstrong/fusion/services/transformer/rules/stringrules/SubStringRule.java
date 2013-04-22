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
 * $Id: SubStringRule.java
 * $Revision: 
 * $Author: mbafna
 * $DateTime: Nov 5, 2008 
 */

package com.headstrong.fusion.services.transformer.rules.stringrules;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.util.FusionUtil;
import com.headstrong.fusion.services.transformer.rulemanager.Rule;
import com.headstrong.fusion.services.transformer.rulemanager.RuleVO;
import com.headstrong.fusion.services.transformer.rulemanager.exception.RuleOperationFailedException;

/**
 * <code>SubStringRule</code> is the rule that gets the substring of the
 * passed string.
 * <p>
 * The Input parameters includes:
 * <ul>
 * <li>operand :InputString
 * <li>beginindex:Integer for beginIndex.
 * <li>endindex: Integer for endIndex. If not passed, then ignored. for Eg:
 * substring('temporary',3) = 'porary'
 * </ul>
 * <p>
 * The Output Parameters that are set by this rule includes :
 * <ul>
 * <li>result: Substring result
 * </ul>
 */
public class SubStringRule implements Rule {

	private static final Logger logger = LoggerFactory
			.getLogger(SubStringRule.class);

	public static final String BEGININDEX = "beginindex";
	public static final String ENDINDEX = "endindex";

	/**
	 * Returns {@link RuleVO} for {@link SubStringRule}
	 * 
	 * @return
	 */
	public static final RuleVO getRuleVO() {
		RuleVO ruleVO = new RuleVO();
		ruleVO.setAliasName("substring");
		ruleVO.setClassName(SubStringRule.class.getName());
		ruleVO.addInParameter(OPERAND);
		ruleVO.addInParameter(BEGININDEX);
		ruleVO.addInParameter(ENDINDEX);
		ruleVO.addOutParameter(RESULT);
		return ruleVO;
	}

	public Object operate(Map<String, Object> data)
			throws RuleOperationFailedException {
		try {

			String operand = (String) data.get(OPERAND);
			int beginIndex = FusionUtil.parseInt(data.get(BEGININDEX));
			int endIndex = FusionUtil.parseInt(data.get(ENDINDEX));

			String result;
			if (data.containsKey(ENDINDEX)) {
				result = FusionUtil
						.safeSubString(operand, beginIndex, endIndex).trim();
			} else {
				result = FusionUtil.safeSubString(operand, beginIndex, null).trim();
			}

			Map<String, Object> resultMap = new HashMap<String, Object>();
			resultMap.put(RESULT, result);
			return resultMap;
		} catch (Exception e) {
			logger.error("Error while operating rule Substring on :" + data);
			throw new RuleOperationFailedException(
					"Error while operating rule Substring on :", e);
		}
	}

}
