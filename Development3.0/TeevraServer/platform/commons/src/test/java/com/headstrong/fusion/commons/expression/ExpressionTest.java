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
 * $Id: ExpressionTest.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jun 17, 2009 
 */

package com.headstrong.fusion.commons.expression;

import java.util.HashMap;
import java.util.Map;

import junit.framework.TestCase;

import com.headstrong.fusion.bo.BusinessObject;
import com.headstrong.fusion.bo.BusinessObjectFactory;
import com.headstrong.fusion.bo.BusinessObjectFactory.Type;
import com.headstrong.fusion.commons.expression.evaluator.EvaluationContext;
import com.headstrong.fusion.commons.expression.evaluator.Expression;
import com.headstrong.fusion.commons.expression.evaluator.parser.ExpressionParser;
import com.headstrong.fusion.commons.expression.evaluator.util.DefaultEvaluationContext;

/**
 * 
 */
public class ExpressionTest extends TestCase {

	public void testSimpleExpression() throws Exception {
		String line = "5 + 9";
		ExpressionParser parser = new ExpressionParser();
		EvaluationContext ctx = new DefaultEvaluationContext();
		Expression exp = parser.parse(line);
		Object result = exp.evaluate(ctx);
		assertEquals(14, result);
	}

	public void testBusinessObjectExpression() throws Exception {
		BusinessObject bo = BusinessObjectFactory
				.getBusinessObject(Type.Dynamic);
		bo.setValue("attribute", new Integer(10));
		String line = "$attribute = 10";
		ExpressionParser parser = new ExpressionParser();
		EvaluationContext ctx = new DefaultEvaluationContext();
		ctx.set(EvaluationContext.BUSINESS_OBJECT, bo);
		Expression exp = parser.parse(line);
		Object result = exp.evaluate(ctx);
		assertEquals(true, result);
	}

	public void testBusinessObjectExpressionStringComparison() throws Exception {
		BusinessObject bo = BusinessObjectFactory
				.getBusinessObject(Type.Dynamic);
		bo.setValue("attribute", "sample");
		String line = "$attribute = \"sample\"";
		ExpressionParser parser = new ExpressionParser();
		EvaluationContext ctx = new DefaultEvaluationContext();
		ctx.set(EvaluationContext.BUSINESS_OBJECT, bo);
		Expression exp = parser.parse(line);
		Object result = exp.evaluate(ctx);
		assertEquals(true, result);
	}

	public void testBusinessObjectExpressionHeader() throws Exception {
		BusinessObject bo = BusinessObjectFactory
				.getBusinessObject(Type.Dynamic);
		bo.setValue("attribute", "body");
		Map<String, Object> header = new HashMap<String, Object>();
		header.put("header", "header");
		String line = "$attribute = \"body\" && $header = \"header\" ";

		ExpressionParser parser = new ExpressionParser();
		EvaluationContext ctx = new DefaultEvaluationContext();
		ctx.set(EvaluationContext.BUSINESS_OBJECT, bo);
		ctx.set(EvaluationContext.HEADER, header);

		Expression exp = parser.parse(line);
		Object result = exp.evaluate(ctx);
		assertEquals(true, result);
	}

	public void testBusinessObjectExpressionHeaderFalse() throws Exception {
		BusinessObject bo = BusinessObjectFactory
				.getBusinessObject(Type.Dynamic);
		bo.setValue("attribute", "body");
		Map<String, Object> header = new HashMap<String, Object>();
		header.put("header", "header");
		String line = "$attribute = \"bodyx\" && $header = \"header\" ";

		ExpressionParser parser = new ExpressionParser();
		EvaluationContext ctx = new DefaultEvaluationContext();
		ctx.set(EvaluationContext.BUSINESS_OBJECT, bo);
		ctx.set(EvaluationContext.HEADER, header);

		Expression exp = parser.parse(line);
		Object result = exp.evaluate(ctx);
		assertEquals(false, result);
	}

	public void testBusinessObjectExpressionHeaderNonString() throws Exception {
		BusinessObject bo = BusinessObjectFactory
				.getBusinessObject(Type.Dynamic);
		bo.setValue("attribute", "body");
		Map<String, Object> header = new HashMap<String, Object>();
		header.put("header", new Integer(1));
		String line = "$attribute = \"body\" && $header = 1";

		ExpressionParser parser = new ExpressionParser();
		EvaluationContext ctx = new DefaultEvaluationContext();
		ctx.set(EvaluationContext.BUSINESS_OBJECT, bo);
		ctx.set(EvaluationContext.HEADER, header);

		Expression exp = parser.parse(line);
		Object result = exp.evaluate(ctx);
		assertEquals(true, result);
	}

	public void testBusinessObjectGreaterThan() throws Exception {
		BusinessObject bo = BusinessObjectFactory
				.getBusinessObject(Type.Dynamic);
		bo.setValue("attribute", new Integer(5));
		String line = "$attribute > 10";

		ExpressionParser parser = new ExpressionParser();
		EvaluationContext ctx = new DefaultEvaluationContext();
		ctx.set(EvaluationContext.BUSINESS_OBJECT, bo);
		Expression exp = parser.parse(line);
		Object result = exp.evaluate(ctx);
		assertEquals(false, result);
	}

	public void testBusinessObjectLessThan() throws Exception {
		BusinessObject bo = BusinessObjectFactory
				.getBusinessObject(Type.Dynamic);
		bo.setValue("attribute", new Integer(5));
		String line = "$attribute < 10";

		ExpressionParser parser = new ExpressionParser();
		EvaluationContext ctx = new DefaultEvaluationContext();
		ctx.set(EvaluationContext.BUSINESS_OBJECT, bo);
		Expression exp = parser.parse(line);
		Object result = exp.evaluate(ctx);
		assertEquals(true, result);
	}

	public void testBusinessObjectOr() throws Exception {
		BusinessObject bo = BusinessObjectFactory
				.getBusinessObject(Type.Dynamic);
		bo.setValue("attribute", new Integer(5));
		String line = "$attribute = 1 || $attribute > 3";

		ExpressionParser parser = new ExpressionParser();
		EvaluationContext ctx = new DefaultEvaluationContext();
		ctx.set(EvaluationContext.BUSINESS_OBJECT, bo);
		Expression exp = parser.parse(line);
		Object result = exp.evaluate(ctx);
		assertEquals(true, result);
	}

	public void testBusinessObjectOrNegative() throws Exception {
		BusinessObject bo = BusinessObjectFactory
				.getBusinessObject(Type.Dynamic);
		bo.setValue("attribute", new Integer(5));
		String line = "$attribute = 1 || $attribute > 8";

		ExpressionParser parser = new ExpressionParser();
		EvaluationContext ctx = new DefaultEvaluationContext();
		ctx.set(EvaluationContext.BUSINESS_OBJECT, bo);
		Expression exp = parser.parse(line);
		Object result = exp.evaluate(ctx);
		assertEquals(false, result);
	}

	public void testBusinessObjectDummy() throws Exception {
		BusinessObject bo = BusinessObjectFactory
				.getBusinessObject(Type.Dynamic);
		bo.setValue("attribute", new Integer(5));
		Map<String, Object> header = new HashMap<String, Object>();
		header.put("header", new Integer(2));

		String line = "$attribute  * $header";
		ExpressionParser parser = new ExpressionParser();
		EvaluationContext ctx = new DefaultEvaluationContext();
		ctx.set(EvaluationContext.BUSINESS_OBJECT, bo);
		ctx.set(EvaluationContext.HEADER, header);
		Expression exp = parser.parse(line);
		Object result = exp.evaluate(ctx);
		assertEquals(10, result);
	}
}
