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
 * $Id: Recoverable.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Oct 5, 2009 
 */

package com.headstrong.fusion.core.recovery;

import java.util.Date;

import org.apache.camel.Exchange;

/**
 * recovery related data for a message exchange.
 * 
 */
public class Recoverable {

	/**
	 * unique process identifier.
	 */
	private String processId;
	/**
	 * unique message identifier.
	 */
	private String messageId;

	/**
	 * process run id
	 */
	private String sessionId;

	/**
	 * message exchange to be persisted.
	 */
	private Exchange exchange;
	/**
	 * savepoint name.
	 */
	private String savepoint;

	/**
	 * TIme of message creation.
	 */
	private Date timeStamp;

	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public Exchange getExchange() {
		return exchange;
	}

	public void setExchange(Exchange exchange) {
		this.exchange = exchange;
	}

	public String getSavepoint() {
		return savepoint;
	}

	public void setSavepoint(String savepoint) {
		this.savepoint = savepoint;
	}

	public String getProcessId() {
		return processId;
	}

	public void setProcessId(String processId) {
		this.processId = processId;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

}
