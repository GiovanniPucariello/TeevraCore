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
 * $Id: AddRuleTest.java
 * $Revision: 
 * $Author: mbafna
 * $DateTime: Nov 7, 2008 
 */

package com.headstrong.fusion.services.transformer.rules.mathrules;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * 
 */
public class SubtractRuleTest {

	
	/**
	 * Test method for {@link com.headstrong.fusion.services.transformer.rules.mathrules.AddRule#operate(java.util.Map)}.
	 */
	@SuppressWarnings("unchecked")
	@Test
	public void testOperateMixData() throws Exception{
		SubtractRule rule=new SubtractRule();
		Map<String, Object> data=new HashMap<String, Object>();
		data.put("operand1","100.55");
		data.put("operand2", "50");
		Object output=rule.operate(data);
		assertNotNull(output);
		assertTrue(output instanceof Map);
		Map<String,Object> outputData=(Map) output;
		assertTrue(outputData.containsKey("result"));
		assertEquals(100.55-50, Double.parseDouble((String)outputData.get("result")),0.01);
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void testOperateOnlyInteger() throws Exception{
		SubtractRule rule=new SubtractRule();
		Map<String, Object> data=new HashMap<String, Object>();
		data.put("operand1","200");
		data.put("operand2", "50");
		Object output=rule.operate(data);
		assertNotNull(output);
		assertTrue(output instanceof Map);
		Map<String,Object> outputData=(Map) output;
		assertTrue(outputData.containsKey("result"));
		assertEquals(200-50, Double.parseDouble((String)outputData.get("result")),0.00);
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void testOperateOnlyDouble() throws Exception{
		SubtractRule rule=new SubtractRule();
		Map<String, Object> data=new HashMap<String, Object>();
		data.put("operand1","200.1");
		data.put("operand2", "99.34");
		Object output=rule.operate(data);
		assertNotNull(output);
		assertTrue(output instanceof Map);
		Map<String,Object> outputData=(Map) output;
		assertTrue(outputData.containsKey("result"));
		assertEquals(200.1-99.34, Double.parseDouble((String)outputData.get("result")),0.01);
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void testOperateDoubleNegative() throws Exception{
		SubtractRule rule=new SubtractRule();
		Map<String, Object> data=new HashMap<String, Object>();
		data.put("operand1","200.1");
		data.put("operand2", "399.34");
		Object output=rule.operate(data);
		assertNotNull(output);
		assertTrue(output instanceof Map);
		Map<String,Object> outputData=(Map) output;
		assertTrue(outputData.containsKey("result"));
		assertEquals(200.1-399.34, Double.parseDouble((String)outputData.get("result")),0.01);
	}
	
	
	
	
	@SuppressWarnings("unchecked")
	@Test
	public void testOperateOneOperandNull() throws Exception{
		SubtractRule rule=new SubtractRule();
		Map<String, Object> data=new HashMap<String, Object>();
		data.put("operand2", "200.2");
		Object output=rule.operate(data);
		assertNotNull(output);
		assertTrue(output instanceof Map);
		Map<String,Object> outputData=(Map) output;
		assertTrue(outputData.containsKey("result"));
		assertEquals(0-200.2, Double.parseDouble((String)outputData.get("result")),0.01);
	}
	
	@Test
	public void testOperateOneOperandString() throws Exception{
		SubtractRule rule=new SubtractRule();
		Map<String, Object> data=new HashMap<String, Object>();
		data.put("operand1","abcd");
		data.put("operand2", "200.2");
		try {
			@SuppressWarnings("unused")
			Object output=rule.operate(data);
			fail("String operands not allowed");
		}catch (Exception e){
			
		}
	}
	
}
