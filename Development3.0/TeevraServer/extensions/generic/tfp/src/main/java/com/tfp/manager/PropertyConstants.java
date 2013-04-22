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
 * $Id: PropertyConstants.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Apr 9, 2010 
 */
package com.tfp.manager;

/**
 * This file is provided by MCH team for TFP integration. PropertiesManager class.
 * Constant class containing nodes in the mch.properties file.
 */
public final class PropertyConstants {
	
	private PropertyConstants() {}
	
	public static final String BATCH_MANAGER="batchManagerImplClass";
	public static final String DEFAULT_BATCH_MANAGER="com.tfp.manager.GenericBatchManager";
	public static final String PARTITION_MANAGER="partitionManagerImplClass";
	public static final String EVENT_MANAGER="eventManagerImplClass";
	public static final String DEFAULT_EVENT_MGR = "com.tfp.event.LogManager";
	public static final String CONTEXT_FACTORY = "InitialContextFactory";
	public static final String PROVIDER_URL = "ProviderURL";
	public static final String TEDI_SOURCE_NAME = "SourceName";
	public static final String RECORD = "Record";
	public static final String RECORD_TYPE = "RecordType";
	public static final String PARTITION_JNDI = "PartitionJNDIName";
	public static final String TRANSACTION_JNDI = "TransactionJNDIName";
	public static final String PARTITION_CONNFACTORY = "PartionConnFactory";
	public static final String TRANSACTION_CONNFACTORY = "TransactionConnFactory";
	public static final String PARTITION_RETRY_COUNT = "PartitionRetryCount";
	public static final String PARTITION_RETRY_WAIT = "PartitionRetryWait";
	public static final String TRANSACTION_RETRY_COUNT = "TransactionRetryCount";
	public static final String TRANSACTION_RETRY_WAIT = "TransactionRetryWait";
	
	public static final String SDM_BATCH_TYPE = "SDM";
	public static final String CAMEL_FOLDER_PATTERN = ".camel";
}
