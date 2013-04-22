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
 * $Id: SchemaRemoteAccessMBean.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Nov 13, 2009 
 */

package com.headstrong.fusion.services.message.schema.remoting;

/**
 * A marker interface required for JMX registration purpose
 */
public interface SchemaRemoteAccessMBean {

	/**
	 * Method reloads the objectDescriptor cache
	 * @precondition
	 * @postcondition 	
	 * @throws Exception
	 */
	public void reloadSchemaCache() throws Exception;
}
