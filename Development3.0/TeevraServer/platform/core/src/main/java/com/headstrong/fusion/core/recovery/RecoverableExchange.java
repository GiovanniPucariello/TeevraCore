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
 * $Id: RecoverableExchange.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Oct 6, 2009 
 */

package com.headstrong.fusion.core.recovery;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.camel.Exchange;

/**
 * Recoverable exchange.
 * 
 */
public class RecoverableExchange implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3196801982841853505L;
	private String messageId;
	private String savePoint;
	private String timeStamp;
	public String getSavePoint() {
		return savePoint;
	}

	public void setSavePoint(String savePoint) {
		this.savePoint = savePoint;
	}

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	private Map<String, String> headers;
	private Object message;

	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public Map<String, String> getHeaders() {
		return headers;
	}

	public void setHeaders(Map<String, String> headers) {
		this.headers = headers;
	}

	public Object getMessage() {
		return message;
	}

	public void setMessage(Object message) {
		this.message = message;
	}

	/**
	 * @param exchange
	 */
	public void writeExchange(Exchange exchange) {
		this.message = exchange.getIn().getBody();
		Map<String, String> headers = new HashMap<String, String>();
		for (Entry<String, Object> header : exchange.getIn().getHeaders()
				.entrySet()) {
			headers.put(header.getKey(), header.getValue() == null ? null
					: header.getValue().toString());
		}
		this.setHeaders(headers);
	}

	/**
	 * @param exchange
	 */
	public void readExchange(Exchange exchange) {
		exchange.getIn().setBody(this.message);
		Map<String, Object> exchHeaders = new HashMap<String, Object>();
		for (Entry<String, String> header : this.headers.entrySet()) {
			exchHeaders.put(header.getKey(), header.getValue());
		}
		exchange.getIn().setHeaders(exchHeaders);
	}
}
