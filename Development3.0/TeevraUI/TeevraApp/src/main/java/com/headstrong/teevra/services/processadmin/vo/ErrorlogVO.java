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
 * $Id: EventLogVO.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Apr 22, 2009 
 */

package com.headstrong.teevra.services.processadmin.vo;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Stores message level and system level errors for the process runs
 */
public class ErrorlogVO implements Serializable {

	/**
	 * generated serial version UID
	 */
	private static final long serialVersionUID = -4767510514758408125L;

	/**
	 * Identifier for the message event log
	 */
	private Long messageEventlogId;
	/**
	 * Instance of process execution
	 */
	private Long prcsRunId;
	/**
	 * Identifier for the process
	 */
	private Long prcsId;
	/**
	 * Name of the process
	 */
	private String prcsName;
	/**
	 * Time when the error generated
	 */
	private Timestamp savepointTime;

	/**
	 * Error Message
	 */
	private String logMessage;

	/**
	 * @return the prcsRunId
	 */
	public Long getPrcsRunId() {
		return prcsRunId;
	}

	/**
	 * @param prcsRunId
	 *            the prcsRunId to set
	 */
	public void setPrcsRunId(Long prcsRunId) {
		this.prcsRunId = prcsRunId;
	}

	/**
	 * @return the prcsId
	 */
	public Long getPrcsId() {
		return prcsId;
	}

	/**
	 * @param prcsId
	 *            the prcsId to set
	 */
	public void setPrcsId(Long prcsId) {
		this.prcsId = prcsId;
	}

	/**
	 * @return the prcsName
	 */
	public String getPrcsName() {
		return prcsName;
	}

	/**
	 * @param prcsName
	 *            the prcsName to set
	 */
	public void setPrcsName(String prcsName) {
		this.prcsName = prcsName;
	}

	/**
	 * @return the savepointTime
	 */
	public Timestamp getSavepointTime() {
		return savepointTime;
	}

	/**
	 * @param savepointTime
	 *            the savepointTime to set
	 */
	public void setSavepointTime(Timestamp errTime) {
		this.savepointTime = errTime;
	}

	/**
	 * @return the logMessage
	 */
	public String getLogMessage() {
		return logMessage;
	}

	/**
	 * @param logMessage
	 *            the logMessage to set
	 */
	public void setLogMessage(String logMessage) {
		this.logMessage = logMessage;
	}

	/**
	 * @return the messageEventlogId
	 */
	public Long getMessageEventlogId() {
		return messageEventlogId;
	}

	/**
	 * @param messageEventlogId
	 *            the messageEventlogId to set
	 */
	public void setMessageEventlogId(Long messageEventlogId) {
		this.messageEventlogId = messageEventlogId;
	}

}
