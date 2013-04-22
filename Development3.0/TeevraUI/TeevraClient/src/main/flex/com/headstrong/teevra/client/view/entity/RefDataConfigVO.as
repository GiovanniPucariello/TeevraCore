package com.headstrong.teevra.client.view.entity
{	
	[RemoteClass(alias="com.headstrong.teevra.services.refdata.eo.RefDataConfigEO")]
	[Bindable]
	
	public class RefDataConfigVO
	{
		/**
		 * Unique identifier for a refdata configuration
		 */
		 private var _refDataId:Number;
		/**
		 * Refdata name 
		 */
		private var _refDataName:String;
		/**
		 * Identifier of the dataSource it associates with
		 */
		private var _dataSourceId:Number;
		/**
		 * Name of the dataSource it associates with
		 */
		private var _dataSourceName:String;
		/**
		 * Query for the ref data
		 */
		private var _refDataQuery:String;
		/**
		*User name who created the reference data configuration 
		*/
		private var _createdBy:String;
		/**
		 *Time when created the reference data configuration 
		 */
		private var _createdDate:Date;
		/**
		 *User name who modified the reference dataconfiguration 
		 */
		private var _modifiedBy:String;
		/**
		 *Time when modified the reference data configuration 
		 */
		private var _modifiedDate:Date;
		
		/**
		 * 
		 * @return refDataId
		 * 
		 */
		public function get refDataId():Number
		{
			return _refDataId;
		}

		/**
		 * 
		 * @param value set refDataId
		 * 
		 */
		public function set refDataId(value:Number):void
		{
			_refDataId = value;
		}
		
		/**
		 * 
		 * @return refDataName
		 * 
		 */
		public function get refDataName():String
		{
			return _refDataName;
		}

		/**
		 * 
		 * @param value set refDataName
		 * 
		 */
		public function set refDataName(value:String):void
		{
			_refDataName = value;
		}

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
		 * @return refDataQuery
		 * 
		 */
		public function get refDataQuery():String
		{
			return _refDataQuery;
		}

		/**
		 * 
		 * @param value set refDataQuery
		 * 
		 */
		public function set refDataQuery(value:String):void
		{
			_refDataQuery = value;
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
