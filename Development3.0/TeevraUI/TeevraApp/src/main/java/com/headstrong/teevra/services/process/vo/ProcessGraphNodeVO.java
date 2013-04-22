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
 * $Id: ProcessGraphNodeVO.java
 * $Revision: 
 * $Author: Akrishnamoorthy
 * $DateTime: Oct 12, 2008 
 */

package com.headstrong.teevra.services.process.vo;

import java.io.Serializable;

import com.headstrong.teevra.services.process.eo.ProcessServiceEO;

/**
 * Represents a node in the process model graph.
 */
public class ProcessGraphNodeVO implements Serializable {
	/**
	 * Serial version UID
	 */
	private static final long serialVersionUID = 8052731606201712718L;

	/**
	 * Identifier of the component the node represents
	 */
	private Long componentId;
	/**
	 * Identifier of the node
	 */
	private String nodeId;
	/**
	 * X co-ordinate of the node.This denotes the top left corner of the
	 * smallest rectangle that can be drawn to cover the node in the graph.
	 */
	private Long x;
	/**
	 * Y co-ordinate of the node.This denotes the top left corner of the
	 * smallest rectangle that can be drawn to cover the node in the graph.
	 */
	private Long y;
	/**
	 * service details of the component
	 */
	private ProcessServiceEO serviceDetails;

	/**
	 * @return the componentId
	 */
	public Long getComponentId() {
		return componentId;
	}

	/**
	 * @param componentId
	 *            the componentId to set
	 */
	public void setComponentId(Long componentId) {
		this.componentId = componentId;
	}

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
	 * @return the serviceDetails
	 */
	public ProcessServiceEO getServiceDetails() {
		return serviceDetails;
	}

	/**
	 * @param serviceDetails
	 *            the serviceDetails to set
	 */
	public void setServiceDetails(ProcessServiceEO serviceDetails) {
		this.serviceDetails = serviceDetails;
	}

}
