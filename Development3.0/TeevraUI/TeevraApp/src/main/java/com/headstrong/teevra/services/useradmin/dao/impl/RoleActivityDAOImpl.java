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
 * $Id: RoleActivityDAOImpl.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: May 5, 2009 
 */

package com.headstrong.teevra.services.useradmin.dao.impl;

import com.headstrong.teevra.common.dao.hibernate.BaseHibernateDAO;
import com.headstrong.teevra.services.useradmin.dao.RoleActivityDAO;
import com.headstrong.teevra.services.useradmin.eo.RoleActivityEO;
import com.headstrong.teevra.services.useradmin.exception.UserAdminServiceException;

/**
 * Implements insert, delete on role-activity mappings
 */
public class RoleActivityDAOImpl extends BaseHibernateDAO<RoleActivityEO>
		implements RoleActivityDAO {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.useradmin.dao.RoleActivityDAO#saveRoleActivity(com.headstrong.teevra.services.useradmin.eo.RoleActivityEO)
	 */
	public void saveRoleActivity(RoleActivityEO roleActivity)
			throws UserAdminServiceException {
		super.save(roleActivity);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.useradmin.dao.RoleActivityDAO#deleteUserRole(java.lang.Long)
	 */
	public void deleteRoleActivity(Long roleId) throws UserAdminServiceException {
		super.bulkUpdate("delete from RoleActivityEO where roleId = ?",
				new Object[] { roleId });

	}
}
