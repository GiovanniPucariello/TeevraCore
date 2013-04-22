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
 * $Id: FieldMapping.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Jun 11, 2009 
 */

package com.headstrong.fusion.services.message.commons.adapter.mapper.config;

/**
 * Specifies the field mapping.
 * 
 * Target field is populated with the value from the source field.
 * 
 */
public class FieldMapping implements Statement {
	/**
	 * Name of source field. ( Euronext field name )
	 */
	private Object source;
	/**
	 * mapping type simple/constant/expression
	 */
	private String type;
	/**
	 * Target field ( business object field name )
	 */
	private String target;

	/**
	 * Specifies if the target field needs to get a value at the end of the
	 * mapping or not. If the target field is mandatory it is expected to have
	 * this required attribute set. Default is set to false.
	 */
	private boolean required = false;

	/**
	 * Default value for the field that needs to be applied if the mapping
	 * doesn't return any value.
	 */
	private String defaultValue;

	/**
	 * Optional data format.
	 */
	private DataTypeParserConfig dataTypeParserConfig;

	/**
	 * Optional data format.
	 */
	private DataTypeFormatterConfig dataTypeFormatterConfig;

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the target
	 */
	public String getTarget() {
		return target;
	}

	/**
	 * @param target
	 *            the target to set
	 */
	public void setTarget(String target) {
		this.target = target;
	}

	/**
	 * @return the source
	 */
	public Object getSource() {
		return source;
	}

	/**
	 * @param source
	 *            the source to set
	 */
	public void setSource(Object source) {
		this.source = source;
	}

	/**
	 * @return the dataTypeParserConfig
	 */
	public DataTypeParserConfig getDataTypeParserConfig() {
		return dataTypeParserConfig;
	}

	/**
	 * @param dataTypeParserConfig
	 *            the dataTypeParserConfig to set
	 */
	public void setDataTypeParserConfig(
			DataTypeParserConfig dataTypeParserConfig) {
		this.dataTypeParserConfig = dataTypeParserConfig;
	}

	/**
	 * @return the dataTypeFormatterConfig
	 */
	public DataTypeFormatterConfig getDataTypeFormatterConfig() {
		return dataTypeFormatterConfig;
	}

	/**
	 * @param dataTypeFormatterConfig
	 *            the dataTypeFormatterConfig to set
	 */
	public void setDataTypeFormatterConfig(
			DataTypeFormatterConfig dataTypeFormatterConfig) {
		this.dataTypeFormatterConfig = dataTypeFormatterConfig;
	}

	public boolean isRequired() {
		return required;
	}

	public void setRequired(boolean required) {
		this.required = required;
	}

	public String getDefaultValue() {
		return defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

}
