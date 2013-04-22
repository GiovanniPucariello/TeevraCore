package com.headstrong.fusion.remote.impl;

import javax.management.MBeanServer;
import javax.management.ObjectName;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ManagedBeanCreatorImplTest extends TestCase {

	SampleDynamicMBean mbean;
	ManagedBeanCreatorImpl managedBeanCreator;

	@Before
	public void setUp() throws Exception {
		mbean = new SampleDynamicMBean("ProcessName",
				"Description of the process");
		managedBeanCreator = new ManagedBeanCreatorImpl(8004, "service:jmx:rmi:///jndi/rmi://localhost:8004/jmxrmi");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testRegisterMBean() {
		try {
			managedBeanCreator.registerMBean(mbean, "ProcessName", "process");

		} catch (Exception e) {
			fail("Error while registering mbean");
		}
		assertEquals("Resolved", getState());
		invoke("start");
		assertEquals("Started", getState());
		invoke("stop");
		assertEquals("Stopped", getState());

	}

	public void testUnRegisterMBean() {
		try {
			managedBeanCreator.registerMBean(mbean, "ProcessName1", "process");
		} catch (Exception e) {
			fail("Error while registering mbean");
		}
		try {
			managedBeanCreator.unRegisterMBean("ProcessName1", "process");
		} catch (Exception e) {
			fail("Error while unregistering mbean");
		}
		
		MBeanServer mbs=managedBeanCreator.getMbs();
		try {
			mbs.getAttribute(ObjectName
			.getInstance("fusion:type=process,index=ProcessName1"),
			"State");
			fail("No attribute should have been returned after unregistering");
		} catch (Exception e) {
			
		}
	}

	public String getState() {
		MBeanServer mbs = managedBeanCreator.getMbs();
		try {
			return (String) mbs.getAttribute(ObjectName
					.getInstance("fusion:type=process,index=ProcessName"),
					"State");

		} catch (Exception e) {
			fail("Error while getting the attribute");
		}
		return null;
	}

	public Object invoke(String operation) {
		MBeanServer mbs = managedBeanCreator.getMbs();
		try {
			return mbs.invoke(ObjectName
					.getInstance("fusion:type=process,index=ProcessName"),
					operation, null, null);
		} catch (Exception e) {
			fail("Error while getting the attribute");
		}
		return null;
	}

}
