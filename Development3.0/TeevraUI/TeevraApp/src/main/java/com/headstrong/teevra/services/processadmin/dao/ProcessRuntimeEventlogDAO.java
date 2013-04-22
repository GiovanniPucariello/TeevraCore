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
 * $Id: ProcessRuntimeEventlogDAO.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Oct 7, 2008 
 */

package com.headstrong.teevra.services.processadmin.dao;

import java.util.List;

import com.headstrong.teevra.common.dao.BaseDAO;
import com.headstrong.teevra.services.processadmin.eo.ProcessRuntimeEventlogEO;
import com.headstrong.teevra.services.processadmin.exception.ProcessAdminServiceException;

/**
 * ProcessRuntimeEventlogDAO extends BaseDAO and offers methods to perform
 * operations on ProcessRuntimeEventlogs
 */
public interface ProcessRuntimeEventlogDAO extends
		BaseDAO<ProcessRuntimeEventlogEO> {

	/**
	 * Retrieves the event log based on the passed criteria. If the criteria
	 * object is not passed, event logs of all the processes since five days
	 * will be retrieved.
	 * 
	 * @precondition
	 * @postcondition
	 * @param criteria
	 * @return
	 * @throws ProcessAdminServiceException
	 */
	public List<ProcessRuntimeEventlogEO> getProcessEventLogs(
			ProcessRuntimeEventlogEO criteria) throws ProcessAdminServiceException;

	/**
	 * Retrieves the list of system error messages for the given process run id
	 * 
	 * @precondition
	 * @postcondition
	 * @param prcsRunId
	 * @return
	 * @throws ProcessAdminServiceException
	 */
	public List<ProcessRuntimeEventlogEO> getErrorLogs(Long prcsRunId)
			throws ProcessAdminServiceException;
}
