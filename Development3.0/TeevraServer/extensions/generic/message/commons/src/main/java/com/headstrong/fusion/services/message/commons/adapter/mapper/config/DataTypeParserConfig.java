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
 * $Id: DataTypeParserConfig.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jun 18, 2009 
 */

package com.headstrong.fusion.services.message.commons.adapter.mapper.config;

/**
 * Data format.
 */
public class DataTypeParserConfig {

	private String dataType;
	private String[] input;

	/**
	 * @return the dataType
	 */
	public String getDataType() {
		return dataType;
	}

	/**
	 * @param dataType
	 *            the dataType to set
	 */
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	/**
	 * @return the input
	 */
	public String[] getInput() {
		return input;
	}

	/**
	 * @param input
	 *            the input to set
	 */
	public void setInput(String[] input) {
		this.input = input;
	}
}
