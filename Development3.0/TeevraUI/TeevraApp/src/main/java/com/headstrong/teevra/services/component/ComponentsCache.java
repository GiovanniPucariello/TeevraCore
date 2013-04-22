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
 * $Id: ComponentsCache.java
 * $Revision: 
 * $Author: Akrishnamoorthy
 * $DateTime: Nov 26, 2008 
 */

package com.headstrong.teevra.services.component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.headstrong.teevra.services.component.eo.ComponentEO;


/**
 * Cache to hold all the components
 */
public class ComponentsCache {
	private static ComponentsCache instance = new ComponentsCache();
	
	private Map<Long, ComponentEO> componentsMap = null;
	private List<ComponentEO> componentsList = null;
	
	private ComponentsCache() {
	}
	
	public static ComponentsCache getInstance() {
		return instance;
	}
	
	public void addToCache(ComponentEO component) {
		if (componentsList == null) {
			componentsList = new ArrayList<ComponentEO>();
			componentsMap = new TreeMap<Long, ComponentEO>();
		}
		componentsList.add(component);
		componentsMap.put(component.getCompId(), component);
	}
	
	public void addToCache(List<ComponentEO> compList) {
		componentsList = compList;
		if (componentsMap == null) {
			componentsMap = new TreeMap<Long, ComponentEO>();
		} else {
			componentsMap.clear();
		}
		
		for(ComponentEO compEO : compList) {
			componentsMap.put(compEO.getCompId(), compEO);
		}
	}
	
	public ComponentEO getFromCache(Long compId) {
		return componentsMap.get(compId);
	}
	
	public List<ComponentEO> getComponents() {
		return componentsList;
	}
	
}
