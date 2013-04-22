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

package com.headstrong.teevra.services.refdata.dao;

import java.util.List;

import com.headstrong.teevra.common.dao.BaseDAO;
import com.headstrong.teevra.services.refdata.eo.RefDataConfigEO;
import com.headstrong.teevra.services.refdata.exception.RefDataServiceException;

/**
 * RefdataConfigDAO extends BaseDAO and contains methods to perform CRUD
 * operations on refdata
 */
public interface RefDataConfigDAO extends BaseDAO<RefDataConfigEO> {

	/**
	 * Fetches all the reference data configurations present in the system
	 * 
	 * @precondition
	 * @postcondition
	 * @return
	 * @throws RefDataServiceException
	 */
	public List<RefDataConfigEO> getRefDataConfigs()
			throws RefDataServiceException;
	/**
	 * Persists the given Reference Data configuration
	 * 
	 * @precondition
	 * @param refDataConfig
	 *            refDataConfig that needs to be persisted
	 * @throws RefDataServiceException
	 */
	public void saveRefDataConfig(RefDataConfigEO refDataConfig)
			throws RefDataServiceException;
	/**
	 * Deletes the given reference data configuration
	 * 
	 * @precondition
	 * @postcondition
	 * @param refDataName
	 *            name of the reference data configuration that needs to be
	 *            deleted
	 * @throws RefDataServiceException
	 */
	public void deleteRefDataConfig(String refDataName)
			throws RefDataServiceException;
}
