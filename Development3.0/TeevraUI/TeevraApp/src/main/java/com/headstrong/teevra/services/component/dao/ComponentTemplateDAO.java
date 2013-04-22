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
 * $Id: ComponentTemplateDAO.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Mar 27, 2009 
 */

package com.headstrong.teevra.services.component.dao;

import java.util.List;
import java.util.Map;

import com.headstrong.teevra.common.dao.BaseDAO;
import com.headstrong.teevra.services.component.eo.ComponentTemplateEO;
import com.headstrong.teevra.services.component.exception.ComponentServiceException;

/**
 * ComponentDAO extends BaseDAO and does the operations on the
 * Component_Template table.
 */
public interface ComponentTemplateDAO extends BaseDAO<ComponentTemplateEO> {

	/**
	 * Persists the component template details in the database. If a template is
	 * already saved with the same component id and component template name, the
	 * template details should get updated else the template should be saved as
	 * a new one
	 * 
	 * @precondition
	 * @postcondition
	 * @param compTemplateToSave
	 * @throws ComponentServiceException
	 */
	public void saveComponentTemplate(ComponentTemplateEO compTemplateToSave)
			throws ComponentServiceException;

	/**
	 * Retrieves the component template for the given component id and component
	 * template name combination of whose should be unique.
	 * 
	 * @precondition
	 * @postcondition
	 * @param compId
	 * @param compTemplateName
	 * @return
	 * @throws ComponentServiceException
	 */
	public ComponentTemplateEO getComponentTemplateEO(Long compId,
			String compTemplateName) throws ComponentServiceException;

	/**
	 * Retrieves all the component id, component template names stored in the
	 * system as a map with component id as key and the list of all its
	 * templates, names as value.
	 * 
	 * @precondition
	 * @postcondition
	 * @return
	 * @throws ComponentServiceException
	 */
	public Map<Long, List<String>> getComponentTemplateNames()
			throws ComponentServiceException;

	/**
	 * Retrieves component template names stored in the
	 * system for the given component id 
	 * 
	 * @precondition
	 * @postcondition
	 * @return
	 * @throws ComponentServiceException
	 */
	public List<String> getComponentTemplateNames(Long compId)
			throws ComponentServiceException;
}
