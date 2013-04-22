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
 * $Id: RefDataService.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Dec 24, 2008 
 */

package com.headstrong.teevra.services.refdata;

import java.util.List;

import com.headstrong.teevra.common.scheduling.exception.SchedulingException;
import com.headstrong.teevra.services.refdata.eo.CacheReloadScheduleEO;
import com.headstrong.teevra.services.refdata.eo.DataSourceConfigEO;
import com.headstrong.teevra.services.refdata.eo.RefDataConfigEO;
import com.headstrong.teevra.services.refdata.exception.RefDataServiceException;
import com.headstrong.teevra.services.serveradmin.eo.ServerConfigEO;
import com.headstrong.teevra.services.userauthorization.exception.SessionTimeOutException;
import com.headstrong.teevra.services.userauthorization.exception.UserAuthorizationException;

/**
 * Offers APIs to perform CRUD operations on reference data.
 */
public interface RefDataService {

	/**
	 * Fetches all the data source configurations present in the system
	 * 
	 * @precondition
	 * @postcondition
	 * @return
	 * @throws RefDataServiceException
	 * @throws UserAuthorizationException
	 * @throws SessionTimeOutException
	 */
	public List<DataSourceConfigEO> getDataSourceConfigs()
			throws RefDataServiceException, UserAuthorizationException,
			SessionTimeOutException;

	/**
	 * Fetches all the reference data configurations present in the system
	 * 
	 * @precondition
	 * @postcondition
	 * @return
	 * @throws RefDataServiceException
	 * @throws UserAuthorizationException
	 * @throws SessionTimeOutException
	 */
	public List<RefDataConfigEO> getRefDataConfigs()
			throws RefDataServiceException, UserAuthorizationException,
			SessionTimeOutException;

	/**
	 * Persists the given Data source configuration
	 * 
	 * @precondition
	 * @param dataSourceConfig
	 *            dataSourceConfig that needs to be persisted
	 * @throws RefDataServiceException
	 * @throws UserAuthorizationException
	 * @throws SessionTimeOutException
	 */
	public void saveDataSourceConfig(DataSourceConfigEO dataSourceConfig)
			throws RefDataServiceException, UserAuthorizationException,
			SessionTimeOutException;

	/**
	 * Persists the given Reference Data configuration
	 * 
	 * @precondition
	 * @param refDataConfig
	 *            refDataConfig that needs to be persisted
	 * @throws RefDataServiceException
	 * @throws UserAuthorizationException
	 * @throws SessionTimeOutException
	 */
	public void saveRefDataConfig(RefDataConfigEO refDataConfig)
			throws RefDataServiceException, UserAuthorizationException,
			SessionTimeOutException;

	/**
	 * Deletes the given data source configuration
	 * 
	 * @precondition
	 * @postcondition
	 * @param dataSourceName
	 *            name of the data source configuration that needs to be deleted
	 * @throws RefDataServiceException
	 * @throws UserAuthorizationException
	 * @throws SessionTimeOutException
	 */
	public void deleteDataSourceConfig(String dataSourceName)
			throws RefDataServiceException, UserAuthorizationException,
			SessionTimeOutException;

	/**
	 * Deletes the given reference data configuration
	 * 
	 * @precondition
	 * @postcondition
	 * @param refDataName
	 *            name of the reference data configuration that needs to be
	 *            deleted
	 * @throws RefDataServiceException
	 * @throws UserAuthorizationException
	 * @throws SessionTimeOutException
	 */
	public void deleteRefDataConfig(String refDataName)
			throws RefDataServiceException, UserAuthorizationException,
			SessionTimeOutException;

	/**
	 * Retrieves schedule information for the given cache
	 * 
	 * @precondition
	 * @postcondition
	 * @param cacheName
	 * @return
	 * @throws SchedulingException
	 * @throws UserAuthorizationException
	 * @throws SessionTimeOutException
	 */
	public CacheReloadScheduleEO getCacheReloadSchedule(String cacheName)
			throws SchedulingException, UserAuthorizationException,
			SessionTimeOutException;

	/**
	 * Schedules the cache Reload at the server
	 * @param schedule
	 * @param server
	 * @throws SchedulingException
	 * @throws UserAuthorizationException
	 * @throws SessionTimeOutException
	 */
	public void scheduleCacheReload(CacheReloadScheduleEO schedule, ServerConfigEO server)
			throws SchedulingException, UserAuthorizationException, SessionTimeOutException;

	/**
	 * Persists the given schedule information of the cache
	 * 
	 * @param cacheReloadScheduleToSave
	 * @throws SchedulingException
	 * @throws UserAuthorizationException
	 * @throws SessionTimeOutException
	 */
	public void saveCacheReloadSchedule(CacheReloadScheduleEO cacheReloadScheduleToSave)
			throws SchedulingException, UserAuthorizationException,
			SessionTimeOutException;

	/**
	 * Deletes the schedule information for the given cache
	 * 
	 * @param cacheName
	 * @throws SchedulingException
	 * @throws UserAuthorizationException
	 * @throws SessionTimeOutException
	 */
	public void deleteCacheReloadSchedule(String cacheName)
			throws SchedulingException, UserAuthorizationException,
			SessionTimeOutException;
	
	/**
	 * 
	 * @param cacheName
	 * @param server
	 * @throws SchedulingException
	 * @throws UserAuthorizationException
	 * @throws SessionTimeOutException
	 */
	public void reloadCache(String cacheName,ServerConfigEO server)
	throws RefDataServiceException;

}
