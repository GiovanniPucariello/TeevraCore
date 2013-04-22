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
 * $Id: ProcessVersionEO.java
 * $Revision: 
 * $Author: Akrishnamoorthy
 * $DateTime: Nov 26, 2008 
 */

package com.headstrong.teevra.services.process.eo;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

/**
 * EO corresponds to the 'Process_Version' table for process versioning. It
 * holds configuration items of a process whose changes need to be tracked.
 */

@Entity
@Table(name = "process_version")
public class ProcessVersionEO implements Serializable {

	/**
	 * Serial Version UID
	 */
	private static final long serialVersionUID = 6680626749508791779L;

	/**
	 * Unique identifier for a process version
	 */
	private Long prcsVersionId;

	/**
	 * Identifier for a process
	 */
	private Long prcsId;

	/**
	 * Name specified by user for the process version
	 */
	private String prcsVersionName = null;

	/**
	 * User name who created this version
	 */
	private String createdBy = System.getProperty("user.name");

	/**
	 * Time when created this version
	 */
	private Timestamp createdDate = new Timestamp(System.currentTimeMillis());

	/**
	 * User name who modified this version
	 */
	private String modifiedBy = System.getProperty("user.name");

	/**
	 * Time when modified this version
	 */
	private Timestamp modifiedDate = new Timestamp(System.currentTimeMillis());

	/**
	 * Process model graph
	 */
	private String graph;

	/**
	 * @return the prcsId
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "id_gen")
	@TableGenerator(name = "id_gen", table = "teevra_sequence", pkColumnName = "table_name", valueColumnName = "seq_value", allocationSize = 1)
	@Column(name = "prcs_ver_id", nullable = false)
	public long getPrcsVersionId() {
		return prcsVersionId;
	}

	/**
	 * @param prcsId
	 *            the prcsId to set
	 */
	public void setPrcsVersionId(Long prcsVersionId) {
		this.prcsVersionId = prcsVersionId;
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
	 * @return the prcsVersionName
	 */
	@Column(name = "prcs_ver_name", length = 50, nullable = false)
	public String getPrcsVersionName() {
		return prcsVersionName;
	}

	/**
	 * @param prcsVersionName
	 *            the prcsVersionName to set
	 */
	public void setPrcsName(String prcsVersionName) {
		this.prcsVersionName = prcsVersionName;
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
	 * @return the graph
	 */
	public String getGraph() {
		return graph;
	}

	/**
	 * @param graph
	 *            the graph to set
	 */
	public void setGraph(String graph) {
		this.graph = graph;
	}

}
