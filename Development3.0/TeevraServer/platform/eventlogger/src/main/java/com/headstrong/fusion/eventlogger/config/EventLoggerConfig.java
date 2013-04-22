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
 * $Id: EventLoggerConfig.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Jul 8, 2010 
 */

package com.headstrong.fusion.eventlogger.config;

import org.osgi.framework.BundleContext;

import com.headstrong.fusion.commons.Properties;

/**
 * Configurations provided for Event logging
 */
public class EventLoggerConfig {

	/**
	 * Type of Event log Storage configured in properties file
	 */
	private String eventlogStorage;

	/**
	 * Queue names for event logging provided in properties file, if eventlog
	 * storage is MQ
	 */
	private String prcsEventlogQueue;
	private String msgEventlogQueue;
	private String compEventlogQueue;

	/**
	 * Queue Details
	 */
	private String queueProviderType;
	private String jmsBrokerUrl;
	private String port;
	private String channel;
	private String queueManager;
	private String userName;
	private String password;

	/**
	 * File names for event logging provided in properties file, if eventlog
	 * storage is File
	 */
	private String prcsEventlogFile;
	private String msgEventlogFile;
	private String compEventlogFile;

	/**
	 * Folder Details
	 */
	private String dirLocation;

	public EventLoggerConfig(BundleContext bundleContext) {
		if (bundleContext.getProperty(Properties.EVENT_LOG_STORAGE) != null) {
			this.setEventlogStorage(bundleContext.getProperty(
					Properties.EVENT_LOG_STORAGE).trim());

		}
		if (bundleContext.getProperty(Properties.PRCS_EVENTLOG_QUEUE) != null) {
			this.setPrcsEventlogQueue(bundleContext.getProperty(
					Properties.PRCS_EVENTLOG_QUEUE).trim());

		}
		if (bundleContext.getProperty(Properties.PRCS_EVENTLOG_QUEUE) != null) {
			this.setPrcsEventlogQueue(bundleContext.getProperty(
					Properties.PRCS_EVENTLOG_QUEUE).trim());

		}
		if (bundleContext.getProperty(Properties.MSG_EVENTLOG_QUEUE) != null) {
			this.setMsgEventlogQueue(bundleContext.getProperty(
					Properties.MSG_EVENTLOG_QUEUE).trim());

		}
		if (bundleContext.getProperty(Properties.COMP_EVENTLOG_QUEUE) != null) {
			this.setCompEventlogQueue(bundleContext.getProperty(
					Properties.COMP_EVENTLOG_QUEUE).trim());

		}

		if (bundleContext.getProperty(Properties.QUEUE_PROVIDER_TYPE) != null) {
			this.setQueueProviderType(bundleContext.getProperty(
					Properties.QUEUE_PROVIDER_TYPE).trim());

		}
		if (bundleContext.getProperty(Properties.JMS_BROKER_URL) != null) {
			this.setJmsBrokerUrl(bundleContext.getProperty(
					Properties.JMS_BROKER_URL).trim());

		}
		if (bundleContext.getProperty(Properties.PORT) != null) {
			this.setPort(bundleContext.getProperty(Properties.PORT).trim());
		}
		if (bundleContext.getProperty(Properties.CHANNEL) != null) {
			this.setChannel(bundleContext.getProperty(Properties.CHANNEL)
					.trim());
		}
		if (bundleContext.getProperty(Properties.QUEUE_MANAGER) != null) {
			this.setQueueManager(bundleContext.getProperty(
					Properties.QUEUE_MANAGER).trim());

		}
		if (bundleContext.getProperty(Properties.USER_NAME) != null) {
			this.setUserName(bundleContext.getProperty(Properties.USER_NAME)
					.trim());
		}

		if (bundleContext.getProperty(Properties.PASSWORD) != null) {
			this.setPassword(bundleContext.getProperty(Properties.PASSWORD)
					.trim());
		}

		if (bundleContext.getProperty(Properties.PRCS_EVENTLOG_FILE) != null) {
			this.setPrcsEventlogFile(bundleContext.getProperty(
					Properties.PRCS_EVENTLOG_FILE).trim());

		}
		if (bundleContext.getProperty(Properties.MSG_EVENTLOG_FILE) != null) {
			this.setMsgEventlogFile(bundleContext.getProperty(
					Properties.MSG_EVENTLOG_FILE).trim());
		}

		if (bundleContext.getProperty(Properties.COMP_EVENTLOG_FILE) != null) {
			this.setCompEventlogFile(bundleContext.getProperty(
					Properties.COMP_EVENTLOG_FILE).trim());

		}
		if (bundleContext.getProperty(Properties.DIRECTORY_LOCATION) != null) {
			this.setDirLocation(bundleContext.getProperty(
					Properties.DIRECTORY_LOCATION).trim());

		}

	}

	/**
	 * @return the eventlogStorage
	 */
	public String getEventlogStorage() {
		return eventlogStorage;
	}

	/**
	 * @param eventlogStorage
	 *            the eventlogStorage to set
	 */
	public void setEventlogStorage(String eventlogStorage) {
		this.eventlogStorage = eventlogStorage;
	}

	/**
	 * @return the prcsEventlogQueue
	 */
	public String getPrcsEventlogQueue() {
		return prcsEventlogQueue;
	}

	/**
	 * @param prcsEventlogQueue
	 *            the prcsEventlogQueue to set
	 */
	public void setPrcsEventlogQueue(String prcsEventlogQueue) {
		this.prcsEventlogQueue = prcsEventlogQueue;
	}

	/**
	 * @return the msgEventlogQueue
	 */
	public String getMsgEventlogQueue() {
		return msgEventlogQueue;
	}

	/**
	 * @param msgEventlogQueue
	 *            the msgEventlogQueue to set
	 */
	public void setMsgEventlogQueue(String msgEventlogQueue) {
		this.msgEventlogQueue = msgEventlogQueue;
	}

	/**
	 * @return the compEventlogQueue
	 */
	public String getCompEventlogQueue() {
		return compEventlogQueue;
	}

	/**
	 * @param compEventlogQueue
	 *            the compEventlogQueue to set
	 */
	public void setCompEventlogQueue(String compEventlogQueue) {
		this.compEventlogQueue = compEventlogQueue;
	}

	/**
	 * @return the queueProviderType
	 */
	public String getQueueProviderType() {
		return queueProviderType;
	}

	/**
	 * @param queueProviderType
	 *            the queueProviderType to set
	 */
	public void setQueueProviderType(String queueProviderType) {
		this.queueProviderType = queueProviderType;
	}

	/**
	 * @return the jmsBrokerUrl
	 */
	public String getJmsBrokerUrl() {
		return jmsBrokerUrl;
	}

	/**
	 * @param jmsBrokerUrl
	 *            the jmsBrokerUrl to set
	 */
	public void setJmsBrokerUrl(String jmsBrokerUrl) {
		this.jmsBrokerUrl = jmsBrokerUrl;
	}

	/**
	 * @return the port
	 */
	public String getPort() {
		return port;
	}

	/**
	 * @param port
	 *            the port to set
	 */
	public void setPort(String port) {
		this.port = port;
	}

	/**
	 * @return the channel
	 */
	public String getChannel() {
		return channel;
	}

	/**
	 * @param channel
	 *            the channel to set
	 */
	public void setChannel(String channel) {
		this.channel = channel;
	}

	/**
	 * @return the queueManager
	 */
	public String getQueueManager() {
		return queueManager;
	}

	/**
	 * @param queueManager
	 *            the queueManager to set
	 */
	public void setQueueManager(String queueManager) {
		this.queueManager = queueManager;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the prcsEventlogFile
	 */
	public String getPrcsEventlogFile() {
		return prcsEventlogFile;
	}

	/**
	 * @param prcsEventlogFile
	 *            the prcsEventlogFile to set
	 */
	public void setPrcsEventlogFile(String prcsEventlogFile) {
		this.prcsEventlogFile = prcsEventlogFile;
	}

	/**
	 * @return the msgEventlogFile
	 */
	public String getMsgEventlogFile() {
		return msgEventlogFile;
	}

	/**
	 * @param msgEventlogFile
	 *            the msgEventlogFile to set
	 */
	public void setMsgEventlogFile(String msgEventlogFile) {
		this.msgEventlogFile = msgEventlogFile;
	}

	/**
	 * @return the compEventlogFile
	 */
	public String getCompEventlogFile() {
		return compEventlogFile;
	}

	/**
	 * @param compEventlogFile
	 *            the compEventlogFile to set
	 */
	public void setCompEventlogFile(String compEventlogFile) {
		this.compEventlogFile = compEventlogFile;
	}

	/**
	 * @return the dirLocation
	 */
	public String getDirLocation() {
		return dirLocation;
	}

	/**
	 * @param dirLocation
	 *            the dirLocation to set
	 */
	public void setDirLocation(String dirLocation) {
		this.dirLocation = dirLocation;
	}
}
