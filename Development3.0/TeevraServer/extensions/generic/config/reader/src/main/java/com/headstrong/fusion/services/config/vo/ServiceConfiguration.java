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
 * $Id: ServiceConfiguration.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Oct 22, 2008 
 */

package com.headstrong.fusion.services.config.vo;

/**
 * Represents Service Configuration.
 * 
 */
public class ServiceConfiguration {

	private String processId;
	private String serviceId;
	private String propertyId;

	/**
	 * @return the processId
	 */
	public String getProcessId() {
		return processId;
	}

	/**
	 * @param processId
	 *            the processId to set
	 */
	public void setProcessId(String processId) {
		this.processId = processId;
	}

	/**
	 * @return the serviceId
	 */
	public String getServiceId() {
		return serviceId;
	}

	/**
	 * @param serviceId
	 *            the serviceId to set
	 */
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	/**
	 * @return the propertyId
	 */
	public String getPropertyId() {
		return propertyId;
	}

	/**
	 * @param propertyId
	 *            the propertyId to set
	 */
	public void setPropertyId(String propertyId) {
		this.propertyId = propertyId;
	}

	@Override
	public int hashCode() {
		return (processId == null ? 17 : processId.hashCode())
				^ (serviceId == null ? 17 : serviceId.hashCode())
				^ (propertyId == null ? 17 : propertyId.hashCode());
	}

	@Override
	public boolean equals(Object obj) {
		// Objects are same
		if (this == obj) {
			return true;
		}
		// Check class type
		if (obj == null 
				|| (getClass() != obj.getClass())) {
			return false;
		}

		ServiceConfiguration serviceConf = (ServiceConfiguration) obj;
		// check individual fields
		if (compareAccountingNull(this.processId, serviceConf.processId)
				&& compareAccountingNull(this.serviceId, serviceConf.serviceId)
				&& compareAccountingNull(this.propertyId,
						serviceConf.propertyId)) {
			return true;
		}
		return false;
	}

	private boolean compareAccountingNull(String str1, String str2) {
		if (str1 == null && str2 == null) {
			return true;
		}
		if ((str1 != null && str2 != null) && (str1.equals(str2))) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		StringBuffer sb=new StringBuffer();
		sb.append("Processid:"+this.processId);
		sb.append("\nServiceId:"+this.serviceId);
		sb.append("\npropertyId:"+this.propertyId);
		return sb.toString();
	}
}
