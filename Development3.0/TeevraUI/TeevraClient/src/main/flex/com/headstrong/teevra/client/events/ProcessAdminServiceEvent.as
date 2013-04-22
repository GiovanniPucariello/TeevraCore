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
 * $Id: ProcessAdminServiceEvent.as
 * $Revision: 
 * $Author: PAakash
 * $DateTime: Apr 09, 2009
 *
 * $Revision: 1.0 
 * $Author: 
 * $DateTime: March 29 , 2011    
 */
package com.headstrong.teevra.client.events
{
	import com.adobe.cairngorm.control.CairngormEvent;
	
	import flash.events.Event;
	
	import mx.rpc.IResponder;
	
	
	public class ProcessAdminServiceEvent extends CairngormEvent
	{
		public static const PROCESS_ADMIN_SERVICE_EVENT:String = "Process Admin Service Event"; 
		
		public static const START_PROCESS_COMMAND:int = 1;
		public static const STOP_PROCESS_COMMAND:int = 2;
		public static const PROCESS_STATUS_COMMAND:int = 3;
		public static const GET_RECURRENCE_COMMAND:int = 4;
		public static const PROCESS_RUNTIME_RPT_COMMAND:int = 5;
		public static const RECURRENCE_COMMAND:int = 6;
		public static const VIEW_PROCESS_DTLS_COMMAND:int = 7;
				
		public static const START_PROCESS_ID:String = "startProcessId";
		public static const START_PROCESS_SERVER:String = "startProcessServer";
		public static const STOP_PROCESS_ID:String = "stopProcess";
		public static const STOP_PROCESS_SERVER:String = "stopProcessServer";
		public static const VIEW_PROCESS_ID:String = "viewProcessDtlsId";
		public static const VIEW_PROCESS_NAME:String = "viewProcessDtlsName";
		public static const VIEW_PROCESS_SERVER:String = "viewProcessDtlsServer";
		public static const GET_RECURRENCE_ID:String = "getRecurrence";
		public static const RECURRENCE_ID:String = "Recurrence";
		public static const RECURRENCE_CONFIG:String = "RecurrenceConfig";
		public static const RUN_PROCESS_ID:String = "runProcessId";
				
		// Removed static refrence of command and made it instance level to fix  Bug#114	
		//private static var _currentCommand:int;
		private var _command:int;
		private var _eventArguments:Object;
		private var _currentEvent:String;
		private var _resultHandler:IResponder;
		
		public function ProcessAdminServiceEvent(command:int, args:Object,resultHanlder:IResponder)
		{
			super(PROCESS_ADMIN_SERVICE_EVENT);
			this._command = command;
			this._eventArguments = args;
			this._resultHandler = resultHanlder;
		}
		// Changed static getter and setter as instance members to fix  Bug#114
		public function get command():int {
			return this._command;
		}
		
		public function set command(cmd:int):void {
			this._command = cmd;
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
		
		
		
		/**
		 * 
		 * @return Event
		 * 		clone is overriden to redispatch (this) event
		 * 
		 */		
		override public function clone():Event {
           return new ProcessAdminServiceEvent(_command,_eventArguments,_resultHandler);
        }

		
	}
}