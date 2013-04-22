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
 * $Id: DummyValidatorServiceResolver.java
 * $Revision: 
 * $Author: viswanathp
 * $DateTime: May 6, 2010 
 */

package com.headstrong.fusion.services.validator.impl;

import java.util.HashMap;
import java.util.Map;

import com.headstrong.fusion.commons.resolver.ServiceResolver;
import com.headstrong.fusion.services.validator.rulemanager.Rule;
import com.headstrong.fusion.services.validator.rulemanager.RuleVO;
import com.headstrong.fusion.services.validator.rulemanager.impl.RuleManagerImpl;
import com.headstrong.fusion.services.validator.rules.integer.IntegerValidation;

/**
 * 
 */
public class DummyValidatorServiceResolver implements ServiceResolver<Rule> {

	private Map<String, RuleVO> ruleCache = new HashMap<String, RuleVO>();

	DummyValidatorServiceResolver(RuleManagerImpl ruleManagerImpl)
			throws Exception {
		/**
		 * Substring Rule
		 */
		RuleVO integervalidation = new RuleVO();
		integervalidation.setAliasName("integervalidation");
		integervalidation.setClassName(IntegerValidation.class.getName());
		integervalidation.addInParameter("operand");
		integervalidation.addInParameter("minvalue");
		integervalidation.addInParameter("maxvalue");

		ruleCache.put(integervalidation.getClassName(), integervalidation);
		ruleManagerImpl.registerRule(integervalidation);

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
