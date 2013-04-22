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
 * $Id: ActivityEO.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Apr 29, 2009 
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
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.Check;

/**
 * EO corresponds to the 'Activity' table which holds the details of the
 * activity
 */
@Entity
@Table(name = "activity", uniqueConstraints = { @UniqueConstraint(columnNames = { "activity_name" }) })
public class ActivityEO implements Serializable {

	/**
	 * Separator for the roles of the user
	 */
	private static String ACTIVITY_NAMES_SEPERATOR = ",";

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
	private static final long serialVersionUID = 3800276124722938278L;
	/**
	 * Unique identifier for the activity
	 */
	private Long activityId;
	/**
	 * Name of the activity
	 */
	private String activityName;
	/**
	 * Activity Description
	 */
	private String activityDesc;
	/**
	 * Status of the activity- ACTIVE/INACTIVE
	 */
	private String activityStatus = STATUS_ACTIVE;
	/**
	 * User name who created the activity
	 */
	private String createdBy;
	/**
	 * Time when created the activity
	 */
	private Timestamp createdDate;
	/**
	 * User name who modified the activity
	 */
	private String modifiedBy;
	/**
	 * Time when modified the activity
	 */
	private Timestamp modifiedDate;

	/**
	 * @return the activityId
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "id_gen")
	@TableGenerator(name = "id_gen", table = "teevra_sequence", pkColumnName = "table_name", valueColumnName = "seq_value", allocationSize = 1)
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
	 * @return the activityName
	 */
	@Column(name = "activity_name", length = 50, nullable = false)
	public String getActivityName() {
		return activityName;
	}

	/**
	 * @param activityName
	 *            the activityName to set
	 */
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	/**
	 * @return the activityDesc
	 */
	@Column(name = "activity_desc", length = 200, nullable = true)
	public String getActivityDesc() {
		return activityDesc;
	}

	/**
	 * @param activityDesc
	 *            the activityDesc to set
	 */
	public void setActivityDesc(String activityDesc) {
		this.activityDesc = activityDesc;
	}

	/**
	 * @return the activityStatus
	 */
	@Column(name = "activity_status", length = 20, nullable = true)
	@Check(constraints = "(ACTIVE) OR (INACTIVE)")
	public String getActivityStatus() {
		return activityStatus;
	}

	/**
	 * @param activityStatus
	 *            the activityStatus to set
	 */
	public void setActivityStatus(String activityStatus) {
		this.activityStatus = activityStatus;
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
	 * Creates String using names of the activities
	 * 
	 * @precondition
	 * @postcondition
	 * @param roles
	 * @return
	 */
	public static String activitiesToString(List<ActivityEO> activities) {
		String activityNames = "";
		// generate roleNames string if the list is not empty
		if ((activities != null) && (!activities.isEmpty())) {

			for (ActivityEO activity : activities) {
				activityNames = activityNames + activity.getActivityName()
						+ ACTIVITY_NAMES_SEPERATOR;
			}
			activityNames = activityNames.substring(0,
					activityNames.length() - 1);
		}
		return activityNames;
	}

	/**
	 * String representation of the ActivityEO
	 * 
	 * @precondition
	 * @postcondition
	 * @return the string
	 */
	public String toString() {
		StringBuffer str = new StringBuffer();
		str.append("< ActivityId= ");
		str.append(this.getActivityId());
		str.append(", Name= ");
		str.append(this.getActivityName());
		str.append(", Description= ");
		str.append(this.getActivityDesc());
		str.append(", Status= ");
		str.append(this.getActivityStatus());
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
