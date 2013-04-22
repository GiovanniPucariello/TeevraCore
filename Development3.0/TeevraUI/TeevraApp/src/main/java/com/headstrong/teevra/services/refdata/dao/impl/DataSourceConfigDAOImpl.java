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
 * $Id: DatasourceConfigDAOImpl.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Dec 24, 2008 
 */

package com.headstrong.teevra.services.refdata.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.teevra.common.dao.hibernate.BaseHibernateDAO;
import com.headstrong.teevra.services.refdata.dao.DataSourceConfigDAO;
import com.headstrong.teevra.services.refdata.eo.DataSourceConfigEO;
import com.headstrong.teevra.services.refdata.exception.DataSourceConfigDeleteException;
import com.headstrong.teevra.services.refdata.exception.RefDataServiceException;
import com.headstrong.teevra.services.refdata.exception.UniqueDataSourceConfigException;

/**
 * DataSourceConfigDAOImpl implements DataSourceConfigDAO and contains methods
 * to perform CRUD operations on data source configurations.
 */
public class DataSourceConfigDAOImpl extends
		BaseHibernateDAO<DataSourceConfigEO> implements DataSourceConfigDAO {

	/**
	 * Logger for DataSourceConfigDAOImpl
	 */
	private static Logger logger = LoggerFactory
			.getLogger(DataSourceConfigDAOImpl.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.refdata.dao.DataSourceConfigDAO#getDataSourceConfigs()
	 */
	public List<DataSourceConfigEO> getDataSourceConfigs()
			throws RefDataServiceException {
		String query = "from DataSourceConfigEO dataSourceConfig";
		return super.getByQuery(query);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.refdata.dao.DataSourceConfigDAO#saveDataSouceConfig(com.headstrong.teevra.services.refdata.eo.DataSourceConfigEO)
	 */
	public void saveDataSourceConfig(DataSourceConfigEO dataSourceConfigToSave)
			throws RefDataServiceException {

		DetachedCriteria criteria = DetachedCriteria
				.forClass(DataSourceConfigEO.class);
		criteria.add(Restrictions.eq("dataSourceName", dataSourceConfigToSave
				.getDataSourceName()));
		if (dataSourceConfigToSave.getDataSourceId() != null) {
			criteria.add(Restrictions.ne("dataSourceId", dataSourceConfigToSave
					.getDataSourceId()));
		}
		List<DataSourceConfigEO> configList = super.getByCriteria(criteria);

		if (!configList.isEmpty()) {
			logger
					.error("A process with the same name already exists in the system");
			throw new UniqueDataSourceConfigException(
					"A data source with the name " + "'"
							+ dataSourceConfigToSave.getDataSourceName() + "'"
							+ " is already exists in the system");
		} else {
			super.saveOrUpdate(dataSourceConfigToSave);

		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.refdata.dao.DataSourceConfigDAO#deleteDataSouceConfig(java.lang.String)
	 */
	public void deleteDataSourceConfig(String dataSourceName)
			throws RefDataServiceException {
		// get the list of datasources for the given dataSourceName(list should
		// contain only one element)
		List<DataSourceConfigEO> dataSourceConfigList = super
				.getByCriteria(DetachedCriteria.forClass(
						DataSourceConfigEO.class).add(
						Restrictions.eq("dataSourceName", dataSourceName)));

		// delete the config if the list is not empty else throw an exception
		if (!dataSourceConfigList.isEmpty()) {
			super.delete(dataSourceConfigList.get(0));
		} else {

			logger
					.error("Couldn't delete.. there is no such data source configuration");
			throw new DataSourceConfigDeleteException(
					"Cannot delete the data source configuration with name: "
							+ "'" + dataSourceName + "'"
							+ ". there is no such data source configuration");

		}

	}
}
