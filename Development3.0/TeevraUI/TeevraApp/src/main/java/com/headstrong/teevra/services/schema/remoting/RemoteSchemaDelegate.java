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
 * $Id: RemoteProcessAdminDelegate.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Nov 13, 2009 
 */

package com.headstrong.teevra.services.schema.remoting;

import javax.management.InstanceNotFoundException;
import javax.management.ObjectName;
import javax.naming.ServiceUnavailableException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.teevra.common.config.ConfigurationReader;
import com.headstrong.teevra.common.remoting.FusionRemoteDelegate;
import com.headstrong.teevra.services.processadmin.exception.ProcessPublishException;
import com.headstrong.teevra.services.schema.exception.RemoteSchemaReloadException;
import com.headstrong.teevra.services.schema.exception.SchemaServiceException;

/**
 * Interacts with fusion runtime using JMX API to realize schema operations
 */
public class RemoteSchemaDelegate extends FusionRemoteDelegate {

	/**
	 * Logger for RemoteSchemaDelegate
	 */
	private static Logger logger = LoggerFactory
			.getLogger(RemoteSchemaDelegate.class);

	private static final String DOMAIN = "fusion";
	private static final String BEAN_TYPE = "SchemaContext";
	private static final String BEAN_NAME = "Schema Context";

	// private static final String KEY_JMX_URL = "jmxUrl";
	private static final String KEY_DOMAIN = "domain";
	private static final String KEY_BEAN_TYPE = "remoteSchemaBeanType";
	private static final String KEY_BEAN_NAME = "remoteSchemaBeanName";

	private static RemoteSchemaDelegate instance = new RemoteSchemaDelegate();

	private RemoteSchemaDelegate() {
	}

	public static RemoteSchemaDelegate getInstance() {
		return instance;
	}

	/**
	 * Refreshes ObjectDescriptor/Schema cache through JMX
	 * 
	 * @precondition
	 * @postcondition
	 * @param xml
	 * @param jmxUrl
	 *            URL of the Server where the schema cache has to be reloaded
	 * @throws ProcessPublishException
	 */
	public void reloadSchemaCache(String jmxUrl)
			throws RemoteSchemaReloadException {
		// String[] signature = new String[1];
		// signature[0] = null;

		try {
			invoke("reloadSchemaCache", jmxUrl);
		} catch (SchemaServiceException e) {
			logger.error("Exception while invoking remote method ", e);
			throw new RemoteSchemaReloadException(e.getMessage());
		}

	}

	/**
	 * creates mbean name before invoking super class
	 * 
	 * @precondition
	 * @postcondition
	 * @param method
	 * @param jmxUrl
	 * @throws SchemaServiceException
	 */
	private void invoke(String method, String jmxUrl)
			throws SchemaServiceException {
		ConfigurationReader config = ConfigurationReader.getInstance();

		String domain = config.getConfigValue(KEY_DOMAIN);
		String beanType = config.getConfigValue(KEY_BEAN_TYPE);
		String beanName = config.getConfigValue(KEY_BEAN_NAME);

		domain = (domain != null) ? domain : DOMAIN;
		beanType = (beanType != null) ? beanType : BEAN_TYPE;
		beanName = (beanName != null) ? beanName : BEAN_NAME;

		try {

			ObjectName mbeanName = ObjectName.getInstance(domain + ":type="
					+ beanType + ",index=" + beanName);
			super.invoke(method, null, null, jmxUrl, mbeanName);

		} catch (InstanceNotFoundException e1) {
			logger.debug("Cannot make connection with the server " + jmxUrl
					+ " Instance of server might not be started");
		} catch (Exception e) {
			if ((e.getCause().getClass()
					.equals(ServiceUnavailableException.class))) {
				logger.debug("Cannot make connection with the server " + jmxUrl
						+ " Server might not be started");
			} else {
				logger
						.error(
								"Exception while refreshing schema cache on server ",
								e);
				throw new SchemaServiceException(e.getMessage());

			}
		}

	}
}
