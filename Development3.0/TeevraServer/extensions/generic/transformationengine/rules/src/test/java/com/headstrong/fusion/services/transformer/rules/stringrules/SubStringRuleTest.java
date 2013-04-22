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
 * $Id: SubStringRuleTest.java
 * $Revision: 
 * $Author: mbafna
 * $DateTime: Nov 7, 2008 
 */

package com.headstrong.fusion.services.transformer.rules.stringrules;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * 
 */
public class SubStringRuleTest {


	@SuppressWarnings("unchecked")
	@Test
	public void testOperateNoData() throws Exception{
		SubStringRule rule=new SubStringRule();
		java.util.Map<String, Object> data=new HashMap<String, Object>();
		Object output=rule.operate(data);
		assertTrue(output instanceof Map);
		Map<String,Object> outputData=(Map)output;
		assertNotNull(outputData.get("result"));
		assertEquals( "",outputData.get("result"));
	
		
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void testOperate() throws Exception{
		SubStringRule rule=new SubStringRule();
		java.util.Map<String, Object> data=new HashMap<String, Object>();
		String str="test123";
		data.put("operand", str);
		data.put("beginindex", "2");
		data.put("endindex", "4");
		Object output=rule.operate(data);
		assertTrue(output instanceof Map);
		Map<String,Object> outputData=(Map)output;
		assertNotNull(outputData.get("result"));
		assertEquals( str.substring(2, 4),outputData.get("result"));
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void testOperateBeginIndexNull() throws Exception{
		SubStringRule rule=new SubStringRule();
		java.util.Map<String, Object> data=new HashMap<String, Object>();
		String str="test123";
		data.put("operand", str);
		data.put("endindex", "4");
		Object output=rule.operate(data);
		assertTrue(output instanceof Map);
		Map<String,Object> outputData=(Map)output;
		assertNotNull(outputData.get("result"));
		assertEquals(str.substring(0, 4),outputData.get("result") );
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void testOperateEndIndexNull() throws Exception{
		SubStringRule rule=new SubStringRule();
		java.util.Map<String, Object> data=new HashMap<String, Object>();
		String str="test123";
		data.put("operand", str);
		data.put("beginindex", "2");
		Object output=rule.operate(data);
		assertTrue(output instanceof Map);
		Map<String,Object> outputData=(Map)output;
		assertNotNull(outputData.get("result"));
		assertEquals(str.substring(2), outputData.get("result"));
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void testOperateOperandNull() throws Exception{
		SubStringRule rule=new SubStringRule();
		java.util.Map<String, Object> data=new HashMap<String, Object>();
		String str=null;
		data.put("operand", str);
		data.put("beginindex", "2");
		data.put("endindex", "4");
		Object output=rule.operate(data);
		assertTrue(output instanceof Map);
		Map<String,Object> outputData=(Map)output;
		assertNotNull(outputData.get("result"));
		assertEquals("",outputData.get("result"));
	}
	
	
}
