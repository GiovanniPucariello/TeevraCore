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
 * $Id: ProcessRuntime.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Oct 3, 2008 
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
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.Check;
import org.hibernate.annotations.Formula;

import com.headstrong.teevra.services.process.eo.ProcessEO;

/**
 * EO corresponds to the 'Process_Runtime' table. This table holds details of
 * every process run.
 */
@Entity
@Table(name = "process_runtime", uniqueConstraints = { @UniqueConstraint(columnNames = {
		"prcs_id", "prcs_run_sequence" }) })
public class ProcessRuntimeEO implements Serializable {
	/**
	 * default serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Unique identifier for a single instance of process execution
	 */
	private Long prcsRunId;
	/**
	 * Associates the runtime process instance with a process
	 */
	private Long prcsId;
	/**
	 * Version of the process
	 */
	private Long prcsVerId;
	/**
	 * Every time a process is executed, a new record would be inserted with
	 * this column value set as previous sequence + 1. This doesn't change with
	 * process version.
	 */
	private Integer prcsRunSequence = 0;
	/**
	 * Runtime status of the process ? SCHEDULED, RUNNING, STOPPED, ERROR
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
	 * User name who created the process execution
	 */
	private String createdBy = System.getProperty("user.name");
	/**
	 * Time when created the process execution
	 */
	private Timestamp createdDate = new Timestamp(System.currentTimeMillis());
	/**
	 * User name who modified the process execution
	 */
	private String modifiedBy = System.getProperty("user.name");
	/**
	 * Time when modified the process execution
	 */
	private Timestamp modifiedDate = new Timestamp(System.currentTimeMillis());
	/**
	 * Parent process related with process runtime in ManyToOne fashion
	 */
	private ProcessEO parentProcess = null;

	/**
	 * @return the prcsRunId
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "id_gen")
	@TableGenerator(name = "id_gen", table = "teevra_sequence", pkColumnName = "table_name", valueColumnName = "seq_value", allocationSize = 1)
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
	 * @return the prcsId
	 */
	@Column(name = "prcs_id", nullable = false)
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
	 * @return the prcsVerId
	 */
	@Column(name = "prcs_ver_id", nullable = true)
	public Long getPrcsVerId() {
		return prcsVerId;
	}

	/**
	 * @param prcsVerId
	 *            the prcsVerId to set
	 */
	public void setPrcsVerId(Long prcsVerId) {
		this.prcsVerId = prcsVerId;
	}

	/**
	 * @return the prcsRunSequence
	 */
	@Column(name = "prcs_run_sequence", nullable = true)
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
	@Column(name = "prcs_run_status", length = 50, nullable = false)
	@Check(constraints = "(STOPPED) OR (RUNNING) OR (SCHEDULED) OR (ERROR)")
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
	@Column(name = "prcs_run_start_time", nullable = true)
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
	@Column(name = "prcs_run_stop_time", nullable = true)
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
	@Formula("(select count(distinct mel.message_id)  from message_eventlog mel "
			+ "where mel.savepoint_name='RECEIVED' and mel.prcs_run_id=prcs_run_id "
			+ " group by mel.prcs_run_id)")
	public Long getPrcsMsgsRecd() {
		if (prcsMsgsRecd == null) {
			return 0L;
		}
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
	@Formula("(select count(distinct mel.message_id)  from message_eventlog mel "
			+ "where mel.savepoint_name='ERROR' and mel.prcs_run_id=prcs_run_id "
			+ " group by mel.prcs_run_id)")
	public Long getPrcsMsgsError() {
		if (prcsMsgsError == null) {
			return 0L;
		}
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
	@Formula("(select count(distinct mel.message_id)  from message_eventlog mel "
			+ "where mel.savepoint_name='FINISHED' and mel.prcs_run_id=prcs_run_id "
			+ " group by mel.prcs_run_id)")
	public Long getPrcsMsgsProcessed() {
		if (prcsMsgsProcessed == null) {
			return 0L;
		}
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
	 * @return the parentProcess
	 */
	@ManyToOne(cascade = { CascadeType.REFRESH, CascadeType.MERGE }, fetch = FetchType.EAGER, targetEntity = ProcessEO.class)
	@JoinColumn(name = "prcs_id", insertable = false, updatable = false)
	public ProcessEO getParentProcess() {
		return parentProcess;
	}

	/**
	 * @param parentProcess
	 *            the parentProcess to set
	 */
	public void setParentProcess(ProcessEO parentProcess) {
		this.parentProcess = parentProcess;
	}

	/**
	 * String representation of the ProcessRuntimeEO
	 * 
	 * @precondition
	 * @postcondition
	 * @return the string
	 */
	public String toString() {

		StringBuffer str = new StringBuffer();
		str.append("< PrcsRunId= ");
		str.append(this.getPrcsRunId());
		str.append(", PrcsId= ");
		str.append(this.getPrcsId());
		str.append(", PrcsMsgsError= ");
		str.append(this.getPrcsMsgsError());
		str.append(", PrcsMsgsProcessed= ");
		str.append(this.getPrcsMsgsProcessed());
		str.append(", PrcsMsgsRecd= ");
		str.append(this.getPrcsMsgsRecd());
		str.append(", PrcsRunSequence= ");
		str.append(this.getPrcsRunSequence());
		str.append(", PrcsVerId= ");
		str.append(this.getPrcsVerId());
		str.append(", PrcsRunStartTime= ");
		str.append(this.getPrcsRunStartTime());
		str.append(", PrcsRunStatus= ");
		str.append(this.getPrcsRunStatus());
		str.append(", PrcsRunStopTime= ");
		str.append(this.getPrcsRunStopTime());
		str.append(", CreatedBy= ");
		str.append(this.getCreatedBy());
		str.append(", CreatedDate= ");
		str.append(this.getCreatedDate());
		str.append(", ModifiedBy= ");
		str.append(this.getModifiedBy());
		str.append(", ModifiedDate= ");
		str.append(this.getModifiedDate());
		str.append(", ParentProcess= ");
		str.append(this.getParentProcess().toString());
		str.append(">");
		return str.toString();

	}

}
