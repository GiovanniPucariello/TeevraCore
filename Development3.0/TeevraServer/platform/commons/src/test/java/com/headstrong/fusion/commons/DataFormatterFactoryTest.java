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
 * $Id: DataFormatterFactoryTest.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: May 4, 2010 
 */

package com.headstrong.fusion.commons;

import com.headstrong.fusion.commons.DataFormatterFactory.Formatter;

import junit.framework.TestCase;


/**
 * {@link DataFormatterFactory} test class.
 */
public class DataFormatterFactoryTest extends TestCase {

	public void testGetStringDataFormatter() throws Exception {
		DataFormatter formatter = DataFormatterFactory
				.getDataFormatter(Formatter.String);
		assertTrue(formatter instanceof StringFormatter);
	}

	public void testGetNumberDataFormatter() throws Exception {
		DataFormatter formatter = DataFormatterFactory
				.getDataFormatter(Formatter.Number);
		assertTrue(formatter instanceof NumberFormatter);
	}

}
