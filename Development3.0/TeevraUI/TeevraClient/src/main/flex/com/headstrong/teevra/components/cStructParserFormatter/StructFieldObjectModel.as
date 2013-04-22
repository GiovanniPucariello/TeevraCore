package com.headstrong.teevra.components.cStructParserFormatter
{
	/**
	 * Object model for every field in the struct */
	public class StructFieldObjectModel
	{
		private var _sequence:int;
		private var _fieldName:String;
		private var _datatype:String;
		private var _length:int;
		private var _structObjectModel:StructObjectModel;
		
		public function StructFieldObjectModel()
		{
		}

		/**
		 * Returns index / order of this field in parent structure
		 */
		public function get sequence():int {
			return _sequence;	
		}
		
		/** 
		 * Sets the order */
		public function set sequence(s:int):void {
			_sequence = s;			
		}

		/**
		 * Returns the name of the field
		 */
		public function get fieldName():String {
			return _fieldName;
		}
		
		/**
		 * Sets the name of the field
		 */
		public function set fieldName(name:String):void {
			_fieldName = name;
		}
		
		/**
		 * Returns the datatype of the field
		 */
		public function get datatype():String {
			return _datatype;	
		}
		
		public function set datatype(type:String):void {
			_datatype = type;
		}
		
		/**
		 * Returns the length of the field. 
		 * Field is considered to be an array of that datatype if a value is specified for this*/ 
		public function get length():int {
			return _length;
		}
		
		public function set length(len:int):void {
			_length = len;
		}
		public function get structObjectModel():StructObjectModel {
			return _structObjectModel;
		}
		
		public function set structObjectModel(value:StructObjectModel):void {
			_structObjectModel = value;
		}
		
	}
}