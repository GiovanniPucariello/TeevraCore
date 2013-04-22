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
 * $Id: DefaultMessageExchange.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Sep 12, 2008 
 */

package com.headstrong.fusion.core.commons;

import java.util.Map;
import java.util.Map.Entry;

import org.apache.camel.Exchange;
import org.apache.camel.Message;

import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.commons.MessageExchangePattern;
import com.headstrong.fusion.commons.NormalizedMessage;
import com.headstrong.fusion.core.commons.adapter.camel.PatternMap;

/**
 * {@link CamelMessageExchange} is a wrapper around {@link Exchange}. It works
 * as an adapter which delegates all the calls to {@link Exchange}.
 * 
 */
public class CamelMessageExchange implements MessageExchange {

	/**
	 * 
	 */
	private Exchange exchange;

	/**
	 * These are required as the Normalized message is also a wrapper around
	 * {@link Message} and on {@link #getIn()}, {@link #getOut()},
	 * {@link #getFault()} a new {@link NormalizedMessage} can't be created all
	 * the time.
	 * <p>
	 * A local copy of all these messages will be kept and will be kept in sync
	 * programatically.
	 * 
	 */

	private NormalizedMessage in;
	private NormalizedMessage out;

	/**
	 * This constructor sets the underlying Exchange.
	 * 
	 * @param exchange
	 */
	public CamelMessageExchange(Exchange exchange) {
		this.exchange = exchange;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.MessageExchange#copy()
	 */
	public MessageExchange copy() {
		MessageExchange messageExchange = new CamelMessageExchange(
				this.exchange.copy());
		return messageExchange;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.MessageExchange#getException()
	 */
	public Exception getException() {
		return this.exchange.getException();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.MessageExchange#getExchangeId()
	 */
	public String getExchangeId() {
		return this.exchange.getExchangeId();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.MessageExchange#getIn()
	 */
	public NormalizedMessage getIn() {
		if (in == null) {
			this.in = new CamelNormalizedMessage(this.exchange.getIn());
		}
		return this.in;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.MessageExchange#getOut()
	 */
	public NormalizedMessage getOut() {
		if (out == null) {
			this.out = new CamelNormalizedMessage(this.exchange.getOut());
		}
		return this.out;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.MessageExchange#getProperties()
	 */
	public Map<String, Object> getProperties() {
		return this.exchange.getProperties();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.MessageExchange#getProperty(java.lang.String)
	 */
	public Object getProperty(String name) {
		return this.exchange.getProperty(name);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.MessageExchange#getProperty(java.lang.String,
	 *      java.lang.Class)
	 */
	public <T> T getProperty(String name, Class<T> type) {
		return this.getProperty(name, type);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.MessageExchange#isFailed()
	 */
	public boolean isFailed() {
		return this.exchange.isFailed();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.MessageExchange#removeProperty(java.lang.String)
	 */
	public Object removeProperty(String name) {
		return this.exchange.removeProperty(name);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.MessageExchange#setException(java.lang.Throwable)
	 */
	public void setException(Throwable e) {
		this.exchange.setException(e);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.MessageExchange#setExchangeId(java.lang.String)
	 */
	public void setExchangeId(String id) {
		this.exchange.setExchangeId(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.MessageExchange#setIn(com.headstrong.fusion.commons.NormalizedMessage)
	 */
	public void setIn(NormalizedMessage in) {
		if (in != null) {
			CamelNormalizedMessage camelMessage = (CamelNormalizedMessage) in;
			this.exchange.setIn(camelMessage.getMessage());
		} else {
			this.exchange.setIn(null);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.MessageExchange#setOut(com.headstrong.fusion.commons.NormalizedMessage)
	 */
	public void setOut(NormalizedMessage out) {
		if (out != null) {
			CamelNormalizedMessage camelMessage = (CamelNormalizedMessage) out;
			this.exchange.setOut(camelMessage.getMessage());
		} else {
			this.exchange.setOut(null);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.MessageExchange#setProperty(java.lang.String,
	 *      java.lang.Object)
	 */
	public void setProperty(String name, Object value) {
		this.exchange.setProperty(name, value);
	}

	@Override
	public MessageExchangePattern getPattern() {
		return PatternMap.getMessageExchangePattern(exchange.getPattern());
	}

	@Override
	public void setPattern(MessageExchangePattern pattern) {
		this.exchange.setPattern(PatternMap.getExchangePattern(pattern));
	}

	@Override
	public void setProperties(Map<String, Object> properties) {
		// FIXME This will not set the map so if the calling method tries to modify
		// the original map
		// it'll not be reflected here.
		for (Entry<String, Object> property : properties.entrySet()) {
			this.exchange.setProperty(property.getKey(), property.getValue());
		}
	}

	public Exchange getExchange() {
		return exchange;
	}

	public void setExchange(Exchange exchange) {
		this.exchange = exchange;
	}

	
}
