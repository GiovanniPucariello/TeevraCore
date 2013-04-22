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
	import mx.controls.Alert;
	
	[RemoteClass(alias="com.headstrong.teevra.common.scheduling.RecurrenceRange")]
	[Bindable]
	/**
	 * 
	 * @author PAakash
	 * 
	 */
	public class RecurrenceRange
	{
		private var _startDate:Date;
		private var _endDate:Date;
		
		/**
		 * 
		 * Default Constructor
		 * 
		 */	
		public function RecurrenceRange()
		{
		}
		
		/**
		 * 
		 * @return startDate
		 * 
		 */
		public function get startDate():Date
		{
			return this._startDate
		}
		/**
		 * 
		 * @param startDate set startDate
		 * 
		 */
		public function set startDate(value:Date):void
		{
			this._startDate = value;
		}
		/**
		 * 
		 * @return endDate
		 * 
		 */
		public function get endDate():Date
		{
			return this._endDate;
		}
		/**
		 * 
		 * @param endDate set endDate
		 * 
		 */
		public function set endDate(value:Date):void
		{
			this._endDate = value;
		}

	}
}