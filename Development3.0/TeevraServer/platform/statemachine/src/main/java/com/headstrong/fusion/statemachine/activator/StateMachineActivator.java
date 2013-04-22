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
 * $Id: StateMachineActivator.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Mar 10, 2009 
 */

package com.headstrong.fusion.statemachine.activator;

import java.util.Dictionary;
import java.util.Hashtable;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.FusionConstants;
import com.headstrong.fusion.commons.resolver.ServiceAliasManager;
import com.headstrong.fusion.statemachine.SCXMLStateMachineManager;
import com.headstrong.fusion.statemachine.StateMachineManager;

public class StateMachineActivator implements BundleActivator {
	/**
	 * State Machine Logger.
	 */
	private static final Logger logger = LoggerFactory
			.getLogger(StateMachineActivator.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		logger.info("Starting State Machine Bundle.");
		// Registering default state machine manager.
		StateMachineManager stateMachineManager = new SCXMLStateMachineManager(
				context);
		Dictionary<String, String> props = new Hashtable<String, String>();
		props.put(Constants.SERVICE_PID, StateMachineManager.class.getName());
		props.put(Constants.SERVICE_DESCRIPTION, "State Machine Manager");
		props.put(Constants.SERVICE_VENDOR, FusionConstants.VENDOR_NAME);
		logger.info("Registering service :"
				+ StateMachineManager.class.getName());
		// Register service with Apache Felix Context.
		context.registerService(StateMachineManager.class.getName(),
				stateMachineManager, props);
		// Registering service alias.
		logger.info("Registering service alias "
				+ StateMachineManager.class.getSimpleName() + " for service "
				+ StateMachineManager.class.getName());
		ServiceAliasManager.getInstance().registerServiceAlias(
				StateMachineManager.class.getSimpleName(),
				StateMachineManager.class.getName());

		/*		// register a dummy state machine
		 stateMachineManager
		 .registerStateMachine(
		 "1",
		 "<?xml version=\"1.0\"?> <scxml xmlns=\"http://www.w3.org/2005/07/scxml\" xmlns:custom=\"http://www.headstrong.com/teevra/action\" version=\"1.0\" 	   initialstate=\"init\" finalstate=\"end\"> 	<state id=\"init\"> 		<onentry> 			<log expr=\"'onentry action init'\" /> 		</onentry> 		<transition event=\"InitToMid\" target=\"end\"> 			<custom:service name=\"StartProcess\"> 				<properties> 					<property name=\"prop1\" value=\"value1\"/> 					<property name=\"prop2\" value=\"value2\"/> 					<property name=\"prop3\" value=\"value3\"/> 				</properties> 			</custom:service> 		</transition> 		<onexit> 			<log expr=\"'onexit action init'\" /> 		</onexit> 	</state> 	<state id=\"end\"> 		<onentry> 			<log expr=\"'onentry action end'\" /> 		</onentry> 	</state> </scxml> ",
		 "INIT");

		 stateMachineManager.triggerEvent("1", "InitToMid", "INIT - MID");*/
	}

	public void stop(BundleContext arg0) throws Exception {
		logger.info("Stopping State Machine Bundle.");
	}

}
