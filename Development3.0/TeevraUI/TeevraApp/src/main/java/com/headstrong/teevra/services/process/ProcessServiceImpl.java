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
 * $Id: ProcessService.java
 * $Revision: 
 * $Author: Akrishnamoorthy
 * $DateTime: Oct 9, 2008 
 */

package com.headstrong.teevra.services.process;

import java.sql.Timestamp;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.teevra.services.process.dao.ProcessDAO;
import com.headstrong.teevra.services.process.dao.ProcessServiceConfigurationDAO;
import com.headstrong.teevra.services.process.eo.ProcessEO;
import com.headstrong.teevra.services.process.eo.ProcessServiceConfigurationEO;
import com.headstrong.teevra.services.process.exception.ProcessModelGenerationException;
import com.headstrong.teevra.services.process.exception.ProcessServiceException;
import com.headstrong.teevra.services.process.vo.ProcessGraphVO;
import com.headstrong.teevra.services.processadmin.dao.ProcessRuntimeDAO;
import com.headstrong.teevra.services.processadmin.exception.ProcessAdminServiceException;
import com.headstrong.teevra.services.processadmin.exception.ProcessPublishException;
import com.headstrong.teevra.services.processadmin.exception.ProcessRemoveException;
import com.headstrong.teevra.services.processadmin.remoting.RemoteProcessAdminDelegate;
import com.headstrong.teevra.services.serveradmin.ServerAdminService;
import com.headstrong.teevra.services.serveradmin.dao.ProcessServerDAO;
import com.headstrong.teevra.services.serveradmin.dao.ServerConfigDAO;
import com.headstrong.teevra.services.serveradmin.eo.ProcessServerEO;
import com.headstrong.teevra.services.serveradmin.eo.ServerConfigEO;
import com.headstrong.teevra.services.serveradmin.exception.ServerAdminServiceException;
import com.headstrong.teevra.services.userauthorization.exception.SessionTimeOutException;
import com.headstrong.teevra.services.userauthorization.exception.UserAuthorizationException;

/**
 * Offers APIs to perform CRUD operations on processes.
 */
public class ProcessServiceImpl implements ProcessService {

	/**
	 * Logger for ProcessServiceImpl
	 */
	private static Logger logger = LoggerFactory
			.getLogger(ProcessServiceImpl.class);

	private ProcessDAO processDAO;
	private ProcessServiceConfigurationDAO processConfigDAO;
	private ProcessServerDAO processServerDAO;
	private ProcessRuntimeDAO processRuntimeDAO;
	private ServerConfigDAO serverConfigDAO;
	private ServerAdminService serverAdminService;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.process.ProcessService#getProcesses()
	 */
	public List<ProcessEO> getProcesses() throws ProcessServiceException,
			UserAuthorizationException, SessionTimeOutException {
		return processDAO.getProcesses();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.process.ProcessService#getProcesses(com.headstrong.teevra.services.process.eo.ProcessEO)
	 */
	public List<ProcessEO> getProcesses(ProcessEO criteria)
			throws ProcessServiceException, UserAuthorizationException,
			SessionTimeOutException {
		List<ProcessEO> processes = processDAO.getProcesses(criteria);

		// while loading process model, include runtime status also for that
		// process
		if (processes.size() == 1) {
			ProcessEO prcs = processes.get(0);

			try {
				prcs.setPrcsRunStatus(processRuntimeDAO
						.getProcessRunStatus(prcs.getPrcsId()));
			} catch (ProcessAdminServiceException e) {
				logger
						.error("Error while fetching runtime status of the current process: "
								+ prcs.getPrcsId());
				throw new ProcessServiceException(e.getMessage());
			}

		}
		return processes;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.process.ProcessService#saveProcess(com.headstrong.teevra.services.process.eo.ProcessEO,
	 *      com.headstrong.teevra.services.process.vo.ProcessGraphVO)
	 */
	public void saveProcess(ProcessEO processToSave, ProcessGraphVO processGraph)
			throws ProcessServiceException, UserAuthorizationException,
			SessionTimeOutException {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.process.ProcessService#saveProcess(com.headstrong.teevra.services.process.eo.ProcessEO)
	 */
	public ProcessEO saveProcess(ProcessEO processToSave)
			throws ProcessServiceException, UserAuthorizationException,
			SessionTimeOutException {

		// if intValue() == 0 , it is a new process, so we set process created
		// details here
		if (processToSave.getPrcsId().intValue() == 0) {
			processToSave.setPrcsId(null);
			processToSave.setCreatedBy(System.getProperty("user.name"));
			processToSave.setCreatedDate(new Timestamp(System
					.currentTimeMillis()));
		}
		// if the process is already published, change the status to
		// PUBLISHED_MODIFIED
		if (processToSave.getPrcsStatus().equals(ProcessEO.STATUS_PUBLISHED)) {
			processToSave.setPrcsStatus(ProcessEO.STATUS_PUBLISHED_MODIFIED);
		}
		// save the process in the system
		processDAO.saveProcess(processToSave);
		// return the process after saving
		return processToSave;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.process.ProcessService#getProcessGraph(java.lang.Long)
	 */
	public ProcessGraphVO getProcessGraph(Long processId)
			throws ProcessServiceException, UserAuthorizationException,
			SessionTimeOutException {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.process.ProcessService#getProcessTemplates()
	 */
	public List<ProcessEO> getProcessTemplates()
			throws ProcessServiceException, UserAuthorizationException,
			SessionTimeOutException {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.process.ProcessService#deleteProcess(java.lang.Long)
	 */
	public void deleteProcess(Long processId) throws ProcessServiceException,
			UserAuthorizationException, SessionTimeOutException {

		// get the server to which the process is assigned(if there is any)
		ServerConfigEO assignedServer = getAssignedServer(processId);

		// delete the process details from the database
		processDAO.deleteProcess(processId);

		// finally remove the process from the server if the process is assigned
		// to a server
		if (assignedServer != null) {
			try {
				RemoteProcessAdminDelegate.getInstance().removeProcess(
						processId, assignedServer.getServerUrl());
			} catch (ProcessRemoveException e) {
				logger.error(
						"Error while removing the process from the server", e);
				throw new ProcessServiceException(e.getMessage());
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.process.ProcessService#publishProcess(com.headstrong.teevra.services.process.eo.ProcessEO)
	 */
	public ProcessEO publishProcess(ProcessEO processToPublish)
			throws ProcessPublishException, UserAuthorizationException,
			SessionTimeOutException {
		assert (processToPublish.getPrcsId() != null);

		try {

			// remove previously saved complex configurations for the given
			// process
			processConfigDAO.deleteProcessConfigurations(processToPublish
					.getPrcsId());
			// save complex configurations that won't be inlined in PCM
			List<ProcessServiceConfigurationEO> complexConfigurations = ProcessModelGenerator
					.getComplexConfigurations(processToPublish.getGraph());
			// save all the current complex configurations
			processConfigDAO
					.saveAllProcessConfigurations(complexConfigurations);
		} catch (ProcessServiceException e) {
			logger
					.error(
							"Error while saving or deleting complex configurations ",
							e);
			throw new ProcessPublishException(e.getMessage());
		}

		// generate PCM
		try {
			processToPublish.setPrcsModel(ProcessModelGenerator
					.generateProcessModel(processToPublish));
		} catch (ProcessModelGenerationException e) {
			logger.error("Error while generating process model ", e);
			throw new ProcessPublishException(e.getMessage());
		}
		// save the process in database with new status as PUBLISHED
		try {
			// change the status of the process to PUBLISHED
			processToPublish.setPrcsStatus(ProcessEO.STATUS_PUBLISHED);
			processDAO.saveProcess(processToPublish);
		} catch (ProcessServiceException e) {
			logger.error("Error while persisiting process", e);
			throw new ProcessPublishException(e.getMessage());
		}
		// get the previous assigned process
		ServerConfigEO prevAssignedServer = null;
		try {
			prevAssignedServer = getAssignedServer(processToPublish.getPrcsId());
		} catch (ProcessServiceException e) {
			logger
					.error(
							"Error while retrieving assigned server configurations for the process",
							e);
			throw new ProcessPublishException(e.getMessage());
		}
		// if the prevAssignedServer is null, update the process in previously
		// assigned server
		if (prevAssignedServer != null) {
			// reassign the process to the old server
			RemoteProcessAdminDelegate.getInstance().publishProcess(
					processToPublish.getPrcsModel(),
					prevAssignedServer.getServerUrl());
		}
		// return the process after publishing
		return processToPublish;
	}

	/**
	 * Returns the server the process is assigned to
	 * 
	 * @precondition
	 * @postcondition
	 * @param prcsId
	 * @return
	 * @throws ProcessServiceException
	 */
	private ServerConfigEO getAssignedServer(Long prcsId)
			throws ProcessServiceException {
		ProcessServerEO prcsServerMapping = null;
		// get the assigned server id from process server mapping
		try {
			prcsServerMapping = processServerDAO.getPrcsServerMapping(prcsId);
		} catch (ServerAdminServiceException e) {
			logger.error("Error while retrieving process-server mapping", e);
			throw new ProcessServiceException(e.getMessage());
		}
		// get the server configuration for the server id obtained in the above
		// mapping
		// we check whether process-server mapping is null, because the process
		// might not be assigned to any server
		if (prcsServerMapping != null) {
			try {
				return serverConfigDAO.getServerConfig(prcsServerMapping
						.getServerId());
			} catch (ServerAdminServiceException e) {
				logger.error("Error while retrieving server configuration", e);
				throw new ProcessServiceException(e.getMessage());
			}
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.process.ProcessService#cloneProcess(java.lang.Long)
	 */
	public ProcessEO cloneProcess(Long processId)
			throws ProcessServiceException, UserAuthorizationException,
			SessionTimeOutException {
		return null;
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
	 * @return the processConfigDAO
	 */
	public ProcessServiceConfigurationDAO getProcessConfigDAO() {
		return processConfigDAO;
	}

	/**
	 * @param processConfigDAO
	 *            the processConfigDAO to set
	 */
	public void setProcessConfigDAO(
			ProcessServiceConfigurationDAO processConfigDAO) {
		this.processConfigDAO = processConfigDAO;
	}

	/**
	 * @return the processServerDAO
	 */
	public ProcessServerDAO getProcessServerDAO() {
		return processServerDAO;
	}

	/**
	 * @param processServerDAO
	 *            the processServerDAO to set
	 */
	public void setProcessServerDAO(ProcessServerDAO processServerDAO) {
		this.processServerDAO = processServerDAO;
	}

	/**
	 * @return the serverConfigDAO
	 */
	public ServerConfigDAO getServerConfigDAO() {
		return serverConfigDAO;
	}

	/**
	 * @param serverConfigDAO
	 *            the serverConfigDAO to set
	 */
	public void setServerConfigDAO(ServerConfigDAO serverConfigDAO) {
		this.serverConfigDAO = serverConfigDAO;
	}

	/**
	 * @return the serverAdminService
	 */
	public ServerAdminService getServerAdminService() {
		return serverAdminService;
	}

	/**
	 * @param serverAdminService
	 *            the serverAdminService to set
	 */
	public void setServerAdminService(ServerAdminService serverAdminService) {
		this.serverAdminService = serverAdminService;
	}

	/**
	 * @return the processRuntimeDAO
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

}
