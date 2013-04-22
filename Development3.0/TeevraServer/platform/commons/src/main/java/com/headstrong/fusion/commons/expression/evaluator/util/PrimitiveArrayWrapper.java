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
 * $Id: PrimitiveArrayWrapper.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jun 17, 2009 
 */

package com.headstrong.fusion.commons.expression.evaluator.util;

import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Iterator;

/**
 * A class that wraps a primitive array with a Collection interface.
 */
public class PrimitiveArrayWrapper extends AbstractCollection<Object> {
	private Object array;

	public PrimitiveArrayWrapper(Object array) {
		this.array = array;
	}

	@SuppressWarnings("unchecked")
	public Iterator iterator() {
		return new ArrayIterator(array);
	}

	public int size() {
		return Array.getLength(array);
	}

	@SuppressWarnings("unchecked")
	private static class ArrayIterator implements Iterator {
		private Object array;
		private int current;
		private int size;

		public ArrayIterator(Object array) {
			this.array = array;
			size = Array.getLength(array);
			current = 0;
		}

		public boolean hasNext() {
			return current < size;
		}

		public Object next() {
			if (!this.hasNext())
				throw new java.util.NoSuchElementException();

			return Array.get(array, current++);
		}

		public void remove() {
			throw new UnsupportedOperationException();
		}
	}
}
