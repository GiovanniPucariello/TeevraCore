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
 * $Id: DailyRecurrence.as
 * $Revision: 
 * $Author: PAakash
 * $DateTime: Dec 19, 2008  
 */
package com.headstrong.teevra.client.view.admin
{
	[RemoteClass(alias="com.headstrong.teevra.common.scheduling.DailyRecurrence")]
	[Bindable]
	/**
	 * 
	 * @author PAakash
	 * 
	 */
	public class DailyRecurrence extends AbstractRecurrence
	{
		private var _runOnWeekDay:Boolean;
		
		/**
		 * 
		 * @return runOnWeekDay get runOnWeekDay
		 * 
		 */
		public function get runOnWeekDay():Boolean
		{
			return this._runOnWeekDay;
		}
		/**
		 * 
		 * @param runOnWeekDay set runOnWeekDay
		 * 
		 */
		public function set runOnWeekDay(runOnWeekDay:Boolean):void
		{
			this._runOnWeekDay = runOnWeekDay;
		}
		
		

	}
}