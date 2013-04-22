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
 * $Id: NewObjectFunction.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jun 17, 2009 
 */

package com.headstrong.fusion.commons.expression.evaluator.function;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.headstrong.fusion.commons.expression.evaluator.EvaluationContext;
import com.headstrong.fusion.commons.expression.evaluator.EvaluationException;
import com.headstrong.fusion.commons.expression.evaluator.StandardFunction;

/**
 * <p>
 *    Creates a new object of a class and calls the appropriate constructor.
 * </p>
 *
 * <p>
 *    Here's an example of how this works. If you expression is
 * </p>
 *
 * <p>
 *    <code>create("java.lang.StringBuffer", "buffered string")</code>
 * </p>
 *
 * <p>
 *    Then by using the NewObjectFunction, a new object of type StrinfBuffer
 *    will be created, and StringBuffer.&lt;init&gt; will be called
 *    with the remaining arguments ("buffered string").
 * </p>
 *
 */
public class NewObjectFunction extends StandardFunction {
	/**
	 * Creates a new IJWInvocation object.
	 */
	public NewObjectFunction() {
		super();
	}

	public Object call(EvaluationContext ec, String functionName,
			Object[] arguments) throws EvaluationException {
		if (null == arguments || 0 == arguments.length)
			throw new EvaluationException("Cannot create object of null class");

		Object targetClass = arguments[0];

		if (null == targetClass)
			throw new EvaluationException("Cannot create object of null class");

		Class c = null;

		try {
			if (targetClass instanceof String)
				c = Class.forName((String) targetClass);
			else if (targetClass instanceof Class)
				c = (Class) targetClass;
			else
				throw new EvaluationException("Can't create class from "
						+ targetClass);

			if (1 == arguments.length) {
				// No arguments for constructor: cheat a little

				return c.newInstance();
			}

			Constructor constructor = NewObjectFunction.getConstructor(c,
					arguments);

			if (null == constructor)
				throw new EvaluationException(
						"No such constructor found in class " + c.getName());

			Object[] args = new Object[arguments.length - 1];

			System.arraycopy(arguments, 1, args, 0, arguments.length - 1);

			return constructor.newInstance(args);
		} catch (IllegalAccessException iae) {
			throw new EvaluationException("Cannot create object of type " + c,
					iae);
		} catch (InvocationTargetException ite) {
			throw new EvaluationException(c.getName() + ".<init> failed", ite
					.getCause());
		} catch (InstantiationException ie) {
			throw new EvaluationException("Cannot create " + c.getName(), ie);
		} catch (ClassNotFoundException cnfe) {
			throw new EvaluationException("Cannot create " + c.getName(), cnfe);
		}
	}

	/**
	 * Finds a constructor matching the parameter types of the specified
	 * arguments.
	 *
	 * @param c The Class which should be searched for constructors.
	 * @param arguments The array of arguments which will be used
	 *                  during the eventual invocation of the
	 *                  constructor.
	 */
	private static Constructor getConstructor(Class c, Object[] arguments) {
		Constructor[] constructors = c.getConstructors();

		for (int i = 0; i < constructors.length; ++i) {
			Constructor cons = constructors[i];

			Class[] argTypes = cons.getParameterTypes();

			if (argTypes.length == (arguments.length - 1)) {
				// Might be our constructor

				// Quickie check: zero-args means we're done
				if (0 == argTypes.length)
					return cons;

				boolean okay = true;
				for (int j = 0; j < argTypes.length; ++j) {
					Object arg = arguments[j + 1];

					// Accept either compatible classes or
					// a null argument for anything
					if (null == arg) {
						// System.err.println("Ok: null");

						continue;
					}

					Class argType = arg.getClass();

					if (argTypes[j].isAssignableFrom(argType)) {
						// System.err.println("Ok: " + arg.getClass());

						continue;
					}

					// TODO: Allow other primitive types

					// Just in case we're comparing 'int' to 'Integer'...
					if (argTypes[j].equals(Integer.TYPE)
							&& Integer.class.equals(argType)) {
						// System.err.println("Ok: automagic unboxing of Integer");
						continue;
					}

					// System.err.println("Parameter type mismatch: wanted=" + argTypes[j] + ", got=" + arg.getClass());

					okay = false;
					break;
				}

				if (okay)
					return cons;
			}
		}

		return null;
	}
}
