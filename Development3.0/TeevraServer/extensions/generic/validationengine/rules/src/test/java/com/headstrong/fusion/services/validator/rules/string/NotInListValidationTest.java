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
public class NotInListValidationTest {

	
	@Test
	public void testValidate() throws Exception {
		NotInListValidation rule = new NotInListValidation();
		Map<String, Object> dataMap = new HashMap<String, Object>();
		dataMap.put("operand", "apple");
		FusionUtil.populateMap(dataMap, "enum","cherry");
		FusionUtil.populateMap(dataMap, "enum","banana");
		FusionUtil.populateMap(dataMap, "enum","orange");
		
		Object outputData = rule.validate(dataMap, new StringBuffer());
		assertTrue(outputData instanceof Boolean);
		assertTrue((Boolean) outputData);

		Map<String, Object> data3 = new HashMap<String, Object>();
		data3.put("operand", "apple");
		dataMap.put("operand", "apple");
		FusionUtil.populateMap(data3, "enum","cherry");
		FusionUtil.populateMap(data3, "enum","banana");
		FusionUtil.populateMap(data3, "enum","apple");
		
		outputData = rule.validate(data3, new StringBuffer());
		assertTrue(outputData instanceof Boolean);
		assertFalse((Boolean) outputData);

	}

	
}
