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
 * $Id: StateMachineGraphLinkVO.java
 * $Revision: 
 * $Author: viswanathp
 * $DateTime: Mar 6, 2009 
 */

package com.headstrong.teevra.services.statemachine.vo;

import java.io.Serializable;

/**
 * Represents the connectors in the state machine model graph.
 */
public class StateMachineGraphLinkVO implements Serializable {

	/**
	 * generates serial version UID
	 */
	private static final long serialVersionUID = 8614192305326179475L;

	/**
	 * Identifier, name of the start node for the link
	 */
	private String startNodeId;
	/**
	 * Identifier, name of the end node for the link
	 */
	private String endNodeId;
	/**
	 * The starting X co-ordinate of the link
	 */
	private Long startX;
	/**
	 * Identifier of the end node for the link
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
	 * Object which holds all the configurations of the link
	 */
	private StateMachineLinkVO linkDetails;
	
	/**
	 * width of the Form node
	 */
	private int fromNodeWidth;
	
	/**
	 * height of  From Node
	 */
	private int fromNodeHeight;
	
	/**
	 * width of the To node
	 */
	private int toNodeWidth;
	
	/**
	 * height of  To Node
	 */
	private int toNodeHeight;
	

	/**
	 * @return the startNodeId
	 */
	public String getStartNodeId() {
		return startNodeId;
	}

	/**
	 * @param startNodeId the startNodeId to set
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
	 * @param endNodeId the endNodeId to set
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

	/**
	 * @return the linkDetails
	 */
	public StateMachineLinkVO getLinkDetails() {
		return linkDetails;
	}

	/**
	 * @param linkDetails
	 *            the linkDetails to set
	 */
	public void setLinkDetails(StateMachineLinkVO linkDetails) {
		this.linkDetails = linkDetails;
	}

	/**
	 * @return the fromNodeWidth
	 */
	public int getFromNodeWidth() {
		return fromNodeWidth;
	}

	/**
	 * @param fromNodeWidth
	 */
	public void setFromNodeWidth(int fromNodeWidth) {
		this.fromNodeWidth = fromNodeWidth;
	}

	/**
	 * @return fromNodeHeight
	 */
	public int getFromNodeHeight() {
		return fromNodeHeight;
	}

	/**
	 * @param fromNodeHeight
	 */
	public void setFromNodeHeight(int fromNodeHeight) {
		this.fromNodeHeight = fromNodeHeight;
	}

	/**
	 * @return toNodeWidth
	 */
	public int getToNodeWidth() {
		return toNodeWidth;
	}

	/**
	 * @param toNodeWidth
	 */
	public void setToNodeWidth(int toNodeWidth) {
		this.toNodeWidth = toNodeWidth;
	}

	/**
	 * @return toNodeHeight
	 */
	public int getToNodeHeight() {
		return toNodeHeight;
	}

	/**
	 * @param toNodeHeight
	 */
	public void setToNodeHeight(int toNodeHeight) {
		this.toNodeHeight = toNodeHeight;
	}
}
