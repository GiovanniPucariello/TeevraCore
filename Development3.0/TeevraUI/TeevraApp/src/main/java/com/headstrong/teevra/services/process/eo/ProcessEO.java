/*
 * The information in this document is subject to change without notice and 
 * does not represent a commitment by Headstrong Corporation. The software 
 * and/or databases described in this document are furnished under a license 
 * agreement and may be used or copied only in accordance with the terms of 
 * the agreement. 
 * 
 * Copyright � 2008 Headstrong Corporation
 * All rights reserved.
 * 
 * $Id: Process.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Oct 3, 2008 
 */

package com.headstrong.teevra.services.process.eo;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.teevra.services.process.exception.ProcessServiceException;
import com.headstrong.teevra.services.process.vo.ProcessGraphVO;

/**
 * EO corresponds to the 'Process' table, master table for any STRIDE Hub
 * process.
 */

@Entity
@Table(name = "process")
public class ProcessEO implements Serializable {

	/**
	 * Logger for ProcessEO
	 */
	private static Logger logger = LoggerFactory.getLogger(ProcessEO.class);

	/**
	 * Serial version UID
	 */
	private static final long serialVersionUID = 4252587160972833287L;

	/**
	 * Denoting that the process is registered with the server and it can be
	 * executed.
	 */
	public static final String STATUS_PUBLISHED = "PUBLISHED";

	/**
	 * Denoting that the process is already published and modified later
	 */
	public static final String STATUS_PUBLISHED_MODIFIED = "PUBLISHED-MODIFIED";
	/**
	 * Denoting that the process is running and it is locked
	 */
	public static final String STATUS_LOCKED = "LOCKED";
	/**
	 * Denoting that the process is not published yet
	 */
	public static final String STATUS_UNPUBLISHED = "UNPUBLISHED";

	/**
	 * Unique identifier for a process
	 */
	private Long prcsId;
	/**
	 * Unique name for the process
	 */
	private String prcsName;
	/**
	 * : Details on the process like rationale / objective
	 */
	private String prcsDesc;

	/**
	 * boolean identifies if recovery has to be enabled or not.
	 */
	private Boolean prcsRecoveryEnabled = true;
	/**
	 * Boolean flag to identify if process level event logs are required for the
	 * process
	 */
	private Boolean prcsEventLogReqd = true;
	/**
	 * Boolean flag to identify if message level event logs are required for the
	 * process
	 */
	private Boolean msgEventLogReqd = true;
	/**
	 * Boolean flag to identify if component level event logs are required for
	 * the process
	 */
	private Boolean compEventLogReqd = true;
	/**
	 * Status of the process � UNPUBLISHED, PUBLISHED, LOCKED, ARCHIVED,
	 * PUBLISHED-MODIFIED
	 */
	private String prcsStatus = "UNPUBLISHED";
	/**
	 * Runtime status of the process RUNNING, STOPPED, ERROR, STARTING. Null
	 * implies the process is not yet running
	 */
	private String prcsRunStatus;
	/**
	 * If true the process is a template, else not
	 */
	private Boolean prcsIsTemplate = false;
	/**
	 * Group id of the process
	 */
	private Long prcsGrpId;
	/**
	 * Latest or current version of the process
	 */
	private Long prcsLatestVersionId;
	/**
	 * Process graph containing the XML serialized ProcessGraphVO
	 */
	private String serialzedProcessGraph;
	/**
	 * PCM generated for the process
	 */
	private String prcsModel;
	/**
	 * User name who created the Process
	 */
	private String createdBy;
	/**
	 * Time when created the Process
	 */
	private Timestamp createdDate;
	/**
	 * User name who modified the Process
	 */
	private String modifiedBy;
	/**
	 * Time when modified the Process
	 */
	private Timestamp modifiedDate;

	/**
	 * Process model graph
	 */
	private ProcessGraphVO graph;
	
	/**
	 * Message throttle time
	 */
	private Integer throttleTime;
	
	/**
	 * Message throttle count
	 */
	private Integer throttleMsgCount;
	

	/**
	 * @return the prcsId
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "id_gen")
	@TableGenerator(name = "id_gen", table = "teevra_sequence", pkColumnName = "table_name", valueColumnName = "seq_value", allocationSize = 1)
	@Column(name = "prcs_id", nullable = true)
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
	@Column(name = "prcs_name", length = 50, nullable = false)
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
	 * @return the prcsDesc
	 */
	@Column(name = "prcs_desc", length = 200, nullable = true)
	public String getPrcsDesc() {
		return prcsDesc;
	}

	/**
	 * @param prcsDesc
	 *            the prcsDesc to set
	 */
	public void setPrcsDesc(String prcsDesc) {
		this.prcsDesc = prcsDesc;
	}

	/**
	 * @return the prcsStatus
	 */
	@Column(name = "prcs_status", length = 50, nullable = true)
	@Check(constraints = "(UNPUBLISHED) OR (PUBLISHED) OR (LOCKED) OR (ARCHIVED) OR (PUBLISHED-MODIFIED)")
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
	 * @return the prcsRunStatus
	 */
	@Transient
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
	 * @return the prcsIsTemplate
	 */
	@Column(name = "prcs_is_template", nullable = true)
	public Boolean isPrcsIsTemplate() {
		return prcsIsTemplate;
	}

	/**
	 * @param prcsIsTemplate
	 *            the prcsIsTemplate to set
	 */
	public void setPrcsIsTemplate(Boolean prcsIsTemplate) {
		this.prcsIsTemplate = prcsIsTemplate;
	}

	/**
	 * @return the prcsGrpId
	 */
	@Column(name = "prcs_grp_id", nullable = true)
	public Long getPrcsGrpId() {
		return prcsGrpId;
	}

	/**
	 * @param prcsGrpId
	 *            the prcsGrpId to set
	 */
	public void setPrcsGrpId(Long prcsGrpId) {
		this.prcsGrpId = prcsGrpId;
	}

	/**
	 * @return the prcsLatestVersionId
	 */
	@Column(name = "prcs_latest_version_id", nullable = true)
	public Long getPrcsLatestVersionId() {
		return prcsLatestVersionId;
	}

	/**
	 * @param prcsLatestVersionId
	 *            the prcsLatestVersionId to set
	 */
	public void setPrcsLatestVersionId(Long prcsLatestVersionId) {
		this.prcsLatestVersionId = prcsLatestVersionId;
	}

	/**
	 * @return the prcsModel
	 */
	@Column(name = "prcs_model", nullable = true)
	public String getPrcsModel() {
		return prcsModel;
	}

	/**
	 * @param prcsModel
	 *            the prcsModel to set
	 */
	public void setPrcsModel(String prcsModel) {
		this.prcsModel = prcsModel;
	}

	/**
	 * @return the prcsRecoveryEnabled
	 */
	@Column(name = "prcs_recovery_enabled", nullable = false)
	public Boolean getPrcsRecoveryEnabled() {
		return prcsRecoveryEnabled;
	}

	/**
	 * @param prcsRecoveryEnabled
	 *            the prcsRecoveryEnabled to set
	 */
	public void setPrcsRecoveryEnabled(Boolean prcsRecoveryEnabled) {
		this.prcsRecoveryEnabled = prcsRecoveryEnabled;
	}

	/**
	 * @return the prcsEventLogReqd
	 */
	@Column(name = "prcs_eventlog_reqd", nullable = false)
	public Boolean getPrcsEventLogReqd() {
		return prcsEventLogReqd;
	}

	/**
	 * @param prcsEventLogReqd
	 *            the prcsEventLogReqd to set
	 */
	public void setPrcsEventLogReqd(Boolean prcsEventLogReqd) {
		this.prcsEventLogReqd = prcsEventLogReqd;
	}

	/**
	 * @return the msgEventLogReqd
	 */
	@Column(name = "msg_eventlog_reqd", nullable = false)
	public Boolean getMsgEventLogReqd() {
		return msgEventLogReqd;
	}

	/**
	 * @param msgEventLogReqd
	 *            the msgEventLogReqd to set
	 */
	public void setMsgEventLogReqd(Boolean msgEventLogReqd) {
		this.msgEventLogReqd = msgEventLogReqd;
	}

	/**
	 * @return the compEventLogReqd
	 */
	@Column(name = "comp_eventlog_enabled", nullable = false)
	public Boolean getCompEventLogReqd() {
		return compEventLogReqd;
	}

	/**
	 * @param compEventLogReqd
	 *            the compEventLogReqd to set
	 */
	public void setCompEventLogReqd(Boolean compEventLogReqd) {
		this.compEventLogReqd = compEventLogReqd;
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
	 * @return the graph
	 */
	@Transient
	public ProcessGraphVO getGraph() {
		return graph;
	}

	public void setGraph(ProcessGraphVO graph) {
		this.graph = graph;

		if (graph != null) {
			ByteArrayOutputStream os = new ByteArrayOutputStream();
			XMLEncoder encoder = new XMLEncoder(os);
			encoder.writeObject(graph);
			encoder.close();

			this.serialzedProcessGraph = os.toString();
		}
	}

	/**
	 * @return the serialzedProcessGraph
	 */
	@Column(name = "prcs_graph", nullable = true)
	public String getSerialzedProcessGraph() {
		return serialzedProcessGraph;
	}
	
	@Column(name = "throttle_time ")
	public Integer getThrottleTime() {
		return throttleTime;
	}

	/**
	 * @param throttleTime
	 *            the throttleTime to set
	 */
	public void setThrottleTime(Integer throttleTime) {
		this.throttleTime = throttleTime;
	}
	
	@Column(name = "throttle_msg_count ")
	public Integer getThrottleMsgCount() {
		return throttleMsgCount;
	}

	/**
	 * @param throttleMsgCount
	 *            the throttleMsgCount to set
	 */
	public void setThrottleMsgCount(Integer throttleMsgCount) {
		this.throttleMsgCount = throttleMsgCount;
	}

	/**
	 * @param serialzedProcessGraph
	 *            the serialzedProcessGraph to set
	 */
	public void setSerialzedProcessGraph(String serialzedProcessGraph)
			throws ProcessServiceException {
		this.serialzedProcessGraph = serialzedProcessGraph;

		if (serialzedProcessGraph != null) {
			// deserialize the graph to create ProcessGraphVO
			byte[] bytes;
			try {
				bytes = serialzedProcessGraph.getBytes("UTF-8");
				ByteArrayInputStream io = new ByteArrayInputStream(bytes);
				XMLDecoder decoder = new XMLDecoder(io);
				graph = (ProcessGraphVO) decoder.readObject();
			} catch (UnsupportedEncodingException e) {
				logger.error(
						"Error while generating serialized process graph ", e);
				throw new ProcessServiceException(e.getMessage());
			}
		}
	}

	/**
	 * String representation of the MessageSchemaEO
	 * 
	 * @precondition
	 * @postcondition
	 * @return the string
	 */
	public String toString() {
		StringBuffer str = new StringBuffer();
		str.append("< Process Id= ");
		str.append(this.getPrcsId());
		str.append(", Name= ");
		str.append(this.getPrcsName());
		str.append(", Description= ");
		str.append(this.getPrcsDesc());
		str.append(", Status= ");
		str.append(this.getPrcsStatus());
		str.append(", IsTemplate= ");
		str.append(this.isPrcsIsTemplate());
		str.append(", Group Id= ");
		str.append(this.getPrcsGrpId());
		str.append(", Recovery Enabled= ");
		str.append(this.getPrcsRecoveryEnabled());
		str.append(", Process EventLogs Required= ");
		str.append(this.getPrcsEventLogReqd());
		str.append(", Message EventLogs Required= ");
		str.append(this.getMsgEventLogReqd());
		str.append(", Component EventLogs Required= ");
		str.append(this.getCompEventLogReqd());
		str.append(", Latest Version Id= ");
		str.append(this.getPrcsLatestVersionId());
		str.append(", CreatedBy= ");
		str.append(this.getCreatedBy());
		str.append(", CreatedDate= ");
		str.append(this.getCreatedDate());
		str.append(", ModifiedBy= ");
		str.append(this.getModifiedBy());
		str.append(", ModifiedDate= ");
		str.append(this.getModifiedDate());
		str.append(", ThrottleMsgCount= ");
		str.append(this.getThrottleMsgCount());
		str.append(", ThrottleTime= ");
		str.append(this.getThrottleTime());
		str.append(">");
		return str.toString();
	}

}
