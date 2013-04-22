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
 * $Id: RefdataConfigDAO.java
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
import com.headstrong.teevra.services.refdata.dao.RefDataConfigDAO;
import com.headstrong.teevra.services.refdata.eo.RefDataConfigEO;
import com.headstrong.teevra.services.refdata.exception.RefDataConfigDeleteException;
import com.headstrong.teevra.services.refdata.exception.RefDataServiceException;
import com.headstrong.teevra.services.refdata.exception.UniqueRefDataConfigException;

/**
 * RefdataConfigDAOImpl implements RefdataConfigDAO and contains methods to
 * perform CRUD operations on refdata.
 */
public class RefDataConfigDAOImpl extends BaseHibernateDAO<RefDataConfigEO>
		implements RefDataConfigDAO {

	/**
	 * Logger for DataSourceConfigDAOImpl
	 */
	private static Logger logger = LoggerFactory
			.getLogger(RefDataConfigDAOImpl.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.refdata.dao.RefDataConfigDAO#getRefDataConfigs()
	 */
	public List<RefDataConfigEO> getRefDataConfigs()
			throws RefDataServiceException {
		String query = "from RefDataConfigEO refDataConfig";
		List<RefDataConfigEO> refDataConfigList = super.getByQuery(query);

		if (!refDataConfigList.isEmpty()) {
			for (RefDataConfigEO refData : refDataConfigList) {
				refData.setDataSourceName(refData.getDataSourceConfig()
						.getDataSourceName());
			}
		}
		return refDataConfigList;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.refdata.dao.RefDataConfigDAO#saveRefDataConfig(com.headstrong.teevra.services.refdata.eo.RefDataConfigEO)
	 */
	public void saveRefDataConfig(RefDataConfigEO refDataConfigToSave)
			throws RefDataServiceException {
		DetachedCriteria criteria = DetachedCriteria
				.forClass(RefDataConfigEO.class);
		criteria.add(Restrictions.eq("refDataName", refDataConfigToSave
				.getRefDataName()));
		if (refDataConfigToSave.getRefDataId() != null) {
			criteria.add(Restrictions.ne("refDataId", refDataConfigToSave
					.getRefDataId()));
		}
		List<RefDataConfigEO> configList = super.getByCriteria(criteria);

		if (!configList.isEmpty()) {
			logger
					.error("A Refdata with the same name already exists in the system");
			throw new UniqueRefDataConfigException(
					"A reference data with the name " + "'"
							+ refDataConfigToSave.getRefDataName() + "'"
							+ " is already exists in the system");
		} else {
			super.saveOrUpdate(refDataConfigToSave);

		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.refdata.dao.RefDataConfigDAO#deleteRefDataConfig(java.lang.String)
	 */
	public void deleteRefDataConfig(String refDataName)
			throws RefDataServiceException {
		List<RefDataConfigEO> refDataConfigList = super
				.getByCriteria(DetachedCriteria.forClass(RefDataConfigEO.class)
						.add(Restrictions.eq("refDataName", refDataName)));

		if (!refDataConfigList.isEmpty()) {
			super.delete(refDataConfigList.get(0));
		} else {

			logger
					.error("Couldn't delete.. there is no such reference data configuration");
			throw new RefDataConfigDeleteException(
					"Cannot delete the reference data configuration with name: "
							+ "'" + refDataName + "'"
							+ ". there is no such reference data configuration");

		}

	}
}
