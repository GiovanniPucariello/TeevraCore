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
 * $Id: TransformerIfThenElseRuleTest.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Dec 15, 2009 
 */

package com.headstrong.fusion.services.rules.conditionalrules.transformer;

import java.util.HashMap;
import java.util.Map;

import junit.framework.TestCase;

import org.junit.Test;

/**
 * 
 */
public class TransformerIfThenElseRuleTest extends TestCase {

	@SuppressWarnings("unchecked")
	@Test
	public void testOperateIntegerLessThan() throws Exception {
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("ifoperand", 100);
		data.put("ifmatchvalue", 200);
		data.put("ifmatchcondition", "<");
		data.put("thensequenceid", 10);
		data.put("elsesequenceid", 20);

		TransformerIfThenElseRule rule = new TransformerIfThenElseRule();
		Map<String, Object> result = (Map<String, Object>) rule.operate(data);
		assertTrue(result.get(TransformerIfThenElseRule.NEXT_SEQUENCE_ID) instanceof Integer);
		assertEquals(10, result.get(TransformerIfThenElseRule.NEXT_SEQUENCE_ID));

		data.put("ifmatchvalue", 50);
		result = (Map<String, Object>) rule.operate(data);
		assertTrue(result.get(TransformerIfThenElseRule.NEXT_SEQUENCE_ID) instanceof Integer);
		assertEquals(20, result.get(TransformerIfThenElseRule.NEXT_SEQUENCE_ID));
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testOperateIntegerGreaterThan() throws Exception {
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("ifoperand", 100);
		data.put("ifmatchvalue", 200);
		data.put("ifmatchcondition", ">");
		data.put("thensequenceid", 10);
		data.put("elsesequenceid", 20);

		TransformerIfThenElseRule rule = new TransformerIfThenElseRule();
		Map<String, Object> result = (Map<String, Object>) rule.operate(data);
		assertTrue(result.get(TransformerIfThenElseRule.NEXT_SEQUENCE_ID) instanceof Integer);
		assertEquals(20, result.get(TransformerIfThenElseRule.NEXT_SEQUENCE_ID));

		data.put("ifmatchvalue", 50);
		result = (Map<String, Object>) rule.operate(data);
		assertTrue(result.get(TransformerIfThenElseRule.NEXT_SEQUENCE_ID) instanceof Integer);
		assertEquals(10, result.get(TransformerIfThenElseRule.NEXT_SEQUENCE_ID));

	}

	@SuppressWarnings("unchecked")
	@Test
	public void testOperateIntegerEquals() throws Exception {
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("ifoperand", 100);
		data.put("ifmatchvalue", 100);
		data.put("ifmatchcondition", "=");
		data.put("thensequenceid", 10);
		data.put("elsesequenceid", 20);

		TransformerIfThenElseRule rule = new TransformerIfThenElseRule();
		Map<String, Object> result = (Map<String, Object>) rule.operate(data);
		assertTrue(result.get(TransformerIfThenElseRule.NEXT_SEQUENCE_ID) instanceof Integer);
		assertEquals(10, result.get(TransformerIfThenElseRule.NEXT_SEQUENCE_ID));

		data.put("ifmatchvalue", 200);
		result = (Map<String, Object>) rule.operate(data);
		assertTrue(result.get(TransformerIfThenElseRule.NEXT_SEQUENCE_ID) instanceof Integer);
		assertEquals(20, result.get(TransformerIfThenElseRule.NEXT_SEQUENCE_ID));

	}

	@SuppressWarnings("unchecked")
	@Test
	public void testOperateIntegerLessEqualTo() throws Exception {
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("ifoperand", 100);
		data.put("ifmatchvalue", 100);
		data.put("ifmatchcondition", "<=");
		data.put("thensequenceid", 10);
		data.put("elsesequenceid", 20);

		TransformerIfThenElseRule rule = new TransformerIfThenElseRule();
		Map<String, Object> result = (Map<String, Object>) rule.operate(data);
		assertTrue(result.get(TransformerIfThenElseRule.NEXT_SEQUENCE_ID) instanceof Integer);
		assertEquals(10, result.get(TransformerIfThenElseRule.NEXT_SEQUENCE_ID));

		data.put("ifmatchvalue", 200);
		result = (Map<String, Object>) rule.operate(data);
		assertTrue(result.get(TransformerIfThenElseRule.NEXT_SEQUENCE_ID) instanceof Integer);
		assertEquals(10, result.get(TransformerIfThenElseRule.NEXT_SEQUENCE_ID));

		data.put("ifmatchvalue", 50);
		result = (Map<String, Object>) rule.operate(data);
		assertTrue(result.get(TransformerIfThenElseRule.NEXT_SEQUENCE_ID) instanceof Integer);
		assertEquals(20, result.get(TransformerIfThenElseRule.NEXT_SEQUENCE_ID));

	}

	@SuppressWarnings("unchecked")
	@Test
	public void testOperateIntegerGreaterEqualTo() throws Exception {
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("ifoperand", 100);
		data.put("ifmatchvalue", 100);
		data.put("ifmatchcondition", ">=");
		data.put("thensequenceid", 10);
		data.put("elsesequenceid", 20);

		TransformerIfThenElseRule rule = new TransformerIfThenElseRule();
		Map<String, Object> result = (Map<String, Object>) rule.operate(data);
		assertTrue(result.get(TransformerIfThenElseRule.NEXT_SEQUENCE_ID) instanceof Integer);
		assertEquals(10, result.get(TransformerIfThenElseRule.NEXT_SEQUENCE_ID));

		data.put("ifmatchvalue", 200);
		result = (Map<String, Object>) rule.operate(data);
		assertTrue(result.get(TransformerIfThenElseRule.NEXT_SEQUENCE_ID) instanceof Integer);
		assertEquals(20, result.get(TransformerIfThenElseRule.NEXT_SEQUENCE_ID));

		data.put("ifmatchvalue", 50);
		result = (Map<String, Object>) rule.operate(data);
		assertTrue(result.get(TransformerIfThenElseRule.NEXT_SEQUENCE_ID) instanceof Integer);
		assertEquals(10, result.get(TransformerIfThenElseRule.NEXT_SEQUENCE_ID));

	}

	@SuppressWarnings("unchecked")
	@Test
	public void testOperateIntegerNotEqualTo() throws Exception {
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("ifoperand", 100);
		data.put("ifmatchvalue", 100);
		data.put("ifmatchcondition", "!=");
		data.put("thensequenceid", 10);
		data.put("elsesequenceid", 20);

		TransformerIfThenElseRule rule = new TransformerIfThenElseRule();
		Map<String, Object> result = (Map<String, Object>) rule.operate(data);
		assertTrue(result.get(TransformerIfThenElseRule.NEXT_SEQUENCE_ID) instanceof Integer);
		assertEquals(20, result.get(TransformerIfThenElseRule.NEXT_SEQUENCE_ID));

		data.put("ifmatchvalue", 200);
		result = (Map<String, Object>) rule.operate(data);
		assertTrue(result.get(TransformerIfThenElseRule.NEXT_SEQUENCE_ID) instanceof Integer);
		assertEquals(10, result.get(TransformerIfThenElseRule.NEXT_SEQUENCE_ID));

	}

	@SuppressWarnings("unchecked")
	@Test
	public void testOperateStringLessThan() throws Exception {
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("ifoperand", "def");
		data.put("ifmatchvalue", "xyz");
		data.put("ifmatchcondition", "<");
		data.put("thensequenceid", 10);
		data.put("elsesequenceid", 20);

		TransformerIfThenElseRule rule = new TransformerIfThenElseRule();
		Map<String, Object> result = (Map<String, Object>) rule.operate(data);
		assertTrue(result.get(TransformerIfThenElseRule.NEXT_SEQUENCE_ID) instanceof Integer);
		assertEquals(10, result.get(TransformerIfThenElseRule.NEXT_SEQUENCE_ID));

		data.put("ifmatchvalue", "abc");
		result = (Map<String, Object>) rule.operate(data);
		assertTrue(result.get(TransformerIfThenElseRule.NEXT_SEQUENCE_ID) instanceof Integer);
		assertEquals(20, result.get(TransformerIfThenElseRule.NEXT_SEQUENCE_ID));

	}

	@SuppressWarnings("unchecked")
	@Test
	public void testOperateStringGreaterThan() throws Exception {
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("ifoperand", "def");
		data.put("ifmatchvalue", "xyz");
		data.put("ifmatchcondition", ">");
		data.put("thensequenceid", 10);
		data.put("elsesequenceid", 20);

		TransformerIfThenElseRule rule = new TransformerIfThenElseRule();
		Map<String, Object> result = (Map<String, Object>) rule.operate(data);
		assertTrue(result.get(TransformerIfThenElseRule.NEXT_SEQUENCE_ID) instanceof Integer);
		assertEquals(20, result.get(TransformerIfThenElseRule.NEXT_SEQUENCE_ID));

		data.put("ifmatchvalue", "abc");
		result = (Map<String, Object>) rule.operate(data);
		assertTrue(result.get(TransformerIfThenElseRule.NEXT_SEQUENCE_ID) instanceof Integer);
		assertEquals(10, result.get(TransformerIfThenElseRule.NEXT_SEQUENCE_ID));
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testOperateStringEqualTo() throws Exception {
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("ifoperand", "def");
		data.put("ifmatchvalue", "def");
		data.put("ifmatchcondition", "=");
		data.put("thensequenceid", 10);
		data.put("elsesequenceid", 20);

		TransformerIfThenElseRule rule = new TransformerIfThenElseRule();
		Map<String, Object> result = (Map<String, Object>) rule.operate(data);
		assertTrue(result.get(TransformerIfThenElseRule.NEXT_SEQUENCE_ID) instanceof Integer);
		assertEquals(10, result.get(TransformerIfThenElseRule.NEXT_SEQUENCE_ID));

		data.put("ifmatchvalue", "abc");
		result = (Map<String, Object>) rule.operate(data);
		assertTrue(result.get(TransformerIfThenElseRule.NEXT_SEQUENCE_ID) instanceof Integer);
		assertEquals(20, result.get(TransformerIfThenElseRule.NEXT_SEQUENCE_ID));

		data.put("ifmatchvalue", "xyz");
		result = (Map<String, Object>) rule.operate(data);
		assertTrue(result.get(TransformerIfThenElseRule.NEXT_SEQUENCE_ID) instanceof Integer);
		assertEquals(20, result.get(TransformerIfThenElseRule.NEXT_SEQUENCE_ID));

	}

	@SuppressWarnings("unchecked")
	@Test
	public void testOperateStringLessEqualTo() throws Exception {
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("ifoperand", "def");
		data.put("ifmatchvalue", "def");
		data.put("ifmatchcondition", "<=");
		data.put("thensequenceid", 10);
		data.put("elsesequenceid", 20);

		TransformerIfThenElseRule rule = new TransformerIfThenElseRule();
		Map<String, Object> result = (Map<String, Object>) rule.operate(data);
		assertTrue(result.get(TransformerIfThenElseRule.NEXT_SEQUENCE_ID) instanceof Integer);
		assertEquals(10, result.get(TransformerIfThenElseRule.NEXT_SEQUENCE_ID));

		data.put("ifmatchvalue", "abc");
		result = (Map<String, Object>) rule.operate(data);
		assertTrue(result.get(TransformerIfThenElseRule.NEXT_SEQUENCE_ID) instanceof Integer);
		assertEquals(20, result.get(TransformerIfThenElseRule.NEXT_SEQUENCE_ID));

		data.put("ifmatchvalue", "xyz");
		result = (Map<String, Object>) rule.operate(data);
		assertTrue(result.get(TransformerIfThenElseRule.NEXT_SEQUENCE_ID) instanceof Integer);
		assertEquals(10, result.get(TransformerIfThenElseRule.NEXT_SEQUENCE_ID));

	}

	@SuppressWarnings("unchecked")
	@Test
	public void testOperateStringGreaterEqualTo() throws Exception {
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("ifoperand", "def");
		data.put("ifmatchvalue", "def");
		data.put("ifmatchcondition", ">=");
		data.put("thensequenceid", 10);
		data.put("elsesequenceid", 20);

		TransformerIfThenElseRule rule = new TransformerIfThenElseRule();
		Map<String, Object> result = (Map<String, Object>) rule.operate(data);
		assertTrue(result.get(TransformerIfThenElseRule.NEXT_SEQUENCE_ID) instanceof Integer);
		assertEquals(10, result.get(TransformerIfThenElseRule.NEXT_SEQUENCE_ID));

		data.put("ifmatchvalue", "abc");
		result = (Map<String, Object>) rule.operate(data);
		assertTrue(result.get(TransformerIfThenElseRule.NEXT_SEQUENCE_ID) instanceof Integer);
		assertEquals(10, result.get(TransformerIfThenElseRule.NEXT_SEQUENCE_ID));

		data.put("ifmatchvalue", "xyz");
		result = (Map<String, Object>) rule.operate(data);
		assertTrue(result.get(TransformerIfThenElseRule.NEXT_SEQUENCE_ID) instanceof Integer);
		assertEquals(20, result.get(TransformerIfThenElseRule.NEXT_SEQUENCE_ID));

	}

	@SuppressWarnings("unchecked")
	@Test
	public void testOperateStringNotEqualTo() throws Exception {
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("ifoperand", "def");
		data.put("ifmatchvalue", "def");
		data.put("ifmatchcondition", "!=");
		data.put("thensequenceid", 10);
		data.put("elsesequenceid", 20);

		TransformerIfThenElseRule rule = new TransformerIfThenElseRule();
		Map<String, Object> result = (Map<String, Object>) rule.operate(data);
		assertTrue(result.get(TransformerIfThenElseRule.NEXT_SEQUENCE_ID) instanceof Integer);
		assertEquals(20, result.get(TransformerIfThenElseRule.NEXT_SEQUENCE_ID));

		data.put("ifmatchvalue", "xyz");
		result = (Map<String, Object>) rule.operate(data);
		assertTrue(result.get(TransformerIfThenElseRule.NEXT_SEQUENCE_ID) instanceof Integer);
		assertEquals(10, result.get(TransformerIfThenElseRule.NEXT_SEQUENCE_ID));

	}

	@SuppressWarnings("unchecked")
	@Test
	public void testOperateMatchValueNull() throws Exception {
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("ifoperand", 100);
		data.put("ifmatchvalue", "null");
		data.put("ifmatchcondition", "=");
		data.put("thensequenceid", 10);
		data.put("elsesequenceid", 20);

		TransformerIfThenElseRule rule = new TransformerIfThenElseRule();
		Map<String, Object> result = (Map<String, Object>) rule.operate(data);
		assertTrue(result.get(TransformerIfThenElseRule.NEXT_SEQUENCE_ID) instanceof Integer);
		assertEquals(20, result.get(TransformerIfThenElseRule.NEXT_SEQUENCE_ID));

		data.put("ifoperand", null);
		result = (Map<String, Object>) rule.operate(data);
		assertTrue(result.get(TransformerIfThenElseRule.NEXT_SEQUENCE_ID) instanceof Integer);
		assertEquals(10, result.get(TransformerIfThenElseRule.NEXT_SEQUENCE_ID));

		data.put("ifmatchcondition", "!=");
		result = (Map<String, Object>) rule.operate(data);
		assertTrue(result.get(TransformerIfThenElseRule.NEXT_SEQUENCE_ID) instanceof Integer);
		assertEquals(20, result.get(TransformerIfThenElseRule.NEXT_SEQUENCE_ID));

		data.put("ifoperand", 50);
		result = (Map<String, Object>) rule.operate(data);
		assertTrue(result.get(TransformerIfThenElseRule.NEXT_SEQUENCE_ID) instanceof Integer);
		assertEquals(10, result.get(TransformerIfThenElseRule.NEXT_SEQUENCE_ID));
	}

}
