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
 * $Id: DateFormattingRuleTest.java
 * $Revision: 
 * $Author: mbafna
 * $DateTime: Nov 7, 2008 
 */

package com.headstrong.fusion.services.transformer.rules.daterules;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

/**
 * 
 */
public class DateFormattingRuleTest {

	/**
	 * Test method for {@link com.headstrong.fusion.services.transformer.rules.daterules.DateFormattingRule#operate(java.util.Map)}.
	 */
	@SuppressWarnings("unchecked")
	@Test
	public void testOperate() throws Exception{
		DateFormattingRule rule=new DateFormattingRule();
		Map<String, Object> data=new HashMap<String, Object>();
		data.put("operand", "10/01/2008");
		data.put("inputdateformat", "dd/mm/yyyy");
		data.put("outputdateformat", "mm-dd-yyyy");
		Object output=rule.operate(data);
		assertNotNull(output);
		assertTrue(output instanceof Map);
		Map<String, Object>outputData=(Map)output;
		assertNotNull(outputData.get("result"));
		assertEquals("01-10-2008", outputData.get("result"));
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void testOperateList() throws Exception{
		DateFormattingRule rule=new DateFormattingRule();
		Map<String, Object> data=new HashMap<String, Object>();
		List<String> inputList=new ArrayList<String>();
		inputList.add("10/01/2008");
		inputList.add("12/12/2006");
		inputList.add("01/01/2005");
		inputList.add("31/01/2000");
		data.put("operand", inputList);
		data.put("inputdateformat", "dd/mm/yyyy");
		data.put("outputdateformat", "mm-dd-yyyy");
		Object output=rule.operate(data);
		assertNotNull(output);
		assertTrue(output instanceof Map);
		Map<String, Object>outputData=(Map)output;
		assertNotNull(outputData.get("result"));
		List<String> expectedList=new ArrayList<String>();
		expectedList.add("01-10-2008");
		expectedList.add("12-12-2006");
		expectedList.add("01-01-2005");
		expectedList.add("01-31-2000");
		assertArrayEquals(expectedList.toArray(), ((List)outputData.get("result")).toArray());
	}

	@Test
	public void testOperateOperandNull() throws Exception{
		DateFormattingRule rule=new DateFormattingRule();
		Map<String, Object> data=new HashMap<String, Object>();
		data.put("inputdateformat", "dd/mm/yyyy");
		data.put("outputdateformat", "mm-dd-yyyy");
		try {
			rule.operate(data);
			fail("Operand is null. DateFormattingRule cannot be applied");
		} catch (Exception e) {
			
		}
		
	}
	
	@Test
	public void testOperateInputDateFormatNull() throws Exception{
		DateFormattingRule rule=new DateFormattingRule();
		Map<String, Object> data=new HashMap<String, Object>();
		data.put("operand", "10/01/2008");
		data.put("outputdateformat", "mm-dd-yyyy");
		try {
			rule.operate(data);
			fail("inputdateformat is null. DateFormattingRule cannot be applied");
		} catch (Exception e) {
			
		}
		
	}

	@Test
	public void testOperateOutputDateFormatNull() throws Exception{
		DateFormattingRule rule=new DateFormattingRule();
		Map<String, Object> data=new HashMap<String, Object>();
		data.put("operand", "10/01/2008");
		data.put("inputdateformat", "mm-dd-yyyy");
		try {
			rule.operate(data);
			fail("outputdateformat is null. DateFormattingRule cannot be applied");
		} catch (Exception e) {
			
		}
	}
	
	@Test
	public void testOperateInvalidInputDateFormat() throws Exception{
		DateFormattingRule rule=new DateFormattingRule();
		Map<String, Object> data=new HashMap<String, Object>();
		data.put("operand", "10/01/2008");
		data.put("inputdateformat", "abcde");
		data.put("outputdateformat", "mm-dd-yyyy");
		try {
			rule.operate(data);
			fail("inputdateformat is not proper. DateFormattingRule cannot be applied");
		} catch (Exception e) {
			
		}
	}
	
	@Test
	public void testOperateInvalidOutputDateFormat() throws Exception{
		DateFormattingRule rule=new DateFormattingRule();
		Map<String, Object> data=new HashMap<String, Object>();
		data.put("operand", "10/01/2008");
		data.put("inputdateformat", "dd/mm/yyyy");
		data.put("outputdateformat", "abcd");
		try {
			rule.operate(data);
			fail("outputdateformat is not proper. DateFormattingRule cannot be applied");
		} catch (Exception e) {
			
		}
	}
	
	

}
