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
 * $Id: ServerConfigEO.java
 * $Revision: 
 * $Author: viswanathp
 * $DateTime: Feb 10, 2009 
 */

package com.headstrong.teevra.services.serveradmin.eo;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.UniqueConstraint;

/**
 * EO corresponds to the 'server_configuration' table which holds the details
 * about the configurations of the servers
 */
@Entity
@Table(name = "server_configuration", uniqueConstraints = { @UniqueConstraint(columnNames = { "server_name" }) })
public class ServerConfigEO implements Serializable {

	/**
	 * Generated Serial version UID
	 */
	private static final long serialVersionUID = -2781608907964531125L;

	/**
	 * Unique identifier for a server
	 */
	private Long serverId;
	/**
	 * Unique name for the server
	 */
	private String serverName;
	/**
	 * URL of the server
	 */
	private String serverUrl;
	/**
	 * User name who created the Server Configuration
	 */
	private String createdBy;
	/**
	 * Time when created the Server Configuration
	 */
	private Timestamp createdDate;
	/**
	 * User name who modified the Server Configuration
	 */
	private String modifiedBy;
	/**
	 * Time when modified the Server Configuration
	 */
	private Timestamp modifiedDate;
	/**
	 * One-to-many Association of processes with the server
	 */
	private List<ProcessServerEO> prcsServerMappings;

	/**
	 * @return the serverId
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "id_gen")
	@TableGenerator(name = "id_gen", table = "teevra_sequence", pkColumnName = "table_name", valueColumnName = "seq_value", allocationSize = 1)
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
	 * @return the serverName
	 */
	@Column(name = "server_name", length = 50, nullable = false)
	public String getServerName() {
		return serverName;
	}

	/**
	 * @param serverName
	 *            the serverName to set
	 */
	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	/**
	 * @return the serverUrl
	 */
	@Column(name = "server_url", length = 100, nullable = false)
	public String getServerUrl() {
		return serverUrl;
	}

	/**
	 * @param serverUrl
	 *            the serverUrl to set
	 */
	public void setServerUrl(String serverUrl) {
		this.serverUrl = serverUrl;
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
	 * @return the prcsServerMappings
	 */
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
	@JoinColumn(name = "server_id", insertable = false, updatable = false)
	public List<ProcessServerEO> getPrcsServerMappings() {
		return prcsServerMappings;
	}

	/**
	 * @param prcsServerMappings
	 *            the prcsServerMappings to set
	 */
	public void setPrcsServerMappings(List<ProcessServerEO> prcsServerMappings) {
		this.prcsServerMappings = prcsServerMappings;
	}

	/**
	 * String representation of the ServerConfigEO
	 * 
	 * @precondition
	 * @postcondition
	 * @return the string
	 */
	public String toString() {
		StringBuffer str = new StringBuffer();
		str.append("<Server Id= ");
		str.append(this.getServerId());
		str.append(", Server Name= ");
		str.append(this.getServerName());
		str.append(", Server URL= ");
		str.append(this.getServerUrl());
		str.append(">");
		return str.toString();

	}
}
