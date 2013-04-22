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
 * $Id: UserAuthorizationService.java
 * $Revision:
 * $Author: ViswanathP
 * $DateTime: May 14, 2009
 */

package com.headstrong.teevra.services.userauthorization;

import java.lang.reflect.Method;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;

import com.headstrong.teevra.common.config.ConfigurationReader;
import com.headstrong.teevra.services.useradmin.dao.ActivityDAO;
import com.headstrong.teevra.services.useradmin.eo.ActivityEO;
import com.headstrong.teevra.services.useradmin.eo.UserEO;
import com.headstrong.teevra.services.userauthorization.exception.SessionTimeOutException;
import com.headstrong.teevra.services.userauthorization.exception.UserAuthorizationException;

import flex.messaging.FlexContext;
import flex.messaging.FlexSession;

/**
 * Service for authorizing user on method level
 */
public class UserAuthorizationService implements MethodBeforeAdvice,
		AfterReturningAdvice, ThrowsAdvice {

	/**
	 * Logger for UserAuthorizationService
	 */
	private static Logger logger = LoggerFactory
			.getLogger(UserAuthorizationService.class);

	private static final String KEY_USER_ATTR = "user";

	private ActivityDAO activityDAO;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.aop.MethodBeforeAdvice#before(java.lang.reflect.Method,
	 *      java.lang.Object[], java.lang.Object)
	 */

	public void before(Method arg0, Object[] arg1, Object arg2)
			throws Throwable {

		String methodName = arg0.getName();
		logger.info("Beginning method: " + methodName);

		ConfigurationReader config = ConfigurationReader.getInstance();
		String userAttr = config.getConfigValue(KEY_USER_ATTR);

		Boolean isAuthorized = false;

		FlexSession session = FlexContext.getFlexSession();

		UserEO user = (UserEO) session.getAttribute(userAttr);

		if (user == null) {
			logger.error("Session Time Out");
			session.timeout();
			throw new SessionTimeOutException("Session Time Out.Please Relogin");
		}
		// if the user has admin previliges, authorize him
		if (user.getIsAdmin().equals(true)) {
			isAuthorized = true;
		}

		if (!isAuthorized) {
			List<ActivityEO> userActivities = user.getActivities();
			List<ActivityEO> methodActivities = activityDAO
					.getActivities(methodName);
			// check if any one of the methodActivitiesis present in the
			// userActivities
			if ((userActivities != null) && (!userActivities.isEmpty())
					&& (methodActivities != null)
					&& (!methodActivities.isEmpty())) {
				for (ActivityEO methodActivity : methodActivities) {
					for (ActivityEO userActivity : userActivities) {
						if (methodActivity.getActivityId().equals(
								userActivity.getActivityId())) {
							isAuthorized = true;
						}
					}
					if (isAuthorized) {
						break;
					}
				}
			}
		}
		if (!isAuthorized) {
			logger.error("User is not authorized to invoke the method: "
					+ methodName);
			throw new UserAuthorizationException(
					"User is not authorized to invoke the method: "
							+ methodName);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.aop.AfterReturningAdvice#afterReturning(java.lang.Object,
	 *      java.lang.reflect.Method, java.lang.Object[], java.lang.Object)
	 */
	public void afterReturning(Object arg0, Method arg1, Object[] arg2,
			Object arg3) throws Throwable {
		logger.info("Ending method: " + arg1.getName());

	}

	public void afterThrowing(Method method, Object[] args, Object target,
			Throwable e) {
		logger.info("Exception in method: " + method.getName()
				+ ". Exception is: " + e.getMessage());
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
