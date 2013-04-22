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
 * $Id: DataSourceConfigEvent.as
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
	
	/**
	 * DataSourceConfigEvent for handling the  Data source configuration events 
	 * @author PAakash
	 * 
	 */
	public class DataSourceConfigEvent extends CairngormEvent
	{
		private var _isDataSourceConfigEvent:Boolean;
		
		public static const DATA_SOURCE_CONFIG_EVENT:String = "Data Source Config Event";
		
		public function DataSourceConfigEvent(isDataSourceConfig:Boolean)
		{
			super(DATA_SOURCE_CONFIG_EVENT);
			_isDataSourceConfigEvent = isDataSourceConfig;
		}
		
		/**
		 * 
		 * @return isDataSourceConfigEvent Boolean
		 * 
		 */
		public function get isDataSourceConfigEvent():Boolean
		{
			return _isDataSourceConfigEvent;
		}
		
		/**
		 * 
		 * @param value  set isDataSourceConfigEvent Boolean
		 * 
		 */
		public function set isDataSourceConfigEvent(value:Boolean):void
		{
			this._isDataSourceConfigEvent = value;
		}
	}
}