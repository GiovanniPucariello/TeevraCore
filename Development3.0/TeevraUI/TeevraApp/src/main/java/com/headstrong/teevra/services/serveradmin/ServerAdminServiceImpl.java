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
 * $Id: ServerAdminServiceImpl.java
 * $Revision: 
 * $Author: viswanathp
 * $DateTime: Feb 10, 2009 
 */

package com.headstrong.teevra.services.serveradmin;

import java.sql.Timestamp;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.teevra.services.process.dao.ProcessDAO;
import com.headstrong.teevra.services.process.eo.ProcessEO;
import com.headstrong.teevra.services.process.exception.ProcessServiceException;
import com.headstrong.teevra.services.processadmin.exception.ProcessPublishException;
import com.headstrong.teevra.services.processadmin.exception.ProcessRemoveException;
import com.headstrong.teevra.services.processadmin.remoting.RemoteProcessAdminDelegate;
import com.headstrong.teevra.services.serveradmin.dao.ProcessServerDAO;
import com.headstrong.teevra.services.serveradmin.dao.ServerConfigDAO;
import com.headstrong.teevra.services.serveradmin.eo.ProcessServerEO;
import com.headstrong.teevra.services.serveradmin.eo.ServerConfigEO;
import com.headstrong.teevra.services.serveradmin.exception.ServerAdminServiceException;
import com.headstrong.teevra.services.userauthorization.exception.SessionTimeOutException;
import com.headstrong.teevra.services.userauthorization.exception.UserAuthorizationException;

/**
 * Offers APIs to perform CRUD of service configurations
 */
public class ServerAdminServiceImpl implements ServerAdminService {

	/**
	 * Logger for ServerAdminServiceImpl
	 */
	private static Logger logger = LoggerFactory
			.getLogger(ServerAdminServiceImpl.class);

	private ServerConfigDAO serverConfigDAO;
	private ProcessServerDAO processServerDAO;
	private ProcessDAO processDAO;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.serveradmin.ServerAdminService#getServerConfigs()
	 */
	public List<ServerConfigEO> getServerConfigs()
			throws ServerAdminServiceException, UserAuthorizationException,
			SessionTimeOutException {
		return serverConfigDAO.getServerConfigs();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.serveradmin.ServerAdminService#registerServer(com.headstrong.teevra.services.serveradmin.eo.ServerConfigEO)
	 */
	public void registerServer(ServerConfigEO serverToRegister)
			throws ServerAdminServiceException, UserAuthorizationException,
			SessionTimeOutException {
		if (serverToRegister.getServerId().intValue() == 0) {
			serverToRegister.setServerId(null);
			serverToRegister.setCreatedBy(System.getProperty("user.name"));
			serverToRegister.setCreatedDate(new Timestamp(System
					.currentTimeMillis()));
		} else {
			serverToRegister.setModifiedBy(System.getProperty("user.name"));
			serverToRegister.setModifiedDate(new Timestamp(System
					.currentTimeMillis()));
		}
		serverConfigDAO.registerServer(serverToRegister);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.serveradmin.ServerAdminService#unregisterServer(java.lang.String)
	 */
	public void unregisterServer(String serverName)
			throws ServerAdminServiceException, UserAuthorizationException,
			SessionTimeOutException {
		serverConfigDAO.unregisterServer(serverName);

	}

	public void assignServer(Long prcsId, ServerConfigEO serverToAssign)
			throws ServerAdminServiceException, UserAuthorizationException,
			SessionTimeOutException {
		assert (prcsId != null);
		assert (serverToAssign != null);

		// get the previous process server mapping for the process id
		ProcessServerEO prevPrscServerMapping = null;
		try {
			prevPrscServerMapping = processServerDAO
					.getPrcsServerMapping(prcsId);
		} catch (ServerAdminServiceException e) {
			logger.error("Error while retrieving process-server mapping", e);
			throw new ServerAdminServiceException(e.getMessage());
		}
		// if the process is already assigned to some server, get the details of
		// the previous server and then update the mapping
		ServerConfigEO prevAssignedServer = null;
		if (prevPrscServerMapping != null) {
			// get the server to which the process is previously assigned
			prevAssignedServer = serverConfigDAO
					.getServerConfig(prevPrscServerMapping.getServerId());
			// update the mapping
			try {
				processServerDAO.updatePrcsServerMapping(prcsId, serverToAssign
						.getServerId());
			} catch (ServerAdminServiceException e) {
				logger.error("Error while updating process-server mapping", e);
				throw new ServerAdminServiceException(e.getMessage());
			}
		}
		// if the process is not assigned to any server previously, save the new
		// process-server mapping if it has to be assigned to new server
		else {
			ProcessServerEO newPrcsServerMapping = new ProcessServerEO();
			newPrcsServerMapping.setPrcsId(prcsId);
			newPrcsServerMapping.setServerId(serverToAssign.getServerId());
			newPrcsServerMapping.setCreatedBy(System.getProperty("user.name"));
			newPrcsServerMapping.setCreatedDate(new Timestamp(System
					.currentTimeMillis()));
			try {
				processServerDAO.savePrcsServerMapping(newPrcsServerMapping);
			} catch (ServerAdminServiceException e) {
				logger
						.error("Error while persisting process-server mapping",
								e);
				throw new ServerAdminServiceException(e.getMessage());
			}
		}

		// Publish the process in the new server and then remove the process
		// from the previous server.
		// If the removing from the new server is failed try to remove the
		// process from the new server also

		// Get the process from the database
		ProcessEO processToPublish = new ProcessEO();
		processToPublish.setPrcsId(prcsId);
		try {
			processToPublish = (processDAO.getProcesses(processToPublish))
					.get(0);
		} catch (ProcessServiceException e) {
			logger.error("Error while persisting process-server mapping", e);
			throw new ServerAdminServiceException(e.getMessage());
		}
		// assign the process to new server
		try {
			RemoteProcessAdminDelegate.getInstance().publishProcess(
					processToPublish.getPrcsModel(),
					serverToAssign.getServerUrl());
		} catch (ProcessPublishException e) {
			logger.error("Error while publishing the process to the server", e);
			throw new ServerAdminServiceException(e.getMessage());
		}
		// remove process from the previous server
		if (prevAssignedServer != null) {

			try {
				RemoteProcessAdminDelegate.getInstance().removeProcess(prcsId,
						prevAssignedServer.getServerUrl());
			} catch (ProcessRemoveException e) {
				logger
						.error(
								"Error while removing the process from the previously assigned server",
								e);
				// try to remove the process from the newly assigned server
				try {
					RemoteProcessAdminDelegate.getInstance().removeProcess(
							prcsId, serverToAssign.getServerUrl());
				} catch (ProcessRemoveException e1) {
					logger
							.error(
									"Error while removing the process from the newly assigned server",
									e);
					throw new ServerAdminServiceException(e1.getMessage()
							+ e.getMessage());
				}
				throw new ServerAdminServiceException(e.getMessage());
			}

		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.serveradmin.ServerAdminService#unassignServer(java.lang.Long)
	 */
	public void unassignServer(Long prcsId) throws ServerAdminServiceException,
			UserAuthorizationException, SessionTimeOutException {
		// get the server to which the process is assigned
		ProcessServerEO prcsServerMapping = processServerDAO
				.getPrcsServerMapping(prcsId);
		ServerConfigEO assignedServer = null;
		if (prcsServerMapping != null) {
			assignedServer = serverConfigDAO.getServerConfig(prcsServerMapping
					.getServerId());
		}
		if (assignedServer != null) {
			// delete the process-server mapping from database
			processServerDAO.deletePrcsServerMapping(prcsServerMapping);
			// remove the process from the server
			try {
				RemoteProcessAdminDelegate.getInstance().removeProcess(prcsId,
						assignedServer.getServerUrl());
			} catch (ProcessRemoveException e) {
				logger
						.error(
								"Error while removing the process from the assigned server",
								e);
				throw new ServerAdminServiceException(e.getMessage());
			}
		}

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
}
