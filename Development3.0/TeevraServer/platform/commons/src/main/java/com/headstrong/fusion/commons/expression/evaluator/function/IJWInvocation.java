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
 * $Id: IJWInvocation.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jun 17, 2009 
 */

package com.headstrong.fusion.commons.expression.evaluator.function;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.headstrong.fusion.commons.expression.evaluator.EvaluationContext;
import com.headstrong.fusion.commons.expression.evaluator.EvaluationException;
import com.headstrong.fusion.commons.expression.evaluator.StandardFunction;

/**
 * <p>
 * Calls a method matching the function's name on the first argument, passing
 * the remaining function arguments as arguments to the object method.
 * </p>
 * 
 * <p>
 * The .NET framework calls this "It Just Works", or IJW, which is where I took
 * this name.
 * </p>
 * 
 * <p>
 * Here's an example of how this works. If you expression is
 * </p>
 * 
 * <p>
 * <code>substring("hello world", 1, 4)</code>
 * </p>
 * 
 * <p>
 * Then by using an IJWInvocation function call, the "hello world" String object
 * will be used to call the "substring" method with the remaining arguments (1
 * and 4).
 * </p>
 * 
 */
public class IJWInvocation extends StandardFunction {
	/**
	 * Creates a new IJWInvocation object.
	 */
	public IJWInvocation() {
		super();
	}

	public Object call(EvaluationContext ec, String functionName,
			Object[] arguments) throws EvaluationException {
		if (null == arguments || 0 == arguments.length)
			throw new EvaluationException("Cannot call method on null object");

		Object target = arguments[0];

		if (null == target)
			throw new EvaluationException("Cannot call method on null object");

		Class c = target.getClass();

		System.err.println("Arguments: " + java.util.Arrays.asList(arguments));

		try {
			Method method = IJWInvocation.getMethod(functionName, c, arguments);

			if (null == method) {
				StringBuffer errorMsg = new StringBuffer(
						"No such method found: ").append(functionName).append(
						" in class ").append(c.getName());

				if (1 == arguments.length) {
					errorMsg.append("with no arguments.");
				} else {
					errorMsg.append(" with arguments compatible with (");

					for (int i = 1; i < arguments.length; ++i) {
						if (i > 1)
							errorMsg.append(',');

						if (null == arguments[i])
							errorMsg.append("<any>");
						else
							errorMsg.append(arguments[i].getClass().getName());
					}

					errorMsg.append(").");
				}

				throw new EvaluationException(errorMsg.toString());
			}

			Object[] args;
			if (arguments.length > 1) {
				args = new Object[arguments.length - 1];

				System.arraycopy(arguments, 1, args, 0, arguments.length - 1);
			} else {
				args = null;
			}

			return method.invoke(target, args);
		} catch (IllegalAccessException iae) {
			throw new EvaluationException("Cannot call " + c + "."
					+ functionName, iae);
		} catch (InvocationTargetException ite) {
			throw new EvaluationException(c.getName() + "." + functionName
					+ " failed", ite.getCause());
		}
	}

	/**
	 * Finds a method matching the parameter types of the specified arguments.
	 * 
	 * @param name
	 *            The name of the function to find.
	 * @param c
	 *            The Class which should be searched for methods.
	 * @param arguments
	 *            The array of arguments which will be used during the eventual
	 *            invocation of the method.
	 */
	private static Method getMethod(String name, Class c, Object[] arguments) {
		Method[] methods = c.getMethods();

		for (int i = 0; i < methods.length; ++i) {
			Method m = methods[i];

			if (name.equals(m.getName())) {
				// Check the argument list
				// System.err.println("Found " + m);

				Class[] argTypes = m.getParameterTypes();

				if (argTypes.length == (arguments.length - 1)) {
					// Might be our method

					// Quickie check: zero-args means we're done
					if (0 == argTypes.length)
						return m;

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

						// Just in case we're comparing 'int' to 'Integer'...
						if ((argTypes[j].equals(Integer.TYPE) && Integer.class
								.equals(argType))
								|| (argTypes[j].equals(Long.TYPE) && Long.class
										.equals(argType))
								|| (argTypes[j].equals(Double.TYPE) && Double.class
										.equals(argType))
								|| (argTypes[j].equals(Float.TYPE) && Float.class
										.equals(argType))
								|| (argTypes[j].equals(Boolean.TYPE) && Boolean.class
										.equals(argType)))
							continue;

						// System.err.println("Parameter type mismatch: wanted="
						// + argTypes[j] + ", got=" + arg.getClass());

						okay = false;
						break;
					}

					if (okay)
						return m;
				}
			}
		}

		return null;
	}
}
