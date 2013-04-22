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
 * $Id: TediPartitionManager.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Apr 9, 2010 
 */
package com.tfp.manager;

import javax.activation.FileDataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import objTedi.objTedi_srcfile;
import tedi.parser.AbstractParser;
import tedi.util.ByteArrayDataSource;

import com.headstrong.fusion.connector.tfp.TFPEndpoint;
import com.tfp.interfaces.ProcessObject;
import com.tfp.util.TediParsingUtility;

/**
 * This file is provided by MCH team for TFP integration.
 */
public class TediPartitionManager extends AbstractTediPartitionManager {

	/**
	 * TEDI constant.
	 */
	private final String TEDI = "TEDI";
	/**
	 * Tedi Source name.
	 */
	private String tediSourceName;
	/**
	 * Tedi parser.
	 */
	private AbstractParser tediParser;
	/**
	 * Logger.
	 */
	private static Logger logger = LoggerFactory
			.getLogger(TediPartitionManager.class);

	/**
	 * Default constructor.
	 */
	public TediPartitionManager() {
		super();
	}

	/**
	 * Begin Processing.
	 */
	public void beginProcessing() throws Exception {
		logger.info("Begin processing.");
		super.beginProcessing();
		inputProcessObject.setPayloadType(TEDI);

		tediSourceName = ((TFPEndpoint) inputProcessObject.getEndpoint())
				.getTfpConfiguration().getSourceFileName();

		if (tediSourceName != null && !tediSourceName.trim().isEmpty()) {
			logger.info("Pocessing " + tediSourceName + " TEDI source file.");
			try {
				objTedi_srcfile srcObj = TediParsingUtility.getSourceFile(
						tediSourceName, logger);
				if (inputProcessObject.isPayloadNull()) {
					tediParser = AbstractParser
							.createParser(new FileDataSource(inputProcessObject
									.getFileName()), srcObj);
				} else {
					tediParser = AbstractParser.createParser(
							new ByteArrayDataSource(
									((String) inputProcessObject.getPayload())
											.getBytes()), srcObj);
				}
				tediParser.setReturnType(AbstractParser.NO_META_DATA);
			} catch (Exception e) {
				String errStr = "Error instantiating TEDI parser for source "
						+ tediSourceName + " of batch type "
						+ inputProcessObject.getBatchType() + " for file "
						+ inputProcessObject.getFileName();
				logger.error(errStr, e);
				throw new RuntimeException(errStr);
			}
		} else {
			String errStr = "No TEDI source specified for batch type "
					+ inputProcessObject.getBatchType();
			logger.error(errStr);
			throw new RuntimeException(errStr);
		}
	}

	@Override
	public ProcessObject getNextTransaction() {
		ProcessObject nextTransaction = null;
		try {
			Object nextLogicalRecord = TediParsingUtility
					.getNextRecord(tediParser);
			if (nextLogicalRecord != null) {
				nextTransaction = inputProcessObject;
				if (nextLogicalRecord instanceof String) {
					nextTransaction.setPayload(nextLogicalRecord);
				} else {
					nextTransaction.setPayload(new String(
							(byte[]) nextLogicalRecord));
				}
			}
		} catch (Exception e) {
			String errStr = e.getMessage();
			logger.error(errStr);
			throw new RuntimeException(e);
		}
		return nextTransaction;
	}
}
