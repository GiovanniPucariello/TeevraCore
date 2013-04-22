package com.headstrong.fusion.remote.impl;

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
 * $Id: CamelProcessContext.java
 * $Revision: 
 * $Author: MBafna
 * $DateTime: Sep 4, 2008 
 */



import java.util.Iterator;

import javax.management.Attribute;
import javax.management.AttributeList;
import javax.management.AttributeNotFoundException;
import javax.management.DynamicMBean;
import javax.management.InvalidAttributeValueException;
import javax.management.MBeanAttributeInfo;
import javax.management.MBeanConstructorInfo;
import javax.management.MBeanException;
import javax.management.MBeanInfo;
import javax.management.MBeanNotificationInfo;
import javax.management.MBeanOperationInfo;
import javax.management.MBeanParameterInfo;
import javax.management.ReflectionException;
import javax.management.RuntimeOperationsException;


public class SampleDynamicMBean implements DynamicMBean {

	

	/**
	 * The current state of the process. Can be possible values
	 * <ol>
	 * <li>Resolved - During process creation </li>
	 * <li>Starting</li>
	 * <li>Started</li>
	 * <li>Stopping</li>
	 * <li>Stopped</li>
	 * </ol>
	 */
	private String state = "Resolved";
	private final String dClassName = this.getClass().getName();
	private final String processName;
	/**
	 * Description of the process. Will be set by the constructor
	 */
	private final String dDescription;

	/**
	 * Attributes, Constructors, Notifications, Operations being exposed
	 */
	private MBeanAttributeInfo[] dAttributes = new MBeanAttributeInfo[1];
	private MBeanConstructorInfo[] dConstructors = null;
	private MBeanNotificationInfo[] dNotifications = null;
	private MBeanOperationInfo[] dOperations = new MBeanOperationInfo[2];
	private MBeanInfo dMBeanInfo = null;

	/**
	 * Default Constructor. It also creates the information required for the
	 * mbean server.
	 */
	public SampleDynamicMBean(String processName, String description) {
		super();
		this.processName = processName;
		this.dDescription = description;
		buildDynamicMBeanInfo();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.management.DynamicMBean#getAttribute(java.lang.String) Exposes
	 *      Read-Only attribute - State
	 */
	public Object getAttribute(String attribute_name)
			throws AttributeNotFoundException, MBeanException,
			ReflectionException {
		if (attribute_name == null) {
			throw new RuntimeOperationsException(new IllegalArgumentException(
					"Attribute name cannot be null"),
					"Cannot invoke a getter of " + dClassName
							+ " with null attribute name");
		}
		if ("State".equals(attribute_name)) {
			return getState();
		}
		throw new AttributeNotFoundException("Cannot find " + attribute_name
				+ " attribute in " + dClassName);
	}

	
	public void setAttribute(Attribute attribute)
			throws AttributeNotFoundException, InvalidAttributeValueException,
			MBeanException, ReflectionException {
		if (attribute == null) {
			throw new RuntimeOperationsException(new IllegalArgumentException(
					"Attribute cannot be null"), "Cannot invoke a setter of "
					+ dClassName + " with null attribute");
		}
	}

	public AttributeList getAttributes(String[] attributeNames) {
		if (attributeNames == null) {
			throw new RuntimeOperationsException(new IllegalArgumentException(
					"attributeNames[] cannot be null"),
					"Cannot invoke a getter of " + dClassName);
		}
		AttributeList resultList = new AttributeList();

		if (attributeNames.length == 0) {
			return resultList;
		}

		for (int i = 0; i < attributeNames.length; i++) {
			try {
				Object value = getAttribute((String) attributeNames[i]);
				resultList.add(new Attribute(attributeNames[i], value));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return resultList;
	}

	@SuppressWarnings("unchecked")
	public AttributeList setAttributes(AttributeList attributes) {
		if (attributes == null) {
			throw new RuntimeOperationsException(new IllegalArgumentException(
					"AttributeList attributes cannot be null"),
					"Cannot invoke a setter of " + dClassName);
		}
		AttributeList resultList = new AttributeList();
		if (attributes.isEmpty())
			return resultList;

		for (Iterator i = attributes.iterator(); i.hasNext();) {
			Attribute attr = (Attribute) i.next();
			try {
				setAttribute(attr);
				String name = attr.getName();
				Object value = getAttribute(name);
				resultList.add(new Attribute(name, value));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return resultList;
	}

	/**
	 * Allows an operation to be invoked on the Dynamic MBean. Possible
	 * operations on this bean are:
	 * <ol>
	 * <li> Start </li>
	 * <li> Stop </li>
	 * </ol>
	 */

	public Object invoke(String operationName, Object params[],
			String signature[]) throws MBeanException, ReflectionException {

		if (operationName == null) {
			throw new RuntimeOperationsException(new IllegalArgumentException(
					"Operation name cannot be null"),
					"Cannot invoke a null operation in " + dClassName);
		}
		if ("start".equals(operationName)) {

			try {
				start();
			} catch (Exception e) {
				throw new MBeanException(e, "Error while starting the context");
			}
			return null;
		} else if ("stop".equals(operationName)) {
			try {
				stop();
			} catch (Exception e) {
				throw new MBeanException(e, "Error while stopping the context");
			}
			return null;

		} else {
			throw new ReflectionException(new NoSuchMethodException(
					operationName), "Cannot find the operation "
					+ operationName + " in " + dClassName);
		}
	}

	/**
	 * This method provides the exposed attributes and operations of the Dynamic
	 * MBean. It provides this information using an MBeanInfo object.
	 */
	public MBeanInfo getMBeanInfo() {

		return dMBeanInfo;
	}

	/**
	 * This method builds the information required by the mbean server. The
	 * following attributes and operations are exposed Attributes - State
	 * Operations - start() , stop()
	 * 
	 */
	private void buildDynamicMBeanInfo() {

		dAttributes[0] = new MBeanAttributeInfo("State", "java.lang.String",
				"State of the Process " + processName, true, false, false);

		MBeanParameterInfo[] params = null;
		dOperations[0] = new MBeanOperationInfo("start", "Start the Process" + processName,
				params, "void", MBeanOperationInfo.ACTION);
		dOperations[1] = new MBeanOperationInfo("stop", "Stop the Process" + processName,
				params, "void", MBeanOperationInfo.ACTION);

		dMBeanInfo = new MBeanInfo(dClassName, dDescription, dAttributes,
				dConstructors, dOperations, dNotifications);

	}

	public String getState() {
		return state;
	}

	/**
	 * 
	 */
	public void start() throws Exception {
		state = "Starting";
		state = "Started";
	}

	/**
	 * 
	 */
	public void stop() throws Exception {
		state = "Stopping";
		state = "Stopped";
	}
}
