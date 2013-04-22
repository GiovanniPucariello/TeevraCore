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
 * $Id: ServerAdminService.java
 * $Revision: 
 * $Author: viswanathp
 * $DateTime: Feb 10, 2009 
 */

package com.headstrong.teevra.services.serveradmin;

import java.util.List;

import com.headstrong.teevra.services.serveradmin.eo.ServerConfigEO;
import com.headstrong.teevra.services.serveradmin.exception.ServerAdminServiceException;
import com.headstrong.teevra.services.userauthorization.exception.SessionTimeOutException;
import com.headstrong.teevra.services.userauthorization.exception.UserAuthorizationException;

/**
 * Offers APIs to perform CRUD of service configurations
 */
public interface ServerAdminService {
	/**
	 * Fetches list of all server details registered in the system.
	 * 
	 * @precondition
	 * @postcondition
	 * @return
	 * @throws ServerAdminServiceException
	 * @throws UserAuthorizationException
	 * @throws SessionTimeOutException
	 */
	public List<ServerConfigEO> getServerConfigs()
			throws ServerAdminServiceException, UserAuthorizationException,
			SessionTimeOutException;

	/**
	 * If the given server has serverId already set, then that server would be
	 * replaced with the given server. Exception would be thrown when the server
	 * name already exists.
	 * 
	 * @precondition
	 * @postcondition
	 * @param serverToRegister
	 * @throws ServerAdminServiceException
	 * @throws UserAuthorizationException
	 * @throws SessionTimeOutException
	 */
	public void registerServer(ServerConfigEO serverToRegister)
			throws ServerAdminServiceException, UserAuthorizationException,
			SessionTimeOutException;

	/**
	 * Deletes the given server
	 * 
	 * @precondition
	 * @postcondition
	 * @param serverName
	 * @throws ServerAdminServiceException
	 * @throws UserAuthorizationException
	 * @throws SessionTimeOutException
	 */
	public void unregisterServer(String serverName)
			throws ServerAdminServiceException, UserAuthorizationException,
			SessionTimeOutException;

	/**
	 * Assigns the process associated with the given process id to the server
	 * associated with the given server id. It also removes the process from the
	 * already assigned server(if any)
	 * 
	 * @precondition
	 * @postcondition
	 * @param prcsId
	 * @param serverToAssign
	 * @throws ServerAdminServiceException
	 * @throws UserAuthorizationException
	 * @throws SessionTimeOutException
	 */
	public void assignServer(Long prcsId, ServerConfigEO serverToAssign)
			throws ServerAdminServiceException, UserAuthorizationException,
			SessionTimeOutException;

	/**
	 * If the given process is already registered with a server, removes the
	 * process from the server
	 * 
	 * @precondition
	 * @postcondition
	 * @param prcsId
	 * @throws ServerAdminServiceException
	 * @throws UserAuthorizationException
	 * @throws SessionTimeOutException
	 */
	public void unassignServer(Long prcsId) throws ServerAdminServiceException,
			UserAuthorizationException, SessionTimeOutException;
}
