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
 * $Id: RoleActivityPK.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Apr 30, 2009 
 */

package com.headstrong.teevra.services.useradmin.eo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Primary key for RoleActivity
 */
@Embeddable
public class RoleActivityPK implements Serializable {

	/**
	 * generated serial version UID
	 */
	private static final long serialVersionUID = 3963414583704194539L;
	/**
	 * Identifier of role
	 */
	private Long roleId;
	/**
	 * Identifier of activity
	 */
	private Long activityId;

	/**
	 * @return the roleId
	 */

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
}
