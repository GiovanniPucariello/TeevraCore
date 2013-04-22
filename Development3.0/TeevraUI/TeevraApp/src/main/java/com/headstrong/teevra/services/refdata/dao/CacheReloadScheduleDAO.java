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
 * $Id: CacheReloadScheduleDAO.java
 * $Revision: 
 * $Author: NBagchi
 * $DateTime: Sept 10, 2010 
 */

package com.headstrong.teevra.services.refdata.dao;

import com.headstrong.teevra.common.dao.BaseDAO;
import com.headstrong.teevra.common.scheduling.exception.SchedulingException;
import com.headstrong.teevra.services.refdata.eo.CacheReloadScheduleEO;

/**
 * CacheReloadScheduleDAO extends BaseDAO and offers APIs to perform CRUD operations
 * on CacheReloadSchedule
 */
public interface CacheReloadScheduleDAO extends BaseDAO<CacheReloadScheduleEO> {

	/**
	 * Persists the given schedule information of the cache
	 * 
	 * @param cacheReloadScheduleToSave
	 * @throws SchedulingException
	 */
	public void saveCacheReloadSchedule(CacheReloadScheduleEO cacheReloadScheduleToSave)
			throws SchedulingException;

	/**
	 * Deletes the schedule information for the given cache
	 * 
	 * @param cacheName
	 * @throws SchedulingException
	 */
	public void deleteCacheReloadSchedule(String cacheName)
			throws SchedulingException;

	/**
	 * Retrieves schedule information for the given cache
	 * 
	 * @precondition
	 * @postcondition
	 * @param cacheName
	 * @return
	 * @throws SchedulingException
	 */
	public CacheReloadScheduleEO getCacheReloadSchedule(String cacheName)
			throws SchedulingException;
}
