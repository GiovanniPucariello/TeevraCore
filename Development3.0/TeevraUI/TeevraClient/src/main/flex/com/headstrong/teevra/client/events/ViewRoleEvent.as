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
 * $Id: ViewRoleEvent.as
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Apr 28, 2008  
 */
package com.headstrong.teevra.client.events
/**
 * 
 */
{
	import com.adobe.cairngorm.control.CairngormEvent;

	/**
	 * ViewRoleEvent handles the event for displaying the roles
	 * 
	 * @author ViswanathP
	 * 
	 */
	public class ViewRoleEvent extends CairngormEvent
	{
		
		public static const VIEW_ROLE_EVENT:String = "View Role Event";
		
		/**
		 * ViewRoleEvent constructor
		 * 
		 */
		public function ViewRoleEvent()
		{
			super(VIEW_ROLE_EVENT);
		}
	}
}