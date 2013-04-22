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
 * $Id: ActivityMethodPK.java
 * $Revision: 
 * $Author: viswanathp
 * $DateTime: May 20, 2009 
 */

package com.headstrong.teevra.services.userauthorization.eo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Primary key for ActivityMethod
 */
@Embeddable
public class ActivityMethodPK implements Serializable {

	/**
	 * generated serial version UID
	 */
	private static final long serialVersionUID = -7432343080895053771L;
	/**
	 * Identifier of activity
	 */
	private Long activityId;
	/**
	 * Identifier of method
	 */
	private Long methodId;

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

	/**
	 * @return the methodId
	 */
	@Column(name = "method_id", nullable = false)
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
}
