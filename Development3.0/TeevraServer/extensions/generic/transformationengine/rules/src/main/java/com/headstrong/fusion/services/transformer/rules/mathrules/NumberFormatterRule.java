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
 * $Id: NumberFormatterRule.java
 * $Revision: 
 * $Author: MBafna
 * $DateTime: Jan 2, 2009 
 */

package com.headstrong.fusion.services.transformer.rules.mathrules;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

import com.headstrong.fusion.commons.util.FusionUtil;
import com.headstrong.fusion.services.transformer.rulemanager.Rule;
import com.headstrong.fusion.services.transformer.rulemanager.RuleVO;
import com.headstrong.fusion.services.transformer.rulemanager.exception.RuleOperationFailedException;

/**
 * <code>NumberFormatterRule</code> is a {@link Rule} which transforms a
 * number into String format. It uses {@link DecimalFormat} to do the
 * conversion.
 * 
 * The input parameters for this rule includes :
 * <ul>
 * <li> operand - Integer or double value which needs to be converted.
 * <li> formatpattern - Pattern for output. Refer patters in
 * {@link DecimalFormat}
 * </ul>
 * <p>
 * The output parameters includes:
 * <ul>
 * <li> result - String in the format formatpattern corresponding to the
 * operand.
 * </ul>
 */
public class NumberFormatterRule implements Rule {

	private static final String FORMATPATTERN = "formatpattern";

	/**
	 * Gets {@link RuleVO} for {@link NumberFormatterRule}
	 * 
	 * @precondition
	 * @postcondition
	 * @return
	 */
	public static final RuleVO getRuleVO() {
		RuleVO ruleVO = new RuleVO();
		ruleVO.setAliasName("numberformat");
		ruleVO.setClassName(NumberFormatterRule.class.getName());
		ruleVO.addInParameter(OPERAND);
		ruleVO.addInParameter(FORMATPATTERN);
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
		String opFormat = (String) data.get(FORMATPATTERN);
		Object inputData = data.get(OPERAND);

		DecimalFormat format = new DecimalFormat(opFormat);
		String opString = format.format(FusionUtil.parseDouble(inputData));

		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put(RESULT, opString);

		return resultMap;
	}

}
