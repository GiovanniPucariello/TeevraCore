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
 * $Id: IsNotNullandNotEmptyValidationTest.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Jul 24, 2009 
 */

package com.headstrong.fusion.services.validator.rules.nullchecks;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

/**
 * 
 */
public class IsNotNullandNotEmptyValidationTest {
	/**
	 * Test method for
	 * {@link com.headstrong.fusion.services.validator.rules.nullchecks.IsNotNullandNotEmptyValidation#validate(java.util.Map, java.lang.StringBuffer)}.
	 */
	@Test
	public void testValidate() throws Exception {
		IsNotNullandNotEmptyValidation rule = new IsNotNullandNotEmptyValidation();
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("operand", "abc");
		Object outputData = rule.validate(data, new StringBuffer());
		assertTrue(outputData instanceof Boolean);
		assertTrue((Boolean) outputData);

		Map<String, Object> data1 = new HashMap<String, Object>();
		outputData = rule.validate(data1, new StringBuffer());
		assertTrue(outputData instanceof Boolean);
		assertFalse((Boolean) outputData);

		Map<String, Object> data2 = new HashMap<String, Object>();
		data2.put("operand", null);
		outputData = rule.validate(data2, new StringBuffer());
		assertTrue(outputData instanceof Boolean);
		assertFalse((Boolean) outputData);

		Map<String, Object> data3 = new HashMap<String, Object>();
		data3.put("operand", new String());
		outputData = rule.validate(data3, new StringBuffer());
		assertTrue(outputData instanceof Boolean);
		assertFalse((Boolean) outputData);

		Map<String, Object> data4 = new HashMap<String, Object>();
		data4.put("operand", "            ");
		outputData = rule.validate(data4, new StringBuffer());
		assertTrue(outputData instanceof Boolean);
		assertFalse((Boolean) outputData);

		Map<String, Object> data5 = new HashMap<String, Object>();
		List<Object> childOperands = new ArrayList<Object>();
		childOperands.add("test1");
		childOperands.add("test2");
		childOperands.add("       test3 ");
		data5.put("operand", childOperands);
		outputData = rule.validate(data5, new StringBuffer());
		assertTrue(outputData instanceof Boolean);
		assertTrue((Boolean) outputData);

		Map<String, Object> data6 = new HashMap<String, Object>();
		childOperands = new ArrayList<Object>();
		childOperands.add("test1");
		childOperands.add("  ");
		childOperands.add(" test2 ");
		data6.put("operand", childOperands);
		outputData = rule.validate(data6, new StringBuffer());
		assertTrue(outputData instanceof Boolean);
		assertFalse((Boolean) outputData);
	}
}
