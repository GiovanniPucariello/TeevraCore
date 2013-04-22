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
 * $Id: ServerConfigDAO.java
 * $Revision: 
 * $Author: viswanathp
 * $DateTime: Feb 10, 2009 
 */

package com.headstrong.teevra.services.serveradmin.dao;

import java.util.List;

import com.headstrong.teevra.common.dao.BaseDAO;
import com.headstrong.teevra.services.serveradmin.eo.ServerConfigEO;
import com.headstrong.teevra.services.serveradmin.exception.ServerAdminServiceException;

/**
 * Offers APIs to perform CRUD of service configurations
 */
public interface ServerConfigDAO extends BaseDAO<ServerConfigEO> {
	/**
	 * Fetches list of all server details registered in the system.
	 * 
	 * @precondition
	 * @postcondition
	 * @return
	 * @throws ServerAdminServiceException
	 */
	public List<ServerConfigEO> getServerConfigs()
			throws ServerAdminServiceException;

	/**
	 * If the given server has serverId already set, then that server would be
	 * replaced with the given server. Exception would be thrown when the server
	 * name already exists.
	 * 
	 * @precondition
	 * @postcondition
	 * @param serverToRegister
	 * @throws ServerAdminServiceException
	 */
	public void registerServer(ServerConfigEO serverToRegister)
			throws ServerAdminServiceException;

	/**
	 * Deletes the given server
	 * 
	 * @precondition
	 * @postcondition
	 * @param serverName
	 * @throws ServerAdminServiceException
	 */
	public void unregisterServer(String serverName)
			throws ServerAdminServiceException;

	/**
	 * Retrieves the ServerConfigEO for the given server id
	 * 
	 * @precondition
	 * @postcondition
	 * @param serverId
	 * @return
	 * @throws ServerAdminServiceException
	 */
	public ServerConfigEO getServerConfig(Long serverId)
			throws ServerAdminServiceException;

}
