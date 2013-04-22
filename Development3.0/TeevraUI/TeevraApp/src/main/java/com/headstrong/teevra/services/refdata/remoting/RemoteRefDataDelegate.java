/*
 * The information in this document is subject to change without notice and 
 * does not represent a commitment by Headstrong Corporation. The software 
 * and/or databases described in this document are furnished under a license 
 * agreement and may be used or copied only in accordance with the terms of 
 * the agreement. 
 * 
 * Copyright � 2008 Headstrong Corporation
 * All rights reserved.
 * 
 * $Id: RemoteRefDataDelegate.java
 * $Revision: 
 * $Author: NBagchi
 * $DateTime: Sep 10, 2010 
 */

package com.headstrong.teevra.services.refdata.remoting;

import java.util.Date;

import javax.management.ObjectName;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.teevra.common.config.ConfigurationReader;
import com.headstrong.teevra.common.remoting.FusionRemoteDelegate;
import com.headstrong.teevra.common.scheduling.Recurrence;
import com.headstrong.teevra.services.refdata.eo.CacheReloadScheduleEO;
import com.headstrong.teevra.services.refdata.exception.RefDataServiceException;

/**
 * Interacts with fusion runtime using JMX API to realize Ref data related
 * operations
 */
public class RemoteRefDataDelegate extends FusionRemoteDelegate {

	/**
	 * Logger for RemoteRefDataDelegate
	 */
	private static Logger logger = LoggerFactory
			.getLogger(RemoteRefDataDelegate.class);

	private static final String DOMAIN = "fusion";
	private static final String BEAN_TYPE = "ApplicationContext";
	private static final String BEAN_NAME = "Application Context";

	private static final String KEY_DOMAIN = "domain";
	private static final String KEY_BEAN_TYPE = "beanType";
	private static final String KEY_BEAN_NAME = "beanName";

	private static RemoteRefDataDelegate instance = new RemoteRefDataDelegate();

	private RemoteRefDataDelegate() {
	}

	public static RemoteRefDataDelegate getInstance() {
		return instance;
	}

	/**
	 * Creates mbean name before invoking super class
	 * 
	 * @precondition
	 * @postcondition
	 * @param method
	 * @param params
	 * @param signature
	 * @param jmxUrl
	 * @throws RefDataServiceException
	 */
	private void invoke(String method, Object[] params, String[] signature,
			String jmxUrl) throws RefDataServiceException {

		ConfigurationReader config = ConfigurationReader.getInstance();
		String domain = config.getConfigValue(KEY_DOMAIN);
		String beanType = config.getConfigValue(KEY_BEAN_TYPE);
		String beanName = config.getConfigValue(KEY_BEAN_NAME);

		domain = (domain != null) ? domain : DOMAIN;
		beanType = (beanType != null) ? beanType : BEAN_TYPE;
		beanName = (beanName != null) ? beanName : BEAN_NAME;

		ObjectName mbeanName = null;
		try {
			mbeanName = ObjectName.getInstance(domain + ":type=" + beanType
					+ ",index=" + beanName);
			super.invoke(method, params, signature, jmxUrl, mbeanName);
		} catch (Exception e) {
			logger.error("Exception while invoking remote method", e);
		}
	}

	/**
	 * Schedules reloading of cache through JMX
	 * 
	 * @precondition
	 * @postcondition
	 * @param schedule
	 * @param server
	 */
	public void scheduleCacheReload(CacheReloadScheduleEO schedule,
			String server) {

		String[] signature = new String[4];
		signature[0] = String.class.getName();
		signature[1] = Date.class.getName();
		signature[2] = Date.class.getName();
		signature[3] = String.class.getName();

		Recurrence recurrence = schedule.getRecurrence();
		Object[] params = new Object[4];
		params[0] = schedule.getCacheName().toString();
		params[1] = recurrence.getRecurrenceRange().getStartDate();
		params[2] = recurrence.getRecurrenceRange().getEndDate();
		params[3] = recurrence.getCronExpression();

		System.out.println("Cron Exp is "+params[3]);
		try {
			invoke("scheduleCacheReload", params, signature, server);
		} catch (RefDataServiceException e) {
			logger.error("Exception while invoking remote method", e);
		}
	}
}
