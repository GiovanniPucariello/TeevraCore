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
 * $Id: DateFormattingRule.java
 * $Revision: 
 * $Author: mbafna
 * $DateTime: Nov 7, 2008 
 */

package com.headstrong.fusion.services.transformer.rules.daterules;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.services.transformer.rulemanager.Rule;
import com.headstrong.fusion.services.transformer.rulemanager.RuleVO;
import com.headstrong.fusion.services.transformer.rulemanager.exception.RuleOperationFailedException;

/**
 * <code>DateFormattingRule</code> formats the data from input message format
 * to output message format.
 * <p>
 * The Input Parameters required by this rule includes:
 * <ul>
 * <li>operand: Input data of type String or list of strings that needs to be
 * formatted
 * <li>inputdateformat: Input Date format. Accepts characters supported by
 * {@link SimpleDateFormat}
 * <li>outputdateformat: Output date format. Accepts characters supported by
 * {@link SimpleDateFormat}
 * </ul>
 * <p>
 * The Output Parameters that are set by this rule includes:
 * <ul>
 * <li>result: String date in the format specified by input parameter
 * outputdateformat.
 * </ul>
 * 
 */
public class DateFormattingRule implements Rule {
	private static final Logger logger = LoggerFactory
			.getLogger(DateFormattingRule.class);

	public static final String InputDateFormat = "inputdateformat";
	public static final String OutputDateFormat = "outputdateformat";

	/**
	 * Returns {@link RuleVO} for {@link DateFormattingRule}
	 * 
	 * @return
	 */
	public static final RuleVO getRuleVO() {
		RuleVO ruleVO = new RuleVO();
		ruleVO.setAliasName("dateformatting");
		ruleVO.setClassName(DateFormattingRule.class.getName());
		ruleVO.addInParameter(OPERAND);
		ruleVO.addInParameter(InputDateFormat);
		ruleVO.addInParameter(OutputDateFormat);
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
			/*
			 * Get the operand, inputdateformat, outputdateformat
			 */
			String inputFormat = (String) data.get(InputDateFormat);
			String outputFormat = (String) data.get(OutputDateFormat);

			SimpleDateFormat ipDateFormat = new SimpleDateFormat(inputFormat);
			SimpleDateFormat opDateFormat = new SimpleDateFormat(outputFormat);

			Object inputData = data.get(OPERAND);
			Object result = null;
			if (inputData instanceof List) {
				List<String> inputList = (List) inputData;
				List<String> outputList = new ArrayList<String>();
				for (String ipDateString : inputList) {
					String opDateString = formatDate(ipDateString, ipDateFormat, opDateFormat);
					outputList.add(opDateString);
				}

				result = outputList;
			} else 	if (inputData!=null) {
				result = formatDate(inputData.toString(), ipDateFormat, opDateFormat);
			}
			else {
				throw new RuleOperationFailedException("Operand is null" + data);
			}

			Map<String, Object> resultMap = new HashMap<String, Object>();
			resultMap.put(RESULT, result);
			return resultMap;
		} catch (Exception e) {
			logger
					.error("Error while operating DateFormattingRule on :"
							+ data);
			throw new RuleOperationFailedException(
					"Error while operating DateFormattingRule on :", e);
		}
	}
	
	private String formatDate(String ipDateString,SimpleDateFormat ipDateFormat, SimpleDateFormat opDateFormat ) throws Exception {
		Date dtObj = ipDateFormat.parse(ipDateString);
		String opDateString= opDateFormat.format(dtObj);
		if (logger.isDebugEnabled()) {
			logger
					.debug("DateFormattingRule : Translated Date from "
							+ ipDateString + " to " + opDateString);
		}
		return opDateString;
		
		
	}

}
