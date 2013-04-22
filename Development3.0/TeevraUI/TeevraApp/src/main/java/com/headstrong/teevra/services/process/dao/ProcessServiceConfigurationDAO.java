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
 * $Id: ProcessServiceConfigurationDAO.java
 * $Revision: 
 * $Author: 
 * $DateTime:  
 */

package com.headstrong.teevra.services.process.dao;

import java.util.List;

import com.headstrong.teevra.common.dao.BaseDAO;
import com.headstrong.teevra.services.process.eo.ProcessServiceConfigurationEO;
import com.headstrong.teevra.services.process.exception.ProcessServiceException;

/**
 * ProcessServiceConfigurationDAO extends BaseDAO and contains methods to
 * perform CRUD operations on process configurations.
 */
public interface ProcessServiceConfigurationDAO extends
		BaseDAO<ProcessServiceConfigurationEO> {

	/**
	 * Fetches the list of ProcessConfigurations based on the specified criteria
	 * object. This can be used to filter process configurations based on
	 * process id, etc
	 * 
	 * @precondition
	 * @postcondition
	 * @param criteria
	 * @return the List of process configurations
	 * @throws ProcessServiceException
	 */
	public List<ProcessServiceConfigurationEO> getProcessConfigurations(
			ProcessServiceConfigurationEO criteria)
			throws ProcessServiceException;

	/**
	 * Persists the given list of process service configurations
	 * 
	 * @precondition
	 * @postcondition
	 * @param processConfigList
	 * @throws ProcessServiceException
	 */
	public void saveAllProcessConfigurations(
			List<ProcessServiceConfigurationEO> processConfigList)
			throws ProcessServiceException;

	/**
	 * Deletes the process service configurations belonging to the given
	 * processID.
	 * 
	 * @precondition
	 * @postcondition
	 * @param processId
	 * @throws ProcessServiceException
	 */
	public void deleteProcessConfigurations(Long processId)
			throws ProcessServiceException;
}
