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
 * $Id: ProcessObject.java
 */
package com.tfp.interfaces;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import com.headstrong.fusion.commons.component.FusionEndpoint;
import com.headstrong.fusion.commons.component.FusionProcessor;

/**
 * This file is provided by MCH team for TFP integration.
 */
public interface ProcessObject extends Serializable, Cloneable {

	public Object clone() throws CloneNotSupportedException;

	public String getBatchID();

	/**
	 * Set for batchID
	 * 
	 * @param batchID
	 */
	public void setBatchID(String batchID);

	/**
	 * Get for batchType
	 * 
	 * @return batchType
	 */
	public String getBatchType();

	/**
	 * Set for batchType
	 * 
	 * @param batchType
	 */
	public void setBatchType(String batchType);

	/**
	 * Get for batchName
	 * 
	 * @return batchName
	 */
	public String getBatchName();

	/**
	 * Set for batchName
	 * 
	 * @param batchName
	 */
	public void setBatchName(String batchName);

	/**
	 * Get for batchSize
	 * 
	 * @return batchSize
	 */
	public long getBatchSize();

	/**
	 * Set for batchSize
	 * 
	 * @param batchSize
	 */
	public void setBatchSize(long batchSize);

	/**
	 * Get for partitionID
	 * 
	 * @return partitionID
	 */
	public String getPartitionID();

	/**
	 * Set for partitionID
	 * 
	 * @param partitionID
	 */
	public void setPartitionID(String partitionID);

	/**
	 * Get for partitionType
	 * 
	 * @return
	 */
	public String getPartitionType();

	/**
	 * Set for partitionType
	 * 
	 * @param partitionType
	 */
	public void setPartitionType(String partitionType);

	/**
	 * Get for partitionSize
	 * 
	 * @return partitionSize
	 */
	public long getPartitionSize();

	/**
	 * Set method for partitionSize
	 * 
	 * @param partitionSize
	 */
	public void setPartitionSize(long partitionSize);

	/**
	 * Get method for transactionID
	 * 
	 * @return transactionID
	 */
	public String getTransactionID();

	/**
	 * Set method for transactionID
	 * 
	 * @param transactionID
	 */
	public void setTransactionID(String transactionID);

	/**
	 * Get method for transactionType
	 * 
	 * @return transactionType
	 */
	public String getTransactionType();

	/**
	 * Set method for transactionType
	 * 
	 * @param transactionType
	 */
	public void setTransactionType(String transactionType);

	/**
	 * Get method for transactionName
	 * 
	 * @return transactioName
	 */
	public String getTransactionName();

	/**
	 * Set method for transactionName
	 * 
	 * @param transactionName
	 */
	public void setTransactionName(String transactionName);

	/**
	 * Get method for payload
	 * 
	 * @return payload
	 */
	public Object getPayload();

	/**
	 * Set method for payload
	 * 
	 * @param payload
	 */
	public void setPayload(Object payload);

	/**
	 * Get method for payloadType
	 * 
	 * @return
	 */
	public String getPayloadType();

	/**
	 * Set method for payloadType
	 * 
	 * @param payloadType
	 */
	public void setPayloadType(String payloadType);

	/**
	 * Get method for UserAttributes
	 * 
	 * @return userAttributes
	 */
	public List<UserAttribute<?, ?>> getUserAttributes();

	/**
	 * Set method for UserAttributes
	 * 
	 * @param userAttributes
	 */
	public void setUserAttributes(List<UserAttribute<?, ?>> userAttributes);

	/**
	 * Get method for sourceID
	 * 
	 * @return sourceID
	 */
	public String getSourceID();

	/**
	 * Set method for sourceID
	 * 
	 * @param sourceID
	 */
	public void setSourceID(String sourceID);

	/**
	 * Get method for sourceTimestamp
	 * 
	 * @return sourceTimestamp
	 */
	public Timestamp getSourceTimestamp();

	/**
	 * Set method for sourceTimestamp
	 * 
	 * @param sourceTimestamp
	 */
	public void setSourceTimestamp(Timestamp sourceTimestamp);

	/**
	 * Get method for fileName
	 * 
	 * @return fileName
	 */
	public String getFileName();

	/**
	 * Set method for fileName
	 * 
	 * @param fileName
	 */
	public void setFileName(String fileName);

	/**
	 * Check if pay load is null.
	 */
	public boolean isPayloadNull();

	/**
	 * Set the passed end point.
	 * 
	 * @param endPoint
	 *            The end point.
	 */
	public void setEndpoint(FusionEndpoint endpoint);

	/**
	 * Get the fusion endpoint
	 * 
	 * @return the FusionEndpoint
	 */
	public FusionEndpoint getEndpoint();

	/**
	 * Get the fusion processor.
	 * 
	 * @return The fusion processor.
	 */
	public FusionProcessor getProcessor();

	/**
	 * Set the processor.
	 * 
	 * @param processor
	 *            The fusion processor.
	 */
	public void setProcessor(FusionProcessor processor);

}
