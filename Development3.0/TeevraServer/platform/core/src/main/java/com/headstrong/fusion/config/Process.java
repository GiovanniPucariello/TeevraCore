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
 * $Id: Process.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Sep 25, 2008 
 */

package com.headstrong.fusion.config;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Class represent a process in teevra.
 */
public class Process implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8450477747736127819L;

	// process identifier
	private String id;

	/**
	 * Process Name. Generally used for display purpose.
	 * 
	 */
	private String name;

	// Default flow type is seda.
	private String flow = "SEDA";

	private List<Route> routes = new ArrayList<Route>();

	/**
	 * List of On Error Configuration.
	 */
	private List<OnErrorConfig> onErrorConfigList;

	/**
	 * This variable identifies if the recovery should be enabled or disabled
	 * for the process. By default the recovery would be enabled.
	 */
	private boolean toRecover = true;

	/**
	 * This variable identifies if the message event logs should be generated
	 * for the process
	 */
	private boolean toLogPrcsEvents = true;
	/**
	 * This variable identifies if the process event logs should be generated
	 * for the process
	 */
	private boolean toLogMsgEvents = true;
	/**
	 * This variable identifies if the component event logs should be generated
	 * for the process
	 */
	private boolean toLogCompEvents = false;
	/**
	 * Throttle Time
	 */
	private String throttleTime;
	/**
	 * Throttle Message Count
	 */
	private String throttleMsgCount;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the flow
	 */
	public String getFlow() {
		return flow;
	}

	/**
	 * @param flow
	 *            the flow to set
	 */
	public void setFlow(String flow) {
		this.flow = flow;
	}

	/**
	 * @return the routes
	 */
	public List<Route> getRoutes() {
		return routes;
	}

	/**
	 * @param routes
	 *            the routes to set
	 */
	public void setRoutes(List<Route> routes) {
		this.routes = routes;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the onErrorConfigList
	 */
	public List<OnErrorConfig> getOnErrorConfigList() {
		return onErrorConfigList;
	}

	/**
	 * @param onErrorConfigList
	 *            the onErrorConfigList to set
	 */
	public void setOnErrorConfigList(List<OnErrorConfig> onErrorConfigList) {
		this.onErrorConfigList = onErrorConfigList;
	}

	public boolean isToRecover() {
		return toRecover;
	}

	public void setToRecover(boolean toRecover) {
		this.toRecover = toRecover;
	}

	/**
	 * @return the toLogPrcsEvents
	 */
	public boolean isToLogPrcsEvents() {
		return toLogPrcsEvents;
	}

	/**
	 * @param toLogPrcsEvents
	 *            the toLogPrcsEvents to set
	 */
	public void setToLogPrcsEvents(boolean toLogPrcsEvents) {
		this.toLogPrcsEvents = toLogPrcsEvents;
	}

	/**
	 * @return the toLogMsgEvents
	 */
	public boolean isToLogMsgEvents() {
		return toLogMsgEvents;
	}

	/**
	 * @param toLogMsgEvents
	 *            the toLogMsgEvents to set
	 */
	public void setToLogMsgEvents(boolean toLogMsgEvents) {
		this.toLogMsgEvents = toLogMsgEvents;
	}

	/**
	 * @return the toLogCompEvents
	 */
	public boolean isToLogCompEvents() {
		return toLogCompEvents;
	}

	/**
	 * @param toLogCompEvents
	 *            the toLogCompEvents to set
	 */
	public void setToLogCompEvents(boolean toLogCompEvents) {
		this.toLogCompEvents = toLogCompEvents;
	}

	/**
	 * @return throttleTime
	 * 
	 */
	public String getThrottleTime() {
		return throttleTime;
	}

	/**
	 * @param throttleTime
	 *            the throttleTime to set
	 */
	public void setThrottleTime(String throttleTime) {
		this.throttleTime = throttleTime;
	}

	/**
	 * @return throttleMsgCount
	 * 
	 */
	public String getThrottleMsgCount() {
		return throttleMsgCount;
	}

	/**
	 * @param throttleMsgCount
	 *            the throttleMsgCount to set
	 */
	public void setThrottleMsgCount(String throttleMsgCount) {
		this.throttleMsgCount = throttleMsgCount;
	}

}
