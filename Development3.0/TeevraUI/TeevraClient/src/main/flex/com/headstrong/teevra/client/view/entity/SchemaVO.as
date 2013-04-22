package com.headstrong.teevra.client.view.entity
{
	import mx.collections.ArrayCollection;
	
	[RemoteClass(alias="com.headstrong.teevra.services.schema.eo.MessageSchemaEO")]
	[Bindable]
	/**
	 * 
	 * @author PAakash
	 * 
	 */
	public class SchemaVO
	{
		/**
		 *Unique identifier for a schema 
		 */
		private var _schemaId:Number;
		/**
		 *Uniquely identifies a schema. 
		 */
		private var _schemaName:String;
		/**
		 *Describes the schema 
		 */
		private var _schemaDesc:String;
		/**
		 *Specifies if the schema is a public or not. Public schemas are visible to
	 	 * all 
		 */
		private var _schemaIsPublic:Boolean;
		/**
		 *Specifies if the schema is a primitive type or not. Primitive types form
		 * the leaf level nodes in the schema tree. 
		 */
		private var _schemaIsPrimitive:Boolean;
		/**
		 *Identifies the parent class from whom it has inherited all the
	 	 * attributes 
		 */
		private var _parentSchemaId:Number;
		/**
		 * User name who created the schema 
		 */
		private var _createdBy:String;
		/**
		 *Time when created the schema 
		 */
		private var _createdDate:Date;
		/**
		 *User name who modified the schema 
		 */
		private var _modifiedBy:String;
		/**
		 *Time when modified the schema 
		 */
		private var _modifiedDate:Date;
		/**
		 *Attributes present in the current schema 
		 */
		private var _attributes:ArrayCollection;
		/**
		 *SchemaRawVO which contains the raw data of the schema 
		 */
		private var _schemaRaw:SchemaRawVO;
	
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
		 * @return schemaName
		 * 
		 */
		public function get schemaName():String
		{
			return _schemaName;
		}

		/**
		 * 
		 * @param value set schemaName
		 * 
		 */
		public function set schemaName(value:String):void
		{
			_schemaName = value;
		}

		/**
		 * 
		 * @return schemaDesc
		 * 
		 */
		public function get schemaDesc():String
		{
			return _schemaDesc;
		}

		/**
		 * 
		 * @param value set schemaDesc
		 * 
		 */
		public function set schemaDesc(value:String):void
		{
			_schemaDesc = value;
		}
		
		/**
		 * 
		 * @return schemaIsPublic
		 * 
		 */
		public function get schemaIsPublic():Boolean
		{
			return _schemaIsPublic;
		}

		/**
		 * 
		 * @param value set schemaIsPublic
		 * 
		 */
		public function set schemaIsPublic(value:Boolean):void
		{
			_schemaIsPublic = value;
		}

		/**
		 * 
		 * @return schemaIsPrimitive
		 * 
		 */
		public function get schemaIsPrimitive():Boolean
		{
			return _schemaIsPrimitive;
		}

		/**
		 * 
		 * @param value set schemaIsPrimitive
		 * 
		 */
		public function set schemaIsPrimitive(value:Boolean):void
		{
			_schemaIsPrimitive = value;
		}

		/**
		 * 
		 * @return parentSchemaId
		 * 
		 */
		public function get parentSchemaId():Number
		{
			return _parentSchemaId;
		}

		/**
		 * 
		 * @param value set parentSchemaId
		 * 
		 */
		public function set parentSchemaId(value:Number):void
		{
			_parentSchemaId = value;
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
		 * @return attributes
		 * 
		 */
		public function get attributes():ArrayCollection
		{
			return _attributes;
		}

		/**
		 * 
		 * @param value set attributes
		 * 
		 */
		public function set attributes(value:ArrayCollection):void
		{
			_attributes = value;
		}

		/**
		 * 
		 * @return SchemaRawVO
		 * 
		 */
		public function get schemaRaw():SchemaRawVO
		{
			return _schemaRaw;
		}

		/**
		 * 
		 * @param value set SchemaRawVO
		 * 
		 */
		public function set schemaRaw(value:SchemaRawVO):void
		{
			_schemaRaw = value;
		}

	}
}
