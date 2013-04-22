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
 * $Id: StateMachineServiceEvent.as
 * $Revision: 
 * $Author: PAakash
 * $DateTime: Apr 08, 2009  
 */
package com.headstrong.teevra.client.events
{
	import com.adobe.cairngorm.control.CairngormEvent;
	
	import mx.rpc.IResponder;
	
	public class StateMachineServiceEvent extends CairngormEvent
	{
		public static const STATE_MACHINE_EVENT:String = "State Machine Service Event"; 
		
		public static const VIEW_STATEMACHINE_COMMAND:int = 1;
		public static const NEW_STATEMACHINE_COMMAND:int = 2;
		public static const DELETE_STATEMACHINE_COMMAND:int = 3;
		public static const GET_STATEMACHINE_COMMAND:int = 4;
		public static const SAVE_STATEMACHINE_COMMAND:int = 5;
		public static const PUBLISH_STATEMACHINE_COMMAND:int = 6;
		
		public static const GET_PROCESS_ID:String = "getStateMachine";
		public static const DELETE_STATEMACHINE_ID:String = "deleteStateMachine";
		public static const SAVE_STATEMACHINE_ID:String = "saveStateMachine";
		public static const PUBLISH_STATEMACHINE_ID:String = "publishStateMachine";
		
		private static var _currentCommand:int;
		private var _eventArguments:Object;
		private var _currentEvent:String;
		private var _resultHandler:IResponder;
		
		
		public function StateMachineServiceEvent(command:int, args:Object,resultHanlder:IResponder)
		{
			super(STATE_MACHINE_EVENT);
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