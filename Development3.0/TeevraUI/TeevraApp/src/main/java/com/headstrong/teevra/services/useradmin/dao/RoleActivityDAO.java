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
 * $Id: RoleActivityDAO.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: May 5, 2009 
 */

package com.headstrong.teevra.services.useradmin.dao;

import com.headstrong.teevra.common.dao.BaseDAO;
import com.headstrong.teevra.services.useradmin.eo.RoleActivityEO;
import com.headstrong.teevra.services.useradmin.exception.UserAdminServiceException;

/**
 * Offers APIs to insert/update role-activity mappings
 */
public interface RoleActivityDAO extends BaseDAO<RoleActivityEO> {

	/**
	 * Persists the given user-role mapping
	 * 
	 * @precondition
	 * @postcondition
	 * @param userRole
	 *            TODO
	 * @throws UserAdminServiceException
	 */
	public void saveRoleActivity(RoleActivityEO roleActivity)
			throws UserAdminServiceException;

	/**
	 * Deletes all the role-activity mappings for the given role
	 * 
	 * @precondition
	 * @postcondition
	 * @param roleId
	 * @throws UserAdminServiceException
	 */
	public void deleteRoleActivity(Long roleId)
			throws UserAdminServiceException;
}
