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
 * $Id: MultiplyRule.java
 * $Revision: 
 * $Author: MBafna
 * $DateTime: Mar 11, 2009 
 */

package com.headstrong.fusion.services.transformer.rules.mathrules;

import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.util.FusionUtil;
import com.headstrong.fusion.services.transformer.rulemanager.Rule;
import com.headstrong.fusion.services.transformer.rulemanager.RuleVO;
import com.headstrong.fusion.services.transformer.rulemanager.exception.RuleOperationFailedException;

/**
 * 
 */
public class MultiplyRule implements Rule {

	private static final Logger logger=LoggerFactory.getLogger(MultiplyRule.class);

	public static final String OPERAND1=OPERAND+"1";
	public static final String OPERAND2=OPERAND+"2";
	  private static NumberFormat nf = NumberFormat.getInstance(Locale.US);
	  static    {
	        nf.setGroupingUsed(false);
	    }

	  public static final RuleVO getRuleVO() {
			RuleVO ruleVO=new RuleVO();
			ruleVO.setAliasName("multiply");
			ruleVO.setClassName(MultiplyRule.class.getName());
			ruleVO.addInParameter(OPERAND1);
			ruleVO.addInParameter(OPERAND2);
			ruleVO.addOutParameter(RESULT);
			return ruleVO;
		}
	/* (non-Javadoc)
	 * @see com.headstrong.fusion.services.transformer.rulemanager.Rule#operate(java.util.Map)
	 */
	public Object operate(Map<String, Object> data)
			throws RuleOperationFailedException {
		try {
			if (logger.isDebugEnabled()) {
				logger.debug("MultiplyRule operating on :"+ data);
			}
		
		Double product=0.0;
		double operand1=FusionUtil.parseDouble(data.get(OPERAND1));
		double operand2=FusionUtil.parseDouble(data.get(OPERAND2));
		
		product=operand1*operand2;
		Map<String, Object> resultMap=new HashMap<String, Object>();
		resultMap.put(RESULT,nf.format(product));
		return resultMap;
		}
		catch (Exception e) {
			logger.error("Error while operating rule multiply on :"+ data);
			throw new RuleOperationFailedException("Error while operating rule multiply on :",e);
		}
	
	}

}
