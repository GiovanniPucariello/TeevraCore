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
 * $Id: RoleEO.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Apr 27, 2009 
 */

package com.headstrong.teevra.services.useradmin.eo;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.Check;

/**
 * EO corresponds to the 'Roles' table which holds the details of the role
 */
@Entity
@Table(name = "roles", uniqueConstraints = { @UniqueConstraint(columnNames = { "role_name" }) })
public class RoleEO implements Serializable {

	/**
	 * Separator for the roles of the user
	 */
	private static String ROLE_NAMES_SEPERATOR = ",";

	/**
	 * Denoting that the role is active
	 */
	public static final String STATUS_ACTIVE = "ACTIVE";

	/**
	 * Denoting that the role is not active
	 */
	public static final String STATUS_INACTIVE = "INACTIVE";

	/**
	 * generated serial version UID
	 */
	private static final long serialVersionUID = -1488065283078299461L;

	/**
	 * Unique identifier for the role
	 */
	private Long roleId;
	/**
	 * Name of the role which is unique
	 */
	private String roleName;
	/**
	 * Role Description
	 */
	private String roleDesc;
	/**
	 * Status of the role- ACTIVE/INACTIVE
	 */
	private String roleStatus = STATUS_ACTIVE;
	/**
	 * User name who created the role
	 */
	private String createdBy;
	/**
	 * Time when created the role
	 */
	private Timestamp createdDate;
	/**
	 * User name who modified the role
	 */
	private String modifiedBy;
	/**
	 * Time when modified the role
	 */
	private Timestamp modifiedDate;
	/**
	 * List of all activities defined for the role
	 */
	private List<ActivityEO> activities;
	/**
	 * Comma separated string of all the activity names defined for the role
	 */
	private String activityNames;

	/**
	 * @return the roleId
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "id_gen")
	@TableGenerator(name = "id_gen", table = "teevra_sequence", pkColumnName = "table_name", valueColumnName = "seq_value", allocationSize = 1)
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
	 * @return the roleName
	 */
	@Column(name = "role_name", length = 50, nullable = false)
	public String getRoleName() {
		return roleName;
	}

	/**
	 * @param roleName
	 *            the roleName to set
	 */
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	/**
	 * @return the roleDesc
	 */
	@Column(name = "role_desc", length = 200, nullable = true)
	public String getRoleDesc() {
		return roleDesc;
	}

	/**
	 * @param roleDesc
	 *            the roleDesc to set
	 */
	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}

	/**
	 * @return the roleStatus
	 */
	@Column(name = "role_status", length = 20, nullable = true)
	@Check(constraints = "(ACTIVE) OR (INACTIVE)")
	public String getRoleStatus() {
		return roleStatus;
	}

	/**
	 * @param roleStatus
	 *            the roleStatus to set
	 */
	public void setRoleStatus(String roleStatus) {
		this.roleStatus = roleStatus;
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
	 * @return the activities
	 */
	@Transient
	public List<ActivityEO> getActivities() {
		return activities;
	}

	/**
	 * @param activities
	 *            the activities to set
	 */
	public void setActivities(List<ActivityEO> activities) {
		this.activities = activities;
	}

	/**
	 * @return the activityNames
	 */
	@Transient
	public String getActivityNames() {
		return activityNames;
	}

	/**
	 * @param activityNames
	 *            the activityNames to set
	 */
	public void setActivityNames(String activityNames) {
		this.activityNames = activityNames;
	}

	/**
	 * Creates String using names of the roles
	 * 
	 * @precondition
	 * @postcondition
	 * @param roles
	 * @return
	 */
	public static String rolesToString(List<RoleEO> roles) {
		String roleNames = "";
		// generate roleNames string if the list is not empty
		if ((roles != null) && (!roles.isEmpty())) {

			for (RoleEO role : roles) {
				roleNames = roleNames + role.getRoleName()
						+ ROLE_NAMES_SEPERATOR;
			}
			roleNames = roleNames.substring(0, roleNames.length() - 1);
		}
		return roleNames;
	}

	/**
	 * String representation of the RoleEO
	 * 
	 * @precondition
	 * @postcondition
	 * @return the string
	 */
	public String toString() {
		StringBuffer str = new StringBuffer();
		str.append("< RoleId= ");
		str.append(this.getRoleId());
		str.append(", Name= ");
		str.append(this.getRoleName());
		str.append(", Description= ");
		str.append(this.getRoleDesc());
		str.append(", Activities= ");
		str.append(this.getActivityNames());
		str.append(", Status= ");
		str.append(this.getRoleStatus());
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
