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
 * $Id: LambdaFunction.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jun 17, 2009 
 */

package com.headstrong.fusion.commons.expression.evaluator.function;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.headstrong.fusion.bo.impl.exception.InvalidAttributeExpressionException;
import com.headstrong.fusion.commons.expression.evaluator.EvaluationContext;
import com.headstrong.fusion.commons.expression.evaluator.EvaluationException;
import com.headstrong.fusion.commons.expression.evaluator.Expression;
import com.headstrong.fusion.commons.expression.evaluator.Function;
import com.headstrong.fusion.commons.expression.evaluator.FunctionCallExpression;
import com.headstrong.fusion.commons.expression.evaluator.IdentifierExpression;
import com.headstrong.fusion.commons.expression.evaluator.StandardFunction;
import com.headstrong.fusion.commons.expression.evaluator.util.ChainedEvaluationContext;
import com.headstrong.fusion.commons.expression.evaluator.util.DefaultEvaluationContext;

/**
 * <p>
 *    Creates an executable closure.
 * </p>
 *
 * <p>
 *   Usage: (lambda (arg1 arg2...) (exp1 exp2 exp3))
 * </p>
 *
 * <p>
 *    Returns the value of the last expression executed.
 * </p>
 *
 */
public class LambdaFunction implements Function {
	public Object call(EvaluationContext ec, String functionName,
			List argumentExpressions) throws EvaluationException {
		if (null == argumentExpressions || 2 != argumentExpressions.size())
			throw new EvaluationException("Expected 2 arguments, got "
					+ (null == argumentExpressions ? "0" : String
							.valueOf(argumentExpressions.size())));

		Expression formalsExpression = (Expression) argumentExpressions.get(0);
		ArrayList formals;
		if (formalsExpression instanceof FunctionCallExpression) {
			formals = new ArrayList();
			// FuntionExpression is actually the first argument
			formals.add(((FunctionCallExpression) formalsExpression)
					.getFunctionExpression());
			List args = ((FunctionCallExpression) formalsExpression)
					.getArgumentExpressions();
			if (null != args)
				formals.addAll(args);
		} else
			throw new EvaluationException(
					"Formals must be a FunctionCallExpression (for now).");

		// Put a completely independent EvaluationContext into the Closure
		// to preserve it's view of the world.
		return new Closure(this.clone(ec), formals,
				(Expression) argumentExpressions.get(1));
	}

	private EvaluationContext clone(EvaluationContext e) {
		EvaluationContext ec = new DefaultEvaluationContext();

		// What do we do about properties?
		Map values = e.getAll();

		for (Iterator i = values.entrySet().iterator(); i.hasNext();) {
			Map.Entry entry = (Map.Entry) i.next();

			ec.set((String) entry.getKey(), entry.getValue());
		}

		return ec;
	}

	/*
	 (set lambda (create "net.christopherschultz.evaluator.function.LambdaFunction"))
	 (lambda (a b) (+ a b))

	 (set compose (lambda (f g) (lambda (x) (f (g x)))))
	 (set foo (compose toRadians toDegrees))


	 set(lambda, create("net.christopherschultz.evaluator.function.LambdaFunction"))
	 set(compose, lambda(f(g), lambda(x(), f(g(x)))))

	 */
	// =======================================
	// =======================================
	// =======================================
	private static class Closure implements Function {
		private static final String[] EMPTY_FORMALS = new String[0];

		private String[] _formals;
		private Expression _bodyExpression;
		private EvaluationContext _context;

		public Closure(EvaluationContext context, List formalExpressions,
				Expression bodyExpression) throws EvaluationException {
			_context = context;
			_formals = getFormals(formalExpressions);
			_bodyExpression = bodyExpression;
		}

		private String[] getFormals(List formalExpressions)
				throws EvaluationException {
			if (null == formalExpressions || 0 == formalExpressions.size())
				return EMPTY_FORMALS;

			String[] formals = new String[formalExpressions.size()];

			int j = 0;
			for (Iterator i = formalExpressions.iterator(); i.hasNext(); ++j) {
				Expression formal = (Expression) i.next();

				if (formal instanceof IdentifierExpression)
					formals[j] = ((IdentifierExpression) formal).getSymbol();
				else
					throw new EvaluationException("Formal must be a symbol: "
							+ formal);
			}

			return formals;
		}

		public Object call(EvaluationContext ec, String functionName,
				List argumentExpressions) throws EvaluationException, InvalidAttributeExpressionException {
			// First, the number of arguments passed-in should match the number
			// of formals established at creation time.
			int argumentCount;

			if (null == argumentExpressions)
				argumentCount = 0;
			else
				argumentCount = argumentExpressions.size();

			if (argumentCount != _formals.length)
				throw new EvaluationException("Expected " + _formals.length
						+ " arguments, got " + argumentCount);

			// Now, bind each formal name to the value passed-in by the
			// caller. Bind them in a nested context so we don't pollute
			// the main context.
			ChainedEvaluationContext local = new ChainedEvaluationContext(
					_context);

			for (int i = 0; i < _formals.length; ++i) {
				Object argValue = StandardFunction.getExpressionValue(ec,
						argumentExpressions.get(i));

				local.set(_formals[i], argValue);
			}

			// Finally, execute the body expression.
			if (null == _bodyExpression)
				return null;
			else
				return _bodyExpression.evaluate(local);
		}

		public String toString() {
			return java.util.Arrays.asList(_formals) + ":" + _bodyExpression;
		}
	}
}
