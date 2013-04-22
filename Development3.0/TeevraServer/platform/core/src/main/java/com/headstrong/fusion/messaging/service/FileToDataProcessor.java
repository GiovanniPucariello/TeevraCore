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
 * $Id: FileToDataProcessor.java
 * $Revision: 
 * $Author: mbafna
 * $DateTime: Oct 13, 2008 
 */

package com.headstrong.fusion.messaging.service;

import java.io.File;

import org.apache.camel.Exchange;
import org.apache.camel.component.file.GenericFile;
import org.apache.camel.component.file.GenericFileMessage;
import org.apache.camel.converter.IOConverter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 */
public class FileToDataProcessor implements org.apache.camel.Processor {
	private static Logger logger = LoggerFactory
			.getLogger(FileToDataProcessor.class);
	
	private boolean binary=false;
	public FileToDataProcessor(boolean binary) {
		this.binary=binary;
		
	}

	public void process(Exchange exchange) throws Exception {
		GenericFileMessage msg = (GenericFileMessage) exchange.getIn();
		if (logger.isDebugEnabled()) {
			logger.debug("Received file :" + msg);
		}
		File file = (File)((GenericFile) msg.getBody()).getFile();
		
		try {
			if (binary) {
				exchange.getIn().setBody(IOConverter.toByteArray(file));
			} else {
				exchange.getIn().setBody(IOConverter.toString(file, exchange));
			}
		}
		catch (Exception e) {
			logger.error("Error while reading the file", e);
			throw e;
		} 
	}

}
