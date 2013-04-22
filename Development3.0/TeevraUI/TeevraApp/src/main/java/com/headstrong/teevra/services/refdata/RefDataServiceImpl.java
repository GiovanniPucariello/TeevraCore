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
 * $Id: RefdataserviceImpl.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Dec 24, 2008 
 */

package com.headstrong.teevra.services.refdata;

import java.sql.Timestamp;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.teevra.common.exception.EncryptionException;
import com.headstrong.teevra.common.remoting.FusionRemoteDelegate;
import com.headstrong.teevra.common.scheduling.exception.SchedulingException;
import com.headstrong.teevra.common.utils.MessageEncryptor;
import com.headstrong.teevra.services.processadmin.remoting.RemoteProcessAdminDelegate;
import com.headstrong.teevra.services.refdata.dao.CacheReloadScheduleDAO;
import com.headstrong.teevra.services.refdata.dao.DataSourceConfigDAO;
import com.headstrong.teevra.services.refdata.dao.RefDataConfigDAO;
import com.headstrong.teevra.services.refdata.eo.CacheReloadScheduleEO;
import com.headstrong.teevra.services.refdata.eo.DataSourceConfigEO;
import com.headstrong.teevra.services.refdata.eo.RefDataConfigEO;
import com.headstrong.teevra.services.refdata.exception.RefDataServiceException;
import com.headstrong.teevra.services.refdata.remoting.RemoteRefDataDelegate;
import com.headstrong.teevra.services.serveradmin.eo.ServerConfigEO;
import com.headstrong.teevra.services.userauthorization.exception.SessionTimeOutException;
import com.headstrong.teevra.services.userauthorization.exception.UserAuthorizationException;

/**
 * Offers APIs to perform CRUD operations on reference data.
 */
public class RefDataServiceImpl implements RefDataService {

	private DataSourceConfigDAO dataSourceConfigDAO;
	private RefDataConfigDAO refDataConfigDAO;
	private static Logger logger = LoggerFactory.getLogger(RefDataServiceImpl.class);
	private CacheReloadScheduleDAO cacheReloadScheduleDAO;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.refdata.RefDataService#getDataSourceConfigs()
	 */
	public List<DataSourceConfigEO> getDataSourceConfigs()
			throws RefDataServiceException, UserAuthorizationException,
			SessionTimeOutException {
		List<DataSourceConfigEO> dataSourceConfigs = dataSourceConfigDAO.getDataSourceConfigs();
		Iterator<DataSourceConfigEO> iterator = dataSourceConfigs.iterator();
		
		while(iterator.hasNext()) {
			DataSourceConfigEO config = iterator.next();
			MessageEncryptor encryptor = new MessageEncryptor();
			try {
				String encryptedPassword = config.getDbPassword();
				if (encryptedPassword != null && encryptedPassword.trim().length() > 0)
					config.setDbPassword(encryptor.decrypt(encryptedPassword));
				else
					config.setDbPassword(encryptedPassword);
			} catch (EncryptionException e) {
				logger.error("Error while decrypting the password", e);
			}
		}
		return dataSourceConfigs;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.refdata.RefDataService#getRefDataConfigs()
	 */
	public List<RefDataConfigEO> getRefDataConfigs()
			throws RefDataServiceException, UserAuthorizationException,
			SessionTimeOutException {
		return refDataConfigDAO.getRefDataConfigs();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.refdata.RefDataService#saveDataSouceConfig(com.headstrong.teevra.services.refdata.eo.DataSourceConfigEO)
	 */
	public void saveDataSourceConfig(DataSourceConfigEO dataSourceConfig)
			throws RefDataServiceException, UserAuthorizationException,
			SessionTimeOutException {
		if (dataSourceConfig.getDataSourceId().intValue() == 0) {
			dataSourceConfig.setDataSourceId(null);
			dataSourceConfig.setCreatedBy(System.getProperty("user.name"));
			dataSourceConfig.setCreatedDate(new Timestamp(System
					.currentTimeMillis()));
		} else {
			dataSourceConfig.setModifiedBy(System.getProperty("user.name"));
			dataSourceConfig.setModifiedDate(new Timestamp(System
					.currentTimeMillis()));
		}
		MessageEncryptor encryptor = new MessageEncryptor();
		try {
			String password = dataSourceConfig.getDbPassword();
			if (password != null && password.trim().length() > 0)
				dataSourceConfig.setDbPassword(encryptor.encrypt(password));
			else
				dataSourceConfig.setDbPassword(password);
		} catch (EncryptionException e) {
			logger.error("Error while encrypting the password", e);
		}
		dataSourceConfigDAO.saveDataSourceConfig(dataSourceConfig);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.refdata.RefDataService#saveRefDataConfig(com.headstrong.teevra.services.refdata.eo.RefDataConfigEO)
	 */
	public void saveRefDataConfig(RefDataConfigEO refDataConfig)
			throws RefDataServiceException, UserAuthorizationException,
			SessionTimeOutException {
		if (refDataConfig.getRefDataId().intValue() == 0) {
			refDataConfig.setRefDataId(null);
			refDataConfig.setCreatedBy(System.getProperty("user.name"));
			refDataConfig.setCreatedDate(new Timestamp(System
					.currentTimeMillis()));
		} else {
			refDataConfig.setModifiedBy(System.getProperty("user.name"));
			refDataConfig.setModifiedDate(new Timestamp(System
					.currentTimeMillis()));
		}
		refDataConfigDAO.saveRefDataConfig(refDataConfig);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.refdata.RefDataService#deleteDataSouceConfig(java.lang.String)
	 */
	public void deleteDataSourceConfig(String dataSourceName)
			throws RefDataServiceException, UserAuthorizationException,
			SessionTimeOutException {
		dataSourceConfigDAO.deleteDataSourceConfig(dataSourceName);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.refdata.RefDataService#deleteRefDataConfig(java.lang.String)
	 */
	public void deleteRefDataConfig(String refDataName)
			throws RefDataServiceException, UserAuthorizationException,
			SessionTimeOutException {
		refDataConfigDAO.deleteRefDataConfig(refDataName);

	}
	
	public void reloadCache(String cacheName,ServerConfigEO server)
	throws RefDataServiceException
	{
		RemoteProcessAdminDelegate.getInstance().reloadCache(cacheName, server.getServerUrl()) ;
	}

	/**
	 * @return the dataSourceConfigDAO
	 */
	public DataSourceConfigDAO getDataSourceConfigDAO() {
		return dataSourceConfigDAO;
	}

	/**
	 * @param dataSourceConfigDAO
	 *            the dataSourceConfigDAO to set
	 */
	public void setDataSourceConfigDAO(DataSourceConfigDAO dataSourceConfigDAO) {
		this.dataSourceConfigDAO = dataSourceConfigDAO;
	}

	/**
	 * @return the refDataConfigDAO
	 */
	public RefDataConfigDAO getRefDataConfigDAO() {
		return refDataConfigDAO;
	}

	/**
	 * @param refDataConfigDAO
	 *            the refDataConfigDAO to set
	 */
	public void setRefDataConfigDAO(RefDataConfigDAO refDataConfigDAO) {
		this.refDataConfigDAO = refDataConfigDAO;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.refdata.RefDataService#getCacheReloadSchedule(java.lang.String)
	 */
	public CacheReloadScheduleEO getCacheReloadSchedule(String cacheName)
			throws SchedulingException, UserAuthorizationException,
			SessionTimeOutException {
		return cacheReloadScheduleDAO.getCacheReloadSchedule(cacheName);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.refdata.RefDataService#deleteCacheReloadSchedule(java.lang.String)
	 */
	public void deleteCacheReloadSchedule(String cacheName)
			throws SchedulingException, UserAuthorizationException,
			SessionTimeOutException {
		cacheReloadScheduleDAO.deleteCacheReloadSchedule(cacheName);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.refdata.RefDataService#saveCacheReloadSchedule(com.headstrong.teevra.common.scheduling.eo.SchedulingEO)
	 */
	public void saveCacheReloadSchedule(CacheReloadScheduleEO cacheReloadScheduleToSave)
			throws SchedulingException, UserAuthorizationException,
			SessionTimeOutException {
		cacheReloadScheduleDAO.saveCacheReloadSchedule(cacheReloadScheduleToSave);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.refdata.RefDataService#scheduleCacheReload(com.headstrong.teevra.common.scheduling.eo.SchedulingEO,
	 *      com.headstrong.teevra.services.serveradmin.eo.ServerConfigEO)
	 */
	public void scheduleCacheReload(CacheReloadScheduleEO schedule, ServerConfigEO server)
			throws SchedulingException, UserAuthorizationException,
			SessionTimeOutException {

		cacheReloadScheduleDAO.saveCacheReloadSchedule(schedule);
		// contact server to schedule
		RemoteRefDataDelegate.getInstance().scheduleCacheReload(schedule,
				server.getServerUrl());

	}

	/**
	 * @return the cacheReloadScheduleDAO
	 */
	public CacheReloadScheduleDAO getCacheReloadScheduleDAO() {
		return cacheReloadScheduleDAO;
	}

	/**
	 * @param cacheReloadScheduleDAO
	 *            the cacheReloadScheduleDAO to set
	 */
	public void setCacheReloadScheduleDAO(CacheReloadScheduleDAO cacheReloadScheduleDAO) {
		this.cacheReloadScheduleDAO = cacheReloadScheduleDAO;
	}

}
