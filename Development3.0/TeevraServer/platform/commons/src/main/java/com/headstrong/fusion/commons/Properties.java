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
 * $Id: Properties.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Feb 3, 2009 
 */

package com.headstrong.fusion.commons;

/**
 * 
 */
public interface Properties {

	/**
	 * Identifies if the application node is clustered.
	 */
	public static final String CLUSTERED = "clustered";

	/**
	 * Specifies what is node type possible values are
	 * <p>
	 * <li>Master</li>
	 * <li>Slave</li>
	 */
	public static final String CLUSTER_NODE_TYPE = "cluster.node.type";

	/**
	 * A Name assigned to this node to identify this is the clustered. If not
	 * specified a dynamically generated name will be assigned.
	 */
	public static final String CLUSTER_NODE_NAME = "cluster.node.name";

	/**
	 * A Name assigned to the cluster. If not specified a default name would be
	 * assigned.
	 */
	public static final String CLUSTER_NAME = "cluster.name";

	/**
	 * A unique id assigned to the cluster.
	 */
	public static final String CLUSTER_ID = "cluster.id";

	public static final String MEMBER_MASTER_NODE_TYPE = "Master";
	public static final String MEMBER_SLAVE_NODE_TYPE = "Slave";

	/**
	 * Process definition directory.
	 */
	public static final String PROCESS_HOME = "fusion.process.dir";
	/**
	 * Process files are temporarily stored at this directory.
	 */
	public static final String PROCESS_TEMP = "fusion.process.temp.dir";

	public static final String BUNDLES_DIR = "fusion.bundles.dir";

	/**
	 * Protocol stack file for Jgroups communication channel.
	 * 
	 */
	public static final String CLUSTER_COMM_PROTOCOL_FILE = "cluster.comm.protocol.file";

	public static final String FUSION_TEMP = "fusion.temp.dir";

	/**
	 * Event-Logging related configurations
	 */
	public static final String EVENT_LOG_STORAGE = "eventlog.storage";

	/**
	 * Queue names for event logging
	 */
	public static final String PRCS_EVENTLOG_QUEUE = "process.eventlog.queue";
	public static final String MSG_EVENTLOG_QUEUE = "message.eventlog.queue";
	public static final String COMP_EVENTLOG_QUEUE = "component.eventlog.queue";
	/**
	 * Configuration for mq
	 */
	public static final String QUEUE_PROVIDER_TYPE = "queue.provider.type";
	public static final String JMS_BROKER_URL = "jms.broker.url";
	public static final String PORT = "port";
	public static final String CHANNEL = "channel";
	public static final String QUEUE_MANAGER = "queue.manager";
	public static final String USER_NAME = "user.name";
	public static final String PASSWORD = "password";

	/**
	 * File names for event logging
	 */
	public static final String PRCS_EVENTLOG_FILE = "process.eventlog.file";
	public static final String MSG_EVENTLOG_FILE = "message.eventlog.file";
	public static final String COMP_EVENTLOG_FILE = "component.eventlog.file";

	/**
	 * Configurations for file event-logging
	 */
	public static final String DIRECTORY_LOCATION = "directory.location";

}
