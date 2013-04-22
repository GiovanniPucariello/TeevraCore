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
 * $Id: ContextUtil.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jun 17, 2009 
 */

package com.headstrong.fusion.commons.expression.evaluator.util;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Map.Entry;

import com.headstrong.fusion.commons.expression.evaluator.EvaluationContext;

/**
 * Contains utility methods for use with EvaluationContext objects.
 */
public class ContextUtil {
	/**
	 * The Registry of values for this EvaluationContext.
	 */
	public static Map<String, Object> values = new HashMap<String, Object>();

	/**
	 * The properties of this EvaluationContext.
	 */
	public static Map<String, Object> properties = new HashMap<String, Object>();

	private static ConstantLoader loader = new ConstantLoader();

	static {
		/**
		 * Initialize the properties.
		 */
		init();
	}

	public static void init() {
		load("function.length",
				"com.headstrong.fusion.commons.expression.evaluator.function.LengthFunction");
		load("function.pow",
				"com.headstrong.fusion.commons.expression.evaluator.function.MathFunction$pow");
		load("function.endsWith",
				"com.headstrong.fusion.commons.expression.evaluator.function.IJWInvocation");
		load("function.abs",
				"com.headstrong.fusion.commons.expression.evaluator.function.MathFunction$abs");
		load("constant.pi", "java.lang.Math#PI");
		load("function.if",
				"com.headstrong.fusion.commons.expression.evaluator.function.IfFunction");
		load("function.matches",
				"com.headstrong.fusion.commons.expression.evaluator.function.IJWInvocation");
		load("function.acos",
				"com.headstrong.fusion.commons.expression.evaluator.function.MathFunction$acos");
		load(
				"function.random",
				"com.headstrong.fusion.commons.expression.evaluator.function.MathFunction$random");
		load(
				"function.>",
				"com.headstrong.fusion.commons.expression.evaluator.function.BinaryOperator$Greater");
		load("function.concat",
				"com.headstrong.fusion.commons.expression.evaluator.function.IJWInvocation");
		load(
				"function.=",
				"com.headstrong.fusion.commons.expression.evaluator.function.BinaryOperator$Equal");
		load(
				"function.<=",
				"com.headstrong.fusion.commons.expression.evaluator.function.BinaryOperator$LessEqual");
		load("function.equals",
				"com.headstrong.fusion.commons.expression.evaluator.function.IJWInvocation");
		load(
				"function.<",
				"com.headstrong.fusion.commons.expression.evaluator.function.BinaryOperator$Less");
		load("function.trim",
				"com.headstrong.fusion.commons.expression.evaluator.function.IJWInvocation");
		load("function.tan",
				"com.headstrong.fusion.commons.expression.evaluator.function.MathFunction$tan");
		load("function.toString",
				"com.headstrong.fusion.commons.expression.evaluator.function.IJWInvocation");
		load(
				"property.com.headstrong.fusion.commons.expression.evaluator.function.MathFunction#NULL_RETURNS_NULL",
				"java.lang.Boolean#TRUE");
		load("function.call",
				"com.headstrong.fusion.commons.expression.evaluator.function.CallFunction");
		load("constant.NEGATIVE_INFINITY", "java.lang.Double#NEGATIVE_INFINITY");
		load("function.equalsIgnoreCase",
				"com.headstrong.fusion.commons.expression.evaluator.function.IJWInvocation");
		load("function.and",
				"com.headstrong.fusion.commons.expression.evaluator.function.ShortCircuitAnd");
		load("function.asin",
				"com.headstrong.fusion.commons.expression.evaluator.function.MathFunction$asin");
		load(
				"function./",
				"com.headstrong.fusion.commons.expression.evaluator.function.BinaryOperator$Divide");
		load(
				"function.-",
				"com.headstrong.fusion.commons.expression.evaluator.function.BinaryOperator$Subtract");
		load("constant.NaN", "java.lang.Double#NaN");
		load("constant.false", "java.lang.Boolean#FALSE");
		load(
				"function.get",
				"com.headstrong.fusion.commons.expression.evaluator.function.GetVariableFunction");
		load(
				"function.+",
				"com.headstrong.fusion.commons.expression.evaluator.function.BinaryOperator$Add");
		load("function.isNaN",
				"com.headstrong.fusion.commons.expression.evaluator.function.IJWInvocation");
		load(
				"function.*",
				"com.headstrong.fusion.commons.expression.evaluator.function.BinaryOperator$Multiply");
		load("function.substring",
				"com.headstrong.fusion.commons.expression.evaluator.function.IJWInvocation");
		load("function.min",
				"com.headstrong.fusion.commons.expression.evaluator.function.MathFunction$min");
		load("function.exp",
				"com.headstrong.fusion.commons.expression.evaluator.function.MathFunction$exp");
		load(
				"function.%",
				"com.headstrong.fusion.commons.expression.evaluator.function.BinaryOperator$Modulus");
		load("function.isNull",
				"com.headstrong.fusion.commons.expression.evaluator.function.IsNullFunction");
		load(
				"function.>=",
				"com.headstrong.fusion.commons.expression.evaluator.function.BinaryOperator$GreaterEqual");
		load(
				"function.toRadians",
				"com.headstrong.fusion.commons.expression.evaluator.function.MathFunction$toRadians");
		load(
				"function.floor",
				"com.headstrong.fusion.commons.expression.evaluator.function.MathFunction$floor");
		load("function.cos",
				"com.headstrong.fusion.commons.expression.evaluator.function.MathFunction$cos");
		load("constant.POSITIVE_INFINITY", "java.lang.Double#POSITIVE_INFINITY");
		load("function.&&",
				"com.headstrong.fusion.commons.expression.evaluator.function.ShortCircuitAnd");
		load("function.||",
				"com.headstrong.fusion.commons.expression.evaluator.function.ShortCircuitOr");
		load("function.log",
				"com.headstrong.fusion.commons.expression.evaluator.function.MathFunction$log");
		load("constant.e", "java.lang.Math#E");
		load("function.sin",
				"com.headstrong.fusion.commons.expression.evaluator.function.MathFunction$sin");
		load("function.rint",
				"com.headstrong.fusion.commons.expression.evaluator.function.MathFunction$rint");
		load(
				"function.heaviside",
				"com.headstrong.fusion.commons.expression.evaluator.function.MathFunction$heaviside");
		load("function.ceil",
				"com.headstrong.fusion.commons.expression.evaluator.function.MathFunction$ceil");
		load("function.atan",
				"com.headstrong.fusion.commons.expression.evaluator.function.MathFunction$atan");
		load("function.sum",
				"com.headstrong.fusion.commons.expression.evaluator.function.Summation");
		load("function.startsWith",
				"com.headstrong.fusion.commons.expression.evaluator.function.IJWInvocation");
		load(
				"property.com.headstrong.fusion.commons.expression.evaluator.function.MathFunction#ALLOW_NULL_COMPARISON",
				"java.lang.Boolean#FALSE");
		load("constant.true", "java.lang.Boolean#TRUE");
		load("function.create",
				"com.headstrong.fusion.commons.expression.evaluator.function.NewObjectFunction");
		load("constant.null", "null");
		load("function.show",
				"com.headstrong.fusion.commons.expression.evaluator.function.VariablesFunction");
		load("function.sqrt",
				"com.headstrong.fusion.commons.expression.evaluator.function.MathFunction$sqrt");
		load(
				"function.toDegrees",
				"com.headstrong.fusion.commons.expression.evaluator.function.MathFunction$toDegrees");
		load("function.max",
				"com.headstrong.fusion.commons.expression.evaluator.function.MathFunction$max");
		load("function.sub",
				"com.headstrong.fusion.commons.expression.evaluator.function.Difference");
		load(
				"function.set",
				"com.headstrong.fusion.commons.expression.evaluator.function.SetVariableFunction");
		load("function.or",
				"com.headstrong.fusion.commons.expression.evaluator.function.ShortCircuitOr");
		load(
				"function.!=",
				"com.headstrong.fusion.commons.expression.evaluator.function.BinaryOperator$NotEqual");
	}

	private static void load(String key, String keyValue) {
		if (key.startsWith("constant.")) {
			String constantName = key.substring(9);
			Object value = loader.getValue(keyValue);
			values.put(constantName, value);
		} else if (key.startsWith("function.")) {
			String functionName = key.substring(9);
			values.put(functionName, loader.getObject(keyValue));
		} else if (key.startsWith("property.")) {
			String propName = key.substring(9);
			// Is property name is really something else?
			//
			// First, resolve the property name into a string
			// (by looking up it's value using reflection)
			// and then use that string as the property's name.
			if (0 <= propName.indexOf('#'))
				propName = (String) loader.getValue(propName);
			Object value = loader.getValue(keyValue);
			properties.put(propName, value);
		}
	}

	private ContextUtil() {
	}

	/**
	 * Loads constants, properties, and functions from the specified
	 * ResourceBundle into the specified EvaluationContext.
	 * 
	 * @param bundle
	 *            The bundle containing all of the constant, property, and
	 *            function definitions.
	 * @param ec
	 *            The EvaluationContext into which all the constants,
	 *            properties, and functions will be placed.
	 */
	public static void load(ResourceBundle bundle, EvaluationContext ec) {
		load(toMap(bundle), ec);
	}

	public static void load(EvaluationContext ec) {
		load(properties, ec);
	}

	/**
	 * Loads constants, properties, and functions from the specified Map into
	 * the specified EvaluationContext.
	 * 
	 * @param props
	 *            The property map containing all of the constant, property, and
	 *            function definitions.
	 * @param ec
	 *            The EvaluationContext into which all the constants,
	 *            properties, and functions will be placed.
	 */
	public static void load(Map<String, Object> props, EvaluationContext ec) {

		for (Entry<String, Object> entry : props.entrySet()) {
			String key = (String) entry.getKey();
			String keyValue = (String) entry.getValue();
			if (key.startsWith("constant.")) {
				String constantName = key.substring(9);
				Object value = loader.getValue(keyValue);
				ec.set(constantName, value);
			} else if (key.startsWith("function.")) {
				String functionName = key.substring(9);
				ec.set(functionName, loader.getObject(keyValue));
			} else if (key.startsWith("property.")) {
				String propName = key.substring(9);
				// Is property name is really something else?
				//
				// First, resolve the property name into a string
				// (by looking up it's value using reflection)
				// and then use that string as the property's name.
				if (0 <= propName.indexOf('#'))
					propName = (String) loader.getValue(propName);
				Object value = loader.getValue(keyValue);
				ec.setProperty(propName, value);
			}
		}
	}

	/**
	 * Converts a ResourceBundle into a Map.
	 * 
	 * @param props
	 *            A ResourceBundle.
	 * 
	 * @return A Map containing all keys and values from the ResourceBoudle.
	 */
	public static Map<String, Object> toMap(ResourceBundle props) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		for (Enumeration<String> e = props.getKeys(); e.hasMoreElements();) {
			String key = (String) e.nextElement();
			map.put(key, props.getObject(key));
		}
		return map;
	}
}
