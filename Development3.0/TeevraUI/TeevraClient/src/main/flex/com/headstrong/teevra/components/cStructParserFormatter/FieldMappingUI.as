package com.headstrong.teevra.components.cStructParserFormatter
{
	import com.headstrong.teevra.components.common.GridConfigField;
	import com.headstrong.teevra.components.common.GridConfigForm;
	
	import flash.events.Event;
	
	import mx.collections.ArrayCollection;
	import mx.containers.VBox;
	import mx.controls.Alert;
	import mx.controls.ComboBox;

	/**
	 * UI to map fields in the schema to fields in the structure 
	 */	
	public class FieldMappingUI extends VBox
	{
		/** Configuration key for structFormatterConfig that contains schema field to struct field mapping */
		private const CONFIG_KEY_STRUCT_FORMATTER_CONFIG:String = "structFormatterConfig";

		//indexes of columns in the UI, tab: Field Mapping
		private const SCHEMA_FIELD_INDEX:int = 0;		
		private const STRUCT_FIELD_INDEX:int=1;

		//Specifications for individual fields / columns shown in the UI, tab:Structure Definition
		private const FLD_SCHEMA_FIELD_LBL_KEY:String="configField.CStructParser.fieldMapping.schemaField";
		private const FLD_SCHEMA_FIELD_NAME:String="schemaField";
		private const FLD_SCHEMA_FIELD_TYPE:String=GridConfigField.EDITABLE_LIST_FIELD;
		private const FLD_SCHEMA_FIELD_WIDTH:int=150;

		private const FLD_STRUCT_FIELD_LBL_KEY:String="configField.CStructParser.fieldMapping.structField";
		private const FLD_STRUCT_FIELD_NAME:String="structField";
		private const FLD_STRUCT_FIELD_TYPE:String=GridConfigField.EDITABLE_LIST_FIELD;
		private const FLD_STRUCT_FIELD_WIDTH:int=150;

		private var configForm:GridConfigForm;
		private var structHolder:StructHolder;
		private var schemaAttributes:ArrayCollection = new ArrayCollection();
		private var structAttributes:ArrayCollection = new ArrayCollection();
		
		public function FieldMappingUI(structHolder:StructHolder)
		{
			super();
			this.label = "Field Mapping";
			this.structHolder = structHolder;
		}
		
		public function initUI():void {
			addConfigFields();
			this.addChild(configForm);
		}
		
		/**
		 * Sets attribute list for the selected Schema when the user changes selection from the drop down
		 */
		public function setSchemaAttributesOnChange(event:Event):void
		{
			configForm.setSchemaAttributes(ComboBox(event.currentTarget).text, 
				schemaAttributes, false, SCHEMA_FIELD_INDEX);
		}


		/**
		 * Sets attribute list for the selected Schema when the user changes selection from the drop down
		 */
		public function setSchemaAttributes(schemaName:String, flag:Boolean):void
		{
			configForm.setSchemaAttributes(schemaName, 
				schemaAttributes, flag, SCHEMA_FIELD_INDEX);
		}

		/**
		 * Sets attribute list for the selected structure when the user changes selection from the drop down
		 */
		public function setStructAttributesOnChange(event:Event):void
		{
			structAttributes.removeAll();
			structHolder.getDottedFieldNames(ComboBox(event.currentTarget).text, structAttributes);
			configForm.setSelectedIndex(STRUCT_FIELD_INDEX, false);
		}

		/**
		 * Sets attribute list for the selected Schema when the user changes selection from the drop down
		 */
		public function setStructAttributes(structName:String):void
		{
			structAttributes.removeAll();
			structHolder.getDottedFieldNames(structName, structAttributes);
			configForm.setSelectedIndex(STRUCT_FIELD_INDEX, true);
		}

		/**
		 * Creates the container that has fields for each of the field mapping required for the component.
		 */
		private function addConfigFields():void {
			configForm = new GridConfigForm(getConfigFields());
			configForm.percentWidth = 90;
		}		

		/**
		 * Constructs the field models that need to be used to build the GridConfigForm containing fields for component configurations.
		 */
		private function getConfigFields():ArrayCollection
		{
			var coll:ArrayCollection = new ArrayCollection();
			coll.addItem(getField(FLD_SCHEMA_FIELD_LBL_KEY, FLD_SCHEMA_FIELD_NAME, FLD_SCHEMA_FIELD_TYPE, 
				FLD_SCHEMA_FIELD_WIDTH, schemaAttributes, null));
			
			coll.addItem(getField(FLD_STRUCT_FIELD_LBL_KEY, FLD_STRUCT_FIELD_NAME, FLD_STRUCT_FIELD_TYPE,
				FLD_STRUCT_FIELD_WIDTH, structAttributes, null));
			return coll;
		}

		/**
		 * Creates a GridConfigField with the supplied params.
		 */		
		private function getField(labelKey:String, fieldName:String, fieldType:String, 
			fieldWidth:int, dataprovider:ArrayCollection, observer:Function):GridConfigField {
			var field:GridConfigField = new GridConfigField();
			field.label = resourceManager.getString('TeevraUI', labelKey);
			field.name = fieldName;
			field.type = fieldType;
			field.fieldWidth = fieldWidth;
			field.lookups = dataprovider;
			field.observer = observer;
			return field;
		}
		
		/**
		 * Creates the structFormatterConfig XML from the given tabularData. The tabularData contains
		 * the values specified by the user in the fields of GridConfigForm.
		 */
		public function createConfigXML():String
		{
			var tabularData:ArrayCollection = configForm.getUserSpecifiedValues();
			var configXML:XML=new XML("<binding></binding>");
			for (var i:int=0; i < tabularData.length; i++)
			{
				var rowVector:ArrayCollection=ArrayCollection(tabularData.getItemAt(i));
				if (rowVector.getItemAt(SCHEMA_FIELD_INDEX) != null)
				{
					var fieldElement:XML = <field name={rowVector.getItemAt(SCHEMA_FIELD_INDEX).toString()}></field>;
					var structField:XML = <structField>{rowVector.getItemAt(STRUCT_FIELD_INDEX)}></structField>;
					fieldElement.appendChild(structField);
					configXML.appendChild(fieldElement);
				}
			}
			Alert.show(configXML.toXMLString());
			return configXML.toXMLString();
		}

		/**
		 * When the UI needs to be loaded with ProcessServiceVO, the configurations in the VO are obtained 
		 * as a list of row vectors so that GridConfigForm can use that to populate the values in its field.
		 */
		public function loadConfigXML(configXML:XML):void
		{
			var tabularData:ArrayCollection = new ArrayCollection();
			var root:XML;
			for each (root in configXML.field)
			{
				var rowVector:ArrayCollection = new ArrayCollection();
				rowVector.addItem(root.attribute("name").toString());
				// add struct field in second field
				var child:XML;
				for each (child in root.structField)
				{
					rowVector.addItem(child.text().toString());
				}
				tabularData.addItem(rowVector);
			}
			configForm.setTabularData(tabularData);
		}
		
		/**
		 * Gets the label for the given field */
		private function setFieldName(field:String):String
		{
			var fieldName:String=resourceManager.getString('TeevraUI', field + '.name');
			if (resourceManager.getString('TeevraUI', field + '.mandatory') == 'Y')
			{
				fieldName+="*";
			}
			return fieldName;
		}
	}
}