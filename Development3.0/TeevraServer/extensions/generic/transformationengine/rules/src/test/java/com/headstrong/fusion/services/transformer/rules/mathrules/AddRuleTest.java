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

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.headstrong.fusion.commons.util.FusionUtil;

/**
 * 
 */
public class AddRuleTest {
	/**
	 * Test method for {@link com.headstrong.fusion.services.transformer.rules.mathrules.AddRule#operate(java.util.Map)}.
	 */
	@SuppressWarnings("unchecked")
	@Test
	public void testOperateMixData() throws Exception{
		AddRule rule=new AddRule();
		Map<String, Object> dataMap=new HashMap<String, Object>();
		FusionUtil.populateMap(dataMap, "operand","100");
		FusionUtil.populateMap(dataMap, "operand","200.32");
		FusionUtil.populateMap(dataMap, "operand","400.1");
		
		Object output=rule.operate(dataMap);
		assertNotNull(output);
		assertTrue(output instanceof Map);
		Map<String,Object> outputData=(Map) output;
		assertTrue(outputData.containsKey("result"));
		assertEquals(100+200.32+400.1, Double.parseDouble((String)outputData.get("result")),0.01);
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void testOperateOnlyInteger() throws Exception{
		AddRule rule=new AddRule();
		Map<String, Object> dataMap=new HashMap<String, Object>();
		FusionUtil.populateMap(dataMap, "operand","100");
		FusionUtil.populateMap(dataMap, "operand","200");
		FusionUtil.populateMap(dataMap, "operand","400");
	
		Object output=rule.operate(dataMap);
		assertNotNull(output);
		assertTrue(output instanceof Map);
		Map<String,Object> outputData=(Map) output;
		assertTrue(outputData.containsKey("result"));
		assertEquals(100+200+400, Double.parseDouble((String)outputData.get("result")),0.00);
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void testOperateOnlyDouble() throws Exception{
		AddRule rule=new AddRule();
		Map<String, Object> dataMap=new HashMap<String, Object>();
		FusionUtil.populateMap(dataMap, "operand","100.1");
		FusionUtil.populateMap(dataMap, "operand","200.2");
		FusionUtil.populateMap(dataMap, "operand","400.4");
	
		Object output=rule.operate(dataMap);
		assertNotNull(output);
		assertTrue(output instanceof Map);
		Map<String,Object> outputData=(Map) output;
		assertTrue(outputData.containsKey("result"));
		assertEquals(100.1+200.2+400.4, Double.parseDouble((String)outputData.get("result")),0.01);
	}
	
	
	@SuppressWarnings("unchecked")
	@Test
	public void testOperateOneOperandNull() throws Exception{
		AddRule rule=new AddRule();
		Map<String, Object> dataMap=new HashMap<String, Object>();
		FusionUtil.populateMap(dataMap, "operand",null);
		FusionUtil.populateMap(dataMap, "operand","200.2");
		FusionUtil.populateMap(dataMap, "operand","400.4");
		Object output=rule.operate(dataMap);
		assertNotNull(output);
		assertTrue(output instanceof Map);
		Map<String,Object> outputData=(Map) output;
		assertTrue(outputData.containsKey("result"));
		assertEquals(200.2+400.4, Double.parseDouble((String)outputData.get("result")),0.01);
	}
	
	@Test
	public void testOperateOneOperandString() throws Exception{
		AddRule rule=new AddRule();
		Map<String, Object> dataMap=new HashMap<String, Object>();
		FusionUtil.populateMap(dataMap, "operand","abcd");
		FusionUtil.populateMap(dataMap, "operand","200.2");
		FusionUtil.populateMap(dataMap, "operand","400.4");
		try {
			rule.operate(dataMap);
			fail("String operands not allowed");
		}catch (Exception e){
			
		}
	}
	
}
