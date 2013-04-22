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
 * $Id: ProcessObjectImpl.java
 */
package com.tfp.impl;

import java.sql.Timestamp;
import java.util.List;

import com.headstrong.fusion.commons.component.FusionEndpoint;
import com.headstrong.fusion.commons.component.FusionProcessor;
import com.tfp.interfaces.ProcessObject;
import com.tfp.interfaces.UserAttribute;

/**
 * Implementation class of ProcessObject interface This file is provided by MCH
 * team for TFP integration.
 */
public class ProcessObjectImpl implements ProcessObject {

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	/**
	 * Generated serial id
	 */
	private static final long serialVersionUID = 722832580668977684L;

	/**
	 * Batch ID
	 */
	private String batchID;
	/**
	 * Batch Type
	 */
	private String batchType;
	/**
	 * Batch Name
	 */
	private String batchName;
	/**
	 * Batch Size
	 */
	private long batchSize;
	/**
	 * Partition ID
	 */
	private String partitionID;
	/**
	 * Partition Type
	 */
	private String partitionType;
	/**
	 * Partition size
	 */
	private long partitionSize;
	/**
	 * Transaction ID
	 */
	private String transactionID;
	/**
	 * Transaction Type
	 */
	private String transactionType;
	/**
	 * Transaction name
	 */
	private String transactionName;
	/**
	 * Pay load
	 */
	private Object payload;
	/**
	 * Pay load type
	 */
	private String payloadType;
	/**
	 * User Attributes
	 */
	private List<UserAttribute<?, ?>> userAttributes;
	/**
	 * Source ID
	 */
	private String sourceID;
	/**
	 * Source Timestamp
	 */
	private Timestamp sourceTimestamp;
	/**
	 * File name
	 */
	private String fileName;

	/**
	 * Fusion end point
	 */
	@SuppressWarnings("unchecked")
	private FusionEndpoint endPoint;

	/**
	 * Fusion processor
	 */
	@SuppressWarnings("unchecked")
	private FusionProcessor processor;

	/**
	 * Get Batch ID.
	 * 
	 * @return The Batch ID.
	 */
	public String getBatchID() {
		return batchID;
	}

	/**
	 * Set Batch id.
	 * 
	 * @param batchID
	 *            The Batch id.
	 */
	public void setBatchID(String batchID) {
		this.batchID = batchID;
	}

	/**
	 * Get Batch type.
	 * 
	 * @return The Batch type.
	 */
	public String getBatchType() {
		return batchType;
	}

	/**
	 * Set Batch type
	 * 
	 * @param batchID
	 *            The batch id.
	 */
	public void setBatchType(String batchType) {
		this.batchType = batchType;
	}

	/**
	 * Get batch name.
	 * 
	 * @return The batch name.
	 */
	public String getBatchName() {
		return batchName;
	}

	/**
	 * Set batch name.
	 * 
	 * @param batchName
	 *            The batch name.
	 */
	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}

	/**
	 * Get batch size.
	 * 
	 * @return The batch size.
	 */
	public long getBatchSize() {
		return batchSize;
	}

	/**
	 * Set batch size.
	 * 
	 * @param batchSize
	 *            The batch size.
	 */
	public void setBatchSize(long batchSize) {
		this.batchSize = batchSize;
	}

	/**
	 * Get partition id.
	 * 
	 * @return The partition id.
	 */
	public String getPartitionID() {
		return partitionID;
	}

	/**
	 * Set partition id.
	 * 
	 * @param partitionID
	 *            The partition id.
	 */
	public void setPartitionID(String partitionID) {
		this.partitionID = partitionID;
	}

	/**
	 * Get partition type.
	 * 
	 * @return The partition type.
	 */
	public String getPartitionType() {
		return partitionType;
	}

	/**
	 * Set partition type.
	 * 
	 * @param partitionType
	 *            The partition type.
	 */
	public void setPartitionType(String partitionType) {
		this.partitionType = partitionType;
	}

	/**
	 * Get the partition size.
	 * 
	 * @return partitionSize The partition size.
	 */
	public long getPartitionSize() {
		return partitionSize;
	}

	/**
	 * Set the partition size.
	 * 
	 * @param partitionSize
	 *            The partition size.
	 */
	public void setPartitionSize(long partitionSize) {
		this.partitionSize = partitionSize;
	}

	/**
	 * Get the transaction ID.
	 * 
	 * @return trasactionID The Transaction ID.
	 */
	public String getTransactionID() {
		return transactionID;
	}

	/**
	 * Set the transaction ID.
	 * 
	 * @param trasactionID
	 *            The Transaction ID.
	 */
	public void setTransactionID(String transactionID) {
		this.transactionID = transactionID;
	}

	/**
	 * Get the transaction type.
	 * 
	 * @return The transaction type.
	 */
	public String getTransactionType() {
		return transactionType;
	}

	/**
	 * Set the Transaction Type.
	 * 
	 * @param transactionType
	 *            The Transaction Type.
	 */
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	/**
	 * Get the transactionName.
	 * 
	 * @return transactionName.
	 */
	public String getTransactionName() {
		return transactionName;
	}

	/**
	 * Set the transaction name.
	 * 
	 * @param transactionName
	 *            The transaction name.
	 */
	public void setTransactionName(String transactionName) {
		this.transactionName = transactionName;
	}

	/**
	 * Get the pay load.
	 * 
	 * @return The pay load.
	 */
	public Object getPayload() {
		return payload;
	}

	/**
	 * Set the pay load.
	 * 
	 * @param payloadObject
	 *            Pay load object.
	 */
	public void setPayload(Object payloadObject) {
		this.payload = payloadObject;
	}

	/**
	 * Get the pay load type.
	 * 
	 * @return the pay load type.
	 */
	public String getPayloadType() {
		return payloadType;
	}

	/**
	 * Set the pay load type.
	 * 
	 * @param payloadType
	 *            The payload type.
	 */
	public void setPayloadType(String payloadType) {
		this.payloadType = payloadType;
	}

	/**
	 * Get the source ID.
	 * 
	 * @return The source ID.
	 */
	public String getSourceID() {
		return sourceID;
	}

	/**
	 * Set the source ID.
	 * 
	 * @param The
	 *            source ID.
	 */
	public void setSourceID(String sourceID) {
		this.sourceID = sourceID;
	}

	/**
	 * Get the source time stamp
	 * 
	 * @return The source time stamp.
	 */
	public Timestamp getSourceTimestamp() {
		return sourceTimestamp;
	}

	/**
	 * Set the source time stamp.
	 * 
	 * @param sourceTimestamp
	 */
	public void setSourceTimestamp(Timestamp sourceTimestamp) {
		this.sourceTimestamp = sourceTimestamp;
	}

	/**
	 * Get the user attributes.
	 * 
	 * @return The user attributes.
	 */
	public List<UserAttribute<?, ?>> getUserAttributes() {
		return userAttributes;
	}

	/**
	 * Set the passed user attributes.
	 * 
	 * @param userAttributes
	 *            The user attributes.
	 */
	public void setUserAttributes(List<UserAttribute<?, ?>> userAttributes) {
		this.userAttributes = userAttributes;
	}

	/**
	 * Get the file name.
	 * 
	 * @return The file name.
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * Set the file name.
	 * 
	 * @param fileName
	 *            The file name.
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	/**
	 * Check if pay load is null.
	 */
	public boolean isPayloadNull() {
		return (payload == null);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		String s = super.toString()
				+ "\n"
				+ "batchID=\""
				+ batchID
				+ "\"\n"
				+ "batchType=\""
				+ batchType
				+ "\"\n"
				+ "batchName=\""
				+ batchName
				+ "\"\n"
				+ "batchSize=\""
				+ batchSize
				+ "\"\n"
				+ "partitionID=\""
				+ partitionID
				+ "\"\n"
				+ "partitionType=\""
				+ partitionType
				+ "\"\n"
				+ "partitionSize=\""
				+ partitionSize
				+ "\"\n"
				+ "transactionID=\""
				+ transactionID
				+ "\"\n"
				+ "transactionType=\""
				+ transactionType
				+ "\"\n"
				+ "transactionName=\""
				+ transactionName
				+ "\"\n"
				+ "payloadType=\""
				+ payloadType
				+ "\"\n"
				+ "sourceID=\""
				+ sourceID
				+ "\"\n"
				+ "sourceTimestamp=\""
				+ sourceTimestamp
				+ "\"\n"
				+ "fileName=\""
				+ fileName
				+ "\"\n"
				+ "payload=\n"
				+ ((isPayloadNull()) ? "(null)"
						: (new String((byte[]) payload)));
		return s;
	}

	/**
	 * Get the fusion endpoint
	 * 
	 * @return the FusionEndpoint
	 */
	public FusionEndpoint getEndpoint() {
		return endPoint;
	}

	/**
	 * Set the passed end point.
	 * 
	 * @param endPoint
	 *            The end point.
	 */
	public void setEndpoint(FusionEndpoint endPoint) {
		this.endPoint = endPoint;
	}

	/**
	 * Get the fusion processor.
	 * 
	 * @return The fusion processor.
	 */
	public FusionProcessor getProcessor() {
		return processor;
	}

	/**
	 * Set the processor.
	 * 
	 * @param processor
	 *            The fusion processor.
	 */
	public void setProcessor(FusionProcessor processor) {
		this.processor = processor;
	}

}
