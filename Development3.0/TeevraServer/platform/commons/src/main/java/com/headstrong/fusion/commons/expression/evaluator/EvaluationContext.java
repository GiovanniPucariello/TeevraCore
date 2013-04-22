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
 * $Id: EvaluationContext.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jun 17, 2009 
 */

package com.headstrong.fusion.commons.expression.evaluator;

import java.util.Map;

/**
 * <p>
 * Contains important information about the current expression evaluation.
 * </p>
 * 
 * <p>
 * The EvaluationContext stores all of the functions and constants that are
 * bound and can be referenced by any expression. Everything is a first-class
 * object in the evaluation context including functions, variables, etc. To bind
 * an identifier to a value, see the {@link #set} method. To get the value of an
 * identifier, see the {@link #get} method.
 * </p>
 */
public interface EvaluationContext {

	public static final String BUSINESS_OBJECT = "BUSINESS_OBJECT";
	public static final String HEADER = "HEADER";

	/**
	 * Gets the value of the specified identifier.
	 * 
	 * @param identifier
	 *            The identifier for the value.
	 * 
	 * @return The value of the specified identifier.
	 */
	public Object get(String identifier);

	/**
	 * Returns a Map of all bound identifiers and their values. The Map is not
	 * modifiable.
	 * 
	 * @return A Map of all identifiers as keys and their values as the values
	 *         of the Map.
	 */
	public Map getAll();

	/**
	 * Sets the value of an identifer.
	 * 
	 * @param identifier
	 *            The identifier for the value.
	 * @param value
	 *            The value for the identifier.
	 * 
	 * @return The <code>value</code> object.
	 */
	public Object set(String identifier, Object value);

	/**
	 * Removes the value of an identifier.
	 * 
	 * @param identifier
	 *            The identifier whose value should be removed.
	 * 
	 * @return The old value of the object, or <code>null</code> if there was
	 *         no value.
	 */
	public Object remove(String identifier);

	/**
	 * Sets the specified property to the given value.
	 * 
	 * @param key
	 *            The name of the property.
	 * @param value
	 *            The value of the property.
	 */
	public void setProperty(String key, Object value);

	/**
	 * Gets the specified property.
	 * 
	 * @param key
	 *            The name of the property.
	 * 
	 * @return The value of the specified property.
	 */
	public Object getProperty(String key);

	/**
	 * Removes the specified property.
	 * 
	 * @param key
	 *            The name of the property to remove.
	 */
	public void removeProperty(Object key);

}
