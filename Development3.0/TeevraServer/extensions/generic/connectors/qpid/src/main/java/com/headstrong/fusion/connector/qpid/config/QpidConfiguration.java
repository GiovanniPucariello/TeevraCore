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
 * $Id: QpidConfiguration.java
 * $Revision: 
 * $Author: NBagchi
 * $DateTime: Apr 12, 2011 
 */
package com.headstrong.fusion.connector.qpid.config;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.exception.DecryptionException;
import com.headstrong.fusion.commons.exception.InitializationException;
import com.headstrong.fusion.commons.util.FusionUtil;

/**
 * Qpid configuration.
 * 
 */
public class QpidConfiguration {

	/**
	 * Queue name
	 */
	private String queueName;
	
	/**
	 * Queue URL
	 */
	private String queueUrl;
	/**
	 * Thread Count to support concurrency.
	 */	
	private int threadCount = 1;
	/**
	 * Logger
	 */
	private static final Logger logger = LoggerFactory
			.getLogger(QpidConfiguration.class);

	/**
	 * Constructor
	 * @param properties
	 * @throws InitializationException
	 */
	public QpidConfiguration(Map<String, String> properties)
			throws InitializationException {

		String queueName = properties.get("queueName");
		if (queueName != null && !queueName.trim().equals("")) {
			setQueueName(queueName);
		} else {
			String errStr = "Invalid queue name.";
			logger.error(errStr);
			throw new InitializationException(errStr);
		}
		
		String queueUrl = properties.get("queueUrl");
		if (queueUrl != null && !queueUrl.trim().equals("")) {
			setQueueUrl(queueUrl.trim());
		} else {
			String errStr = "Invalid Queue URL";
			logger.error(errStr);
			throw new InitializationException(errStr);
		}
		
		String threadCount = properties.get("threadCount");
		if (threadCount != null && !threadCount.trim().equals("")) {
			setThreadCount(Integer.parseInt(threadCount));
		} else {
			String errStr = "Invalid thread count.";
			logger.error(errStr);
			throw new InitializationException(errStr);
		}
	}

	/**
	 * Fetch the queue name
	 * @return
	 */
	public String getQueueName() {
		return queueName;
	}

	/**
	 * Set queue name
	 * @param queueName The queue name to set
	 */
	public void setQueueName(String queueName) {
		this.queueName = queueName;
	}

	/**
	 * Fetch the queue url
	 * @return
	 */
	public String getQueueUrl() {
		return queueUrl;
	}

	/**
	 * Set queue url
	 * @param queueUrl The queue url to set
	 */
	public void setQueueUrl(String queueUrl) {
		this.queueUrl = queueUrl;
	}

	/**
	 * Returns the thread count used to set concurrent consumers.
	 * @return
	 */
	public int getThreadCount() {
		return threadCount;
	}

	/**
	 * Sets the thread count used to set concurrent consumers.
	 * @param threadCount
	 */
	public void setThreadCount(int threadCount) {
		if (this.threadCount > 1)
			this.threadCount = threadCount;
	}
}
