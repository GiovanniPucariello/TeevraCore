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
 * $Id: ExpressionVisitor.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jun 17, 2009 
 */

package com.headstrong.fusion.commons.expression.evaluator;

/**
 * An interface for classes implementing the visitor pattern for
 * processing entire expression trees.
 *
 */
public interface ExpressionVisitor {
	public void visitBinaryOperatorExpression(BinaryOperatorExpression exp);

	public void visitFunctionCallExpression(FunctionCallExpression exp);

	public void visitNegatedExpression(NegatedExpression exp);

	public void visitConstantExpression(ConstantExpression exp);

	public void visitIdentifierExpression(IdentifierExpression exp);

	public void visitUnaryMinusExpression(UnaryMinusExpression exp);

	public void visitArrayReferenceExpression(ArrayReferenceExpression exp);
}
