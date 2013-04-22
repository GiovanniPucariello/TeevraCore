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
 * $Id: AppPropertiesService.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Jun 3, 2009 
 */

package com.headstrong.teevra.services.appproperties;

import com.headstrong.teevra.services.appproperties.exception.AppPropertiesServiceException;

/**
 * Service to manage default properties of the application
 */
public interface AppPropertiesService {

	/**
	 * Returns the property value for the given key
	 * 
	 * @precondition
	 * @postcondition
	 * @param propertyName
	 * @return
	 * @throws AppPropertiesServiceException
	 */
	public String getPropertyValue(String propertyName)
			throws AppPropertiesServiceException;
}
