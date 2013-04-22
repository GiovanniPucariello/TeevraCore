package com.headstrong.teevra.client.view.entity
{
	import mx.collections.ArrayCollection;
	
	[RemoteClass(alias="com.headstrong.teevra.services.useradmin.eo.RoleEO")]
	[Bindable]
	/**
	 * 
	 * @author ViswanathP
	 * 
	 */
	public class RoleVO
	{
		/**
		 * Unique identifier for the role
		 */
		private var _roleId:Number;
		/**
		 * Name of the role which is unique
		 */
		private var _roleName:String;
		/**
		 * Description of the role
		 */
		private var _roleDesc:String;
		/**
		 * Status of the role status- ACTIVE/INACTIVE
		 */
		private var _roleStatus:String = "ACTIVE";
		/**
		 * role name who created the role
		 */
		private var _createdBy:String;
		/**
		 * Time when created the role
		 */
		private var _createdDate:Date;
		/**
		 * role name who modified the role
		 */
		private var _modifiedBy:String;
		/**
		 * Time when modified the role
		 */
		private var _modifiedDate:Date;
		/**
	 	 * Comma separated string of all the activity names defined for the role
	 	 */
		private var _activityNames:String;
		/**
		 * Activities assigned for the role
		 */
		private var _activities:ArrayCollection;
	
		/**
		 * 
		 * @return roleId
		 * 
		 */
		public function get roleId():Number
		{
			return _roleId;
		}

		/**
		 * 
		 * @param value set roleId
		 * 
		 */
		public function set roleId(value:Number):void
		{
			_roleId = value;
		}
		
		/**
		 * 
		 * @return roleName
		 * 
		 */
		public function get roleName():String
		{
			return _roleName;
		}

		/**
		 * 
		 * @param value set roleName
		 * 
		 */
		public function set roleName(value:String):void
		{
			_roleName = value;
		}
		/**
		 * 
		 * @return roleDesc
		 * 
		 */
		public function get roleDesc():String
		{
			return _roleDesc;
		}

		/**
		 * 
		 * @param value set roleDesc
		 * 
		 */
		public function set roleDesc(value:String):void
		{
			_roleDesc = value;
		}
		
		/**
		 * 
		 * @return roleStatus
		 * 
		 */
		public function get roleStatus():String
		{
			return _roleStatus;
		}

		/**
		 * 
		 * @param value set roleStatus
		 * 
		 */
		public function set roleStatus(value:String):void
		{
			_roleStatus = value;
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
		/**
		 * 
		 * @return activityNames
		 * 
		 */
		public function get activityNames():String
		{
			return _activityNames;
		}

		/**
		 * 
		 * @param value set activityNames
		 * 
		 */
		public function set activityNames(value:String):void
		{
			_activityNames = value;
		}
			/**
		 * 
		 * @return activities
		 * 
		 */
		public function get activities():ArrayCollection
		{
			return _activities;
		}

		/**
		 * 
		 * @param value set activities
		 * 
		 */
		public function set activities(value:ArrayCollection):void
		{
			_activities = new ArrayCollection();
			for(var i:int=0; i<value.length; i++){
				_activities.addItem(ActivityVO(value[i]));
			}
			//_activities = value;
		}
	}
}