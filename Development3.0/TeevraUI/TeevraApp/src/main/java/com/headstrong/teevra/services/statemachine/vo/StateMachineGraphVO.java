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
 * $Id: StateMachineGraphVO.java
 * $Revision: 
 * $Author: viswanathp
 * $DateTime: Mar 6, 2009 
 */

package com.headstrong.teevra.services.statemachine.vo;

import java.io.Serializable;
import java.util.Map;

/**
 * Object model for the state machine model graph used in the presentation
 * layer.
 */
public class StateMachineGraphVO implements Serializable {

	/**
	 * generated serial version UID
	 */
	private static final long serialVersionUID = -7807194804448283711L;

	/**
	 * Unique identifier for a state machine graph. Can be same as
	 * stateMachineId
	 */
	private Long stateMachineGraphId;

	/**
	 * List of nodes in the state machine graph along with geometry.
	 */
	private Map<String, StateMachineGraphNodeVO> nodes;

	/**
	 * List of connections present in the graph
	 */
	private Map<String, Map<String, StateMachineGraphLinkVO>> links;

	/**
	 * @return the stateMachineGraphId
	 */
	public Long getStateMachineGraphId() {
		return stateMachineGraphId;
	}

	/**
	 * @param stateMachineGraphId
	 *            the stateMachineGraphId to set
	 */
	public void setStateMachineGraphId(Long stateMachineGraphId) {
		this.stateMachineGraphId = stateMachineGraphId;
	}

	/**
	 * @return the nodes
	 */
	public Map<String, StateMachineGraphNodeVO> getNodes() {
		return nodes;
	}

	/**
	 * @param nodes
	 *            the nodes to set
	 */
	public void setNodes(Map<String, StateMachineGraphNodeVO> nodes) {
		this.nodes = nodes;
	}

	/**
	 * @return the links
	 */
	public Map<String, Map<String, StateMachineGraphLinkVO>> getLinks() {
		return links;
	}

	/**
	 * @param links
	 *            the links to set
	 */
	public void setLinks(Map<String, Map<String, StateMachineGraphLinkVO>> links) {
		this.links = links;
	}

}
