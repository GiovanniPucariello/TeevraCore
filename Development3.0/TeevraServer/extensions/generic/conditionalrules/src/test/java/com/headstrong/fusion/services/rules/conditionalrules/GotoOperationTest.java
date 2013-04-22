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
 * $Id: GotoOperationTest.java
 * $Revision: 
 * $Author: viswanathp
 * $DateTime: Nov 25, 2008 
 */
package com.headstrong.fusion.services.rules.conditionalrules;

import java.util.HashMap;
import java.util.Map;

import junit.framework.TestCase;

import org.junit.Test;

public class GotoOperationTest extends TestCase {

	@Test
	public void testOperate() throws Exception {
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("sequenceid", 100);

		GotoOperation rule = new GotoOperation();
		Object output = rule.performGotoOperation(data);
		assertTrue(output instanceof Integer);
		assertEquals(100, output);
	}

}
