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
 * $Id: ProcessServiceConfigurationEO.java
 * $Revision: 
 * $Author: Akrishnamoorthy
 * $DateTime: Nov 25, 2008 
 */

package com.headstrong.teevra.services.process.eo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

/**
 * EO corresponds to the 'Process_Service_Configuration' table
 */

@Entity
@Table(name = "process_service_configuration")
@IdClass(ProcessServiceConfigurationPK.class)
public class ProcessServiceConfigurationEO implements Serializable {

	/**
	 * Serial Version UID
	 */
	private static final long serialVersionUID = -6777888436683305567L;

	/**
	 * identifier for a process
	 */
	private Long prcsId;

	/**
	 * Service id for the component
	 */
	private String serviceId;

	/**
	 * Identifier for the component
	 */
	private String configKey;

	/**
	 * Simple config value that needs to be inlined in PCM
	 */
	private String simpleValue;

	/**
	 * Complex config value which is XML
	 */
	private String complexValue;

	/**
	 * Identifies the type of component (server alias) this service instance
	 * refers to
	 */
	private String serviceType;

	/**
	 * @return the prcsId
	 */
	@Id
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
	 * @return the serviceId
	 */
	@Id
	@Column(name = "service_id", nullable = true)
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
	 * @return the configKey
	 */
	@Id
	@Column(name = "property_id", nullable = false)
	public String getConfigKey() {
		return configKey;
	}

	/**
	 * @param configKey
	 *            the configKey to set
	 */
	public void setConfigKey(String configKey) {
		this.configKey = configKey;
	}

	/**
	 * @return the simpleValue
	 */
	@Column(name = "property_simple_config", nullable = true)
	public String getSimpleValue() {
		return simpleValue;
	}

	/**
	 * @param simpleValue
	 *            the simpleValue to set
	 */
	public void setSimpleValue(String simpleValue) {
		this.simpleValue = simpleValue;
	}

	/**
	 * @return the complexValue
	 */
	@Column(name = "property_config", nullable = true)
	public String getComplexValue() {
		return complexValue;
	}

	/**
	 * @param complexValue
	 *            the complexValue to set
	 */
	public void setComplexValue(String complexValue) {
		this.complexValue = complexValue;
	}

	/**
	 * @return the serviceType
	 */
	@Column(name = "service_type")
	public String getServiceType() {
		return serviceType;
	}

	/**
	 * @param serviceType
	 *            the serviceType to set
	 */
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
}
