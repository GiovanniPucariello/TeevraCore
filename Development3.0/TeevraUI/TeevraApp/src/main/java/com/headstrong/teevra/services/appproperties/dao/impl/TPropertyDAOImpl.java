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
 * $Id: TPropertyDAOImpl.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Jun 3, 2009 
 */

package com.headstrong.teevra.services.appproperties.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import com.headstrong.teevra.common.dao.hibernate.BaseHibernateDAO;
import com.headstrong.teevra.services.appproperties.dao.TPropertyDAO;
import com.headstrong.teevra.services.appproperties.eo.TPropertyEO;
import com.headstrong.teevra.services.appproperties.exception.AppPropertiesServiceException;

/**
 * Implements operations to obtain default properties of the application
 */
public class TPropertyDAOImpl extends BaseHibernateDAO<TPropertyEO> implements
		TPropertyDAO {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.appproperties.dao.TPropertyDAO#getPropertyValue(java.lang.String)
	 */
	public String getPropertyValue(String propertyName)
			throws AppPropertiesServiceException {
		DetachedCriteria criteria = DetachedCriteria
				.forClass(TPropertyEO.class);
		String propertyValue = "";
		criteria.add(Restrictions.eq("propertyName", propertyName));
		List<TPropertyEO> propertyList = super.getByCriteria(criteria);
		if ((propertyList != null) && (!propertyList.isEmpty())) {
			TPropertyEO property = propertyList.get(0);
			propertyValue = property.getPropertyValue();
		}
		return propertyValue;
	}

}
