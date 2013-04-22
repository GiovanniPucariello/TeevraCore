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
 * $Id: Difference.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jun 17, 2009 
 */

package com.headstrong.fusion.commons.expression.evaluator.function;

import com.headstrong.fusion.commons.expression.evaluator.EvaluationContext;
import com.headstrong.fusion.commons.expression.evaluator.EvaluationException;

/**
 * Implements numeric subtraction.
 *
 * This function takes any number of arguments and returns the arithmetic
 * difference between them. No arguments returns zero. One argument returns
 * the negavite of that argument. More than one argument returns the first
 * argument with each of the remaining arguments subtracted from it.
 * The following data types are supported:
 * byte, short, int, long, float, and double.
 *
 * The return type is chosen based upon the widest-typed argument passed
 * into the function. The types are listed above from narrowest to widest.
 *
 */
public class Difference extends MathFunction {
	private static final Difference DOUBLE_DIF = new DoubleDifference();
	private static final Difference FLOAT_DIF = new FloatDifference();
	private static final Difference LONG_DIF = new LongDifference();
	private static final Difference INTEGER_DIF = new IntegerDifference();
	private static final Difference SHORT_DIF = new ShortDifference();
	private static final Difference BYTE_DIF = new ByteDifference();

	public Object call(EvaluationContext ec, String functionName,
			Object[] arguments) throws EvaluationException {
		if (null == arguments || 0 == arguments.length)
			return new Integer(0);

		Difference impl = getDifferenceType(arguments);

		if (null == impl) {
			if (Boolean.FALSE.equals(ec.getProperty(NULL_RETURNS_NULL)))
				throw new EvaluationException(
						"Cannot find type-specific difference function for arguments.");
			else
				return null; // Default is NULL_RETURNS_NULL => true
		} else
			return impl.call(ec, functionName, arguments);
	}

	private Difference getDifferenceType(Object[] arguments)
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
				return DOUBLE_DIF; // Double is the widest possible type

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
			return FLOAT_DIF;
		else if (sawLong)
			return LONG_DIF;
		else if (sawInt)
			return INTEGER_DIF;
		else if (sawShort)
			return SHORT_DIF;
		else if (sawByte)
			return BYTE_DIF;
		else
			throw new EvaluationException("Ran out of types to check :(");
	}

	// These classes implement difference using a particular data type.
	// Other than the data type used, they are identical.

	static class DoubleDifference extends Difference {
		public Object call(EvaluationContext ec, String functionName,
				Object[] arguments) throws EvaluationException {
			double value = ((Number) arguments[0]).doubleValue();

			// Special case: 1 argument => unary minus
			if (1 == arguments.length)
				return new Double(-value);

			for (int i = 1; i < arguments.length; ++i) {
				Object arg = arguments[i];

				if (null == arg)
					return null;

				value -= ((Number) arg).doubleValue();
			}

			return new Double(value);
		}
	}

	static class FloatDifference extends Difference {
		public Object call(EvaluationContext ec, String functionName,
				Object[] arguments) throws EvaluationException {
			float value = ((Number) arguments[0]).floatValue();

			// Special case: 1 argument => unary minus
			if (1 == arguments.length)
				return new Float(-value);

			for (int i = 1; i < arguments.length; ++i) {
				Object arg = arguments[i];

				if (null == arg)
					return null;

				value -= ((Number) arg).floatValue();
			}

			return new Float(value);
		}
	}

	static class LongDifference extends Difference {
		public Object call(EvaluationContext ec, String functionName,
				Object[] arguments) throws EvaluationException {
			long value = ((Number) arguments[0]).longValue();

			// Special case: 1 argument => unary minus
			if (1 == arguments.length)
				return new Long(-value);

			for (int i = 1; i < arguments.length; ++i) {
				Object arg = arguments[i];

				if (null == arg)
					return null;

				value -= ((Number) arg).longValue();
			}

			return new Long(value);
		}
	}

	static class IntegerDifference extends Difference {
		public Object call(EvaluationContext ec, String functionName,
				Object[] arguments) throws EvaluationException {
			int value = ((Number) arguments[0]).intValue();

			// Special case: 1 argument => unary minus
			if (1 == arguments.length)
				return new Integer(-value);

			for (int i = 1; i < arguments.length; ++i) {
				Object arg = arguments[i];

				if (null == arg)
					return null;

				value -= ((Number) arg).intValue();
			}

			return new Integer(value);
		}
	}

	static class ShortDifference extends Difference {
		public Object call(EvaluationContext ec, String functionName,
				Object[] arguments) throws EvaluationException {
			short value = ((Number) arguments[0]).shortValue();

			// Special case: 1 argument => unary minus
			if (1 == arguments.length)
				return new Short((short) -value);

			for (int i = 1; i < arguments.length; ++i) {
				Object arg = arguments[i];

				if (null == arg)
					return null;

				value -= ((Number) arg).shortValue();
			}

			return new Short(value);
		}
	}

	static class ByteDifference extends Difference {
		public Object call(EvaluationContext ec, String functionName,
				Object[] arguments) throws EvaluationException {
			byte value = ((Number) arguments[0]).byteValue();

			// Special case: 1 argument => unary minus
			if (1 == arguments.length)
				return new Byte((byte) -value);

			for (int i = 1; i < arguments.length; ++i) {
				Object arg = arguments[i];

				if (null == arg)
					return null;

				value -= ((Number) arg).byteValue();
			}

			return new Byte(value);
		}
	}

}
