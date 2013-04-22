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
 * $Id: SavePointServiceImplMBean.java
 * $Revision: 
 * $Author: mbafna
 * $DateTime: Sep 30, 2008 
 */

package com.headstrong.fusion.services.savepointpersist.impl;



/**
 * <code>SavePointServiceImplMBean</code> contains the methods that are
 * exposed by the JMX. 
 */
public interface SavePointServiceImplMBean {
	
	/**
	 * To start processing messages at savepoint. 
	 * @precondition
	 * @postcondition 	
	 * @throws Exception
	 */
	public void start() throws Exception;
	
	/**
	 * To stop processing messages at savepoint. 
	 * @precondition
	 * @postcondition 	
	 * @throws Exception
	 */
	public void stop() throws Exception;
	
}
