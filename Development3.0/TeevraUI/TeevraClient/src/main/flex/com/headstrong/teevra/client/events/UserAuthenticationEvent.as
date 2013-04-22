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
 * $Id: UserAuthenticationEvent.as
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: May 19, 2009  
 */
package com.headstrong.teevra.client.events
/**
 * 
 */
{
	import com.adobe.cairngorm.control.CairngormEvent;
	
	import mx.rpc.IResponder;
	/**
	 * UserAuthenticationEvent for handling the event for authenticating the user
	 * @author ViswanathP
	 * 
	 */
	public class UserAuthenticationEvent extends CairngormEvent
	{
		public static const USER_AUTHENTICATION_EVENT:String = "User Authentication Event";
		
		public static const GET_LOGIN_COMMAND:int = 1;
		public static const LOGOUT_COMMAND:int = 2;
		
		public static const GET_USER_ID:String = "userId";
		public static const GET_PASSWORD:String = "userPassword";
		
		private static var _currentCommand:int;
		private var _eventArguments:Object;
		private var _currentEvent:String;
		private var _resultHandler:IResponder;
		/**
		 * 
		 * UserAuthenticationEvent constructor
		 */
		public function UserAuthenticationEvent(command:int, args:Object,resultHanlder:IResponder)
		{
			super(USER_AUTHENTICATION_EVENT);
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