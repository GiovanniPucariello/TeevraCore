/*
 * The information in this document is subject to change without notice and 
 * does not represent a commitment by Headstrong Corporation. The software 
 * and/or databases described in this document are furnished under a license 
 * agreement and may be used or copied only in accordance with the terms of 
 * the agreement. 
 * 
 * Copyright © 2009 Headstrong Corporation
 * All rights reserved.
 * 
 * $Id: ServiceNormalizedMessage.java
 * $Revision: 
 * $Author: SrujanGottemukkala
 * $DateTime: Sep 24, 2009 
 */
package com.headstrong.fusion.connector.processLauncher;

import java.util.HashMap;
import java.util.Map;

import com.headstrong.fusion.commons.NormalizedMessage;

/**
 * Represents an inbound or outbound message as part of an the Message Exchange.
 * This is used for test purpose.
 * 
 * @author PBansal
 */

public class ServiceNormalizedMessage implements NormalizedMessage {
	private Object body;
	private Map<String, Object> headers = new HashMap<String, Object>();

	public NormalizedMessage copy() {
		return null;
	}

	public Object getBody() {
		return this.body;
	}

	public <T> T getBody(Class<T> type) {
		return null;
	}

	public Object getHeader(String name) {
		return this.headers.get(name);
	}

	public <T> T getHeader(String name, Class<T> type) {
		return null;
	}

	public Map<String, Object> getHeaders() {
		return this.headers;
	}

	public String getMessageId() {
		return null;
	}

	public Object removeHeader(String name) {
		return null;
	}

	public void setBody(Object body) {
		this.body = body;
	}

	public <T> void setBody(Object body, Class<T> type) {
	}

	public void setHeader(String name, Object value) {
		headers.put(name, value);
	}

	public void setHeaders(Map<String, Object> headers) {
		this.headers.putAll(headers);
	}

	public void setMessageId(String messageId) {
	}

}
