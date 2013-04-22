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
 * $Id: StringToListConverter.java
 * $Revision: 
 * $Author: MBafna
 * $DateTime: Dec 11, 2008 
 */

package com.headstrong.fusion.services.transformer.rules.stringrules;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.services.transformer.rulemanager.Rule;
import com.headstrong.fusion.services.transformer.rulemanager.RuleVO;
import com.headstrong.fusion.services.transformer.rulemanager.exception.RuleOperationFailedException;

/**
 * 
 */
public class StringToListConverter implements Rule {

	private static final Logger logger = LoggerFactory
			.getLogger(StringToListConverter.class);

	public static final String DELIMITER = "delimiter";

	/**
	 * Returns {@link RuleVO} for {@link StringToListConverter}
	 * 
	 * @return
	 */
	public static final RuleVO getRuleVO() {
		RuleVO ruleVO = new RuleVO();
		ruleVO.setAliasName("stringtolist");
		ruleVO.setClassName(StringToListConverter.class.getName());
		ruleVO.addInParameter(OPERAND);
		ruleVO.addOutParameter(RESULT);
		return ruleVO;
	}

	public Object operate(Map<String, Object> data)
			throws RuleOperationFailedException {
		try {

			String operand =  data.get(OPERAND).toString();
			String delimiter=data.get(DELIMITER).toString();
			
			List<String> result=new ArrayList<String>();
			
			for(String st:operand.split(delimiter)) {
				result.add(st);
			}
			
			Map<String, Object> resultMap = new HashMap<String, Object>();
			resultMap.put(RESULT, result);
			return resultMap;
		} catch (Exception e) {
			logger.error("Error while operating rule stringtolist on :" + data);
			throw new RuleOperationFailedException(
					"Error while operating rule stringtolist on :", e);
		}
	}

}
