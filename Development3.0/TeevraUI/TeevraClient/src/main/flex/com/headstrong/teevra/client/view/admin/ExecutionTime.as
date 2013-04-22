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
 * $Id: ExecutionTime.as
 * $Revision: 
 * $Author: PAakash
 * $DateTime: Dec 19, 2008  
 */
package com.headstrong.teevra.client.view.admin
{
	[RemoteClass(alias="com.headstrong.teevra.common.scheduling.ExecutionTime")]
	[Bindable]
	public class ExecutionTime
	{
		private var _startTime:Number;
		private var _endTime:Number;
		
		/**
		 * 
		 * @return startTime
		 * 
		 */
		public function get startTime():Number
		{
			return this._startTime;
		}
		/**
		 * 
		 * @param startTime set startTime
		 * 
		 */
		public function set startTime(startTime:Number):void
		{
			this._startTime = startTime;
		}
		/**
		 * 
		 * @return endTime
		 * 
		 */
		public function get endTime():Number
		{
			return this._endTime;
		}
		/**
		 * 
		 * @param endTime set endTime
		 * 
		 */
		public function set endTime(endTime:Number):void
		{
			this._endTime = endTime;
		}

	}
}