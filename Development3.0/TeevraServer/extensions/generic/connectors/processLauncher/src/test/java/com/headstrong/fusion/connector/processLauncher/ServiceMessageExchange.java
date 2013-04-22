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
 * $Id: ServiceMessageExchange.java
 * $Revision: 
 * $Author: SrujanGottemukkala
 * $DateTime: Sep 29, 2009 
 */

package com.headstrong.fusion.connector.processLauncher;

import java.util.Map;

import org.apache.camel.Exchange;

import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.commons.MessageExchangePattern;
import com.headstrong.fusion.commons.NormalizedMessage;

/**
 * 
 * Creating a Mock Message Exchange for test purpose.
 * 
 * @author PBansal
 * 
 */
public class ServiceMessageExchange implements MessageExchange {
	private NormalizedMessage normalizedMessage;

	public MessageExchange copy() {
		return null;
	}

	public Exception getException() {
		return null;
	}

	public String getExchangeId() {
		return null;
	}

	public NormalizedMessage getFault() {
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

//	@Override
//	public void setFault(NormalizedMessage fault) {
//
//	}

	@Override
	public MessageExchangePattern getPattern() {
		return null;
	}

	@Override
	public void setPattern(MessageExchangePattern pattern) {

	}

	@Override
	public void setProperties(Map<String, Object> properties) {

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