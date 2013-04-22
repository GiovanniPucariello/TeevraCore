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
 * $Id: ViewSchemaEvent.as
 * $Revision: 
 * $Author: PAakash
 * $DateTime: Nov 12, 2008  
 */
package com.headstrong.teevra.client.events
/**
 * 
 */
{
	import flash.events.Event;
	import com.adobe.cairngorm.control.CairngormEvent;	
	import com.headstrong.teevra.client.view.entity.ProcessVO;
	import mx.controls.Alert;
	/**
	 * ViewSchemaEvent events handles the events for the viewing the schema
	 * @author PAakash
	 * 
	 */
	public class ViewSchemaEvent extends CairngormEvent
	{
		public static const VIEWSCHEMAEVENT:String = "View Schema Event";
		public function ViewSchemaEvent()
		{
			super(VIEWSCHEMAEVENT);
		}
	}
}