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
 * $Id: ServerConfigurationEvent.as
 * $Revision: 
 * $Author: PAakash
 * $DateTime: Feb 10, 2000  
 */
package com.headstrong.teevra.client.events
{
	import com.adobe.cairngorm.control.CairngormEvent;
	
	/**
	 * ServerConfigurationEvent handles the events for the viewing the server 
	 * @author PAakash
	 * 
	 */
	public class ViewServerConfigurationEvent extends CairngormEvent
	{
		private var _isServerAdminFlag:Boolean;
		
		public static const SERVER_CONFIG_EVENT:String="Server Configuration";
		
		public function ViewServerConfigurationEvent(isServerAdminFlag:Boolean)
		{
			super(SERVER_CONFIG_EVENT);
			_isServerAdminFlag = isServerAdminFlag;
		}
		
		/**
		 * 
		 * @return isServerAdminFlag Boolean
		 * 
		 */
		public function get isServerAdminFlag():Boolean
		{
			return _isServerAdminFlag;
		}
		
		/**
		 * 
		 * @param value  set isServerAdminFlag Boolean
		 * 
		 */
		public function set isServerAdminFlag(value:Boolean):void
		{
			this._isServerAdminFlag = value;
		}

	}
}