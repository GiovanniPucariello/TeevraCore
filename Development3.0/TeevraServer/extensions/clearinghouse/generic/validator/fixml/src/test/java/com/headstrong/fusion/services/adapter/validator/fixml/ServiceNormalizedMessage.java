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
 * $Id: ServiceNormalizedMessage.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jun 25, 2009 
 */

package com.headstrong.fusion.services.adapter.validator.fixml;

import java.util.Map;

import com.headstrong.fusion.commons.NormalizedMessage;

public class ServiceNormalizedMessage implements NormalizedMessage {
	private Object body;
	private Map<String, Object> headers;

	public NormalizedMessage copy() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getBody() {
		return this.body;
	}

	public <T> T getBody(Class<T> type) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getHeader(String name) {
		return this.headers.get(name);
	}

	public <T> T getHeader(String name, Class<T> type) {
		// TODO Auto-generated method stub
		return null;
	}

	public Map<String, Object> getHeaders() {
		return this.headers;
	}

	public String getMessageId() {
		// TODO Auto-generated method stub
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
	}

	public void setHeaders(Map<String, Object> headers) {
	}

	public void setMessageId(String messageId) {
	}

}