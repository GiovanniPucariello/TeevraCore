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
 * $Id: RecoveryMessage.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Oct 9, 2009 
 */

package com.headstrong.fusion.core.recovery.bean;

import java.util.Date;

/**
 * @author Ssoni
 * 
 */
public class RecoveryMessage {

	private String processId;
	private String sessionId;
	private String messageId;
	private String savePoint;
	private Date timeStamp;

	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

	private byte[] data;

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

	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public String getSavePoint() {
		return savePoint;
	}

	public void setSavePoint(String savePoint) {
		this.savePoint = savePoint;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}

}
