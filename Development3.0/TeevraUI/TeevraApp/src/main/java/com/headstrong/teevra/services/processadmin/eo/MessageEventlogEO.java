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
 * $Id: MessageEventlogEO.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Dec 17, 2008 
 */

package com.headstrong.teevra.services.processadmin.eo;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Transient;

/**
 * EO corresponds to the 'Message_Eventlog' table. This table holds logs of the
 * messages in a process execution
 */

@Entity
@Table(name = "message_eventlog")
public class MessageEventlogEO implements Serializable {

	/**
	 * default serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Unique identifier for the message event log
	 */
	private Long messageEventlogId;
	/**
	 * Identifies the process instance that has raised this message event log
	 */
	private Long prcsRunId;
	/**
	 * Identifier of the Message for the process run
	 */
	private Long messageId;
	/**
	 * Sequence Identifier of the message
	 */
	private Long sequenceId;
	/**
	 * Total sequence number
	 */
	private Long totalSequence;
	/**
	 * Savepoint status of the message
	 */
	private String savepointName = null;
	/**
	 * The time when the message saves
	 */
	private Timestamp savepointTime = null;

	/**
	 * Log message on save
	 */
	private String logMessage = null;
	/**
	 * Message Data
	 */
	private String messageData = null;
	/**
	 * User name who created the process version
	 */
	private String createdBy = System.getProperty("user.name");
	/**
	 * Time when created the process version
	 */
	private Timestamp createdDate = new Timestamp(System.currentTimeMillis());
	/**
	 * User name who modified the process version
	 */
	private String modifiedBy = System.getProperty("user.name");
	/**
	 * Time when modified the process version
	 */
	private Timestamp modifiedDate = new Timestamp(System.currentTimeMillis());
	/**
	 * Process runtime related with message eventlog in ManyToOne fashion
	 */
	private ProcessRuntimeEO processRuntime = null;
	// transient fields
	/**
	 * Unique identifier for the process
	 */
	private Long prcsId;
	/**
	 * Name of the process
	 */
	private String prcsName = null;

	/**
	 * @return the messageEventlogId
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "id_gen")
	@TableGenerator(name = "id_gen", table = "teevra_sequence", pkColumnName = "table_name", valueColumnName = "seq_value", allocationSize = 1)
	@Column(name = "message_eventlog_id", nullable = true)
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

	/**
	 * @return the prcsRunId
	 */
	@Column(name = "prcs_run_id", nullable = false)
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
	 * @return the messageId
	 */
	@Column(name = "message_id", nullable = false)
	public Long getMessageId() {
		return messageId;
	}

	/**
	 * @param messageId
	 *            the messageId to set
	 */
	public void setMessageId(Long messageId) {
		this.messageId = messageId;
	}

	/**
	 * @return the sequenceId
	 */
	@Column(name = "sequence_id", nullable = false)
	public Long getSequenceId() {
		return sequenceId;
	}

	/**
	 * @param sequenceId
	 *            the sequenceId to set
	 */
	public void setSequenceId(Long sequenceId) {
		this.sequenceId = sequenceId;
	}

	/**
	 * @return the totalSequence
	 */
	@Column(name = "total_sequence", nullable = false)
	public Long getTotalSequence() {
		return totalSequence;
	}

	/**
	 * @param totalSequence
	 *            the totalSequence to set
	 */
	public void setTotalSequence(Long totalSequence) {
		this.totalSequence = totalSequence;
	}

	/**
	 * @return the savepointName
	 */
	@Column(name = "savepoint_name", length = 50, nullable = false)
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
	@Column(name = "savepoint_time", nullable = false)
	public Timestamp getSavepointTime() {
		return savepointTime;
	}

	/**
	 * @param savepointTime
	 *            the savepointTime to set
	 */
	public void setSavepointTime(Timestamp savepointTime) {
		this.savepointTime = savepointTime;
	}

	/**
	 * @return the logMessage
	 */
	@Column(name = "log_message", length = 512, nullable = false)
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
	 * @return the messageData
	 */
	@Column(name = "message_data", nullable = false)
	public String getMessageData() {
		return messageData;
	}

	/**
	 * @param messageData
	 *            the messageData to set
	 */
	public void setMessageData(String messageData) {
		this.messageData = messageData;
	}

	/**
	 * @return the createdBy
	 */
	@Column(name = "created_by", length = 50, nullable = false)
	public String getCreatedBy() {
		return createdBy;
	}

	/**
	 * @param createdBy
	 *            the createdBy to set
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	/**
	 * @return the createdDate
	 */
	@Column(name = "created_date", nullable = false)
	public Timestamp getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate
	 *            the createdDate to set
	 */
	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * @return the modifiedBy
	 */
	@Column(name = "modified_by", length = 50, nullable = true)
	public String getModifiedBy() {
		return modifiedBy;
	}

	/**
	 * @param modifiedBy
	 *            the modifiedBy to set
	 */
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	/**
	 * @return the modifiedDate
	 */
	@Column(name = "modified_date", nullable = true)
	public Timestamp getModifiedDate() {
		return modifiedDate;
	}

	/**
	 * @param modifiedDate
	 *            the modifiedDate to set
	 */
	public void setModifiedDate(Timestamp modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	/**
	 * @return the processRuntime
	 */
	@ManyToOne(cascade = { CascadeType.REFRESH, CascadeType.MERGE }, fetch = FetchType.LAZY, targetEntity = ProcessRuntimeEO.class)
	@JoinColumn(name = "prcs_run_id", insertable = false, updatable = false)
	public ProcessRuntimeEO getProcessRuntime() {
		return processRuntime;
	}

	/**
	 * @param processRuntime
	 *            the processRuntime to set
	 */
	public void setProcessRuntime(ProcessRuntimeEO processRuntime) {
		this.processRuntime = processRuntime;
	}

	/**
	 * @return the prcsId
	 */
	@Transient
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
	@Transient
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
	 * String representation of the MessageEventlogEO
	 * 
	 * @precondition
	 * @postcondition
	 * @return the string
	 */
	public String toString() {

		StringBuffer str = new StringBuffer();
		str.append("< messageEventlogId= ");
		str.append(this.getMessageEventlogId());
		str.append(", prcsRunId= ");
		str.append(this.getPrcsRunId());
		str.append(", prcsId= ");
		str.append(this.getPrcsId());
		str.append(", prcsName= ");
		str.append(this.getPrcsName());
		str.append(", messageId= ");
		str.append(this.getMessageId());
		str.append(", sequenceId= ");
		str.append(this.getSequenceId());
		str.append(", totalSequence= ");
		str.append(this.getTotalSequence());
		str.append(", savepointName= ");
		str.append(this.getSavepointName());
		str.append(", savepointTime= ");
		str.append(this.getSavepointTime());
		str.append(", logMessage= ");
		str.append(this.getLogMessage());
		str.append(", messageData= ");
		str.append(this.getMessageData());
		str.append(", CreatedBy= ");
		str.append(this.getCreatedBy());
		str.append(", CreatedDate= ");
		str.append(this.getCreatedDate());
		str.append(", ModifiedBy= ");
		str.append(this.getModifiedBy());
		str.append(", ModifiedDate= ");
		str.append(this.getModifiedDate());
		str.append(">");
		return str.toString();

	}

}
