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
 * $Id: SyncService.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Mar 2, 2010 
 */

package com.headstrong.fusion.commons.component;

/**
 * Interface that specifies that the endpoint supports synchronization either by
 * producer or consumer or both
 */
public interface SyncEndpoint {
	/**
	 * Specifies if the producer is syncProducer or not
	 * @return
	 */
	public boolean isSyncProducer();
	
	/**
	 * Specifies if consumer is a Sync consumer or not 
	 * @return
	 */
	public boolean isSyncConsumer();
}
