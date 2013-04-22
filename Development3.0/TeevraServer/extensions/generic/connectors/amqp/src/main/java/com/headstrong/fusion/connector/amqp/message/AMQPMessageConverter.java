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
 * $Id: AMQPMessageConverter.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Apr 20, 2009 
 */

package com.headstrong.fusion.connector.amqp.message;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 */
public class AMQPMessageConverter {
	private static final Logger logger = LoggerFactory
			.getLogger(AMQPMessageConverter.class);

	public static byte[] convertMessageBody(Object body) throws IOException {
		byte[] bytes;

		if (body instanceof Serializable) {
			ByteArrayOutputStream outStream = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(outStream);
			oos.writeObject(body);
			outStream.flush();
			bytes = outStream.toByteArray();
		} else if (body instanceof byte[]) {
			bytes = (byte[]) body;
		} else {
			throw new NotSerializableException(
					"Message body is not serializable");
		}
		return bytes;
	}

	public static Map<String, Object> convertHeaderMessage(
			Map<String, Object> header) {
		Map<String, Object> newHeader = new HashMap<String, Object>();
		// FIXME : Limitation of Rabbit MQ
		for (Entry<String, Object> entry : header.entrySet()) {
			if (entry.getValue() != null) {
				if ((entry.getValue() instanceof String)
						|| (entry.getValue() instanceof Integer)
						|| (entry.getValue() instanceof BigDecimal)
						|| (entry.getValue() instanceof Date || entry
								.getValue() instanceof Timestamp)) {
					newHeader.put(entry.getKey(), entry.getValue());
				} else {
					logger.info("converting header value to string  "
							+ entry.getKey() + "=" + entry.getValue());
					newHeader.put(entry.getKey(), entry.getValue().toString());
				}
			}
		}
		return newHeader;
	}
}
