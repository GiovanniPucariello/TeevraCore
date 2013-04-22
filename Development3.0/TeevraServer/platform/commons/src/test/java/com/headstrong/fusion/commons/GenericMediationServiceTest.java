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
 * $Id: GenericMediationServiceTest.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: May 4, 2010 
 */

package com.headstrong.fusion.commons;

import java.util.Map;
import java.util.Stack;

import com.headstrong.fusion.commons.exception.ErrorContext;
import com.headstrong.fusion.commons.exception.ErrorHandler;
import com.headstrong.fusion.commons.exception.FusionException;

import junit.framework.TestCase;

/**
 * 
 */
public class GenericMediationServiceTest extends TestCase {

	public void testHandleErrorNoHandling() throws Exception {
		MethodStack stack = new MethodStack();
		DummyErrorHandler handler = new DummyErrorHandler(stack);
		GenericMediationService service = new GenericMediationService() {
			@Override
			public void process(MessageExchange exchange,
					ServiceConfig serviceConfig) throws FusionException {
				//
			}
		};

		service.handleError(handler, "processId", "serviceId", "errorType",
				"componentType", new Exception("Dummy"), "resource",
				"moreInfo", false, null);
		ErrorContext context = handler.getErrorContext();
		assertEquals("processId", context.getProcessId());
		assertEquals("serviceId", context.getServiceId());
		assertEquals("errorType", context.getType());
		assertEquals("componentType", context.getComponentType());
		assertEquals("Dummy", context.getCause().getMessage());
		assertEquals("resource", context.getResource());
		assertEquals("moreInfo", context.getMoreInfo());
		assertEquals("reportError(\"ErrorContext errorContext\")", stack.pop());
	}

	public void testHandleErrorWithoutProperties() throws Exception {
		MethodStack stack = new MethodStack();
		DummyErrorHandler handler = new DummyErrorHandler(stack);
		GenericMediationService service = new GenericMediationService() {
			@Override
			public void process(MessageExchange exchange,
					ServiceConfig serviceConfig) throws FusionException {
				//
			}
		};
		
		/**
		 * handleError(ErrorHandler errorHandler, String processId,
			String serviceId, String errorType, String componentType,
			Throwable cause, Object resource, String moreInfo,
			boolean stopExecution)
		 */
		service.handleError(handler, "processId", "serviceId", "errorType",
				"componentType", new Exception("Dummy"), "resource",
				"moreInfo", false);
		ErrorContext context = handler.getErrorContext();
		assertEquals("processId", context.getProcessId());
		assertEquals("serviceId", context.getServiceId());
		assertEquals("errorType", context.getType());
		assertEquals("componentType", context.getComponentType());
		assertEquals("Dummy", context.getCause().getMessage());
		assertEquals("resource", context.getResource());
		assertEquals("moreInfo", context.getMoreInfo());
		assertEquals("reportError(\"ErrorContext errorContext\")", stack.pop());
	}
	
	
	public void testHandleErrorWithoutExecutionParam() throws Exception {
		MethodStack stack = new MethodStack();
		DummyErrorHandler handler = new DummyErrorHandler(stack);
		GenericMediationService service = new GenericMediationService() {
			@Override
			public void process(MessageExchange exchange,
					ServiceConfig serviceConfig) throws FusionException {
				//
			}
		};
		
		/**
		 * handleError(ErrorHandler errorHandler, String processId,
			String serviceId, String errorType, String componentType,
			Throwable cause, Object resource, String moreInfo)
		 */
		service.handleError(handler, "processId", "serviceId", "errorType",
				"componentType", new Exception("Dummy"), "resource",
				"moreInfo");
		ErrorContext context = handler.getErrorContext();
		assertEquals("processId", context.getProcessId());
		assertEquals("serviceId", context.getServiceId());
		assertEquals("errorType", context.getType());
		assertEquals("componentType", context.getComponentType());
		assertEquals("Dummy", context.getCause().getMessage());
		assertEquals("resource", context.getResource());
		assertEquals("moreInfo", context.getMoreInfo());
		assertEquals("reportError(\"ErrorContext errorContext\")", stack.pop());
	}
	
	public void testHandleErrorWithoutExecutionParamAndWithProps() throws Exception {
		MethodStack stack = new MethodStack();
		DummyErrorHandler handler = new DummyErrorHandler(stack);
		GenericMediationService service = new GenericMediationService() {
			@Override
			public void process(MessageExchange exchange,
					ServiceConfig serviceConfig) throws FusionException {
				//
			}
		};
		
		/**
		 *handleError(ErrorHandler errorHandler, String processId,
			String serviceId, String errorType, String componentType,
			Throwable cause, Object resource, String moreInfo,
			Map<String, String> properties)
		 */
		service.handleError(handler, "processId", "serviceId", "errorType",
				"componentType", new Exception("Dummy"), "resource",
				"moreInfo",null);
		ErrorContext context = handler.getErrorContext();
		assertEquals("processId", context.getProcessId());
		assertEquals("serviceId", context.getServiceId());
		assertEquals("errorType", context.getType());
		assertEquals("componentType", context.getComponentType());
		assertEquals("Dummy", context.getCause().getMessage());
		assertEquals("resource", context.getResource());
		assertEquals("moreInfo", context.getMoreInfo());
		assertEquals("reportError(\"ErrorContext errorContext\")", stack.pop());
	}
	
	public void testHandleErrorWithFixmlVersion() throws Exception {
		MethodStack stack = new MethodStack();
		DummyErrorHandler handler = new DummyErrorHandler(stack);
		GenericMediationService service = new GenericMediationService() {
			@Override
			public void process(MessageExchange exchange,
					ServiceConfig serviceConfig) throws FusionException {
				//
			}
		};
		
		/**
		 *handleError(ErrorHandler errorHandler, String processId,
			String serviceId, String errorType, String componentType,
			Throwable cause, Object resource, String moreInfo,
			Map<String, String> properties,String fixmlVersion)
		 */
		service.handleError(handler, "processId", "serviceId", "errorType",
				"componentType", new Exception("Dummy"), "resource",
				"moreInfo",null,"sp2");
		ErrorContext context = handler.getErrorContext();
		assertEquals("processId", context.getProcessId());
		assertEquals("serviceId", context.getServiceId());
		assertEquals("errorType", context.getType());
		assertEquals("componentType", context.getComponentType());
		assertEquals("Dummy", context.getCause().getMessage());
		assertEquals("resource", context.getResource());
		assertEquals("moreInfo", context.getMoreInfo());
		assertEquals("reportError(\"ErrorContext errorContext\")", stack.pop());
	}
	
	
	private static class MethodStack {
		Stack<String> methodStack = new Stack<String>();

		public void push(String s) {
			methodStack.push(s);
		}

		public String pop() {
			return methodStack.pop();
		}
	}

	private static class DummyErrorHandler implements ErrorHandler {
		private ErrorContext errorContext;
		private MethodStack methodStack;

		public DummyErrorHandler(MethodStack methodStack) {
			this.methodStack = methodStack;
		}

		@Override
		public void initContext(MessageExchange exchange) {
		}

		@Override
		public boolean isToContinue() {
			return false;
		}

		@Override
		public void reportError(ErrorContext errorContext)
				throws FusionException {
			this.methodStack.push("reportError(\"ErrorContext errorContext\")");
			this.errorContext = errorContext;
		}

		@Override
		public void reportError(ErrorContext errorContext, boolean handle)
				throws FusionException {
			this.methodStack
					.push("reportError(\"ErrorContext errorContext\",\"boolean handle\")");
			this.reportError(errorContext);
		}

		@Override
		public void reportError(ErrorContext errorContext,
				boolean reportToRecovery, boolean handle)
				throws FusionException {
			this.methodStack
					.push("reportError(\"ErrorContext errorContext\",\"boolean reportToRecovery\",\"boolean handle\")");
			this.reportError(errorContext);
		}

		@Override
		public void resetContext() {
			// TODO Auto-generated method stub

		}

		public ErrorContext getErrorContext() {
			return errorContext;
		}

		public void setErrorContext(ErrorContext errorContext) {
			this.errorContext = errorContext;
		}
	}
}
