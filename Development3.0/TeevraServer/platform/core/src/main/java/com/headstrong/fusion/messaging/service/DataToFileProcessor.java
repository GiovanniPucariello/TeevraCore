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
 * $Id: DataToFileProcessor.java
 * $Revision: 
 * $Author: mbafna
 * $DateTime: Oct 13, 2008 
 */

package com.headstrong.fusion.messaging.service;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.converter.IOConverter;

/**
 * 
 */
public class DataToFileProcessor implements Processor {

	public void process(Exchange exchange) throws Exception {

		
		Object inputData = exchange.getIn().getBody();
		
		/**
		 * If input is string, then take the byte array of it. 
		 * If not, use the inputData itself as the bytearray
		 */
		
		if (inputData instanceof String) {
			exchange.getIn().setBody(IOConverter.toInputStream((String)inputData, exchange));
		} else {
			exchange.getIn().setBody(inputData);
		}
	}
}
