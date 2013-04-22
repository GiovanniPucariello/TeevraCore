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
 * $Id: StateMachineServiceImpl.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Mar 17, 2009 
 */

package com.headstrong.fusion.services.statemachine;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.bo.BusinessObject;
import com.headstrong.fusion.bo.impl.exception.InvalidAttributeExpressionException;
import com.headstrong.fusion.commons.GenericMediationService;
import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.commons.ServiceConfig;
import com.headstrong.fusion.commons.exception.FusionException;
import com.headstrong.fusion.commons.resolver.ServiceAliasManager;
import com.headstrong.fusion.commons.resolver.exception.ServiceUnavailableException;
import com.headstrong.fusion.services.statemachine.cache.StateMachineModelCache;
import com.headstrong.fusion.statemachine.StateMachineManager;
import com.headstrong.fusion.statemachine.exception.StateMachineException;

/**
 * State Machine service implementation.
 * 
 */
public class StateMachineServiceImpl extends GenericMediationService implements
		StateMachineService {

	private static final Logger logger = LoggerFactory
			.getLogger(StateMachineServiceImpl.class);
	private static final StateMachineModelCache stateMachineModelCache = StateMachineModelCache
			.getInstance();

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.MediationService#process(com.headstrong.fusion.commons.MessageExchange,
	 *      com.headstrong.fusion.commons.ServiceConfig)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void process(MessageExchange exchange, ServiceConfig config)
			throws FusionException, InvalidAttributeExpressionException {
		String event = (String) config.getProperty(EVENT);
		Object message = exchange.getIn().getBody();
		if (logger.isDebugEnabled()) {
			logger
					.debug("Message received for processing by "
							+ config.getProcessId() + " service "
							+ config.getServiceId() + ",  Message is {"
							+ message + "}");
		}

		if (message != null) {
			if (event != null && !event.trim().isEmpty()) {
				if (EVENT_TYPE_CREATE.equals(event)) {
					String stateModelId = (String) config
							.getProperty(STATE_MODEL_ID);
					try {
						if (message instanceof List) {
							this.createStateMachine(stateModelId,
									(List<BusinessObject>) message);
						} else {
							this.createStateMachine(stateModelId,
									(BusinessObject) message);
						}
					} catch (StateMachineException e) {
						logger.error("Error creating state machine.", e);
						throw new FusionException(
								"Error creating state machine.", e);
					}
				} else {
					try {
						if (message instanceof List) {
							this.triggerEvent(event,
									(List<BusinessObject>) message);
						} else {
							this.triggerEvent(event, (BusinessObject) message);
						}
					} catch (StateMachineException e) {
						logger.error(
								"Error generating event on state machine.", e);
						throw new FusionException(
								"Error generating event on state machine.", e);
					}
				}
			} else {
				throw new FusionException(
						"Invalid configuration, Event Name not provided for process id "
								+ config.getProcessId() + " service id "
								+ config.getServiceId());
			}
		}
	}

	/**
	 * Triggers an Event on the state machine related to that message.
	 * 
	 * @param event
	 *            Event Name
	 * @param message
	 *            Business Object
	 * @throws ServiceUnavailableException
	 * @throws StateMachineException
	 * @throws InvalidAttributeExpressionException 
	 */
	private void triggerEvent(String event, BusinessObject message)
			throws ServiceUnavailableException, StateMachineException, InvalidAttributeExpressionException {
		StateMachineManager manager = (StateMachineManager) ServiceAliasManager
				.getInstance().getServiceByAlias(
						StateMachineManager.class.getSimpleName(), 0);
		manager.triggerEvent(StateMachineIdGenerator
				.generateStateMachineId(message), event, message.toXml());
	}

	/**
	 * Triggers an Event on state machine for list of business objects.
	 * 
	 * @param eventName
	 * @throws ServiceUnavailableException
	 * @throws StateMachineException
	 * @throws InvalidAttributeExpressionException 
	 */
	private void triggerEvent(String event, List<BusinessObject> messages)
			throws ServiceUnavailableException, StateMachineException, InvalidAttributeExpressionException {
		for (BusinessObject message : messages) {
			this.triggerEvent(event, message);
		}
	}

	/**
	 * 
	 * @precondition
	 * @postcondition
	 * @param modelId
	 * @param message
	 * @throws ServiceUnavailableException
	 * @throws StateMachineException
	 * @throws InvalidAttributeExpressionException 
	 */
	private void createStateMachine(String modelId, BusinessObject message)
			throws ServiceUnavailableException, StateMachineException, InvalidAttributeExpressionException {
		StateMachineManager manager = (StateMachineManager) ServiceAliasManager
				.getInstance().getServiceByAlias(
						StateMachineManager.class.getSimpleName(), 0);
		String stateModel = stateMachineModelCache
				.getStateMachineModel(modelId);
		manager.registerStateMachine(StateMachineIdGenerator
				.generateStateMachineId(message), stateModel, message.toXml());
	}

	/**
	 * 
	 * @precondition
	 * @postcondition
	 * @param modelId
	 * @param message
	 * @throws ServiceUnavailableException
	 * @throws StateMachineException
	 * @throws InvalidAttributeExpressionException 
	 */
	private void createStateMachine(String modelId,
			List<BusinessObject> messages) throws ServiceUnavailableException,
			StateMachineException, InvalidAttributeExpressionException {
		for (BusinessObject message : messages) {
			this.createStateMachine(modelId, message);
		}
	}
}
