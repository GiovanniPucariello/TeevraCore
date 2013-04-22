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
 * $Id: MessageSchemaRawEO.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Dec 12, 2008 
 */

package com.headstrong.teevra.services.schema.eo;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * EO corresponds to the 'Message_Schema_Raw' table. This table holds the raw
 * data like formatted text of the schemas
 * 
 */
@Entity
@Table(name = "message_schema_raw")
public class MessageSchemaRawEO implements Serializable {

	/**
	 * default serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Unique identifier and also the Id of the schema to which the raw data
	 * belongs to
	 */
	private long schemaId = 0;
	/**
	 * Formatted(HTML) text of the schema
	 */
	private String schemaFormattedText = null;
	/**
	 * User name who created the raw data
	 */
	private String createdBy = System.getProperty("user.name");
	/**
	 * Time when created the raw data
	 */
	private Timestamp createdDate = new Timestamp(System.currentTimeMillis());
	/**
	 * User name who modified the raw data
	 */
	private String modifiedBy = System.getProperty("user.name");
	/**
	 * Time when modified the raw data
	 */
	private Timestamp modifiedDate = new Timestamp(System.currentTimeMillis());

	/**
	 * @return the schemaId
	 */
	@Id
	@Column(name = "schema_id", nullable = true)
	public long getSchemaId() {
		return schemaId;
	}

	/**
	 * @param schemaId
	 *            the schemaId to set
	 */
	public void setSchemaId(long schemaId) {
		this.schemaId = schemaId;
	}

	/**
	 * @return the schemaFormattedText
	 */
	@Column(name = "schema_formatted_text", nullable = true)
	public String getSchemaFormattedText() {
		return schemaFormattedText;
	}

	/**
	 * @param schemaFormattedText
	 *            the schemaFormattedText to set
	 */
	public void setSchemaFormattedText(String schemaFormattedText) {
		this.schemaFormattedText = schemaFormattedText;
	}

	/**
	 * @return the createdBy
	 */
	@Column(name = "created_by", length = 50, nullable = false)
	public String getCreatedBy() {
		return createdBy;
	}

	/**
	 * @param createdBy
	 *            the createdBy to set
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	/**
	 * @return the createdDate
	 */
	@Column(name = "created_date", nullable = false)
	public Timestamp getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate
	 *            the createdDate to set
	 */
	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * @return the modifiedBy
	 */
	@Column(name = "modified_by", length = 50, nullable = true)
	public String getModifiedBy() {
		return modifiedBy;
	}

	/**
	 * @param modifiedBy
	 *            the modifiedBy to set
	 */
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	/**
	 * @return the modifiedDate
	 */
	@Column(name = "modified_date", nullable = true)
	public Timestamp getModifiedDate() {
		return modifiedDate;
	}

	/**
	 * @param modifiedDate
	 *            the modifiedDate to set
	 */
	public void setModifiedDate(Timestamp modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	/**
	 * String representation of the MessageSchemaEO
	 * 
	 * @precondition
	 * @postcondition
	 * @return the string
	 */
	public String toString() {
		StringBuffer str = new StringBuffer();
		str.append("< SchemaId= ");
		str.append(this.getSchemaId());
		str.append(", SchemaFormattedText= ");
		str.append(this.getSchemaFormattedText());
		str.append(">");
		return str.toString();
	}
}
