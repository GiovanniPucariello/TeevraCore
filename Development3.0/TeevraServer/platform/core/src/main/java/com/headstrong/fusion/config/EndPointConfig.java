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
 * $Id: EndPointConfig.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Sep 4, 2008 
 */

package com.headstrong.fusion.config;

import java.io.Serializable;

/**
 * An Endpoint in Process.
 * 1: MediatorConfig 
 * 2: Connector
 * 3: RouterConfig
 * 
 */
public interface EndPointConfig extends Serializable{
	public String getId();

}
