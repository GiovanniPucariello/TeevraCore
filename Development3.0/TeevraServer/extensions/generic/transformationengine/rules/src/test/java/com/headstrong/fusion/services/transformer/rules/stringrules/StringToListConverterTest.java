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
 * $Id: StringToListConverterTest.java
 * $Revision: 
 * $Author: MBafna
 * $DateTime: Dec 11, 2008 
 */

package com.headstrong.fusion.services.transformer.rules.stringrules;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

/**
 * 
 */
public class StringToListConverterTest {

	/**
	 * Test method for {@link com.headstrong.fusion.services.transformer.rules.stringrules.StringToListConverter#operate(java.util.Map)}.
	 */
	@SuppressWarnings("unchecked")
	@Test
	public void testOperate() throws Exception{
		StringToListConverter rule=new StringToListConverter();
		java.util.Map<String, Object> data=new HashMap<String, Object>();
		String str="test123,test124,test125";
		data.put("operand", str);
		data.put("delimiter", ",");
		Object output=rule.operate(data);
		assertTrue(output instanceof Map);
		Map<String,Object> outputData=(Map)output;
		Object result=outputData.get("result");
		assertNotNull(result);
		assertTrue(result instanceof List);
		List<String> expectedData=new ArrayList<String>();
		expectedData.add("test123");
		expectedData.add("test124");
		expectedData.add("test125");
		assertArrayEquals(expectedData.toArray(), ((List)result).toArray());
	}

}
