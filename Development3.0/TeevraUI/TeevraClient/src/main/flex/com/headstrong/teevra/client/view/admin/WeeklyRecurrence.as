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
 * $Id: WeeklyRecurrence.as
 * $Revision: 
 * $Author: PAakash
 * $DateTime: Dec 19, 2008  
 */
package com.headstrong.teevra.client.view.admin
{
	import mx.collections.ArrayCollection;
	import mx.controls.List;
	
	
	[RemoteClass(alias="com.headstrong.teevra.common.scheduling.WeeklyRecurrence")]
	[Bindable]
	/**
	 * 
	 * @author PAakash
	 * 
	 */
	public class WeeklyRecurrence extends AbstractRecurrence
	{
		public static const SUNDAY:int=1;
		public static const MONDAY:int = 2;
		public static const TUESDAY:int = 3;
		public static const WEDNESDAY:int = 4; 
		public static const THURSDAY:int = 5;
		public static const FRIDAY:int = 6;
		public static const SATURDAY:int = 7;
		private var _daysOfWeek:ArrayCollection
		
		/**
		 * 
		 * @return daysOfWeek
		 * 
		 */
		public function get daysOfWeek():ArrayCollection
		{
			return this._daysOfWeek;
		}
		/**
		 * 
		 * @param daysOfWeek set daysOfWeek
		 * 
		 */
		public function set daysOfWeek(daysOfWeek:ArrayCollection):void
		{
			this._daysOfWeek = daysOfWeek;
		}
		
		
		/**
		 * WeeklyRecurrence constructor
		 * 
		 */
		public function WeeklyRecurrence()
		{
		}

	}
}