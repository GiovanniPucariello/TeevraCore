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
 * $Id: FusionComponentFactory.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Apr 15, 2009 
 */

package com.headstrong.fusion.commons.component;

import java.util.HashMap;
import java.util.Map;

import com.headstrong.fusion.commons.component.FusionComponent;
import com.headstrong.fusion.commons.exception.InitializationException;

/**
 * Fusion components are registered with the factory. Any new component part of
 * the teevra system will register the component with the factory on
 * activation. Endpoint modeler will pick up the component from the factory
 * using the type name as specified in the process configuration model.
 * 
 */
public class FusionComponentFactory {

	private static Map<String, FusionComponent> componentMap = new HashMap<String, FusionComponent>();

	/**
	 * Returns the component as per the type information.
	 * 
	 * @param type
	 *            type used to register the component.
	 * @return Fusion connector component.
	 * @throws InitializationException
	 */
	public static FusionComponent getComponent(String type)
			throws InitializationException {
		return componentMap.get(type);
	}

	/**
	 * adds a new component in the fusion component factory.
	 * 
	 * @param type
	 *            type used to register the component.
	 * @param fusionComponent
	 */
	public static void addComponent(String type, FusionComponent fusionComponent) {
		componentMap.put(type, fusionComponent);
	}

	/**
	 * adds a new component in the fusion component factory.
	 * 
	 * @param type
	 *            type used to register the component.
	 * @param fusionComponent
	 */
	public static void removeComponent(String type) {
		if (componentMap.containsKey(type)) {
			componentMap.remove(type);
		}
	}
}
