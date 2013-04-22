package com.headstrong.teevra.client.view.entity
{		
	[RemoteClass(alias="com.headstrong.teevra.services.refdata.eo.DataSourceConfigEO")]
	[Bindable]
	
	public class DataSourceConfigVO
	{
		/**
		 * Unique identifier for a Data source configuration
	     * 
		 */
		private var _dataSourceId:Number;
		/**
		 * Data source name 
		 */
		private var _dataSourceName:String;
		/**
		 * URL of the data base
		 */
		private var _dbUrl:String;
		/**
		 * Data base user name
		 */
		private var _dbUsername:String;
		/**
		 * Data base password
		 */
		private var _dbPassword:String;
		/**
		 *  Type of the data base
		 */
		private var _dbType:String;
		/**
		*User name who created the data source configuration 
		*/
		private var _createdBy:String;
		/**
		 *Time when created the data source configuration 
		 */
		private var _createdDate:Date;
		/**
		 *User name who modified the data source dataconfiguration 
		 */
		private var _modifiedBy:String;
		/**
		 *Time when modified the data source configuration 
		 */
		private var _modifiedDate:Date;
		
		/**
		 * 
		 * @return dataSourceId
		 * 
		 */
		public function get dataSourceId():Number
		{
			return _dataSourceId;
		}

		/**
		 * 
		 * @param value set dataSourceId
		 * 
		 */
		public function set dataSourceId(value:Number):void
		{
			_dataSourceId = value;
		}
		/**
		 * 
		 * @return dataSourceName
		 * 
		 */
		public function get dataSourceName():String
		{
			return _dataSourceName;
		}

		/**
		 * 
		 * @param value set dataSourceName
		 * 
		 */
		public function set dataSourceName(value:String):void
		{
			_dataSourceName = value;
		}

		/**
		 * 
		 * @return dbUrl
		 * 
		 */
		public function get dbUrl():String
		{
			return _dbUrl;
		}

		/**
		 * 
		 * @param value set dbUrl
		 * 
		 */
		public function set dbUrl(value:String):void
		{
			_dbUrl = value;
		}
		
		/**
		 * 
		 * @return dbUsername
		 * 
		 */
		public function get dbUsername():String
		{
			return _dbUsername;
		}

		/**
		 * 
		 * @param value set dbUsername
		 * 
		 */
		public function set dbUsername(value:String):void
		{
			_dbUsername = value;
		}
		
		
		/**
		 * 
		 * @return dbPassword
		 * 
		 */
		public function get dbPassword():String
		{
			return _dbPassword;
		}

		/**
		 * 
		 * @param value set dbPassword
		 * 
		 */
		public function set dbPassword(value:String):void
		{
			_dbPassword = value;
		}
		
		/**
		 * 
		 * @return dbType
		 * 
		 */
		public function get dbType():String
		{
			return _dbType;
		}

		/**
		 * 
		 * @param value set dbType
		 * 
		 */
		public function set dbType(value:String):void
		{
			_dbType = value;
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
