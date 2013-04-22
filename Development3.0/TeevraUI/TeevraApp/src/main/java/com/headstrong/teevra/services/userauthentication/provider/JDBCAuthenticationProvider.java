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
 * $Id: JDBCAuthenticationProvider.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: May 7, 2009 
 */

package com.headstrong.teevra.services.userauthentication.provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.teevra.services.useradmin.dao.UserDAO;
import com.headstrong.teevra.services.useradmin.eo.UserEO;
import com.headstrong.teevra.services.useradmin.exception.UserAdminServiceException;
import com.headstrong.teevra.services.userauthentication.exception.UserAuthenticationException;

/**
 * Implements AuthenticationProvider and authenticates the user through JDBC
 */
public class JDBCAuthenticationProvider implements AuthenticationProvider {

	/**
	 * Logger for JDBCAuthenticationProvider
	 */
	private static Logger logger = LoggerFactory
			.getLogger(JDBCAuthenticationProvider.class);

	private UserDAO userDAO;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.userauthentication.provider.AuthenticationProvider#authenticateUser(java.lang.String,
	 *      java.lang.String)
	 */
	public Boolean authenticateUser(String username, String password)
			throws UserAuthenticationException {
		UserEO user = null;
		// get the user matching with the same user name and password from
		// database. Return true if exists else false
		try {
			user = userDAO.getUser(username, password);
		} catch (UserAdminServiceException e) {
			logger.error("Wrong user credentials", e);
			throw new UserAuthenticationException("Wrong user credentials");
		}
		if (user != null) {
			return true;
		}

		return false;
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
}
