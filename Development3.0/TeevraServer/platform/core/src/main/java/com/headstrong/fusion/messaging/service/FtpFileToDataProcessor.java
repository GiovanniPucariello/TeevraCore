
package com.headstrong.fusion.messaging.service;

import java.io.ByteArrayOutputStream;

import org.apache.camel.Exchange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 */
public class FtpFileToDataProcessor implements org.apache.camel.Processor {
	private static Logger logger = LoggerFactory
			.getLogger(FileToDataProcessor.class);
	
	private boolean binary=false;
	public FtpFileToDataProcessor(boolean binary) {
		this.binary=binary;
		
	}

	public void process(Exchange exchange) throws Exception {
				
			ByteArrayOutputStream bos = (ByteArrayOutputStream) exchange.getIn().getBody();
			exchange.getIn().setBody(bos.toByteArray());
				
		} 
	}


