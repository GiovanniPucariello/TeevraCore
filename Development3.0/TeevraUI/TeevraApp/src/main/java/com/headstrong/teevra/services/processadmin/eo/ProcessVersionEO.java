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
 * $Id: ProcessVersion.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Oct 3, 2008 
 */

package com.headstrong.teevra.services.processadmin.eo;

import java.io.Serializable;
import java.sql.Clob;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

/**
 * EO corresponds to the 'Process_Version' table. this table holds configuration
 * items of a process whose changes need to be tracked.
 */
@Entity
@Table(name = "process_version")
public class ProcessVersionEO implements Serializable {
	/**
	 * default serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Unique identifier for the process version
	 */
	private long prcsVerId = 0;
	/**
	 * Associates the process version to the process
	 */
	private long prcsId = 0;
	/**
	 * Name of the process version
	 */
	private String prcsVerName = null;
	/**
	 * Process model
	 */
	private Clob prcsModel = null;
	/**
	 * Process graph image
	 */
	private Clob prcsGraph = null;
	/**
	 * User name who created the process version
	 */
	private String createdBy = System.getProperty("user.name");
	/**
	 * Time when created the process version
	 */
	private Timestamp createdDate = new Timestamp(System.currentTimeMillis());
	/**
	 * User name who modified the process version
	 */
	private String modifiedBy = System.getProperty("user.name");
	/**
	 * Time when modified the process version
	 */
	private Timestamp modifiedDate = new Timestamp(System.currentTimeMillis());

	/**
	 * @return the prcsVerId
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "id_gen")
	@TableGenerator(name = "id_gen", table = "teevra_sequence", pkColumnName = "table_name", valueColumnName = "seq_value", allocationSize = 1)
	@Column(name = "prcs_ver_id", nullable = true)
	public long getPrcsVerId() {
		return prcsVerId;
	}

	/**
	 * @param prcsVerId
	 *            the prcsVerId to set
	 */
	public void setPrcsVerId(long prcsVerId) {
		this.prcsVerId = prcsVerId;
	}

	/**
	 * @return the prcsId
	 */
	@Column(name = "prcs_id", nullable = false)
	public long getPrcsId() {
		return prcsId;
	}

	/**
	 * @param prcsId
	 *            the prcsId to set
	 */
	public void setPrcsId(long prcsId) {
		this.prcsId = prcsId;
	}

	/**
	 * @return the prcsVerName
	 */
	@Column(name = "prcs_ver_name", length = 50, nullable = true)
	public String getPrcsVerName() {
		return prcsVerName;
	}

	/**
	 * @param prcsVerName
	 *            the prcsVerName to set
	 */
	public void setPrcsVerName(String prcsVerName) {
		this.prcsVerName = prcsVerName;
	}

	/**
	 * @return the prcsModel
	 */
	@Column(name = "prcs_model", nullable = true)
	public Clob getPrcsModel() {
		return prcsModel;
	}

	/**
	 * @param prcsModel
	 *            the prcsModel to set
	 */
	public void setPrcsModel(Clob prcsModel) {
		this.prcsModel = prcsModel;
	}

	/**
	 * @return the prcsGraph
	 */
	@Column(name = "prcs_graph", nullable = true)
	public Clob getPrcsGraph() {
		return prcsGraph;
	}

	/**
	 * @param prcsGraph
	 *            the prcsGraph to set
	 */
	public void setPrcsGraph(Clob prcsGraph) {
		this.prcsGraph = prcsGraph;
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
