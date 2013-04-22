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
 * $Id: DatasourceConfigDAO.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Dec 24, 2008 
 */

package com.headstrong.teevra.services.refdata.dao;

import java.util.List;

import com.headstrong.teevra.common.dao.BaseDAO;
import com.headstrong.teevra.services.refdata.eo.DataSourceConfigEO;
import com.headstrong.teevra.services.refdata.exception.RefDataServiceException;

/**
 * DatasourceConfigDAO extends BaseDAO and contains methods to perform CRUD
 * operations on data source configuration
 */
public interface DataSourceConfigDAO extends BaseDAO<DataSourceConfigEO> {

	/**
	 * Fetches all the refdata configurations present in the system
	 * 
	 * @precondition
	 * @postcondition
	 * @return
	 * @throws RefDataServiceException
	 */
	public List<DataSourceConfigEO> getDataSourceConfigs()
			throws RefDataServiceException;

	/**
	 * Persists the given Data source configuration
	 * 
	 * @precondition
	 * @param dataSourceConfig
	 *            dataSourceConfig that needs to be persisted
	 * @throws RefDataServiceException
	 */
	public void saveDataSourceConfig(DataSourceConfigEO dataSourceConfig)
			throws RefDataServiceException;
	/**
	 * Deletes the given data source configuration
	 * 
	 * @precondition
	 * @postcondition
	 * @param dataSourceName
	 *            name of the data source configuration that needs to be deleted
	 * @throws RefDataServiceException
	 */
	public void deleteDataSourceConfig(String dataSourceName)
			throws RefDataServiceException;
}
