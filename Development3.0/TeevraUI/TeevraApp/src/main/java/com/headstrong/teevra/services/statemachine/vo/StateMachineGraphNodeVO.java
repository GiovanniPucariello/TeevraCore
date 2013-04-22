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
 * $Id: StateMachineGraphNodeVO.java
 * $Revision: 
 * $Author: viswanathp
 * $DateTime: Mar 6, 2009 
 */

package com.headstrong.teevra.services.statemachine.vo;

import java.io.Serializable;

/**
 * Represents a node in the state machine model graph.
 */
public class StateMachineGraphNodeVO implements Serializable {

	/**
	 * generated serial version UID
	 */
	private static final long serialVersionUID = -7709296431434656042L;

	/**
	 * Name of the state which represents the node. Identifier for the node
	 */
	private String nodeId;
	/**
	 * The X co-ordinate of the node in the graph. This denotes the top left
	 * corner of the smallest rectangle that can be drawn to cover the node in
	 * the graph.
	 */
	private Long x;
	/**
	 * The Y co-ordinate of the node in the graph. This denotes the top left
	 * corner of the smallest rectangle that can be drawn to cover the node in
	 * the graph.
	 */
	private Long y;
	/**
	 * Object which holds all the configurations of the node
	 */
	private StateVO stateDetails;

	/**
	 * @return the nodeId
	 */
	public String getNodeId() {
		return nodeId;
	}

	/**
	 * @param nodeId
	 *            the nodeId to set
	 */
	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}

	/**
	 * @return the x
	 */
	public Long getX() {
		return x;
	}

	/**
	 * @param x
	 *            the x to set
	 */
	public void setX(Long x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public Long getY() {
		return y;
	}

	/**
	 * @param y
	 *            the y to set
	 */
	public void setY(Long y) {
		this.y = y;
	}

	/**
	 * @return the stateDetails
	 */
	public StateVO getStateDetails() {
		return stateDetails;
	}

	/**
	 * @param stateDetails
	 *            the stateDetails to set
	 */
	public void setStateDetails(StateVO stateDetails) {
		this.stateDetails = stateDetails;
	}
}
