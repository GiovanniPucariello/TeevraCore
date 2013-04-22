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
 * $Id: MQConnectionPool.java
 * $Revision: 
 * $Author: viswanathp
 * $DateTime: Jun 21, 2010 
 */

package com.headstrong.fusion.eventlogger.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * MQConnectionPool maintains pool for every MQ connection created through
 * {@link MQConnectionManager}
 */
public class MQConnectionPool {

	private static Logger logger = LoggerFactory
			.getLogger(MQConnectionPool.class);
}
