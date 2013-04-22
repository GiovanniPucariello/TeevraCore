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
 * $Id: StringConcatenateRule.java
 * $Revision: 
 * $Author: mbafna
 * $DateTime: Nov 6, 2008 
 */

package com.headstrong.fusion.services.transformer.rules.stringrules;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.services.transformer.rulemanager.Rule;
import com.headstrong.fusion.services.transformer.rulemanager.RuleVO;
import com.headstrong.fusion.services.transformer.rulemanager.exception.RuleOperationFailedException;

/**
 * <code>StringConcatenateRule</code> is the {@link Rule} that performs String
 * concatenate operation.
 * <p>
 * The input Parameters required by this rule includes:
 * <ul>
 * <li>operand : list of operands
 * </ul>
 * <p>
 * The output parameters set by this rule includes :
 * <ul>
 * <li>result : The sum of the operands passed in {@link String}
 * <ul>
 */
public class StringConcatenateRule implements Rule {
	private static final Logger logger = LoggerFactory
			.getLogger(SubStringRule.class);

	public static final RuleVO getRuleVO() {
		RuleVO ruleVO = new RuleVO();
		ruleVO.setAliasName("stringconcatenate");
		ruleVO.setClassName(StringConcatenateRule.class.getName());
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
				logger.debug("concatenate operating on :" + data);
			}

			StringBuffer strResult = new StringBuffer();
			Object operandData = data.get(OPERAND);
			if (operandData instanceof List) {
				for (Object operand : (List) operandData) {
					if (operand != null) {
						strResult.append(operand);
					}
				}
			} else if (operandData != null) {
				strResult.append(operandData);
			}

			Map<String, Object> resultMap = new HashMap<String, Object>();
			resultMap.put(RESULT, strResult.toString());
			return resultMap;
		} catch (Exception e) {
			logger.error("Error while operating rule on :" + data);
			throw new RuleOperationFailedException(
					"Error while operating rule on :", e);
		}

	}

}
