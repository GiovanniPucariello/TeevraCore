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
 * $Id: CamelNormalizedMessage.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Sep 12, 2008 
 */

package com.headstrong.fusion.core.commons;

import java.util.Map;

import org.apache.camel.Message;

import com.headstrong.fusion.commons.NormalizedMessage;

/**
 * {@link CamelNormalizedMessage} is a wrapper over {@link Message}.
 * 
 */
public class CamelNormalizedMessage implements NormalizedMessage {

	private Message message;

	public CamelNormalizedMessage(Message message) {
		this.message = message;
	}
	
	/* (non-Javadoc)
	 * @see com.headstrong.fusion.commons.NormalizedMessage#copy()
	 */
	public NormalizedMessage copy() {
		return new CamelNormalizedMessage(this.message.copy());
	}

	/* (non-Javadoc)
	 * @see com.headstrong.fusion.commons.NormalizedMessage#getBody()
	 */
	public Object getBody() {
		return this.message.getBody();
	}

	/* (non-Javadoc)
	 * @see com.headstrong.fusion.commons.NormalizedMessage#getBody(java.lang.Class)
	 */
	public <T> T getBody(Class<T> type) {
		return this.message.getBody(type);
	}


	/* (non-Javadoc)
	 * @see com.headstrong.fusion.commons.NormalizedMessage#getHeader(java.lang.String)
	 */
	public Object getHeader(String name) {
		return this.message.getHeader(name);
	}

	/* (non-Javadoc)
	 * @see com.headstrong.fusion.commons.NormalizedMessage#getHeader(java.lang.String, java.lang.Class)
	 */
	public <T> T getHeader(String name, Class<T> type) {
		return this.message.getHeader(name, type);
	}

	/* (non-Javadoc)
	 * @see com.headstrong.fusion.commons.NormalizedMessage#getHeaders()
	 */
	public Map<String, Object> getHeaders() {
		return this.message.getHeaders();
	}

	/* (non-Javadoc)
	 * @see com.headstrong.fusion.commons.NormalizedMessage#getMessageId()
	 */
	public String getMessageId() {
		return this.message.getMessageId();
	}

	/* (non-Javadoc)
	 * @see com.headstrong.fusion.commons.NormalizedMessage#removeHeader(java.lang.String)
	 */
	public Object removeHeader(String name) {
		return this.message.removeHeader(name);
	}

	/* (non-Javadoc)
	 * @see com.headstrong.fusion.commons.NormalizedMessage#setBody(java.lang.Object)
	 */
	public void setBody(Object body) {
		this.message.setBody(body);

	}

	/* (non-Javadoc)
	 * @see com.headstrong.fusion.commons.NormalizedMessage#setBody(java.lang.Object, java.lang.Class)
	 */
	public <T> void setBody(Object body, Class<T> type) {
		this.message.setBody(body, type);

	}

	/* (non-Javadoc)
	 * @see com.headstrong.fusion.commons.NormalizedMessage#setHeader(java.lang.String, java.lang.Object)
	 */
	public void setHeader(String name, Object value) {
		this.message.setHeader(name, value);
	}

	/* (non-Javadoc)
	 * @see com.headstrong.fusion.commons.NormalizedMessage#setHeaders(java.util.Map)
	 */
	public void setHeaders(Map<String, Object> headers) {
		this.message.setHeaders(headers);

	}

	/* (non-Javadoc)
	 * @see com.headstrong.fusion.commons.NormalizedMessage#setMessageId(java.lang.String)
	 */
	public void setMessageId(String messageId) {
		this.message.setMessageId(messageId);

	}
	
	/**
	 * This method returns the underlying Camel 
	 * message. This is required by the MessageExchange 
	 * interface.
	 * 
	 * @precondition
	 * @postcondition 	
	 * @return
	 */
	protected Message getMessage() {
		return this.message;
	}
}
