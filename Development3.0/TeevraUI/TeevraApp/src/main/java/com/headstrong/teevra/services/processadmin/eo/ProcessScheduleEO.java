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
 * $Id: ProcessScheduleEO.java
 * $Revision: 
 * $Author: akrishnamoorthy
 * $DateTime: Oct 13, 2008 
 */

package com.headstrong.teevra.services.processadmin.eo;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.teevra.common.scheduling.Recurrence;
import com.headstrong.teevra.services.processadmin.exception.ProcessAdminServiceException;

/**
 * Table corresponds to Process_Schedule which holds the process scheduling
 * details. It represents Process scheduling information.
 * 
 */

@Entity
@Table(name = "process_schedule")
public class ProcessScheduleEO implements Serializable {

	/**
	 * Logger for ProcessScheduleEO
	 */
	private static Logger logger = LoggerFactory
			.getLogger(ProcessScheduleEO.class);

	public static final String RECURRENCE_TYPE_DAILY = "DAILY";
	public static final String RECURRENCE_TYPE_WEEKLY = "WEEKLY";
	/**
	 * generated serial version UID
	 */
	private static final long serialVersionUID = 2255283681357115606L;
	/**
	 * Process Identifier <mandatory>
	 */
	private Long prcsId;
	/**
	 * Type of Recurrence.DAILY / WEEKLY
	 */
	private String recurrenceType = RECURRENCE_TYPE_DAILY;
	/**
	 * Serialized Recurrence information of the process
	 */
	private String serialzedRecurrence;
	/**
	 * Recurrence Schedule.
	 */
	private Recurrence recurrence;
	/**
	 * User name who created the recurrence
	 */
	private String createdBy = System.getProperty("user.name");
	/**
	 * Time when created the recurrence
	 */
	private Timestamp createdDate = new Timestamp(System.currentTimeMillis());
	/**
	 * User name who modified the recurrence
	 */
	private String modifiedBy = System.getProperty("user.name");
	/**
	 * Time when modified the recurrence
	 */
	private Timestamp modifiedDate = new Timestamp(System.currentTimeMillis());

	/**
	 * @return the prcsId
	 */
	@Id
	@Column(name = "prcs_id", nullable = false)
	public Long getPrcsId() {
		return prcsId;
	}

	/**
	 * @param prcsId
	 *            the prcsId to set
	 */
	public void setPrcsId(Long prcsId) {
		this.prcsId = prcsId;
	}

	/**
	 * @return the recurrenceType
	 */
	@Column(name = "recurrence_type", length = 20, nullable = false)
	public String getRecurrenceType() {
		return recurrenceType;
	}

	/**
	 * @param recurrenceType
	 *            the recurrenceType to set
	 */
	public void setRecurrenceType(String recurrenceType) {
		this.recurrenceType = recurrenceType;
	}

	/**
	 * @return the serialzedRecurrence
	 */
	@Column(name = "recurrence_config", nullable = true)
	public String getSerialzedRecurrence() {
		return serialzedRecurrence;
	}

	/**
	 * @param serialzedRecurrence
	 *            the serialzedRecurrence to set
	 */
	public void setSerialzedRecurrence(String serialzedRecurrence)
			throws ProcessAdminServiceException {
		this.serialzedRecurrence = serialzedRecurrence;

		if (serialzedRecurrence != null) {
			// deserialize the recurrence configs to create Recurrence
			byte[] bytes;
			try {
				bytes = serialzedRecurrence.getBytes("UTF-8");
				ByteArrayInputStream io = new ByteArrayInputStream(bytes);
				XMLDecoder decoder = new XMLDecoder(io);
				recurrence = (Recurrence) decoder.readObject();
			} catch (UnsupportedEncodingException e) {
				logger
						.error("Error While generating serialized recurrence ",
								e);
				throw new ProcessAdminServiceException(e.getMessage());
			}
		}
	}

	/**
	 * @return the recurrence
	 */
	@Transient
	public Recurrence getRecurrence() {
		return recurrence;
	}

	/**
	 * @param recurrence
	 *            the recurrence to set
	 */
	public void setRecurrence(Recurrence recurrence) {
		this.recurrence = recurrence;

		if (recurrence != null) {
			ByteArrayOutputStream os = new ByteArrayOutputStream();
			XMLEncoder encoder = new XMLEncoder(os);
			encoder.writeObject(recurrence);
			encoder.close();

			this.serialzedRecurrence = os.toString();
		}
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
	 * String representation of the ProcessScheduleEO
	 * 
	 * @precondition
	 * @postcondition
	 * @return the string
	 */
	public String toString() {
		StringBuffer str = new StringBuffer();
		str.append("<Process Id= ");
		str.append(this.getPrcsId());
		str.append(", Recurrence Type= ");
		str.append(this.getRecurrenceType());
		str.append(", Serialized Recurrence= ");
		str.append(this.getSerialzedRecurrence());
		str.append(">");
		return str.toString();

	}
}
