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
 * $Id: ProcessEventLogBean.java
 * $Revision: 
 * $Author: mbafna
 * $DateTime: Oct 8, 2008 
 */

package com.headstrong.fusion.eventlogger.beans;

import java.io.Serializable;

/**
 * <code>ProcessEventLogBean</code> is the implementation of
 * <code>EventLogBean</code>. It is value object containing the event that
 * needs to be logged with respect to the processes started / stopped by fusion
 * framework.
 */
public class ProcessEventLogBean implements EventLogBean, Serializable {
	/**
	 * Generated serial version UID
	 */
	private static final long serialVersionUID = 1967539324080191783L;

	/**
	 * The process id for which the event is generated
	 */
	private int processId;

	/**
	 * The status of the process. Refer {@link FusionConstants} PROCESS_STARTED,
	 * PROCESS_STOPPED. It can also be some intermediate steps.
	 */
	private String processStatus;

	/**
	 * The run id as called in database
	 */
	private String sessionId;

	/**
	 * For logical grouping
	 */
	private String eventCategory;

	/**
	 * Description of the event
	 */
	private String eventDesc;

	/**
	 * Event type. probable values are: INFO, WARN, ERROR
	 */
	private String eventType;

	/**
	 * Name of the component that genereated this event.
	 */
	private String eventSource;

	/**
	 * @return the processId
	 */
	public int getProcessId() {
		return processId;
	}

	/**
	 * @param processId
	 *            the processId to set
	 */
	public void setProcessId(int processId) {
		this.processId = processId;
	}

	/**
	 * @return the processStatus
	 */
	public String getProcessStatus() {
		return processStatus;
	}

	/**
	 * @param processStatus
	 *            the processStatus to set
	 */
	public void setProcessStatus(String processStatus) {
		this.processStatus = processStatus;
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
	 * @return the eventCategory
	 */
	public String getEventCategory() {
		return eventCategory;
	}

	/**
	 * @param eventCategory
	 *            the eventCategory to set
	 */
	public void setEventCategory(String eventCategory) {
		this.eventCategory = eventCategory;
	}

	/**
	 * @return the eventDesc
	 */
	public String getEventDesc() {
		return eventDesc;
	}

	/**
	 * @param eventDesc
	 *            the eventDesc to set
	 */
	public void setEventDesc(String eventDesc) {
		this.eventDesc = eventDesc;
	}

	/**
	 * @return the eventType
	 */
	public String getEventType() {
		return eventType;
	}

	/**
	 * @param eventType
	 *            the eventType to set
	 */
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	/**
	 * @return the eventSource
	 */
	public String getEventSource() {
		return eventSource;
	}

	/**
	 * @param eventSource
	 *            the eventSource to set
	 */
	public void setEventSource(String eventSource) {
		this.eventSource = eventSource;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer(100);
		sb.append("processid:").append(processId);
		sb.append("\nprocessStatus:").append(processStatus);
		sb.append("\nsessionId:").append(sessionId);
		sb.append("\neventCategory:").append(eventCategory);
		sb.append("\neventDesc:").append(eventDesc);
		sb.append("\neventType:").append(eventType);
		sb.append("\neventSource:").append(eventSource);
		return sb.toString();
	}

}
