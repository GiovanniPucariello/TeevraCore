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
 * $Id: ActivityDAOImpl.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: May 4, 2009 
 */

package com.headstrong.teevra.services.useradmin.dao.impl;

import java.util.List;

import com.headstrong.teevra.common.dao.hibernate.BaseHibernateDAO;
import com.headstrong.teevra.services.useradmin.dao.ActivityDAO;
import com.headstrong.teevra.services.useradmin.eo.ActivityEO;
import com.headstrong.teevra.services.useradmin.exception.UserAdminServiceException;

/**
 * Implements CRUD operations on activities
 */
public class ActivityDAOImpl extends BaseHibernateDAO<ActivityEO> implements
		ActivityDAO {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.useradmin.dao.ActivityDAO#getActivities()
	 */
	public List<ActivityEO> getActivities() throws UserAdminServiceException {
		String query = "FROM ActivityEO";
		return super.getByQuery(query);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.useradmin.dao.ActivityDAO#getActivities(java.lang.String)
	 */
	public List<ActivityEO> getActivities(String methodName)
			throws UserAdminServiceException {
		String query = "FROM ActivityEO a WHERE a.activityId "
				+ "IN (SELECT am.activityId FROM ActivityMethodEO am "
				+ "WHERE am.methodId = "
				+ "(SELECT m.methodId FROM MethodEO m WHERE m.methodName ="
				+ "'" + methodName + "'" + ")) ";
		return super.getByQuery(query);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.useradmin.dao.ActivityDAO#getActivities(java.lang.Long)
	 */
	public List<ActivityEO> getActivities(Long userId)
			throws UserAdminServiceException {
		String query = "FROM ActivityEO a WHERE a.activityId "
				+ "IN (SELECT ra.activityId FROM RoleActivityEO ra "
				+ "WHERE ra.roleId "
				+ "IN (SELECT ur.roleId FROM UserRoleEO ur WHERE ur.userId ="
				+ userId + " ))";
		return super.getByQuery(query);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.useradmin.dao.ActivityDAO#getRoleActivities(java.lang.Long)
	 */
	public List<ActivityEO> getRoleActivities(Long roleId)
			throws UserAdminServiceException {
		String query = "FROM ActivityEO a WHERE a.activityId "
				+ "IN (SELECT ra.activityId FROM RoleActivityEO ra "
				+ "WHERE ra.roleId =" + roleId + " ))";
		return super.getByQuery(query);
	}
}
