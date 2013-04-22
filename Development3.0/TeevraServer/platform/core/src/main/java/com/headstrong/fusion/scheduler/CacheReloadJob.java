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
 * $Id: CacheReloadJob.java
 * $Revision: 
 * $Author: NBagchi
 * $DateTime: Sept 15, 2010 
 */

package com.headstrong.fusion.scheduler;

import static com.headstrong.fusion.scheduler.CacheReloadScheduler.SCHEDULE;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.config.CacheReloadSchedule;
import com.headstrong.fusion.services.caching.CachingService;
import com.headstrong.fusion.services.caching.CachingServiceFactory;
import com.headstrong.fusion.services.caching.CachingServiceFactory.CACHE_TYPE;
import com.headstrong.fusion.services.caching.impl.dbCache.DBCache;

/**
 * 
 */
public class CacheReloadJob implements Job {
	private static final Logger logger = LoggerFactory
			.getLogger(CacheReloadJob.class);

	private boolean isDebug = logger.isDebugEnabled();
	private boolean isInfo = logger.isInfoEnabled();

	public void execute(JobExecutionContext context)
			throws JobExecutionException {

		CacheReloadSchedule cacheReloadSchedule = (CacheReloadSchedule) context
				.getJobDetail().getJobDataMap().get(SCHEDULE);

		if (isDebug) {
			logger.debug("Reload cache job trigger invoked for Ref data "
					+ cacheReloadSchedule.getCacheName());
		}

		try {
			CachingService<DBCache> cacheManager = CachingServiceFactory.getCacheManager(CACHE_TYPE.DB);
			cacheManager.reloadCache(cacheReloadSchedule.getCacheName());

			if (isInfo) {
				logger.info("Reloading of Ref data "
						+ cacheReloadSchedule.getCacheName()
						+ " started by the scheduler");
			}
		} catch (Exception e) {
			logger.error("Error while reloading the Ref data "
					+ cacheReloadSchedule.getCacheName());
		}
	}
}
