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
 * $Id: AbstractRecurrence.as
 * $Revision: 
 * $Author: PAakash
 * $DateTime: Dec 19, 2008  
 */
package com.headstrong.teevra.client.view.admin
{
	[RemoteClass(alias="com.headstrong.teevra.common.scheduling.AbstractRecurrence")]
	[Bindable]
	/**
	 * 
	 * @author PAakash
	 * 
	 */
	public class AbstractRecurrence implements IRecurrence
	{
		private var _executionTime:ExecutionTime;
		private var _recurrenceRange:RecurrenceRange;
		private var _recurrenceGap:int;
		/**
		 * 
		 * @return executionTime
		 * 
		 */
		public function get executionTime():ExecutionTime
		{
			return this._executionTime;
		}
		/**
		 * 
		 * @param executionTime set executionTime
		 * 
		 */
		public function set executionTime(executionTime:ExecutionTime):void
		{
			this._executionTime = executionTime;
		}
		/**
		 * 
		 * @return recurrenceRange
		 * 
		 */
		public function get recurrenceRange():RecurrenceRange
		{
			return this._recurrenceRange;
		}
		/**
		 * 
		 * @param recurrenceRange set recurrenceRange
		 * 
		 */
		public function set recurrenceRange(recurrenceRange:RecurrenceRange):void
		{
			this._recurrenceRange = recurrenceRange;
		}
		/**
		 * 
		 * @return recurrenceGap
		 * 
		 */
		public function get recurrenceGap():int
		{
			return this._recurrenceGap;
		}
		/**
		 * 
		 * @param recurrenceGap set recurrenceGap
		 * 
		 */
		public function set recurrenceGap(recurrenceGap:int):void
		{
			this._recurrenceGap = recurrenceGap;
		}

		
		
	}
}