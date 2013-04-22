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
 * $Id: StateMachineEO.java
 * $Revision: 
 * $Author: viswanathp
 * $DateTime: Mar 4, 2009 
 */

package com.headstrong.teevra.services.statemachine.eo;

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
import javax.persistence.UniqueConstraint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.teevra.services.statemachine.exception.StateMachineServiceException;
import com.headstrong.teevra.services.statemachine.vo.StateMachineGraphVO;

/**
 * EO corresponds to the 'State_Machine ' table which holds details of all the
 * state machines
 * 
 */
@Entity
@Table(name = "state_machine", uniqueConstraints = { @UniqueConstraint(columnNames = { "state_machine_name" }) })
public class StateMachineEO implements Serializable {
	/**
	 * Logger for StateMachineEO
	 */
	private static Logger logger = LoggerFactory
			.getLogger(StateMachineEO.class);

	public static final String STATUS_PUBLISHED = "PUBLISHED";
	public static final String STATUS_UNPUBLISHED = "UNPUBLISHED";
	/**
	 * generated serial version UID
	 */
	private static final long serialVersionUID = -6916522297096250012L;

	/**
	 * Unique identifier for a state machine
	 */
	private Long stateMachineId;
	/**
	 * Unique name for the state machine
	 */
	private String stateMachineName;
	/**
	 * Description of the state machine
	 */
	private String stateMachineDesc;
	/**
	 * Status of the state machine:PUBLISHED/UNPUBLISHED
	 */
	private String stateMachineStatus = "UNPUBLISHED";
	/**
	 * All the events that are registered in the state machine. Comma separated
	 * string based on the events entered by the user
	 */
	private String stateMachineEvents;
	/**
	 * State Machine graph containing the XML serialized StateMachineGraphVO
	 */
	private String serialzedStateMachineGraph;
	/**
	 * SCXML generated for the state machine
	 */
	private String stateMachineModel;
	/**
	 * User name who created the state machine
	 */
	private String createdBy = System.getProperty("user.name");
	/**
	 * Time when created the state machine
	 */
	private Timestamp createdDate = new Timestamp(System.currentTimeMillis());
	/**
	 * User name who modified the state machine
	 */
	private String modifiedBy = System.getProperty("user.name");
	/**
	 * Time when modified the state machine
	 */
	private Timestamp modifiedDate = new Timestamp(System.currentTimeMillis());

	/**
	 * State Machine model graph
	 */
	private StateMachineGraphVO graph;

	/**
	 * @return the stateMachineId
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "id_gen")
	@TableGenerator(name = "id_gen", table = "teevra_sequence", pkColumnName = "table_name", valueColumnName = "seq_value", allocationSize = 1)
	@Column(name = "state_machine_id", nullable = false)
	public Long getStateMachineId() {
		return stateMachineId;
	}

	/**
	 * @param stateMachineId
	 *            the stateMachineId to set
	 */
	public void setStateMachineId(Long stateMachineId) {
		this.stateMachineId = stateMachineId;
	}

	/**
	 * @return the stateMachineName
	 */
	@Column(name = "state_machine_name", length = 50, nullable = false)
	public String getStateMachineName() {
		return stateMachineName;
	}

	/**
	 * @param stateMachineName
	 *            the stateMachineName to set
	 */
	public void setStateMachineName(String stateMachineName) {
		this.stateMachineName = stateMachineName;
	}

	/**
	 * @return the stateMachineDesc
	 */
	@Column(name = "state_machine_desc", length = 50, nullable = true)
	public String getStateMachineDesc() {
		return stateMachineDesc;
	}

	/**
	 * @param stateMachineDesc
	 *            the stateMachineDesc to set
	 */
	public void setStateMachineDesc(String stateMachineDesc) {
		this.stateMachineDesc = stateMachineDesc;
	}

	/**
	 * @return the stateMachineStatus
	 */
	@Column(name = "state_machine_status", length = 20, nullable = false)
	public String getStateMachineStatus() {
		return stateMachineStatus;
	}

	/**
	 * @param stateMachineStatus
	 *            the stateMachineStatus to set
	 */
	public void setStateMachineStatus(String stateMachineStatus) {
		this.stateMachineStatus = stateMachineStatus;
	}

	/**
	 * @return the stateMachineEvents
	 */
	@Column(name = "state_machine_events", nullable = true)
	public String getStateMachineEvents() {
		return stateMachineEvents;
	}

	/**
	 * @param stateMachineEvents
	 *            the stateMachineEvents to set
	 */
	public void setStateMachineEvents(String stateMachineEvents) {
		this.stateMachineEvents = stateMachineEvents;
	}

	/**
	 * @return the serialzedStateMachineGraph
	 */
	@Column(name = "state_machine_graph", nullable = true)
	public String getSerialzedStateMachineGraph() {
		return serialzedStateMachineGraph;
	}

	/**
	 * @param serialzedStateMachineGraph
	 *            the serialzedStateMachineGraph to set
	 */
	public void setSerialzedStateMachineGraph(String serialzedStateMachineGraph)
			throws StateMachineServiceException {
		this.serialzedStateMachineGraph = serialzedStateMachineGraph;

		if (serialzedStateMachineGraph != null) {
			// deserialize the graph to create StateMachineGraphVO
			byte[] bytes;
			try {
				bytes = serialzedStateMachineGraph.getBytes("UTF-8");
				ByteArrayInputStream io = new ByteArrayInputStream(bytes);
				XMLDecoder decoder = new XMLDecoder(io);
				graph = (StateMachineGraphVO) decoder.readObject();
			} catch (UnsupportedEncodingException e) {
				logger
						.error(
								"Error while generating serialized state machine graph ",
								e);
				throw new StateMachineServiceException(e.getMessage());
			}
		}
	}

	/**
	 * @return the stateMachineModel
	 */
	@Column(name = "state_machine_model", nullable = true)
	public String getStateMachineModel() {
		return stateMachineModel;
	}

	/**
	 * @param stateMachineModel
	 *            the stateMachineModel to set
	 */
	public void setStateMachineModel(String stateMachineModel) {
		this.stateMachineModel = stateMachineModel;
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
	public StateMachineGraphVO getGraph() {
		return graph;
	}

	/**
	 * @param graph
	 *            the graph to set
	 */
	public void setGraph(StateMachineGraphVO graph) {
		this.graph = graph;

		if (graph != null) {
			ByteArrayOutputStream os = new ByteArrayOutputStream();
			XMLEncoder encoder = new XMLEncoder(os);
			encoder.writeObject(graph);
			encoder.close();

			this.serialzedStateMachineGraph = os.toString();
		}
	}

	/**
	 * String representation of the StateMachineEO
	 * 
	 * @precondition
	 * @postcondition
	 * @return the string
	 */
	public String toString() {
		StringBuffer str = new StringBuffer();
		str.append("<State Machine Id= ");
		str.append(this.getStateMachineId());
		str.append(", Name= ");
		str.append(this.getStateMachineName());
		str.append(", Description= ");
		str.append(this.getStateMachineDesc());
		str.append(", Status= ");
		str.append(this.getStateMachineStatus());
		str.append(", Events= {");
		str.append(this.getStateMachineEvents() + "}");
		str.append(">");
		return str.toString();

	}

}
