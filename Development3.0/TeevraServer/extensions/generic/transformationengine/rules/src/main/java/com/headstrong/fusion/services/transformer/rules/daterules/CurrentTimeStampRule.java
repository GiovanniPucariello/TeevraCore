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
 * $Id: CurrentTimeStampRule.java
 * $Revision: 
 * $Author: MBafna
 * $DateTime: Jan 6, 2009 
 */

package com.headstrong.fusion.services.transformer.rules.daterules;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.headstrong.fusion.services.transformer.rulemanager.Rule;
import com.headstrong.fusion.services.transformer.rulemanager.RuleVO;
import com.headstrong.fusion.services.transformer.rulemanager.exception.RuleOperationFailedException;

/**
 * <code>CurrentTimeStampRule</code> is the transformation rule which gets the
 * current time in the format specified by the paramter 'outputdateformat'.
 * 
 * The input parameters include:
 * <ul>
 * <li>outputdateformat - String which is required by {@link SimpleDateFormat}.
 * </ul>
 * <p>
 * The Output Parameters that are set by this rule includes:
 * <ul>
 * <li>result: Todays date in String format specified by input parameter
 * outputdateformat.
 * </ul>
 */
public class CurrentTimeStampRule implements Rule {

	public static final String OutputDateFormat = "outputdateformat";

	/**
	 * Returns {@link RuleVO} for {@link CurrentTimeStampRule}
	 * 
	 * @return
	 */
	public static final RuleVO getRuleVO() {
		RuleVO ruleVO = new RuleVO();
		ruleVO.setAliasName("currenttimestamp");
		ruleVO.setClassName(CurrentTimeStampRule.class.getName());
		ruleVO.addInParameter(OutputDateFormat);
		ruleVO.addOutParameter(RESULT);
		return ruleVO;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.services.transformer.rulemanager.Rule#operate(java.util.Map)
	 */
	public Object operate(Map<String, Object> data)
			throws RuleOperationFailedException {

		String outputFormat = (String) data.get(OutputDateFormat);
		SimpleDateFormat opDateFormat = new SimpleDateFormat(outputFormat);

		String result = opDateFormat.format(new Date());

		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put(RESULT, result);
		return resultMap;

	}

}
