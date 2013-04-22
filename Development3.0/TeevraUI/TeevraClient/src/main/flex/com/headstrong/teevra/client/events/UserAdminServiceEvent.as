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
 * $Id: UserAdminServiceEvent.as
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Apr 28, 2009  
 */
package com.headstrong.teevra.client.events
{
	import com.adobe.cairngorm.control.CairngormEvent;
	
	import mx.rpc.IResponder;

	public class UserAdminServiceEvent extends CairngormEvent
	{
		public static const USER_ADMIN_SERVICE_EVENT:String = "User Admin Service Event"; 
		
		
		public static const GET_USERS_COMMAND:int = 1;
		public static const ADD_USER_COMMAND:int = 2;
		public static const DELETE_USER_COMMAND:int = 3;
		
		public static const GET_ROLES_COMMAND:int = 4;
		public static const ADD_ROLE_COMMAND:int = 5;
		public static const DELETE_ROLE_COMMAND:int = 6;
		
		public static const GET_ACTIVITIES_COMMAND:int = 7;
		
		public static const GET_USERS_ID:String = "getUsers";
		public static const ADD_USER_ID:String = "addUser";
		public static const DELETE_USER_ID:String = "deleteUser";
		
		public static const GET_ROLES_ID:String = "getRoles";
		public static const ADD_ROLE_ID:String = "addRole";
		public static const DELETE_ROLE_ID:String = "deleteRole";
		
		public static const GET_ACTIVITIES_ID:String = "getActivities";
		
		private static var _currentCommand:int;
		private var _eventArguments:Object;
		private var _currentEvent:String;
		private var _resultHandler:IResponder;
		
		public function UserAdminServiceEvent(command:int, args:Object,resultHanlder:IResponder)
		{
			super(USER_ADMIN_SERVICE_EVENT);
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