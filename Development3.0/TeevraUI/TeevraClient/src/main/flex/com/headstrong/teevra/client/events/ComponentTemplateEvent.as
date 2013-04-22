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
 * $Id: ComponentTemplateEvent.as
 * $Revision: 
 * $Author: akrishnamoorthy
 * $DateTime: Apr 02, 2009  
 */
package com.headstrong.teevra.client.events
{
	import com.adobe.cairngorm.control.CairngormEvent;
	
	import mx.rpc.IResponder;
	
	public class ComponentTemplateEvent extends CairngormEvent
	{
		public static const COMPONENT_TEMPLATE_EVENT:String = "Component Template Event"; 
		public static const GET_NAMES_COMMAND:int = 1;
		public static const GET_CONFIG_COMMAND:int = 2;
		public static const SAVE_CONFIG_COMMAND:int = 3;
		
		public static const ARG_COMP_ID:String = "compId";
		public static const ARG_TEMPLATE_NAME:String = "templateName";
		public static const ARG_COMP_TEMPLATE:String = "compTemplate";
		
		private static var _currentCommand:int;
		private var _eventArguments:Object;
		private var _resultHandler:IResponder;
		
		public function ComponentTemplateEvent(command:int, args:Object, resultHanlder:IResponder)
		{
			super(COMPONENT_TEMPLATE_EVENT);
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