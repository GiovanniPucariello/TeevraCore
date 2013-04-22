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
 * $Id: ProcessDAO.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Oct 7, 2008 
 */

package com.headstrong.teevra.services.process.dao;

import java.util.List;

import com.headstrong.teevra.common.dao.BaseDAO;
import com.headstrong.teevra.services.process.eo.ProcessEO;
import com.headstrong.teevra.services.process.exception.ProcessServiceException;

/**
 * ProcessDAO extends BaseDAO and contains methods to perform CRUD operations on
 * processes.
 */
public interface ProcessDAO extends BaseDAO<ProcessEO> {
	/**
	 * Fetches list of all processes present in the system. The returned list of
	 * ProcessVO contains only the core details of the Process. Mainly, it
	 * doesn?t load the configuration model and the graph associated with the
	 * process.
	 * 
	 * @precondition
	 * @postcondition
	 * @return List of Processes
	 * @throws ProcessServiceException
	 */
	public List<ProcessEO> getProcesses() throws ProcessServiceException;

	/**
	 * Same as getProcesses() but the result is filtered with the values
	 * specified in the input criteria object. This can be used to filter
	 * processes based on process id, status, etc
	 * 
	 * @precondition
	 * @postcondition
	 * @param criteria
	 * @return the List of Processes
	 * @throws ProcessServiceException
	 */
	public List<ProcessEO> getProcesses(ProcessEO criteria)
			throws ProcessServiceException;

	/**
	 * Persists process details and returns the same process that is saved
	 * 
	 * @precondition
	 * @postcondition
	 * @param processToSave
	 * @throws ProcessServiceException
	 */
	public void saveProcess(ProcessEO processToSave)
			throws ProcessServiceException;

	/**
	 * Deletes the given process. If the process is running it needs to be
	 * stopped before deleting.
	 * 
	 * @precondition
	 * @postcondition
	 * @param processId
	 * @throws ProcessServiceException
	 */
	public void deleteProcess(Long processId) throws ProcessServiceException;

}
