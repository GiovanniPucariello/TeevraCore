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
 * $Id: RefDataConfigEO.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Dec 24, 2008 
 */

package com.headstrong.teevra.services.refdata.eo;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;

/**
 * EO corresponds to the 'refdata_config' table
 */
@Entity
@Table(name = "refdata_config", uniqueConstraints = { @UniqueConstraint(columnNames = { "refdata_name" }) })
public class RefDataConfigEO implements Serializable {

	/**
	 * Default Serial version UID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Unique identifier for a refdata configuration
	 */
	private Long refDataId;
	/**
	 * Refdata name
	 */
	private String refDataName;
	/**
	 * Unique identifier of the dataSource it associates with
	 */
	private Long dataSourceId;
	/**
	 * Name of the dataSource it associates with
	 */
	private String dataSourceName;
	/**
	 * Query for the reference data
	 */
	private String refDataQuery;
	/**
	 * User name who created the Reference Data Configuration
	 */
	private String createdBy = System.getProperty("user.name");
	/**
	 * Time when created the Reference Data Configuration
	 */
	private Timestamp createdDate = new Timestamp(System.currentTimeMillis());
	/**
	 * User name who modified the Reference Data Configuration
	 */
	private String modifiedBy = System.getProperty("user.name");
	/**
	 * Time when modified the Reference Data Configuration
	 */
	private Timestamp modifiedDate = new Timestamp(System.currentTimeMillis());

	/**
	 * DataSource Configuration associates in Many-to-one fashion
	 */
	private DataSourceConfigEO dataSourceConfig;

	/**
	 * @return the refDataId
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "id_gen")
	@TableGenerator(name = "id_gen", table = "teevra_sequence", pkColumnName = "table_name", valueColumnName = "seq_value", allocationSize = 1)
	@Column(name = "refdata_id", nullable = false)
	public Long getRefDataId() {
		return refDataId;
	}

	/**
	 * @param refDataId
	 *            the refDataId to set
	 */
	public void setRefDataId(Long refDataId) {
		this.refDataId = refDataId;
	}

	/**
	 * @return the refDataName
	 */
	@Column(name = "refdata_name", length = 64, nullable = false)
	public String getRefDataName() {
		return refDataName;
	}

	/**
	 * @param refDataName
	 *            the refDataName to set
	 */
	public void setRefDataName(String refDataName) {
		this.refDataName = refDataName;
	}

	/**
	 * @return the dataSourceId
	 */
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
	@Transient
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
	 * @return the refDataQuery
	 */
	@Column(name = "refdata_query", length = 1024, nullable = false)
	public String getRefDataQuery() {
		return refDataQuery;
	}

	/**
	 * @param refDataQuery
	 *            the refDataQuery to set
	 */
	public void setRefDataQuery(String refDataQuery) {
		this.refDataQuery = refDataQuery;
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
	 * @return the dataSourceConfig
	 */
	@ManyToOne(cascade = { CascadeType.REFRESH, CascadeType.MERGE }, fetch = FetchType.EAGER, targetEntity = DataSourceConfigEO.class)
	@JoinColumn(name = "datasource_id", insertable = false, updatable = false)
	public DataSourceConfigEO getDataSourceConfig() {
		return dataSourceConfig;
	}

	/**
	 * @param dataSourceConfig
	 *            the dataSourceConfig to set
	 */
	public void setDataSourceConfig(DataSourceConfigEO dataSourceConfig) {
		this.dataSourceConfig = dataSourceConfig;
	}

	/**
	 * String representation of the RefDataConfigEO
	 * 
	 * @precondition
	 * @postcondition
	 * @return the string
	 */
	public String toString() {
		StringBuffer str = new StringBuffer();
		str.append("<Reference Id= ");
		str.append(this.getRefDataId());
		str.append(", Name= ");
		str.append(this.getRefDataName());
		str.append(", DataSource Id= ");
		str.append(this.getDataSourceId());
		str.append(", Name= ");
		str.append(this.getDataSourceName());
		str.append(", DataQuery= ");
		str.append(this.getRefDataQuery());
		str.append("/>");
		return str.toString();

	}

}
