package com.headstrong.fusion.messaging.model.endpoint.binding;

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
public class MCHFileToDataProcessor implements org.apache.camel.Processor {
	private static Logger logger = LoggerFactory
			.getLogger(MCHFileToDataProcessor.class);

	private String fileType = null;

	public MCHFileToDataProcessor(String fileType) {
		this.fileType = fileType;

	}

	public void process(Exchange exchange) throws Exception {
		GenericFileMessage msg = (GenericFileMessage) exchange.getIn();
		if (logger.isDebugEnabled()) {
			logger.debug("Received file :" + msg);
		}
		File file = (File)((GenericFile) msg.getBody()).getFile();
		/*
		 * FileInputStream fis = null; try { fis = new FileInputStream(file);
		 * int x = fis.available(); byte b[] = new byte[x]; fis.read(b); if
		 * (binary) { exchange.getIn().setBody(b); } else {
		 * exchange.getIn().setBody(new String(b)); }
		 * 
		 * } catch (Exception e) { logger.error("Error while reading the file",
		 * e); throw e; } finally { try { fis.close(); } catch (IOException e) {
		 * logger.error("Error while closing the file input stream ", e); }
		 * 
		 * 
		 * }
		 */
		try {
			if (fileType.toString().equalsIgnoreCase("binary")) {
				exchange.getIn().setBody(IOConverter.toByteArray(file));
			} else if (fileType.toString().equalsIgnoreCase("string")) {
				exchange.getIn().setBody(IOConverter.toString(file));
			} else {
				//exchange.getIn().setBody(null);
				exchange.getIn().setBody("");
				//exchange.setIn(null);
				
			}
		} catch (Exception e) {
			logger.error("Error while reading the file", e);
			throw e;
		}
	}

}
