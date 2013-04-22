/*
 * The information in this document is subject to change without notice and 
 * does not represent a commitment by Headstrong Corporation. The software 
 * and/or databases described in this document are furnished under a license 
 * agreement and may be used or copied only in accordance with the terms of 
 * the agreement. 
 * 
 * Copyright � 2008 Headstrong Corporation
 * All rights reserved.
 * 
 * $Id: ProcessAdminServiceImpl.java
 * $Revision: 
 * $Author: viswanathp
 * $DateTime: Oct 15, 2008 
 * 
 * 
 * $Revision :1.0
 * $Feature : Redmine#611 [ProcessMonitoringConsole]
 * $DateTime: Feb 2011 
 */

package com.headstrong.teevra.services.processadmin;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.teevra.services.process.dao.ProcessDAO;
import com.headstrong.teevra.services.process.eo.ProcessEO;
import com.headstrong.teevra.services.process.exception.ProcessServiceException;
import com.headstrong.teevra.services.process.vo.ProcessStatusVO;
import com.headstrong.teevra.services.processadmin.dao.MessageEventlogDAO;
import com.headstrong.teevra.services.processadmin.dao.ProcessRuntimeDAO;
import com.headstrong.teevra.services.processadmin.dao.ProcessRuntimeEventlogDAO;
import com.headstrong.teevra.services.processadmin.dao.ProcessScheduleDAO;
import com.headstrong.teevra.services.processadmin.eo.MessageEventlogEO;
import com.headstrong.teevra.services.processadmin.eo.ProcessRuntimeEventlogEO;
import com.headstrong.teevra.services.processadmin.eo.ProcessScheduleEO;
import com.headstrong.teevra.services.processadmin.exception.ProcessAdminServiceException;
import com.headstrong.teevra.services.processadmin.remoting.RemoteProcessAdminDelegate;
import com.headstrong.teevra.services.processadmin.vo.ComponentDetailsVO;
import com.headstrong.teevra.services.processadmin.vo.ErrorlogVO;
import com.headstrong.teevra.services.serveradmin.eo.ServerConfigEO;
import com.headstrong.teevra.services.userauthorization.exception.SessionTimeOutException;
import com.headstrong.teevra.services.userauthorization.exception.UserAuthorizationException;

/**
 * Offers APIs to start, stop, schedule,monitor, publish and unpublish
 * processes.
 */
public class ProcessAdminServiceImpl implements ProcessAdminService {

	private ProcessRuntimeDAO processRuntimeDAO;
	private ProcessRuntimeEventlogDAO processRuntimeEventlogDAO;
	private MessageEventlogDAO messageEventlogDAO;
	private ProcessDAO processDAO;
	private ProcessScheduleDAO processScheduleDAO;
	/**
	 * Logger for ProcessAdminServiceImpl
	 */
	private static Logger logger = LoggerFactory
			.getLogger(ProcessAdminServiceImpl.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @seecom.headstrong.teevra.services.processadmin.ProcessAdminService#
	 * getProcessEventLogs
	 * (com.headstrong.teevra.services.processadmin.eo.ProcessRuntimeEventlogEO )
	 */
	public List<ProcessRuntimeEventlogEO> getProcessEventLogs(
			ProcessRuntimeEventlogEO criteria)
			throws ProcessAdminServiceException, UserAuthorizationException,
			SessionTimeOutException {
		return processRuntimeEventlogDAO.getProcessEventLogs(criteria);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @seecom.headstrong.teevra.services.processadmin.ProcessAdminService#
	 * getProcessStatus()
	 */
	public List<ProcessStatusVO> getProcessStatus()
			throws ProcessAdminServiceException, UserAuthorizationException,
			SessionTimeOutException {

		return processRuntimeDAO.getProcessStatus();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.processadmin.ProcessAdminService#scheduleProcess(com.headstrong.teevra.services.processadmin.scheduling.ProcessSchedule,
	 *      com.headstrong.teevra.services.serveradmin.eo.ServerConfigEO)
	 */
	public void scheduleProcess(ProcessScheduleEO schedule,
			ServerConfigEO server) throws ProcessAdminServiceException,
			UserAuthorizationException, SessionTimeOutException {
		// save the schedule configurations in the database then contact JMX
		// server for scheduling

		// Persist in database
		processScheduleDAO.saveProcessSchedule(schedule);
		// contact server to schedule
		RemoteProcessAdminDelegate.getInstance().scheduleProcess(schedule,
				server.getServerUrl());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.processadmin.ProcessAdminService#startProcess(java.lang.Long,
	 *      com.headstrong.teevra.services.serveradmin.eo.ServerConfigEO)
	 */
	public void startProcess(Long processId, ServerConfigEO server)
			throws ProcessAdminServiceException, UserAuthorizationException,
			SessionTimeOutException {

		RemoteProcessAdminDelegate.getInstance().startProcess(processId,
				server.getServerUrl());

		// return the process for the corresponding process id by setting the
		// LOCKED status
		// return setProcessStatus(processId, ProcessEO.STATUS_LOCKED);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.processadmin.ProcessAdminService#stopProcess(java.lang.Long,
	 *      com.headstrong.teevra.services.serveradmin.eo.ServerConfigEO)
	 */
	public void stopProcess(Long processId, ServerConfigEO server)
			throws ProcessAdminServiceException, UserAuthorizationException,
			SessionTimeOutException {

		RemoteProcessAdminDelegate.getInstance().stopProcess(processId,
				server.getServerUrl());

		// return the process for the corresponding process id by setting the
		// PUBLISHED status
		setProcessStatus(processId, ProcessEO.STATUS_PUBLISHED);
	}
	
	

	/*
	 * (non-Javadoc)
	 *  Method added as a part of Feature#611 [ProcessMonitoringConsole]
	 *  
	 * @see com.headstrong.teevra.services.processadmin.ProcessAdminService#getProcessDetails(java.lang.Long,java.lang.String
	 *      com.headstrong.teevra.services.serveradmin.eo.ServerConfigEO)
	 */
	public List<ComponentDetailsVO> getProcessDetails(Long processId,String processName, ServerConfigEO server)
			throws ProcessAdminServiceException, UserAuthorizationException,SessionTimeOutException
	{
	
		List<ComponentDetailsVO> components =
			RemoteProcessAdminDelegate.getInstance().getProcessDetails(processId,processName,server.getServerUrl());

		return components;
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @seecom.headstrong.teevra.services.processadmin.ProcessAdminService#
	 * getErrorLogs(java.lang.Long)
	 */
	public List<ErrorlogVO> getErrorLogs(Long prcsRunId)
			throws ProcessAdminServiceException, UserAuthorizationException,
			SessionTimeOutException {
		List<ErrorlogVO> errorlogs = new ArrayList<ErrorlogVO>();
		// get message level error logs from MessageEventlog table
		List<MessageEventlogEO> messsageEventlogs = messageEventlogDAO
				.getErrorLogs(prcsRunId);
		// append the message level error logs to errorlogs
		for (MessageEventlogEO messageEventlog : messsageEventlogs) {
			ErrorlogVO errorlog = new ErrorlogVO();
			errorlog.setMessageEventlogId(messageEventlog
					.getMessageEventlogId());
			errorlog.setPrcsId(messageEventlog.getPrcsId());
			errorlog.setPrcsName(messageEventlog.getPrcsName());
			errorlog.setPrcsRunId(messageEventlog.getPrcsRunId());
			errorlog.setLogMessage(messageEventlog.getLogMessage());
			errorlog.setSavepointTime(messageEventlog.getSavepointTime());
			errorlogs.add(errorlog);
		}

		// get system level error logs from ProcessRuntimeEventlog table
		List<ProcessRuntimeEventlogEO> prcsRuntimeEventlogs = processRuntimeEventlogDAO
				.getErrorLogs(prcsRunId);
		// append the system level error logs to errorlogs
		for (ProcessRuntimeEventlogEO prcsRuntimeEventlog : prcsRuntimeEventlogs) {
			ErrorlogVO errorlog = new ErrorlogVO();
			errorlog.setPrcsId(prcsRuntimeEventlog.getPrcsId());
			errorlog.setPrcsName(prcsRuntimeEventlog.getPrcsName());
			errorlog.setPrcsRunId(prcsRuntimeEventlog.getPrcsRunId());
			errorlog.setLogMessage(prcsRuntimeEventlog.getPrcsEventDesc());
			errorlog.setSavepointTime(prcsRuntimeEventlog.getPrcsEventTime());
			errorlogs.add(errorlog);
		}
		return errorlogs;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @seecom.headstrong.teevra.services.processadmin.ProcessAdminService#
	 * getErrorLogs()
	 */
	public List<MessageEventlogEO> getErrorLogs()
			throws ProcessAdminServiceException, UserAuthorizationException,
			SessionTimeOutException {

		return messageEventlogDAO.getErrorLogs();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @seecom.headstrong.teevra.services.processadmin.ProcessAdminService#
	 * getMessageData(java.lang.Long)
	 */
	public List<MessageEventlogEO> getMessageData(Long messageEventlogId)
			throws ProcessAdminServiceException, UserAuthorizationException,
			SessionTimeOutException {
		return messageEventlogDAO.getMessageData(messageEventlogId);
	}

	/**
	 * 
	 * 
	 * @precondition
	 * @postcondition
	 * @param processId
	 * @param status
	 * @return ProcessEO saved with the given status
	 * @throws ProcessServiceException
	 */
	private void setProcessStatus(long processId, String status)
			throws ProcessAdminServiceException {

		ProcessEO process = new ProcessEO();
		process.setPrcsId(processId);

		try {
			process = processDAO.getProcesses(process).get(0);
		} catch (ProcessServiceException e) {
			logger.error("Error while getting process", e);
			throw new ProcessAdminServiceException(e.getMessage());
		}

		// change the status of the process
		process.setPrcsStatus(status);
		try {
			processDAO.saveProcess(process);
		} catch (ProcessServiceException e) {
			logger.error("Error while saving process", e);
			throw new ProcessAdminServiceException(e.getMessage());
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.processadmin.ProcessAdminService#saveProcessSchedule(com.headstrong.teevra.services.processadmin.eo.ProcessScheduleEO)
	 */
	public void saveProcessSchedule(ProcessScheduleEO processScheduleToSave)
			throws ProcessAdminServiceException, UserAuthorizationException,
			SessionTimeOutException {
		processScheduleDAO.saveProcessSchedule(processScheduleToSave);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.processadmin.ProcessAdminService#deleteProcessSchedule(java.lang.Long)
	 */
	public void deleteProcessSchedule(Long prcsId)
			throws ProcessAdminServiceException, UserAuthorizationException,
			SessionTimeOutException {
		processScheduleDAO.deleteProcessSchedule(prcsId);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.processadmin.ProcessAdminService#getProcessSchedule(java.lang.Long)
	 */
	public ProcessScheduleEO getProcessSchedule(Long prcsId)
			throws ProcessAdminServiceException, UserAuthorizationException,
			SessionTimeOutException {
		return processScheduleDAO.getProcessSchedule(prcsId);
	}

	/**
	 * 
	 * @return processRuntimeDAO
	 */
	public ProcessRuntimeDAO getProcessRuntimeDAO() {
		return processRuntimeDAO;
	}

	/**
	 * @param processRuntimeDAO
	 *            the processRuntimeDAO to set
	 */
	public void setProcessRuntimeDAO(ProcessRuntimeDAO processRuntimeDAO) {
		this.processRuntimeDAO = processRuntimeDAO;
	}

	/**
	 * @return the processRuntimeEventlogDAO
	 */
	public ProcessRuntimeEventlogDAO getProcessRuntimeEventlogDAO() {
		return processRuntimeEventlogDAO;
	}

	/**
	 * @param processRuntimeEventlogDAO
	 *            the processRuntimeEventlogDAO to set
	 */
	public void setProcessRuntimeEventlogDAO(
			ProcessRuntimeEventlogDAO processRuntimeEventlogDAO) {
		this.processRuntimeEventlogDAO = processRuntimeEventlogDAO;
	}

	/**
	 * @return the messageEventlogDAO
	 */
	public MessageEventlogDAO getMessageEventlogDAO() {
		return messageEventlogDAO;
	}

	/**
	 * @param messageEventlogDAO
	 *            the messageEventlogDAO to set
	 */
	public void setMessageEventlogDAO(MessageEventlogDAO messageEventlogDAO) {
		this.messageEventlogDAO = messageEventlogDAO;
	}

	/**
	 * @return the processDAO
	 */
	public ProcessDAO getProcessDAO() {
		return processDAO;
	}

	/**
	 * @param processDAO
	 *            the processDAO to set
	 */
	public void setProcessDAO(ProcessDAO processDAO) {
		this.processDAO = processDAO;
	}

	/**
	 * @return the processScheduleDAO
	 */
	public ProcessScheduleDAO getProcessScheduleDAO() {
		return processScheduleDAO;
	}

	/**
	 * @param processScheduleDAO
	 *            the processScheduleDAO to set
	 */
	public void setProcessScheduleDAO(ProcessScheduleDAO processScheduleDAO) {
		this.processScheduleDAO = processScheduleDAO;
	}

}
