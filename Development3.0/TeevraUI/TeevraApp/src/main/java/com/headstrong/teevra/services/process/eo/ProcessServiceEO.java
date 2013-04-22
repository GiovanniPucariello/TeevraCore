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
 * $Id: Process.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Oct 3, 2008 
 */

package com.headstrong.teevra.services.process.eo;

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
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

/**
 * EO corresponds to the 'Process_Component' table
 */

@Entity
@Table(name = "process_component")
public class ProcessServiceEO implements Serializable {
	/**
	 * default serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Unique identifier for a component instance in process
	 */
	private Long prcsCompId;

	/**
	 * identifier for a process
	 */
	private Long prcsId;

	/**
	 * Identifier for the component
	 */
	private Long compId;

	/**
	 * Service id for the component that is unique within a process model
	 */
	private String serviceId;
	
	/**
	 * Error strategy for business error
	 */
	private String businessErrorStrategy;
	
	/**
	 * Error strategy for system error
	 */
	private String systemErrorStrategy;
	

	/**
	 * User name who created the Process
	 */
	private String createdBy = System.getProperty("user.name");

	/**
	 * Time when created the Process
	 */
	private Timestamp createdDate = new Timestamp(System.currentTimeMillis());

	/**
	 * User name who modified the Process
	 */
	private String modifiedBy = System.getProperty("user.name");

	/**
	 * Time when modified the Process
	 */
	private Timestamp modifiedDate = new Timestamp(System.currentTimeMillis());

	/**
	 * Process model graph
	 */
	private List<ProcessServiceConfigurationEO> configurations;

	/**
	 * @return the prcsCompId
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "id_gen")
	@TableGenerator(name = "id_gen", table = "teevra_sequence", pkColumnName = "table_name", valueColumnName = "seq_value", allocationSize = 1)
	@Column(name = "prcs_comp_id", nullable = false)
	public Long getPrcsCompId() {
		return prcsCompId;
	}

	/**
	 * @param prcsCompId
	 *            the prcsCompId to set
	 */
	public void setPrcsCompId(Long prcsCompId) {
		this.prcsCompId = prcsCompId;
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
	 * @return the compId
	 */
	@Column(name = "comp_id", nullable = false)
	public Long getCompId() {
		return compId;
	}

	/**
	 * @param compId
	 *            the compId to set
	 */
	public void setCompId(Long compId) {
		this.compId = compId;
	}

	/**
	 * @return the serviceId
	 */
	@Column(name = "comp_instance_id", nullable = false)
	public String getServiceId() {
		return serviceId;
	}

	/**
	 * @param serviceId
	 *            the serviceId to set
	 */
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	/**
	 * @return the createdBy
	 */
	@Column(name = "created_by")
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
	@Column(name = "created_date")
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
	@Column(name = "modified_by")
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
	@Column(name = "modified_date")
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
	 * @return the configurations
	 */
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
	@JoinColumns( {
			@JoinColumn(name = "prcs_id", referencedColumnName = "prcs_id"),
			@JoinColumn(name = "comp_instance_id", referencedColumnName = "service_id") })
	public List<ProcessServiceConfigurationEO> getConfigurations() {
		return configurations;
	}

	/**
	 * @param configurations
	 *            the configurations to set
	 */
	public void setConfigurations(
			List<ProcessServiceConfigurationEO> configurations) {
		this.configurations = configurations;
	}

	/**
	 * @return the businessErrorStrategy
	 */
	public String getBusinessErrorStrategy() {
		return businessErrorStrategy;
	}

	/**
	 * @param businessErrorStrategy the businessErrorStrategy to set
	 */
	public void setBusinessErrorStrategy(String businessErrorStrategy) {
		this.businessErrorStrategy = businessErrorStrategy;
	}

	/**
	 * @return the systemErrorStrategy
	 */
	public String getSystemErrorStrategy() {
		return systemErrorStrategy;
	}

	/**
	 * @param systemErrorStrategy the systemErrorStrategy to set
	 */
	public void setSystemErrorStrategy(String systemErrorStrategy) {
		this.systemErrorStrategy = systemErrorStrategy;
	}
}
