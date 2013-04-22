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
 * $Id: StringConcatenateRuleTest.java
 * $Revision: 
 * $Author: MBafna
 * $DateTime: Dec 31, 2008 
 */

package com.headstrong.fusion.services.transformer.rules.stringrules;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.headstrong.fusion.commons.util.FusionUtil;

/**
 * 
 */
public class StringConcatenateRuleTest {

	/**
	 * Test method for {@link com.headstrong.fusion.services.transformer.rules.stringrules.StringConcatenateRule#operate(java.util.Map)}.
	 */
	@SuppressWarnings("unchecked")
	@Test
	public void testOperate() throws Exception{
		StringConcatenateRule rule=new StringConcatenateRule();
		Map<String, Object> dataMap=new HashMap<String, Object>();
		FusionUtil.populateMap(dataMap, "operand","abc");
		FusionUtil.populateMap(dataMap, "operand","def");
		FusionUtil.populateMap(dataMap, "operand","ghi");
		
		Object output=rule.operate(dataMap);
		assertNotNull(output);
		assertTrue(output instanceof Map);
		Map<String,Object> outputData=(Map) output;
		assertTrue(outputData.containsKey("result"));
		assertEquals("abcdefghi", outputData.get("result"));
	}

}
