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
 * $Id: ProcessServerEO.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Feb 11, 2009 
 */

package com.headstrong.teevra.services.serveradmin.eo;

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
 * EO corresponds to the 'Process_Server' table which holds the mapping between
 * a process and the server it is registered with
 */
@Entity
@Table(name = "process_server", uniqueConstraints = { @UniqueConstraint(columnNames = { "prcs_id" }) })
public class ProcessServerEO implements Serializable {

	/**
	 * Generated Serial version UID
	 */
	private static final long serialVersionUID = -3615918707942671640L;

	/**
	 * Unique identifier for the process-server mapping
	 */
	private Long prcsServerId;
	/**
	 * Associates the mapping with a process
	 */
	private Long prcsId;
	/**
	 * Associates the mapping with a server
	 */
	private Long serverId;
	/**
	 * User name who created the mapping
	 */
	private String createdBy;
	/**
	 * Time when created the mapping
	 */
	private Timestamp createdDate;
	/**
	 * User name who modified the mapping
	 */
	private String modifiedBy;
	/**
	 * Time when modified the mapping
	 */
	private Timestamp modifiedDate;

	/**
	 * @return the prcsServerId
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "id_gen")
	@TableGenerator(name = "id_gen", table = "teevra_sequence", pkColumnName = "table_name", valueColumnName = "seq_value", allocationSize = 1)
	@Column(name = "prcs_server_id", nullable = false)
	public Long getPrcsServerId() {
		return prcsServerId;
	}

	/**
	 * @param prcsServerId
	 *            the prcsServerId to set
	 */
	public void setPrcsServerId(Long prcsServerId) {
		this.prcsServerId = prcsServerId;
	}

	/**
	 * @return the prcsId
	 */
	@Column(name = "prcs_id", nullable = false)
	public Long getPrcsId() {
		return prcsId;
	}

	/**
	 * @param prcsId
	 *            the prcsId to set
	 */
	public void setPrcsId(Long prcsId) {
		this.prcsId = prcsId;
	}

	/**
	 * @return the serverId
	 */
	@Column(name = "server_id", nullable = false)
	public Long getServerId() {
		return serverId;
	}

	/**
	 * @param serverId
	 *            the serverId to set
	 */
	public void setServerId(Long serverId) {
		this.serverId = serverId;
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
	 * String representation of the ProcessServerEO
	 * 
	 * @precondition
	 * @postcondition
	 * @return the string
	 */
	public String toString() {
		StringBuffer str = new StringBuffer();
		str.append("<Process-Server Mapping Id= ");
		str.append(this.getPrcsServerId());
		str.append(", Process Id= ");
		str.append(this.getPrcsId());
		str.append(", Server Id= ");
		str.append(this.getServerId());
		str.append(">");
		return str.toString();

	}

}
