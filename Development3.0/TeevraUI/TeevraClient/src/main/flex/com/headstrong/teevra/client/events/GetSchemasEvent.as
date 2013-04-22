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
	 * GetSchemasEvent for handling the event for getting the schema 
	 * @author PAakash
	 * 
	 */
	public class GetSchemasEvent extends CairngormEvent
	{
		public static const GET_SCHEMAS_EVENT:String = "Get Schemas Event";
		/**
		 * GetSchemasEvent constructor
		 * 
		 */
		public function GetSchemasEvent()
		{
			super(GET_SCHEMAS_EVENT);
		}
	}
}