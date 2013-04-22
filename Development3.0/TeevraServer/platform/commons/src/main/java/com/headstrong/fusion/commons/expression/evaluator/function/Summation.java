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
 * $Id: Summation.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jun 17, 2009 
 */

package com.headstrong.fusion.commons.expression.evaluator.function;

import com.headstrong.fusion.commons.expression.evaluator.EvaluationContext;
import com.headstrong.fusion.commons.expression.evaluator.EvaluationException;

/**
 * Implements numeric addition.
 *
 * This function takes any number of arguments and returns the arithmetic
 * sum of them. No arguments returns zero. The following data types are
 * supported: byte, short, int, long, float, and double.
 *
 * The return type is chosen based upon the widest-typed argument passed
 * into the function. The types are listed above from narrowest to widest.
 *
 */
public class Summation extends MathFunction {
	private static final Summation DOUBLE_SUM = new DoubleSum();
	private static final Summation FLOAT_SUM = new FloatSum();
	private static final Summation LONG_SUM = new LongSum();
	private static final Summation INTEGER_SUM = new IntegerSum();
	private static final Summation SHORT_SUM = new ShortSum();
	private static final Summation BYTE_SUM = new ByteSum();

	public Object call(EvaluationContext ec, String functionName,
			Object[] arguments) throws EvaluationException {
		if (null == arguments || 0 == arguments.length)
			return new Integer(0);

		if (1 == arguments.length && arguments[0] instanceof Number)
			return arguments[0];

		Summation impl = getSummationType(arguments);

		if (null == impl) {
			if (Boolean.FALSE.equals(ec.getProperty(NULL_RETURNS_NULL)))
				throw new EvaluationException(
						"Cannot find type-specific summation function for arguments.");
			else
				return null; // Default is NULL_RETURNS_NULL => true
		} else
			return impl.call(ec, functionName, arguments);
	}

	private Summation getSummationType(Object[] arguments)
			throws EvaluationException {
		boolean sawFloat = false;
		boolean sawLong = false;
		boolean sawInt = false;
		boolean sawShort = false;
		boolean sawByte = false;

		for (int i = 0; i < arguments.length; ++i) {
			Object arg = arguments[i];

			if (null == arg)
				return null;

			if (arg instanceof Double)
				return DOUBLE_SUM; // Double is the widest possible type

			if (!(arg instanceof Number))
				throw new EvaluationException("Invalid numeric argument: "
						+ arg);
			if (arg instanceof Float)
				sawFloat = true;
			else if (arg instanceof Long)
				sawLong = true;
			else if (arg instanceof Integer)
				sawInt = true;
			else if (arg instanceof Short)
				sawShort = true;
			else if (arg instanceof Byte)
				sawByte = true;
		}

		if (sawFloat)
			return FLOAT_SUM;
		else if (sawLong)
			return LONG_SUM;
		else if (sawInt)
			return INTEGER_SUM;
		else if (sawShort)
			return SHORT_SUM;
		else if (sawByte)
			return BYTE_SUM;

		throw new EvaluationException("Ran out of types to check :(");
	}

	// These classes implement summation using a particular data type.
	// Other than the data type used, they are identical.

	static class DoubleSum extends Summation {
		public Object call(EvaluationContext ec, String functionName,
				Object[] arguments) throws EvaluationException {
			double value = 0.0;

			for (int i = 0; i < arguments.length; ++i) {
				Object arg = arguments[i];

				if (null == arg)
					return null;

				value += ((Number) arg).doubleValue();
			}

			return new Double(value);
		}
	}

	static class FloatSum extends Summation {
		public Object call(EvaluationContext ec, String functionName,
				Object[] arguments) throws EvaluationException {
			float value = 0.0f;

			for (int i = 0; i < arguments.length; ++i) {
				Object arg = arguments[i];

				if (null == arg)
					return null;

				value += ((Number) arg).floatValue();
			}

			return new Float(value);
		}
	}

	static class LongSum extends Summation {
		public Object call(EvaluationContext ec, String functionName,
				Object[] arguments) throws EvaluationException {
			long value = 0l;

			for (int i = 0; i < arguments.length; ++i) {
				Object arg = arguments[i];

				if (null == arg)
					return null;

				value += ((Number) arg).longValue();
			}

			return new Long(value);
		}
	}

	static class IntegerSum extends Summation {
		public Object call(EvaluationContext ec, String functionName,
				Object[] arguments) throws EvaluationException {
			int value = 0;

			for (int i = 0; i < arguments.length; ++i) {
				Object arg = arguments[i];

				if (null == arg)
					return null;

				value += ((Number) arg).intValue();
			}

			return new Integer(value);
		}
	}

	static class ShortSum extends Summation {
		public Object call(EvaluationContext ec, String functionName,
				Object[] arguments) throws EvaluationException {
			short value = 0;

			for (int i = 0; i < arguments.length; ++i) {
				Object arg = arguments[i];

				if (null == arg)
					return null;

				value += ((Number) arg).shortValue();
			}

			return new Short(value);
		}
	}

	static class ByteSum extends Summation {
		public Object call(EvaluationContext ec, String functionName,
				Object[] arguments) throws EvaluationException {
			byte value = 0;

			for (int i = 0; i < arguments.length; ++i) {
				Object arg = arguments[i];

				if (null == arg)
					return null;

				value += ((Number) arg).byteValue();
			}

			return new Byte(value);
		}
	}
}
