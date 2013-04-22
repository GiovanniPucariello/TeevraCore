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
 * $Id: Exchange.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Sep 11, 2008 
 */

package com.headstrong.fusion.commons;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.headstrong.fusion.commons.exception.FusionException;
import org.apache.camel.Exchange;
/**
 * The base message exchange interface providing access to the request, response
 * and fault Message instances.
 */

public class FusionMessageExchange implements MessageExchange {

	private String exchangeId;
	private Map<String, Object> properties;
	private NormalizedMessage in;
	private NormalizedMessage out;
	private NormalizedMessage fault;
	private Exception exception;
	private boolean failed;
	private MessageExchangePattern pattern;

	/**
	 * Default constructor.
	 * Initializes {@link MessageExchangePattern} to InOnly.
	 */
	public FusionMessageExchange() {
		this.pattern = MessageExchangePattern.InOnly;
	}

	/**
	 * 
	 * @param pattern
	 */
	public FusionMessageExchange(MessageExchangePattern pattern) {
		this.pattern = pattern;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.MessageExchange#getProperty(java.lang.String)
	 */
	public Object getProperty(String name) {
		if (this.properties != null) {
			return this.properties.get(name);
		}
		return null;
	}

	public <T> T getProperty(String name, Class<T> type) {
		// ignore.
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.MessageExchange#setProperty(java.lang.String,
	 *      java.lang.Object)
	 */
	public void setProperty(String name, Object value) {
		if (value != null) {
			// avoid the NullPointException
			getProperties().put(name, value);
		} else {
			// if the value is null , we just remove the key from the map
			if (name != null) {
				getProperties().remove(name);
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.MessageExchange#removeProperty(java.lang.String)
	 */
	public Object removeProperty(String name) {
		if (this.properties != null) {
			return getProperties().remove(name);
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.MessageExchange#getProperties()
	 */
	public Map<String, Object> getProperties() {
		if (properties == null) {
			properties = new ConcurrentHashMap<String, Object>();
		}
		return properties;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.MessageExchange#getIn()
	 */
	public NormalizedMessage getIn() {
		return this.in;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.MessageExchange#setIn(com.headstrong.fusion.commons.NormalizedMessage)
	 */
	public void setIn(NormalizedMessage in) {
		this.in = in;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.MessageExchange#getOut()
	 */
	public NormalizedMessage getOut() {
		return this.out;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.MessageExchange#setOut(com.headstrong.fusion.commons.NormalizedMessage)
	 */
	public void setOut(NormalizedMessage out) {
		this.out = out;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.MessageExchange#getFault()
	 */
	public NormalizedMessage getFault() {
		return this.fault;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.MessageExchange#getException()
	 */
	public Exception getException() {
		return this.exception;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.MessageExchange#setException(java.lang.Throwable)
	 */
	public void setException(Throwable t) {
		if (t == null) {
			this.exception = null;
		} else {
			this.exception = new FusionException(
					"Exception occurred during execution", t);
		}
	}

	public boolean isFailed() {
		return this.failed;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.MessageExchange#copy()
	 */
	public FusionMessageExchange copy() {
		// TODO : check if exception and fault messages needs to be set.
		FusionMessageExchange fusionMessageExchange = new FusionMessageExchange();
		if (this.getIn() != null) {
			fusionMessageExchange.setIn(this.getIn().copy());
		}
		if (this.getOut() != null) {
			fusionMessageExchange.setOut(this.getOut().copy());
		}
		fusionMessageExchange.setExchangeId(this.getExchangeId());
		/*
		 * Do a safe copy. 
		 * This was added as a fix for the CBR-MQ issue 
		 * where messages were lost in case of a process with CBR and MQ.
		 * Karthikeyan Punniakrishnan - 10 December 2012
		 */
		if (hasProperties()) {
			fusionMessageExchange.setProperties(safeCopy(getProperties()));
        }
		fusionMessageExchange.setExchangeId(this.getExchangeId());
		return fusionMessageExchange;
	}
	
    private static Map<String, Object> safeCopy(Map<String, Object> properties) {
        if (properties == null) {
            return null;
        }
        return new ConcurrentHashMap<String, Object>(properties);
    }
    
    public boolean hasProperties() {
        return properties != null && !properties.isEmpty();
    }
    
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.MessageExchange#getExchangeId()
	 */
	public String getExchangeId() {
		return this.exchangeId;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.MessageExchange#setExchangeId(java.lang.String)
	 */
	public void setExchangeId(String id) {
		this.exchangeId = id;
	}

	/**
	 * sets the property map.
	 * @param properties
	 */
	public void setProperties(Map<String, Object> properties) {
		this.properties = properties;
	}

	@Override
	public MessageExchangePattern getPattern() {
		return this.pattern;
	}

	@Override
	public void setPattern(MessageExchangePattern pattern) {
		this.pattern = pattern;
	}
	

	@Override
	public Exchange getExchange() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setExchange(Exchange exchange) {
		// TODO Auto-generated method stub
		
	}
	
}
