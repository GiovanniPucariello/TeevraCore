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
 * $Id: MediationService.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Sep 11, 2008 
 */

package com.headstrong.fusion.commons;



import com.headstrong.fusion.bo.impl.exception.InvalidAttributeExpressionException;
import com.headstrong.fusion.commons.exception.FusionException;

/**
 * An interface used to represent Mediation Service.
 * 
 */
public interface MediationService {

	/**
	 * This is the method that does the message mediation. container initializes
	 * the service calling {@link #init(ServiceConfig)}and on successful
	 * initialization this service is ready for message mediation.
	 * 
	 * 
	 * @param exchange
	 * @throws FusionException
	 * @throws InvalidAttributeExpressionException 
	 */
	public void process(MessageExchange exchange, ServiceConfig serviceConfig)
			throws FusionException, InvalidAttributeExpressionException;

	/**
	 * Will be invoked once for service initialization.
	 * 
	 */
	public void init();

	public static final String OBJECT_DESCRIPTOR_SCHEMA = "objectSchemaDescriptor";
	public static final String OBJECT_MAPPING_ID = "schemaMapping";

	public static final String ERROR_TYPE_BUSINESS = FusionConstants.ERROR_TYPE_BUSINESS;
	public static final String ERROR_TYPE_SYSTEM = FusionConstants.ERROR_TYPE_SYSTEM;
}
