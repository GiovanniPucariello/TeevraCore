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
 * $Id: DefaultProcessStateControllerTest.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: May 12, 2010 
 */

package com.headstrong.fusion.core;

import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.replay;

import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

import junit.framework.TestCase;

import com.headstrong.fusion.commons.ComponentEvent;
import com.headstrong.fusion.commons.StateObserver;
import com.headstrong.fusion.commons.ComponentEvent.Event;
import com.headstrong.fusion.commons.component.SyncService;

/**
 * {@link DefaultProcessStateController} unit test class.
 */
public class DefaultProcessStateControllerTest extends TestCase {

	public void testRegistered() throws Exception {
		ProcessContext processContext = createMock(ProcessContext.class);
		// replay behaviour
		replay(processContext);
		DefaultProcessStateController processStateController = new DefaultProcessStateController(
				processContext);
		processStateController.registerStateObserver(new StateObserverImpl(
				"comp1"));
		assertEquals(1, processStateController.countObservers());
	}

	public void testInitialized() throws Exception {
		ProcessContext processContext = createMock(ProcessContext.class);
		// replay behaviour
		replay(processContext);
		DefaultProcessStateController processStateController = new DefaultProcessStateController(
				processContext);
		processStateController.registerStateObserver(new StateObserverImpl(
				"comp1"));
		processStateController.registerStateObserver(new StateObserverImpl(
				"comp2"));
		processStateController.registerEvent(new ComponentEvent("comp1",
				Event.INITIALIZED));
		processStateController.registerEvent(new ComponentEvent("comp2",
				Event.INITIALIZED));

		assertTrue(Notifier.getInstance().getNotfications().containsKey(
				"comp1-update"));
		assertTrue(Notifier.getInstance().getNotfications().containsKey(
				"comp2-update"));
	}

	private static class StateObserverImpl implements StateObserver {
		private SyncService syncService;

		public StateObserverImpl(String componentId) {
			this.syncService = new SyncServiceImpl(componentId);
		}

		@Override
		public SyncService getService() {
			return this.syncService;
		}

		@Override
		public void update(Observable o, Object arg) {
			Notifier.getInstance().addNotification(
					this.syncService.getComponentId() + "-update", arg);
		}

		private static class SyncServiceImpl implements SyncService {
			private String componentId;

			public SyncServiceImpl(String componentId) {
				this.componentId = componentId;
			}

			@Override
			public String getComponentId() {
				return this.componentId;
			}

			@Override
			public void proceed() {
				// TODO Auto-generated method stub
			}
		}
	}

	private static class Notifier {
		private static Notifier notifier;
		private Map<String, Object> notfications;

		private Notifier() {
			notfications = new HashMap<String, Object>();
		}

		public static Notifier getInstance() {
			synchronized (Notifier.class) {
				if (notifier == null) {
					notifier = new Notifier();
				}
			}
			return notifier;
		}

		public Map<String, Object> getNotfications() {
			return notfications;
		}

		public void setNotfications(Map<String, Object> notfications) {
			this.notfications = notfications;
		}

		public void addNotification(String key, Object value) {
			notfications.put(key, value);
		}

		public Object getNotification(String key) {
			return notfications.get(key);
		}
	}
}
