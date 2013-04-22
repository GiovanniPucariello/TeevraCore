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
 * $Id: ProcessServiceConfigurationDAOImpl.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Oct 7, 2008 
 */

package com.headstrong.teevra.services.process.dao.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.teevra.common.dao.hibernate.BaseHibernateDAO;
import com.headstrong.teevra.services.process.dao.ProcessServiceConfigurationDAO;
import com.headstrong.teevra.services.process.eo.ProcessServiceConfigurationEO;
import com.headstrong.teevra.services.process.exception.ProcessServiceException;

/**
 * ProcessServiceConfigurationDAOImpl implements ProcessDAO and contains methods
 * to perform CRUD operations on processes.
 */
public class ProcessServiceConfigurationDAOImpl extends
		BaseHibernateDAO<ProcessServiceConfigurationEO> implements
		ProcessServiceConfigurationDAO {
	/**
	 * Logger for ProcessServiceConfigurationDAOImpl
	 */
	@SuppressWarnings("unused")
	private static Logger logger = LoggerFactory
			.getLogger(ProcessServiceConfigurationDAOImpl.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.process.dao.ProcessServiceConfigurationDAO#deleteProcessConfigurations(java.lang.Long)
	 */
	public void deleteProcessConfigurations(Long processId)
			throws ProcessServiceException {
		bulkUpdate(
				"DELETE FROM ProcessServiceConfigurationEO where prcsId = ?",
				new Object[] { processId });
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.process.dao.ProcessServiceConfigurationDAO#getProcessConfigurations(com.headstrong.teevra.services.process.eo.ProcessServiceConfigurationEO)
	 */
	public List<ProcessServiceConfigurationEO> getProcessConfigurations(
			ProcessServiceConfigurationEO criteria)
			throws ProcessServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.process.dao.ProcessServiceConfigurationDAO#saveAllProcessConfigurations(java.util.List)
	 */
	public void saveAllProcessConfigurations(
			List<ProcessServiceConfigurationEO> processConfigList)
			throws ProcessServiceException {
		saveOrUpdate(processConfigList);
	}

}
