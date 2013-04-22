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
 * $Id: ServerConfigDAOImpl.java
 * $Revision: 
 * $Author: viswanathp
 * $DateTime: Feb 10, 2009 
 */

package com.headstrong.teevra.services.serveradmin.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.teevra.common.dao.hibernate.BaseHibernateDAO;
import com.headstrong.teevra.services.process.dao.ProcessDAO;
import com.headstrong.teevra.services.process.eo.ProcessEO;
import com.headstrong.teevra.services.process.exception.ProcessServiceException;
import com.headstrong.teevra.services.processadmin.exception.ProcessRemoveException;
import com.headstrong.teevra.services.processadmin.remoting.RemoteProcessAdminDelegate;
import com.headstrong.teevra.services.serveradmin.dao.ProcessServerDAO;
import com.headstrong.teevra.services.serveradmin.dao.ServerConfigDAO;
import com.headstrong.teevra.services.serveradmin.eo.ProcessServerEO;
import com.headstrong.teevra.services.serveradmin.eo.ServerConfigEO;
import com.headstrong.teevra.services.serveradmin.exception.ServerAdminServiceException;
import com.headstrong.teevra.services.serveradmin.exception.UniqueServerException;

/**
 * ServerConfigDAOImpl implements ProcessDAO and contains methods to perform
 * CRUD operations on server configurations.
 */
public class ServerConfigDAOImpl extends BaseHibernateDAO<ServerConfigEO>
		implements ServerConfigDAO {

	/**
	 * Logger for ServerConfigDAOImpl
	 */
	private static Logger logger = LoggerFactory
			.getLogger(ServerConfigDAOImpl.class);

	private ProcessServerDAO processServerDAO;
	private ProcessDAO processDAO;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.serveradmin.dao.ServerConfigDAO#getServerConfigs()
	 */
	public List<ServerConfigEO> getServerConfigs()
			throws ServerAdminServiceException {
		String query = "from ServerConfigEO serverConfig";
		return super.getByQuery(query);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.serveradmin.dao.ServerConfigDAO#registerServer(com.headstrong.teevra.services.serveradmin.eo.ServerConfigEO)
	 */
	public void registerServer(ServerConfigEO serverToRegister)
			throws ServerAdminServiceException {
		DetachedCriteria criteria = DetachedCriteria
				.forClass(ServerConfigEO.class);
		criteria.add(Restrictions.eq("serverName", serverToRegister
				.getServerName()));
		if (serverToRegister.getServerId() != null) {
			criteria.add(Restrictions.ne("serverId", serverToRegister
					.getServerId()));
		}
		List<ServerConfigEO> serverList = super.getByCriteria(criteria);

		if (!serverList.isEmpty()) {
			logger
					.error("A server with the same name already exists in the system");
			throw new UniqueServerException("A server with the name " + "'"
					+ serverToRegister.getServerName() + "'"
					+ " is already exists in the system");
		} else {
			super.saveOrUpdate(serverToRegister);
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.serveradmin.dao.ServerConfigDAO#unregisterServer(java.lang.String)
	 */
	public void unregisterServer(String serverName)
			throws ServerAdminServiceException {
		List<ServerConfigEO> serverList = super.getByCriteria(DetachedCriteria
				.forClass(ServerConfigEO.class).add(
						Restrictions.eq("serverName", serverName)));
		ServerConfigEO serverToUnregister = serverList.get(0);
		if (serverToUnregister.getPrcsServerMappings().isEmpty()) {
			// remvove the server config details from database
			super.delete(serverToUnregister);
		} else {
			List<ProcessServerEO> mappings = serverToUnregister
					.getPrcsServerMappings();
			// remove all the process server mappings for the sever from the
			// database
			for (ProcessServerEO mapping : mappings) {
				processServerDAO.deletePrcsServerMapping(mapping);

			}
			// remove the server config details from database
			super.delete(serverToUnregister);
			// remove all the processes from the server. If any process is in
			// LOCKED state change it to PUBLISHED as the RUNNING processes get
			// STOPPED
			for (ProcessServerEO mapping : mappings) {

				try {
					// get the process using id
					ProcessEO prcsToRemove = new ProcessEO();
					prcsToRemove.setPrcsId(mapping.getPrcsId());
					try {
						prcsToRemove = processDAO.getProcesses(prcsToRemove)
								.get(0);
					} catch (ProcessServiceException e) {
						logger.error("Error while retrieving the process ", e);
						throw new ServerAdminServiceException(e.getMessage());
					}
					// If the Status is LOCKED change it to PUBLISHED and save
					// it
					if (prcsToRemove.getPrcsStatus().equals(
							ProcessEO.STATUS_LOCKED)) {
						prcsToRemove.setPrcsStatus(ProcessEO.STATUS_PUBLISHED);
						try {
							processDAO.saveProcess(prcsToRemove);
						} catch (ProcessServiceException e) {
							logger.error("Error while saving the process ", e);
							throw new ServerAdminServiceException(e
									.getMessage());
						}
					}
					// remove the process from the server
					RemoteProcessAdminDelegate.getInstance().removeProcess(
							mapping.getPrcsId(),
							serverToUnregister.getServerUrl());
				} catch (ProcessRemoveException e) {
					logger
							.error(
									"Error while removing the process from the assigned server",
									e);
					throw new ServerAdminServiceException(e.getMessage());
				}

			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.serveradmin.dao.ServerConfigDAO#getServerConfig(java.lang.Long)
	 */
	public ServerConfigEO getServerConfig(Long serverId)
			throws ServerAdminServiceException {

		return super.getByCriteria(
				DetachedCriteria.forClass(ServerConfigEO.class).add(
						Restrictions.eq("serverId", serverId))).get(0);
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
