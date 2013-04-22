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
 * $Id: MessageEventLogBean.java
 * $Revision: 
 * $Author: mbafna
 * $DateTime: Oct 8, 2008 
 */

package com.headstrong.fusion.eventlogger.beans;

/**
 * <code>MessageEventLogBean</code> is the implementation of
 * <code>EventLogBean</code>. It is value object containing the event that
 * needs to be logged with respect to the messages processed by fusion
 * framework.
 */
public class MessageRecoveryLogBean implements EventLogBean {

	/**
	 * SessionId, also can be named as process run id. 
	 */
	
	private String sessionId;
	
	/**
	 * MessageId of the message. 
	 */
	private String messageId;
	
	/**
	 * Name of the savepoint. 
	 */
	private String savepointName;
	
	/**
	 * Binary data. 
	 */
	private byte[] messageData;

	
	/**
	 * @return the sessionId
	 */
	public String getSessionId() {
		return sessionId;
	}


	/**
	 * @param sessionId the sessionId to set
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
	 * @param messageId the messageId to set
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
	 * @param savepointName the savepointName to set
	 */
	public void setSavepointName(String savepointName) {
		this.savepointName = savepointName;
	}


	/**
	 * @return the messageData
	 */
	public byte[] getMessageData() {
		return messageData;
	}


	/**
	 * @param messageData the messageData to set
	 */
	public void setMessageData(byte[] messageData) {
		this.messageData = messageData;
	}


	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer(56);
		sb.append("\nsessionId:").append(sessionId);
		sb.append("\nmessageId:").append(messageId);
		sb.append("\nsavepointName:").append(savepointName);
		return sb.toString();
	}

}
