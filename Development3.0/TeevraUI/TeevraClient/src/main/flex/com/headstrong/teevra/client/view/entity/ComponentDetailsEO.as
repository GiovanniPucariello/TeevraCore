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
 * $Id: ComponentDetailsEO.as
 * $Revision: 
 * $Author: VSelvaraju
 * $Feature : Redmine#611 [ProcessMonitoringConsole]
 * $DateTime: Feb 3, 2011  
 */
 
 package com.headstrong.teevra.client.view.entity
{
	[RemoteClass(alias="com.headstrong.teevra.services.processadmin.vo.ComponentDetailsVO")]
	[Bindable]
	public class ComponentDetailsEO
	{
		
	 
	 /**
	 * Enpoint uri name of the component 
	 * */ 
	private var _name:String;
		
	
	/**
	 * First Message completion time of the component 
	 * */
	private var _firstMsgTime:Date ;
	
	
	/**
	 * Last Message completion time of the component 
	 * */
	private var _lastMsgTime:Date ;
	
	
	/**
	 *  mean processing rate of the component  
	 * */
	private var _meanProcessingRate:int;
	
	

	
	
		/**
		 * 
		 * @return meanProcessingRate
		 * 
		 */
		public function get meanProcessingRate():int
		{
			return this._meanProcessingRate;
		}
		
		/**
		 * 
		 * @param value set meanProcessingRate
		 * 
		 */
		public function set meanProcessingRate(value:int):void
		{
			this._meanProcessingRate = value;
		}
	
	
	
		/**
		 * 
		 * @return name
		 * 
		 */
		public function get name():String
		{
			return this._name;
		}
		
		/**
		 * 
		 * @param value set name
		 * 
		 */
		public function set name(value:String):void
		{
			this._name = value;
		}
	
	
		/**
		 * 
		 * @return firstMsgTime
		 * 
		 */
		public function get firstMsgTime():Date
		{
			return this._firstMsgTime;
		}
		
		/**
		 * 
		 * @param value set firstMsgTime
		 * 
		 */
		public function set firstMsgTime(value:Date):void
		{
			this._firstMsgTime = value;
		}
	
	
	
		/**
		 * 
		 * @return lastMsgTime
		 * 
		 */
		public function get lastMsgTime():Date
		{
			return this._lastMsgTime;
		}
		
		/**
		 * 
		 * @param value set lastMsgTime
		 * 
		 */
		public function set lastMsgTime(value:Date):void
		{
			this._lastMsgTime = value;
		}
	

	}
}