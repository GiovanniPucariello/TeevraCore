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
 * $Id: ServiceAliasManagerTest.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Nov 11, 2008 
 */

package com.headstrong.fusion.commons.resolver;

import static org.easymock.EasyMock.createMock;
import junit.framework.TestCase;

import org.osgi.framework.BundleContext;

import com.headstrong.fusion.commons.resolver.exception.DuplicateAliasException;
import com.headstrong.fusion.commons.resolver.exception.ServiceAliasManagerInitializationException;



/**
 * 
 */
public class ServiceAliasManagerTest extends TestCase {
	BundleContext bundleContextMock;
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		bundleContextMock = createMock(BundleContext.class);
	}
	
	
	public void testInitialize() {
		ServiceAliasManager aliasManager = ServiceAliasManager.getInstance();
		aliasManager.initialize(bundleContextMock);
		assertTrue(aliasManager.isInitialized());
	}
	
	public void testRegisterServiceIfNotInitialized() {
		ServiceAliasManager aliasManager = ServiceAliasManager.getInstance();
		aliasManager.setInitialized(false);
		try {
			aliasManager.registerServiceAlias("dummy", "dummy");
		} catch (ServiceAliasManagerInitializationException e) {
			return;
		} catch (DuplicateAliasException e) {
			fail();
		}
		fail();
	}
	
	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		super.tearDown();
	}
	
	public static interface DummyService {
		
	}
}
