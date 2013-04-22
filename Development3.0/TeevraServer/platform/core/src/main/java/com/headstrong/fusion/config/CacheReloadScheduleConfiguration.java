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
 * $Id: CacheReloadScheduleConfiguration.java
 * $Revision: 
 * $Author: NBagchi
 * $DateTime: Sept 15, 2010 
 */

package com.headstrong.fusion.config;

import java.io.Serializable;


/**
 * Represents Cache Reload Schedule configuration.
 * 
 */
public class CacheReloadScheduleConfiguration implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The cache name.
	 */
	private String cacheName;

	private boolean running;

	private CacheReloadSchedule schedule;

	/**
	 * @return the cacheName
	 */
	public String getCacheName() {
		return cacheName;
	}

	/**
	 * @param cacheName
	 * 			 the cacheName to set
	 */
	public void setCacheName(String cacheName) {
		this.cacheName = cacheName;
	}

	/**
	 * @return the schedule
	 */
	public CacheReloadSchedule getSchedule() {
		return schedule;
	}

	/**
	 * @param schedule 
	 * 				the schedule to set
	 */
	public void setSchedule(CacheReloadSchedule schedule) {
		this.schedule = schedule;
	}

	/**
	 * @return the running
	 */
	public boolean isRunning() {
		return running;
	}

	/**
	 * @param running the running to set
	 */
	public void setRunning(boolean running) {
		this.running = running;
	}

}
