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
 * $Id: ProcessComponent.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Oct 3, 2008 
 */

package com.headstrong.teevra.services.component.eo;

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
 * EO corresponds to the 'Process_Component' table. This table holds the
 * dependencies of processes on the components. This is always derived from the
 * process configuration model and contains information only about the latest
 * version of the process.
 */
@Entity
@Table(name = "process_component", uniqueConstraints = { @UniqueConstraint(columnNames = {
		"prcs_id", "comp_id", "comp_instance_id" }) })
public class ProcessComponentEO implements Serializable {
	/**
	 * default serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Uniquely identifies the component instance to a process
	 */
	private long prcsCompId = 0;
	/**
	 * Associates the component instance to a process
	 */
	private long prcsId = 0;
	/**
	 * Parent component?s id whose instance is associated with the process
	 */
	private long compId = 0;
	/**
	 * Uniquely identifies the component in the process (configuration model).
	 * It is not unique across processes
	 */
	private String compInstanceId = null;
	/**
	 * Number of instances of this component are there in the process
	 */
	private int numInstances = 0;
	/**
	 * User name who created the ProcessComponent
	 */
	private String createdBy = System.getProperty("user.name");
	/**
	 * Time when created the ProcessComponent
	 */
	private Timestamp createdDate = new Timestamp(System.currentTimeMillis());
	/**
	 * User name who modified the ProcessComponent
	 */
	private String modifiedBy = System.getProperty("user.name");
	/**
	 * Time when modified the ProcessComponent
	 */
	private Timestamp modifiedDate = new Timestamp(System.currentTimeMillis());

	/**
	 * @return the prcsCompId
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "id_gen")
	@TableGenerator(name = "id_gen", table = "teevra_sequence", pkColumnName = "table_name", valueColumnName = "seq_value", allocationSize = 1)
	@Column(name = "prcs_comp_id", nullable = true)
	public long getPrcsCompId() {
		return prcsCompId;
	}

	/**
	 * @param prcsCompId
	 *            the prcsCompId to set
	 */
	public void setPrcsCompId(long prcsCompId) {
		this.prcsCompId = prcsCompId;
	}

	/**
	 * @return the prcsId
	 */
	@Column(name = "prcs_id", nullable = true)
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
	 * @return the compId
	 */
	@Column(name = "comp_id", nullable = true)
	public long getCompId() {
		return compId;
	}

	/**
	 * @param compId
	 *            the compId to set
	 */
	public void setCompId(long compId) {
		this.compId = compId;
	}

	/**
	 * @return the compInstanceId
	 */
	@Column(name = "comp_instance_id", length = 50, nullable = true)
	public String getCompInstanceId() {
		return compInstanceId;
	}

	/**
	 * @param compInstanceId
	 *            the compInstanceId to set
	 */
	public void setCompInstanceId(String compInstanceId) {
		this.compInstanceId = compInstanceId;
	}

	/**
	 * @return the numInstances
	 */
	@Column(name = "num_instances", nullable = true)
	public int getNumInstances() {
		return numInstances;
	}

	/**
	 * @param numInstances
	 *            the numInstances to set
	 */
	public void setNumInstances(int numInstances) {
		this.numInstances = numInstances;
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
