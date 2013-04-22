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
 * $Id: ProcessGraphVO.java
 * $Revision: 
 * $Author: Akrishnamoorthy
 * $DateTime: Oct 12, 2008 
 */

package com.headstrong.teevra.services.process.vo;

import java.io.Serializable;
import java.util.Map;

import com.headstrong.teevra.services.process.eo.ProcessServiceEO;

/**
 * Object model for the process model graph used in the presentation layer.
 */
public class ProcessGraphVO implements Serializable {
	/**
	 * Serial version UID
	 */
	private static final long serialVersionUID = -7905033132534557290L;
	/**
	 * Unique identifier for a process graph. Can be same as process Id
	 */
	private Long processId;

	/**
	 * List of nodes in the process graph along with geometry.
	 */
	private Map<String, ProcessGraphNodeVO> nodes;

	/**
	 * List of connectors present in the graph
	 */
	private Map<String, Map<String, ProcessGraphLinkVO>> links;

	private ProcessServiceEO errorReportNHandlingConfigs;

	/**
	 * @return the errorReportNHandlingConfigs
	 */
	public ProcessServiceEO getErrorReportNHandlingConfigs() {
		return errorReportNHandlingConfigs;
	}

	/**
	 * @param errorReportNHandlingConfigs
	 *            the errorReportNHandlingConfigs to set
	 */
	public void setErrorReportNHandlingConfigs(
			ProcessServiceEO errorReportNHandlingConfigs) {
		this.errorReportNHandlingConfigs = errorReportNHandlingConfigs;
	}

	/**
	 * @return the processId
	 */
	public Long getProcessId() {
		return processId;
	}

	/**
	 * @param processId
	 *            the processId to set
	 */
	public void setProcessId(Long processId) {
		this.processId = processId;
	}

	/**
	 * @return the nodes
	 */
	public Map<String, ProcessGraphNodeVO> getNodes() {
		return nodes;
	}

	/**
	 * @param nodes
	 *            the nodes to set
	 */
	public void setNodes(Map<String, ProcessGraphNodeVO> nodes) {
		this.nodes = nodes;
	}

	/**
	 * @return the links
	 */
	public Map<String, Map<String, ProcessGraphLinkVO>> getLinks() {
		return links;
	}

	/**
	 * @param links
	 *            the links to set
	 */
	public void setLinks(Map<String, Map<String, ProcessGraphLinkVO>> links) {
		this.links = links;
	}

}
