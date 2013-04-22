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
 * $Id: ProcessScheduleDAO.java
 * $Revision: 
 * $Author: PAakash
 * $DateTime: Apr 2, 2009 
 */

package com.headstrong.teevra.services.processadmin.dao;

import com.headstrong.teevra.common.dao.BaseDAO;
import com.headstrong.teevra.services.processadmin.eo.ProcessScheduleEO;
import com.headstrong.teevra.services.processadmin.exception.ProcessAdminServiceException;
import com.headstrong.teevra.services.serveradmin.exception.ServerAdminServiceException;

/**
 * ProcessScheduleDAO extends BaseDAO and offers APIs to perform CRUD operations
 * on ProcessSchedule
 */
public interface ProcessScheduleDAO extends BaseDAO<ProcessScheduleEO> {

	/**
	 * Persists the given schedule information of the process
	 * 
	 * @param processScheduleToSave
	 * @throws ServerAdminServiceException
	 */
	public void saveProcessSchedule(ProcessScheduleEO processScheduleToSave)
			throws ProcessAdminServiceException;

	/**
	 * Deletes the schedule information for the given process id
	 * 
	 * @param prcsId
	 * @throws ServerAdminServiceException
	 */
	public void deleteProcessSchedule(Long prcsId)
			throws ProcessAdminServiceException;

	/**
	 * Retrieves schedule information for the given process id
	 * 
	 * @precondition
	 * @postcondition
	 * @param prcsId
	 * @return
	 * @throws ProcessAdminServiceException
	 */
	public ProcessScheduleEO getProcessSchedule(Long prcsId)
			throws ProcessAdminServiceException;
}
