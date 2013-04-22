/*
 * The information in this document is subject to change without notice and 
 * does not represent a commitment by Headstrong Corporation. The software 
 * and/or databases described in this document are furnished under a license 
 * agreement and may be used or copied only in accordance with the terms of 
 * the agreement. 
 * 
 * Copyright Â© 2008 Headstrong Corporation
 * All rights reserved.
 * 
 * $Id: QueueManagerAccessor.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Sep 2, 2009 
 */

package com.headstrong.fusion.connector.test;

/**
 * 
 */
public class QueueManagerAccessor implements QueueManagerAccessorMBean {

	private QueueManager queueManager;

	public QueueManagerAccessor(QueueManager queueManager) {
		this.queueManager = queueManager;
	}

	/**
	 * @return the queueManager
	 */
	public QueueManager getQueueManager() {
		return queueManager;
	}

	/**
	 * @param queueManager
	 *            the queueManager to set
	 */
	public void setQueueManager(QueueManager queueManager) {
		this.queueManager = queueManager;
	}

	public void push(String processId, String serviceId, String data)
			throws Exception {
		this.queueManager.getQueue(processId, serviceId).put(data);
	}

	public String poll(String processId, String serviceId) throws Exception {
		return this.queueManager.getQueue(processId, serviceId).poll();
	}
}
