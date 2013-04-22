/*
 * The information in this document is subject to change without notice and 
 * does not represent a commitment by Headstrong Corporation. The software 
 * and/or databases described in this document are furnished under a license 
 * agreement and may be used or copied only in accordance with the terms of 
 * the agreement. 
 * 
 * Copyright © 2008 Headstrong Corporation
 * All rights reserved.
 * 
 * $Id: HeaderConfigUI.as
 * $Revision: 
 * $Author: PAakash
 * $DateTime: July 16, 2009  
 */
package com.headstrong.teevra.components.multiSectionParser
{
	import com.headstrong.teevra.components.common.GridConfigField;
	import com.headstrong.teevra.components.common.GridConfigForm;
	
	import flash.events.Event;
	
	import mx.collections.ArrayCollection;
	import mx.containers.Form;
	import mx.containers.FormItem;
	import mx.containers.VBox;
	import mx.controls.ComboBox;
	import mx.controls.TextInput;
	import mx.events.ListEvent;
	
	/**
	 * Config screen for GenericHeader in Multisection
	 */ 
	public class HeaderConfigUI extends VBox
	{
		public static const GENERIC_HEADER_MODE:int = 1;
		public static const SECTION_HEADER_MODE:int = 2;
		public static const SECTION_BODY_MODE:int = 3;
		
		private var uiMode:int;
		private var headerForm:Form; 
		private var _schemaSelectionValue:String;
		
		private var headerLineFormItem:FormItem;
		private var identifierFormItem:FormItem; 
		private var dataFormatFormItem:FormItem;
		private var delimiterFormItem:FormItem;
		
		private var headerLineInput:TextInput;
		private var identifierInput:TextInput
		private var dataFormatComboBox:ComboBox;	
		private var delimiterInput:TextInput;
		
		public var configForm:GridConfigForm;	
		private var attributes:ArrayCollection;
		
		private const FL_DATA_FORMAT:String = "Fixed Length Parser";
		private const TD_DATA_FORMAT:String = "Tag Delimited Parser";
			
		private const FIXED_START_INDEX:int=0;
		private const FIXED_END_INDEX:int=1;
		public const FIXED_SCHEMA_ATTR_INDEX:int = 2;
		
		private const DELI_SCHEMA_ATTR_INDEX:int = 0;
		public const DELI_ATTRIBUTES_INDEX:int = 1;
		
		private const HEADER_LINE:String="label.MultisectionConfigUI.line";
		private const HEADER_IDENTIFIER:String="label.MultisectionConfigUI.identifier";
		private const DATA_FORMAT:String="label.MultisectionConfigUI.dataFormat";
		private const DELIMITER:String="label.MultisectionConfigUI.delimiter";
		
		private const FLD_STARTINDEX_LBL:String = "configField.FixedLengthParserConfigUI.startIndex";
		private const FLD_STARTINDEX_NAME:String = "startIndexColumn";
		private const FLD_STARTINDEX_TYPE:String = GridConfigField.TEXT_FIELD;
		private const FLD_STARTINDEX_WIDTH:Number = 30;
		
		private const FLD_ENDINDEX_LBL:String = "configField.FixedLengthParserConfigUI.endIndex";
		private const FLD_ENDINDEX_NAME:String = "EndIndexColumn";
		private const FLD_ENDINDEX_TYPE:String = GridConfigField.TEXT_FIELD;
		private const FLD_ENDINDEX_WIDTH:Number = 30;
		
		private const FLD_ATTR_LBL:String = "configField.FixedLengthParserConfigUI.attributes";
		private const FLD_ATTR_NAME:String = "fieldAttributes";
		private const FLD_ATTR_TYPE:String = GridConfigField.EDITABLE_LIST_FIELD;
		private const FLD_ATTR_WIDTH:Number = 70;
		
		private const TAGD_FLD_INDEX_LBL:String = "configField.DelimitedParserConfigUI.fieldIndex";
		private const TAGD_FLD_INDEX_NAME:String = "fieldIndex";
		private const TAGD_FLD_INDEX_TYPE:String = GridConfigField.TEXT_FIELD;
		private const TAGD_FLD_INDEX_WIDTH:Number = 50;
		
		private const TAGD_FLD_ATTR_LBL:String = "configField.DelimitedParserConfigUI.attributes";
		private const TAGD_FLD_ATTR_NAME:String = "fieldAttributes";
		private const TAGD_FLD_ATTR_TYPE:String = GridConfigField.EDITABLE_LIST_FIELD;
		private const TAGD_FLD_ATTR_WIDTH:Number = 50;
		
		/**
		 * Constructor of  HeaderConfigUI
		 */
		public function HeaderConfigUI(mode:int)
		{
			super();
			this.uiMode = mode;
			switch (mode) {
				case GENERIC_HEADER_MODE:
					this.label = "Header Information";
					break;
				case SECTION_HEADER_MODE:
					this.label = "Section Header Information";
					break;
				case SECTION_BODY_MODE:
					this.label = "Section Body Information";
			}
		}
		
		/**
		 * Creates the controls on the tab without the data format specific form*/
		public function initUI():void
		{
			//DataFormat, No of line and pattern fields to be set
			addHeaderInfo();						
		}
		
		/**
		 * loads the configuration from the given XML
		 */
		public function loadConfig(configXml:XML):void
		{
			var delimiter:String = null;
			for each (var delimXml:XML in configXml.delimiter) {
				delimiter = delimXml.text().toString();
			}
			
			//remove the previous GridConfigForm if exists
			if (configForm != null) {
				this.removeChild(configForm);
				configForm = null;
			}
			
			if ((delimiter != null) && (delimiter != "")) {
				//config corresponds to delimited data format
				dataFormatComboBox.text = TD_DATA_FORMAT;
				delimiterFormItem.visible = true;
				delimiterInput.text = delimiter;
				configForm = new GridConfigForm(getTagDelimiterConfigFields());
//				setHeaderSchemaAttributes();
				if (uiMode != GENERIC_HEADER_MODE) {
					configForm.setSchemaAttributes(schemaSelectionValue,attributes,true,DELI_ATTRIBUTES_INDEX);
				}
				var bindingXml:XML;
				for each (bindingXml in configXml.binding) {
					var tdData:ArrayCollection = getTagDelimitedTabularData(bindingXml);
					if (tdData.length > 0) {
						configForm.setTabularData(tdData);
					}
					break;
				}
				configForm.percentWidth = 90;
				this.addChild(configForm);
			} else {
				//config corresponds to fixed len data format
				dataFormatComboBox.text = FL_DATA_FORMAT;
				delimiterFormItem.visible = false;
				configForm = new GridConfigForm(getFixedLengthConfigFields());
				if (uiMode != GENERIC_HEADER_MODE) {
					configForm.setSchemaAttributes(schemaSelectionValue,attributes,true,FIXED_SCHEMA_ATTR_INDEX);
				}
				var flBindingXml:XML;
				for each (flBindingXml in configXml.binding) {
					var flData:ArrayCollection = getFixedLengthTabularData(flBindingXml);
					if (flData.length > 0) {
						configForm.setTabularData(flData);
					}
				}
				configForm.percentWidth = 90;
				this.addChild(configForm);
			}
		}
		/**
		 * Adds the Header Info of Header Tab 
		 * 
		 */
		private function addHeaderInfo():void
		{
			headerForm = new Form();
			
			//Header Line Field			
			headerLineFormItem = new FormItem();
			headerLineFormItem.label = setFieldName(HEADER_LINE);
			headerLineInput = new TextInput();
			headerLineFormItem.addChild(headerLineInput);
			
			//Header Identifier Field
			identifierFormItem = new FormItem();
			identifierFormItem.label = setFieldName(HEADER_IDENTIFIER);
			identifierInput = new TextInput();
			identifierFormItem.addChild(identifierInput);
			
			//Data Format Field
			dataFormatFormItem = new FormItem();
			dataFormatFormItem.label = setFieldName(DATA_FORMAT);
			
			var dataFormatArrayColl:ArrayCollection = new ArrayCollection();
			dataFormatArrayColl.addItem(FL_DATA_FORMAT);
			dataFormatArrayColl.addItem(TD_DATA_FORMAT);
			
			dataFormatComboBox= new ComboBox();
			dataFormatComboBox.dataProvider = dataFormatArrayColl;
			dataFormatComboBox.selectedIndex = -1;
			dataFormatComboBox.addEventListener(ListEvent.CHANGE, addConfigFields);
			dataFormatFormItem.addChild(dataFormatComboBox);
			
			//Dilimiters field
			delimiterFormItem = new FormItem();
			delimiterFormItem.label = setFieldName(DELIMITER);
			delimiterInput = new TextInput();
			delimiterFormItem.addChild(delimiterInput);
			delimiterFormItem.visible=false;
			
			headerForm.addChild(headerLineFormItem);
			headerForm.addChild(identifierFormItem);
			headerForm.addChild(dataFormatFormItem);
			headerForm.addChild(delimiterFormItem);
			this.addChild(headerForm);
		}
		
		/**
		 * When the data format dropdown is changed, corresponding config form has to be changed 
		 */
		private function addConfigFields(event:Event):void 
		{
			if(configForm!=null && this.getChildIndex(configForm)>0)
			{
				this.removeChild(configForm);
			}
			if(dataFormatComboBox.selectedItem == FL_DATA_FORMAT)
			{
				delimiterFormItem.visible = false;
				configForm = new GridConfigForm(getFixedLengthConfigFields());
				if (uiMode != GENERIC_HEADER_MODE) {
					configForm.setSchemaAttributes(schemaSelectionValue,attributes,false,FIXED_SCHEMA_ATTR_INDEX);
				}		
			}
			else
			{
				delimiterFormItem.visible = true;
				configForm = new GridConfigForm(getTagDelimiterConfigFields());
				if (uiMode != GENERIC_HEADER_MODE) {
					configForm.setSchemaAttributes(schemaSelectionValue,attributes,false,DELI_ATTRIBUTES_INDEX);
				}
			}
			configForm.percentWidth = 90;
			this.addChild(configForm);
		}

		/**
		 * Change the attributes combo box if the schema is changed in the root
		 */		
		public function setHeaderSchemaAttributes():void
		{
			if(configForm!=null)
			{
				if(dataFormatComboBox.selectedItem == FL_DATA_FORMAT)
				{
					configForm.setSchemaAttributes(schemaSelectionValue,attributes,false,FIXED_SCHEMA_ATTR_INDEX);
				}
				else
				{
					configForm.setSchemaAttributes(schemaSelectionValue,attributes,false,DELI_ATTRIBUTES_INDEX);
				}
			}
		}
		
		/**
		 * Generates XML bsaed on input specified
		 */	
		public function createConfigXML():XML
		{
			var rootXML:XML;
			switch (uiMode) {
				case GENERIC_HEADER_MODE:
					rootXML = new XML("<GenericHeader></GenericHeader>");
					break;
				case SECTION_HEADER_MODE:
					rootXML = new XML("<SectionHeader></SectionHeader>");
					break;
				case SECTION_BODY_MODE:
					rootXML = new XML("<SectionBody></SectionBody>");
					break;
			}
			
			//add delimiter if tag delimited format
			var flFormat:Boolean = true;
			
			if (dataFormatComboBox.text == TD_DATA_FORMAT) {
				var delimiterXML:XML = <delimiter>{delimiterInput.text}</delimiter>;
				rootXML.appendChild(delimiterXML);
				flFormat = false;
			}
			
			if (configForm == null) {
				return rootXML;
			}
			var tabularData:ArrayCollection = configForm.getUserSpecifiedValues();
			var bindingXml:XML = <binding></binding>;
				
			for(var i:int=0;i<tabularData.length;i++)
			{
				var rowVector:ArrayCollection = ArrayCollection(tabularData.getItemAt(i));
	            if(flFormat && (rowVector.getItemAt(FIXED_SCHEMA_ATTR_INDEX) != ""))
	            {
	            	//fixed length format
		        	var fieldElement:XML = <field name={rowVector.getItemAt(FIXED_SCHEMA_ATTR_INDEX).toString()} 
		            start = {rowVector.getItemAt(FIXED_START_INDEX).toString()} 
		            end = {rowVector.getItemAt(FIXED_END_INDEX).toString()}/>;
		            bindingXml.appendChild(fieldElement);
	            } else if(rowVector.getItemAt(DELI_ATTRIBUTES_INDEX)!="")
				{   
					//delimited format
		        	fieldElement = <field name={rowVector.getItemAt(DELI_ATTRIBUTES_INDEX).toString()} 
		            index = {rowVector.getItemAt(DELI_SCHEMA_ATTR_INDEX).toString()}/>;
					bindingXml.appendChild(fieldElement);
	    		}	             
			}
			rootXML.appendChild(bindingXml);
			return rootXML;
		}
		
		/**
		 * Constructs the field models for Fixed Length Config
		 */
		private function getFixedLengthConfigFields():ArrayCollection
		{
			var coll:ArrayCollection = new ArrayCollection();
			coll.addItem(getField(FLD_STARTINDEX_LBL, FLD_STARTINDEX_NAME, FLD_STARTINDEX_TYPE, 
				FLD_STARTINDEX_WIDTH, null, null));
			
			coll.addItem(getField(FLD_ENDINDEX_LBL, FLD_ENDINDEX_NAME, FLD_ENDINDEX_TYPE, 
				FLD_ENDINDEX_WIDTH, null, null));
			
			if (uiMode != GENERIC_HEADER_MODE) {
				attributes = new ArrayCollection();
			}
			coll.addItem(getField(FLD_ATTR_LBL, FLD_ATTR_NAME, FLD_ATTR_TYPE, 
			FLD_ATTR_WIDTH, attributes, null));
			
			return coll;
		}
		
		/**
		 * Constructs the field models for TagDelimiter  Config
		 */
		private function getTagDelimiterConfigFields():ArrayCollection
		{
			var coll:ArrayCollection = new ArrayCollection();
			
			coll.addItem(getField(TAGD_FLD_INDEX_LBL, TAGD_FLD_INDEX_NAME, TAGD_FLD_INDEX_TYPE, 
				TAGD_FLD_INDEX_WIDTH, null, null));
			
			if (uiMode != GENERIC_HEADER_MODE) {
				attributes = new ArrayCollection();
			}
			coll.addItem(getField(TAGD_FLD_ATTR_LBL, TAGD_FLD_ATTR_NAME, TAGD_FLD_ATTR_TYPE, 
				TAGD_FLD_ATTR_WIDTH, attributes, null));
			
			return coll;
		}

				/**
		 * Returns the tabular data required for GridConfigForm from the given binding XML 
		 * that corresponds to Fixed length parser */
		private function getFixedLengthTabularData(configXML:XML):ArrayCollection {
			var tabularData:ArrayCollection = new ArrayCollection();
			if (configXML == null) {
				return tabularData;	
			}
			var root:XML;
			for each(root in configXML.field)
			{
				var rowVector:ArrayCollection=new ArrayCollection();
				rowVector.addItem(root.attribute("start").toString());
				rowVector.addItem(root.attribute("end").toString());
				rowVector.addItem(root.attribute("name").toString());
  				tabularData.addItem(rowVector);
			}
			return tabularData;
		}
		
		/**
		 * Returns the tabular data required for GridConfigForm from the given binding XML 
		 * that corresponds to Tag delimited parser */
		private function getTagDelimitedTabularData(configXML:XML):ArrayCollection {
			var tabularData:ArrayCollection = new ArrayCollection();
			if (configXML == null) {
				return tabularData;	
			}
			
			var root:XML;
			for each(root in configXML.field)
			{
				var rowVector:ArrayCollection = new ArrayCollection();
				rowVector.addItem(root.attribute("index").toString());
				rowVector.addItem(root.attribute("name").toString());
				tabularData.addItem(rowVector);
			}
			return tabularData;
		}

		private function getField(labelKey:String, fieldName:String, fieldType:String, 
			fieldWidth:Number, dataprovider:ArrayCollection, observer:Function):GridConfigField {
			var field:GridConfigField = new GridConfigField();
			field.label = resourceManager.getString('TeevraUI', labelKey);
			field.name = fieldName;
			field.type = fieldType;
			field.fieldPercentWidth = fieldWidth;
			field.lookups = dataprovider;
			field.observer = observer;
			return field;
		}

		private function setFieldName(field:String):String
		{
			var fieldName:String = resourceManager.getString('TeevraUI', field+'.name');
			if(resourceManager.getString('TeevraUI', field+'.mandatory')=='Y')
			{
				fieldName+="*";
			}
			return fieldName;
		}
		
		public function isHeaderPresent():Boolean {
			if (uiMode == GENERIC_HEADER_MODE || uiMode == SECTION_HEADER_MODE) {
				return (headerLineInput.text != "" || 
							identifierInput.text != "" || 
							delimiterInput.text != "" || 
							dataFormatComboBox.text != "");
			} else {
				return false;
			}
		}
		public function get schemaSelectionValue():String
		{
			return _schemaSelectionValue;
		}
		public function set schemaSelectionValue(value:String):void
		{
			this._schemaSelectionValue = value;
		}
		public function get headerLine():String
		{
			return headerLineInput.text.toString();
		}
		public function set headerLine(headerLine:String):void
		{
			headerLineInput.text = headerLine;
		}
		public function get headerIdentifier():String
		{
			return identifierInput.text;
		}
		public function set headerIdentifier(headerIdentifier:String):void
		{
			identifierInput.text = headerIdentifier;
		}
		public function get delimiter():String
		{
			return delimiterInput.text.toString();
		}
		public function set delimiter(delimiter:String):void
		{
			delimiterInput.text = delimiter;
		}
		public function getdataFormatText():String
		{
			return dataFormatComboBox.selectedItem.toString();
		}
	}
}