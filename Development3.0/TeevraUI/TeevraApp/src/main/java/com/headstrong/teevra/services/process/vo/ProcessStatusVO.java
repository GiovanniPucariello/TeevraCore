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
 * $Id: ProcessStatusVO.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Oct 17, 2008 
 */

package com.headstrong.teevra.services.process.vo;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * ProcessStatusVO contains details about the status of a process, its runs and
 * the server to which the process is assigned to
 */
public class ProcessStatusVO implements Serializable {

	/**
	 * Serial vesion UID
	 */
	private static final long serialVersionUID = -5405639797322034222L;

	/**
	 * Identifier for a process
	 */
	private Long prcsId;
	/**
	 * Name of the process
	 */
	private String prcsName = null;
	/**
	 * Status of the process
	 */
	private String prcsStatus = "UNPUBLISHED";
	/**
	 * Identifier for a single instance of process execution
	 */
	private Long prcsRunId;
	/**
	 * Sequence of the instance of process execution
	 */
	private Integer prcsRunSequence = 0;
	/**
	 * Runtime status of the process
	 */
	private String prcsRunStatus = "STOPPED";
	/**
	 * The time when the process execution was started
	 */
	private Timestamp prcsRunStartTime = null;
	/**
	 * The time when the process execution was stopped either explicitly
	 * triggered by user (process admin) or triggered by scheduler or triggered
	 * by error handler / exceptions
	 */
	private Timestamp prcsRunStopTime = null;
	/**
	 * Total number of messages received in the current process execution.
	 */
	private Long prcsMsgsRecd;
	/**
	 * Total number of messages that raised error
	 */
	private Long prcsMsgsError;
	/**
	 * Total number of messages that are processed successfully
	 */
	private Long prcsMsgsProcessed;
	/**
	 * Identifier for the server to which the server is assigned
	 */
	private Long serverId;
	/**
	 * Name of the server
	 */
	private String serverName;

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
	 * @return the prcsStatus
	 */
	public String getPrcsStatus() {
		return prcsStatus;
	}

	/**
	 * @param prcsStatus
	 *            the prcsStatus to set
	 */
	public void setPrcsStatus(String prcsStatus) {
		this.prcsStatus = prcsStatus;
	}

	/**
	 * @return the prcsRunSequence
	 */
	public Integer getPrcsRunSequence() {
		return prcsRunSequence;
	}

	/**
	 * @param prcsRunSequence
	 *            the prcsRunSequence to set
	 */
	public void setPrcsRunSequence(Integer prcsRunSequence) {
		this.prcsRunSequence = prcsRunSequence;
	}

	/**
	 * @return the prcsRunStatus
	 */
	public String getPrcsRunStatus() {
		return prcsRunStatus;
	}

	/**
	 * @param prcsRunStatus
	 *            the prcsRunStatus to set
	 */
	public void setPrcsRunStatus(String prcsRunStatus) {
		this.prcsRunStatus = prcsRunStatus;
	}

	/**
	 * @return the prcsRunStartTime
	 */
	public Timestamp getPrcsRunStartTime() {
		return prcsRunStartTime;
	}

	/**
	 * @param prcsRunStartTime
	 *            the prcsRunStartTime to set
	 */
	public void setPrcsRunStartTime(Timestamp prcsRunStartTime) {
		this.prcsRunStartTime = prcsRunStartTime;
	}

	/**
	 * @return the prcsRunStopTime
	 */
	public Timestamp getPrcsRunStopTime() {
		return prcsRunStopTime;
	}

	/**
	 * @param prcsRunStopTime
	 *            the prcsRunStopTime to set
	 */
	public void setPrcsRunStopTime(Timestamp prcsRunStopTime) {
		this.prcsRunStopTime = prcsRunStopTime;
	}

	/**
	 * @return the prcsMsgsRecd
	 */
	public Long getPrcsMsgsRecd() {
		return prcsMsgsRecd;
	}

	/**
	 * @param prcsMsgsRecd
	 *            the prcsMsgsRecd to set
	 */
	public void setPrcsMsgsRecd(Long prcsMsgsRecd) {
		this.prcsMsgsRecd = prcsMsgsRecd;
	}

	/**
	 * @return the prcsMsgsError
	 */
	public Long getPrcsMsgsError() {
		return prcsMsgsError;
	}

	/**
	 * @param prcsMsgsError
	 *            the prcsMsgsError to set
	 */
	public void setPrcsMsgsError(Long prcsMsgsError) {
		this.prcsMsgsError = prcsMsgsError;
	}

	/**
	 * @return the prcsMsgsProcessed
	 */
	public Long getPrcsMsgsProcessed() {
		return prcsMsgsProcessed;
	}

	/**
	 * @param prcsMsgsProcessed
	 *            the prcsMsgsProcessed to set
	 */
	public void setPrcsMsgsProcessed(Long prcsMsgsProcessed) {
		this.prcsMsgsProcessed = prcsMsgsProcessed;
	}

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
	 * @return the serverId
	 */
	public Long getServerId() {
		return serverId;
	}

	/**
	 * @param serverId
	 *            the serverId to set
	 */
	public void setServerId(Long serverId) {
		this.serverId = serverId;
	}

	/**
	 * @return the serverName
	 */
	public String getServerName() {
		return serverName;
	}

	/**
	 * @param serverName
	 *            the serverName to set
	 */
	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	/**
	 * String representation of the ProcessStatusVO
	 * 
	 * @precondition
	 * @postcondition
	 * @return the string
	 */
	public String toString() {

		StringBuffer str = new StringBuffer();
		str.append("< PrcsId= ");
		str.append(this.getPrcsId());
		str.append(", PrcsName= ");
		str.append(this.getPrcsName());
		str.append(", PrcsStatus= ");
		str.append(this.getPrcsStatus());
		str.append(", PrcsRunId= ");
		str.append(this.getPrcsRunId());
		str.append(", PrcsRunSequence= ");
		str.append(this.getPrcsRunSequence());
		str.append(", PrcsRunStatus= ");
		str.append(this.getPrcsRunStatus());
		str.append(", PrcsRunStartTime= ");
		str.append(this.getPrcsRunStartTime());
		str.append(", PrcsRunStopTime= ");
		str.append(this.getPrcsRunStopTime());
		str.append(", PrcsMsgsRecd= ");
		str.append(this.getPrcsMsgsRecd());
		str.append(", PrcsMsgsError= ");
		str.append(this.getPrcsMsgsError());
		str.append(", PrcsMsgsProcessed= ");
		str.append(this.getPrcsMsgsProcessed());
		str.append(", ServerId= ");
		str.append(this.getServerId());
		str.append(", ServerName= ");
		str.append(this.getServerName());
		str.append(">");
		return str.toString();

	}
}
