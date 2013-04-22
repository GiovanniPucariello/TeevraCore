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
 * $Id: RoleActivityEO.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Apr 29, 2009 
 */

package com.headstrong.teevra.services.useradmin.eo;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

/**
 * EO corresponds to the 'Role_Activity' table which holds the mapping of role
 * to activity
 */
@Entity
@Table(name = "role_activity")
@IdClass(RoleActivityPK.class)
public class RoleActivityEO implements Serializable {

	/**
	 * generated serial version UID
	 */
	private static final long serialVersionUID = 7582659258214675534L;
	/**
	 * Identifier of role
	 */
	private Long roleId;
	/**
	 * identifier of activity
	 */
	private Long activityId;
	/**
	 * User name who created the mapping
	 */
	private String createdBy;
	/**
	 * Time when created the mapping
	 */
	private Timestamp createdDate;
	/**
	 * User name who modified the mapping
	 */
	private String modifiedBy;
	/**
	 * Time when modified the mapping
	 */
	private Timestamp modifiedDate;

	/**
	 * @return the roleId
	 */
	@Id
	@Column(name = "role_id", nullable = false)
	public Long getRoleId() {
		return roleId;
	}

	/**
	 * @param roleId
	 *            the roleId to set
	 */
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	/**
	 * @return the activityId
	 */
	@Id
	@Column(name = "activity_id", nullable = false)
	public Long getActivityId() {
		return activityId;
	}

	/**
	 * @param activityId
	 *            the activityId to set
	 */
	public void setActivityId(Long activityId) {
		this.activityId = activityId;
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
	 * String representation of the RoleActivityEO
	 * 
	 * @precondition
	 * @postcondition
	 * @return the string
	 */
	public String toString() {
		StringBuffer str = new StringBuffer();
		str.append("< RoleId= ");
		str.append(this.getRoleId());
		str.append(", ActivityId= ");
		str.append(this.getActivityId());
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
