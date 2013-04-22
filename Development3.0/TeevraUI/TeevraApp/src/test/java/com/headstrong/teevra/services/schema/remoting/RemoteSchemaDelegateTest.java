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
 * $Id: RemoteSchemaDelegateTest.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Nov 17, 2009 
 */

package com.headstrong.teevra.services.schema.remoting;

import junit.framework.TestCase;

import com.headstrong.teevra.services.schema.exception.RemoteSchemaReloadException;
import com.headstrong.teevra.services.schema.remoting.RemoteSchemaDelegate;

/**
 * 
 */
public class RemoteSchemaDelegateTest extends TestCase {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testRefreshSchemaCache() {

		String jmxUrl = "service:jmx:rmi:///jndi/rmi://10.200.31.27:8005/jmxrmi";
		try {
			RemoteSchemaDelegate.getInstance().reloadSchemaCache(jmxUrl);
		} catch (RemoteSchemaReloadException e) {
			e.printStackTrace();
		}

	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
	}
}
