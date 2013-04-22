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
 * $Id: CacheReloadScheduler.java
 * $Revision: 
 * $Author: NBagchi
 * $DateTime: Sept 15, 2010 
 */

package com.headstrong.fusion.scheduler;

import com.headstrong.fusion.config.CacheReloadSchedule;


/**
 * 
 */
public interface CacheReloadScheduler extends Scheduler {

	public static final String RELOAD_SCHEDULE = "RELOAD_SCHEDULE";

	/**
	 * Schedules reloading of cache.
	 * 
	 * @precondition
	 * @postcondition
	 * @param schedule
	 */
	public void scheduleCacheReload(CacheReloadSchedule schedule)
			throws Exception;

	/**
	 * Updates the schedule.
	 * 
	 * @precondition
	 * @postcondition
	 * @param schedule
	 */
	public void updateCacheReloadSchedule(CacheReloadSchedule schedule)
			throws Exception;

	/**
	 * Remove scheduling.
	 * 
	 * @precondition
	 * @postcondition
	 * @param schedule
	 * @throws Exception
	 */
	public void unscheduleCacheReloadJob(CacheReloadSchedule schedule)
			throws Exception;

}
