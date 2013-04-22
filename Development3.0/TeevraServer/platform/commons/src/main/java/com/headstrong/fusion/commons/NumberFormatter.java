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
 * $Id: NumberFormatter.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jun 25, 2009 
 */

package com.headstrong.fusion.commons;

import com.headstrong.fusion.commons.exception.DataFormattingException;

/**
 * Formats a number as per the size.
 */
public class NumberFormatter implements DataFormatter {

	public String format(Object number, int size, char pad)
			throws DataFormattingException {
		StringBuilder buffer = new StringBuilder();
		String stringFormat = "";
		if (number != null) {
			stringFormat = number.toString();
		}

		int strLength = stringFormat.length();

		if (strLength > size) {
			throw new DataFormattingException(
					"number size is greater than the field size");
		}
		int padToFill = size - strLength;

		if (stringFormat.startsWith("-")) {
			buffer.append("-");
			buffer.append(getPadding(padToFill, pad));
			buffer.append(stringFormat.substring(1));
		} else if (stringFormat.startsWith("+")) {
			buffer.append("+");
			buffer.append(getPadding(padToFill, pad));
			buffer.append(stringFormat.substring(1));
		} else {
			buffer.append(getPadding(padToFill, pad));
			buffer.append(stringFormat);
		}
		return buffer.toString();
	}

	/**
	 * Creates a fixed length string with spaces as characters.
	 * 
	 * @param length
	 */
	private static String getPadding(int length, char pad) {
		StringBuffer buffer = new StringBuffer();
		for (int i = length; i > 0; --i) {
			buffer.append(pad);
		}
		return buffer.toString();
	}
}
