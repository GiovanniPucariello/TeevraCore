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
 * $Id: ComponentService.java
 * $Revision: 
 * $Author: akrishnamoorthy
 * $DateTime: Oct 14, 2008 
 */

package com.headstrong.teevra.services.component;

import java.util.List;
import java.util.Map;

import com.headstrong.teevra.services.component.eo.ComponentConfigEO;
import com.headstrong.teevra.services.component.eo.ComponentEO;
import com.headstrong.teevra.services.component.eo.ComponentTemplateEO;
import com.headstrong.teevra.services.component.exception.ComponentServiceException;
import com.headstrong.teevra.services.userauthorization.exception.SessionTimeOutException;
import com.headstrong.teevra.services.userauthorization.exception.UserAuthorizationException;

/**
 * Fetches components (functional as well as connector components) those are
 * deployed on to the system. Will also be extended in later iterations to
 * deploy and undeploy components.
 * 
 * Loads configuration details related to a component that is deployed in STRIDE
 * Hub. If the component has a custom screen to configure them, this service is
 * responsible to fetch the screen details
 * 
 */
public interface ComponentService {

	/**
	 * Fetches list of all components deployed in the system. These components
	 * refer to functional components and don?t include connectors.
	 * 
	 * @precondition
	 * @postcondition
	 * @return
	 * @throws ComponentServiceException
	 * @throws UserAuthorizationException
	 * @throws SessionTimeOutException
	 */
	public List<ComponentEO> getComponents() throws ComponentServiceException,
			UserAuthorizationException, SessionTimeOutException;

	/**
	 * Gets the list of configuration parameters that can be specified for the
	 * given component
	 * 
	 * @precondition
	 * @postcondition
	 * @param componentId
	 * @return
	 * @throws ComponentServiceException
	 * @throws UserAuthorizationException
	 * @throws SessionTimeOutException
	 */
	public List<ComponentConfigEO> getComponentConfiguration(long componentId)
			throws ComponentServiceException, UserAuthorizationException,
			SessionTimeOutException;

	/**
	 * Persists component details
	 * 
	 * @precondition
	 * @postcondition
	 * @param componentToSave
	 * @throws ComponentServiceException
	 * @throws UserAuthorizationException
	 * @throws SessionTimeOutException
	 */
	public void saveComponent(ComponentEO componentToSave)
			throws ComponentServiceException, UserAuthorizationException,
			SessionTimeOutException;

	/**
	 * Deletes the given component
	 * 
	 * @precondition
	 * @postcondition
	 * @param componentId
	 * @throws ComponentServiceException
	 * @throws UserAuthorizationException
	 * @throws SessionTimeOutException
	 */
	public void deleteComponent(Long componentId)
			throws ComponentServiceException, UserAuthorizationException,
			SessionTimeOutException;

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
	 * @throws UserAuthorizationException
	 * @throws SessionTimeOutException
	 */
	public void saveComponentTemplate(ComponentTemplateEO compTemplateToSave)
			throws ComponentServiceException, UserAuthorizationException,
			SessionTimeOutException;

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
	 * @throws UserAuthorizationException
	 * @throws SessionTimeOutException
	 */
	public ComponentTemplateEO getComponentTemplateEO(Long compId,
			String compTemplateName) throws ComponentServiceException,
			UserAuthorizationException, SessionTimeOutException;

	/**
	 * Retrieves all the component id, component template names stored in the
	 * system as a map with component id as key and the list of all its
	 * templates, names as value.
	 * 
	 * @precondition
	 * @postcondition
	 * @return
	 * @throws ComponentServiceException
	 * @throws UserAuthorizationException
	 * @throws SessionTimeOutException
	 */
	public Map<Long, List<String>> getComponentTemplateNames()
			throws ComponentServiceException, UserAuthorizationException,
			SessionTimeOutException;

	/**
	 * Retrieves all the template names stored in the system for the given
	 * component id
	 * 
	 * @precondition
	 * @postcondition
	 * @param compId
	 * @return
	 * @throws ComponentServiceException
	 * @throws UserAuthorizationException
	 * @throws SessionTimeOutException
	 */
	public List<String> getTemplateNames(Long compId)
			throws ComponentServiceException, UserAuthorizationException,
			SessionTimeOutException;
}
