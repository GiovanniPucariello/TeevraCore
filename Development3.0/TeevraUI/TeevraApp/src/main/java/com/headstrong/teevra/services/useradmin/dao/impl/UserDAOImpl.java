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
 * $Id: UserDAOImpl.java
 * $Revision: 
 * $Author: viswanathp
 * $DateTime: Apr 20, 2009 
 */

package com.headstrong.teevra.services.useradmin.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.teevra.common.dao.hibernate.BaseHibernateDAO;
import com.headstrong.teevra.common.exception.EncryptionException;
import com.headstrong.teevra.common.utils.MessageEncryptor;
import com.headstrong.teevra.services.useradmin.dao.UserDAO;
import com.headstrong.teevra.services.useradmin.eo.UserEO;
import com.headstrong.teevra.services.useradmin.exception.UniqueUserException;
import com.headstrong.teevra.services.useradmin.exception.UserAdminServiceException;

/**
 * Implements CRUD operations on users
 */
public class UserDAOImpl extends BaseHibernateDAO<UserEO> implements UserDAO {
	/**
	 * Logger for UserDAOImpl
	 */
	private static Logger logger = LoggerFactory.getLogger(UserDAOImpl.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.useradmin.dao.UserDAO#getUsers()
	 */
	public List<UserEO> getUsers() throws UserAdminServiceException {

		String query = "from UserEO user";
		return super.getByQuery(query);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.useradmin.dao.UserDAO#registerUser(com.headstrong.teevra.services.useradmin.eo.UserEO)
	 */
	public void saveUser(UserEO userToSave) throws UserAdminServiceException {

		DetachedCriteria criteria = DetachedCriteria.forClass(UserEO.class);
		criteria.add(Restrictions.eq("userName", userToSave.getUserName()));
		if (userToSave.getUserId() != null) {
			criteria.add(Restrictions.ne("userId", userToSave.getUserId()));
		}
		List<UserEO> userList = super.getByCriteria(criteria);

		if (!userList.isEmpty()) {
			logger.error("Couldn't register user: " + userToSave.getUserName()
					+ "A user with the same name already exists in the system");
			throw new UniqueUserException("A user with the name " + "'"
					+ userToSave.getUserName() + "'"
					+ " already exists in the system");
		} else {
			super.saveOrUpdate(userToSave);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.useradmin.dao.UserDAO#unregisterUser(java.lang.Long)
	 */
	public void deleteUser(Long userId) throws UserAdminServiceException {

		// delete from User_Role table
		bulkUpdate("delete from UserRoleEO where userId = ?",
				new Object[] { userId });
		logger.info("User-Role mappings with user id " + userId
				+ " have been unregistered successfully");

		// delete from User table
		bulkUpdate("delete from UserEO where userId = ?",
				new Object[] { userId });
		logger.info("User with user id " + userId
				+ " has been unregistered successfully");

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.useradmin.dao.UserDAO#getUser(java.lang.String,
	 *      java.lang.String)
	 */
	public UserEO getUser(String userName, String password)
			throws UserAdminServiceException {

		UserEO user = getUser(userName);
		// decrypt the password
		MessageEncryptor encryptor = new MessageEncryptor();
		String decryptedPassword = null;
		try {
			String encryptedPassword = user.getPassword();
			if (encryptedPassword != null && encryptedPassword.trim().length() > 0 )
				decryptedPassword = encryptor.decrypt(encryptedPassword);
			else
				decryptedPassword = encryptedPassword;
		} catch (EncryptionException e) {
			logger.error("Error while decrypting the password", e);
			throw new UserAdminServiceException(
					"Error while decrypting the password");
		}

		if (decryptedPassword != null) {
			if (decryptedPassword.equals(password)) {
				return user;
			}
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.useradmin.dao.UserDAO#getUser(java.lang.String)
	 */
	public UserEO getUser(String userName) throws UserAdminServiceException {
		DetachedCriteria criteria = DetachedCriteria.forClass(UserEO.class);
		criteria.add(Restrictions.eq("userName", userName));
		//criteria.add(Restrictions.eq("userStatus", UserEO.STATUS_ACTIVE));
		List<UserEO> userList = super.getByCriteria(criteria);
		if (!userList.isEmpty()) {
			return userList.get(0);
		}
		return null;
	}
}
