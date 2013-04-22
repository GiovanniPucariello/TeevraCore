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
 * $Id: StringLengthCheckTest.java
 * $Revision: 
 * $Author: MBafna
 * $DateTime: Dec 12, 2008 
 */

package com.headstrong.fusion.services.validator.rules.string;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;


/**
 * 
 */
public class StringLengthCheckTest {

	/**
	 * Test method for {@link com.headstrong.fusion.services.validator.rules.string.StringLengthCheck#validate(java.util.Map, java.lang.StringBuffer)}.
	 */
	@Test
	public void testValidate() throws Exception {
		StringLengthCheck rule = new StringLengthCheck();
		Map<String, Object> data = new HashMap<String, Object>();

		data.put("operand", "test123");
		Object outputData = rule.validate(data, new StringBuffer());
		assertTrue(outputData instanceof Boolean);
		assertTrue((Boolean) outputData);

		data.put("operand", null);
		outputData = rule.validate(data, new StringBuffer());
		assertTrue(outputData instanceof Boolean);
		assertFalse((Boolean) outputData);

		
	}
	
	@Test
	public void testValidateMinCheck() throws Exception {
		
		StringLengthCheck rule = new StringLengthCheck();
		Map<String, Object> data = new HashMap<String, Object>();

		data.put("operand", "test123");
		data.put("minlength", "2");
		Object outputData = rule.validate(data, new StringBuffer());
		assertTrue(outputData instanceof Boolean);
		assertTrue((Boolean) outputData);
		
		data.put("minlength", "8");
		outputData = rule.validate(data, new StringBuffer());
		assertTrue(outputData instanceof Boolean);
		assertFalse((Boolean) outputData);
		
		data.put("minlength", "7");
		outputData = rule.validate(data, new StringBuffer());
		assertTrue(outputData instanceof Boolean);
		assertTrue((Boolean) outputData);
		
	}
	
	@Test
	public void testValidateMaxCheck() throws Exception {
		
		StringLengthCheck rule = new StringLengthCheck();
		Map<String, Object> data = new HashMap<String, Object>();

		data.put("operand", "test123");
		data.put("maxlength", "10");
		Object outputData = rule.validate(data, new StringBuffer());
		assertTrue(outputData instanceof Boolean);
		assertTrue((Boolean) outputData);
		
		data.put("maxlength", "7");
		outputData = rule.validate(data, new StringBuffer());
		assertTrue(outputData instanceof Boolean);
		assertTrue((Boolean) outputData);
		
		data.put("maxlength", "3");
		outputData = rule.validate(data, new StringBuffer());
		assertTrue(outputData instanceof Boolean);
		assertFalse((Boolean) outputData);
	}
	
	@Test
	public void testValidateRangeCheck() throws Exception {
		
		StringLengthCheck rule = new StringLengthCheck();
		Map<String, Object> data = new HashMap<String, Object>();

		data.put("operand", "test123");
		data.put("minlength", "8");
		data.put("maxlength", "10");
		Object outputData = rule.validate(data, new StringBuffer());
		assertTrue(outputData instanceof Boolean);
		assertFalse((Boolean) outputData);
		
		data.put("minlength", "7");
		data.put("maxlength", "7");
		outputData = rule.validate(data, new StringBuffer());
		assertTrue(outputData instanceof Boolean);
		assertTrue((Boolean) outputData);
		
		data.put("minlength", "1");
		data.put("maxlength", "3");
		outputData = rule.validate(data, new StringBuffer());
		assertTrue(outputData instanceof Boolean);
		assertFalse((Boolean) outputData);
		
		data.put("minlength", "1");
		data.put("maxlength", "7");
		outputData = rule.validate(data, new StringBuffer());
		assertTrue(outputData instanceof Boolean);
		assertTrue((Boolean) outputData);
		
	}
	
	
	

}
