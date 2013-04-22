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
 * $Id: ComponentDAOImpl.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Oct 7, 2008 
 */

package com.headstrong.teevra.services.component.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import com.headstrong.teevra.common.dao.hibernate.BaseHibernateDAO;
import com.headstrong.teevra.services.component.dao.ComponentDAO;
import com.headstrong.teevra.services.component.eo.ComponentEO;
import com.headstrong.teevra.services.component.exception.ComponentServiceException;

/**
 * ComponentDAOImpl implements ComponentDAO
 * 
 * Fetches components (functional as well as connector components) those are
 * deployed on to the system. Will also be extended in later iterations to
 * deploy and undeploy components.
 * 
 * Loads configuration details related to a component that is deployed in STRIDE
 * Hub. If the component has a custom screen to configure them, this service is
 * responsible to fetch the screen details
 */
public class ComponentDAOImpl extends BaseHibernateDAO<ComponentEO> implements
		ComponentDAO {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.component.dao.ComponentDAO#getComponents ()
	 */
	public List<ComponentEO> getComponents() {
		String query = null;
		// query = "select component from ComponentEO component where
		// component.compType in ('SERVICE','ROUTER','PARSER_FORMATTER')";
		query = "from ComponentEO component";
		// List<ComponentEO> componentList = super.getByQuery(query);
		/*
		 * List<ComponentEO> componentList =
		 * super.getByCriteria(DetachedCriteria
		 * .forClass(ComponentEO.class).add( Restrictions.eq("compType",
		 * "FUNCTIONAL")));
		 */
		return super.getByQuery(query);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.component.dao.ComponentDAO#getConnectors ()
	 */
	public List<ComponentEO> getConnectors() {
		String query = null;
		query = "select component from ComponentEO component where component.compType='ENDPOINT'";
		List<ComponentEO> connectorList = super.getByQuery(query);

		return connectorList;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.component.dao.ComponentDAO#saveComponent(com.headstrong.teevra.services.component.eo.ComponentEO)
	 */
	public void saveComponent(ComponentEO componentToSave)
			throws ComponentServiceException {
		super.saveOrUpdate(componentToSave);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.component.dao.ComponentDAO#deleteComponent(long)
	 */
	public void deleteComponent(Long componentId)
			throws ComponentServiceException {

		List<ComponentEO> componentList = super.getByCriteria(DetachedCriteria
				.forClass(ComponentEO.class).add(
						Restrictions.eq("compId", componentId)));
		ComponentEO compToDelete = componentList.get(0);

		if (compToDelete.getCompConfigList().isEmpty()) {
			super.delete(compToDelete);
		}
		else{
			
		}
	}

}
