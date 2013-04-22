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
 * $Id: BinaryOperator.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jun 17, 2009 
 */

package com.headstrong.fusion.commons.expression.evaluator.function;

import com.headstrong.fusion.commons.expression.evaluator.EvaluationContext;
import com.headstrong.fusion.commons.expression.evaluator.EvaluationException;
import com.headstrong.fusion.commons.expression.evaluator.UnexpectedArgumentException;

/**
 * Provdes implementations of standard mathematical, logical, and relational
 * binary operators including the following usual suspects: +, -, *, /, =, !=,
 * &gt;, &lt;, &gt;=, &lt;=, &amp;&amp;, ||
 */
public abstract class BinaryOperator extends MathFunction {
	/**
	 * Checks for exactly two arguments and calls the subclass's 2-argument call
	 * function.
	 */
	public Object call(EvaluationContext ec, String functionName, Object[] args)
			throws EvaluationException {
		if (null == args || 2 != args.length)
			throw new EvaluationException("Invalid argument count: "
					+ (null == args ? "0" : String.valueOf(args.length)));

		return call(ec, args[0], args[1]);
	}

	protected abstract Object call(EvaluationContext ec, Object lvalue,
			Object rvalue) throws EvaluationException;

	/**
	 * Implements addition.
	 */
	public static class Add extends BinaryOperator {
		public Object call(EvaluationContext ec, Object lvalue, Object rvalue)
				throws EvaluationException {
			if (null == lvalue || null == rvalue)
				return null;

			if (lvalue instanceof Double || rvalue instanceof Double)
				return new Double(((Number) lvalue).doubleValue()
						+ ((Number) rvalue).doubleValue());
			else if (lvalue instanceof Float || rvalue instanceof Float)
				return new Float(((Number) lvalue).floatValue()
						+ ((Number) rvalue).floatValue());
			else if (lvalue instanceof Long || rvalue instanceof Long)
				return new Long(((Number) lvalue).longValue()
						+ ((Number) rvalue).longValue());
			else if (lvalue instanceof Number && rvalue instanceof Number)
				return new Integer(((Number) lvalue).intValue()
						+ ((Number) rvalue).intValue());
			else if (lvalue instanceof String && rvalue instanceof String)
				// Support string concatenation for convenience.
				return ((String) lvalue).concat((String) rvalue);
			else
				throw newUnexpectedArgsException(lvalue, rvalue);
		}
	}

	/**
	 * Implements subtraction.
	 */
	public static class Subtract extends BinaryOperator {
		public Object call(EvaluationContext ec, Object lvalue, Object rvalue)
				throws EvaluationException {
			if (null == lvalue || null == rvalue)
				return null;

			if (lvalue instanceof Double || rvalue instanceof Double)
				return new Double(((Number) lvalue).doubleValue()
						- ((Number) rvalue).doubleValue());
			else if (lvalue instanceof Float || rvalue instanceof Float)
				return new Float(((Number) lvalue).floatValue()
						- ((Number) rvalue).floatValue());
			else if (lvalue instanceof Long || rvalue instanceof Long)
				return new Long(((Number) lvalue).longValue()
						- ((Number) rvalue).longValue());
			else if (lvalue instanceof Number && rvalue instanceof Number)
				return new Integer(((Number) lvalue).intValue()
						- ((Number) rvalue).intValue());
			else
				throw newUnexpectedArgsException(lvalue, rvalue);
		}
	}

	/**
	 * Implements multiplication.
	 */
	public static class Multiply extends BinaryOperator {
		public Object call(EvaluationContext ec, Object lvalue, Object rvalue)
				throws EvaluationException {
			if (null == lvalue || null == rvalue)
				return null;

			if (lvalue instanceof Double || rvalue instanceof Double)
				return new Double(((Number) lvalue).doubleValue()
						* ((Number) rvalue).doubleValue());
			else if (lvalue instanceof Float || rvalue instanceof Float)
				return new Float(((Number) lvalue).floatValue()
						* ((Number) rvalue).floatValue());
			else if (lvalue instanceof Long || rvalue instanceof Long)
				return new Long(((Number) lvalue).longValue()
						* ((Number) rvalue).longValue());
			else if (lvalue instanceof Number && rvalue instanceof Number)
				return new Integer(((Number) lvalue).intValue()
						* ((Number) rvalue).intValue());
			else
				throw newUnexpectedArgsException(lvalue, rvalue);
		}
	}

	/**
	 * Implements division.
	 */
	public static class Divide extends BinaryOperator {
		public Object call(EvaluationContext ec, Object lvalue, Object rvalue)
				throws EvaluationException {
			if (null == lvalue || null == rvalue)
				return null;

			if (lvalue instanceof Double || rvalue instanceof Double)
				return new Double(((Number) lvalue).doubleValue()
						/ ((Number) rvalue).doubleValue());
			else if (lvalue instanceof Float || rvalue instanceof Float)
				return new Float(((Number) lvalue).floatValue()
						/ ((Number) rvalue).floatValue());
			else if (lvalue instanceof Long || rvalue instanceof Long)
				return new Long(((Number) lvalue).longValue()
						/ ((Number) rvalue).longValue());
			else if (lvalue instanceof Number && rvalue instanceof Number)
				return new Integer(((Number) lvalue).intValue()
						/ ((Number) rvalue).intValue());
			else
				throw newUnexpectedArgsException(lvalue, rvalue);
		}
	}

	/**
	 * Implements modulus (remainder).
	 */
	public static class Modulus extends BinaryOperator {
		public Object call(EvaluationContext ec, Object lvalue, Object rvalue)
				throws EvaluationException {
			if (null == lvalue || null == rvalue)
				return null;

			if (lvalue instanceof Double || rvalue instanceof Double)
				return new Double(((Number) lvalue).doubleValue()
						% ((Number) rvalue).doubleValue());
			else if (lvalue instanceof Float || rvalue instanceof Float)
				return new Float(((Number) lvalue).floatValue()
						% ((Number) rvalue).floatValue());
			else if (lvalue instanceof Long || rvalue instanceof Long)
				return new Long(((Number) lvalue).longValue()
						% ((Number) rvalue).longValue());
			else if (lvalue instanceof Number && rvalue instanceof Number)
				return new Integer(((Number) lvalue).intValue()
						% ((Number) rvalue).intValue());
			else
				throw newUnexpectedArgsException(lvalue, rvalue);
		}
	}

	/**
	 * Implements logical AND.
	 */
	public static class And extends BinaryOperator {
		public Object call(EvaluationContext ec, Object lvalue, Object rvalue)
				throws EvaluationException {
			if (null == lvalue || null == rvalue)
				return null;

			if (lvalue instanceof Boolean && rvalue instanceof Boolean)
				return (((Boolean) lvalue).booleanValue() && ((Boolean) rvalue)
						.booleanValue()) ? Boolean.TRUE : Boolean.FALSE;
			else
				throw newIncompatibleArgsException(lvalue, rvalue);
		}
	}

	/**
	 * Implements logical OR.
	 */
	public static class Or extends BinaryOperator {
		public Object call(EvaluationContext ec, Object lvalue, Object rvalue)
				throws EvaluationException {
			if (null == lvalue || null == rvalue)
				return null;

			if (lvalue instanceof Boolean && rvalue instanceof Boolean)
				return (((Boolean) lvalue).booleanValue() || ((Boolean) rvalue)
						.booleanValue()) ? Boolean.TRUE : Boolean.FALSE;
			else
				throw newIncompatibleArgsException(lvalue, rvalue);
		}
	}

	/**
	 * Implements greater-than.
	 * 
	 * This class respects the value of the EvaluationContext property
	 * {@link #ALLOW_NULL_COMPARISON}.
	 */
	public static class Greater extends BinaryOperator {
		public Object call(EvaluationContext ec, Object lvalue, Object rvalue)
				throws EvaluationException {
			if (Boolean.TRUE.equals(ec.getProperty(ALLOW_NULL_COMPARISON))) {
				if (null == lvalue || null == rvalue)
					return Boolean.FALSE;
			} else if (null == lvalue || null == rvalue)
				return null;

			if (lvalue instanceof Double || rvalue instanceof Double)
				return (((Number) lvalue).doubleValue() > ((Number) rvalue)
						.doubleValue()) ? Boolean.TRUE : Boolean.FALSE;
			else if (lvalue instanceof Float || rvalue instanceof Float)
				return (((Number) lvalue).floatValue() > ((Number) rvalue)
						.floatValue()) ? Boolean.TRUE : Boolean.FALSE;
			else if (lvalue instanceof Long || rvalue instanceof Long)
				return (((Number) lvalue).longValue() > ((Number) rvalue)
						.longValue()) ? Boolean.TRUE : Boolean.FALSE;
			else if (lvalue instanceof Number && rvalue instanceof Number)
				return (((Number) lvalue).intValue() > ((Number) rvalue)
						.intValue()) ? Boolean.TRUE : Boolean.FALSE;
			else if (lvalue instanceof Comparable
					&& rvalue instanceof Comparable
					&& lvalue.getClass().isAssignableFrom(rvalue.getClass()))
				return (+1 == ((Comparable) lvalue).compareTo(rvalue) ? Boolean.TRUE
						: Boolean.FALSE);
			else
				throw newIncompatibleArgsException(lvalue, rvalue);
		}
	}

	/**
	 * Implements less than.
	 * 
	 * This class respects the value of the EvaluationContext property
	 * {@link #ALLOW_NULL_COMPARISON}.
	 */
	public static class Less extends BinaryOperator {
		public Object call(EvaluationContext ec, Object lvalue, Object rvalue)
				throws EvaluationException {
			if (Boolean.TRUE.equals(ec.getProperty(ALLOW_NULL_COMPARISON))) {
				if (null == lvalue || null == rvalue)
					return Boolean.FALSE;
			} else if (null == lvalue || null == rvalue)
				return null;

			if (lvalue instanceof Double || rvalue instanceof Double)
				return (((Number) lvalue).doubleValue() < ((Number) rvalue)
						.doubleValue()) ? Boolean.TRUE : Boolean.FALSE;
			else if (lvalue instanceof Float || rvalue instanceof Float)
				return (((Number) lvalue).floatValue() < ((Number) rvalue)
						.floatValue()) ? Boolean.TRUE : Boolean.FALSE;
			else if (lvalue instanceof Long || rvalue instanceof Long)
				return (((Number) lvalue).longValue() < ((Number) rvalue)
						.longValue()) ? Boolean.TRUE : Boolean.FALSE;
			else if (lvalue instanceof Number && rvalue instanceof Number)
				return (((Number) lvalue).intValue() < ((Number) rvalue)
						.intValue()) ? Boolean.TRUE : Boolean.FALSE;
			else if (lvalue instanceof Comparable
					&& rvalue instanceof Comparable
					&& lvalue.getClass().isAssignableFrom(rvalue.getClass()))
				return (-1 == ((Comparable) lvalue).compareTo(rvalue) ? Boolean.TRUE
						: Boolean.FALSE);
			else
				throw newIncompatibleArgsException(lvalue, rvalue);
		}
	}

	/**
	 * Implements generic greater-than or equal to.
	 * 
	 * This class respects the value of the EvaluationContext property
	 * {@link #ALLOW_NULL_COMPARISON}.
	 */
	public static class GreaterEqual extends BinaryOperator {
		// TODO: Should I write this as !(less)?
		// If so, then NULL handling needs to be done in this class,
		// as well.
		public Object call(EvaluationContext ec, Object lvalue, Object rvalue)
				throws EvaluationException {
			if (Boolean.TRUE.equals(ec.getProperty(ALLOW_NULL_COMPARISON))) {
				// If they're both null, then they're equal ;
				// if one is null then they're unequal AND not greater-than...
				// ...right?
				if (null == lvalue || null == rvalue)
					return lvalue == rvalue ? Boolean.TRUE : Boolean.FALSE;
			} else if (null == lvalue || null == rvalue)
				return null;

			if (lvalue instanceof Double || rvalue instanceof Double)
				return (((Number) lvalue).doubleValue() >= ((Number) rvalue)
						.doubleValue()) ? Boolean.TRUE : Boolean.FALSE;
			else if (lvalue instanceof Float || rvalue instanceof Float)
				return (((Number) lvalue).floatValue() >= ((Number) rvalue)
						.floatValue()) ? Boolean.TRUE : Boolean.FALSE;
			else if (lvalue instanceof Long || rvalue instanceof Long)
				return (((Number) lvalue).longValue() >= ((Number) rvalue)
						.longValue()) ? Boolean.TRUE : Boolean.FALSE;
			else if (lvalue instanceof Number && rvalue instanceof Number)
				return (((Number) lvalue).intValue() >= ((Number) rvalue)
						.intValue()) ? Boolean.TRUE : Boolean.FALSE;
			else if (lvalue instanceof Comparable
					&& rvalue instanceof Comparable
					&& lvalue.getClass().isAssignableFrom(rvalue.getClass()))
				return (-1 < ((Comparable) lvalue).compareTo(rvalue) ? Boolean.TRUE
						: Boolean.FALSE);
			else
				throw newIncompatibleArgsException(lvalue, rvalue);
		}
	}

	/**
	 * Implements greater-than.
	 * 
	 * This class respects the value of the EvaluationContext property
	 * {@link #ALLOW_NULL_COMPARISON}.
	 */
	public static class LessEqual extends BinaryOperator {
		// TODO: Should I write this as !(greater)?
		// If so, then NULL handling needs to be done in this class,
		// as well.
		public Object call(EvaluationContext ec, Object lvalue, Object rvalue)
				throws EvaluationException {
			if (Boolean.TRUE.equals(ec.getProperty(ALLOW_NULL_COMPARISON))) {
				// If they're both null, then they're equal ;
				// if one is null then they're unequal AND not greater-than...
				// ...right?
				if (null == lvalue || null == rvalue)
					return lvalue == rvalue ? Boolean.TRUE : Boolean.FALSE;
			} else if (null == lvalue || null == rvalue)
				return null;

			if (lvalue instanceof Double || rvalue instanceof Double)
				return (((Number) lvalue).doubleValue() <= ((Number) rvalue)
						.doubleValue()) ? Boolean.TRUE : Boolean.FALSE;
			else if (lvalue instanceof Float || rvalue instanceof Float)
				return (((Number) lvalue).floatValue() <= ((Number) rvalue)
						.floatValue()) ? Boolean.TRUE : Boolean.FALSE;
			else if (lvalue instanceof Long || rvalue instanceof Long)
				return (((Number) lvalue).longValue() <= ((Number) rvalue)
						.longValue()) ? Boolean.TRUE : Boolean.FALSE;
			else if (lvalue instanceof Number && rvalue instanceof Number)
				return (((Number) lvalue).intValue() <= ((Number) rvalue)
						.intValue()) ? Boolean.TRUE : Boolean.FALSE;
			else if (lvalue instanceof Comparable
					&& rvalue instanceof Comparable
					&& lvalue.getClass().isAssignableFrom(rvalue.getClass()))
				return (1 > ((Comparable) lvalue).compareTo(rvalue) ? Boolean.TRUE
						: Boolean.FALSE);
			else
				throw newIncompatibleArgsException(lvalue, rvalue);
		}
	}

	/**
	 * Implements equals.
	 * 
	 * This class respects the value of the EvaluationContext property
	 * {@link #ALLOW_NULL_COMPARISON}.
	 */
	public static class Equal extends BinaryOperator {
		private static final double DELTA = 0.0001;

		public Object call(EvaluationContext ec, Object lvalue, Object rvalue)
				throws EvaluationException {
			if (Boolean.TRUE.equals(ec.getProperty(ALLOW_NULL_COMPARISON))) {
				// Duh (Note: this covers NULLs)
				if (lvalue == rvalue)
					return Boolean.TRUE;

				if (null == lvalue || null == rvalue)
					return Boolean.FALSE;
			} else // Bail-out NULL handling
			{
				if (null == lvalue || null == rvalue)
					return null;
			}

			// Numeric equality requires drastic measures
			if (lvalue instanceof Number && rvalue instanceof Number) {
				if (lvalue instanceof Double || rvalue instanceof Double)
					return (DELTA > (((Number) lvalue).doubleValue() - ((Number) rvalue)
							.doubleValue())) ? Boolean.TRUE : Boolean.FALSE;
				else if (lvalue instanceof Float || rvalue instanceof Float)
					return (DELTA > (((Number) lvalue).floatValue() - ((Number) rvalue)
							.floatValue())) ? Boolean.TRUE : Boolean.FALSE;
				else if (lvalue instanceof Long || rvalue instanceof Long)
					return (((Number) lvalue).longValue() == ((Number) rvalue)
							.longValue()) ? Boolean.TRUE : Boolean.FALSE;
				else
					return (((Number) lvalue).intValue() == ((Number) rvalue)
							.intValue()) ? Boolean.TRUE : Boolean.FALSE;
			} else
				return (lvalue.equals(rvalue)) ? Boolean.TRUE : Boolean.FALSE;
		}
	}

	/**
	 * Implements unequal.
	 * 
	 * This class respects the value of the EvaluationContext property
	 * {@link #ALLOW_NULL_COMPARISON}.
	 */
	public static class NotEqual extends Equal {
		public Object call(EvaluationContext ec, String functionName,
				Object[] args) throws EvaluationException {
			Boolean equal = (Boolean) super.call(ec, functionName, args);

			// Negate the result
			if (null == equal)
				return null;
			else
				return equal.booleanValue() ? Boolean.FALSE : Boolean.TRUE;
		}
	}

	private static EvaluationException newUnexpectedArgsException(Object lhs,
			Object rhs) {
		return new UnexpectedArgumentException("Unexpected argument types: "
				+ (null == lhs ? "<null>" : lhs.getClass().getName()) + ", "
				+ (null == rhs ? "<null>" : rhs.getClass().getName()));
	}

	private static EvaluationException newIncompatibleArgsException(Object lhs,
			Object rhs) {
		return new IncompatibleArgumentsException(null == lhs ? null : lhs
				.getClass(), null == rhs ? null : rhs.getClass());
	}

	public static class IncompatibleArgumentsException extends
			EvaluationException {
		public IncompatibleArgumentsException(Class a, Class b) {
			super("<" + (null == a ? "null" : a.getName()) + ", "
					+ (null == b ? "null" : b.getName()) + ">");
		}
	}
}
