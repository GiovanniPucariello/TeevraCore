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
 * $Id: ProcessRuntimeDAO.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Oct 7, 2008 
 */

package com.headstrong.teevra.services.processadmin.dao;

import java.util.List;

import com.headstrong.teevra.common.dao.BaseDAO;
import com.headstrong.teevra.services.process.vo.ProcessStatusVO;
import com.headstrong.teevra.services.processadmin.eo.ProcessRuntimeEO;
import com.headstrong.teevra.services.processadmin.exception.ProcessAdminServiceException;

/**
 * ProcessRuntimeDAO extends BaseDAO and performs operations to start, stop,
 * monitor schedule, publish and unpublish processes
 */
public interface ProcessRuntimeDAO extends BaseDAO<ProcessRuntimeEO> {

	/**
	 * Retrieves the current or the last executed status of all processes in the
	 * system.
	 * 
	 * @precondition
	 * @postcondition
	 * @return
	 * @throws ProcessAdminServiceException
	 */
	public List<ProcessStatusVO> getProcessStatus()
			throws ProcessAdminServiceException;

	/**
	 * Retrieves the current run status of the given process
	 * 
	 * @precondition
	 * @postcondition
	 * @return
	 * @throws ProcessAdminServiceException
	 */
	public String getProcessRunStatus(Long processId)
			throws ProcessAdminServiceException;

}
