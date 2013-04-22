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
 * $Id: PrimitiveArrayList.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jun 17, 2009 
 */

package com.headstrong.fusion.commons.expression.evaluator.util;

import java.lang.reflect.Array;
import java.util.AbstractList;

/**
 * A class that wraps a primitive array with a Collection interface.
 */
@SuppressWarnings("unchecked")
public class PrimitiveArrayList extends AbstractList {

	private Object array;

	public PrimitiveArrayList(Object array) {
		this.array = array;
	}

	public Object get(int index) {
		return Array.get(array, index);
	}

	public int size() {
		return Array.getLength(array);
	}
}
