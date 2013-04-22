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
 * $Id: ManagedBeanCreatorImpl.java
 * $Revision: 
 * $Author: MBafna
 * $DateTime: Sep 19, 2008 
 */

package com.headstrong.fusion.remote.impl;

import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.HashMap;
import java.util.Map;

import javax.management.MBeanAttributeInfo;
import javax.management.MBeanConstructorInfo;
import javax.management.MBeanInfo;
import javax.management.MBeanNotificationInfo;
import javax.management.MBeanOperationInfo;
import javax.management.MBeanServer;
import javax.management.ObjectName;
import javax.management.remote.JMXConnectorServer;
import javax.management.remote.JMXConnectorServerFactory;
import javax.management.remote.JMXServiceURL;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.remote.ManagedBeanCreator;


/**
 * Default implementation of ManagedBeanCreator
 */
public class ManagedBeanCreatorImpl implements ManagedBeanCreator {

	private final MBeanServer mbs;
	private final static String domain = "fusion";
	private final static Logger logger = LoggerFactory
			.getLogger(ManagedBeanCreatorImpl.class);

	/**
	 * Constructor for <code> ManagedBeanCreatorImpl </code>
	 * 
	 */
	public ManagedBeanCreatorImpl(int port, String urlStr ) {
		logger.info("Starting Managed bean server");
		mbs = ManagementFactory.getPlatformMBeanServer();
		System.setProperty("java.rmi.server.randomIDs", "true");

		try {
			LocateRegistry.createRegistry(port);
		} catch (RemoteException e) {
			logger.error(e.getMessage());
		}

			Map env = new HashMap();
			env.put("com.sun.management.jmxremote.ssl", false);
			env.put("com.sun.management.jmxremote.autheticate", true);
			env.put(JMXConnectorServer.AUTHENTICATOR, new FusionJMXAuthenticator());
		// Create the JMXCconnectorServer
		JMXServiceURL url = null;
		try {
			url = new  JMXServiceURL(urlStr);
		} catch (Exception e1) {
			logger.error(e1.getMessage());
		} 
		JMXConnectorServer cs = null;
		try {
			cs = JMXConnectorServerFactory.newJMXConnectorServer(url, env, mbs);
		} catch (IOException e) {
			logger.error(e.getMessage());
		}
		try {
			cs.start();
			logger.info("JMX server started.");
		} catch (IOException e) {
			logger.error(e.getMessage());
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.remote.ManagedBeanCreator#registerMBean(java.lang.Object,
	 *      java.lang.String, java.lang.String)
	 */
	public void registerMBean(Object bean, String beanName, String beanType)
			throws Exception {
		// String mbeanClassName = bean.getClass().getName();
		String mbeanObjectStr = domain + ":type=" + beanType + ",index="
				+ beanName;
		try {
			logger.debug("Registering bean :" + mbeanObjectStr);
			mbs.registerMBean(bean, ObjectName.getInstance(mbeanObjectStr));
			printMBeanInfo(beanName, beanType);
		} catch (Exception e) {
			logger.error("Error while registering ", e);
			throw e;
		}
	}

	/* (non-Javadoc)
	 * @see com.headstrong.fusion.remote.ManagedBeanCreator#unRegisterMBean(java.lang.String, java.lang.String)
	 */
	public void unRegisterMBean(String beanName, String beanType)
			throws Exception {

		String mbeanObjectStr = domain + ":type=" + beanType + ",index="
				+ beanName;
		try {
			logger.debug("unRegistering bean :" + mbeanObjectStr);
			mbs.unregisterMBean(ObjectName.getInstance(mbeanObjectStr));
		} catch (Exception e) {
			logger.error("Error while unregistering ", e);
			throw e;
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.remote.ManagedBeanCreator#destroy()
	 */
	public void destroy() {
		// nothing to be done as of now

	}

	/**
	 * Prints the MBean registered with the server
	 * 
	 * @precondition
	 * @postcondition
	 * @param beanName
	 *            Name of the bean
	 * @param beanType
	 *            Type of the bean
	 */
	public void printMBeanInfo(String beanName, String beanType) {
		logger.debug("Retrieve the management information for the " + beanName);
		String mbeanObjectStr = domain + ":type=" + beanType + ",index="
				+ beanName;

		MBeanInfo info = null;
		try {
			info = mbs.getMBeanInfo(ObjectName.getInstance(mbeanObjectStr));
		} catch (Exception e) {
			logger.debug(" Could not get MBeanInfo object for " + beanName, e);
			return;
		}
		logger.debug("CLASSNAME: " + info.getClassName());
		logger.debug("DESCRIPTION: " + info.getDescription());
		MBeanAttributeInfo[] attrInfo = info.getAttributes();
		logger.debug("ATTRIBUTES");
		if (attrInfo.length > 0) {
			for (int i = 0; i < attrInfo.length; i++) {
				logger.debug("NAME:" + attrInfo[i].getName() + " DESCR:"
						+ attrInfo[i].getDescription() + " TYPE:"
						+ attrInfo[i].getType() + "READ:"
						+ attrInfo[i].isReadable() + "WRITE: "
						+ attrInfo[i].isWritable());
			}
		} else {
			logger.debug("No attributes");
		}
		logger.debug("CONSTRUCTORS");
		MBeanConstructorInfo[] constrInfo = info.getConstructors();
		for (int i = 0; i < constrInfo.length; i++) {
			logger.debug("NAME:" + constrInfo[i].getName() + "DESCR:"
					+ constrInfo[i].getDescription() + "PARAM:"
					+ constrInfo[i].getSignature().length);
		}
		MBeanOperationInfo[] opInfo = info.getOperations();
		logger.debug("OPERATIONS");
		if (opInfo.length > 0) {
			for (int i = 0; i < opInfo.length; i++) {
				logger.debug("NAME:" + opInfo[i].getName() + "DESCR:"
						+ opInfo[i].getDescription() + "PARAM:"
						+ opInfo[i].getSignature().length);
			}
		} else {
			logger.debug(" ** No operations ** ");
		}
		logger.debug("NOTIFICATIONS");
		MBeanNotificationInfo[] notifInfo = info.getNotifications();
		if (notifInfo.length > 0) {
			for (int i = 0; i < notifInfo.length; i++) {
				logger.debug("NAME:" + notifInfo[i].getName() + " DESCR:"
						+ notifInfo[i].getDescription());
				String notifTypes[] = notifInfo[i].getNotifTypes();
				for (int j = 0; j < notifTypes.length; j++) {
					logger.debug("TYPE:" + notifTypes[j]);
				}
			}
		} else {
			logger.debug("No notifications");
		}
	}

	/**
	 * @return {@link MBeanServer}
	 */
	public MBeanServer getMbs() {
		return mbs;
	}

}
