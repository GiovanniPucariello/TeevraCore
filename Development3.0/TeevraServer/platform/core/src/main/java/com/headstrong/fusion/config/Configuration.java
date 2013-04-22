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
 * $Id: Configuration.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Oct 13, 2008 
 */

package com.headstrong.fusion.config;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.headstrong.fusion.config.manager.ConfigurationManager;
import com.headstrong.fusion.config.CacheReloadScheduleConfiguration;

/**
 * Represents Fusion framework configuration.
 * 
 */
public class Configuration implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Process ID v/s Process Configuration Map
	private List<ProcessConfiguration> processes;

	private List<CacheReloadScheduleConfiguration> cacheReloadConfigurations;

	/**
	 * @return the processes
	 */
	public List<ProcessConfiguration> getProcesses() {
		return processes;
	}

	/**
	 * @param processes
	 *            the processes to set
	 */
	public void setProcesses(List<ProcessConfiguration> processes) {
		this.processes = processes;
	}

	public void addProcess(ProcessConfiguration processConfiguration) {
		if (this.getProcesses() == null) {
			List<ProcessConfiguration> processes = new ArrayList<ProcessConfiguration>();
			this.setProcesses(processes);
		}
		this.getProcesses().add(processConfiguration);
	}

	/**
	 * @return the clusteredConfigurationHandler
	 */
	public String getStateHandler() {
		return ConfigurationManager.class.getName();
	}

	/**
	 * @param clusteredConfigurationHandler
	 *            the clusteredConfigurationHandler to set
	 */
	public void setClusteredConfigurationHandler(
			ConfigurationManager clusteredConfigurationHandler) {
	}

	/**
	 * Fetch all the cache reload scheduling configurations present.
	 * 
	 * @precondition
	 * @postcondition
	 * @return
	 */
	public List<CacheReloadScheduleConfiguration> getCacheReloadConfigurations() {
		return cacheReloadConfigurations;
	}

	/**
	 * Set the CacheReloadConfigurations
	 * 
	 * @param cacheReloadScheduleConfs
	 *            the configurations to set
	 */
	public void setCacheReloadConfigurations(
			List<CacheReloadScheduleConfiguration> cacheReloadScheduleConfs) {
		this.cacheReloadConfigurations = cacheReloadScheduleConfs;
	}

	/**
	 * Add a cache reload schedule configuration
	 * 
	 * @param cacheReloadScheduleConf
	 */
	public void addCacheReloadScheduleConfiguration(
			CacheReloadScheduleConfiguration cacheReloadScheduleConf) {
		if (getCacheReloadConfigurations() == null) {
			setCacheReloadConfigurations(new ArrayList<CacheReloadScheduleConfiguration>());
		}
		getCacheReloadConfigurations().add(cacheReloadScheduleConf);
	}

}
