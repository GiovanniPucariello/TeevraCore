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
 * $Id: NumberFormatterRuleTest.java
 * $Revision: 
 * $Author: MBafna
 * $DateTime: Jan 2, 2009 
 */

package com.headstrong.fusion.services.transformer.rules.mathrules;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * 
 */
public class NumberFormatterRuleTest {

	/**
	 * Test method for {@link com.headstrong.fusion.services.transformer.rules.mathrules.NumberFormatterRule#operate(java.util.Map)}.
	 */
	@Test
	public void testOperate() throws Exception{
		NumberFormatterRule rule=new NumberFormatterRule();
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("operand", 100);
		data.put("formatpattern", "+0000000000");
		Object output = rule.operate(data);
		assertNotNull(output);
		assertTrue(output instanceof Map);
		Map<String,Object> outputData=(Map) output;
		assertTrue(outputData.containsKey("result"));
		
		assertEquals("+0000000100", outputData.get("result"));
	
		
		

		
		
	}

}
