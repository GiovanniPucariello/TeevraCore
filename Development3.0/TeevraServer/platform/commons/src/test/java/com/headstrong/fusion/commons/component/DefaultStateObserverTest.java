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
 * $Id: DefaultStateObserverTest.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: May 4, 2010 
 */

package com.headstrong.fusion.commons.component;

import java.util.Observable;
import java.util.Observer;
import java.util.Stack;

import junit.framework.TestCase;

/**
 * {@link DefaultStateObserver} test class.
 */
public class DefaultStateObserverTest extends TestCase {

	public void testUpdate() {
		SyncServiceImpl syncServiceImpl = new SyncServiceImpl("componentId");
		DefaultStateObserver observer = new DefaultStateObserver(
				syncServiceImpl);
		observer.update(new Observable() {
			@Override
			public synchronized void addObserver(Observer o) {
				// TODO Auto-generated method stub
				super.addObserver(o);
			}
		}, null);
		assertEquals("proceed", syncServiceImpl.methodCallStack.pop());
	}

	private static class SyncServiceImpl implements SyncService {
		private String componentId;
		public Stack<String> methodCallStack = new Stack<String>();

		public SyncServiceImpl(String componentId) {
			this.componentId = componentId;
		}

		@Override
		public String getComponentId() {
			return this.componentId;
		}

		@Override
		public void proceed() {
			methodCallStack.push("proceed");
		}
	}
}
