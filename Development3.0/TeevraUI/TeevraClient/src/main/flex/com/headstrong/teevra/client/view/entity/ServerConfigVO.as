package com.headstrong.teevra.client.view.entity
{
	import mx.collections.ArrayCollection;
	
	[RemoteClass(alias="com.headstrong.teevra.services.serveradmin.eo.ServerConfigEO")]
	[Bindable]
	public class ServerConfigVO
	{
	   /**
		* Unique identifier for a server
	    */	 
		private var _serverId:Number 
	   /**
		* Unique name for the server
		*/
		private var _serverName:String;
	   /**
		* URL of the server
		*/
		private var _serverUrl:String;
	    /**
		*User name who created the server configuration 
		*/
		private var _createdBy:String;
		/**
		 *Time when created the server configuration 
		 */
		private var _createdDate:Date;
		/**
		 *User name who modified the server configuration 
		 */
		private var _modifiedBy:String;
		/**
		 *Time when modified the server configuration 
		 */
		private var _modifiedDate:Date;
		
		/**
		 *  
		 * @return serverId
		 * 
		 */
		public function get serverId():Number
		{
			return _serverId;
		}
		/**
		 * 
		 * @param value set schemaId
		 * 
		 */
		public function set serverId(value:Number):void
		{
			_serverId = value;
		}
		
		/**
		 * 
		 * @return serverName
		 * 
		 */
		public function get serverName():String
		{
			return _serverName;
		}
		/**
		 * 
		 * @param value set serverName
		 * 
		 */
		public function set serverName(value:String):void
		{
			_serverName = value;
		}
		
		/**
		 * 
		 * @return serverUrl
		 * 
		 */
		public function get serverUrl():String
		{
			return _serverUrl;
		}
		/**
		 * 
		 * @param value set serverUrl
		 * 
		 */
		public function set serverUrl(value:String):void
		{
			_serverUrl = value;
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
		 * @param value set createdBy
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