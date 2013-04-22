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
 * $Id: ViewUserEvent.as
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Apr 27, 2008  
 */
package com.headstrong.teevra.client.events
/**
 * 
 */
{
	import com.adobe.cairngorm.control.CairngormEvent;
	
	import mx.controls.Alert;
	
	/**
	 * ViewUserEvent handles the event for displaying the users
	 * 
	 * @author ViswanathP
	 * 
	 */
	public class ViewUserEvent extends CairngormEvent
	{
		public static const VIEW_USER_EVENT:String = "View User Event";
		
		/**
		 * ViewUserEvent constructor
		 * 
		 */
		public function ViewUserEvent()
		{
			super(VIEW_USER_EVENT);
		}

	}
}