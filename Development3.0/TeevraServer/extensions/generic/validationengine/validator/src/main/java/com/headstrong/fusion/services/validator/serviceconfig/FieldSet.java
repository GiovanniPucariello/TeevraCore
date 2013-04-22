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
 * $Id: InputFieldSet.java
 * $Revision: 
 * $Author: mbafna
 * $DateTime: Nov 6, 2008 
 */

package com.headstrong.fusion.services.validator.serviceconfig;

/**
 * <code>FieldSet</code> contains information about each field set in the
 * rule. This fieldset can be the input field set or the output field set.
 */
public class FieldSet {

	/**
	 * The name of the parameter.
	 */
	private String paramName;

	/**
	 * The value of the parameter. Can be attribute in either input or output
	 * field, or some temporary field or a constant.
	 */
	private String paramValue;

	/**
	 * type can be among the following:
	 * <ul>
	 * <li>input - if the value needs to be picked up from input business
	 * object</li>
	 * <li>output - if the value needs to be picked up from output business
	 * object</li>
	 * <li>temp - if the value needs to be picked up from temporary variable</li>
	 * <li>constant - if the value is a constant</li>
	 * </ul>
	 */
	private String paramType;

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(paramName);
		sb.append(paramValue);
		sb.append(paramType);
		return sb.toString();

	}

	/**
	 * @return the paramName
	 */
	public String getParamName() {
		return paramName.toLowerCase();
	}

	/**
	 * @param paramName
	 *            the paramName to set
	 */
	public void setParamName(String paramName) {
		this.paramName = paramName;
	}

	/**
	 * @return the paramValue
	 */
	public String getParamValue() {
		return paramValue;
	}

	/**
	 * @param paramValue
	 *            the paramValue to set
	 */
	public void setParamValue(String paramValue) {
		this.paramValue = paramValue;
	}

	/**
	 * @return the paramType
	 */
	public String getParamType() {
		return paramType;
	}

	/**
	 * @param paramType
	 *            the paramType to set
	 */
	public void setParamType(String paramType) {
		this.paramType = paramType;
	}
}
