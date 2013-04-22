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
 * $Id: AbstractDAOTestCase.java
 * $Revision: 
 * $Author: viswanathp
 * $DateTime: Oct 15, 2008 
 */

package com.headstrong.teevra.common;

import org.springframework.test.AbstractDependencyInjectionSpringContextTests;

public abstract class AbstractSpringTestCase extends
		AbstractDependencyInjectionSpringContextTests {

	protected abstract String[] getConfigLocations();

	public void onSetUp() {
	}

	public void onTearDown() {
	}

	public Object getBean(String beanName) {
		return applicationContext.getBean(beanName);
	}
}
