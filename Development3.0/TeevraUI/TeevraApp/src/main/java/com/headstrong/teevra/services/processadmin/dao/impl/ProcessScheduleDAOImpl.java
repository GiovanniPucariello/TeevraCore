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
 * $Id: ProcessScheduleDAOImpl.java
 * $Revision: 
 * $Author: PAakash
 * $DateTime: Apr 2, 2009 
 */

package com.headstrong.teevra.services.processadmin.dao.impl;

import java.sql.Timestamp;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import com.headstrong.teevra.common.dao.hibernate.BaseHibernateDAO;
import com.headstrong.teevra.services.processadmin.dao.ProcessScheduleDAO;
import com.headstrong.teevra.services.processadmin.eo.ProcessScheduleEO;
import com.headstrong.teevra.services.processadmin.exception.ProcessAdminServiceException;

/**
 * ProcessScheduleDAOImpl implements ProcessScheduleDAO and performs CRUD
 * operations on ProcessSchedule
 */
public class ProcessScheduleDAOImpl extends BaseHibernateDAO<ProcessScheduleEO>
		implements ProcessScheduleDAO {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.processadmin.dao.ProcessScheduleDAO#deleteProcessSchedule(java.lang.Long)
	 */
	public void deleteProcessSchedule(Long prcsId)
			throws ProcessAdminServiceException {
		DetachedCriteria criteria = DetachedCriteria
				.forClass(ProcessScheduleEO.class);
		criteria.add(Restrictions.eq("prcsId", prcsId));

		// fetch the schedule to delete
		List<ProcessScheduleEO> prcsScheduleList = super
				.getByCriteria(criteria);
		// delete the process schedule if it exits
		if (!prcsScheduleList.isEmpty()) {
			super.delete(prcsScheduleList.get(0));
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.processadmin.dao.ProcessScheduleDAO#getProcessSchedule(java.lang.Long)
	 */
	public ProcessScheduleEO getProcessSchedule(Long prcsId)
			throws ProcessAdminServiceException {
		if ((prcsId == null)) {
			return null;
		}

		List<ProcessScheduleEO> scheduleList = super
				.getByCriteria(DetachedCriteria.forClass(
						ProcessScheduleEO.class).add(
						Restrictions.eq("prcsId", prcsId)));
		return (scheduleList.size() > 0) ? scheduleList.get(0) : null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.processadmin.dao.ProcessScheduleDAO#saveProcessSchedule(com.headstrong.teevra.services.processadmin.eo.ProcessScheduleEO)
	 */
	public void saveProcessSchedule(ProcessScheduleEO processScheduleToSave)
			throws ProcessAdminServiceException {
		DetachedCriteria criteria = DetachedCriteria
				.forClass(ProcessScheduleEO.class);
		criteria.add(Restrictions.eq("prcsId", processScheduleToSave
				.getPrcsId()));

		// fetch the schedule, if it already exists update it, else insert a
		// new record
		List<ProcessScheduleEO> prcsScheduleList = super
				.getByCriteria(criteria);

		if (!prcsScheduleList.isEmpty()) {
			// matching schedule exists already. update the modified fields
			ProcessScheduleEO temp = prcsScheduleList.get(0);
			temp.setRecurrenceType(processScheduleToSave.getRecurrenceType());
			temp.setRecurrence(processScheduleToSave.getRecurrence());
			temp.setModifiedBy(System.getProperty("user.name"));
			temp.setModifiedDate(new Timestamp(System.currentTimeMillis()));
			processScheduleToSave = temp;
		} else {
			// given schedule is a fresh one, hence update the created fileds
			processScheduleToSave.setCreatedBy(System.getProperty("user.name"));
			processScheduleToSave.setCreatedDate(new Timestamp(System
					.currentTimeMillis()));
		}
		// save or update the schedule
		super.saveOrUpdate(processScheduleToSave);
	}

}
