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
 * $Id: ServiceMessageExchange.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jun 25, 2009 
 */

package com.headstrong.fusion.services.adapter.validator.fixml;

import java.util.Map;

import org.apache.camel.Exchange;

import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.commons.MessageExchangePattern;
import com.headstrong.fusion.commons.NormalizedMessage;

/**
 * 
 */
public class ServiceMessageExchange implements MessageExchange {
	private NormalizedMessage normalizedMessage;

	public MessageExchange copy() {
		// TODO Auto-generated method stub
		return null;
	}

	public Exception getException() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getExchangeId() {
		// TODO Auto-generated method stub
		return null;
	}

	public NormalizedMessage getIn() {
		return this.normalizedMessage;
	}

	public NormalizedMessage getOut() {
		return null;
	}

	public Map<String, Object> getProperties() {
		return null;
	}

	public Object getProperty(String name) {
		return null;
	}

	public <T> T getProperty(String name, Class<T> type) {
		return null;
	}

	public boolean isFailed() {
		return false;
	}

	public MessageExchange newInstance() {
		return null;
	}

	public Object removeProperty(String name) {
		return null;
	}

	public void setException(Throwable e) {
	}

	public void setExchangeId(String id) {
	}

	public void setIn(NormalizedMessage in) {
		this.normalizedMessage = in;
	}

	public void setOut(NormalizedMessage out) {
	}

	public void setProperty(String name, Object value) {
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

	@Override
	public void setProperties(Map<String, Object> properties) {
		// TODO Auto-generated method stub
		
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
