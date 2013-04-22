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
 * $Id: DefaultErrorHandler.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: May 20, 2009 
 */

package com.headstrong.fusion.messaging.error;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.camel.Endpoint;
import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.impl.DefaultExchange;
import org.apache.camel.impl.DefaultMessage;
import org.apache.camel.impl.DefaultProducerTemplate;
import org.apache.camel.processor.DeadLetterChannel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.ErrorFormatter;
import com.headstrong.fusion.commons.FusionConstants;
import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.commons.NormalizedMessage;
import com.headstrong.fusion.commons.exception.ErrorContext;
import com.headstrong.fusion.commons.exception.ErrorHandler;
import com.headstrong.fusion.commons.exception.FusionException;
import com.headstrong.fusion.commons.exception.HandledException;
import com.headstrong.fusion.config.ErrorHandlingStrategyConfig;
import com.headstrong.fusion.config.ErrorReportingConfig;
import com.headstrong.fusion.config.OnErrorConfig;
import com.headstrong.fusion.core.CamelProcessContext;
import com.headstrong.fusion.core.ProcessContext;
import com.headstrong.fusion.eventlogger.EventLogger;
import com.headstrong.fusion.eventlogger.beans.ComponentEventLogBean;
import com.headstrong.fusion.eventlogger.factory.EventLoggerFactory;
import com.headstrong.fusion.messaging.error.formatter.ErrorContextFormatter;
import com.headstrong.fusion.messaging.error.formatter.ErrorFormatterFactory;
import com.headstrong.fusion.messaging.error.formatter.XmlErrorFormatter;
import com.headstrong.fusion.messaging.service.ErrorExchangeProcessor;

/**
 * Default Error Handler implementation.
 * 
 */
public class DefaultErrorHandler implements ErrorHandler {

	private static final Logger logger = LoggerFactory
			.getLogger(DefaultErrorHandler.class);
	/**
	 * Camel process Context.
	 */
	private CamelProcessContext processContext;
	/**
	 * Map of Error configuration with Exception Type as the keys.
	 */
	private Map<String, OnErrorConfig> onErrorConfigMap;
	/**
	 * Producer template to send Error Messages to Input queue of the Error
	 * Reporters.
	 */
	private ProducerTemplate producerTemplate;

	/**
	 * For each batch run context information is reset. All strategies set the
	 * error information for the batch in the context object. Strategies don't
	 * store the information locally as same has to reset after each run.
	 */
	private Map<String, Object> context;

	private static final String EXCHANGE = "EXCHANGE";

	private ErrorExchangeProcessor errorExchangeProcessor = new ErrorExchangeProcessor();
	private boolean toContinue = true;
	private boolean isProducerTemplateOn = false;

	/**
	 * @param processContext
	 * @param onErrorConfigList
	 */
	public DefaultErrorHandler(CamelProcessContext processContext,
			List<OnErrorConfig> onErrorConfigList) {
		this.processContext = processContext;
		this.onErrorConfigMap = new HashMap<String, OnErrorConfig>();
		for (OnErrorConfig onErrorConfig : onErrorConfigList) {
			this.onErrorConfigMap.put(onErrorConfig.getExceptionType(),
					onErrorConfig);
		}
		this.producerTemplate = new DefaultProducerTemplate(
				processContext.getCamelContext());
		this.setContext(new HashMap<String, Object>());
	}

	public DefaultErrorHandler() {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.exception.ErrorHandler#reportError(com.
	 *      headstrong.fusion.commons.exception.ErrorContext)
	 */
	@Override
	public void reportError(ErrorContext errorContext) throws FusionException {
		this.reportError(errorContext, true);
	}

	/**
	 * Report the Error to process recovery queue too.
	 * 
	 * @param processContext
	 *            Process Context.
	 * @param errorContext
	 *            Error Context.
	 */
	private void reportErrorToRecovery(ProcessContext processContext,
			ErrorContext errorContext) throws FusionException {
		Endpoint inputSedaQueue = this.getProcessContext()
				.getProcessMetaData().getSourceSedaEndpoint(
						errorContext.getProcessId(),
						FusionConstants.ERROR_QUEUE);
		if (inputSedaQueue != null) {
			// separate messages required as formatting might be
			// different
			// for different service.
			Message message = new DefaultMessage();
			try {
				// Default Error Formatting is XML type
				// FIXME :: All this should be centralized and configurable.
				//message.setBody(new XmlErrorFormatter().format(errorContext));
				message.setBody(ErrorContextFormatter.formatToXml(errorContext));
			} catch (Exception e1) {
				throw new FusionException(e1);
			}
			// set the headers if present.
			if (this.getContext().get(EXCHANGE) != null) {
				message.setHeaders(this.getHeaders(((MessageExchange) this
						.getContext().get(EXCHANGE))));
			}
			// create an exchange.
			Exchange exchange = new DefaultExchange(this.processContext
					.getCamelContext());
			exchange.setIn(message);
			//EXCEPTION_CAUSE_PROPERTY
			exchange.setProperty(Exchange.EXCEPTION_CAUGHT,
					errorContext.getCause());
			exchange.setException(errorContext.getCause());
			
			try {
				this.errorExchangeProcessor.process(exchange);
				// send the message
				this.getProducerTemplate().send(inputSedaQueue, exchange);
			} catch (Exception e) {
				throw new FusionException(e);
			}
		}
	}

	private ComponentEventLogBean createCompEventlogBean(
			ErrorContext errorContext) {
		ComponentEventLogBean compEvntlogBean = new ComponentEventLogBean();

		// get the exchange to get the headers
		MessageExchange exchange = (MessageExchange) this.getContext().get(
				EXCHANGE);
		Map<String, Object> headers = exchange.getIn().getHeaders();
		// set all the attributes for component event log bean
		compEvntlogBean
				.setSessionId(this.getProcessContext().getProcessRunId());
		compEvntlogBean.setCompId(errorContext.getServiceId());
		compEvntlogBean.setMessageId(headers.get(FusionConstants.MESSAGE_ID)
				.toString());
		compEvntlogBean.setSavepointName(FusionConstants.DEFAULT_ERROR_SP_NAME);
		compEvntlogBean.setSavepointTime((errorContext.getTimestamp()
				.toString()));
		Throwable error = errorContext.getCause();
		StringBuffer sb = new StringBuffer();
		while (error != null) {
			if (error instanceof RuntimeException) {
				// FIXME Primary put here for debugging purpose.
				// need to check how to do the logging
				// of the RunTimeException.
				StackTraceElement[] trace = error.getStackTrace();
				for (int i = 0; i < trace.length; i++) {
					sb.append("\n " + trace[i]);
				}
			} else {
				sb.append(error.getMessage()).append(",");
			}
			error = error.getCause();
		}

		compEvntlogBean.setLogMessage(sb.toString());

		return compEvntlogBean;
	}

	/**
	 * checks the incoming message for headers.
	 * 
	 * @param messageExchange
	 * @return
	 */
	private Map<String, Object> getHeaders(MessageExchange messageExchange) {
		Map<String, Object> headers = null;
		if (messageExchange != null) {
			NormalizedMessage message = messageExchange.getIn();
			if (message != null) {
				headers = message.getHeaders();
			}
		}
		return headers;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.exception.ErrorHandler#resetErrorContext()
	 */
	public void resetContext() {
		for (String exceptionType : this.getContext().keySet()) {
			this.getContext().put(exceptionType, null);
		}
	}

	/**
	 * @return the processContext
	 */
	public CamelProcessContext getProcessContext() {
		return processContext;
	}

	/**
	 * @param processContext
	 *            the processContext to set
	 */
	public void setProcessContext(CamelProcessContext processContext) {
		this.processContext = processContext;
	}

	/**
	 * @return the producerTemplate
	 */
	public ProducerTemplate getProducerTemplate() throws Exception {
		
		if (!isProducerTemplateOn) {
			this.producerTemplate.start();
			isProducerTemplateOn = true;
		}
		return producerTemplate;
	}

	/**
	 * @param producerTemplate
	 *            the producerTemplate to set
	 */
	public void setProducerTemplate(ProducerTemplate producerTemplate) {
		this.producerTemplate = producerTemplate;
	}

	/**
	 * @return the onErrorConfigMap
	 */
	public Map<String, OnErrorConfig> getOnErrorConfigMap() {
		return onErrorConfigMap;
	}

	/**
	 * @param onErrorConfigMap
	 *            the onErrorConfigMap to set
	 */
	public void setOnErrorConfigMap(Map<String, OnErrorConfig> onErrorConfigMap) {
		this.onErrorConfigMap = onErrorConfigMap;
	}

	/**
	 * @return the context
	 */
	public Map<String, Object> getContext() {
		return context;
	}

	/**
	 * @param context
	 *            the context to set
	 */
	public void setContext(Map<String, Object> context) {
		this.context = context;
	}

	/**
	 * @return the toContinue
	 */
	public boolean isToContinue() {
		return toContinue;
	}

	/**
	 * @param toContinue
	 *            the toContinue to set
	 */
	public void setToContinue(boolean toContinue) {
		this.toContinue = toContinue;
	}

	public void reportError(ErrorContext errorContext,
			boolean reportToRecovery, boolean handle) throws FusionException {

		// any exception thrown even the runtime has to be caught to append the
		// actual
		// error cause with the exception so that the original error
		// is not lost.

		try {
			OnErrorConfig onErrorConfig = this.getOnErrorConfigMap().get(
					errorContext.getType());
			if (onErrorConfig != null) {
				List<ErrorReportingConfig> errorReportingConfigs = onErrorConfig
						.getErrorReporters();
				if (errorReportingConfigs != null) {
					for (ErrorReportingConfig errorReportingConfig : errorReportingConfigs) {
						logger.debug("Reporting error for process : "
								+ errorContext.getProcessId()
								+ ", service id : "
								+ errorContext.getServiceId()
								+ " to Error Reporter : "
								+ errorReportingConfig.getErrorReporterId());
						// This is pending.
						String formatterType = errorReportingConfig
								.getFormatter();
						ErrorFormatter errorFormatter = ErrorFormatterFactory
								.getErrorFormatter(formatterType);
						if (errorFormatter == null) {
							errorFormatter = new XmlErrorFormatter();
						}
						// send the context to corresponding
						// Endpoint.
						String processId = this.getProcessContext()
								.getProcessConfigurationModel().getProcess()
								.getId();
						String reporterId = errorReportingConfig
								.getErrorReporterId();
						Endpoint inputSedaQueue = this
								.getProcessContext().getProcessMetaData()
								.getSourceSedaEndpoint(processId, reporterId);
						// TODO :: See if Null check should be there or not ?
						// separate messages required as formatting might be
						// different
						// for different service.
						Message message = new DefaultMessage();
						message.setBody(errorFormatter.format(errorContext));
						// create an exchange.
						Exchange exchange = new DefaultExchange(
								this.processContext.getCamelContext());
						exchange.setIn(message);
						// send the message
						this.getProducerTemplate().send(inputSedaQueue,
								exchange);
					}
				}

				// check if the component eventlog is enabled and log
				boolean compEvntlogOn = false;
				if (this.getProcessContext().getProcessConfigurationModel() != null) {
					compEvntlogOn = this.getProcessContext()
							.getProcessConfigurationModel().getProcess()
							.isToLogCompEvents();
				}
				if (compEvntlogOn) {
					EventLogger eventLogger = EventLoggerFactory
							.getEventLogger(EventLoggerFactory.EVENT_LOGGERS.COMPONENT_LOGGER);
					eventLogger.log(createCompEventlogBean(errorContext));
				}
				if (reportToRecovery) {
					// Report to fusion error queue.
					this.reportErrorToRecovery(processContext, errorContext);
				}

				if (handle) {
					ErrorHandlingStrategyConfig errorHandlingStrategyConfig = onErrorConfig
							.getErrorHandlingStrategy();
					if (errorHandlingStrategyConfig != null) {
						// Handle Error.
						ErrorStrategyHandler strategyHandler = ErrorHandlingStrategyFactory
								.getErrorStrategyHandler(errorHandlingStrategyConfig
										.getStrategy());
						this.getContext().put(
								onErrorConfig.getExceptionType(),
								strategyHandler.updateContext(processContext,
										errorHandlingStrategyConfig,
										this.getContext().get(
												onErrorConfig
														.getExceptionType())));
						// Even if for one type of Error it fails...
						// its failed for good.
						this.setToContinue(strategyHandler.isToContinue(
								processContext, errorHandlingStrategyConfig,
								this.getContext().get(
										onErrorConfig.getExceptionType())));

					} else {
						this.setToContinue(false);
					}
					// if not to continue throw Fusion Exception
					if (!this.isToContinue()) {
						throw new HandledException(
								"Processing stopped for the message.",
								errorContext.getCause());
					}
				}
			} else {
				try {
					throw errorContext.getCause();
				} catch (Throwable e) {
					if (e instanceof FusionException) {
						throw (FusionException) e;
					} else {
						throw new FusionException(e);
					}
				}
			}
		} catch (Throwable ex) {
			logger.error("Error while reporting the error", ex);
			if (ex instanceof FusionException) {
				throw (FusionException) ex;
			} else {
				// Its a runtime exception caused by the handler.
				// create the exception chain and throw it.
				Throwable errorContextException = errorContext.getCause();
				FusionException exception = new FusionException(
						ex.getMessage(), errorContextException);
				throw exception;
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.exception.ErrorHandler#reportError(com.
	 *      headstrong.fusion.commons.exception.ErrorContext, boolean)
	 */
	public void reportError(ErrorContext errorContext, boolean handle)
			throws FusionException {
		// By default it'll be reported to Recovery queue.
		this.reportError(errorContext, true, handle);
	}

	public void initContext(MessageExchange exchange) {
		this.getContext().put(EXCHANGE, exchange);
	}

}
