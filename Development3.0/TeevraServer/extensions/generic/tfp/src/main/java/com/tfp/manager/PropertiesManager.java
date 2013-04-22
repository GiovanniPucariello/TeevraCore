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
 * $Id: PropertiesManager.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Apr 9, 2010 
 */
package com.tfp.manager;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.connector.tfp.ContextNotInitializedException;
import com.tfp.properties.MCH;
import com.tfp.properties.TEDIParseConfigType;
import com.tfp.properties.TFPPartitionConfigType;
import com.tfp.properties.TFPTransactionConfigType;
import com.tfp.properties.TEDIParseConfigType.Record;
import com.tfp.properties.TEDIParseConfigType.Record.Observed;
import com.tfp.properties.TFPBatchConfigType.Managers;
import com.tfp.properties.TFPConfigType.Batch;
import com.tfp.properties.TFPConfigType.Server;

/**
 * This file is provided by MCH team for TFP integration. PropertiesManager
 * class.
 */

public class PropertiesManager {

	/**
	 * Properties manager singleton instance.
	 */
	private static PropertiesManager propertiesManager;

	/**
	 * MCH properties.
	 */
	private static MCH mchProperty = null;

	/**
	 * SDM properties.
	 */
	private static SDMProperties sdmProp;

	/**
	 * The logger
	 */
	private static Logger logger = LoggerFactory
			.getLogger(PropertiesManager.class);

	/**
	 * Default constructor loads the MCH properties from tfp_config.xml file.
	 */
	private PropertiesManager() throws Exception {
		loadMCHProperties();
	}

	/**
	 * Initialize the PropertiesManager.
	 * 
	 * @throws Exception
	 */
	public static synchronized void init() throws Exception {
		if (propertiesManager == null) {
			propertiesManager = new PropertiesManager();
		} else {
			logger.info("PropertiesManager already intiallized.");
		}
	}

	/**
	 * Get the properties manager singleton instance.
	 * 
	 * @return Properties manager instance.
	 */
	public static PropertiesManager getInstance() {
		if (propertiesManager == null) {
			String errStr = "PropertiesManager not initialized.";
			logger.error(errStr);
			throw new ContextNotInitializedException(errStr);
		}
		return propertiesManager;
	}

	/**
	 * Load MCH properties.
	 */
	private void loadMCHProperties() throws Exception {
		if (mchProperty == null) {
			mchProperty = PropertiesManagerUtil.loadProperties();
		}
		initializeSDMProperties();
	}

	/**
	 * Load SDM properties
	 * 
	 * @throws Exception
	 */
	private void initializeSDMProperties() throws Exception {
		List<Batch> batches = mchProperty.getTFP().getBatch();
		sdmProp = this.new SDMProperties();

		for (Batch batch : batches) {
			try {
				Managers managers = batch.getManagers();
				if (batch.getBatchType().equals(
						PropertyConstants.SDM_BATCH_TYPE)) {
					sdmProp
							.setBatchManager(managers
									.getBatchManagerImplClass());
					sdmProp.setPartitionManager(managers
							.getPartitionManagerImplClass());
				}
			} catch (Exception e) {
				String errStr = "Error in retrieving SDM properties from the properties file.";
				logger.error(errStr, e);
				throw new RuntimeException(errStr);
			}
		}
	}

	/**
	 * Get SDM properties.
	 * 
	 * @return SDMProperties
	 */
	public static SDMProperties getSDMProperties() {
		return sdmProp;
	}

	/**
	 * Get the MCH properties.
	 * 
	 * @return MCH properties.
	 */

	public static MCH getMchProperty() {
		return mchProperty;
	}

	/**
	 * Set the MCH properties.
	 * 
	 * @param mchProperty
	 *            MCH properties.
	 */

	public static void setMchProperty(MCH mchProperty) {
		PropertiesManager.mchProperty = mchProperty;
	}

	/*
	 * This method will replace the getMchProperty once all the field constants
	 * has been defined, instead of going through the whole MCH object
	 */
	// NOTE: This is HORRIBLE and must be replaced... :-)
	public static String getBatchProperty(String batchType, String field)
			throws Exception {
		List<Batch> batches = mchProperty.getTFP().getBatch();

		for (Batch batch : batches) {
			TFPPartitionConfigType partitionConfig = batch.getPartition();
			TEDIParseConfigType partitionParseConfig = partitionConfig
					.getTEDIParser();
			TFPTransactionConfigType transactionConfig = batch.getTransaction();

			try {
				if (batchType.equals(batch.getBatchType())) {
					if (field.equals(PropertyConstants.BATCH_MANAGER)) {
						return batch.getManagers().getBatchManagerImplClass();
					} else if (field
							.equals(PropertyConstants.PARTITION_MANAGER)) {
						return batch.getManagers()
								.getPartitionManagerImplClass();
					} else if (field.equals(PropertyConstants.EVENT_MANAGER)) {
						return batch.getManagers().getEventManagerImplClass();
					} else if (field.equals(PropertyConstants.TEDI_SOURCE_NAME)) {
						return partitionParseConfig.getSourceName();
					} else if (field.equals(PropertyConstants.PARTITION_JNDI)) {
						return partitionConfig.getDelivery().getJMS()
								.getJndiName();
					} else if (field
							.equals(PropertyConstants.PARTITION_CONNFACTORY)) {
						return partitionConfig.getDelivery().getJMS()
								.getConnectionFactory();
					} else if (field.equals(PropertyConstants.TRANSACTION_JNDI)) {
						return transactionConfig.getDelivery().getJMS()
								.getJndiName();
					} else if (field
							.equals(PropertyConstants.TRANSACTION_CONNFACTORY)) {
						return transactionConfig.getDelivery().getJMS()
								.getConnectionFactory();
					}
				}
			} catch (Exception e) {
				throw new RuntimeException("No " + field + " for " + batchType
						+ " was retrieved from the properties file.", e);
			}
		}
		return null;
	}

	/**
	 * Get the retry count/wait of the passed field, from the mchProperty.
	 * 
	 * @param batchType
	 *            The batch type.
	 * @param field
	 *            The field.
	 * @return The count/wait.
	 */
	public static int getRetryCountWait(String batchType, String field) {
		List<Batch> batches = mchProperty.getTFP().getBatch();

		for (Batch batch : batches) {
			TFPPartitionConfigType partitionConfig = batch.getPartition();
			TFPTransactionConfigType transactionConfig = batch.getTransaction();

			try {
				if (batchType.equals(batch.getBatchType())) {
					if (field.equals(PropertyConstants.PARTITION_RETRY_COUNT)) {
						return partitionConfig.getDelivery().getJMS()
								.getRetryCount();
					} else if (field
							.equals(PropertyConstants.PARTITION_RETRY_WAIT)) {
						return partitionConfig.getDelivery().getJMS()
								.getRetryWait();
					} else if (field
							.equals(PropertyConstants.TRANSACTION_RETRY_COUNT)) {
						return transactionConfig.getDelivery().getJMS()
								.getRetryCount();
					} else if (field
							.equals(PropertyConstants.TRANSACTION_RETRY_WAIT)) {
						return transactionConfig.getDelivery().getJMS()
								.getRetryWait();
					}
				}
			} catch (Exception e) {
				String errStr = "No " + field + " for " + batchType
						+ " was retrieved from the properties file.";
				logger.error(errStr, e);
				throw new RuntimeException(errStr);
			}
		}
		return 0;
	}

	/**
	 * Get the server property.
	 * 
	 * @param field
	 *            The field either to be the CONTEXT_FACTORY or PROVIDER_URL
	 * @return The value of the field.
	 */
	public static String getServerProperty(String field) {
		Server TFPServer = mchProperty.getTFP().getServer();

		if (field.equals(PropertyConstants.CONTEXT_FACTORY)) {
			return TFPServer.getInitialContextFactory();
		} else if (field.equals(PropertyConstants.PROVIDER_URL)) {
			return TFPServer.getProviderURL();
		}
		return null;
	}

	/**
	 * Get the record property of corresponding batch type and field.
	 * 
	 * @param batchType
	 *            Batch type.
	 * @param field
	 *            Field.
	 * @return The record.
	 */
	public static Record getRecordProperty(String batchType, String field) {
		List<Batch> batches = mchProperty.getTFP().getBatch();
		for (Batch batch : batches) {
			if (batchType.equals(batch.getBatchType())) {
				TFPPartitionConfigType configType = batch.getPartition();
				TEDIParseConfigType parseConfig = configType.getTEDIParser();
				if (field.equals(PropertyConstants.RECORD)) {
					return parseConfig.getRecord();
				}
			}
		}
		return null;
	}

	/**
	 * Get the Observed record type property of corresponding record and field.
	 * 
	 * @param record
	 *            Record.
	 * @param field
	 *            Field.
	 * @return The record type.
	 */
	public static String getObservedRecordType(Record record, String field) {
		List<Observed> observed = record.getObserved();

		for (Observed observes : observed) {
			if (field.equals(PropertyConstants.RECORD_TYPE)) {
				return observes.getRecordType();
			}
		}
		return field;
	}

	/**
	 * Bean to encapsulate SDM properties.
	 * 
	 * @author NBagchi
	 * 
	 */
	public class SDMProperties {

		/**
		 * Batch manager.
		 */
		private String batchManager;
		/**
		 * Partition manager.
		 */
		private String partitionManager;

		/**
		 * Get the Batch Manager.
		 * 
		 * @return
		 */
		public String getBatchManager() {
			return batchManager;
		}

		/**
		 * Set the Batch Manager.
		 * 
		 * @param the
		 *            batch manager.
		 */
		public void setBatchManager(String batchManager) {
			this.batchManager = batchManager;
		}

		/**
		 * Get partition manager.
		 * 
		 * @return The partition manager.
		 */
		public String getPartitionManager() {
			return partitionManager;
		}

		/**
		 * Set partition manager.
		 * 
		 * @param partitionManager
		 *            The partition manager.
		 */
		public void setPartitionManager(String partitionManager) {
			this.partitionManager = partitionManager;
		}
	}
}
