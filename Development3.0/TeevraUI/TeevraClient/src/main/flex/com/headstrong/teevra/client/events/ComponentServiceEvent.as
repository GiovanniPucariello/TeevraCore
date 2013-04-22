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
 * $Id: ComponentServiceEvent.as
 * $Revision: 
 * $Author: PAakash
 * $DateTime: Apr 07, 2009  
 */
package com.headstrong.teevra.client.events
{
	import com.adobe.cairngorm.control.CairngormEvent;
	
	import mx.rpc.IResponder;
	
	public class ComponentServiceEvent extends CairngormEvent
	{
		public static const COMPONENT_SERVICE_EVENT:String = "Component Service Event"; 
		
		public static const NEW_PROCESS_COMMAND:int = 1;
		public static const DRAWING_PROCESS_COMMAND:int = 2;
		public static const SAVE_COMPONENT_COMMAND:int = 3;
		public static const VIEW_COMPONENT_COMMAND:int = 4;
		
		public static const NEW_PROCESS_ID:String = "newProcess";
		public static const DRAWING_PROCESS_ID:String = "drawingProcess";
		public static const SAVE_COMPONENT_ID:String = "saveComponent";
		public static const VIEW_COMPONENT_ID:String = "viewComponent";
				
		private static var _currentCommand:int;
		private var _eventArguments:Object;
		private var _currentEvent:String;
		private var _resultHandler:IResponder;
		public function ComponentServiceEvent(command:int, args:Object,resultHanlder:IResponder)
		{
			super(COMPONENT_SERVICE_EVENT);
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