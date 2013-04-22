package com.headstrong.teevra.client.view.entity
{
	
	[RemoteClass(alias="com.headstrong.teevra.services.useradmin.eo.ActivityEO")]
	[Bindable]
	/**
	 * 
	 * @author ViswanathP
	 * 
	 */
	 
	public class ActivityVO
	{
		/**
		 * Unique identifier for the activity
		 */
		private var _activityId:Number;
		/**
		 * Name of the activity which is unique
		 */
		private var _activityName:String;
		/**
		 * Activity Description
		 */
		private var _activityDesc:String;
		/**
		 * activity status- ACTIVE/INACTIVE
		 */
		private var _activityStatus:String = "ACTIVE";
		/**
		 * User name who created the activity
		 */
		private var _createdBy:String;
		/**
		 * Time when created the activity
		 */
		private var _createdDate:Date;
		/**
		 * User name who modified the activity
		 */
		private var _modifiedBy:String;
		/**
		 * Time when modified the activity
		 */
		private var _modifiedDate:Date;
		
		/**
		 * 
		 * @return activityId
		 * 
		 */
		public function get activityId():Number
		{
			return _activityId;
		}

		/**
		 * 
		 * @param value set activityId
		 * 
		 */
		public function set activityId(value:Number):void
		{
			_activityId = value;
		}
		
		/**
		 * 
		 * @return activityName
		 * 
		 */
		public function get activityName():String
		{
			return _activityName;
		}

		/**
		 * 
		 * @param value set activityName
		 * 
		 */
		public function set activityName(value:String):void
		{
			_activityName = value;
		}

		/**
		 * 
		 * @return activityDesc
		 * 
		 */
		public function get activityDesc():String
		{
			return _activityDesc;
		}

		/**
		 * 
		 * @param value set activityDesc
		 * 
		 */
		public function set activityDesc(value:String):void
		{
			_activityDesc = value;
		}
		
		/**
		 * 
		 * @return activityStatus
		 * 
		 */
		public function get activityStatus():String
		{
			return _activityStatus;
		}

		/**
		 * 
		 * @param value set activityStatus
		 * 
		 */
		public function set activityStatus(value:String):void
		{
			_activityStatus = value;
		}

		/**
		 * 
		 * @return createdBy
		 * 
		 */
		public function get createdBy():String
		{
			return _createdBy;
		}

		/**
		 * 
		 * @param value  set createdBy
		 * 
		 */
		public function set createdBy(value:String):void
		{
			_createdBy = value;
		}

		/**
		 * 
		 * @return createdDate
		 * 
		 */
		public function get createdDate():Date
		{
			return _createdDate;
		}

		/**
		 * 
		 * @param value set createdDate
		 * 
		 */
		public function set createdDate(value:Date):void
		{
			_createdDate = value;
		}
		
		/**
		 * 
		 * @return modifiedBy
		 * 
		 */
		public function get modifiedBy():String
		{
			return _modifiedBy;
		}

		/**
		 * 
		 * @param value set modifiedBy
		 * 
		 */
		public function set modifiedBy(value:String):void
		{
			_modifiedBy = value;
		}

		/**
		 * 
		 * @return modifiedDate
		 * 
		 */
		public function get modifiedDate():Date
		{
			return _modifiedDate;
		}

		/**
		 * 
		 * @param value set modifiedDate
		 * 
		 */
		public function set modifiedDate(value:Date):void
		{
			_modifiedDate = value;
		}
		
	}
}