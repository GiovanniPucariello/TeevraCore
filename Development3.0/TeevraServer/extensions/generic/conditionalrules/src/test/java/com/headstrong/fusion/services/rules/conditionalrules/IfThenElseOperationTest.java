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
 * $Id: IfThenElseOperationTest.java
 * $Revision: 
 * $Author: mbafna
 * $DateTime: Nov 25, 2008 
 */

package com.headstrong.fusion.services.rules.conditionalrules;

import java.util.HashMap;
import java.util.Map;

import junit.framework.TestCase;

import org.junit.Test;

/**
 * 
 */
public class IfThenElseOperationTest extends TestCase {

	/**
	 * Test method for
	 * {@link com.headstrong.fusion.services.transformer.rules.conditionrules.IfThenElseRule#operate(java.util.Map)}.
	 */
	@Test
	public void testOperateIntegerLessThan() throws Exception {
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("ifoperand", 100);
		data.put("ifmatchvalue", 200);
		data.put("ifmatchcondition", "<");
		data.put("thensequenceid", 10);
		data.put("elsesequenceid", 20);
		IfThenElseOperation rule = new IfThenElseOperation();
		Object output = rule.performConditionalCheck(data);
		assertTrue(output instanceof Integer);
		assertEquals(10, output);

		data.put("ifmatchvalue", 50);
		output = rule.performConditionalCheck(data);
		assertTrue(output instanceof Integer);
		assertEquals(20, output);
	}

	@Test
	public void testOperateIntegerGreaterThan() throws Exception {
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("ifoperand", 100);
		data.put("ifmatchvalue", 200);
		data.put("ifmatchcondition", ">");
		data.put("thensequenceid", 10);
		data.put("elsesequenceid", 20);
		IfThenElseOperation rule = new IfThenElseOperation();
		Object output = rule.performConditionalCheck(data);
		assertTrue(output instanceof Integer);
		assertEquals(20, output);

		data.put("ifmatchvalue", 50);
		output = rule.performConditionalCheck(data);
		assertTrue(output instanceof Integer);
		assertEquals(10, output);

	}

	@Test
	public void testperformConditionalCheckIntegerEquals() throws Exception {
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("ifoperand", 100);
		data.put("ifmatchvalue", 100);
		data.put("ifmatchcondition", "=");
		data.put("thensequenceid", 10);
		data.put("elsesequenceid", 20);
		IfThenElseOperation rule = new IfThenElseOperation();
		Object output = rule.performConditionalCheck(data);
		assertTrue(output instanceof Integer);
		assertEquals(10, output);

		data.put("ifmatchvalue", 200);
		output = rule.performConditionalCheck(data);
		assertTrue(output instanceof Integer);
		assertEquals(20, output);

	}

	@Test
	public void testperformConditionalCheckIntegerLessEqualTo()
			throws Exception {
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("ifoperand", 100);
		data.put("ifmatchvalue", 100);
		data.put("ifmatchcondition", "<=");
		data.put("thensequenceid", 10);
		data.put("elsesequenceid", 20);
		IfThenElseOperation rule = new IfThenElseOperation();
		Object output = rule.performConditionalCheck(data);
		assertTrue(output instanceof Integer);
		assertEquals(10, output);

		data.put("ifmatchvalue", 200);
		output = rule.performConditionalCheck(data);
		assertTrue(output instanceof Integer);
		assertEquals(10, output);

		data.put("ifmatchvalue", 50);
		output = rule.performConditionalCheck(data);
		assertTrue(output instanceof Integer);
		assertEquals(20, output);

	}

	@Test
	public void testperformConditionalCheckIntegerGreaterEqualTo()
			throws Exception {
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("ifoperand", 100);
		data.put("ifmatchvalue", 100);
		data.put("ifmatchcondition", ">=");
		data.put("thensequenceid", 10);
		data.put("elsesequenceid", 20);
		IfThenElseOperation rule = new IfThenElseOperation();
		Object output = rule.performConditionalCheck(data);
		assertTrue(output instanceof Integer);
		assertEquals(10, output);

		data.put("ifmatchvalue", 200);
		output = rule.performConditionalCheck(data);
		assertTrue(output instanceof Integer);
		assertEquals(20, output);

		data.put("ifmatchvalue", 50);
		output = rule.performConditionalCheck(data);
		assertTrue(output instanceof Integer);
		assertEquals(10, output);
	}

	@Test
	public void testperformConditionalCheckIntegerNotEqualTo() throws Exception {
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("ifoperand", 100);
		data.put("ifmatchvalue", 100);
		data.put("ifmatchcondition", "!=");
		data.put("thensequenceid", 10);
		data.put("elsesequenceid", 20);
		IfThenElseOperation rule = new IfThenElseOperation();
		Object output = rule.performConditionalCheck(data);
		assertTrue(output instanceof Integer);
		assertEquals(20, output);

		data.put("ifmatchvalue", 200);
		output = rule.performConditionalCheck(data);
		assertTrue(output instanceof Integer);
		assertEquals(10, output);
	}

	@Test
	public void testperformConditionalCheckStringLessThan() throws Exception {
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("ifoperand", "def");
		data.put("ifmatchvalue", "xyz");
		data.put("ifmatchcondition", "<");
		data.put("thensequenceid", 10);
		data.put("elsesequenceid", 20);
		IfThenElseOperation rule = new IfThenElseOperation();
		Object output = rule.performConditionalCheck(data);
		assertTrue(output instanceof Integer);
		assertEquals(10, output);

		data.put("ifmatchvalue", "abc");
		output = rule.performConditionalCheck(data);
		assertTrue(output instanceof Integer);
		assertEquals(20, output);
	}

	@Test
	public void testperformConditionalCheckStringGreaterThan() throws Exception {
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("ifoperand", "def");
		data.put("ifmatchvalue", "xyz");
		data.put("ifmatchcondition", ">");
		data.put("thensequenceid", 10);
		data.put("elsesequenceid", 20);
		IfThenElseOperation rule = new IfThenElseOperation();
		Object output = rule.performConditionalCheck(data);
		assertTrue(output instanceof Integer);
		assertEquals(20, output);

		data.put("ifmatchvalue", "abc");
		output = rule.performConditionalCheck(data);
		assertTrue(output instanceof Integer);
		assertEquals(10, output);
	}

	@Test
	public void testperformConditionalCheckStringEqualTo() throws Exception {
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("ifoperand", "def");
		data.put("ifmatchvalue", "def");
		data.put("ifmatchcondition", "=");
		data.put("thensequenceid", 10);
		data.put("elsesequenceid", 20);
		IfThenElseOperation rule = new IfThenElseOperation();
		Object output = rule.performConditionalCheck(data);
		assertTrue(output instanceof Integer);
		assertEquals(10, output);

		data.put("ifmatchvalue", "abc");
		output = rule.performConditionalCheck(data);
		assertTrue(output instanceof Integer);
		assertEquals(20, output);

		data.put("ifmatchvalue", "xyz");
		output = rule.performConditionalCheck(data);
		assertTrue(output instanceof Integer);
		assertEquals(20, output);
	}

	@Test
	public void testperformConditionalCheckStringLessEqualTo() throws Exception {
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("ifoperand", "def");
		data.put("ifmatchvalue", "def");
		data.put("ifmatchcondition", "<=");
		data.put("thensequenceid", 10);
		data.put("elsesequenceid", 20);
		IfThenElseOperation rule = new IfThenElseOperation();
		Object output = rule.performConditionalCheck(data);
		assertTrue(output instanceof Integer);
		assertEquals(10, output);

		data.put("ifmatchvalue", "abc");
		output = rule.performConditionalCheck(data);
		assertTrue(output instanceof Integer);
		assertEquals(20, output);

		data.put("ifmatchvalue", "xyz");
		output = rule.performConditionalCheck(data);
		assertTrue(output instanceof Integer);
		assertEquals(10, output);
	}

	@Test
	public void testperformConditionalCheckStringGreaterEqualTo()
			throws Exception {
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("ifoperand", "def");
		data.put("ifmatchvalue", "def");
		data.put("ifmatchcondition", ">=");
		data.put("thensequenceid", 10);
		data.put("elsesequenceid", 20);
		IfThenElseOperation rule = new IfThenElseOperation();
		Object output = rule.performConditionalCheck(data);
		assertTrue(output instanceof Integer);
		assertEquals(10, output);

		data.put("ifmatchvalue", "abc");
		output = rule.performConditionalCheck(data);
		assertTrue(output instanceof Integer);
		assertEquals(10, output);

		data.put("ifmatchvalue", "xyz");
		output = rule.performConditionalCheck(data);
		assertTrue(output instanceof Integer);
		assertEquals(20, output);
	}

	@Test
	public void testperformConditionalCheckStringNotEqualTo() throws Exception {
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("ifoperand", "def");
		data.put("ifmatchvalue", "def");
		data.put("ifmatchcondition", "!=");
		data.put("thensequenceid", 10);
		data.put("elsesequenceid", 20);
		IfThenElseOperation rule = new IfThenElseOperation();
		Object output = rule.performConditionalCheck(data);
		assertTrue(output instanceof Integer);
		assertEquals(20, output);

		data.put("ifmatchvalue", "xyz");
		output = rule.performConditionalCheck(data);
		assertTrue(output instanceof Integer);
		assertEquals(10, output);
	}

}
