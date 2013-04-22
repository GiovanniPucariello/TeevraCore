package com.headstrong.teevra.client.view.entity
{
	import mx.collections.ArrayCollection;
	
	[RemoteClass(alias="com.headstrong.teevra.services.useradmin.eo.UserEO")]
	[Bindable]
	/**
	 * 
	 * @author ViswanathP
	 * 
	 */
	 
	public class UserVO
	{
		/**
		 * Unique identifier for the user
		 */
		private var _userId:Number;
		/**
		 * Name of the user which is unique
		 */
		private var _userName:String;
		/**
		 * First name of the user
		 */
		private var _userFirstName:String;
		/**
		 * Last name of the user
		 */
		private var _userLastName:String;
		/**
		 * Email address of the user
		 */
		private var _emailId:String;
		/**
		 * Password
		 */
		private var _password:String;
		/**
		 * user account status- ACTIVE/INACTIVE
		 */
		private var _userStatus:String = "ACTIVE";
		/**
		 * User name who created the user
		 */
		private var _createdBy:String;
		/**
		 * Time when created the user
		 */
		private var _createdDate:Date;
		/**
		 * User name who modified the user
		 */
		private var _modifiedBy:String;
		/**
		 * Time when modified the user
		 */
		private var _modifiedDate:Date;
		/**
		 * Roles assigned for the user 
		 */
		private var _roles:ArrayCollection;
		/**
	 	 * Comma separated string of all role names of the user
	 	 */
		private var _roleNames:String;		
		/**
	 	 * List of all activity id's assigned or mapped to the user
	 	 */	
		private var  _activityIds:ArrayCollection;
		/**
		 * Whether the user has admin previliges
		 */
		private var  _isAdmin:Boolean;

		/**
		 * 
		 * @return userId
		 * 
		 */
		public function get userId():Number
		{
			return _userId;
		}

		/**
		 * 
		 * @param value set userId
		 * 
		 */
		public function set userId(value:Number):void
		{
			_userId = value;
		}
		
		/**
		 * 
		 * @return userName
		 * 
		 */
		public function get userName():String
		{
			return _userName;
		}

		/**
		 * 
		 * @param value set userName
		 * 
		 */
		public function set userName(value:String):void
		{
			_userName = value;
		}

		/**
		 * 
		 * @return userFirstName
		 * 
		 */
		public function get userFirstName():String
		{
			return _userFirstName;
		}

		/**
		 * 
		 * @param value set userFirstName
		 * 
		 */
		public function set userFirstName(value:String):void
		{
			_userFirstName = value;
		}
		
		/**
		 * 
		 * @return userLastName
		 * 
		 */
		public function get userLastName():String
		{
			return _userLastName;
		}

		/**
		 * 
		 * @param value set userLastName
		 * 
		 */
		public function set userLastName(value:String):void
		{
			_userLastName = value;
		}
		
		/**
		 * 
		 * @return emailId
		 * 
		 */
		public function get emailId():String
		{
			return _emailId;
		}

		/**
		 * 
		 * @param value set emailId
		 * 
		 */
		public function set emailId(value:String):void
		{
			_emailId = value;
		}
		
		/**
		 * 
		 * @return password
		 * 
		 */
		public function get password():String
		{
			return _password;
		}

		/**
		 * 
		 * @param value set password
		 * 
		 */
		public function set password(value:String):void
		{
			_password = value;
		}
		
		/**
		 * 
		 * @return userStatus
		 * 
		 */
		public function get userStatus():String
		{
			return _userStatus;
		}

		/**
		 * 
		 * @param value set userStatus
		 * 
		 */
		public function set userStatus(value:String):void
		{
			_userStatus = value;
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
		 * @return activityIds
		 * 
		 */
		public function get activityIds():ArrayCollection
		{
			return _activityIds;
		}

		/**
		 * 
		 * @param value set activityIds
		 * 
		 */
		public function set activityIds(value:ArrayCollection):void
		{
			_activityIds = value;
		}
		
		/**
		 * 
		 * @return roleNames
		 * 
		 */
		public function get roleNames():String
		{
			return _roleNames;
		}

		/**
		 * 
		 * @param value set roleNames
		 * 
		 */
		public function set roleNames(value:String):void
		{
			_roleNames = value;
		}
		/**
		 * 
		 * @return roles
		 * 
		 */
		public function get roles():ArrayCollection
		{
			return _roles;
		}

		/**
		 * 
		 * @param value set roles
		 * 
		 */
		public function set roles(value:ArrayCollection):void
		{
			_roles = new ArrayCollection();
			for(var i:int=0; i<value.length; i++){
				_roles.addItem(RoleVO(value[i]));
			}
			//_roles = value;
		}
		
		/**
		 * 
		 * @return isAdmin
		 * 
		 */
		public function get isAdmin():Boolean
		{
			return _isAdmin;
		}

		/**
		 * 
		 * @param value set isAdmin
		 * 
		 */
		public function set isAdmin(value:Boolean):void
		{
			_isAdmin = value;
		}
	}
}