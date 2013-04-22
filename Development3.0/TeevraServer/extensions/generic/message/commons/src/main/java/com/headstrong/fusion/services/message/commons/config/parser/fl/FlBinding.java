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
 * $Id: FixedLengthBinding.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Nov 25, 2008 
 */

package com.headstrong.fusion.services.message.commons.config.parser.fl;

import com.headstrong.fusion.services.message.commons.config.parser.Binding;

/**
 * Fixed length parser/formatter related binding
 */
public class FlBinding implements Binding {

	private int startIndex;
	private int endIndex;
	/**
	 * for the formatter identifies how to print the field.
	 */
	private String printType;

	/**
	 * @return the startIndex
	 */
	public int getStartIndex() {
		return startIndex;
	}

	/**
	 * @param startIndex
	 *            the startIndex to set
	 */
	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}

	/**
	 * @return the endIndex
	 */
	public int getEndIndex() {
		return endIndex;
	}

	/**
	 * @param endIndex
	 *            the endIndex to set
	 */
	public void setEndIndex(int endIndex) {
		this.endIndex = endIndex;
	}

	public String getPrintType() {
		return printType;
	}

	public void setPrintType(String printType) {
		this.printType = printType;
	}

}
