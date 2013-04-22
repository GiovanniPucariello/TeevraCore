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
 * $Id: UserAdminService.java
 * $Revision: 
 * $Author: viswanathp
 * $DateTime: Apr 20, 2009 
 */

package com.headstrong.teevra.services.useradmin;

import java.util.List;

import com.headstrong.teevra.services.useradmin.eo.ActivityEO;
import com.headstrong.teevra.services.useradmin.eo.RoleEO;
import com.headstrong.teevra.services.useradmin.eo.UserEO;
import com.headstrong.teevra.services.useradmin.exception.UserAdminServiceException;
import com.headstrong.teevra.services.userauthorization.exception.SessionTimeOutException;
import com.headstrong.teevra.services.userauthorization.exception.UserAuthorizationException;

/**
 * Service to perform user/role management related operations
 */
public interface UserAdminService {

	/**
	 * Fetches all the user details registered in the system
	 * 
	 * @precondition
	 * @postcondition
	 * @return
	 * @throws UserAdminServiceException
	 * @throws UserAuthorizationException
	 * @throws SessionTimeOutException
	 */
	public List<UserEO> getUsers() throws UserAdminServiceException,
			UserAuthorizationException, SessionTimeOutException;

	/**
	 * Persists and the given user details along with its activity mappings
	 * 
	 * @precondition
	 * @postcondition
	 * @param userToSave
	 * @throws UserAdminServiceException
	 * @throws UserAuthorizationException
	 * @throws SessionTimeOutException
	 */
	public void saveUser(UserEO userToSave) throws UserAdminServiceException,
			UserAuthorizationException, SessionTimeOutException;

	/**
	 * Deletes the given user from the system
	 * 
	 * @precondition
	 * @postcondition
	 * @param userId
	 * @throws UserAdminServiceException
	 * @throws UserAuthorizationException
	 * @throws SessionTimeOutException
	 */
	public void deleteUser(Long userId) throws UserAdminServiceException,
			UserAuthorizationException, SessionTimeOutException;

	/**
	 * Fetches all the role details defined in the system.
	 * 
	 * @precondition
	 * @postcondition
	 * @return
	 * @throws UserAdminServiceException
	 * @throws UserAuthorizationException
	 * @throws SessionTimeOutException
	 */
	public List<RoleEO> getRoles() throws UserAdminServiceException,
			UserAuthorizationException, SessionTimeOutException;

	/**
	 * Persists the given role along with its activity mappings
	 * 
	 * @precondition
	 * @postcondition
	 * @param roleToSave
	 * @throws UserAdminServiceException
	 * @throws UserAuthorizationException
	 * @throws SessionTimeOutException
	 */
	public void saveRole(RoleEO roleToSave) throws UserAdminServiceException,
			UserAuthorizationException, SessionTimeOutException;

	/**
	 * Deletes the given role from the system.
	 * 
	 * @precondition
	 * @postcondition
	 * @param roleId
	 * @throws UserAdminServiceException
	 * @throws UserAuthorizationException
	 * @throws SessionTimeOutException
	 */
	public void deleteRole(Long roleId) throws UserAdminServiceException,
			UserAuthorizationException, SessionTimeOutException;

	/**
	 * Fetches all the activities defined in the system
	 * 
	 * @precondition
	 * @postcondition
	 * @return
	 * @throws UserAdminServiceException
	 * @throws UserAuthorizationException
	 * @throws SessionTimeOutException
	 */
	public List<ActivityEO> getActivities() throws UserAdminServiceException,
			UserAuthorizationException, SessionTimeOutException;

}
