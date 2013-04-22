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
 * $Id: ActivityDAO.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: May 4, 2009 
 */

package com.headstrong.teevra.services.useradmin.dao;

import java.util.List;

import com.headstrong.teevra.common.dao.BaseDAO;
import com.headstrong.teevra.services.useradmin.eo.ActivityEO;
import com.headstrong.teevra.services.useradmin.exception.UserAdminServiceException;

/**
 * Offers APIs to perform CRUD operations on Activities
 */
public interface ActivityDAO extends BaseDAO<ActivityEO> {

	/**
	 * Fetches all the activities defined in the system.
	 * 
	 * @precondition
	 * @postcondition
	 * @return
	 * @throws UserAdminServiceException
	 */
	public List<ActivityEO> getActivities() throws UserAdminServiceException;

	/**
	 * Fetches all the activities defined for the given method in the system
	 * 
	 * @precondition
	 * @postcondition
	 * @param methodName
	 * @return
	 * @throws UserAdminServiceException
	 */
	public List<ActivityEO> getActivities(String methodName)
			throws UserAdminServiceException;

	/**
	 * Fetches all the activities defined for the given user in the system
	 * 
	 * @precondition
	 * @postcondition
	 * @param userId
	 * @return
	 * @throws UserAdminServiceException
	 */
	public List<ActivityEO> getActivities(Long userId)
			throws UserAdminServiceException;

	/**
	 * Fetches all the activities defined for the given role in the system
	 * 
	 * @precondition
	 * @postcondition
	 * @param roleId
	 * @return
	 * @throws UserAdminServiceException
	 */
	public List<ActivityEO> getRoleActivities(Long roleId)
			throws UserAdminServiceException;
}
