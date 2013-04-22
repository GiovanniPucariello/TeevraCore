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
 * $Id: ProcessRuntimeEventlog.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Oct 3, 2008 
 */

package com.headstrong.teevra.services.processadmin.eo;

import java.io.Serializable;
import java.sql.Clob;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Transient;

import org.hibernate.annotations.Check;

/**
 * EO corresponds to the 'Process_Runtime_Eventlog' table. This table holds logs
 * generated in a process execution
 */
@Entity
@Table(name = "process_runtime_eventlog")
public class ProcessRuntimeEventlogEO implements Serializable {
	/**
	 * default serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Unique identifier for an event log entry. Can be auto generated based on
	 * time stamp. It is not used elsewhere
	 */
	private Long prcsRunEventlogId;
	/**
	 * Identifies the process instance that has raised this event log
	 */
	private Long prcsRunId;
	/**
	 * Type of event log. Can be INFO, WARNING, ERROR
	 */
	private String prcsEventType = "INFO";
	/**
	 * Time at which the log is entered
	 */
	private Timestamp prcsEventTime = new Timestamp(System.currentTimeMillis());
	/**
	 * Name of the component that generated this event
	 */
	private String prcsEventSource = null;
	/**
	 * Used to categorize the logs
	 */
	private String prcsEventCategory = null;
	/**
	 * Describes the event corresponding to the log
	 */
	private String prcsEventDesc = null;
	/**
	 * Message input to the process or related to the event
	 */
	private Clob prcsMsg = null;
	/**
	 * User name who created the event log entry
	 */
	private String createdBy = System.getProperty("user.name");
	/**
	 * Time when created the event log entry
	 */
	private Timestamp createdDate = new Timestamp(System.currentTimeMillis());
	/**
	 * User name who modified the event log entry
	 */
	private String modifiedBy = System.getProperty("user.name");
	/**
	 * Time when modified the event log entry
	 */
	private Timestamp modifiedDate = new Timestamp(System.currentTimeMillis());
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
	 * @return the prcsRunEventlogId
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "id_gen")
	@TableGenerator(name = "id_gen", table = "teevra_sequence", pkColumnName = "table_name", valueColumnName = "seq_value", allocationSize = 1)
	@Column(name = "prcs_run_eventlog_id", nullable = true)
	public Long getPrcsRunEventlogId() {
		return prcsRunEventlogId;
	}

	/**
	 * @param prcsRunEventlogId
	 *            the prcsRunEventlogId to set
	 */
	public void setPrcsRunEventlogId(Long prcsRunEventlogId) {
		this.prcsRunEventlogId = prcsRunEventlogId;
	}

	/**
	 * @return the prcsRunId
	 */
	@Column(name = "prcs_run_id", nullable = true)
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
	 * @return the prcsEventType
	 */
	@Column(name = "prcs_event_type", length = 25, nullable = true)
	@Check(constraints = "(INFO) OR (WARNING) OR (ERROR)")
	public String getPrcsEventType() {
		return prcsEventType;
	}

	/**
	 * @param prcsEventType
	 *            the prcsEventType to set
	 */
	public void setPrcsEventType(String prcsEventType) {
		this.prcsEventType = prcsEventType;
	}

	/**
	 * @return the prcsEventTime
	 */
	@Column(name = "prcs_event_time", nullable = true)
	public Timestamp getPrcsEventTime() {
		return prcsEventTime;
	}

	/**
	 * @param prcsEventTime
	 *            the prcsEventTime to set
	 */
	public void setPrcsEventTime(Timestamp prcsEventTime) {
		this.prcsEventTime = prcsEventTime;
	}

	/**
	 * @return the prcsEventSource
	 */
	@Column(name = "prcs_event_source", length = 50, nullable = true)
	public String getPrcsEventSource() {
		return prcsEventSource;
	}

	/**
	 * @param prcsEventSource
	 *            the prcsEventSource to set
	 */
	public void setPrcsEventSource(String prcsEventSource) {
		this.prcsEventSource = prcsEventSource;
	}

	/**
	 * @return the prcsEventCategory
	 */
	@Column(name = "prcs_event_category", length = 50, nullable = true)
	public String getPrcsEventCategory() {
		return prcsEventCategory;
	}

	/**
	 * @param prcsEventCategory
	 *            the prcsEventCategory to set
	 */
	public void setPrcsEventCategory(String prcsEventCategory) {
		this.prcsEventCategory = prcsEventCategory;
	}

	/**
	 * @return the prcsEventDesc
	 */
	@Column(name = "prcs_event_desc", length = 500, nullable = true)
	public String getPrcsEventDesc() {
		return prcsEventDesc;
	}

	/**
	 * @param prcsEventDesc
	 *            the prcsEventDesc to set
	 */
	public void setPrcsEventDesc(String prcsEventDesc) {
		this.prcsEventDesc = prcsEventDesc;
	}

	/**
	 * @return the prcsMsg
	 */
	@Column(name = "prcs_msg", nullable = true)
	public Clob getPrcsMsg() {
		return prcsMsg;
	}

	/**
	 * @param prcsMsg
	 *            the prcsMsg to set
	 */
	public void setPrcsMsg(Clob prcsMsg) {
		this.prcsMsg = prcsMsg;
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
}
