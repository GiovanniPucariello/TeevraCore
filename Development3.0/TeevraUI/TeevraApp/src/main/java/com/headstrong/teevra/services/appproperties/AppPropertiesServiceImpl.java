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
 * $Id: AppPropertiesServiceImpl.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Jun 3, 2009 
 */

package com.headstrong.teevra.services.appproperties;

import com.headstrong.teevra.services.appproperties.dao.TPropertyDAO;
import com.headstrong.teevra.services.appproperties.exception.AppPropertiesServiceException;

/**
 * Implements application default property related operations
 */
public class AppPropertiesServiceImpl implements AppPropertiesService {

	private TPropertyDAO propertyDAO;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.appproperties.AppPropertiesService#getPropertyValue(java.lang.String)
	 */
	public String getPropertyValue(String propertyName)
			throws AppPropertiesServiceException {
		return propertyDAO.getPropertyValue(propertyName);
	}

	/**
	 * @return the propertyDAO
	 */
	public TPropertyDAO getPropertyDAO() {
		return propertyDAO;
	}

	/**
	 * @param propertyDAO the propertyDAO to set
	 */
	public void setPropertyDAO(TPropertyDAO propertyDAO) {
		this.propertyDAO = propertyDAO;
	}

}
