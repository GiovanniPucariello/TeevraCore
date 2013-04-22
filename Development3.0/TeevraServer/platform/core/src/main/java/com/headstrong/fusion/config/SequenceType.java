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
 * $Id: Sequence.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Sep 16, 2008 
 */

package com.headstrong.fusion.config;

import java.io.Serializable;

/**
 * A sequence is a message flow sequence for 
 * any Service i.e.
 * Mediation or Connector.
 * 
 */
public interface SequenceType extends Serializable {

	/**
	 * @return the endPointId
	 */
	public String getEndPointId();
	/**
	 * @param endPointId the endPointId to set
	 */
	public void setEndPointId(String endPointId);
	
}
