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
 * $Id: SavepointConfig.java
 * $Revision: 
 * $Author: MBafna
 * $DateTime: Dec 23, 2008 
 */

package com.headstrong.fusion.config;

/**
 * Configuration class for savepoint
 */
public class SavepointConfig implements RouterConfig {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Savepoint id. (Also the name)
	 */
	private String id;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	
}
