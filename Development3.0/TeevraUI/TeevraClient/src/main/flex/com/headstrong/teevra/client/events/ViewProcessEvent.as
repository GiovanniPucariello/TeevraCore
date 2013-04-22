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
 * $Id: ViewProcessEvent.as
 * $Revision: 
 * $Author: PAakash
 * $DateTime: Oct 21, 2008  
 */
package com.headstrong.teevra.client.events
/**
 * 
 */
{
	import flash.events.Event;
	import com.adobe.cairngorm.control.CairngormEvent;
	/**
	 * ViewProcessEvent for handling the event for viewing the process
	 * @author PAakash
	 * 
	 */
	public class ViewProcessEvent extends CairngormEvent
	{
		public static const VIEW_PROCESS_EVENT:String = "View Process Event";
		/**
		 * 
		 * 
		 */
		public function ViewProcessEvent()
		{
				super(VIEW_PROCESS_EVENT);
		}	
	}
}