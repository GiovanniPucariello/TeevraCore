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
 * $Id: XmlConfiguration.java
 * $Revision: 
 * $Author: mbafna
 * $DateTime: Nov 5, 2008 
 */

package com.headstrong.fusion.services.message.commons.config.parser.xml;

/**
 * 
 */
public class XmlConfiguration implements Comparable<XmlConfiguration> {
	/**
	 * Dotted notation field name that would be used to create 
	 * a hierachical xml configuration. 
	 */
	private String fieldName;
	private String xPath;

	/**
	 * @return the fieldName
	 */
	public String getFieldName() {
		return fieldName;
	}

	/**
	 * @param fieldName
	 *            the fieldName to set
	 */
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	/**
	 * @return the xPath
	 */
	public String getXPath() {
		return xPath;
	}

	/**
	 * @param path
	 *            the xPath to set
	 */
	public void setXPath(String path) {
		xPath = path;
	}

	public int compareTo(XmlConfiguration o) {
		return (this.getFieldName().compareTo(o.getFieldName()));
	}
}
