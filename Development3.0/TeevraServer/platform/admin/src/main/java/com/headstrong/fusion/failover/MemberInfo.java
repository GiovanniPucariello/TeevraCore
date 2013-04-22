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
 * $Id: MemberContext.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Jan 22, 2009 
 */

package com.headstrong.fusion.failover;

import java.io.Serializable;
import java.util.Date;
import java.util.Observable;

import com.headstrong.fusion.failover.State;

/**
 * Contains the information about the fusion instance.
 * This would be used by other members while communicating
 * with each other.
 *  
 */
public class MemberInfo extends Observable implements Serializable {
	
	/**
	 * Default serial version id.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * A unique id assigned to the cluster.
	 */
	private int clusterId;
	
	/**
	 * Unique name assigned to the cluster.
	 */
	private String clusterName;
	
	/**
	 * Unique member name across the cluster.
	 * A default name is generated if nothing is provided.
	 * 
	 */
	private String memberName;
	/**
	 * Current member state ACTIVE/STANDY
	 */
	private State state;
	
	/**
	 * Instance start time.
	 */
	private Date startTime;
	
	/**
	 * Connection URL required by the external application
	 * 
	 */
	private String connectorUrl;
	
	/**
	 * Boolean variable specifies if the application is running 
	 * in clustered mode or not.
	 */
	private boolean clustered;
	
	/**
	 * Master/Slave
	 */
	private String nodeType;
	
	/**
	 * @return the memberName
	 */
	public String getMemberName() {
		return memberName;
	}

	/**
	 * @param memberName the memberName to set
	 */
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	/**
	 * @return the state
	 */
	public State getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(State state) {
		this.state = state;
		/**
		 * Notify observers of the state change.
		 */
		this.setChanged();
		this.notifyObservers();
	}

	/**
	 * @return the startTime
	 */
	public Date getStartTime() {
		return startTime;
	}

	/**
	 * @param startTime the startTime to set
	 */
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	/**
	 * @return the connectorUrl
	 */
	public String getConnectorUrl() {
		return connectorUrl;
	}

	/**
	 * @param connectorUrl the connectorUrl to set
	 */
	public void setConnectorUrl(String connectorUrl) {
		this.connectorUrl = connectorUrl;
	}

	/**
	 * @return the clustered
	 */
	public boolean isClustered() {
		return clustered;
	}

	/**
	 * @param clustered the clustered to set
	 */
	public void setClustered(boolean clustered) {
		this.clustered = clustered;
	}

	/**
	 * @return the nodeType
	 */
	public String getNodeType() {
		return nodeType;
	}

	/**
	 * @param nodeType the nodeType to set
	 */
	public void setNodeType(String nodeType) {
		this.nodeType = nodeType;
	}
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append(this.memberName);
		str.append("|");
		str.append(this.nodeType);
		str.append("|");
		str.append(this.startTime);
		str.append("|");
		str.append(this.state);
		str.append("|");
		str.append(this.connectorUrl);
		str.append("|");
		str.append(this.clustered);
		return str.toString();
	}

	/**
	 * @return the clusterName
	 */
	public String getClusterName() {
		return clusterName;
	}

	/**
	 * @param clusterName the clusterName to set
	 */
	public void setClusterName(String clusterName) {
		this.clusterName = clusterName;
	}

	/**
	 * @return the clusterId
	 */
	public int getClusterId() {
		return clusterId;
	}

	/**
	 * @param clusterId the clusterId to set
	 */
	public void setClusterId(int clusterId) {
		this.clusterId = clusterId;
	}
}
