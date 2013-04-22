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
 * $Id: ProcessGraphNodeLinkVO.java
 * $Revision: 
 * $Author: Akrishnamoorthy
 * $DateTime: Oct 12, 2008 
 */

package com.headstrong.teevra.services.process.vo;

import java.io.Serializable;

/**
 * Represents the connectors in the process model graph.
 */
public class ProcessGraphLinkVO implements Serializable {
	/**
	 * Serial version UID
	 */
	private static final long serialVersionUID = -1335904000694100076L;

	/**
	 * Name of the start node for the link
	 */
	private String startNodeId;
	/**
	 * Name of the end node for the link
	 */
	private String endNodeId;
	/**
	 * The starting X co-ordinate of the link
	 */
	private Long startX;
	/**
	 * The starting Y co-ordinate of the link
	 */
	private Long startY;
	/**
	 * The ending X co-ordinate of the link
	 */
	private Long endX;
	/**
	 * The ending Y co-ordinate of the link
	 */
	private Long endY;

	/**
	 * @return the startNodeId
	 */
	public String getStartNodeId() {
		return startNodeId;
	}

	/**
	 * @param startNodeId
	 *            the startNodeId to set
	 */
	public void setStartNodeId(String startNodeId) {
		this.startNodeId = startNodeId;
	}

	/**
	 * @return the endNodeId
	 */
	public String getEndNodeId() {
		return endNodeId;
	}

	/**
	 * @param endNodeId
	 *            the endNodeId to set
	 */
	public void setEndNodeId(String endNodeId) {
		this.endNodeId = endNodeId;
	}

	/**
	 * @return the startX
	 */
	public Long getStartX() {
		return startX;
	}

	/**
	 * @param startX
	 *            the startX to set
	 */
	public void setStartX(Long startX) {
		this.startX = startX;
	}

	/**
	 * @return the startY
	 */
	public Long getStartY() {
		return startY;
	}

	/**
	 * @param startY
	 *            the startY to set
	 */
	public void setStartY(Long startY) {
		this.startY = startY;
	}

	/**
	 * @return the endX
	 */
	public Long getEndX() {
		return endX;
	}

	/**
	 * @param endX
	 *            the endX to set
	 */
	public void setEndX(Long endX) {
		this.endX = endX;
	}

	/**
	 * @return the endY
	 */
	public Long getEndY() {
		return endY;
	}

	/**
	 * @param endY
	 *            the endY to set
	 */
	public void setEndY(Long endY) {
		this.endY = endY;
	}
}
