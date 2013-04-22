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
 * $Id: ValidatorIfThenElseRuleTest.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Dec 16, 2009 
 */

package com.headstrong.fusion.services.rules.conditionalrules.validator;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import junit.framework.TestCase;

/**
 * 
 */
public class ValidatorIfThenElseRuleTest extends TestCase {

	@SuppressWarnings("unchecked")
	@Test
	public void testvalidateIntegerLessThan() throws Exception {
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("ifoperand", 100);
		data.put("ifmatchvalue", 200);
		data.put("ifmatchcondition", "<");
		data.put("thensequenceid", 10);
		data.put("elsesequenceid", 20);

		ValidatorIfThenElseRule rule = new ValidatorIfThenElseRule();
		int result = (Integer) rule.validate(data, null);

		assertEquals(10, result);

		data.put("ifmatchvalue", 50);
		result = (Integer) rule.validate(data, null);

		assertEquals(20, result);
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testvalidateIntegerGreaterThan() throws Exception {
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("ifoperand", 100);
		data.put("ifmatchvalue", 200);
		data.put("ifmatchcondition", ">");
		data.put("thensequenceid", 10);
		data.put("elsesequenceid", 20);

		ValidatorIfThenElseRule rule = new ValidatorIfThenElseRule();
		int result = (Integer) rule.validate(data, null);

		assertEquals(20, result);

		data.put("ifmatchvalue", 50);
		result = (Integer) rule.validate(data, null);

		assertEquals(10, result);

	}

	@SuppressWarnings("unchecked")
	@Test
	public void testvalidateIntegerEquals() throws Exception {
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("ifoperand", 100);
		data.put("ifmatchvalue", 100);
		data.put("ifmatchcondition", "=");
		data.put("thensequenceid", 10);
		data.put("elsesequenceid", 20);

		ValidatorIfThenElseRule rule = new ValidatorIfThenElseRule();
		int result = (Integer) rule.validate(data, null);

		assertEquals(10, result);

		data.put("ifmatchvalue", 200);
		result = (Integer) rule.validate(data, null);

		assertEquals(20, result);

	}

	@SuppressWarnings("unchecked")
	@Test
	public void testvalidateIntegerLessEqualTo() throws Exception {
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("ifoperand", 100);
		data.put("ifmatchvalue", 100);
		data.put("ifmatchcondition", "<=");
		data.put("thensequenceid", 10);
		data.put("elsesequenceid", 20);

		ValidatorIfThenElseRule rule = new ValidatorIfThenElseRule();
		int result = (Integer) rule.validate(data, null);

		assertEquals(10, result);

		data.put("ifmatchvalue", 200);
		result = (Integer) rule.validate(data, null);

		assertEquals(10, result);

		data.put("ifmatchvalue", 50);
		result = (Integer) rule.validate(data, null);

		assertEquals(20, result);

	}

	@SuppressWarnings("unchecked")
	@Test
	public void testvalidateIntegerGreaterEqualTo() throws Exception {
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("ifoperand", 100);
		data.put("ifmatchvalue", 100);
		data.put("ifmatchcondition", ">=");
		data.put("thensequenceid", 10);
		data.put("elsesequenceid", 20);

		ValidatorIfThenElseRule rule = new ValidatorIfThenElseRule();
		int result = (Integer) rule.validate(data, null);

		assertEquals(10, result);

		data.put("ifmatchvalue", 200);
		result = (Integer) rule.validate(data, null);

		assertEquals(20, result);

		data.put("ifmatchvalue", 50);
		result = (Integer) rule.validate(data, null);

		assertEquals(10, result);

	}

	@SuppressWarnings("unchecked")
	@Test
	public void testvalidateIntegerNotEqualTo() throws Exception {
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("ifoperand", 100);
		data.put("ifmatchvalue", 100);
		data.put("ifmatchcondition", "!=");
		data.put("thensequenceid", 10);
		data.put("elsesequenceid", 20);

		ValidatorIfThenElseRule rule = new ValidatorIfThenElseRule();
		int result = (Integer) rule.validate(data, null);

		assertEquals(20, result);

		data.put("ifmatchvalue", 200);
		result = (Integer) rule.validate(data, null);

		assertEquals(10, result);

	}

	@SuppressWarnings("unchecked")
	@Test
	public void testvalidateStringLessThan() throws Exception {
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("ifoperand", "def");
		data.put("ifmatchvalue", "xyz");
		data.put("ifmatchcondition", "<");
		data.put("thensequenceid", 10);
		data.put("elsesequenceid", 20);

		ValidatorIfThenElseRule rule = new ValidatorIfThenElseRule();
		int result = (Integer) rule.validate(data, null);

		assertEquals(10, result);

		data.put("ifmatchvalue", "abc");
		result = (Integer) rule.validate(data, null);

		assertEquals(20, result);

	}

	@SuppressWarnings("unchecked")
	@Test
	public void testvalidateStringGreaterThan() throws Exception {
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("ifoperand", "def");
		data.put("ifmatchvalue", "xyz");
		data.put("ifmatchcondition", ">");
		data.put("thensequenceid", 10);
		data.put("elsesequenceid", 20);

		ValidatorIfThenElseRule rule = new ValidatorIfThenElseRule();
		int result = (Integer) rule.validate(data, null);

		assertEquals(20, result);

		data.put("ifmatchvalue", "abc");
		result = (Integer) rule.validate(data, null);

		assertEquals(10, result);
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testvalidateStringEqualTo() throws Exception {
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("ifoperand", "def");
		data.put("ifmatchvalue", "def");
		data.put("ifmatchcondition", "=");
		data.put("thensequenceid", 10);
		data.put("elsesequenceid", 20);

		ValidatorIfThenElseRule rule = new ValidatorIfThenElseRule();
		int result = (Integer) rule.validate(data, null);

		assertEquals(10, result);

		data.put("ifmatchvalue", "abc");
		result = (Integer) rule.validate(data, null);

		assertEquals(20, result);

		data.put("ifmatchvalue", "xyz");
		result = (Integer) rule.validate(data, null);

		assertEquals(20, result);

	}

	@SuppressWarnings("unchecked")
	@Test
	public void testvalidateStringLessEqualTo() throws Exception {
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("ifoperand", "def");
		data.put("ifmatchvalue", "def");
		data.put("ifmatchcondition", "<=");
		data.put("thensequenceid", 10);
		data.put("elsesequenceid", 20);

		ValidatorIfThenElseRule rule = new ValidatorIfThenElseRule();
		int result = (Integer) rule.validate(data, null);

		assertEquals(10, result);

		data.put("ifmatchvalue", "abc");
		result = (Integer) rule.validate(data, null);

		assertEquals(20, result);

		data.put("ifmatchvalue", "xyz");
		result = (Integer) rule.validate(data, null);

		assertEquals(10, result);

	}

	@SuppressWarnings("unchecked")
	@Test
	public void testvalidateStringGreaterEqualTo() throws Exception {
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("ifoperand", "def");
		data.put("ifmatchvalue", "def");
		data.put("ifmatchcondition", ">=");
		data.put("thensequenceid", 10);
		data.put("elsesequenceid", 20);

		ValidatorIfThenElseRule rule = new ValidatorIfThenElseRule();
		int result = (Integer) rule.validate(data, null);

		assertEquals(10, result);

		data.put("ifmatchvalue", "abc");
		result = (Integer) rule.validate(data, null);

		assertEquals(10, result);

		data.put("ifmatchvalue", "xyz");
		result = (Integer) rule.validate(data, null);

		assertEquals(20, result);

	}

	@SuppressWarnings("unchecked")
	@Test
	public void testvalidateStringNotEqualTo() throws Exception {
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("ifoperand", "def");
		data.put("ifmatchvalue", "def");
		data.put("ifmatchcondition", "!=");
		data.put("thensequenceid", 10);
		data.put("elsesequenceid", 20);

		ValidatorIfThenElseRule rule = new ValidatorIfThenElseRule();
		int result = (Integer) rule.validate(data, null);

		assertEquals(20, result);

		data.put("ifmatchvalue", "xyz");
		result = (Integer) rule.validate(data, null);

		assertEquals(10, result);

	}

	@SuppressWarnings("unchecked")
	@Test
	public void testvalidateMatchValueNull() throws Exception {
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("ifoperand", 100);
		data.put("ifmatchvalue", "null");
		data.put("ifmatchcondition", "=");
		data.put("thensequenceid", 10);
		data.put("elsesequenceid", 20);

		ValidatorIfThenElseRule rule = new ValidatorIfThenElseRule();
		int result = (Integer) rule.validate(data, null);

		assertEquals(20, result);

		data.put("ifoperand", null);
		result = (Integer) rule.validate(data, null);

		assertEquals(10, result);

		data.put("ifmatchcondition", "!=");
		result = (Integer) rule.validate(data, null);

		assertEquals(20, result);

		data.put("ifoperand", 50);
		result = (Integer) rule.validate(data, null);

		assertEquals(10, result);
	}
}
