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
 * $Id: ComponentTemplateDAOImpl.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Mar 27, 2009 
 */

package com.headstrong.teevra.services.component.dao.impl;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.teevra.common.dao.hibernate.BaseHibernateDAO;
import com.headstrong.teevra.common.exception.ObjectConversionException;
import com.headstrong.teevra.common.utils.ObjectConverter;
import com.headstrong.teevra.services.component.dao.ComponentTemplateDAO;
import com.headstrong.teevra.services.component.eo.ComponentTemplateEO;
import com.headstrong.teevra.services.component.exception.ComponentServiceException;

/**
 * ComponentTemplateDAOImpl implements ComponentTemplateDAO
 */
public class ComponentTemplateDAOImpl extends
		BaseHibernateDAO<ComponentTemplateEO> implements ComponentTemplateDAO {

	/**
	 * Logger for ComponentTemplateDAOImpl
	 */
	@SuppressWarnings("unused")
	private static Logger logger = LoggerFactory
			.getLogger(ComponentTemplateDAOImpl.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.component.dao.ComponentTemplateDAO#getComponentTemplateEO(java.lang.Long,
	 *      java.lang.String)
	 */
	public ComponentTemplateEO getComponentTemplateEO(Long compId,
			String compTemplateName) throws ComponentServiceException {
		if ((compId == null) || (compTemplateName == null)) {
			return null;
		}

		List<ComponentTemplateEO> templateList = super
				.getByCriteria(DetachedCriteria.forClass(
						ComponentTemplateEO.class).add(
						Restrictions.eq("compId", compId)).add(
						Restrictions.eq("templateName", compTemplateName)));
		return (templateList.size() > 0) ? templateList.get(0) : null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.component.dao.ComponentTemplateDAO#getComponentTemplateNames()
	 */
	@SuppressWarnings("unchecked")
	public Map<Long, List<String>> getComponentTemplateNames()
			throws ComponentServiceException {
		String query = "select A.compId, A.templateName from ComponentTemplateEO A";
		Iterator resultSet = super.createQuery(query);
		Map<Long, List<String>> comp2TemplatesMap = new HashMap<Long, List<String>>();
		if (resultSet != null) {
			while (resultSet.hasNext()) {
				Object[] tuple = (Object[]) resultSet.next();
				if ((tuple[0] != null) && (tuple[1] != null)) {
					Long compId = null;
					try {
						compId = ObjectConverter.getLong(tuple[0]);
					} catch (ObjectConversionException e) {
						logger.error("Error While converting the object "
								+ tuple[0] + " to Long", e);
						throw new ComponentServiceException(e.getMessage());
					}
					List<String> templateList = comp2TemplatesMap.get(compId);
					if (templateList == null) {
						templateList = new ArrayList<String>();
						comp2TemplatesMap.put(compId, templateList);
					}
					templateList.add(tuple[1].toString());
				}
			}
		}
		return comp2TemplatesMap;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.component.dao.ComponentTemplateDAO#getComponentTemplateNames(java.lang.Long)
	 */
	@SuppressWarnings("unchecked")
	public List<String> getComponentTemplateNames(Long compId)
			throws ComponentServiceException {
		String query = "select A.templateName from ComponentTemplateEO A where A.compId="
				+ compId;
		Iterator resultSet = super.createQuery(query);
		List<String> templates = new ArrayList<String>();
		if (resultSet != null) {
			while (resultSet.hasNext()) {
				Object o = resultSet.next();
				templates.add(o.toString());
			}
		}
		return templates;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.component.dao.ComponentTemplateDAO#saveComponentTemplate(com.headstrong.teevra.services.component.eo.ComponentTemplateEO)
	 */
	public void saveComponentTemplate(ComponentTemplateEO compTemplateToSave)
			throws ComponentServiceException {
		DetachedCriteria criteria = DetachedCriteria
				.forClass(ComponentTemplateEO.class);
		criteria.add(Restrictions.eq("compId", compTemplateToSave.getCompId()));
		criteria.add(Restrictions.eq("templateName", compTemplateToSave
				.getTemplateName()));

		// fetch the template if it already exists and update it, else insert a
		// new record
		List<ComponentTemplateEO> compTemplateList = super
				.getByCriteria(criteria);

		if (!compTemplateList.isEmpty()) {
			// matching template exists already. Hence update it with just the
			// serialized configurations
			ComponentTemplateEO existingTemplate = compTemplateList.get(0);
			existingTemplate.setConfigurations(compTemplateToSave
					.getConfigurations());
			existingTemplate.setModifiedBy(System.getProperty("user.name"));
			existingTemplate.setModifiedDate(new Timestamp(System
					.currentTimeMillis()));
			compTemplateToSave = existingTemplate;
		} else {
			// given template is a fresh one for the component
			compTemplateToSave.setCreatedBy(System.getProperty("user.name"));
			compTemplateToSave.setCreatedDate(new Timestamp(System
					.currentTimeMillis()));
		}
		super.saveOrUpdate(compTemplateToSave);
	}

}
