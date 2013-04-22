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
 * $Id: IsNullValidationTest.java
 * $Revision: 
 * $Author: mbafna
 * $DateTime: Nov 25, 2008 
 */

package com.headstrong.fusion.services.validator.rules.nullchecks;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * 
 */
public class IsNullValidationTest {

	/**
	 * Test method for {@link com.headstrong.fusion.services.validator.rules.nullchecks.IsNullValidation#validate(java.util.Map, java.lang.StringBuffer)}.
	 */
	@Test
	public void testValidate() throws Exception{
		IsNullValidation rule=new IsNullValidation();
		Map<String, Object> data=new HashMap<String, Object>();
		data.put("operand", "abc");
		Object outputData=rule.validate(data, new StringBuffer());
		assertTrue(outputData instanceof Boolean);
		assertFalse((Boolean)outputData);
		
		Map<String, Object> data1=new HashMap<String, Object>();
		outputData=rule.validate(data1, new StringBuffer());
		assertTrue(outputData instanceof Boolean);
		assertTrue((Boolean)outputData);
		
		Map<String, Object> data2=new HashMap<String, Object>();
		data2.put("operand", null);
		outputData=rule.validate(data2, new StringBuffer());
		assertTrue(outputData instanceof Boolean);
		assertTrue((Boolean)outputData);
		
		Map<String, Object> data3=new HashMap<String, Object>();
		data3.put("operand", new String());
		outputData=rule.validate(data3, new StringBuffer());
		assertTrue(outputData instanceof Boolean);
		assertTrue((Boolean)outputData);
		
	}

}
