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
 * $Id: AbstractServiceTestCase.java
 * $Revision: 
 * $Author: viswanathp
 * $DateTime: Oct 15, 2008 
 */

package com.headstrong.teevra.services;

import com.headstrong.teevra.common.AbstractSpringTestCase;

/**
 * 
 */
public abstract class AbstractServiceTestCase extends AbstractSpringTestCase {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.common.AbstractSpringTestCase#getConfigLocations()
	 */
	@Override
	protected String[] getConfigLocations() {
		return new String[] { "classpath:config/spring-config/test-applicationContext.xml" };
	}

	public void onSetUp() {

	}

}
