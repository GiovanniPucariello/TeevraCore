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
 * $Id: DatasourceConfigEO.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Dec 24, 2008 
 */

package com.headstrong.teevra.services.refdata.eo;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.UniqueConstraint;

/**
 * EO corresponds to the 'datasource_config' table
 */
@Entity
@Table(name = "datasource_config", uniqueConstraints = { @UniqueConstraint(columnNames = { "datasource_name" }) })
public class DataSourceConfigEO implements Serializable {

	/**
	 * Default Serial version UID
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Unique identifier for a Data source configuration
	 */
	private Long dataSourceId;
	/**
	 * Data source name
	 */
	private String dataSourceName;
	/**
	 * URL of the data base
	 */
	private String dbUrl;
	/**
	 * Data base user name
	 */
	private String dbUsername;
	/**
	 * Data base password
	 */
	private String dbPassword;
	/**
	 * Type of the data base
	 */
	private String dbType;
	/**
	 * User name who created the Data Source Configuration
	 */
	private String createdBy = System.getProperty("user.name");
	/**
	 * Time when created the Process
	 */
	private Timestamp createdDate = new Timestamp(System.currentTimeMillis());
	/**
	 * User name who modified the Data Source Configuration
	 */
	private String modifiedBy = System.getProperty("user.name");
	/**
	 * Time when modified the Data Source Configuration
	 */
	private Timestamp modifiedDate = new Timestamp(System.currentTimeMillis());

	/**
	 * @return the dataSourceId
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "id_gen")
	@TableGenerator(name = "id_gen", table = "teevra_sequence", pkColumnName = "table_name", valueColumnName = "seq_value", allocationSize = 1)
	@Column(name = "datasource_id", nullable = false)
	public Long getDataSourceId() {
		return dataSourceId;
	}

	/**
	 * @param dataSourceId
	 *            the dataSourceId to set
	 */
	public void setDataSourceId(Long dataSourceId) {
		this.dataSourceId = dataSourceId;
	}

	/**
	 * @return the dataSourceName
	 */
	@Column(name = "datasource_name", length = 64, nullable = false)
	public String getDataSourceName() {
		return dataSourceName;
	}

	/**
	 * @param dataSourceName
	 *            the dataSourceName to set
	 */
	public void setDataSourceName(String dataSourceName) {
		this.dataSourceName = dataSourceName;
	}

	/**
	 * @return the dbUrl
	 */
	@Column(name = "db_url", length = 256, nullable = false)
	public String getDbUrl() {
		return dbUrl;
	}

	/**
	 * @param dbUrl
	 *            the dbUrl to set
	 */
	public void setDbUrl(String dbUrl) {
		this.dbUrl = dbUrl;
	}

	/**
	 * @return the dbUsername
	 */
	@Column(name = "db_username", length = 64, nullable = false)
	public String getDbUsername() {
		return dbUsername;
	}

	/**
	 * @param dbUsername
	 *            the dbUsername to set
	 */
	public void setDbUsername(String dbUsername) {
		this.dbUsername = dbUsername;
	}

	/**
	 * @return the dbPassword
	 */
	@Column(name = "db_password", length = 64, nullable = false)
	public String getDbPassword() {
		return dbPassword;
	}

	/**
	 * @param dbPassword
	 *            the dbPassword to set
	 */
	public void setDbPassword(String dbPassword) {
		this.dbPassword = dbPassword;
	}

	/**
	 * @return the dbType
	 */
	@Column(name = "db_type", length = 64, nullable = false)
	public String getDbType() {
		return dbType;
	}

	/**
	 * @param dbType
	 *            the dbType to set
	 */
	public void setDbType(String dbType) {
		this.dbType = dbType;
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
	 * String representation of the DataSourceConfigEO
	 * 
	 * @precondition
	 * @postcondition
	 * @return the string
	 */
	public String toString() {
		StringBuffer str = new StringBuffer();
		str.append("< DataSource Id= ");
		str.append(this.getDataSourceId());
		str.append(", Name= ");
		str.append(this.getDataSourceName());
		str.append(", DB Url= ");
		str.append(this.getDbUrl());
		str.append(", Username= ");
		str.append(this.getDbUsername());
		str.append(", Password= ");
		str.append(this.getDbPassword());
		str.append(", Type= ");
		str.append(this.getDbType());
		str.append("/>");
		return str.toString();

	}
}
