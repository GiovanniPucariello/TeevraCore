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
 * $Id: DefaultEvaluationContext.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jun 17, 2009 
 */

package com.headstrong.fusion.commons.expression.evaluator.util;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.expression.evaluator.EvaluationContext;

/**
 * <p>
 * Contains important information about the current expression evaluation.
 * </p>
 * 
 * <p>
 * Using the {@link #loadStandard} method, you can have this EvaluationContext
 * load "standard" functions and constants into the context from the file
 * <code>EvaluationContext.properties</code>. Using the
 * {@link #load(ResourceBundle)} or {@link #load(Map)} methods, you can load
 * those constants and function definitions from arbitrary sources.
 * </p>
 * 
 * <p>
 * I also might need some flags, like, 'should a NULL return object result in
 * the expression evaluation terminating, returning nulls until the final
 * return?'. That would be useful for when you want to vail out in the case that
 * one of your functions returns null denoting that the expression <i>cannot</i>
 * currently be evaluated.
 * </p>
 * 
 */
public class DefaultEvaluationContext implements EvaluationContext {
	private static Logger logger = LoggerFactory
			.getLogger(DefaultEvaluationContext.class);
	/**
	 * The Registry of values for this EvaluationContext.
	 */
	private Map<String, Object> values;

	/**
	 * The properties of this EvaluationContext.
	 */
	private Map<String, Object> properties;

	/**
	 * <p>
	 * Creates a new EvaluationContext.
	 * </p>
	 * 
	 * <p>
	 * Note that no functions, constants, etc. will be defined in this
	 * EvaluationContext. If you want to load all the "standard" functions and
	 * constants, as defined by EvaluationContext.properties, then call the
	 * {@link #loadStandard} method. If you want to load your own functions,
	 * constants, and properties, then use {@link #load(ResourceBundle)} or
	 * {@link #load(Map)}.
	 * </p>
	 */
	public DefaultEvaluationContext() {
		this.values = new HashMap<String, Object>();
		this.values.putAll(Collections.unmodifiableMap(ContextUtil.values));
		this.properties = new HashMap<String, Object>();
		this.properties.putAll(Collections
				.unmodifiableMap(ContextUtil.properties));
	}

	/**
	 * Gets the value of the specified identifier.
	 * 
	 * @param identifier
	 *            The identifier for the value.
	 * 
	 * @return The value of the specified value.
	 */
	public Object get(String identifier) {
		return this.values.get(identifier);
	}

	/**
	 * Returns a Map of all bound identifiers and their values. The Map is not
	 * modifiable.
	 * 
	 * @return A Map of all identifiers as keys and their values as the values
	 *         of the Map.
	 */
	public Map<String, Object> getAll() {
		return Collections.unmodifiableMap(this.values);
	}

	/**
	 * Sets the value of the specified identifier to the given value.
	 * 
	 * @param identifier
	 *            The identifier for the value.
	 * @param value
	 *            The value for the identifier.
	 */
	public Object set(String identifier, Object value) {
		Object oldValue = values.put(identifier, value);
		// Did the value change?
		if (null != oldValue && !oldValue.equals(value)) {
			logger.error("Replacing value '" + identifier + "'. Value was "
					+ oldValue + ", is now " + value);
		}
		return value;
	}

	public Object remove(String identifier) {
		return values.remove(identifier);
	}

	/**
	 * Sets the specified property to the given value.
	 * 
	 * @param key
	 *            The name of the property.
	 * @param value
	 *            The value of the property.
	 */
	public void setProperty(String key, Object value) {
		properties.put(key, value);
	}

	/**
	 * Gets the specified property.
	 * 
	 * @param key
	 *            The name of the property.
	 * 
	 * @return The value of the specified property.
	 */
	public Object getProperty(String key) {
		return properties.get(key);
	}

	/**
	 * Removes the specified property.
	 * 
	 * @param key
	 *            The name of the property to remove.
	 */
	public void removeProperty(Object key) {
		properties.remove(key);
	}

	/**
	 * This loads the properties from the ResourceBundle.
	 * 
	 * @precondition
	 * @postcondition
	 * @return
	 */
	public EvaluationContext loadStandard() {
		load(ResourceBundle.getBundle(EvaluationContext.class.getName()));
		return this;
	}

	public void load(ResourceBundle bundle) {
		ContextUtil.load(bundle, this);
	}

	public void load(Map<String, Object> props) {
		ContextUtil.load(props, this);
	}
}
