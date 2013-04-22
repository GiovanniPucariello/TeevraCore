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
 * $Id: StringFormatterTest.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: May 4, 2010 
 */

package com.headstrong.fusion.commons;

import junit.framework.TestCase;

/**
 * {@link StringFormatter} test class. 
 */
public class StringFormatterTest extends TestCase {

	public void testFormat() throws Exception {
		StringFormatter formatter = new StringFormatter();
		String out = formatter.format("test", 10, ' ');
		assertEquals("test      ", out);

	}
}
