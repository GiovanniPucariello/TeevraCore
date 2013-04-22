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
 * $Id: MediatorConfig.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Sep 4, 2008 
 */

package com.headstrong.fusion.config;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConnectorConfig implements EndPointConfig {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4172999695067678361L;

	// fully qualified name to identify the 
	// actual mediation service in the OSGI
	// context.
	private String type;

	// To uniquely identify a Endpoint in the 
	// process as the same component can be 
	// part of multiple route. 
	private String id;

	// A map of properties required to initialize the
	// Endpoint.
	private Map<String, String> properties;
	
	/**
	 * values IN , OUT , IN/OUT
	 */
	private String mode;
	
	/**
	 * Configuration for Error / Exception events.
	 */
	private List<OnErrorConfig> errorConfigList;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Map<String, String> getProperties() {
		return properties;
	}

	public void setProperties(Map<String, String> properties) {
		this.properties = properties;
	}

	/**
	 * @return the mode
	 */
	public String getMode() {
		return mode;
	}

	/**
	 * @param mode the mode to set
	 */
	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getProperty(String key)
	{
		return properties.get(key);
	}
	
	public void setProperty(String key, String value)
	{
		if(properties==null) {
			properties=new HashMap<String, String>();
		}
		properties.put(key, value);
	}
	
	public boolean containsKey(String key) {
		return properties.containsKey(key);
	}

	/**
	 * @return the errorConfigList
	 */
	public List<OnErrorConfig> getErrorConfigList() {
		return errorConfigList;
	}

	/**
	 * @param errorConfigList the errorConfigList to set
	 */
	public void setErrorConfigList(List<OnErrorConfig> errorConfigList) {
		this.errorConfigList = errorConfigList;
	}

}
