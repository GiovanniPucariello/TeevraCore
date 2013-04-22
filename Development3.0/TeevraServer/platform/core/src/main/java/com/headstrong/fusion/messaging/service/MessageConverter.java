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
 * $Id: MessageConverter.java
 * $Revision: 
 * $Author: MBafna
 * $DateTime: Dec 12, 2008 
 */

package com.headstrong.fusion.messaging.service;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.bo.BusinessObject;
import com.headstrong.fusion.bo.impl.exception.InvalidAttributeExpressionException;
import com.headstrong.fusion.commons.FusionConstants;

/**
 * This processor will convert the message into binary stream. The following
 * things are done:
 * <ul>
 * <li> It will take the body of the message and convert into xml if it is
 * business object else into string. This String is stored in the header as
 * LOG_DATA.
 * <li> It will then convert body and header as object stream and store the
 * byte[] in body. </ui>
 * 
 */
public class MessageConverter implements Processor {

	private static final Logger logger = LoggerFactory
			.getLogger(MessageConverter.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.camel.Processor#process(org.apache.camel.Exchange)
	 */
	@SuppressWarnings("unchecked")
	public void process(Exchange exchange) throws Exception {
		Object body = exchange.getIn().getBody();

		StringBuffer dataInString = new StringBuffer();
		if (body instanceof List) {
			List<Object> listData = (List) body;
			for (Object data : listData) {
				dataInString.append(convertLogData(data));
			}
		} else {
			dataInString.append(convertLogData(body));
		}
		if (logger.isDebugEnabled()) {
			logger.debug("Setting log data as :" + dataInString);
		}

		exchange.getIn().setHeader(FusionConstants.LOG_DATA,
				dataInString.toString());
		exchange.getIn().setBody(
				convertByte(exchange.getIn().getHeaders(), body));
	}

	/**
	 * Converts data into String. 
	 * @precondition
	 * @postcondition 	
	 * @param data
	 * @return
	 * @throws InvalidAttributeExpressionException 
	 */
	private String convertLogData(Object data) throws InvalidAttributeExpressionException {
		String st = new String();
		if (data instanceof BusinessObject) {
			st = ((BusinessObject) data).toXml();
		} else {
			st = data.toString();
		}
		return st;
	}

	/**
	 * Converts object1 and object2 into binary stream. 
	 * @precondition
	 * @postcondition 	
	 * @param obj1
	 * @param obj2
	 * @return
	 * @throws Exception
	 */
	private byte[] convertByte(Object obj1, Object obj2) throws Exception {
		ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
		try {
			ObjectOutputStream oos = new ObjectOutputStream(byteOut);
			oos.writeObject(obj1);
			oos.writeObject(obj2);
			oos.close();
		} catch (Exception e) {
			logger.error("Error serialzing the data.", e);
			// ignore the error
			// TODO :: Need relook.
		}
		return byteOut.toByteArray();
	}

}
