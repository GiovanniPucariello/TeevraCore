package com.headstrong.teevra.client.view.entity
{
	import mx.collections.ArrayCollection;
	
	[RemoteClass(alias="com.headstrong.teevra.services.schema.eo.MessageSchemaRawEO")]
	[Bindable]
	public class SchemaRawVO
	{
		/**
		 * Unique identifier and also the Id of the schema to which the raw data
	 	 * belongs to 
		 */
		private var _schemaId:Number;
		/**
		 *Formatted(HTML) text of the schema 
		 */
		private var _schemaFormattedText:String;
		/**
		 *User name who created the raw data 
		 */
		private var _createdBy:String;
		/**
		 *Time when created the raw data 
		 */
		private var _createdDate:Date;
		/**
		 *User name who modified the raw data 
		 */
		private var _modifiedBy:String;
		/**
		 *Time when modified the raw data 
		 */
		private var _modifiedDate:Date;
		
		/**
		 * 
		 * @return schemaId
		 * 
		 */
		public function get schemaId():Number
		{
			return _schemaId;
		}
		
		/**
		 * 
		 * @param value set schemaId
		 * 
		 */
		public function set schemaId(value:Number):void
		{
			_schemaId = value;
		}
		
		/**
		 * 
		 * @return schemaFormattedText
		 * 
		 */
		public function get schemaFormattedText():String
		{
			return _schemaFormattedText;
		}
		
		/**
		 * 
		 * @param value set schemaFormattedText
		 * 
		 */
		public function set schemaFormattedText(value:String):void
		{
			_schemaFormattedText = value;
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
