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
 * $Id: FusionConfigurationBuilder.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Oct 13, 2008 
 */

package com.headstrong.fusion.config.manager;

import com.headstrong.fusion.commons.exception.ConfigurationException;
import com.headstrong.fusion.config.Configuration;
import com.headstrong.fusion.config.ProcessConfiguration;
import com.headstrong.fusion.config.CacheReloadScheduleConfiguration;

/**
 * Manages Fusion Configuration.
 * 
 */
public interface ConfigurationManager {

	public Configuration getConfiguration();

	public void setConfiguration(Configuration configuration);
	/**
	 * Initializes the Fusion Configuration.
	 * 
	 * @throws ConfigurationException
	 */
	public void refresh() throws ConfigurationException;

	/**
	 * Marshals the Fusion Configuration
	 * 
	 * @param pcm
	 *            an instance of ProcessConfigurationModel
	 * @param marshalled
	 *            file to store the marshalled data
	 * @return the file with marshalled data.
	 * @throws ConfigurationException
	 */
	public void persist() throws ConfigurationException;

	/**
	 * 
	 * Utility method returns the local process configuration.
	 * 
	 * @param processId
	 * @return {@link ProcessConfiguration}
	 * 
	 */
	public ProcessConfiguration getProcessConfiguration(String processId);

	/**
	 * Fetch the local Cache Reload configuration, of the given cache.
	 *
	 * @precondition
	 * @postcondition 	
	 * @param cacheName
	 * @return
	 */
	public CacheReloadScheduleConfiguration getCacheReloadScheduleConfiguration(
			String cacheName);
	
}
