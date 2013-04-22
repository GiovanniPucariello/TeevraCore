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
 * $Id: RefDataServiceEvent.as
 * $Revision: 
 * $Author: PAakash
 * $DateTime: Apr 09, 2009  
 */
package com.headstrong.teevra.client.events
{
	import com.adobe.cairngorm.control.CairngormEvent;
	
	import mx.rpc.IResponder;
	
	public class RefDataServiceEvent extends CairngormEvent
	{
		public static const REF_DATA_SERVICE_EVENT:String = "Reference Data Service Event"; 
		
		public static const REFRESH_DATASOURCE_COMMAND:int = 1;
		public static const DELETE_DATASOURCE_COMMAND:int = 2;
		public static const ADD_DATASOURCE_COMMAND:int = 3;
		public static const REFRESH_REFDATA_COMMAND:int = 4;
		public static const DELETE_REFDATA_COMMAND:int = 5;
		public static const ADD_REFDATASOURCE_COMMAND:int = 6;
		public static const SET_SCHEDULE_COMMAND:int = 7;
		public static const GET_SCHEDULE_COMMAND:int = 8;
		public static const RELOAD_CACHE_COMMAND:int = 9;
		
		public static const REFRESH_DATASOURCE_ID:String = "refreshDataSource";
		public static const REFRESH_REF_ID:String = "refreshRef";
		public static const DELETE_DATASOURCE_ID:String = "deleteDataSource";
		public static const ADD_DATASOURCE_ID:String = "addDataSource";
		public static const DELETE_REFDATA_ID:String = "deleteRefData";
		public static const ADD_REFDATA_ID:String = "addRefDataSource";
		public static const RELOAD_CACHE_ID:String = "reloadCacheID";
		public static const RELOAD_CACHE_SERVER:String = "reloadCacheServer";
		public static const SET_SCHEDULE_ID:String = "scheduleCacheReload";
		public static const GET_SCHEDULE_ID:String = "getScheduleCacheReload";
		public static const SERVER_CONFIG:String = "RecurrenceConfig";
	
		
		private static var _currentCommand:int;
		private var _eventArguments:Object;
		private var _currentEvent:String;
		private var _resultHandler:IResponder;
		
		public function RefDataServiceEvent(command:int, args:Object,resultHanlder:IResponder)
		{
			super(REF_DATA_SERVICE_EVENT);
			_currentCommand = command;
			this._eventArguments = args;
			this._resultHandler = resultHanlder;
		}
		public static function get currentCommand():int {
			return _currentCommand;
		}
		
		public static function set currentCommand(cmd:int):void {
			_currentCommand = cmd;
		}
		
		/**
		 * 
		 * @return the argument value associated with the given arg name 
		 * 
		 */
		public function getArgument(argName:String):Object
		{
			return _eventArguments[argName];
		}
		
		/**
		 * 
		 * @return currentEvent
		 * 
		 */
		public function get currentEvent():String
		{
			return _currentEvent;
		}
		/**
		 * 
		 * @param value 
		 * 		set the currentEvent
		 * 
		 */
		public function set currentEvent(value:String):void
		{
			this._currentEvent = value;
		}
		/**
		 * 
		 * @return resultHandler
		 * 
		 */
		public function get resultHandler():IResponder
		{
			return _resultHandler;
		}
		/**
		 * 
		 * @param value
		 * 
		 */
		public function set resultHandler(value:IResponder):void
		{
			this._resultHandler = value;
		}
	}
}