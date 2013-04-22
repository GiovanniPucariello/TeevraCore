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
 * $Id: QpidQueueMessageListener.java
 * $Revision: 
 * $Author: NBagchi
 * $DateTime: Apr 12, 2011 
 */
package com.headstrong.fusion.connector.qpid;

/**
 * Define all Qpid Constants.
 */
public class QpidConstants {

	// Constants related to connection establishment and loading qpid initial context.
	public static final String JNDI_INITIAL_NAME = "java.naming.factory.initial";
	public static final String JNDI_INITIAL_VALUE = "org.apache.qpid.jndi.PropertiesFileInitialContextFactory";
	public static final String CONNECTION_FACTORY_NAME = "connectionfactory.local";
	public static final String QUEUE_NAME = "destination.queueName";
}
