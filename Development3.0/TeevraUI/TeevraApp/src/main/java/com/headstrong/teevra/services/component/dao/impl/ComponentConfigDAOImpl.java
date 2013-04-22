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
 * $Id: ComponentConfigDAOImpl.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Oct 22, 2008 
 */

package com.headstrong.teevra.services.component.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import com.headstrong.teevra.common.dao.hibernate.BaseHibernateDAO;
import com.headstrong.teevra.services.component.dao.ComponentConfigDAO;
import com.headstrong.teevra.services.component.eo.ComponentConfigEO;
import com.headstrong.teevra.services.component.exception.ComponentServiceException;

/**
 * ComponentConfigDAOImpl implements ComponentConfigDAO and does the operations
 * for the Component_Configuration table.
 */
public class ComponentConfigDAOImpl extends BaseHibernateDAO<ComponentConfigEO>
		implements ComponentConfigDAO {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.component.dao.ComponentConfigDAO#deleteComponentConfig(java.lang.Long)
	 */
	public void deleteComponentConfig(Long compConfigId)
			throws ComponentServiceException {
		List<ComponentConfigEO> compConfigList = super
				.getByCriteria(DetachedCriteria.forClass(
						ComponentConfigEO.class).add(
						Restrictions.eq("compConfigId", compConfigId)));

		if (!compConfigList.isEmpty()) {
			super.delete(compConfigList.get(0));
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.component.dao.ComponentConfigDAO#getComponentConfigList(java.lang.Long)
	 */
	public List<ComponentConfigEO> getComponentConfigList(Long componentId)
			throws ComponentServiceException {
		// TODO Auto-generated method stub
		return super.getByCriteria(DetachedCriteria.forClass(
				ComponentConfigEO.class).add(
				Restrictions.eq("compId", componentId)));
	}
}
