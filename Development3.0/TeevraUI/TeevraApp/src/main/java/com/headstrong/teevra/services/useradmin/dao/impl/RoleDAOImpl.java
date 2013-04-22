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
 * $Id: RoleDAOImpl.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Apr 28, 2009 
 */

package com.headstrong.teevra.services.useradmin.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.teevra.common.dao.hibernate.BaseHibernateDAO;
import com.headstrong.teevra.services.useradmin.dao.RoleDAO;
import com.headstrong.teevra.services.useradmin.eo.RoleEO;
import com.headstrong.teevra.services.useradmin.exception.UniqueRoleException;
import com.headstrong.teevra.services.useradmin.exception.UserAdminServiceException;

/**
 * Implements CRUD operations on roles
 */
public class RoleDAOImpl extends BaseHibernateDAO<RoleEO> implements RoleDAO {
	/**
	 * Logger for RoleDAOImpl
	 */
	private static Logger logger = LoggerFactory.getLogger(RoleDAOImpl.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.useradmin.dao.RoleDAO#saveRole(com.headstrong.teevra.services.useradmin.eo.RoleEO)
	 */
	public void saveRole(RoleEO roleToSave) throws UserAdminServiceException {
		DetachedCriteria criteria = DetachedCriteria.forClass(RoleEO.class);
		criteria.add(Restrictions.eq("roleName", roleToSave.getRoleName()));
		if (roleToSave.getRoleId() != null) {
			criteria.add(Restrictions.ne("roleId", roleToSave.getRoleId()));
		}
		List<RoleEO> roleList = super.getByCriteria(criteria);

		if (!roleList.isEmpty()) {
			logger
					.error("Couldn't save role: "
							+ roleToSave.getRoleName()
							+ " A role with the same name already exists in the system");
			throw new UniqueRoleException("A role with the name " + "'"
					+ roleToSave.getRoleName() + "'"
					+ " already exists in the system");
		} else {
			super.saveOrUpdate(roleToSave);
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.useradmin.dao.RoleDAO#deleteRole(java.lang.Long)
	 */
	public void deleteRole(Long roleId) throws UserAdminServiceException {

		// delete from User_Role table
		bulkUpdate("delete from UserRoleEO where roleId = ?",
				new Object[] { roleId });
		logger.info("User-Role mappings with role id " + roleId
				+ " have been unregistered successfully");
		// delete from Role_Activity table
		bulkUpdate("delete from RoleActivityEO where roleId = ?",
				new Object[] { roleId });
		logger.info("Role-Activity mappings with role id " + roleId
				+ " have been unregistered successfully");

		// delete from Role table
		bulkUpdate("delete from RoleEO where roleId = ?",
				new Object[] { roleId });
		logger.info("Role with role id " + roleId
				+ " has been unregistered successfully");

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.useradmin.dao.RoleDAO#getRoles()
	 */
	public List<RoleEO> getRoles() throws UserAdminServiceException {

		String query = "from RoleEO role";
		return super.getByQuery(query);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.useradmin.dao.RoleDAO#getRoles(java.lang.Long)
	 */
	public List<RoleEO> getRoles(Long userId) throws UserAdminServiceException {
		String query = "from RoleEO r where roleId IN (select roleId FROM UserRoleEO ur where ur.userId ="
				+ userId + ")";
		return super.getByQuery(query);
	}

}
