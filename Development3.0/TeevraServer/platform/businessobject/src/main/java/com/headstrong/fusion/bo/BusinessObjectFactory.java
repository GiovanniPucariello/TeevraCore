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
 * $Id: BusinessObjectFactory.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Jun 14, 2009
 */

package com.headstrong.fusion.bo;

import java.util.HashMap;
import java.util.Map;

import com.headstrong.fusion.bo.dyn.DynamicBusinessObject;
import com.headstrong.fusion.bo.impl.DefaultBusinessObject;

/**
 * Creates a new Business Object as per the type specified.
 * 
 */
public class BusinessObjectFactory {

	private static final Map<Type, String> businessObjectMap;

	public static enum Type {
		Default, Dynamic,

	}

	static {
		businessObjectMap = new HashMap<Type, String>();
		businessObjectMap.put(Type.Default, DefaultBusinessObject.class
				.getName());
		businessObjectMap.put(Type.Dynamic, DynamicBusinessObject.class
				.getName());
	}

	public static BusinessObject getBusinessObject(Type type) {
		BusinessObject businessObject = null;
		String className = businessObjectMap.get(type);

		if (className != null) {
			try {
				businessObject = (BusinessObject) Class.forName(className)
						.newInstance();
			} catch (Exception e) {

			}
		} else {
			businessObject = new DynamicBusinessObject();
		}
		return businessObject;
	}

	/**
	 * Returns Default Business Object.
	 * 
	 * @return New instance of Dedfault Business Object.
	 */
	public static BusinessObject getBusinessObject() {
		BusinessObject businessObject = null;
		businessObject = new DefaultBusinessObject();
		return businessObject;
	}

}
