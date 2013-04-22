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
 * $Id: Message.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Sep 11, 2008 
 */

package com.headstrong.fusion.commons;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Implements the Message pattern and represents an inbound or outbound message
 * as part of an {@link MessageExchange}
 * 
 */
public class FusionNormalizedMessage implements NormalizedMessage {

	private String messageId;
	private Map<String, Object> headers;
	private Object body;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.NormalizedMessage#getHeader(java.lang.String)
	 */
	public Object getHeader(String name) {
		if (this.headers != null) {
			return this.headers.get(name);
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.NormalizedMessage#getHeader(java.lang.String,
	 *      java.lang.Class)
	 */
	@SuppressWarnings("unchecked")
	public <T> T getHeader(String name, Class<T> type) {
		if (this.headers != null) {
			return (T) headers.get(name);
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.NormalizedMessage#setHeader(java.lang.String,
	 *      java.lang.Object)
	 */
	public void setHeader(String name, Object value) {
		this.getHeaders().put(name, value);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.NormalizedMessage#removeHeader(java.lang.String)
	 */
	public Object removeHeader(String name) {
		if (this.headers != null) {
			return getHeaders().remove(name);
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.NormalizedMessage#getBody(java.lang.Class)
	 */
	@SuppressWarnings("unchecked")
	public <T> T getBody(Class<T> type) {
		return (T) body;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.NormalizedMessage#setBody(java.lang.Object,
	 *      java.lang.Class)
	 */
	@SuppressWarnings("unchecked")
	public <T> void setBody(Object body, Class<T> type) {
		this.body = (T) body;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.NormalizedMessage#copy()
	 */
	public FusionNormalizedMessage copy() {
		FusionNormalizedMessage fusionNormalizedMessage = new FusionNormalizedMessage();
		fusionNormalizedMessage.setBody(this.getBody());
		/*
		 * Do a safe copy. 
		 * This was added as a fix for the CBR-MQ issue 
		 * where messages were lost in case of a process with CBR and MQ.
		 * Karthikeyan Punniakrishnan - 10 December 2012
		 */
		if (hasHeaders()) {
			fusionNormalizedMessage.setHeaders(safeCopy(getHeaders()));
        }
		fusionNormalizedMessage.setMessageId(this.getMessageId());
		return fusionNormalizedMessage;
	}
	
	private static Map<String, Object> safeCopy(Map<String, Object> properties) {
        if (properties == null) {
            return null;
        }
        return new ConcurrentHashMap<String, Object>(properties);
    }
    
    public boolean hasHeaders() {
        return getHeaders() != null && !getHeaders().isEmpty();
    }

	/**
	 * @return the messageId
	 */
	public String getMessageId() {
		return messageId;
	}

	/**
	 * @param messageId
	 *            the messageId to set
	 */
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	/**
	 * @return the headers
	 */
	public Map<String, Object> getHeaders() {
		if (this.headers == null) {
			this.headers = new ConcurrentHashMap<String, Object>();
		}
		return headers;
	}

	/**
	 * @param headers
	 *            the headers to set
	 */
	public void setHeaders(Map<String, Object> headers) {
		this.headers = headers;
	}

	/**
	 * @return the body
	 */
	public Object getBody() {
		return body;
	}

	/**
	 * @param body
	 *            the body to set
	 */
	public void setBody(Object body) {
		this.body = body;
	}
}
