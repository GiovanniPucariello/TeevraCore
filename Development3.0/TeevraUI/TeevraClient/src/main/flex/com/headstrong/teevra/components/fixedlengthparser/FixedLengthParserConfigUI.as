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
 * $Id: FixedLengthParser.as
 * $Revision: 
 * $Author: PAakash
 * $DateTime: Nov 26, 2008  
 */
package com.headstrong.teevra.components.fixedlengthparser
{
	import com.headstrong.teevra.client.graph.model.ProcessServiceConfigurationVO;
	import com.headstrong.teevra.client.graph.model.ProcessServiceVO;
	import com.headstrong.teevra.client.model.ViewModelLocator;
	import com.headstrong.teevra.client.util.RestrictedTextInput;
	import com.headstrong.teevra.components.common.BaseComponentConfigurationUI;
	import com.headstrong.teevra.components.common.GridConfigField;
	import com.headstrong.teevra.components.common.GridConfigForm;
	import com.headstrong.teevra.components.common.TeevraUIComponentsID;
	
	import flash.events.Event;
	
	import mx.collections.ArrayCollection;
	import mx.containers.Box;
	import mx.containers.HBox;
	import mx.containers.VBox;
	import mx.controls.Alert;
	import mx.controls.ComboBox;
	import mx.controls.Label;
	import mx.controls.TextInput;
	import mx.core.ClassFactory;
	import mx.events.ListEvent;

	public class FixedLengthParserConfigUI extends BaseComponentConfigurationUI
	{
		private var schmNmForParserDynamicTyp:ArrayCollection;
		private var schemaLabel:Label;
		private var schemaNameSelection:ComboBox;
		private var parseTypeSelection:ComboBox;
	
		private var configForm:GridConfigForm;
		private var delimitedCharacter:TextInput;
		private var lineText:TextInput;
		private var headerLineLabel:Label;
		private var offSetText:TextInput;
		private var attributes:ArrayCollection;
		
		private var serviceIdText:RestrictedTextInput;
		private var schemaTypeCmb:ComboBox;
		private var schemaIsChanged:Boolean;
		private var parserTypeFlag:Boolean;
		
		private var messageStartLineText:TextInput;
		private var footerPatternText:TextInput;

		private const START_INDEX:int=0;
		private const END_INDEX:int=1;
		private const SCHEMA_ATTR_INDEX:int = 2;
		
		private const CONFIG_KEY_SCHEMA_DESCR:String = "objectSchemaDescriptor";
		private const CONFIG_KEY_LINE:String = "line";
		private const CONFIG_KEY_PARSE_TYPE:String = "parseType";
		private const CONFIG_KEY_SCHEMA_TYPE:String = "schemaType";
		private const CONFIG_KEY_OFFSET:String = "offset";
		private const CONFIG_KEY_SCHEMA_MAPPING:String = "schemaMapping";
		
		private const MESSAGE_START_LINE:String = "msgStartLine";
		private const FOOTER_PATTERN:String = "footerPattern";
		
		private const DELIMITERS:String = "Delimiter";
		private const PARSE_TYPE_BODY:String = "body";
		private const PARSE_TYPE_HEADER:String = "header";
		private const SCHEMA_TYPE_DEFAULT:String = "Default";
		private const SCHEMA_TYPE_DYNAMIC:String = "Dynamic";
		
		
		private const FLD_STARTINDEX_LBL:String = "configField.FixedLengthParserConfigUI.startIndex";
		private const FLD_STARTINDEX_NAME:String = "startIndexColumn";
		private const FLD_STARTINDEX_TYPE:String = GridConfigField.TEXT_FIELD;
		private const FLD_STARTINDEX_WIDTH:Number = 50;
		
		private const FLD_ENDINDEX_LBL:String = "configField.FixedLengthParserConfigUI.endIndex";
		private const FLD_ENDINDEX_NAME:String = "EndIndexColumn";
		private const FLD_ENDINDEX_TYPE:String = GridConfigField.TEXT_FIELD;
		private const FLD_ENDINDEX_WIDTH:Number = 50;
		
		private const FLD_ATTR_LBL:String = "configField.FixedLengthParserConfigUI.attributes";
		private const FLD_ATTR_NAME:String = "fieldAttributes";
		private const FLD_ATTR_TYPE:String = GridConfigField.EDITABLE_LIST_FIELD;
		private const FLD_ATTR_WIDTH:Number = 33;
		
		private const SERVICE_ID_FIELD:String="label.FixedLengthParserConfigUI.serviceID";
		private const SCHEMA_NAME_FIELD:String="label.FixedLengthParserConfigUI.schemaName";
		private const OFFSET_FIELD:String="label.FixedLengthParserConfigUI.offSet";
		private const MESSAGE_START_FIELD:String="label.FixedLengthParserConfigUI.messageStartLine";
		private const FOOTER_OFFSET_FIELD:String="label.FixedLengthParserConfigUI.footerPattern";
		private const SCHEMA_TYPE_LBL:String = "label.FixedLengthParserConfigUI.schemaType";
		
		
		public var modelLocator:ViewModelLocator = ViewModelLocator.getInstance();
		
		public function FixedLengthParserConfigUI()
		{
			super();
		}

		override public function initUI():void
		{
			
			addComponentSpecificUI();
			addConfigFields();
			if(this.processServiceConfig!=null)
			{
				//loadDetails in process service configuration
				loadProcessServiceConfig();							
			}
			configForm.percentWidth = 100;
			this.addChild(configForm);
		
			schemaNameSelection.addEventListener(ListEvent.CHANGE, setSchemaAttributesOnChange);
			this.height = 300;
			this.verticalScrollPolicy = "auto";
		}
		private function addComponentSpecificUI() : void 
		{
			var compSpecificDisplay:VBox = new VBox();
			compSpecificDisplay.percentWidth = 100;
			compSpecificDisplay.percentHeight = 15;
			
			var compSpecificDisplayH1:HBox = new HBox();
			compSpecificDisplayH1.percentWidth = 100;
			compSpecificDisplayH1.percentHeight = 5;
			
			var compSpecificDisplayH2:HBox = new HBox();
			compSpecificDisplayH2.percentWidth = 100;
			compSpecificDisplayH2.percentHeight = 5;
			
			var compSpecificDisplayH3:HBox = new HBox();
			compSpecificDisplayH3.percentWidth = 100;
			compSpecificDisplayH3.percentHeight = 5;
			
			var compSpecificDisplayH4:Box = new HBox();
			compSpecificDisplayH4.percentWidth = 100;
			compSpecificDisplayH4.percentHeight = 5;
			
			var serviceId:Label = new Label();
			serviceId.text=setFieldName(SERVICE_ID_FIELD);
			serviceId.setStyle("fontWeight","bold");
			serviceIdText = new RestrictedTextInput();
			// (Redmine Feature # 589) ID of flex components is set so that it can be uniquely identified by Ranorex
			serviceIdText.id=TeevraUIComponentsID.SERVICE_ID_ID;
			compSpecificDisplayH1.addChild(serviceId);
			compSpecificDisplayH1.addChild(serviceIdText);
			
			var primitiveArrayCollection:ArrayCollection = new ArrayCollection();
			primitiveArrayCollection.addItem(PARSE_TYPE_HEADER);
			primitiveArrayCollection.addItem(PARSE_TYPE_BODY);
			var primitiveLabel:Label = new Label();
			primitiveLabel.text=resourceManager.getString('TeevraUI', 'label.FixedLengthParserConfigUI.parserType');
			primitiveLabel.setStyle("fontWeight", "bold");
			parseTypeSelection = new ComboBox();
			// (Redmine Feature # 589) ID of flex components is set so that it can be uniquely identified by Ranorex
			parseTypeSelection.id=TeevraUIComponentsID.PARSER_TYPE_ID;
			parseTypeSelection.itemRenderer = new ClassFactory(Label);
			parseTypeSelection.dataProvider = primitiveArrayCollection;
			parseTypeSelection.selectedItem = PARSE_TYPE_BODY;
			//primitiveType.selectedIndex = -1;
			parseTypeSelection.addEventListener(ListEvent.CHANGE, setField);
			compSpecificDisplayH1.addChild(primitiveLabel);
			compSpecificDisplayH1.addChild(parseTypeSelection);
			
			var schemaTypeCollection:ArrayCollection = new ArrayCollection();
			schemaTypeCollection.addItem(SCHEMA_TYPE_DEFAULT);
			schemaTypeCollection.addItem(SCHEMA_TYPE_DYNAMIC);
			var schemaType:Label = new Label();
			schemaType.text=setFieldName(SCHEMA_TYPE_LBL);
			schemaTypeCmb = new ComboBox();
			// (Redmine Feature # 589) ID of flex components is set so that it can be uniquely identified by Ranorex
			schemaTypeCmb.id=TeevraUIComponentsID.SCHEMA_TYPE_ID;
			schemaTypeCmb.itemRenderer = new ClassFactory(Label);
			schemaTypeCmb.dataProvider = schemaTypeCollection;
			schemaTypeCmb.selectedItem = SCHEMA_TYPE_DEFAULT;
			schemaTypeCmb.addEventListener(ListEvent.CHANGE, setSchemaType);
			compSpecificDisplayH1.addChild(schemaType);
			compSpecificDisplayH1.addChild(schemaTypeCmb);
			
			
			compSpecificDisplay.addChild(compSpecificDisplayH1);
			
			headerLineLabel = new Label();
			headerLineLabel.text=resourceManager.getString('TeevraUI', 'label.FixedLengthParserConfigUI.headerLine');
			headerLineLabel.visible = false;
			headerLineLabel.visible=false;
			headerLineLabel.setStyle("fontWeight", "bold");
			lineText = new TextInput();
			lineText.visible=false;
			compSpecificDisplayH2.addChild(headerLineLabel);
			compSpecificDisplayH2.addChild(lineText);
			
			
			schemaLabel = new Label();
			schemaLabel.text = setFieldName(SCHEMA_NAME_FIELD);
			//schemaLabel.visible = false;
			schemaLabel.setStyle("fontWeight", "bold");
			schemaNameSelection = new ComboBox();
			// (Redmine Feature # 589) ID of flex components is set so that it can be uniquely identified by Ranorex
			schemaNameSelection.id=TeevraUIComponentsID.SCHEMA_NAME_ID;
			//schemaNameSelection.editable = false;
			schemaNameSelection.editable = true; //Uncomment it if schema label is to make editable
			schemaNameSelection.itemRenderer = new ClassFactory(Label);
			schemaNameSelection.dataProvider = schemas;
			schemaNameSelection.labelField = "schemaName";
			schemaNameSelection.selectedIndex = -1;
			
			compSpecificDisplayH2.addChild(schemaLabel);
			compSpecificDisplayH2.addChild(schemaNameSelection);				
			
			compSpecificDisplay.addChild(compSpecificDisplayH2);
			
			var offSetLabel:Label = new Label();
			offSetLabel.text=setFieldName(OFFSET_FIELD);
			offSetLabel.setStyle("fontWeight", "bold");
			offSetText = new TextInput();
			// (Redmine Feature # 589) ID of flex components is set so that it can be uniquely identified by Ranorex		
			offSetText.id=TeevraUIComponentsID.OFFSET_ID;
			
			compSpecificDisplayH3.addChild(offSetLabel);
			compSpecificDisplayH3.addChild(offSetText);
			
			compSpecificDisplay.addChild(compSpecificDisplayH3); 
			
			// Added as a part of Message start line and Footer Pattern - AP - 29-July-2009 : Code Start
			var messageStartLineLbl:Label = new Label();
			messageStartLineLbl.text=setFieldName(MESSAGE_START_FIELD);
			messageStartLineLbl.setStyle("fontWeight", "bold");
			messageStartLineText = new TextInput();
			// (Redmine Feature # 589) ID of flex components is set so that it can be uniquely identified by Ranorex
			messageStartLineText.id=TeevraUIComponentsID.MESSAGE_START_LINE_ID;
			
			compSpecificDisplayH4.addChild(messageStartLineLbl);
			compSpecificDisplayH4.addChild(messageStartLineText);
			
			var footerPatternLbl:Label = new Label();
			footerPatternLbl.text=setFieldName(FOOTER_OFFSET_FIELD);
			footerPatternLbl.setStyle("fontWeight", "bold");
			footerPatternText = new TextInput();
			// (Redmine Feature # 589) ID of flex components is set so that it can be uniquely identified by Ranorex
			footerPatternText.id=TeevraUIComponentsID.FOOTER_PATTERN_ID;
			compSpecificDisplayH4.addChild(footerPatternLbl);
			compSpecificDisplayH4.addChild(footerPatternText);
			
			compSpecificDisplay.addChild(compSpecificDisplayH4); 			
			// Added as a part of Message start line and Footer Pattern - AP - 29-July-2009 : Code End
			
			this.addChild(compSpecificDisplay);
		}
		private function addConfigFields():void 
		{
			configForm = new GridConfigForm(getConfigFields());
			configForm.percentWidth = 100;
		}
		/**
		 * Populates the UI field with the values that were saved last time in the ProcessServiceConfigurationVO.
		 */
		private function loadProcessServiceConfig():void {
			//set label values
			serviceIdText.text = processServiceConfig.serviceId;
			loadConfigurations(processServiceConfig.configurations);
		}
		/**
		 * Constructs the UI with the given list of component configurations
		 */
		override public function loadConfigurations(configurations:ArrayCollection):void {
			for each (var config : ProcessServiceConfigurationVO in configurations) {
				if (CONFIG_KEY_SCHEMA_DESCR == config.configKey) 
				{
					schmNmForParserDynamicTyp  = new ArrayCollection();
					schmNmForParserDynamicTyp.addItem(config.simpleValue);
					schemaNameSelection.text = config.simpleValue;
				}
				else if (CONFIG_KEY_LINE == config.configKey)
				{
					lineText.text = config.simpleValue;
				}
				else if (CONFIG_KEY_OFFSET == config.configKey)
				{
					offSetText.text = config.simpleValue;
				}
				else if (CONFIG_KEY_PARSE_TYPE == config.configKey)
				{
					parseTypeSelection.selectedItem = config.simpleValue;
					changeParseType(config.simpleValue);
				}
				else if (MESSAGE_START_LINE == config.configKey)
				{
					messageStartLineText.text = config.simpleValue;					
				}
				else if(FOOTER_PATTERN == config.configKey)
				{
					footerPatternText.text = config.simpleValue;
				}
				else if(CONFIG_KEY_SCHEMA_TYPE == config.configKey)
				{
					schemaTypeCmb.selectedItem = config.simpleValue;
					if(schemaTypeCmb.selectedItem == SCHEMA_TYPE_DYNAMIC)
					{
						changeSchemaType(config.simpleValue);
						schemaNameSelection.dataProvider = schmNmForParserDynamicTyp;
					}
				}
			}
			
			// set attributes for earlier selected Schema on save
			configForm.setSchemaAttributes(schemaNameSelection.text,attributes,true,SCHEMA_ATTR_INDEX);
			//get the user specified fields' data as array collection 		
			var tabularData:ArrayCollection = getTabularData(configurations);
			
			//set grid fields' data
			configForm.setTabularData(tabularData);			
		}	
		
		
		public function getTabularData(configuration:ArrayCollection):ArrayCollection
		{
			for(var i:int=0;i<configuration.length;i++)
			{
				var processServiceConfiguration:ProcessServiceConfigurationVO=ProcessServiceConfigurationVO(configuration.getItemAt(i));
				if(processServiceConfiguration.complexValue!=null)
				{
					var configXML:XML=XML(processServiceConfiguration.complexValue);
					var tabularData:ArrayCollection = new ArrayCollection();
					var root:XML;
					var child:XML;
					
					for each(root in configXML.field)
					{
						var rowVector:ArrayCollection=new ArrayCollection();

						rowVector.addItem(root.attribute("start").toString());
						rowVector.addItem(root.attribute("end").toString());
						rowVector.addItem(root.attribute("name").toString());
  
						tabularData.addItem(rowVector);
					}
				}		
			}
			return tabularData;
		} 
		
		public function getConfigFields():ArrayCollection
		{
			var coll:ArrayCollection = new ArrayCollection();
			coll.addItem(getField(FLD_STARTINDEX_LBL, FLD_STARTINDEX_NAME, FLD_STARTINDEX_TYPE, 
				FLD_STARTINDEX_WIDTH, null, null));
			
			coll.addItem(getField(FLD_ENDINDEX_LBL, FLD_ENDINDEX_NAME, FLD_ENDINDEX_TYPE, 
				FLD_ENDINDEX_WIDTH, null, null));
				
			attributes = new ArrayCollection();
			
			coll.addItem(getField(FLD_ATTR_LBL, FLD_ATTR_NAME, FLD_ATTR_TYPE, 
			FLD_ATTR_WIDTH, attributes, null));
			
			return coll;
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
		
		override public function getConfiguration():ProcessServiceVO
		{
			var processServiceVO:ProcessServiceVO = new ProcessServiceVO();
			
			//set the Service Id of ProcessServiceVO
			processServiceVO.serviceId=(serviceIdText.text).toString();
			
			//Set the first Configuration i.e. Schema Name
			var processServiceConfigVO:ProcessServiceConfigurationVO = new ProcessServiceConfigurationVO();
			processServiceConfigVO.serviceId=(serviceIdText.text).toString();			
			processServiceConfigVO.configKey = CONFIG_KEY_SCHEMA_DESCR;
			processServiceConfigVO.simpleValue = schemaNameSelection.text;
			processServiceVO.configurations = new ArrayCollection();
			processServiceVO.configurations.addItem(processServiceConfigVO);
			
			//Parse type
			processServiceConfigVO = new ProcessServiceConfigurationVO();
			processServiceConfigVO.serviceId=(serviceIdText.text).toString();	
			processServiceConfigVO.configKey = CONFIG_KEY_PARSE_TYPE;
			processServiceConfigVO.simpleValue = parseTypeSelection.text;
			processServiceVO.configurations.addItem(processServiceConfigVO);
			
			//Schema Type
			processServiceConfigVO = new ProcessServiceConfigurationVO();
			processServiceConfigVO.serviceId=(serviceIdText.text).toString();	
			processServiceConfigVO.configKey = CONFIG_KEY_SCHEMA_TYPE;
			processServiceConfigVO.simpleValue = schemaTypeCmb.text;
			processServiceVO.configurations.addItem(processServiceConfigVO);

			//Line
			processServiceConfigVO = new ProcessServiceConfigurationVO();
			processServiceConfigVO.serviceId=(serviceIdText.text).toString();	
			processServiceConfigVO.configKey = CONFIG_KEY_LINE;
			processServiceConfigVO.simpleValue = lineText.text;
			processServiceVO.configurations.addItem(processServiceConfigVO);
			
			//offset
			processServiceConfigVO = new ProcessServiceConfigurationVO();
			processServiceConfigVO.serviceId=(serviceIdText.text).toString();	
			processServiceConfigVO.configKey = CONFIG_KEY_OFFSET;
			processServiceConfigVO.simpleValue = offSetText.text;
			processServiceVO.configurations.addItem(processServiceConfigVO);
			
			// Added as a part of Message start line and Footer Pattern - AP - 29-July-2009 : Code Start
			processServiceConfigVO = new ProcessServiceConfigurationVO();
			processServiceConfigVO.serviceId=(serviceIdText.text).toString();	
			processServiceConfigVO.configKey = MESSAGE_START_LINE;
			processServiceConfigVO.simpleValue = messageStartLineText.text;
			processServiceVO.configurations.addItem(processServiceConfigVO);
			
			processServiceConfigVO = new ProcessServiceConfigurationVO();
			processServiceConfigVO.serviceId=(serviceIdText.text).toString();	
			processServiceConfigVO.configKey = FOOTER_PATTERN;
			processServiceConfigVO.simpleValue = footerPatternText.text;
			processServiceVO.configurations.addItem(processServiceConfigVO);
			// Added as a part of Message start line and Footer Pattern - AP - 29-July-2009 : Code End
			
			//set the second Configuration i.e. the Schema mapping
			processServiceConfigVO = new ProcessServiceConfigurationVO();
			processServiceConfigVO.serviceId=(serviceIdText.text).toString();			
			processServiceConfigVO.configKey = CONFIG_KEY_SCHEMA_MAPPING;
			processServiceConfigVO.complexValue = createConfigXML(configForm.getUserSpecifiedValues());
			processServiceVO.configurations.addItem(processServiceConfigVO); 
			
			var mandatoryFlag:Boolean=validateFields(processServiceVO);
			
			if(!mandatoryFlag)
			{
				Alert.show("Please fill in all the mandatory fields");
								
			}
			else 
			{
				return processServiceVO;
			}
			return null;
		}

		// sets attribute list for the selected Schema	
		private function setSchemaAttributesOnChange(event:Event):void
		{	
			configForm.setSchemaAttributes(ComboBox(event.currentTarget).text,attributes,false,SCHEMA_ATTR_INDEX);
		}	
		//set either the HeaderLine text or SchemaName combobox depending upon the primitive type
		private function setField(event:Event):void
		{
			changeParseType(event.currentTarget.selectedItem);
		}
		//set either the all the schema or null depending upon the Default or dynamic schema type
		private function setSchemaType(event:Event):void
		{
			changeSchemaType(event.currentTarget.selectedItem);
		}
		private function changeSchemaType(selectedItem:String):void
		{
			if(selectedItem == SCHEMA_TYPE_DEFAULT)
			{
				schemaNameSelection.dataProvider = schemas;
				schemaNameSelection.selectedIndex = -1;
			}
			else if(selectedItem == SCHEMA_TYPE_DYNAMIC)
			{
				schemaNameSelection.percentWidth = 20;
				schemaNameSelection.dataProvider = null;
			}
			
		}							
		private function changeParseType(selectedItem:String):void {
			if(selectedItem == PARSE_TYPE_HEADER)
			{
				headerLineLabel.visible = true;
				lineText.visible = true;
				schemaLabel.visible = false;
				schemaNameSelection.visible=false;
			}
			else if(selectedItem == PARSE_TYPE_BODY)
			{
				schemaLabel.visible = true;
				schemaNameSelection.visible = true;
				headerLineLabel.visible = false;
				lineText.visible = false;
			}
		}
		
		private function createConfigXML(tabularData:ArrayCollection):String
		{
			var configXML:XML = new XML("<binding></binding>");
			for(var i:uint=0;i<tabularData.length;i++)
			{
				var rowVector:ArrayCollection=ArrayCollection(tabularData.getItemAt(i));
                var fieldElement:XML = new XML();
               if(rowVector.getItemAt(SCHEMA_ATTR_INDEX) != "")
               {
	                fieldElement = <field name={rowVector.getItemAt(SCHEMA_ATTR_INDEX).toString()} 
	                start = {rowVector.getItemAt(START_INDEX).toString()} 
	                end = {rowVector.getItemAt(END_INDEX).toString()}/>;
	                            
	                configXML.appendChild(fieldElement);
               }
   			}
   			return configXML.toXMLString();
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
		private function validateFields(processServiceVO:ProcessServiceVO):Boolean
		{	
			var config : ProcessServiceConfigurationVO;
			if(resourceManager.getString('TeevraUI', SERVICE_ID_FIELD+'.mandatory')=='Y')
			{
				if(processServiceVO.serviceId==null ||processServiceVO.serviceId=="")
				{
					return false;
				}
			}
			if(resourceManager.getString('TeevraUI', SCHEMA_NAME_FIELD+'.mandatory')=='Y' && schemaNameSelection.visible==true)
			{
				for each (config in processServiceVO.configurations)
				{
					if (CONFIG_KEY_SCHEMA_DESCR == config.configKey) 
					{
						if(config.simpleValue==null || config.simpleValue=="")
							return false;
					}
				}
				
			}
			if(resourceManager.getString('TeevraUI', OFFSET_FIELD+'.mandatory')=='Y')
			{
				for each (config in processServiceVO.configurations)
				{
					if (CONFIG_KEY_OFFSET == config.configKey) 
					{
						if(config.simpleValue==null || config.simpleValue=="")
							return false;
					}
				}
			}
			if(resourceManager.getString('TeevraUI', MESSAGE_START_FIELD+'.mandatory')=='Y')
			{
				for each (config in processServiceVO.configurations)
				{
					if (MESSAGE_START_LINE == config.configKey) 
					{
						if(config.simpleValue==null || config.simpleValue=="")
							return false;
					}
				}
			}
			if(resourceManager.getString('TeevraUI', FOOTER_OFFSET_FIELD+'.mandatory')=='Y')
			{
				for each (config in processServiceVO.configurations)
				{
					if (FOOTER_PATTERN == config.configKey) 
					{
						if(config.simpleValue==null || config.simpleValue=="")
							return false;
					}
				}
			}
			if(resourceManager.getString('TeevraUI', SCHEMA_TYPE_LBL+'.mandatory')=='Y')
			{
				for each (config in processServiceVO.configurations)
				{
					if (CONFIG_KEY_SCHEMA_TYPE == config.configKey) 
					{
						if(config.simpleValue==null || config.simpleValue=="")
							return false;
					}
				}
			}
			return true;
		}
		
	}
}
