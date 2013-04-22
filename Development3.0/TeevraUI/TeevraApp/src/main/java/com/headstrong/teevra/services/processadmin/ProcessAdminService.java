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
 * $Id: ProcessAdminService.java
 * $Revision: 
 * $Author: akrishnamoorthy
 * $DateTime: Oct 14, 2008 
 * 
 * 
 * $Revision :1.0 
 * $Feature : Redmine#611 [ProcessMonitoringConsole]
 * $DateTime: Feb 9, 2011 
 */

package com.headstrong.teevra.services.processadmin;

import java.awt.Component;
import java.util.List;

import com.headstrong.teevra.services.process.vo.ProcessStatusVO;
import com.headstrong.teevra.services.processadmin.eo.MessageEventlogEO;
import com.headstrong.teevra.services.processadmin.eo.ProcessRuntimeEventlogEO;
import com.headstrong.teevra.services.processadmin.eo.ProcessScheduleEO;
import com.headstrong.teevra.services.processadmin.exception.ProcessAdminServiceException;
import com.headstrong.teevra.services.processadmin.vo.ComponentDetailsVO;
import com.headstrong.teevra.services.processadmin.vo.ErrorlogVO;
import com.headstrong.teevra.services.serveradmin.eo.ServerConfigEO;
import com.headstrong.teevra.services.serveradmin.exception.ServerAdminServiceException;
import com.headstrong.teevra.services.userauthorization.exception.SessionTimeOutException;
import com.headstrong.teevra.services.userauthorization.exception.UserAuthorizationException;

/**
 * Offers APIs to start, stop, monitor,schedule, publish and unpublish
 * processes.
 */
public interface ProcessAdminService {

	/**
	 * Checks if the process is published and if Process Configuration Model
	 * (PCM) already exists. If the check fails, it throws an exception. If the
	 * process is already running, it needs to be stopped first before starting
	 * it. This sends an asynchronous system event to the STRIDE Hub server to
	 * start the given process.
	 * 
	 * @precondition
	 * @postcondition
	 * @param processId
	 * @param server
	 * @throws ProcessAdminServiceException
	 * @throws UserAuthorizationException
	 * @throws SessionTimeOutException
	 */
	public void startProcess(Long processId, ServerConfigEO server)
			throws ProcessAdminServiceException, UserAuthorizationException,
			SessionTimeOutException;

	/**
	 * Sends an asynchronous system event to stop process
	 * 
	 * @precondition
	 * @postcondition
	 * @param processId
	 * @param server
	 * @throws ProcessAdminServiceException
	 * @throws UserAuthorizationException
	 * @throws SessionTimeOutException
	 */
	public void stopProcess(Long processId, ServerConfigEO server)
			throws ProcessAdminServiceException, UserAuthorizationException,
			SessionTimeOutException;

	
	/* (non-javadoc)Added as a part of Feature# 611 [ProcessMonitoringConsole] */
	/**
	 *   Retrieves process monitoring details using JMX client  
	 * 
	 * @precondition
	 * @postcondition
	 * @param processId
	 * @param processName
	 * @param server
	 * @throws ProcessAdminServiceException
	 * @throws UserAuthorizationException
	 * @throws SessionTimeOutException
	 */
	public List<ComponentDetailsVO> getProcessDetails(Long processId,String processName, ServerConfigEO server)
		throws  ProcessAdminServiceException, UserAuthorizationException,
			SessionTimeOutException;
	
	
	

	/**
	 * Checks if the process is published and if Process Configuration Model
	 * (PCM) already exists. If the check fails, it throws an exception. If the
	 * process is already running, it needs to be stopped first before
	 * scheduling it. This sends an asynchronous system event to the STRIDE Hub
	 * server to schedule the given process.
	 * 
	 * @precondition
	 * @postcondition
	 * @param schedule
	 * @param server
	 * @throws ProcessAdminServiceException
	 * @throws UserAuthorizationException
	 * @throws SessionTimeOutException
	 * 
	 */
	
	
	
	
	public void scheduleProcess(ProcessScheduleEO schedule,
			ServerConfigEO server) throws ProcessAdminServiceException,
			UserAuthorizationException, SessionTimeOutException;

	/**
	 * Retrieves the current or the last executed status of all processes in the
	 * system.
	 * 
	 * @precondition
	 * @postcondition
	 * @throws ProcessAdminServiceException
	 * @throws UserAuthorizationException
	 * @throws SessionTimeOutException
	 * @return
	 */
	public List<ProcessStatusVO> getProcessStatus()
			throws ProcessAdminServiceException, UserAuthorizationException,
			SessionTimeOutException;

	/**
	 * Retrieves the event log based on the passed criteria. If the criteria
	 * object is not passed, event logs of all the processes since five days
	 * will be retrieved.
	 * 
	 * @precondition
	 * @postcondition
	 * @param criteria
	 * @throws ProcessAdminServiceException
	 * @throws UserAuthorizationException
	 * @throws SessionTimeOutException
	 * @return
	 */
	public List<ProcessRuntimeEventlogEO> getProcessEventLogs(
			ProcessRuntimeEventlogEO criteria)
			throws ProcessAdminServiceException, UserAuthorizationException,
			SessionTimeOutException;

	/**
	 * Retrieves the list of Error Messages for the given process run id
	 * 
	 * @precondition
	 * @postcondition
	 * @param prcsRunId
	 * @throws ProcessAdminServiceException
	 * @throws UserAuthorizationException
	 * @throws SessionTimeOutException
	 * @return
	 */
	public List<ErrorlogVO> getErrorLogs(Long prcsRunId)
			throws ProcessAdminServiceException, UserAuthorizationException,
			SessionTimeOutException;

	/**
	 * Retrieves the list of all the error message eventlogs in the system
	 * 
	 * @precondition
	 * @postcondition
	 * @throws ProcessAdminServiceException
	 * @throws UserAuthorizationException
	 * @throws SessionTimeOutException
	 * @return
	 */
	public List<MessageEventlogEO> getErrorLogs()
			throws ProcessAdminServiceException, UserAuthorizationException,
			SessionTimeOutException;

	/**
	 * Retrieves the Message details for the given message eventlog id
	 * 
	 * @precondition
	 * @postcondition
	 * @param messageEventlogId
	 * @throws ProcessAdminServiceException
	 * @throws UserAuthorizationException
	 * @throws SessionTimeOutException
	 * @return
	 */
	public List<MessageEventlogEO> getMessageData(Long messageEventlogId)
			throws ProcessAdminServiceException, UserAuthorizationException,
			SessionTimeOutException;

	/**
	 * Persists the given schedule information of the process
	 * 
	 * @param processScheduleToSave
	 * @throws ServerAdminServiceException
	 * @throws UserAuthorizationException
	 * @throws SessionTimeOutException
	 */
	public void saveProcessSchedule(ProcessScheduleEO processScheduleToSave)
			throws ProcessAdminServiceException, UserAuthorizationException,
			SessionTimeOutException;

	/**
	 * Deletes the schedule information for the given process id
	 * 
	 * @param prcsId
	 * @throws ServerAdminServiceException
	 * @throws UserAuthorizationException
	 * @throws SessionTimeOutException
	 */
	public void deleteProcessSchedule(Long prcsId)
			throws ProcessAdminServiceException, UserAuthorizationException,
			SessionTimeOutException;

	/**
	 * Retrieves schedule information for the given process id
	 * 
	 * @precondition
	 * @postcondition
	 * @param prcsId
	 * @return
	 * @throws ProcessAdminServiceException
	 * @throws UserAuthorizationException
	 * @throws SessionTimeOutException
	 */
	public ProcessScheduleEO getProcessSchedule(Long prcsId)
			throws ProcessAdminServiceException, UserAuthorizationException,
			SessionTimeOutException;
}
