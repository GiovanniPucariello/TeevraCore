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
 * $Id: ServiceConfigurationTest.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Nov 10, 2008 
 */

package com.headstrong.fusion.services.config.vo;

import junit.framework.TestCase;

/**
 * Test cases for {@link ServiceConfiguration}.
 * 
 */
public class ServiceConfigurationTest extends TestCase {


	public void testEqualsIfProcessIdNull() {
		ServiceConfiguration conf1 = new ServiceConfiguration();
		conf1.setServiceId("serviceId");
		conf1.setPropertyId("propertyId");
		
		ServiceConfiguration conf2 = new ServiceConfiguration();
		conf2.setServiceId("serviceId");
		conf2.setPropertyId("propertyId");
		assertEquals(conf1, conf2);
	}
	
	public void testEqualsIfServiceIdNull() {
		ServiceConfiguration conf1 = new ServiceConfiguration();
		conf1.setProcessId("processId");
		conf1.setPropertyId("propertyId");
		
		ServiceConfiguration conf2 = new ServiceConfiguration();
		conf2.setProcessId("processId");
		conf2.setPropertyId("propertyId");
		assertEquals(conf1, conf2);
	}

	public void testEqualsIfPropertyIdNull() {
		ServiceConfiguration conf1 = new ServiceConfiguration();
		conf1.setProcessId("processId");
		conf1.setServiceId("serviceId");
		
		ServiceConfiguration conf2 = new ServiceConfiguration();
		conf2.setProcessId("processId");
		conf2.setServiceId("serviceId");
		assertEquals(conf1, conf2);
	}
	
	public void testEqualsHashCode() {
		ServiceConfiguration conf1 = new ServiceConfiguration();
		conf1.setProcessId("processId");
		conf1.setServiceId("serviceId");
		conf1.setPropertyId("propertyId");
		
		ServiceConfiguration conf2 = new ServiceConfiguration();
		conf2.setProcessId("processId");
		conf2.setServiceId("serviceId");
		conf2.setPropertyId("propertyId");
		assertEquals(conf1.hashCode(), conf2.hashCode());
	}

	public void testTransitiveRelation() {
		ServiceConfiguration conf1 = new ServiceConfiguration();
		conf1.setProcessId("processId");
		conf1.setServiceId("serviceId");
		conf1.setPropertyId("propertyId");

		ServiceConfiguration conf2 = new ServiceConfiguration();
		conf2.setProcessId("processId");
		conf2.setServiceId("serviceId");
		conf2.setPropertyId("propertyId");

		ServiceConfiguration conf3 = new ServiceConfiguration();
		conf3.setProcessId("processId");
		conf3.setServiceId("serviceId");
		conf3.setPropertyId("propertyId");

		if ( conf1.equals(conf2) && conf2.equals(conf3)) {
			assertEquals(conf1, conf2);
		}
	}
	
	public void testReflexive() {
		ServiceConfiguration conf1 = new ServiceConfiguration();
		conf1.setProcessId("processId");
		conf1.setServiceId("serviceId");
		conf1.setPropertyId("propertyId");
		
		assertEquals(conf1, conf1);
	}
	
	public void testSymmetric() {
		ServiceConfiguration conf1 = new ServiceConfiguration();
		conf1.setProcessId("processId");
		conf1.setServiceId("serviceId");
		conf1.setPropertyId("propertyId");

		ServiceConfiguration conf2 = new ServiceConfiguration();
		conf2.setProcessId("processId");
		conf2.setServiceId("serviceId");
		conf2.setPropertyId("propertyId");
		
		if ( conf1.equals(conf2) ) {
			assertEquals(conf2, conf1);
		} else {
			assertNotSame(conf2, conf1);
		}
	}
	
	public void testAsymmetric() {
		ServiceConfiguration conf1 = new ServiceConfiguration();
		conf1.setProcessId("processId");
		conf1.setServiceId("serviceId");
		conf1.setPropertyId("propertyId");

		ServiceConfiguration conf2 = new ServiceConfiguration();
		conf2.setProcessId("processId");
		conf2.setServiceId("serviceId");
		conf2.setPropertyId("propertyId_");
		
		if ( conf1.equals(conf2) ) {
			assertEquals(conf2, conf1);
		} else {
			assertNotSame(conf2, conf1);
		}
	}
	
	public void testEqualsWithNull() {
		
		ServiceConfiguration conf1 = new ServiceConfiguration();
		conf1.setProcessId("processId");
		conf1.setServiceId("serviceId");
		conf1.setPropertyId("propertyId");

		assertFalse(conf1.equals(null));
	}
}
