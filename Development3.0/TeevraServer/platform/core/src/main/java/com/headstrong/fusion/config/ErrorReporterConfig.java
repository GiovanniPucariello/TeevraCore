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

import java.util.Map;

/**
 * Class represents configuration for Error Handlers.
 */
public class ErrorReporterConfig implements EndPointConfig {

	/**
	 * Serial version UID
	 */
	private static final long serialVersionUID = 4848772604261901263L;

	// fully qualified name to identify the
	// actual mediation service in the OSGI
	// context.
	private String type;

	// To uniquely identify a Error Handler in the
	// process as the same component can be
	// part of multiple route.
	private String id;

	// A map of properties required to initialize the
	// Error Handler..
	private Map<String, String> properties;

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

}
