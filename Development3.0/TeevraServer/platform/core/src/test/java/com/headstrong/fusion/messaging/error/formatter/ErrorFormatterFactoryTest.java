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
 * $Id: ErrorFormatterFactoryTest.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Jun 1, 2009 
 */

package com.headstrong.fusion.messaging.error.formatter;

import com.headstrong.fusion.commons.ErrorFormatter;
import junit.framework.TestCase;

/**
 * 
 */
public class ErrorFormatterFactoryTest extends TestCase {
	public void testGetFormatterXml() throws Exception {
		ErrorFormatter errorFormatter = ErrorFormatterFactory
				.getErrorFormatter("xml");
		assertNotNull(errorFormatter);
		assertEquals(XmlErrorFormatter.class.getName(), errorFormatter
				.getClass().getName());
	}

	public void testGetFormatterDatabase() throws Exception {
		ErrorFormatter errorFormatter = ErrorFormatterFactory
				.getErrorFormatter("database");
		assertNotNull(errorFormatter);
		assertEquals(DbErrorFormatter.class.getName(), errorFormatter
				.getClass().getName());

	}
}
