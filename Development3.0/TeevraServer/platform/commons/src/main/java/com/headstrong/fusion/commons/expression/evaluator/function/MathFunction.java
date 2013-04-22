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
 * $Id: MathFunction.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jun 17, 2009 
 */

package com.headstrong.fusion.commons.expression.evaluator.function;

import com.headstrong.fusion.commons.expression.evaluator.EvaluationContext;
import com.headstrong.fusion.commons.expression.evaluator.EvaluationException;
import com.headstrong.fusion.commons.expression.evaluator.StandardFunction;

/**
 * Implementations of standard mathematical functions.
 */
public abstract class MathFunction extends StandardFunction {
	/**
	 * <p>
	 * This Boolean evaluation property will change the way that mathematical
	 * functions work. If set to TRUE, then when a <code>null</code> is found
	 * as any operand, it will cause the function to return <code>null</code>
	 * immediately.
	 * </p>
	 * 
	 * <p>
	 * If set to FALSE, then functions called with null parameters will do the
	 * best they can or throw an exception.
	 * </p>
	 * 
	 * <p>
	 * The default is TRUE.
	 * </p>
	 */
	public static final String NULL_RETURNS_NULL = MathFunction.class.getName()
			+ ".NULL_RETURNS_NULL";

	/**
	 * <p>
	 * This Boolean evaluation property will change the way that comparison
	 * functions work. If set to TRUE, then when a <code>null</code> is found
	 * as an operand, it will be compared to the other operand. If the two are
	 * both <code>null</code>, then equals will return TRUE. Otherwise, it
	 * will return FALSE.
	 * </p>
	 * 
	 * <p>
	 * If set to FALSE, then any comparison involving a <code>null</code>
	 * operand will return null.
	 * </p>
	 * 
	 * <p>
	 * The default is FALSE.
	 * </p>
	 */
	public static final String ALLOW_NULL_COMPARISON = MathFunction.class
			.getName()
			+ ".ALLOW_NULL_COMPARISON";

	public static abstract class DoubleFunction extends MathFunction {
		public Object call(EvaluationContext ec, String functionName,
				Object[] arguments) throws EvaluationException {
			if (null == arguments || 1 != arguments.length)
				throw new EvaluationException("Expected 1 argument, got "
						+ (null == arguments ? "0" : String
								.valueOf(arguments.length)));

			Object o = arguments[0];

			if (null == o)
				if (Boolean.FALSE.equals(ec.getProperty(NULL_RETURNS_NULL)))
					throw new NullPointerException();
				else
					return null;

			if (!(o instanceof Number))
				throw new EvaluationException("Expected number argument, not "
						+ o.getClass());

			return new Double(call(((Number) arguments[0]).doubleValue()));
		}

		public abstract double call(double d);
	}

	// Single parameter, double-precision functions

	public static class abs extends DoubleFunction {
		public double call(double d) {
			return Math.abs(d);
		}
	}

	public static class acos extends DoubleFunction {
		public double call(double d) {
			return Math.acos(d);
		}
	}

	public static class asin extends DoubleFunction {
		public double call(double d) {
			return Math.asin(d);
		}
	}

	public static class atan extends DoubleFunction {
		public double call(double d) {
			return Math.atan(d);
		}
	}

	public static class ceil extends DoubleFunction {
		public double call(double d) {
			return Math.ceil(d);
		}
	}

	public static class cos extends DoubleFunction {
		public double call(double d) {
			return Math.cos(d);
		}
	}

	public static class exp extends DoubleFunction {
		public double call(double d) {
			return Math.exp(d);
		}
	}

	public static class floor extends DoubleFunction {
		public double call(double d) {
			return Math.floor(d);
		}
	}

	public static class log extends DoubleFunction {
		public double call(double d) {
			return Math.log(d);
		}
	}

	public static class rint extends DoubleFunction {
		public double call(double d) {
			return Math.rint(d);
		}
	}

	public static class sin extends DoubleFunction {
		public double call(double d) {
			return Math.sin(d);
		}
	}

	public static class sqrt extends DoubleFunction {
		public double call(double d) {
			return Math.sqrt(d);
		}
	}

	public static class tan extends DoubleFunction {
		public double call(double d) {
			return Math.tan(d);
		}
	}

	public static class toDegrees extends DoubleFunction {
		public double call(double d) {
			return Math.toDegrees(d);
		}
	}

	public static class toRadians extends DoubleFunction {
		public double call(double d) {
			return Math.toRadians(d);
		}
	}

	public static class random extends StandardFunction {
		public Object call(EvaluationContext ec, String functionName,
				Object[] arguments) throws EvaluationException {
			return new Double(Math.random());
		}
	}

	/**
	 * This class respects the value of the {@link #ALLOW_NULL_COMPARISON}
	 * property.
	 */
	public static class max extends StandardFunction {
		public Object call(EvaluationContext ec, String functionName,
				Object[] arguments) throws EvaluationException {
			// Sanity check
			if (null == arguments || 0 == arguments.length)
				throw new IllegalArgumentException(getClass().getName()
						+ ": One or more arguments are required.");

			// One-arg is easy
			if (1 == arguments.length)
				if (arguments[0] instanceof Number || null == arguments[0])
					return arguments[0];
				else
					throw new IllegalArgumentException(getClass().getName()
							+ ": non-numeric argument: " + arguments[0]);

			boolean allowNulls = Boolean.TRUE.equals(ec
					.getProperty(ALLOW_NULL_COMPARISON));

			int maxIndex = 0;
			double maxValue;
			if (null == arguments[0])
				maxValue = Double.MIN_VALUE;
			else
				maxValue = ((Number) arguments[0]).doubleValue();

			for (int i = 1; i < arguments.length; ++i) {
				Number o = (Number) arguments[i];

				// Bail out if we're not allowed to deal with NULLs
				if (null == o) {
					if (!allowNulls)
						return null;
					else
						; // Ignore null values
				} else if (o instanceof Number) {
					double d = o.doubleValue();
					if (maxValue < d) {
						maxValue = d;
						maxIndex = i;
					}
				} else
					throw new IllegalArgumentException(getClass().getName()
							+ ": non-numeric argument: " + o);
			}

			return arguments[maxIndex];
		}
	}

	/**
	 * This class respects the value of the {@link #ALLOW_NULL_COMPARISON}
	 * property.
	 */
	public static class min extends StandardFunction {
		public Object call(EvaluationContext ec, String functionName,
				Object[] arguments) throws EvaluationException {
			// Sanity check
			if (null == arguments || 0 == arguments.length)
				throw new IllegalArgumentException(getClass().getName()
						+ ": One or more arguments are required.");

			// One-arg is easy
			if (1 == arguments.length)
				if (arguments[0] instanceof Number || null == arguments[0])
					return arguments[0];
				else
					throw new IllegalArgumentException(getClass().getName()
							+ ": non-numeric argument: " + arguments[0]);

			boolean allowNulls = Boolean.TRUE.equals(ec
					.getProperty(ALLOW_NULL_COMPARISON));

			int minIndex = 0;
			double minValue;
			if (null == arguments[0])
				minValue = Double.MAX_VALUE;
			else
				minValue = ((Number) arguments[0]).doubleValue();

			for (int i = 1; i < arguments.length; ++i) {
				Number o = (Number) arguments[i];

				// Bail out if we're not allowed to deal with NULLs
				if (null == o) {
					if (!allowNulls)
						return null;
					else
						; // Ignore null values
				} else if (o instanceof Number) {
					double d = o.doubleValue();
					if (minValue > d) {
						minValue = d;
						minIndex = i;
					}
				} else
					throw new IllegalArgumentException(getClass().getName()
							+ ": non-numeric argument: " + o);
			}

			return arguments[minIndex];
		}
	}

	public static class pow extends StandardFunction {
		public Object call(EvaluationContext ec, String functionName,
				Object[] arguments) throws EvaluationException {
			if (null == arguments || 2 != arguments.length)
				throw new EvaluationException("Expected 2 arguments, got "
						+ (null == arguments ? "0" : String
								.valueOf(arguments.length)));

			if (!((arguments[0] instanceof Number) && arguments[1] instanceof Number))
				throw new EvaluationException("Expected numeric argument, got "
						+ arguments[0] + ", " + arguments[1]);

			double x = ((Number) arguments[0]).doubleValue();
			double y = ((Number) arguments[1]).doubleValue();

			return new Double(Math.pow(x, y));
		}
	}

	/**
	 * Implements a heaviside function which takes a numeric or boolean
	 * argument.
	 * 
	 * This function accepts a numeric or boolean argument and returns an
	 * integer: zero if the argument is false or less than zero, and 1 if the
	 * argument is true. The heaviside function has a discontunity at an
	 * argument value of zero. This implementation returns zero in that case.
	 * This implementation also accepts <code>null</code> as an argument
	 * value, and will return zero in that case.
	 */
	public static class heaviside extends MathFunction {
		private static final Integer ZERO = new Integer(0);
		private static final Integer ONE = new Integer(1);

		public Object call(EvaluationContext ec, String functionName,
				Object[] arguments) throws EvaluationException {
			if (null == arguments || 1 != arguments.length)
				throw new EvaluationException("Expected 1 argument, got "
						+ (null == arguments ? "0" : String
								.valueOf(arguments.length)));

			// Null argument
			if (null == arguments[0])
				return ZERO;

			// Boolean argument
			if (arguments[0] instanceof Boolean)
				return ((Boolean) arguments[0]).booleanValue() ? ONE : ZERO;

			// Numeric argument
			if (arguments[0] instanceof Number)
				return (((Number) arguments[0]).doubleValue() > 0.0) ? ONE
						: ZERO;

			throw new EvaluationException("Expected numeric or boolean "
					+ "argument, got " + MathFunction.getClass(arguments[0]));
		}
	}

	private static Class getClass(Object o) {
		return null == o ? null : o.getClass();
	}
}
