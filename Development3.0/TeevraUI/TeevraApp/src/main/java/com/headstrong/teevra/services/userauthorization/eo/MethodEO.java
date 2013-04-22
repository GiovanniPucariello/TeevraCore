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
 * $Id: MethodEO.java
 * $Revision: 
 * $Author: viswanathp
 * $DateTime: May 20, 2009 
 */

package com.headstrong.teevra.services.userauthorization.eo;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.UniqueConstraint;

/**
 * EO corresponds to the 'Method' table, which holds all the methods in the
 * application
 */
@Entity
@Table(name = "method", uniqueConstraints = { @UniqueConstraint(columnNames = { "method_name" }) })
public class MethodEO implements Serializable {

	/**
	 * generated serial version UID
	 */
	private static final long serialVersionUID = 7648203782918579318L;

	/**
	 * Identifier for method
	 */
	private Long methodId;
	/**
	 * Name of the method
	 */
	private String methodName;
	/**
	 * Method Description
	 */
	private String methodDesc;
	/**
	 * Name of the service to which the method belongs to
	 */
	private String serviceName;
	/**
	 * User name who created the method
	 */
	private String createdBy;
	/**
	 * Time when created the method
	 */
	private Timestamp createdDate;
	/**
	 * User name who modified the method
	 */
	private String modifiedBy;
	/**
	 * Time when modified the method
	 */
	private Timestamp modifiedDate;

	/**
	 * @return the methodId
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "id_gen")
	@TableGenerator(name = "id_gen", table = "teevra_sequence", pkColumnName = "table_name", valueColumnName = "seq_value", allocationSize = 1)
	@Column(name = "method_id", nullable = true)
	public Long getMethodId() {
		return methodId;
	}

	/**
	 * @param methodId
	 *            the methodId to set
	 */
	public void setMethodId(Long methodId) {
		this.methodId = methodId;
	}

	/**
	 * @return the methodName
	 */
	@Column(name = "method_name", length = 50, nullable = false)
	public String getMethodName() {
		return methodName;
	}

	/**
	 * @param methodName
	 *            the methodName to set
	 */
	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	/**
	 * @return the methodDesc
	 */
	@Column(name = "method_desc", length = 200, nullable = true)
	public String getMethodDesc() {
		return methodDesc;
	}

	/**
	 * @param methodDesc
	 *            the methodDesc to set
	 */
	public void setMethodDesc(String methodDesc) {
		this.methodDesc = methodDesc;
	}

	/**
	 * @return the serviceName
	 */
	@Column(name = "service_name", length = 50, nullable = false)
	public String getServiceName() {
		return serviceName;
	}

	/**
	 * @param serviceName
	 *            the serviceName to set
	 */
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	/**
	 * @return the createdBy
	 */
	@Column(name = "created_by", length = 50, nullable = false)
	public String getCreatedBy() {
		return createdBy;
	}

	/**
	 * @param createdBy
	 *            the createdBy to set
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	/**
	 * @return the createdDate
	 */
	@Column(name = "created_date", nullable = false)
	public Timestamp getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate
	 *            the createdDate to set
	 */
	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * @return the modifiedBy
	 */
	@Column(name = "modified_by", length = 50, nullable = true)
	public String getModifiedBy() {
		return modifiedBy;
	}

	/**
	 * @param modifiedBy
	 *            the modifiedBy to set
	 */
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	/**
	 * @return the modifiedDate
	 */
	@Column(name = "modified_date", nullable = true)
	public Timestamp getModifiedDate() {
		return modifiedDate;
	}

	/**
	 * @param modifiedDate
	 *            the modifiedDate to set
	 */
	public void setModifiedDate(Timestamp modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	/**
	 * String representation of the MethodEO
	 * 
	 * @precondition
	 * @postcondition
	 * @return the string
	 */
	public String toString() {
		StringBuffer str = new StringBuffer();
		str.append("< Method Id= ");
		str.append(this.getMethodId());
		str.append(", Name= ");
		str.append(this.getMethodName());
		str.append(", Description= ");
		str.append(this.getMethodDesc());
		str.append(", Service Name= ");
		str.append(this.getServiceName());
		str.append(", CreatedBy= ");
		str.append(this.getCreatedBy());
		str.append(", CreatedDate= ");
		str.append(this.getCreatedDate());
		str.append(", ModifiedBy= ");
		str.append(this.getModifiedBy());
		str.append(", ModifiedDate= ");
		str.append(this.getModifiedDate());
		str.append(">");
		return str.toString();
	}
}
