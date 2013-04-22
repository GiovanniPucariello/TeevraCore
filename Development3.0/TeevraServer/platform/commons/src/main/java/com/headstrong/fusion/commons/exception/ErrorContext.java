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
 * $Id: ErrorContext.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: May 20, 2009 
 */

package com.headstrong.fusion.commons.exception;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Context to store the exception and other related information.
 * 
 */
public class ErrorContext {

	/**
	 * Exception Type.
	 */
	private String type;

	/**
	 * 
	 */
	private String processId;
	/**
	 * Unique service identifier.
	 */
	private String serviceId;

	/**
	 * Component Type e.g. validator / transformer etc.
	 */
	private String componentType;

	/**
	 * Time at which the exception was raised.
	 */
	private Date timestamp;

	/**
	 * Cause of the Error.
	 */
	private Throwable cause;

	/**
	 * Message that caused the error.
	 */
	private Object resource;

	/**
	 * Additional Information.
	 */
	private String moreInfo;

	/**
	 * Additional properties related to the error context.
	 */
	private Map<String, String> properties;
	
	/**
	 * Fixml version sp2 or 5_0
	 */
	private String fixmlVersion;

	/**
	 * @return the cause
	 */
	public Throwable getCause() {
		return cause;
	}

	/**
	 * @param cause
	 *            the cause to set
	 */
	public void setCause(Throwable cause) {
		this.cause = cause;
	}

	/**
	 * @return the resource
	 */
	public Object getResource() {
		return resource;
	}

	/**
	 * @param resource
	 *            the resource to set
	 */
	public void setResource(Object resource) {
		this.resource = resource;
	}

	/**
	 * @return the moreInfo
	 */
	public String getMoreInfo() {
		return moreInfo;
	}

	/**
	 * @param moreInfo
	 *            the moreInfo to set
	 */
	public void setMoreInfo(String moreInfo) {
		this.moreInfo = moreInfo;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	public String getServiceId() {
		return serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getComponentType() {
		return componentType;
	}

	public void setComponentType(String componentType) {
		this.componentType = componentType;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getProcessId() {
		return processId;
	}

	public void setProcessId(String processId) {
		this.processId = processId;
	}

	public Map<String, String> getProperties() {
		/**
		 * Not thread safe.
		 */
		if (this.properties == null) {
			this.properties = new HashMap<String, String>();
		}
		return properties;
	}
	
	public void setProperties(Map<String, String> properties){
		this.properties = properties;
	}

	public String getFixmlVersion() {
		return this.fixmlVersion;
	}

	public void setFixmlVersion(String fixmlVersion) {
		this.fixmlVersion = fixmlVersion;
	}
	
	
}
