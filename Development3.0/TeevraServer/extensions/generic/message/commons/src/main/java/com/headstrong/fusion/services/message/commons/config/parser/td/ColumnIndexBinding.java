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
 * $Id: ColumnIndexBinding.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Nov 2, 2008
 */

package com.headstrong.fusion.services.message.commons.config.parser.td;

import com.headstrong.fusion.services.message.commons.config.parser.Binding;

/**
 * Represents the field's column index number.
 * 
 */
public class ColumnIndexBinding implements Binding {
	
	private int columnIndex;
	private String printType;
	
	/**
	 * @return the columnIndex
	 */
	public int getColumnIndex() {
		return columnIndex;
	}

	/**
	 * @param columnIndex the columnIndex to set
	 */
	public void setColumnIndex(int columnIndex) {
		this.columnIndex = columnIndex;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getPrintType() {
		return printType;
	}

	/**
	 * 
	 * @param printType
	 */
	public void setPrintType(String printType) {
		this.printType = printType;
	}
	
}