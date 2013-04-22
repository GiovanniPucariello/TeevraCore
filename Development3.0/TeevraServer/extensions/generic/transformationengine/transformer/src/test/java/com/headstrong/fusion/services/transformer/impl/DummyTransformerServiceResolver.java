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
 * $Id: DummyTransformerServiceResolver.java
 * $Revision: 
 * $Author: viswanathp
 * $DateTime: May 6, 2010 
 */

package com.headstrong.fusion.services.transformer.impl;

import java.util.HashMap;
import java.util.Map;

import com.headstrong.fusion.commons.resolver.ServiceResolver;
import com.headstrong.fusion.services.transformer.rulemanager.Rule;
import com.headstrong.fusion.services.transformer.rulemanager.RuleVO;
import com.headstrong.fusion.services.transformer.rulemanager.impl.RuleManagerImpl;
import com.headstrong.fusion.services.transformer.rules.stringrules.SubStringRule;

/**
 * 
 */
public class DummyTransformerServiceResolver implements ServiceResolver<Rule> {

	private Map<String, RuleVO> ruleCache = new HashMap<String, RuleVO>();

	DummyTransformerServiceResolver(RuleManagerImpl ruleManagerImpl)
			throws Exception {
		/**
		 * Substring Rule
		 */
		RuleVO substring = new RuleVO();
		substring.setAliasName("substring");
		substring.setClassName(SubStringRule.class.getName());
		substring.addInParameter("operand");
		substring.addInParameter("beginindex");
		substring.addInParameter("endindex");
		substring.addOutParameter("result");

		ruleCache.put(substring.getClassName(), substring);
		ruleManagerImpl.registerRule(substring);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.resolver.ServiceResolver#getService(java.lang.String,
	 *      long)
	 */
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.resolver.ServiceResolver#isServiceAvailable(java.lang.String,
	 *      long)
	 */
	@Override
	public boolean isServiceAvailable(String type, long timeToWait) {
		// TODO Auto-generated method stub
		return false;
	}
}
