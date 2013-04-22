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
 * $Id: ManagedBeanCreator.java
 * $Revision: 
 * $Author: Mbafna
 * $DateTime: Sep 23, 2008 
 */

package com.headstrong.fusion.remote;

/**
 * <code>ManagedBeanCreator</code> is the interface for the fusion-remote
 * service. The class implementing this interface need to impelement the methods
 * <code> registerMBean </code> and <code> destroy </code>
 */
public interface ManagedBeanCreator {
	/**
	 * This methods registers the mbean with the server
	 * 
	 * @precondition
	 * @postcondition
	 * @param bean
	 *            The bean object that needs to be registered
	 * @param beanName
	 *            The name of the bean
	 * @param beanType
	 *            The category / type of the bean
	 * @throws Exception
	 *             When mbean could not be registered with the server
	 */

	void registerMBean(Object bean, String beanName, String beanType)
			throws Exception;

	/**
	 * <code>destroy</code> function is called when the service is stopped
	 * 
	 * @precondition
	 * @postcondition
	 */
	void destroy();
	
	/**
	 * This methods unRegisters the mbean already registered with the server
	 * 
	 * @precondition
	 * @postcondition
	 * @param beanName
	 *            The name of the bean
	 * @param beanType
	 *            The category / type of the bean
	 * @throws Exception
	 *             When mbean could not be registered with the server
	 */

	void unRegisterMBean(String beanName, String beanType)
			throws Exception;

}
