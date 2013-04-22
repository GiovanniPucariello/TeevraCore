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
 * $Id: GenericMediationService.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Sep 11, 2008 
 */

package com.headstrong.fusion.commons;

import java.util.Map;

import com.headstrong.fusion.commons.exception.ErrorHandler;
import com.headstrong.fusion.commons.exception.FusionException;
import com.headstrong.fusion.commons.util.FusionUtil;

/**
 * Abstract Mediation Service. Mediation service may either implement
 * {@link MediationService} or extend {@link GenericMediationService}.
 * 
 */
public abstract class GenericMediationService implements MediationService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.MediationService#init()
	 */
	public void init() {
		// Default implementation does nothing.
	}

	/**
	 * If error handler is configured reports the error using reportError method
	 * of error handler, or else creates a new FusionException and rethrows the
	 * same which would be caught and reported by GenericProcessor.
	 * 
	 * @param errorHandler
	 *            Error Handler.
	 * @param processId
	 *            Unique process identifier.
	 * @param serviceId
	 *            Unique Service identifier.
	 * @param errorType
	 *            Type of Exception ( Business/ System )
	 * @param componentType
	 *            Component Type
	 * @param cause
	 *            Cause of Error.
	 * @param resource
	 *            Resource processing which the exception was thrown.
	 * @param moreInfo
	 *            Additional Information.
	 * @throws FusionException
	 *             Exception thrown if Error Handler is not configured.
	 */
	public void handleError(ErrorHandler errorHandler, String processId,
			String serviceId, String errorType, String componentType,
			Throwable cause, Object resource, String moreInfo,
			boolean stopExecution) throws FusionException {
		FusionUtil.handleError(errorHandler, processId, serviceId, errorType,
				componentType, cause, resource, moreInfo, stopExecution);
	}

	/**
	 * If error handler is configured reports the error using reportError method
	 * of error handler, or else creates a new FusionException and rethrows the
	 * same which would be caught and reported by GenericProcessor.
	 * 
	 * @param errorHandler
	 *            Error Handler.
	 * @param processId
	 *            Unique process identifier.
	 * @param serviceId
	 *            Unique Service identifier.
	 * @param errorType
	 *            Type of Exception ( Business/ System )
	 * @param componentType
	 *            Component Type
	 * @param cause
	 *            Cause of Error.
	 * @param resource
	 *            Resource processing which the exception was thrown.
	 * @param moreInfo
	 *            Additional Information.
	 * @throws FusionException
	 *             Exception thrown if Error Handler is not configured.
	 */
	public void handleError(ErrorHandler errorHandler, String processId,
			String serviceId, String errorType, String componentType,
			Throwable cause, Object resource, String moreInfo)
			throws FusionException {
		FusionUtil.handleError(errorHandler, processId, serviceId, errorType,
				componentType, cause, resource, moreInfo, false);
	}

	/**
	 * If error handler is configured reports the error using reportError method
	 * of error handler, or else creates a new FusionException and rethrows the
	 * same which would be caught and reported by GenericProcessor.It also takes
	 * care of any extra information passed for the error context
	 * 
	 * @param errorHandler
	 *            Error Handler.
	 * @param processId
	 *            Unique process identifier.
	 * @param serviceId
	 *            Unique Service identifier.
	 * @param errorType
	 *            Type of Exception ( Business/ System )
	 * @param componentType
	 *            Component Type
	 * @param cause
	 *            Cause of Error.
	 * @param resource
	 *            Resource processing which the exception was thrown.
	 * @param moreInfo
	 *            Additional Information.
	 * @param properties
	 *            Extra properties
	 * @throws FusionException
	 *             Exception thrown if Error Handler is not configured.
	 */
	public void handleError(ErrorHandler errorHandler, String processId,
			String serviceId, String errorType, String componentType,
			Throwable cause, Object resource, String moreInfo,
			boolean stopExecution, Map<String, String> properties)
			throws FusionException {
		FusionUtil.handleError(errorHandler, processId, serviceId, errorType,
				componentType, cause, resource, moreInfo, properties,
				stopExecution);
	}

	/**
	 * If error handler is configured reports the error using reportError method
	 * of error handler, or else creates a new FusionException and rethrows the
	 * same which would be caught and reported by GenericProcessor.It also takes
	 * care of any extra information passed for the error context
	 * 
	 * @param errorHandler
	 *            Error Handler.
	 * @param processId
	 *            Unique process identifier.
	 * @param serviceId
	 *            Unique Service identifier.
	 * @param errorType
	 *            Type of Exception ( Business/ System )
	 * @param componentType
	 *            Component Type
	 * @param cause
	 *            Cause of Error.
	 * @param resource
	 *            Resource processing which the exception was thrown.
	 * @param moreInfo
	 *            Additional Information.
	 * @param properties
	 *            Extra properties
	 * @throws FusionException
	 *             Exception thrown if Error Handler is not configured.
	 */
	public void handleError(ErrorHandler errorHandler, String processId,
			String serviceId, String errorType, String componentType,
			Throwable cause, Object resource, String moreInfo,
			Map<String, String> properties) throws FusionException {
		FusionUtil.handleError(errorHandler, processId, serviceId, errorType,
				componentType, cause, resource, moreInfo, properties, false);
	}
	
	/**
	 * If error handler is configured reports the error using reportError method
	 * of error handler, or else creates a new FusionException and rethrows the
	 * same which would be caught and reported by GenericProcessor.It also takes
	 * care of any extra information passed for the error context
	 * 
	 * @param errorHandler
	 *            Error Handler.
	 * @param processId
	 *            Unique process identifier.
	 * @param serviceId
	 *            Unique Service identifier.
	 * @param errorType
	 *            Type of Exception ( Business/ System )
	 * @param componentType
	 *            Component Type
	 * @param cause
	 *            Cause of Error.
	 * @param resource
	 *            Resource processing which the exception was thrown.
	 * @param moreInfo
	 *            Additional Information.
	 * @param properties
	 *            Extra properties
	 * @param fixmlVersion
	 *            sp2 or sp1          
	 * @throws FusionException
	 *             Exception thrown if Error Handler is not configured.
	 */
	public void handleError(ErrorHandler errorHandler, String processId,
			String serviceId, String errorType, String componentType,
			Throwable cause, Object resource, String moreInfo,
			Map<String, String> properties,String fixmlVersion) throws FusionException {
		FusionUtil.handleError(errorHandler, processId, serviceId, errorType,
				componentType, cause, resource, moreInfo, properties, false,fixmlVersion);
	}
}
