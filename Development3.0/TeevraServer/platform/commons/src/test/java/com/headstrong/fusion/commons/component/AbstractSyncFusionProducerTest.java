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
 * $Id: AbstractSyncFusionProducerTest.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: May 4, 2010 
 */

package com.headstrong.fusion.commons.component;

import java.util.Stack;

import junit.framework.TestCase;

import com.headstrong.fusion.commons.ComponentEvent;
import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.commons.ProcessStateController;
import com.headstrong.fusion.commons.StateObserver;

/**
 * {@link AbstractSyncFusionProducer} test class.
 */
public class AbstractSyncFusionProducerTest extends TestCase {

	public void testRegisterObserver() throws Exception {
		AbstractSyncFusionProducer producer = new AbstractSyncFusionProducer() {
			@Override
			public void process(MessageExchange exchange) throws Exception {
			}

			@Override
			public void setServiceSupport(FusionServiceSupport serviceSupport) {
			}

			@Override
			public void start() throws Exception {
			}

			@Override
			public void stop() throws Exception {
			}

			@Override
			public String getComponentId() {
				return null;
			}

			@Override
			public void proceed() {
			}

		};
		ProcessStateControllerImpl controller = new ProcessStateControllerImpl();
		producer.setProcessStateController(controller);
		producer.registerObserver();
		assertEquals("registerEvent(stateObserver)", controller.methodCalls
				.pop());
	}

	public void testRegisterEvent() throws Exception {
		AbstractSyncFusionProducer producer = new AbstractSyncFusionProducer() {
			@Override
			public void process(MessageExchange exchange) throws Exception {
			}

			@Override
			public void setServiceSupport(FusionServiceSupport serviceSupport) {
			}

			@Override
			public void start() throws Exception {
			}

			@Override
			public void stop() throws Exception {
			}

			@Override
			public String getComponentId() {
				return null;
			}

			@Override
			public void proceed() {
			}

		};
		ProcessStateControllerImpl controller = new ProcessStateControllerImpl();
		producer.setProcessStateController(controller);
		producer.initialized();
		assertEquals("registerEvent(event)", controller.methodCalls.pop());
	}

	public void testGetProcessController() throws Exception {
		AbstractSyncFusionProducer producer = new AbstractSyncFusionProducer() {
			@Override
			public void process(MessageExchange exchange) throws Exception {
			}

			@Override
			public void setServiceSupport(FusionServiceSupport serviceSupport) {
			}

			@Override
			public void start() throws Exception {
			}

			@Override
			public void stop() throws Exception {
			}

			@Override
			public String getComponentId() {
				return null;
			}

			@Override
			public void proceed() {
			}

		};
		ProcessStateControllerImpl controller = new ProcessStateControllerImpl();
		producer.setProcessStateController(controller);
		assertEquals(controller, producer.getProcessStateController());

	}

	private static class ProcessStateControllerImpl implements
			ProcessStateController {
		public Stack<String> methodCalls = new Stack<String>();
		public Stack<Object> dataStack = new Stack<Object>();

		@Override
		public void clear() {
			methodCalls.push("clear()");
		}

		@Override
		public void registerEvent(ComponentEvent event) {
			methodCalls.push("registerEvent(event)");
			dataStack.push(event);
		}

		@Override
		public void registerStateObserver(StateObserver stateObserver) {
			methodCalls.push("registerEvent(stateObserver)");
			dataStack.push(stateObserver);
		}

		@Override
		public void registerByServiceId(String serviceId) {
			// TODO Auto-generated method stub
			
		}
	}
}
