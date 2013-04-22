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
 * $Id: DataFormatterFactory.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jun 25, 2009 
 */

package com.headstrong.fusion.commons;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 */
public class DataFormatterFactory {
	private static Map<Formatter, DataFormatter> dataFormatterMap = new HashMap<Formatter, DataFormatter>();

	public static enum Formatter {
		String, Number
	}

	static {
		dataFormatterMap.put(Formatter.String, new StringFormatter());
		dataFormatterMap.put(Formatter.Number, new NumberFormatter());
	}

	public static DataFormatter getDataFormatter(Formatter formatter) {
		return dataFormatterMap.get(formatter);
	}
}
