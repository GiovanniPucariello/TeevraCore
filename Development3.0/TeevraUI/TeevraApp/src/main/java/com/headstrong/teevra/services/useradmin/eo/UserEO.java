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
 * $Id: UserEO.java
 * $Revision: 
 * $Author: viswanathp
 * $DateTime: Apr 20, 2009 
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
 * EO corresponds to the 'Users' table which holds the details of the user
 */
@Entity
@Table(name = "users", uniqueConstraints = { @UniqueConstraint(columnNames = { "user_name" }) })
public class UserEO implements Serializable {

	/**
	 * Denoting that the user account is active
	 */
	public static final String STATUS_ACTIVE = "ACTIVE";

	/**
	 * Denoting that the user account is not active
	 */
	public static final String STATUS_INACTIVE = "INACTIVE";

	/**
	 * generated serial version UID
	 */
	private static final long serialVersionUID = -7178060569272025028L;

	/**
	 * Unique identifier for the user
	 */
	private Long userId;
	/**
	 * Name of the user which is unique
	 */
	private String userName;
	/**
	 * First name of the user
	 */
	private String userFirstName;
	/**
	 * Last name of the user
	 */
	private String userLastName;
	/**
	 * Email address of the user
	 */
	private String emailId;
	/**
	 * Password
	 */
	private String password;
	/**
	 * user account status- ACTIVE/INACTIVE
	 */
	private String userStatus = STATUS_ACTIVE;
	/**
	 * User name who created the user
	 */
	private String createdBy;
	/**
	 * Time when created the user
	 */
	private Timestamp createdDate;
	/**
	 * User name who modified the user
	 */
	private String modifiedBy;
	/**
	 * Time when modified the user
	 */
	private Timestamp modifiedDate;
	/**
	 * List of roles of the user
	 */
	private List<RoleEO> roles;
	/**
	 * Comma separated string of all role names of the user
	 */
	private String roleNames;
	/**
	 * List of activities allowed for the user
	 */
	private List<ActivityEO> activities;
	/**
	 * List of activity ids
	 */
	private List<Long> activityIds;
	/**
	 * Whether the user has admin previliges
	 */
	private Boolean isAdmin = false;

	/**
	 * @return the userId
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "id_gen")
	@TableGenerator(name = "id_gen", table = "teevra_sequence", pkColumnName = "table_name", valueColumnName = "seq_value", allocationSize = 1)
	@Column(name = "user_id", nullable = false)
	public Long getUserId() {
		return userId;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * @return the userName
	 */
	@Column(name = "user_name", length = 50, nullable = false)
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the userFirstName
	 */
	@Column(name = "user_first_name", length = 50, nullable = true)
	public String getUserFirstName() {
		return userFirstName;
	}

	/**
	 * @param userFirstName
	 *            the userFirstName to set
	 */
	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	/**
	 * @return the userLastName
	 */
	@Column(name = "user_last_name", length = 50, nullable = true)
	public String getUserLastName() {
		return userLastName;
	}

	/**
	 * @param userLastName
	 *            the userLastName to set
	 */
	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	/**
	 * @return the emailId
	 */
	@Column(name = "email_id", length = 50, nullable = true)
	public String getEmailId() {
		return emailId;
	}

	/**
	 * @param emailId
	 *            the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	/**
	 * @return the password
	 */
	@Column(name = "pass_word", length = 100, nullable = true)
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the userStatus
	 */
	@Column(name = "user_status", length = 20, nullable = true)
	@Check(constraints = "(ACTIVE) OR (INACTIVE)")
	public String getUserStatus() {
		return userStatus;
	}

	/**
	 * @param userStatus
	 *            the userStatus to set
	 */
	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
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
	 * @return the roles
	 */
	@Transient
	public List<RoleEO> getRoles() {
		return roles;
	}

	/**
	 * @param roles
	 *            the roles to set
	 */
	public void setRoles(List<RoleEO> roles) {
		this.roles = roles;
	}

	/**
	 * @return the roleNames
	 */
	@Transient
	public String getRoleNames() {
		return roleNames;
	}

	/**
	 * @param roleNames
	 *            the roleNames to set
	 */
	public void setRoleNames(String roleNames) {
		this.roleNames = roleNames;
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
	 * @return the activityIds
	 */
	@Transient
	public List<Long> getActivityIds() {
		return activityIds;
	}

	/**
	 * @param activityIds
	 *            the activityIds to set
	 */
	public void setActivityIds(List<Long> activityIds) {
		this.activityIds = activityIds;
	}

	/**
	 * @return the isAdmin
	 */
	@Transient
	public Boolean getIsAdmin() {
		return isAdmin;
	}

	/**
	 * @param isAdmin
	 *            the isAdmin to set
	 */
	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	/**
	 * String representation of the UserEO
	 * 
	 * @precondition
	 * @postcondition
	 * @return the string
	 */
	public String toString() {
		StringBuffer str = new StringBuffer();
		str.append("< UserId= ");
		str.append(this.getUserId());
		str.append(", UserName= ");
		str.append(this.getUserName());
		str.append(", UserFirstName= ");
		str.append(this.getUserFirstName());
		str.append(", UserLastName= ");
		str.append(this.getUserLastName());
		str.append(", Password= ");
		str.append(this.getPassword());
		str.append(", EmailId= ");
		str.append(this.getEmailId());
		str.append(", Roles= ");
		str.append(this.getRoleNames());
		str.append(", Status= ");
		str.append(this.getUserStatus());
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
