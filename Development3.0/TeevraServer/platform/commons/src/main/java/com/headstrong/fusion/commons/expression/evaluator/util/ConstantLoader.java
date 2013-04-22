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
 * $Id: ConstantLoader.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jun 17, 2009 
 */

package com.headstrong.fusion.commons.expression.evaluator.util;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.regex.Pattern;

/**
 * Utility class to help load constants, functions, and properties for an
 * EvaluationContext.
 * 
 */
public class ConstantLoader {
	@SuppressWarnings("unchecked")
	private static final Class[] STRING = new Class[] { String.class };

	private static final Pattern DOUBLE_PATTERN = Pattern
			.compile("-?([0-9]*\\.[0-9]+|[0-9]+\\.[0-9]*|[0-9]+)d?");
	private static final Pattern FLOAT_PATTERN = Pattern
			.compile("-?([0-9]*\\.[0-9]+|[0-9]+\\.[0-9]*|[0-9]+)f");
	private static final Pattern LONG_PATTERN = Pattern.compile("-?[0-9]+l");
	private static final Pattern INTEGER_PATTERN = Pattern.compile("-?[0-9]+");

	/**
	 * A Boolean property that, when set to <code>true</code>, will cause
	 * blank strings to return <code>null</code> from {@link #getValue}
	 * instead of an empty string.
	 * 
	 * @see #setProperty
	 * @see #getProperty
	 */
	public static final String BLANK_NULL = ConstantLoader.class.getName()
			+ ".BLANK_NULL";

	/**
	 * A map containing all of the properties for this ConstantLoader.
	 * 
	 * @see #setProperty
	 * @see #getProperty
	 */
	private HashMap<String, Object> properties;

	/**
	 * Creates a new ConstantLoader.
	 */
	public ConstantLoader() {
		this.properties = null;
	}

	/**
	 * Sets a ConstantLoader property. See individual properties for their
	 * effects.
	 * 
	 * @param name
	 *            The name of the property.
	 * @param value
	 *            The value of the property.
	 */
	public synchronized void setProperty(String name, Object value) {
		if (null == this.properties) {
			this.properties = new HashMap<String, Object>();
		}
		this.properties.put(name, value);
	}

	/**
	 * Gets the value of the specified property.
	 * 
	 * @param name
	 *            The name of the property.
	 * 
	 * @return The value of the specified property, or <code>null</code> if
	 *         that property has not been set to a specific value.
	 */
	public synchronized Object getProperty(String name) {
		return (null == this.properties ? null : this.properties.get(name));
	}

	/**
	 * @deprecated This method is confusing at best. It's basically just a cast.
	 */
	public String getPropertyName(String propertyName) {
		int hash = propertyName.indexOf('#');

		if (0 > hash)
			return propertyName;

		// The property is in the form my.package.Class#fieldName

		return (String) getValue(propertyName);
	}

	public Object newObjectInstance(String className) {
		// This is a better method name than getObject
		return getObject(className);
	}

	@SuppressWarnings("unchecked")
	public Object getObject(String className) {
		try {
			Class funcImplClass = Class.forName(className);
			return funcImplClass.newInstance();
		} catch (ClassNotFoundException cnfe) {
			throw new RuntimeException("Cannot load class '" + className, cnfe);
		} catch (InstantiationException ie) {
			throw new RuntimeException("Cannot load class '" + className, ie);
		} catch (IllegalAccessException iae) {
			throw new RuntimeException("Cannot load class '" + className, iae);
		}
	}

	/**
	 * Converts a String into a value object.
	 * 
	 * This method determines what type of object to return using the following
	 * rules:
	 * 
	 * <table>
	 * <tr>
	 * <th>Rule</th>
	 * <th>Resulting Object Type</th>
	 * <th>Example</th>
	 * </tr>
	 * <tr>
	 * <td>Value is 'null' <code>null</code> (or "" (empty string) if
	 * {@link #BLANK_NULL} is <code>true</code>)</td>
	 * <td>null</td>
	 * <td>null</td>
	 * </tr>
	 * <tr>
	 * <td>Value is surrounded by ' or " characters.</td>
	 * <td>String</td>
	 * <td>"1.0", 'what (if any)', "null"</td>
	 * </tr>
	 * <tr>
	 * <td>Value contains '#'</td>
	 * <td>(depends)</td>
	 * <td>java.lang.Boolean#TRUE, java.lang.Integer#MAX_VALUE</td>
	 * </tr>
	 * <tr>
	 * <td>Value contains '('</td>
	 * <td>(depends)</td>
	 * <td>java.lang.Integer(3)</td>
	 * </tr>
	 * <tr>
	 * <td>Value is 'true' or 'false' (case insensitive).</td>
	 * <td>java.lang.Boolean</td>
	 * <td>'true' or 'false'</td>
	 * </tr>
	 * <tr>
	 * <td>Value contains numbers including a '.' (or ends with 'd') (optional
	 * sign)</td>
	 * <td>java.lang.Double</td>
	 * <td>3.14159, 100d, 0.5, -2.0</td>
	 * </tr>
	 * <tr>
	 * <td>Value contains numbers and ends with 'f' (optional sign)</td>
	 * <td>java.lang.Float</td>
	 * <td>3.14159f, 100f, -2f</td>
	 * </tr>
	 * <tr>
	 * <td>Value contains digits only (optional sign)</td>
	 * <td>java.lang.Integer</td>
	 * <td>2145, -40, 908</td>
	 * </tr>
	 * <tr>
	 * <td>Value contains digits only and ends with 'l' (optional sign)</td>
	 * <td>java.lang.Long</td>
	 * <td>2145l, -40l, 908l</td>
	 * </tr>
	 * <tr>
	 * <td>(all others)</td>
	 * <td>java.lang.String</td>
	 * <td>(anything else)</td>
	 * </tr>
	 * </table>
	 */
	@SuppressWarnings("unchecked")
	public Object getValue(String valueStr) {
		Object value;
		if (null == valueStr) {
			return null;
		}
		valueStr = valueStr.trim();
		try {
			if ("null".equals(valueStr)
					|| (Boolean.TRUE.equals(getProperty(BLANK_NULL)) && ""
							.equals(valueStr))) {
				value = null;
			} else if ((valueStr.startsWith("'") && valueStr.endsWith("'"))
					|| (valueStr.startsWith("\"") && valueStr.endsWith("\""))) {
				value = valueStr.substring(1, valueStr.length() - 1);
			} else if (0 <= valueStr.indexOf('#')) {
				String className = valueStr.substring(0, valueStr.indexOf('#'));
				String fieldName = valueStr
						.substring(valueStr.indexOf('#') + 1);
				Class clazz = Class.forName(className);
				Field field = clazz.getDeclaredField(fieldName);
				value = field.get(null);
			} else if (0 <= valueStr.indexOf('(')) {
				int paren = valueStr.indexOf('(');
				String className = valueStr.substring(0, paren);
				String argument = valueStr.substring(paren + 1, valueStr
						.indexOf(')'));
				if ("java.lang.String".equals(className)) {
					value = argument;
				} else {
					Class clazz = Class.forName(className);
					Constructor cons = clazz.getConstructor(STRING);
					value = cons.newInstance(new Object[] { argument });
				}
			} else if ("true".equalsIgnoreCase(valueStr)) {
				value = Boolean.TRUE;
			} else if ("false".equalsIgnoreCase(valueStr)) {
				value = Boolean.FALSE;
			} else if (INTEGER_PATTERN.matcher(valueStr).matches()) {
				value = new Integer(valueStr);
			} else if (DOUBLE_PATTERN.matcher(valueStr).matches()) {
				if (valueStr.endsWith("d")) {
					valueStr = valueStr.substring(0, valueStr.length() - 1);
				}
				value = new Double(valueStr);
			} else if (FLOAT_PATTERN.matcher(valueStr).matches()) {
				if (valueStr.endsWith("f")) {
					valueStr = valueStr.substring(0, valueStr.length() - 1);
				}
				value = new Float(valueStr);
			} else if (LONG_PATTERN.matcher(valueStr).matches()) {
				if (valueStr.endsWith("l")) {
					valueStr = valueStr.substring(0, valueStr.length() - 1);
				}
				value = new Long(valueStr);
			} else {
				value = valueStr;
			}
			return value;
		} catch (ClassNotFoundException cnfe) {
			throw new RuntimeException("Cannot load constant", cnfe);
		} catch (NoSuchMethodException nsme) {
			throw new RuntimeException("Cannot load constant", nsme);
		} catch (NoSuchFieldException nsfe) {
			throw new RuntimeException("Cannot load constant", nsfe);
		} catch (IllegalAccessException iae) {
			throw new RuntimeException("Cannot load constant", iae);
		} catch (InstantiationException ie) {
			throw new RuntimeException("Cannot load constant", ie);
		} catch (InvocationTargetException ite) {
			throw new RuntimeException("Cannot load constant", ite);
		}
	}
}
