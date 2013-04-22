/*
 * The information in this document is subject to change without notice and 
 * does not represent a commitment by Headstrong Corporation. The software 
 * and/or databases described in this document are furnished under a license 
 * agreement and may be used or copied only in accordance with the terms of 
 * the agreement. 
 * 
 * Copyright '\u00a9' 2008 Headstrong Corporation
 * All rights reserved.
 * 
 * $Id: BusinessObjectSource.java
 * $Revision: 
 * $Author: VGarde
 * $DateTime: Dec 4, 2009 
 */

package com.headstrong.fusion.bo;


/**
 * This contract gives clients the fexibility to decide which BusinessObjects to create.
 * So instead of a code saying </code>BusinessObject bo= new DynamicBusinessObject();</code>,
 * this task should say <code>BusinessObject bo = {@link BusinessObjectSource.getBusinessObject()};</code>
 * to get additional cohesion.
 * @author VGarde
 */
public interface BusinessObjectSource {

	/**
	 * Returns a new {@link BusinessObject}.
	 * @return
	 */
	BusinessObject getBusinessObject();
	
}
