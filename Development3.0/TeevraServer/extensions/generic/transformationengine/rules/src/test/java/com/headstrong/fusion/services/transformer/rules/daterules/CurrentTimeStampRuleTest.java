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
 * $Id: CurrentTimeStampRuleTest.java
 * $Revision: 
 * $Author: MBafna
 * $DateTime: Jan 6, 2009 
 */

package com.headstrong.fusion.services.transformer.rules.daterules;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * 
 */
public class CurrentTimeStampRuleTest {

	/**
	 * Test method for {@link com.headstrong.fusion.services.transformer.rules.daterules.CurrentTimeStampRule#operate(java.util.Map)}.
	 */
	@Test
	public void testOperate() throws Exception{
		CurrentTimeStampRule rule=new CurrentTimeStampRule();
		Map<String, Object> data=new HashMap<String, Object>();
		data.put("outputdateformat", "MM-dd-yyyy'T'HH:mm:ss");
		Object output=rule.operate(data);
		assertNotNull(output);
		assertTrue(output instanceof Map);
		Map<String, Object>outputData=(Map)output;
		assertNotNull(outputData.get("result"));
		System.out.println("Output date is :"+outputData.get("result"));
		
	}

}
