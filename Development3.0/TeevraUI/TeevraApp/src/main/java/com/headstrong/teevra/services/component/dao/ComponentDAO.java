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
 * $Id: ComponentDAO.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Oct 7, 2008 
 */

package com.headstrong.teevra.services.component.dao;

import java.util.List;

import com.headstrong.teevra.common.dao.BaseDAO;
import com.headstrong.teevra.services.component.eo.ComponentEO;
import com.headstrong.teevra.services.component.exception.ComponentServiceException;

/**
 * ComponentDAO extends BaseDAO and does the operations for the Component table.
 * 
 * Fetches components (functional as well as connector components) those are
 * deployed on to the system. Will also be extended in later iterations to
 * deploy and undeploy components.
 * 
 * Loads configuration details related to a component that is deployed in STRIDE
 * Hub. If the component has a custom screen to configure them, this service is
 * responsible to fetch the screen details
 */
public interface ComponentDAO extends BaseDAO<ComponentEO> {

	/**
	 * Fetches components those are deployed on to the system
	 * 
	 * @precondition
	 * @postcondition
	 * @return the List of Components
	 * @throws ComponentServiceException
	 */
	public List<ComponentEO> getComponents() throws ComponentServiceException;

	/**
	 * Fetches connectors those are deployed on to the system
	 * 
	 * @precondition
	 * @postcondition
	 * @return the List of Connectors
	 * @throws ComponentServiceException
	 */
	public List<ComponentEO> getConnectors() throws ComponentServiceException;

	/**
	 * Persists component details
	 * 
	 * @precondition
	 * @postcondition
	 * @param componentToSave
	 * @throws ComponentServiceException
	 */
	public void saveComponent(ComponentEO componentToSave)
			throws ComponentServiceException;

	/**
	 * Deletes the given component.
	 * 
	 * @precondition
	 * @postcondition
	 * @param compId
	 * @throws ComponentServiceException
	 */
	public void deleteComponent(Long compId) throws ComponentServiceException;

}
