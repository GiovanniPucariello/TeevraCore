/**
 * 
 */
package com.headstrong.fusion.bo.java;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @author som krishan
 * 
 */
public class ClassMetadata {
	/**
	 * Java class corresponding to java object
	 */
	private Class javaClass = null;

	/**
	 * Getter methods cache for the class to read attribute values. Map of
	 * attribute name to method reference
	 */
	private Map<String, Method> getterMethods = null;

	/**
	 * Getter methods cache for the class to read attribute values. Map of
	 * attribute name to method reference
	 */
	private Map<String, Method> setterMethods = null;

	public ClassMetadata() {
		this.getterMethods = new HashMap<String, Method>();
		this.setterMethods = new HashMap<String, Method>();
	}

	public Method getGetterMethod(String attribute) {
		return this.getterMethods.get(attribute.toLowerCase());
	}

	public Method getSetterMethod(String attribute) {
		return this.setterMethods.get(attribute.toLowerCase());
	}

	public void addGetterMethod(String attribute, Method method) {
		this.getterMethods.put(attribute.toLowerCase(), method);
	}

	public void addSetterMethod(String attribute, Method method) {
		this.setterMethods.put(attribute.toLowerCase(), method);
	}

	public void setJavaClass(Class javaClass) {
		this.javaClass = javaClass;
	}

	public Class getJavaClass() {
		return this.javaClass;
	}

	public boolean hasGetterMethod(String attribute) {
		return this.getterMethods.containsKey(attribute.toLowerCase());
	}

	public boolean hasSetterMethod(String attribute) {
		return this.setterMethods.containsKey(attribute.toLowerCase());
	}
}