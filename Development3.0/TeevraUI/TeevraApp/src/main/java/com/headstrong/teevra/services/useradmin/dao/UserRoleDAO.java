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
 * $Id: UserRoleDAO.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: May 5, 2009 
 */

package com.headstrong.teevra.services.useradmin.dao;

import com.headstrong.teevra.common.dao.BaseDAO;
import com.headstrong.teevra.services.useradmin.eo.UserRoleEO;
import com.headstrong.teevra.services.useradmin.exception.UserAdminServiceException;

/**
 * Offers APIs to insert/update user-role mappings
 */
public interface UserRoleDAO extends BaseDAO<UserRoleEO> {

	/**
	 * Persists the given user-role mapping
	 * 
	 * @precondition
	 * @postcondition
	 * @param userRole
	 *            TODO
	 * @throws UserAdminServiceException
	 */
	public void saveUserRole(UserRoleEO userRole)
			throws UserAdminServiceException;

	/**
	 * Deletes all the user-role mappings for the given user
	 * 
	 * @precondition
	 * @postcondition
	 * @param userId
	 * @throws UserAdminServiceException
	 */
	public void deleteUserRole(Long userId) throws UserAdminServiceException;
}
