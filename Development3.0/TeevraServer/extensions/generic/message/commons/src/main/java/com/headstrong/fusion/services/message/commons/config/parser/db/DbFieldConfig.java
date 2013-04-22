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
 * $Id: DbFieldConfiguration.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Nov 21, 2008 
 */

package com.headstrong.fusion.services.message.commons.config.parser.db;

/**
 * Represents Db field mapping data .
 * FieldName is dotted notation field name
 * which would converted to tree like data.
 * 
 */
public class DbFieldConfig {
	/**
	 * Dotted Notation field Name.
	 */
	private String fieldName;
	private String dbField;
	/**
	 * @return the fieldName
	 */
	public String getFieldName() {
		return fieldName;
	}
	/**
	 * @param fieldName the fieldName to set
	 */
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	/**
	 * @return the dbField
	 */
	public String getDbField() {
		return dbField;
	}
	/**
	 * @param dbField the dbField to set
	 */
	public void setDbField(String dbField) {
		this.dbField = dbField;
	}
	
}
