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
 * $Id: ValidatorGotoRuleTest.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Dec 16, 2009 
 */

package com.headstrong.fusion.services.rules.conditionalrules.validator;

import java.util.HashMap;
import java.util.Map;

import junit.framework.TestCase;

import org.junit.Test;

/**
 * 
 */
public class ValidatorGotoRuleTest extends TestCase {

	@SuppressWarnings("unchecked")
	@Test
	public void testOperateInteger() throws Exception {
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("sequenceid", 100);

		ValidatorGotoRule rule = new ValidatorGotoRule();
		int result = (Integer) rule.validate(data, null);

		assertEquals(100, result);
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testOperateIntegerString() throws Exception {
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("sequenceid", "200");

		ValidatorGotoRule rule = new ValidatorGotoRule();
		int result = (Integer) rule.validate(data, null);

		assertEquals(200, result);
	}
}
