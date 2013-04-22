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
 * $Id: MessageSchemaAttrPersistMap.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Oct 3, 2008 
 */

package com.headstrong.teevra.services.schema.eo;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * EO corresponds to the 'Message_Schema_Attr_Persist_Map' table. By default,
 * attribute names directly map to a column name. This table needs to be used if
 * there are exceptions.
 */
@Entity
@Table(name = "message_schema_attr_persist_map")
public class MessageSchemaAttrPersistMapEO implements Serializable {
	/**
	 * default serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Unique identifier for the attribute persist map that associates to
	 * attribute
	 */
	private long schemaAttrId = 0;
	/**
	 * Table name it associates to
	 */
	private String tableName = null;
	/**
	 * Column name in the table it associates to
	 */
	private String columnName = null;
	/**
	 * User name who created the attribute persist map
	 */
	private String createdBy = System.getProperty("user.name");
	/**
	 * Time when created the attribute persist map
	 */
	private Timestamp createdDate = new Timestamp(System.currentTimeMillis());
	/**
	 * User name who modified the attribute persist map
	 */
	private String modifiedBy = System.getProperty("user.name");
	/**
	 * Time when modified the attribute persist map
	 */
	private Timestamp modifiedDate = new Timestamp(System.currentTimeMillis());

	/**
	 * @return the schemaAttrId
	 */
	@Id
	@Column(name = "schema_attr_id", nullable = true)
	public long getSchemaAttrId() {
		return schemaAttrId;
	}

	/**
	 * @param schemaAttrId
	 *            the schemaAttrId to set
	 */

	public void setSchemaAttrId(long schemaAttrId) {
		this.schemaAttrId = schemaAttrId;
	}

	/**
	 * @return the tableName
	 */
	@Column(name = "table_name", length = 50, nullable = true)
	public String getTableName() {
		return tableName;
	}

	/**
	 * @param tableName
	 *            the tableName to set
	 */

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	/**
	 * @return the columnName
	 */
	@Column(name = "column_name", length = 50, nullable = true)
	public String getColumnName() {
		return columnName;
	}

	/**
	 * @param columnName
	 *            the columnName to set
	 */

	public void setColumnName(String columnName) {
		this.columnName = columnName;
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

}
