/*
 * The information in this document is subject to change without notice and 
 * does not represent a commitment by Headstrong Corporation. The software 
 * and/or databases described in this document are furnished under a license 
 * agreement and may be used or copied only in accordance with the terms of 
 * the agreement. 
 * 
 * Copyright © 2010 Headstrong Corporation
 * All rights reserved.
 * 
 * $Id: CacheReloadSchedule.as
 * $Revision: 
 * $Author: NBagchi
 * $DateTime: Aug 26, 2010  
 */
package com.headstrong.teevra.client.view.admin
{
	[RemoteClass(alias="com.headstrong.teevra.services.refdata.eo.CacheReloadScheduleEO")]
	[Bindable]
	public class CacheReloadSchedule
	{
		private var _recurrence:IRecurrence;
		private var _recurrenceType:String;
		private var _titleLabel:String;
		private var _timeLabel:String;
		private var _cacheName:String;
		
		/**
		 * Set the schedule time Label and Title.
		 *
		 * 
		 */
		public function CacheReloadSchedule() 
		{
			titleLabel = "Cache Reload Scheduling";
			timeLabel = "Reload Time";
		}
		/**
		 * 
		 * @return refDataId
		 * 
		 */
		public function get cacheName():String
		{
			return this._cacheName;
		}
		/**
		 * 
		 * @param refDataId set refDataId
		 * 
		 */
		public function set cacheName(cacheName:String):void
		{
			this._cacheName = cacheName;
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