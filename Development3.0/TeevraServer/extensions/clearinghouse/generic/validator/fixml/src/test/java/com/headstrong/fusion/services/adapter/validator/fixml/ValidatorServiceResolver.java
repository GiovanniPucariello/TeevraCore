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
 * $Id: ValidatorServiceResolver.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jun 25, 2009 
 */

package com.headstrong.fusion.services.adapter.validator.fixml;

import java.util.HashMap;
import java.util.Map;

import com.headstrong.fusion.commons.resolver.ServiceResolver;
import com.headstrong.fusion.services.validator.rulemanager.Rule;
import com.headstrong.fusion.services.validator.rulemanager.RuleVO;
import com.headstrong.fusion.services.validator.rulemanager.impl.RuleManagerImpl;
import com.headstrong.fusion.services.validator.rules.nullchecks.IsNotNullandNotEmptyValidation;

public class ValidatorServiceResolver implements ServiceResolver<Rule> {
	private Map<String, RuleVO> ruleCache = new HashMap<String, RuleVO>();

	public ValidatorServiceResolver(RuleManagerImpl ruleManagerImpl)
			throws Exception {
		/**
		 * IsNotNull Rule
		 */
		RuleVO isNotNull = new RuleVO();
		isNotNull.setAliasName("isnotnullandnotempty");
		isNotNull.setClassName(IsNotNullandNotEmptyValidation.class.getName());
		isNotNull.addInParameter("operand");

		ruleCache.put(isNotNull.getClassName(), isNotNull);
		ruleManagerImpl.registerRule(isNotNull);

	}

	@Override
	public Rule getService(String type, long timeToWait) {

		Rule rule = null;
		RuleVO ruleVo = ruleCache.get(type);

		try {
			rule = (Rule) Class.forName(ruleVo.getClassName()).newInstance();
		} catch (Exception e) {
			// ignore.
		}
		return rule;
	}

	@Override
	public boolean isServiceAvailable(String type, long timeToWait) {
		// TODO Auto-generated method stub
		return false;
	}

}