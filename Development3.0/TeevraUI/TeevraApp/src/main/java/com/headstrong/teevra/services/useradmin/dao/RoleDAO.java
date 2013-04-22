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
 * $Id: RoleDAO.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Apr 28, 2009 
 */

package com.headstrong.teevra.services.useradmin.dao;

import java.util.List;

import com.headstrong.teevra.common.dao.BaseDAO;
import com.headstrong.teevra.services.useradmin.eo.RoleEO;
import com.headstrong.teevra.services.useradmin.exception.UserAdminServiceException;

/**
 * Offers APIs to perform CRUD operations on roles
 */
public interface RoleDAO extends BaseDAO<RoleEO> {

	/**
	 * Fetches all the role details defined in the system.
	 * 
	 * @precondition
	 * @postcondition
	 * @return
	 * @throws UserAdminServiceException
	 */
	public List<RoleEO> getRoles() throws UserAdminServiceException;

	/**
	 * Persists the given role
	 * 
	 * @precondition
	 * @postcondition
	 * @param roleToSave
	 * @throws UserAdminServiceException
	 */
	public void saveRole(RoleEO roleToSave) throws UserAdminServiceException;

	/**
	 * Deletes the given role from the system.
	 * 
	 * @precondition
	 * @postcondition
	 * @param roleId
	 * @throws UserAdminServiceException
	 */
	public void deleteRole(Long roleId) throws UserAdminServiceException;

	/**
	 * Retrieves the roles for the user
	 * 
	 * @precondition
	 * @postcondition
	 * @param userId
	 * @return
	 * @throws UserAdminServiceException
	 */
	public List<RoleEO> getRoles(Long userId) throws UserAdminServiceException;

}
