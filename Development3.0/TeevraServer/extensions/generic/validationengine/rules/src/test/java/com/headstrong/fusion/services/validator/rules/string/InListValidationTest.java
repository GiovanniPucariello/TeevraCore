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
 * $Id: InListValidationTest.java
 * $Revision: 
 * $Author: mbafna
 * $DateTime: Nov 24, 2008 
 */

package com.headstrong.fusion.services.validator.rules.string;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.headstrong.fusion.commons.util.FusionUtil;

/**
 * 
 */
public class InListValidationTest {

	/**
	 * Test method for
	 * {@link com.headstrong.fusion.services.validator.rules.string.InListValidation#validate(java.util.Map, java.lang.StringBuffer)}.
	 */
	@Test
	public void testValidate() throws Exception {
		InListValidation rule = new InListValidation();
		Map<String, Object> dataMap = new HashMap<String, Object>();
		dataMap.put("operand", "apple");
		FusionUtil.populateMap(dataMap, "enum","cherry");
		FusionUtil.populateMap(dataMap, "enum","banana");
		FusionUtil.populateMap(dataMap, "enum","apple");
		
		Object outputData = rule.validate(dataMap, new StringBuffer());
		assertTrue(outputData instanceof Boolean);
		assertTrue((Boolean) outputData);
		

		Map<String, Object> data1 = new HashMap<String, Object>();
		data1.put("operand", "apple");
		FusionUtil.populateMap(data1, "enum","apple");
		FusionUtil.populateMap(data1, "enum","banana");
		FusionUtil.populateMap(data1, "enum","cherry");
		outputData = rule.validate(data1, new StringBuffer());
		assertTrue(outputData instanceof Boolean);
		assertTrue((Boolean) outputData);

		Map<String, Object> data2 = new HashMap<String, Object>();
		data2.put("operand", "apple");
		FusionUtil.populateMap(data2, "enum","banana");
		FusionUtil.populateMap(data2, "enum","apple");
		FusionUtil.populateMap(data2, "enum","cherry");
		outputData = rule.validate(data2, new StringBuffer());
		assertTrue(outputData instanceof Boolean);
		assertTrue((Boolean) outputData);

		Map<String, Object> data3 = new HashMap<String, Object>();
		data3.put("operand", "apple");
		FusionUtil.populateMap(data3, "enum","banana");
		FusionUtil.populateMap(data3, "enum","orange");
		FusionUtil.populateMap(data3, "enum","cherry");
		outputData = rule.validate(data3, new StringBuffer());
		assertTrue(outputData instanceof Boolean);
		assertFalse((Boolean) outputData);
		
		Map<String, Object> data4 = new HashMap<String, Object>();
		data4.put("operand", "apple");
		FusionUtil.populateMap(data4, "enum","apple");
		outputData = rule.validate(data4, new StringBuffer());
		assertTrue(outputData instanceof Boolean);
		assertTrue((Boolean) outputData);

	}
	
}
