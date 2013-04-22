package com.headstrong.teevra.components.common
{
	import mx.collections.ArrayCollection;
	import mx.containers.Grid;
	import mx.containers.VBox;
	import mx.controls.RichTextEditor;
	import mx.controls.TextArea;
	import mx.core.ClassFactory;
	
	public class GridConfigFormatterForm extends VBox
	{
		private var _fieldDefinitions:ArrayCollection;
		private var grid:Grid;
		private var box:VBox;
		private var comboItemRenderer:ClassFactory;
		private var _initialNumRows:int = 5;
		private var sequenceHolder:int = 0;
		private var configData:ArrayCollection;
				
		public function GridConfigFormatterForm(fieldDefs : ArrayCollection)
		{
			super();
			this.fieldDefinitions = fieldDefs;
			init();
		}
		
		public function getUserSpecifiedValues() : String
		{
				var richText:RichTextEditor= RichTextEditor(this.getChildAt(0));
				return richText.text;
		}
		public function setTabularData(complexValue:String) : void
		{
			var richText:RichTextEditor= RichTextEditor(this.getChildAt(0));
			richText.text = complexValue;
			
		}
		
		private function init():void
		{
			addBlankRow();
		}
		private function addBlankRow():void
		{
			var richText:RichTextEditor = new RichTextEditor();
			richText.height=300;
			richText.percentWidth=100;
			this.addChild(richText);
		}
		public function get fieldDefinitions() : ArrayCollection
		{
			return _fieldDefinitions;
		} 
		
		public function set fieldDefinitions(value:ArrayCollection) : void
		{
			this._fieldDefinitions = value;
		}
		
		public function get initialNumRows() : int
		{
			return _initialNumRows;
		} 
		
		public function set initialNumRows(value:int) : void
		{
			this._initialNumRows = value;
		}

		
	}
}