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
 * $Id: AuthenticationServiceImpl.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: May 4, 2009 
 */

package com.headstrong.teevra.services.userauthentication;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.teevra.common.config.ConfigurationReader;
import com.headstrong.teevra.services.appproperties.dao.TPropertyDAO;
import com.headstrong.teevra.services.appproperties.exception.AppPropertiesServiceException;
import com.headstrong.teevra.services.useradmin.dao.ActivityDAO;
import com.headstrong.teevra.services.useradmin.dao.RoleDAO;
import com.headstrong.teevra.services.useradmin.dao.UserDAO;
import com.headstrong.teevra.services.useradmin.eo.ActivityEO;
import com.headstrong.teevra.services.useradmin.eo.RoleEO;
import com.headstrong.teevra.services.useradmin.eo.UserEO;
import com.headstrong.teevra.services.useradmin.exception.UserAdminServiceException;
import com.headstrong.teevra.services.userauthentication.exception.InactiveUserException;
import com.headstrong.teevra.services.userauthentication.exception.UserAuthenticationException;
import com.headstrong.teevra.services.userauthentication.exception.UserAuthenticationServiceException;
import com.headstrong.teevra.services.userauthentication.provider.AuthenticationProvider;
import com.headstrong.teevra.services.userauthentication.provider.AuthenticationProviderFactory;

import flex.messaging.FlexContext;
import flex.messaging.FlexSession;

/**
 * Service Implementation for user authentication
 */
public class UserAuthenticationServiceImpl implements UserAuthenticationService {
	/**
	 * Logger for UserAuthenticationServiceImpl
	 */
	private static Logger logger = LoggerFactory
			.getLogger(UserAuthenticationServiceImpl.class);

	private AuthenticationProviderFactory authenticationProviderFactory;
	private RoleDAO roleDAO;
	private ActivityDAO activityDAO;
	private UserDAO userDAO;
	private TPropertyDAO propertyDAO;

	private static final String KEY_AUTH_TYPE = "authTypeKey";
	private static final String KEY_USER_NAME_ATTR = "userName";
	private static final String KEY_USER_ATTR = "user";
	private static final String KEY_ADMIN = "admin";

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.authentication.AuthenticationService#authenticatePrinciple(java.lang.String,
	 *      java.lang.String)
	 */
	@SuppressWarnings("unchecked")
	public UserEO authenticateUser(String userName, String password)
			throws UserAuthenticationServiceException {

		UserEO user = null;
		// get the type of authentication(JDBC/LDAP) from properties file
		ConfigurationReader config = ConfigurationReader.getInstance();
		String authenticationTypeKey = config.getConfigValue(KEY_AUTH_TYPE);

		String authenticationType;
		try {
			authenticationType = propertyDAO
					.getPropertyValue(authenticationTypeKey);
		} catch (AppPropertiesServiceException e) {
			logger
					.error(
							"Error while retrieving the authentication type from database",
							e);
			throw new UserAuthenticationException(
					"Error while retrieving the authentication type from database");
		}

		AuthenticationProvider provider = authenticationProviderFactory
				.getAuthenticationProvider(authenticationType);

		Boolean isAuthenticated = provider.authenticateUser(userName, password);

		if (isAuthenticated) {
			try {
				user = userDAO.getUser(userName);
				if (user.getUserStatus().trim().equalsIgnoreCase(
						UserEO.STATUS_INACTIVE)) {
					logger.error("User INACTIVE");
					throw new InactiveUserException("User INACTIVE");
				}
			} catch (UserAdminServiceException e) {
				logger
						.error(
								"Error while retrieving the user details from database",
								e);
				throw new UserAuthenticationException(
						"Error while retrieving the user details from database");
			}
			if (user != null) {
				// Retrieve all the roles for the user
				List<RoleEO> roles = null;
				try {
					roles = roleDAO.getRoles(user.getUserId());
				} catch (UserAdminServiceException e) {
					logger.error("Error while retrieving roles for the user ",
							e);
					throw new UserAuthenticationServiceException(
							"Error while retrieving roles for the user");
				}
				// check if the user has admin previliges, authorize him
				String admin = config.getConfigValue(KEY_ADMIN);
				for (RoleEO role : roles) {
					if (role.getRoleName().equals(admin)) {
						user.setIsAdmin(true);
					}
				}
				if (!user.getIsAdmin()) {
					// Retrieve and set all the activities allowed for the user
					List<ActivityEO> activities = null;
					try {
						activities = activityDAO
								.getActivities(user.getUserId());
					} catch (UserAdminServiceException e) {
						logger
								.error(
										"Exception while retrieving activities assigned for the user",
										e);
						throw new UserAuthenticationException(
								"Exception while retrieving activities assigned for the user");
					}
					user.setActivities(activities);
					// set all the ids of the activities
					if (activities != null) {
						List<Long> activityIds = new ArrayList<Long>();
						for (ActivityEO activity : activities) {
							activityIds.add(activity.getActivityId());
						}
						user.setActivityIds(activityIds);
					}

				}

				FlexSession session = FlexContext.getFlexSession();
				String userNameAttr = config.getConfigValue(KEY_USER_NAME_ATTR);
				session.setAttribute(userNameAttr, userName);
				String userAttr = config.getConfigValue(KEY_USER_ATTR);
				session.setAttribute(userAttr, user);
				return user;
			} else {
				logger
						.error("User Authentication failed. User not found in the database");
				throw new UserAuthenticationException(
						"User Authentication failed. User not found in the database");
			}

		} else {
			logger.error("User Authentication failed");
			throw new UserAuthenticationException("User Authentication failed");
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.userauthentication.UserAuthenticationService#logoutUser()
	 */
	public void logoutUser() throws UserAuthenticationServiceException {
		logger.info("Logout method invoked");
		FlexSession session = FlexContext.getFlexSession();
		ConfigurationReader config = ConfigurationReader.getInstance();
		String userNameAttr = config.getConfigValue(KEY_USER_NAME_ATTR);
		session.removeAttribute(userNameAttr);
		String userAttr = config.getConfigValue(KEY_USER_ATTR);
		session.removeAttribute(userAttr);
		logger.info("Session Attributes removed");
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
	 * @return the authenticationProviderFactory
	 */
	public AuthenticationProviderFactory getAuthenticationProviderFactory() {
		return authenticationProviderFactory;
	}

	/**
	 * @param authenticationProviderFactory
	 *            the authenticationProviderFactory to set
	 */
	public void setAuthenticationProviderFactory(
			AuthenticationProviderFactory authenticationProviderFactory) {
		this.authenticationProviderFactory = authenticationProviderFactory;
	}

	/**
	 * @return the propertyDAO
	 */
	public TPropertyDAO getPropertyDAO() {
		return propertyDAO;
	}

	/**
	 * @param propertyDAO
	 *            the propertyDAO to set
	 */
	public void setPropertyDAO(TPropertyDAO propertyDAO) {
		this.propertyDAO = propertyDAO;
	}

}
