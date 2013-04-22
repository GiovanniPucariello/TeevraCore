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
 * $Id: PerfTestMessageExchange.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Jul 14, 2009 
 */

package com.hs.fusion.performance;

import java.util.Map;

import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.commons.MessageExchangePattern;
import com.headstrong.fusion.commons.NormalizedMessage;

/**
 * MessageExchange implementation for performance testing.
 */
public class PerfTestMessageExchange implements MessageExchange {
	private String exchangeId;
	private NormalizedMessage in;
	private NormalizedMessage out;
	private NormalizedMessage fault;
	private Map<String, Object> properties;
	private Throwable exception;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.MessageExchange#copy()
	 */
	@Override
	public MessageExchange copy() {
		throw new RuntimeException("Method not supported.");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.MessageExchange#getException()
	 */
	@Override
	public Throwable getException() {
		return this.exception;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.MessageExchange#getExchangeId()
	 */
	@Override
	public String getExchangeId() {
		return this.exchangeId;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.MessageExchange#getFault()
	 */
	@Override
	public NormalizedMessage getFault() {
		return this.fault;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.MessageExchange#getIn()
	 */
	@Override
	public NormalizedMessage getIn() {
		return this.in;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.MessageExchange#getOut()
	 */
	@Override
	public NormalizedMessage getOut() {
		return this.out;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.MessageExchange#getProperties()
	 */
	@Override
	public Map<String, Object> getProperties() {
		return this.properties;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.MessageExchange#getProperty(java.lang.String)
	 */
	@Override
	public Object getProperty(String name) {
		return this.properties.get(name);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.MessageExchange#getProperty(java.lang.String,
	 *      java.lang.Class)
	 */
	@Override
	public <T> T getProperty(String name, Class<T> type) {
		throw new RuntimeException("Method not supported");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.MessageExchange#isFailed()
	 */
	@Override
	public boolean isFailed() {
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.MessageExchange#newInstance()
	 */
	@Override
	public MessageExchange newInstance() {
		return new PerfTestMessageExchange();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.MessageExchange#removeProperty(java.lang.String)
	 */
	@Override
	public Object removeProperty(String name) {
		return this.properties.remove(name);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.MessageExchange#setException(java.lang.Throwable)
	 */
	@Override
	public void setException(Throwable e) {
		this.exception = e;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.MessageExchange#setExchangeId(java.lang.String)
	 */
	@Override
	public void setExchangeId(String id) {
		this.exchangeId = id;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.MessageExchange#setIn(com.headstrong.fusion.commons.NormalizedMessage)
	 */
	@Override
	public void setIn(NormalizedMessage in) {
		this.in = in;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.MessageExchange#setOut(com.headstrong.fusion.commons.NormalizedMessage)
	 */
	@Override
	public void setOut(NormalizedMessage out) {
		this.out = out;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.MessageExchange#setProperty(java.lang.String,
	 *      java.lang.Object)
	 */
	@Override
	public void setProperty(String name, Object value) {
		this.properties.put(name, value);
	}

	@Override
	public void setFault(NormalizedMessage fault) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MessageExchangePattern getPattern() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPattern(MessageExchangePattern pattern) {
		// TODO Auto-generated method stub
		
	}

}
