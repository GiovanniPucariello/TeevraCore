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
 * $Id: NumberFormatterTest.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: May 4, 2010 
 */

package com.headstrong.fusion.commons;

import junit.framework.TestCase;

/**
 * 
 */
public class NumberFormatterTest extends TestCase {
	public void testFormat() throws Exception {
		NumberFormatter formatter = new NumberFormatter();
		String out = formatter.format(new Integer(100), 10, '0');
		assertEquals("0000000100", out);
	}
}
