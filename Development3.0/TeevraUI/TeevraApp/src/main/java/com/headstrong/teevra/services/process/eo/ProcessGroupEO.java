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
 * $Id: ProcessGroup.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Oct 3, 2008 
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
 * EO corresponds to the 'Process_Group' table, which logically group processes.
 * This can be used for various aspects like namespace, visibility, access
 * control
 */
@Entity
@Table(name = "process_group")
public class ProcessGroupEO implements Serializable {
	/**
	 * default serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Unique identifier for a process group
	 */
	private long prcsGrpId = 0;
	/**
	 * Name of the process group
	 */
	private String prcsGrpName = null;
	/**
	 * Description of the process group
	 */
	private String prcsGrpDesc = null;
	/**
	 * User name who created the ProcessGroup
	 */
	private String createdBy = System.getProperty("user.name");
	/**
	 * Time when created the ProcessGroup
	 */
	private Timestamp createdDate = new Timestamp(System.currentTimeMillis());
	/**
	 * User name who modified the ProcessGroup
	 */
	private String modifiedBy = System.getProperty("user.name");
	/**
	 * Time when modified the ProcessGroup
	 */
	private Timestamp modifiedDate = new Timestamp(System.currentTimeMillis());

	/**
	 * @return the prcsGrpId
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "id_gen")
	@TableGenerator(name = "id_gen", table = "teevra_sequence", pkColumnName = "table_name", valueColumnName = "seq_value", allocationSize = 1)
	@Column(name = "prcs_grp_id", nullable = true)
	public long getPrcsGrpId() {
		return prcsGrpId;
	}

	/**
	 * @param prcsGrpId
	 *            the prcsGrpId to set
	 */
	public void setPrcsGrpId(long prcsGrpId) {
		this.prcsGrpId = prcsGrpId;
	}

	/**
	 * @return the prcsGrpName
	 */
	@Column(name = "prcs_grp_name", length = 50, nullable = false)
	public String getPrcsGrpName() {
		return prcsGrpName;
	}

	/**
	 * @param prcsGrpName
	 *            the prcsGrpName to set
	 */
	public void setPrcsGrpName(String prcsGrpName) {
		this.prcsGrpName = prcsGrpName;
	}

	/**
	 * @return the prcsGrpDesc
	 */
	@Column(name = "prcs_grp_desc", length = 200, nullable = true)
	public String getPrcsGrpDesc() {
		return prcsGrpDesc;
	}

	/**
	 * @param prcsGrpDesc
	 *            the prcsGrpDesc to set
	 */
	public void setPrcsGrpDesc(String prcsGrpDesc) {
		this.prcsGrpDesc = prcsGrpDesc;
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
