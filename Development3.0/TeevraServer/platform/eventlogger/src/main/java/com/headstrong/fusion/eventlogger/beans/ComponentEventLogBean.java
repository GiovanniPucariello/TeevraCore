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
 * $Id: ComponentEventLogBean.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Jun 22, 2010 
 */

package com.headstrong.fusion.eventlogger.beans;

/**
 * <code>ComponentEventLogBean</code> is the implementation of
 * <code>EventLogBean</code>. It is value object containing the event that
 * needs to be logged with respect to the messages processed through a component
 * by fusion framework.
 */
public class ComponentEventLogBean implements EventLogBean {

	/**
	 * SessionId, also can be named as process run id.
	 */
	private String sessionId;

	/**
	 * component id in the process(Service id)
	 */
	private String compId;
	/**
	 * MessageId of the message.
	 */
	private String messageId;

	/**
	 * Name of the savepoint.
	 */
	private String savepointName;

	/**
	 * Time at which this savepoint was reached.
	 */
	private String savepointTime;

	/**
	 * Log message.
	 */
	private String logMessage;

	/**
	 * @return the logMessage
	 */
	public String getLogMessage() {
		if (logMessage == null) {
			logMessage = "";
		}
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
	 * @return the compId
	 */
	public String getCompId() {
		return compId;
	}

	/**
	 * @param compId
	 *            the compId to set
	 */
	public void setCompId(String compId) {
		this.compId = compId;
	}

	/**
	 * @return the sessionId
	 */
	public String getSessionId() {
		return sessionId;
	}

	/**
	 * @param sessionId
	 *            the sessionId to set
	 */
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
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
	 * @return the savepointName
	 */
	public String getSavepointName() {
		return savepointName;
	}

	/**
	 * @param savepointName
	 *            the savepointName to set
	 */
	public void setSavepointName(String savepointName) {
		this.savepointName = savepointName;
	}

	/**
	 * @return the savepointTime
	 */
	public String getSavepointTime() {
		return savepointTime;
	}

	/**
	 * @param savepointTime
	 *            the savepointTime to set
	 */
	public void setSavepointTime(String savepointTime) {
		this.savepointTime = savepointTime;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer(86);
		sb.append("\nsessionId:").append(sessionId);
		sb.append("\ncompId:").append(compId);
		sb.append("\nsavepointTime:").append(savepointTime);
		sb.append("\nmessageId:").append(messageId);
		sb.append("\nsavepointName:").append(savepointName);
		sb.append("\nsavepointTime:").append(savepointTime);

		return sb.toString();
	}

}
