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
import javax.persistence.Embeddable;

/**
 * Primary key for ProcessServiceConfiguration
 */

@Embeddable
public class ProcessServiceConfigurationPK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7543618018599867384L;

	/**
	 * identifier for a process
	 */
	private Long prcsId;
	
	/**
	 * Identifier for the component instance within the process
	 */
	private String serviceId;
	
	/**
	 * Identifier for the component
	 */
	private String configKey;
	
	/**
	 * @return the prcsId
	 */
	@Column(name = "prcs_id", nullable = false)
	public Long getPrcsId() {
		return prcsId;
	}

	/**
	 * @param prcsId the prcsId to set
	 */
	public void setPrcsId(Long prcsId) {
		this.prcsId = prcsId;
	}

	/**
	 * @return the serviceId
	 */
	@Column(name = "service_id", nullable = true)
	public String getServiceId() {
		return serviceId;
	}

	/**
	 * @param serviceId the serviceId to set
	 */
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	/**
	 * @return the configKey
	 */
	@Column(name = "property_id", nullable = false)
	public String getConfigKey() {
		return configKey;
	}

	/**
	 * @param configKey the configKey to set
	 */
	public void setConfigKey(String configKey) {
		this.configKey = configKey;
	}
}
