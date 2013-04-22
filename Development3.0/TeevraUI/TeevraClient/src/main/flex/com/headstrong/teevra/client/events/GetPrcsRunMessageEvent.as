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
 * $Id: GetPrcsRunMessageEvent.as
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Dec 19, 2008  
 */
package com.headstrong.teevra.client.events
/**
 * 
 */
{
	import com.adobe.cairngorm.control.CairngormEvent;
	
	import flash.display.DisplayObject;	
	
	/**
	 * GetPrcsRunMessageEvent for handling the events for getting the process run message
	 * @author PAakash
	 * 
	 */
	public class GetPrcsRunMessageEvent extends CairngormEvent
	{
		private var _messageEventlogId:Number;
		private var _errorReporting:DisplayObject;
		public static const GET_PRCSRUN_MESSAGEE_EVENT:String = "Get PrcsRun Message Event";
	
		public function GetPrcsRunMessageEvent(messageEventlogId:Number, errorReporting:DisplayObject)
		{
			super(GET_PRCSRUN_MESSAGEE_EVENT);
			_messageEventlogId = messageEventlogId;
			_errorReporting = errorReporting;
		}
		
		/**
		 * 
		 * @return messageEventlogId
		 * 
		 */
		public function get messageEventlogId():Number
		{
			return _messageEventlogId;
		}
		
		/**
		 * 
		 * @param value set messageEventlogId
		 * 
		 */
		public function set messageEventlogId(value:Number):void
		{
			this._messageEventlogId = value;
		}
		
		/**
		 * 
		 * @return errorReporting
		 * 
		 */
		public function get errorReporting():DisplayObject
		{
			return _errorReporting;
		}
		
		/**
		 * 
		 * @param value set errorReporting
		 * 
		 */
		public function set errorReporting(value:DisplayObject):void
		{
			this._errorReporting = value;
		}
	}
}