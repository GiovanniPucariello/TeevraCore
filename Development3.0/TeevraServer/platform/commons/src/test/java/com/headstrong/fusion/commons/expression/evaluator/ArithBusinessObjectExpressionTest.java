package com.headstrong.fusion.commons.expression.evaluator;

import junit.framework.TestCase;

import com.headstrong.fusion.bo.BusinessObject;
import com.headstrong.fusion.bo.dyn.DynamicBusinessObject;
import com.headstrong.fusion.commons.expression.evaluator.util.DefaultEvaluationContext;

public class ArithBusinessObjectExpressionTest extends TestCase {

	private ArithBusinessObjectExpression arithBusinessObjectExpression = null;

	public void testEvaluate() throws Exception {
		BusinessObject bo = new DynamicBusinessObject();
		bo.setValue("a", 10);
		arithBusinessObjectExpression = new ArithBusinessObjectExpression("$a");
		EvaluationContext ec = new DefaultEvaluationContext();
		ec.set(EvaluationContext.BUSINESS_OBJECT, bo);
		assertEquals(new Double(10), arithBusinessObjectExpression.evaluate(ec));
	}

	public void testToString() throws Exception {
		arithBusinessObjectExpression = new ArithBusinessObjectExpression("$a");
		assertEquals("<a>", arithBusinessObjectExpression.toString());
	}

}