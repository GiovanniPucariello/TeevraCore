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
 * $Id: FusionUtilTest.java
 * $Revision: 
 * $Author: MBafna
 * $DateTime: Dec 31, 2008 
 */

package com.headstrong.fusion.commons.util;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;


/**
 * 
 */
public class FusionUtilTest {

	/**
	 * Test method for {@link com.headstrong.fusion.commons.util.FusionUtil#populateMap(java.util.Map, java.lang.String, java.lang.Object)}.
	 */
	@Test
	public void testPopulateMap() {
		Map<String, Object> dataMap=new HashMap<String, Object>();
		FusionUtil.populateMap(dataMap,"operand","abc");
		FusionUtil.populateMap(dataMap,"operand","def");
		FusionUtil.populateMap(dataMap,"operand","ghi");
		FusionUtil.populateMap(dataMap,"operand","jkl");
		FusionUtil.populateMap(dataMap,"totaloperand",4);
		FusionUtil.populateMap(dataMap,"minlength","5");
		
		Object operandData=dataMap.get("operand");
		assertTrue(operandData instanceof List);
		List<Object> listData=(List<Object>)operandData;
		assertEquals(listData.get(0),"abc");
		assertEquals(listData.get(1),"def");
		assertEquals(listData.get(2),"ghi");
		assertEquals(listData.get(3),"jkl");
		
		assertEquals(dataMap.get("totaloperand"), 4);
		assertEquals(dataMap.get("minlength"), "5");
	}

}
