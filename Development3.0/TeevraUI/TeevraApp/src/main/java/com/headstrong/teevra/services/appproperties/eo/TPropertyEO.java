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
 * $Id: TPropertyEO.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Jun 3, 2009 
 */

package com.headstrong.teevra.services.appproperties.eo;

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

import org.hibernate.annotations.Check;

/**
 * EO corresponds to the 'T_Property' table which holds default properties for
 * the application
 */
@Entity
@Table(name = "t_property", uniqueConstraints = { @UniqueConstraint(columnNames = { "property_name" }) })
public class TPropertyEO implements Serializable {

	/**
	 * Denoting that the role is active
	 */
	public static final String STATUS_ACTIVE = "ACTIVE";

	/**
	 * generated serial version UID
	 */
	private static final long serialVersionUID = -7328187093974896255L;

	/**
	 * Identifier of property
	 */
	private Long propertyId;
	/**
	 * key/name to identify the property
	 */
	private String propertyName;
	/**
	 * Value of the property
	 */
	private String propertyValue;
	/**
	 * Description of the property
	 */
	private String propertyDesc;
	/**
	 * Status of the property-ACTIVE/INACTIVE
	 */
	private String propertyStatus = STATUS_ACTIVE;
	/**
	 * Comments on the property
	 */
	private String comments;
	/**
	 * User name who created the property
	 */
	private String createdBy;
	/**
	 * Time when created the property
	 */
	private Timestamp createdDate;
	/**
	 * User name who modified the property
	 */
	private String modifiedBy;
	/**
	 * Time when modified the property
	 */
	private Timestamp modifiedDate;

	/**
	 * @return the propertyId
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "id_gen")
	@TableGenerator(name = "id_gen", table = "teevra_sequence", pkColumnName = "table_name", valueColumnName = "seq_value", allocationSize = 1)
	@Column(name = "property_id", nullable = false)
	public Long getPropertyId() {
		return propertyId;
	}

	/**
	 * @param propertyId
	 *            the propertyId to set
	 */
	public void setPropertyId(Long propertyId) {
		this.propertyId = propertyId;
	}

	/**
	 * @return the propertyName
	 */
	@Column(name = "property_name", length = 50, nullable = false)
	public String getPropertyName() {
		return propertyName;
	}

	/**
	 * @param propertyName
	 *            the propertyName to set
	 */
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	/**
	 * @return the propertyValue
	 */
	@Column(name = "property_value", length = 50, nullable = false)
	public String getPropertyValue() {
		return propertyValue;
	}

	/**
	 * @param propertyValue
	 *            the propertyValue to set
	 */
	public void setPropertyValue(String propertyValue) {
		this.propertyValue = propertyValue;
	}

	/**
	 * @return the propertyDesc
	 */
	@Column(name = "property_desc", length = 200, nullable = false)
	public String getPropertyDesc() {
		return propertyDesc;
	}

	/**
	 * @param propertyDesc
	 *            the propertyDesc to set
	 */
	public void setPropertyDesc(String propertyDesc) {
		this.propertyDesc = propertyDesc;
	}

	/**
	 * @return the propertyStatus
	 */
	@Column(name = "property_status", length = 20, nullable = false)
	@Check(constraints = "(ACTIVE) OR (INACTIVE)")
	public String getPropertyStatus() {
		return propertyStatus;
	}

	/**
	 * @param propertyStatus
	 *            the propertyStatus to set
	 */
	public void setPropertyStatus(String propertyStatus) {
		this.propertyStatus = propertyStatus;
	}

	/**
	 * @return the comments
	 */
	@Column(name = "comments", length = 200, nullable = false)
	public String getComments() {
		return comments;
	}

	/**
	 * @param comments
	 *            the comments to set
	 */
	public void setComments(String comments) {
		this.comments = comments;
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
	 * String representation of the TPropertyEO
	 * 
	 * @precondition
	 * @postcondition
	 * @return the string
	 */
	public String toString() {
		StringBuffer str = new StringBuffer();
		str.append("< PropertId= ");
		str.append(this.getPropertyId());
		str.append(", Name= ");
		str.append(this.getPropertyName());
		str.append(", Value= ");
		str.append(this.getPropertyValue());
		str.append(", Description= ");
		str.append(this.getPropertyDesc());
		str.append(", Status= ");
		str.append(this.getPropertyStatus());
		str.append(", Comments= ");
		str.append(this.getComments());
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
