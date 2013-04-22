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
 * $Id: ComponentConfigurationDAO.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Oct 22, 2008 
 */

package com.headstrong.teevra.services.component.dao;

import java.util.List;

import com.headstrong.teevra.common.dao.BaseDAO;
import com.headstrong.teevra.services.component.eo.ComponentConfigEO;
import com.headstrong.teevra.services.component.exception.ComponentServiceException;

/**
 * ComponentConfigDAO extends BaseDAO and does the operations for the
 * Component_Configuration table.
 */
public interface ComponentConfigDAO extends BaseDAO<ComponentConfigEO> {
	/**
	 * Fetches the list of Configurations for the given component id
	 * 
	 * @precondition
	 * @postcondition
	 * @param componentId
	 *            a Component id
	 * @return List of Configurations
	 */
	public List<ComponentConfigEO> getComponentConfigList(Long componentId) throws ComponentServiceException;
	
	public void deleteComponentConfig(Long compConfigId)throws ComponentServiceException;
}
