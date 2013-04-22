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
 * $Id: ProcessService.java
 * $Revision: 
 * $Author: Akrishnamoorthy
 * $DateTime: Oct 9, 2008 
 */

package com.headstrong.teevra.services.process;

import java.util.List;

import com.headstrong.teevra.services.process.eo.ProcessEO;
import com.headstrong.teevra.services.process.exception.ProcessServiceException;
import com.headstrong.teevra.services.process.vo.ProcessGraphVO;
import com.headstrong.teevra.services.processadmin.exception.ProcessPublishException;
import com.headstrong.teevra.services.userauthorization.exception.SessionTimeOutException;
import com.headstrong.teevra.services.userauthorization.exception.UserAuthorizationException;

/**
 * Offers APIs to perform CRUD operations on processes.
 */
public interface ProcessService {

	/**
	 * Fetches list of all processes present in the system. The returned list of
	 * ProcessVO contains only the core details of the Process. Mainly, it
	 * doesn?t load the configuration model and the graph associated with the
	 * process.
	 * 
	 * @precondition
	 * @postcondition
	 * @return
	 * @throws ProcessServiceException
	 * @throws UserAuthorizationException
	 * @throws SessionTimeOutException
	 */
	public List<ProcessEO> getProcesses() throws ProcessServiceException,
			UserAuthorizationException, SessionTimeOutException;

	/**
	 * Same as getProcesses() but the result is filtered with the values
	 * specified in the input criteria object. This can be used to filter
	 * processes based on process id, status, etc
	 * 
	 * @precondition
	 * @postcondition
	 * @param criteria
	 * @return
	 * @throws ProcessServiceException
	 * @throws UserAuthorizationException
	 * @throws SessionTimeOutException
	 */
	public List<ProcessEO> getProcesses(ProcessEO criteria)
			throws ProcessServiceException, UserAuthorizationException,
			SessionTimeOutException;

	/**
	 * Persists process details and returns the same process that is saved
	 * 
	 * @precondition
	 * @postcondition
	 * @param processToSave
	 * @return processToSave after saving
	 * @throws ProcessServiceException
	 * @throws UserAuthorizationException
	 * @throws SessionTimeOutException
	 */
	public ProcessEO saveProcess(ProcessEO processToSave)
			throws ProcessServiceException, UserAuthorizationException,
			SessionTimeOutException;

	/**
	 * Persists process details along with the graph that contains details on
	 * what components exist in the process, how the components are connected
	 * and configured. If the process is saved as a template, the process VO
	 * that is passed should have a flag denoting the same.
	 * 
	 * @precondition
	 * @postcondition
	 * @param processToSave
	 * @param processGraph
	 * @throws ProcessServiceException
	 * @throws UserAuthorizationException
	 * @throws SessionTimeOutException
	 */
	public void saveProcess(ProcessEO processToSave, ProcessGraphVO processGraph)
			throws ProcessServiceException, UserAuthorizationException,
			SessionTimeOutException;

	/**
	 * Loads the process graph corresponding to the given process Id and creates
	 * the ProcessGraphVO object model out of it. The given process Id can also
	 * correspond to template Id there by using the same interface for loading
	 * template?s graph.
	 * 
	 * @precondition
	 * @postcondition
	 * @param processId
	 * @return
	 * @throws ProcessServiceException
	 * @throws UserAuthorizationException
	 * @throws SessionTimeOutException
	 */
	public ProcessGraphVO getProcessGraph(Long processId)
			throws ProcessServiceException, UserAuthorizationException,
			SessionTimeOutException;

	/**
	 * Fetches list of all templates present in the system. As an alternative,
	 * ?getProcesses(ProcessVO)? interface can also be used with the template
	 * flag set in the input process VO.
	 * 
	 * @precondition
	 * @postcondition
	 * @return
	 * @throws ProcessServiceException
	 * @throws UserAuthorizationException
	 * @throws SessionTimeOutException
	 */
	public List<ProcessEO> getProcessTemplates()
			throws ProcessServiceException, UserAuthorizationException,
			SessionTimeOutException;

	/**
	 * Deletes the given process. If the process is running it needs to be
	 * stopped before deleting.
	 * 
	 * @precondition
	 * @postcondition
	 * @param processId
	 * @throws ProcessServiceException
	 * @throws UserAuthorizationException
	 * @throws SessionTimeOutException
	 */
	public void deleteProcess(Long processId) throws ProcessServiceException,
			UserAuthorizationException, SessionTimeOutException;

	/**
	 * Validates the process graph of the given process while generating a
	 * corresponding configuration model. Persists the PCM thus generated
	 * 
	 * @precondition
	 * @postcondition
	 * @param processToPublish
	 *            Process with the process model graph in it
	 * @return processToPublish after published
	 * @throws ProcessPublishException
	 * @throws UserAuthorizationException
	 * @throws SessionTimeOutException
	 */
	public ProcessEO publishProcess(ProcessEO processToPublish)
			throws ProcessPublishException, UserAuthorizationException,
			SessionTimeOutException;

	/**
	 * Creates a replica of given process with a new process Id. The returned
	 * ProcessVO contains the generated information.
	 * 
	 * @precondition
	 * @postcondition
	 * @param processId
	 * @return
	 * @throws ProcessServiceException
	 * @throws UserAuthorizationException
	 * @throws SessionTimeOutException
	 */
	public ProcessEO cloneProcess(Long processId)
			throws ProcessServiceException, UserAuthorizationException,
			SessionTimeOutException;
}
