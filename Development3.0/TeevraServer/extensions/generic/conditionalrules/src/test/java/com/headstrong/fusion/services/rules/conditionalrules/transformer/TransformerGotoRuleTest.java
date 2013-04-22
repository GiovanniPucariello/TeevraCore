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
 * $Id: TransformerGotoRuleTest.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Dec 16, 2009 
 */

package com.headstrong.fusion.services.rules.conditionalrules.transformer;

import java.util.HashMap;
import java.util.Map;

import junit.framework.TestCase;

import org.junit.Test;

/**
 * 
 */
public class TransformerGotoRuleTest extends TestCase {

	@SuppressWarnings("unchecked")
	@Test
	public void testOperateInteger() throws Exception {
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("sequenceid", 100);

		TransformerGotoRule rule = new TransformerGotoRule();
		Map<String, Object> result = (Map<String, Object>) rule.operate(data);

		assertTrue(result.get(TransformerGotoRule.NEXT_SEQUENCE_ID) instanceof Integer);
		assertEquals(100, result.get(TransformerGotoRule.NEXT_SEQUENCE_ID));
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testOperateIntegerString() throws Exception {
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("sequenceid", "200");

		TransformerGotoRule rule = new TransformerGotoRule();
		Map<String, Object> result = (Map<String, Object>) rule.operate(data);

		assertTrue(result.get(TransformerGotoRule.NEXT_SEQUENCE_ID) instanceof Integer);
		assertEquals(200, result.get(TransformerGotoRule.NEXT_SEQUENCE_ID));
	}

}
