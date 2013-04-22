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
 * $Id: RefDataConfigEvent.as
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Dec 24, 2008  
 */
package com.headstrong.teevra.client.events
/**
 * 
 */
{
	import com.adobe.cairngorm.control.CairngormEvent;
	import com.headstrong.teevra.client.view.entity.RefDataConfigVO;	
	
	/**
	 * RefDataConfigEvent handles the events for the Ref Data config
	 * @author PAakash
	 * 
	 */
	public class RefDataConfigEvent extends CairngormEvent
	{
		public static const REF_DATA_CONFIG_EVENT:String = "Ref Data Config Event";
		
		public function RefDataConfigEvent()
		{
			super(REF_DATA_CONFIG_EVENT);
		}
	}
}