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
 * $Id: ProcessSchedule.as
 * $Revision: 
 * $Author: PAakash
 * $DateTime: Dec 19, 2008  
 */
package com.headstrong.teevra.client.view.admin
{
	[RemoteClass(alias="com.headstrong.teevra.services.processadmin.eo.ProcessScheduleEO")]
	[Bindable]
	public class ProcessSchedule
	{
		private var _prcsId:Number;
		private var _recurrence:IRecurrence;
		private var _recurrenceType:String;
		private var _titleLabel:String;
		private var _timeLabel:String;
		
		/**
		 * Set the schedule time Label and Title.
		 *
		 * 
		 */
		public function ProcessSchedule() 
		{
			_titleLabel = "Process Scheduling";
			_timeLabel = "Process Time";
		}
		/**
		 * 
		 * @return processId
		 * 
		 */
		public function get prcsId():Number
		{
			return this._prcsId;
		}
		/**
		 * 
		 * @param prcsId set prcsId
		 * 
		 */
		public function set prcsId(prcsId:Number):void
		{
			this._prcsId=prcsId;
		}
		/**
		 * 
		 * @return reccurence
		 * 
		 */
		public function get recurrence():IRecurrence
		{
			return this._recurrence;
		} 
		/**
		 * 
		 * @param reccurence set reccurence
		 * 
		 */
		public function set recurrence(reccurence:IRecurrence):void
		{
			this._recurrence=reccurence;
		}
		/**
		 * 
		 * @return recurrenceType
		 * 
		 */
		public function get recurrenceType():String
		{
			return _recurrenceType;
		}
		/**
		 * 
		 * @param value recurrenceType
		 * 
		 */
		public function set recurrenceType(value:String):void
		{
			this._recurrenceType = value;
			 
		}
		
		/**
		 * 
		 * @return titleLabel
		 * 
		 */
		public function get titleLabel():String
		{
			return _titleLabel;
		}
		/**
		 * 
		 * @param value titleLabel
		 * 
		 */
		public function set titleLabel(value:String):void
		{
			this._titleLabel = value;
			 
		}
		/**
		 * 
		 * @return timeLabel
		 * 
		 */
		public function get timeLabel():String
		{
			return _timeLabel;
		}
		/**
		 * 
		 * @param value timeLabel
		 * 
		 */
		public function set timeLabel(value:String):void
		{
			this._timeLabel = value;
			 
		}
	}
}