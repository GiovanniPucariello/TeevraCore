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
 * $Id: UserAdminServiceImpl.java
 * $Revision: 
 * $Author: viswanathp
 * $DateTime: Apr 20, 2009 
 */

package com.headstrong.teevra.services.useradmin;

import java.sql.Timestamp;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.teevra.common.exception.EncryptionException;
import com.headstrong.teevra.common.utils.MessageEncryptor;
import com.headstrong.teevra.services.useradmin.dao.ActivityDAO;
import com.headstrong.teevra.services.useradmin.dao.RoleActivityDAO;
import com.headstrong.teevra.services.useradmin.dao.RoleDAO;
import com.headstrong.teevra.services.useradmin.dao.UserDAO;
import com.headstrong.teevra.services.useradmin.dao.UserRoleDAO;
import com.headstrong.teevra.services.useradmin.eo.ActivityEO;
import com.headstrong.teevra.services.useradmin.eo.RoleActivityEO;
import com.headstrong.teevra.services.useradmin.eo.RoleEO;
import com.headstrong.teevra.services.useradmin.eo.UserEO;
import com.headstrong.teevra.services.useradmin.eo.UserRoleEO;
import com.headstrong.teevra.services.useradmin.exception.UserAdminServiceException;
import com.headstrong.teevra.services.userauthorization.exception.SessionTimeOutException;
import com.headstrong.teevra.services.userauthorization.exception.UserAuthorizationException;

/**
 * Implements user/role management related operations
 */
public class UserAdminServiceImpl implements UserAdminService {
	/**
	 * Logger for UserAdminServiceImpl
	 */
	@SuppressWarnings("unused")
	private static Logger logger = LoggerFactory
			.getLogger(UserAdminServiceImpl.class);

	private UserDAO userDAO;
	private RoleDAO roleDAO;
	private ActivityDAO activityDAO;
	private UserRoleDAO userRoleDAO;
	private RoleActivityDAO roleActivityDAO;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.useradmin.UserAdminService#getUsers()
	 */
	public List<UserEO> getUsers() throws UserAdminServiceException,
			UserAuthorizationException, SessionTimeOutException {

		List<UserEO> users = userDAO.getUsers();
		MessageEncryptor encryptor = new MessageEncryptor();
		for (UserEO user : users) {
			// decrypt the password
			try {
				String encryptedPassword = user.getPassword();
				if (encryptedPassword != null && encryptedPassword.trim().length() > 0)
					user.setPassword(encryptor.decrypt(encryptedPassword));
				else
					user.setPassword(encryptedPassword);
			} catch (EncryptionException e) {
				logger.error("Error while decrypting the password", e);
				throw new UserAdminServiceException(
						"Error while decrypting the password");
			}
			// get all the roles assigned for the user
			List<RoleEO> roles = roleDAO.getRoles(user.getUserId());
			// generate and set roles for the user
			user.setRoles(roles);
			user.setRoleNames(RoleEO.rolesToString(roles));
		}
		return users;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.useradmin.UserAdminService#registerUser(com.headstrong.teevra.services.useradmin.eo.UserEO)
	 */
	public void saveUser(UserEO userToSave) throws UserAdminServiceException,
			UserAuthorizationException, SessionTimeOutException {

		// encrypt the password before storing to database
		if (userToSave.getPassword() != null) {
			MessageEncryptor encryptor = new MessageEncryptor();
			try {
				String password = userToSave.getPassword();
				if (password != null && password.trim().length() > 0)
					userToSave.setPassword(encryptor.encrypt(password));
				else
					userToSave.setPassword(password);
			} catch (EncryptionException e) {
				logger.error("Error while encrypting the password", e);
				throw new UserAdminServiceException(
						"Error while encrypting the password");
			}

		}
		if (userToSave.getUserId().intValue() == 0) {
			userToSave.setUserId(null);
			userToSave.setCreatedBy(System.getProperty("user.name"));
			userToSave
					.setCreatedDate(new Timestamp(System.currentTimeMillis()));
		} else {
			userToSave.setModifiedBy(System.getProperty("user.name"));
			userToSave
					.setModifiedDate(new Timestamp(System.currentTimeMillis()));
		}

		// save the user in the system
		userDAO.saveUser(userToSave);
		// in case of editing the user, remove previous user-role mappings and
		// create new mappings
		userRoleDAO.deleteUserRole(userToSave.getUserId());
		// save all the user-role mappings for the user
		List<RoleEO> roles = userToSave.getRoles();
		if ((roles != null) && (!roles.isEmpty())) {
			for (RoleEO role : roles) {
				UserRoleEO userRoleMapping = new UserRoleEO();
				userRoleMapping.setUserId(userToSave.getUserId());
				userRoleMapping.setRoleId(role.getRoleId());
				userRoleMapping.setCreatedBy(userToSave.getCreatedBy());
				userRoleMapping.setCreatedDate(userToSave.getCreatedDate());
				userRoleMapping.setModifiedBy(userToSave.getModifiedBy());
				userRoleMapping.setModifiedDate(userToSave.getModifiedDate());
				userRoleDAO.saveUserRole(userRoleMapping);
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.useradmin.UserAdminService#unregisterUser(java.lang.Long)
	 */
	public void deleteUser(Long userId) throws UserAdminServiceException,
			UserAuthorizationException, SessionTimeOutException {
		userDAO.deleteUser(userId);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.useradmin.UserAdminService#saveRole(com.headstrong.teevra.services.useradmin.eo.RoleEO)
	 */
	public void saveRole(RoleEO roleToSave) throws UserAdminServiceException,
			UserAuthorizationException, SessionTimeOutException {
		if (roleToSave.getRoleId().intValue() == 0) {
			roleToSave.setRoleId(null);
			roleToSave.setCreatedBy(System.getProperty("user.name"));
			roleToSave
					.setCreatedDate(new Timestamp(System.currentTimeMillis()));
		} else {
			roleToSave.setModifiedBy(System.getProperty("user.name"));
			roleToSave
					.setModifiedDate(new Timestamp(System.currentTimeMillis()));
		}
		// save the role in the system
		roleDAO.saveRole(roleToSave);
		// in case of editing the role, remove previous role-activity mappings
		// and
		// create new mappings
		roleActivityDAO.deleteRoleActivity(roleToSave.getRoleId());
		// save all the role-activity mappings for the role
		List<ActivityEO> activities = roleToSave.getActivities();
		if ((activities != null) && (!activities.isEmpty())) {
			for (ActivityEO activity : activities) {
				RoleActivityEO roleActivityMapping = new RoleActivityEO();
				roleActivityMapping.setRoleId(roleToSave.getRoleId());
				roleActivityMapping.setActivityId(activity.getActivityId());
				roleActivityMapping.setCreatedBy(roleToSave.getCreatedBy());
				roleActivityMapping.setCreatedDate(roleToSave.getCreatedDate());
				roleActivityMapping.setModifiedBy(roleToSave.getModifiedBy());
				roleActivityMapping.setModifiedDate(roleToSave
						.getModifiedDate());
				roleActivityDAO.saveRoleActivity(roleActivityMapping);
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.useradmin.UserAdminService#deleteRole(java.lang.Long)
	 */
	public void deleteRole(Long roleId) throws UserAdminServiceException,
			UserAuthorizationException, SessionTimeOutException {
		roleDAO.deleteRole(roleId);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.useradmin.UserAdminService#getRoles()
	 */
	public List<RoleEO> getRoles() throws UserAdminServiceException,
			UserAuthorizationException, SessionTimeOutException {
		List<RoleEO> roles = roleDAO.getRoles();
		for (RoleEO role : roles) {
			// get all the activities assigned for the role
			List<ActivityEO> activities = activityDAO.getRoleActivities(role
					.getRoleId());
			// generate and set activities for the role
			role.setActivities(activities);
			role.setActivityNames(ActivityEO.activitiesToString(activities));

		}

		return roles;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.useradmin.UserAdminService#getActivities()
	 */
	public List<ActivityEO> getActivities() throws UserAdminServiceException,
			UserAuthorizationException, SessionTimeOutException {
		// TODO Auto-generated method stub
		return activityDAO.getActivities();
	}

	/**
	 * @return the userDAO
	 */
	public UserDAO getUserDAO() {
		return userDAO;
	}

	/**
	 * @param userDAO
	 *            the userDAO to set
	 */
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	/**
	 * @return the roleDAO
	 */
	public RoleDAO getRoleDAO() {
		return roleDAO;
	}

	/**
	 * @param roleDAO
	 *            the roleDAO to set
	 */
	public void setRoleDAO(RoleDAO roleDAO) {
		this.roleDAO = roleDAO;
	}

	/**
	 * @return the userRoleDAO
	 */
	public UserRoleDAO getUserRoleDAO() {
		return userRoleDAO;
	}

	/**
	 * @param userRoleDAO
	 *            the userRoleDAO to set
	 */
	public void setUserRoleDAO(UserRoleDAO userRoleDAO) {
		this.userRoleDAO = userRoleDAO;
	}

	/**
	 * @return the roleActivityDAO
	 */
	public RoleActivityDAO getRoleActivityDAO() {
		return roleActivityDAO;
	}

	/**
	 * @param roleActivityDAO
	 *            the roleActivityDAO to set
	 */
	public void setRoleActivityDAO(RoleActivityDAO roleActivityDAO) {
		this.roleActivityDAO = roleActivityDAO;
	}

	/**
	 * @return the activityDAO
	 */
	public ActivityDAO getActivityDAO() {
		return activityDAO;
	}

	/**
	 * @param activityDAO
	 *            the activityDAO to set
	 */
	public void setActivityDAO(ActivityDAO activityDAO) {
		this.activityDAO = activityDAO;
	}

}
