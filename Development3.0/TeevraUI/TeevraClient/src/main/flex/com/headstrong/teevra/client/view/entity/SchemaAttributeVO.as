package com.headstrong.teevra.client.view.entity
{
	import mx.collections.ArrayCollection;
	
	[RemoteClass(alias="com.headstrong.teevra.services.schema.eo.MessageSchemaAttributeEO")]
	[Bindable]
	public class SchemaAttributeVO
	{
		/**
		 *Unique identifier for an attribute 
		 */
		private var _schemaAttrId:Number;
		/**
		 *Associates the attribute to the schema 
		 */
		private var _schemaId:Number;
		/**
		 * Schema name which the attribute associates to 
		 */
		/**
		 ** Unique name within the schema. 
		 */
		private var _schemaAttrName:String;
		/**
		 * Type of the attribute(id) 
		 */
		private var _schemaAttrType:Number;
		/**
		 *Specifies if the attribute is part of the key attributes 
		 */
		private var _schemaAttrIsKey:Boolean;
		/**
		 *Specifies the relation this attribute shares with the parent schema 
		 */
		private var _schemaAttrRelation:String;
		/**
		 *dentifies the intermediate schema that will be used in a many to many
	     * relationship to map two different entities. 
		 */
		private var _schemaM2MType:Number;	
		/**
		 *User name who created the attribute 
		 */
		private var _createdBy:String;
		/**
		 *Time when created the attribute 
		 */
		private var _createdDate:Date;
		/**
		 *User name who modified the attribute 
		 */
		private var _modifiedBy:String;
		/**
		 *Time when modified the attribute 
		 */
		private var _modifiedDate:Date;
		
		/**
		 * 
		 * @return schemaAttrId
		 * 
		 */
		public function get schemaAttrId():Number
		{
			return _schemaAttrId;
		}

		/**
		 * 
		 * @param value set schemaAttrId
		 * 
		 */
		public function set schemaAttrId(value:Number):void
		{
			_schemaAttrId = value;
		}
		
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
		 * @return schemaAttrName
		 * 
		 */
		public function get schemaAttrName():String
		{
			return _schemaAttrName;
		}

		/**
		 * 
		 * @param value set schemaAttrName
		 * 
		 */
		public function set schemaAttrName(value:String):void
		{
			_schemaAttrName = value;
		}

		/**
		 * 
		 * @return schemaAttrType
		 * 
		 */
		public function get schemaAttrType():Number
		{
			return _schemaAttrType;
		}

		/**
		 * 
		 * @param value set schemaAttrType
		 * 
		 */
		public function set schemaAttrType(value:Number):void
		{
			_schemaAttrType = value;
		}

		/**
		 * 
		 * @return schemaAttrIsKey
		 * 
		 */
		public function get schemaAttrIsKey():Boolean
		{
			return _schemaAttrIsKey;
		}

		/**
		 * 
		 * @param value set schemaAttrIsKey
		 * 
		 */
		public function set schemaAttrIsKey(value:Boolean):void
		{
			_schemaAttrIsKey = value;
		}

		/**
		 * 
		 * @return schemaAttrRelation
		 * 
		 */
		public function get schemaAttrRelation():String
		{
			return _schemaAttrRelation;
		}

		/**
		 * 
		 * @param value set schemaAttrRelation
		 * 
		 */
		public function set schemaAttrRelation(value:String):void
		{
			_schemaAttrRelation = value;
		}

		/**
		 * 
		 * @return schemaM2MType
		 * 
		 */
		public function get schemaM2MType():Number
		{
			return _schemaM2MType;
		}

		/**
		 * 
		 * @param value set schemaM2MType
		 * 
		 */
		public function set schemaM2MType(value:Number):void
		{
			_schemaM2MType = value;
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