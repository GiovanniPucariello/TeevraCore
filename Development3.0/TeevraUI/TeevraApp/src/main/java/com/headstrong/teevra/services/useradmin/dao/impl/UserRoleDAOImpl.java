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
 * $Id: UserRoleDAOImpl.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: May 5, 2009 
 */

package com.headstrong.teevra.services.useradmin.dao.impl;

import com.headstrong.teevra.common.dao.hibernate.BaseHibernateDAO;
import com.headstrong.teevra.services.useradmin.dao.UserRoleDAO;
import com.headstrong.teevra.services.useradmin.eo.UserRoleEO;
import com.headstrong.teevra.services.useradmin.exception.UserAdminServiceException;

/**
 * Implements insert, delete on user-role mappings
 */
public class UserRoleDAOImpl extends BaseHibernateDAO<UserRoleEO> implements
		UserRoleDAO {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.useradmin.dao.UserRoleDAO#saveUserRole(java.lang.Long,
	 *      java.lang.Long)
	 */
	public void saveUserRole(UserRoleEO userRole)
			throws UserAdminServiceException {
		super.save(userRole);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.useradmin.dao.UserRoleDAO#deleteUserRole(java.lang.Long)
	 */
	public void deleteUserRole(Long userId) throws UserAdminServiceException {
		super.bulkUpdate("delete from UserRoleEO where userId = ?",
				new Object[] { userId });

	}

}
