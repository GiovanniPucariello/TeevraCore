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
 * $Id: ErrorFormatterFactory.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Jun 1, 2009 
 */

package com.headstrong.fusion.messaging.error.formatter;

import java.util.HashMap;
import java.util.Map;

import com.headstrong.fusion.commons.ErrorFormatter;

/**
 * A factory class for formatter.
 */
public class ErrorFormatterFactory {
	private static final Map<String, ErrorFormatter> errorFormatterMap = new HashMap<String, ErrorFormatter>();

	static {
		// register the formatter.
		errorFormatterMap.put("xml", new XmlErrorFormatter());
		errorFormatterMap.put("database", new DbErrorFormatter());
		errorFormatterMap.put("fixml", new FixmlErrorFormatter());
	}

	public static ErrorFormatter getErrorFormatter(String errorFormatterType) {
		return errorFormatterMap.get(errorFormatterType);
	}

}
