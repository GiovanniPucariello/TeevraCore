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
 * $Id: StringFormatter.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jun 25, 2009 
 */

package com.headstrong.fusion.commons;

import com.headstrong.fusion.commons.exception.DataFormattingException;

/**
 * 
 */
public class StringFormatter implements DataFormatter {

	public String format(Object object, int size, char pad)
			throws DataFormattingException {
		StringBuilder buffer = new StringBuilder();
		if (object == null) {
			return this.getPadding(size, pad);
		} else {
			String temp = object.toString();
			buffer.append(temp);
			if (temp.length() >= size) {
				return temp.substring(0, size);
			}
			buffer.append(this.getPadding(size - temp.length(), pad));
		}
		return buffer.toString();
	}

	/**
	 * Creates a fixed length string with spaces as characters.
	 * 
	 * @param length
	 */
	private String getPadding(int length, char pad) {
		StringBuffer buffer = new StringBuffer();
		for (int i = length; i > 0; --i) {
			buffer.append(pad);
		}
		return buffer.toString();
	}
}
