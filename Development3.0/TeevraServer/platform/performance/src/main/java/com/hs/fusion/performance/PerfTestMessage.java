package com.hs.fusion.performance;
import java.util.HashMap;
import java.util.Map;

import com.headstrong.fusion.commons.NormalizedMessage;

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
 * $Id: PerfTestMessage.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Jul 14, 2009 
 */

/**
 * 
 */
public class PerfTestMessage implements NormalizedMessage {
	private String messageId;
	private Object body;
	private Map<String, Object> headers = new HashMap<String, Object>();

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.NormalizedMessage#copy()
	 */
	@Override
	public NormalizedMessage copy() {
		return this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.NormalizedMessage#getBody()
	 */
	@Override
	public Object getBody() {
		return this.body;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.NormalizedMessage#getBody(java.lang.Class)
	 */
	@Override
	public <T> T getBody(Class<T> type) {
		return (T) this.body;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.NormalizedMessage#getHeader(java.lang.String)
	 */
	@Override
	public Object getHeader(String name) {
		return this.headers.get(name);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.NormalizedMessage#getHeader(java.lang.String,
	 *      java.lang.Class)
	 */
	@Override
	public <T> T getHeader(String name, Class<T> type) {
		return (T) this.headers.get(name);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.NormalizedMessage#getHeaders()
	 */
	@Override
	public Map<String, Object> getHeaders() {
		return this.headers;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.NormalizedMessage#getMessageId()
	 */
	@Override
	public String getMessageId() {
		return this.messageId;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.NormalizedMessage#removeHeader(java.lang.String)
	 */
	@Override
	public Object removeHeader(String name) {
		return this.headers.remove(name);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.NormalizedMessage#setBody(java.lang.Object)
	 */
	@Override
	public void setBody(Object body) {
		this.body = body;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.NormalizedMessage#setBody(java.lang.Object,
	 *      java.lang.Class)
	 */
	@Override
	public <T> void setBody(Object body, Class<T> type) {
		throw new RuntimeException("Method not supported");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.NormalizedMessage#setHeader(java.lang.String,
	 *      java.lang.Object)
	 */
	@Override
	public void setHeader(String name, Object value) {
		this.headers.put(name, value);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.NormalizedMessage#setHeaders(java.util.Map)
	 */
	@Override
	public void setHeaders(Map<String, Object> headers) {
		this.headers = headers;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.NormalizedMessage#setMessageId(java.lang.String)
	 */
	@Override
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

}
