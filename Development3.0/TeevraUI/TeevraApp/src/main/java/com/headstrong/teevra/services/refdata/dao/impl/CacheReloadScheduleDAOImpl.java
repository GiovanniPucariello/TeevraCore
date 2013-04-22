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
 * $Id: CacheReloadScheduleDAOImpl.java
 * $Revision: 
 * $Author: NBagchi
 * $DateTime: Sept 10, 2010 
 */

package com.headstrong.teevra.services.refdata.dao.impl;

import java.sql.Timestamp;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import com.headstrong.teevra.common.dao.hibernate.BaseHibernateDAO;
import com.headstrong.teevra.common.scheduling.exception.SchedulingException;
import com.headstrong.teevra.services.refdata.dao.CacheReloadScheduleDAO;
import com.headstrong.teevra.services.refdata.eo.CacheReloadScheduleEO;

/**
 * CacheReloadScheduleDAOImpl implements CacheReloadScheduleDAO and performs
 * CRUD operations on CacheReloadSchedule
 */
public class CacheReloadScheduleDAOImpl extends	BaseHibernateDAO<CacheReloadScheduleEO> 
		implements	CacheReloadScheduleDAO {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.refdata.dao.CacheReloadScheduleDAO#deleteCacheReloadSchedule(cacheName)
	 */
	public void deleteCacheReloadSchedule(String cacheName)	throws SchedulingException {
		DetachedCriteria criteria = DetachedCriteria
				.forClass(CacheReloadScheduleEO.class);
		criteria.add(Restrictions.eq("cacheName", cacheName));

		// fetch the schedule to delete
		List<CacheReloadScheduleEO> cacheReloadScheduleList = super
				.getByCriteria(criteria);
		// delete the cache schedule if it exits
		if (!cacheReloadScheduleList.isEmpty()) {
			super.delete(cacheReloadScheduleList.get(0));
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.refdata.dao.CacheReloadScheduleDAO#getCacheReloadSchedule(cacheName)
	 */
	public CacheReloadScheduleEO getCacheReloadSchedule(String cacheName)
			throws SchedulingException {
		if ((cacheName == null)) {
			return null;
		}

		List<CacheReloadScheduleEO> scheduleList = super.getByCriteria(DetachedCriteria.forClass(
						CacheReloadScheduleEO.class).add(Restrictions.eq("cacheName", cacheName)));
		return (scheduleList.size() > 0) ? scheduleList.get(0) : null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.refdata.dao.CacheReloadScheduleDAO#saveCacheReloadSchedule(scheduleToSave)
	 */
	public void saveCacheReloadSchedule(CacheReloadScheduleEO scheduleToSave)
			throws SchedulingException {
		DetachedCriteria criteria = DetachedCriteria.forClass(CacheReloadScheduleEO.class);
		criteria.add(Restrictions.eq("cacheName", scheduleToSave.getCacheName()));

		// fetch the schedule, if it already exists update it, else insert a
		// new record
		List<CacheReloadScheduleEO> scheduleList = super.getByCriteria(criteria);

		if (!scheduleList.isEmpty()) {
			// matching schedule exists already. update the modified fields
			CacheReloadScheduleEO temp = scheduleList.get(0);
			temp.setRecurrenceType(scheduleToSave.getRecurrenceType());
			temp.setRecurrence(scheduleToSave.getRecurrence());
			temp.setModifiedBy(System.getProperty("user.name"));
			temp.setModifiedDate(new Timestamp(System.currentTimeMillis()));
			scheduleToSave = temp;
		} else {
			// given schedule is a fresh one, hence update the created fields
			scheduleToSave.setCreatedBy(System.getProperty("user.name"));
			scheduleToSave.setCreatedDate(new Timestamp(System.currentTimeMillis()));
		}
		// save or update the schedule
		super.saveOrUpdate(scheduleToSave);
	}

}
