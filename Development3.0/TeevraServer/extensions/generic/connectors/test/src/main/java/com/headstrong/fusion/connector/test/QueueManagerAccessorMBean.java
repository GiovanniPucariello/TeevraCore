/*
 * The information in this document is subject to change without notice and 
 * does not represent a commitment by Headstrong Corporation. The software 
 * and/or databases described in this document are furnished under a license 
 * agreement and may be used or copied only in accordance with the terms of 
 * the agreement. 
 * 
 * Copyright Â© 2008 Headstrong Corporation
 * All rights reserved.
 * 
 * $Id: QueueManagerAccessorMBean.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Sep 2, 2009 
 */

package com.headstrong.fusion.connector.test;

/**
 * 
 */
public interface QueueManagerAccessorMBean {
	public void push(String processId, String serviceId, String data)
			throws Exception;

	public String poll(String processId, String serviceId) throws Exception;
}
