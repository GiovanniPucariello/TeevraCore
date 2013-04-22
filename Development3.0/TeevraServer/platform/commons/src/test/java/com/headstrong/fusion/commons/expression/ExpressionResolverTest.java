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
 * $Id: ExpressionResolverTest.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jun 15, 2009 
 */

package com.headstrong.fusion.commons.expression;

import junit.framework.TestCase;

import org.apache.commons.jexl.ExpressionFactory;
import org.apache.commons.jexl.JexlContext;
import org.apache.commons.jexl.JexlHelper;

/**
 * 
 */
public class ExpressionResolverTest extends TestCase {

	public void testResolver() throws Exception {
		String calculateTax = "((G1 + G2 + G3) * 0.1) + G4";
		org.apache.commons.jexl.Expression e = ExpressionFactory
				.createExpression(calculateTax);

		// populate the context
		JexlContext context = JexlHelper.createContext();
		context.getVars().put("G1", 1);
		context.getVars().put("G2", 2);
		context.getVars().put("G3", 4);
		context.getVars().put("G4", 5);
		// work it out
		Double result = (Double) e.evaluate(context);
		System.out.println(result);
	}

}
