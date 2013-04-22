package com.headstrong.teevra.components.common
{
	import mx.collections.ArrayCollection;
	
	public class GridConfigField
	{
		public static const TEXT_FIELD:String = "TEXT";
		public static const LIST_FIELD:String = "LIST";
		public static const EDITABLE_LIST_FIELD:String = "EDITABLE_LIST";
		public static const LOOKUP_FIELD:String = "LOOKUP";
		public static const SEQUENCE_NUMBER_FIELD:String = "SEQUENCE_NUMBER";
		public static const TEXT_AREA:String = "TEXT_AREA";
		public static const VALIDATION_TYPE:String = "text";
		public static const COMPLEX_FIELD:String="COMPLEX_FIELD";
		
		private var _name:String;
		private var _label:String;
		private var _type:String;
		private var _lookups:ArrayCollection;
		private var _validate:String;
		private var _observer:Function;
		private var _independent:Boolean = false;
		private var _comboLabelField:String=null;
		
		private var _fieldHeight:int;
		private var _fieldWidth:int;
		private var _fieldPercentHeight:int = -1;
		private var _fieldPercentWidth:int = -1;
		
		public function GridConfigField()
		{
		}
		
		public function get name():String
		{
			return _name;
		}

		public function set name(value:String):void
		{
			_name = value;
		}
		
		public function get label():String
		{
			return _label;
		}

		public function set label(value:String):void
		{
			_label = value;
		}
		
		public function get type():String
		{
			return _type;
		}

		public function set type(value:String):void
		{
			_type = value;
		}

		public function get lookups():ArrayCollection
		{
			return _lookups;
		}

		public function set lookups(value:ArrayCollection):void
		{
			_lookups = value;
		}
		
		public function get fieldHeight():int
		{
			return _fieldHeight;
		}

		public function set fieldHeight(value:int):void
		{
			_fieldHeight = value;
		}
		
		public function get fieldWidth():int
		{
			return _fieldWidth;
		}

		public function set fieldWidth(value:int):void
		{
			_fieldWidth = value;
		}

		public function get fieldPercentHeight():int
		{
			return _fieldPercentHeight;
		}

		public function set fieldPercentHeight(value:int):void
		{
			_fieldPercentHeight = value;
		}
		
		public function get fieldPercentWidth():int
		{
			return _fieldPercentWidth;
		}

		public function set fieldPercentWidth(value:int):void
		{
			_fieldPercentWidth = value;
		}
		public function get validate():String
		{
			return this._validate;
		}
		public function set validate(vali:String):void
		{
			this._validate = vali;
		}
		public function get observer():Function
		{
			return this._observer;
		}
		public function set observer(name:Function):void
		{
			this._observer = name;
		}
		
		public function get independent():Boolean
		{
			return this._independent;
		}
		public function set independent(indep:Boolean):void
		{
			this._independent = indep;
		}

		public function get comboLabelField():String
		{
			return this._comboLabelField;
		}
		public function set comboLabelField(labelField:String):void
		{
			this._comboLabelField = labelField;
		}

		public static function getSampleFields():ArrayCollection
		{
			var coll:ArrayCollection = new ArrayCollection();
			var field:GridConfigField = new GridConfigField();
			field.label = "Schema Attribute";
			field.name = "schemaAttribute";
//			field.type = GridConfigField.LIST_FIELD;
			field.type = GridConfigField.EDITABLE_LIST_FIELD;
			var attributes:ArrayCollection = new ArrayCollection();
			attributes.addItem("tradeId");
			attributes.addItem("activity");
			attributes.addItem("contraTradeId");
			attributes.addItem("yourPartyId");
			attributes.addItem("contraPartyId");
			attributes.addItem("productType.exercise.adjustedDate.unadjustedDate");
			field.lookups = attributes;
			coll.addItem(field);
			
			field = new GridConfigField();
			field.label = "XPath in input XML";
			field.name = "xpath";
			field.type = GridConfigField.TEXT_FIELD;
			coll.addItem(field);
			
			return coll;
		}
	}
}