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
 * $Id: QueueManager.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Sep 2, 2009 
 */

package com.headstrong.fusion.connector.test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * 
 */
public class QueueManager {

	private static QueueManager queueManager = new QueueManager();

	private QueueManager() {

	}

	public static QueueManager getInstance() {
		return queueManager;
	}

	private Map<String, BlockingQueue<String>> queueMap = new HashMap<String, BlockingQueue<String>>();

	public BlockingQueue<String> getQueue(String processId, String serviceId) {
		if (!queueMap.containsKey(processId + "<>" + serviceId)) {
			queueMap.put(processId + "<>" + serviceId,
					new ArrayBlockingQueue<String>(2000));
		}
		return queueMap.get(processId + "<>" + serviceId);
	}

}
