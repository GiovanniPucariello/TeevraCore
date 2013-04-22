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
 * $Id: ViewComponentEvent.as
 * $Revision: 
 * $Author: PAakash
 * $DateTime: Dec 17, 2008  
 */
package com.headstrong.teevra.client.events
{
	import com.adobe.cairngorm.control.CairngormEvent;
	/**
	 * ViewComponentEvent handles the events for the viewing the components
	 * @author PAakash
	 * 
	 */
	public class ViewComponentEvent extends CairngormEvent
	{
		private var _isViewComponentEvent:Boolean;
		public static const VIEWCOMPONENTEVENT:String="View Component Event";
		public function ViewComponentEvent(isViewComponent:Boolean)
		{
			super(VIEWCOMPONENTEVENT);
			_isViewComponentEvent = isViewComponent;
		}
		
		public function get isViewComponentEvent():Boolean
		{
			return _isViewComponentEvent
		}
		public function set isViewComponentEvent(value:Boolean):void
		{
			this._isViewComponentEvent = value;
		}
	}
}