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
 * $Id: DelimitedParserConfigUI.as
 * $Revision: 
 * $Author: PAakash
 * $DateTime: Nov 26, 2008  
 */
package com.headstrong.teevra.components.delimitedparser
{
	import com.headstrong.teevra.client.graph.model.ProcessServiceConfigurationVO;
	import com.headstrong.teevra.client.graph.model.ProcessServiceVO;
	import com.headstrong.teevra.client.util.RestrictedTextInput;
	import com.headstrong.teevra.components.common.BaseComponentConfigurationUI;
	import com.headstrong.teevra.components.common.GridConfigField;
	import com.headstrong.teevra.components.common.GridConfigForm;
	import com.headstrong.teevra.components.common.TeevraUIComponentsID;
	
	import flash.events.Event;
	
	import mx.collections.ArrayCollection;
	import mx.containers.HBox;
	import mx.containers.VBox;
	import mx.controls.Alert;
	import mx.controls.ComboBox;
	import mx.controls.Label;
	import mx.controls.TextInput;
	import mx.core.ClassFactory;
	import mx.events.ListEvent;

	public class DelimitedParserConfigUI extends BaseComponentConfigurationUI
	{
		private var schemaNameSelection:ComboBox;
		private var configForm:GridConfigForm;
		private var delimitedCharacter:TextInput;
		private var attributes:ArrayCollection;
		
		private var serviceIdText:RestrictedTextInput;
		private var schemaIsChanged:Boolean;
		private var messageStartLineText:TextInput;
		private var footerPatternText:TextInput;
		private var considerQuoteSelection:ComboBox;
		
		private const SCHEMA_ATTR_INDEX:int = 0;
		private const ATTRIBUTES_INDEX:int = 1;
		
		private const CONFIG_KEY_SCHEMA_DESCR:String = "objectSchemaDescriptor";
		private const CONFIG_KEY_DELIMITERS:String = "delimiter";
		private const CONFIG_KEY_SCHEMA_MAPPING:String = "schemaMapping";
		private const CONFIG_KEY_CONSIDER_QUOTE:String = "considerQuote";
		
		private const MESSAGE_START_LINE:String = "msgStartLine";
		private const FOOTER_PATTERN:String = "footerPattern";
		
		
		private const FLD_INDEX_LBL:String = "configField.DelimitedParserConfigUI.fieldIndex";
		private const FLD_INDEX_NAME:String = "fieldIndex";
		private const FLD_INDEX_TYPE:String = GridConfigField.TEXT_FIELD;
		private const FLD_INDEX_WIDTH:Number = 50;
		
		private const FLD_ATTR_LBL:String = "configField.DelimitedParserConfigUI.attributes";
		private const FLD_ATTR_NAME:String = "fieldAttributes";
		private const FLD_ATTR_TYPE:String = GridConfigField.EDITABLE_LIST_FIELD;
		private const FLD_ATTR_WIDTH:Number = 50;
		
		private const SERVICE_ID_FIELD:String="label.DelimitedParserConfigUI.serviceID";
		private const SCHEMA_NAME_FIELD:String="label.DelimitedParserConfigUI.schemaName";
		private const DELIMITER_FIELD:String="label.DelimitedParserConfigUI.delimiter";
		private const MESSAGE_START_FIELD:String="label.DelimitedParserConfigUI.messageStartLine";
		private const FOOTER_OFFSET_FIELD:String="label.DelimitedParserConfigUI.footerPattern";
		private const CONSIDER_QUOTE_FIELD:String="label.DelimitedParserConfigUI.considerQuote";
		
		public function DelimitedParserConfigUI()
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
			//configForm.percentWidth = 100;
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
			
			var compSpecificH1:HBox = new HBox();
			compSpecificH1.percentWidth = 100;
			compSpecificH1.percentHeight = 5;
			
			var compSpecificH2:HBox = new HBox();
			compSpecificH2.percentWidth = 100;
			compSpecificH2.percentHeight = 5;
			
			var compSpecificDisplayH3:HBox = new HBox();
			compSpecificDisplayH3.percentWidth = 100;
			compSpecificDisplayH3.percentHeight = 5;
			
			var serviceId:Label = new Label();
			serviceId.text=setFieldName(SERVICE_ID_FIELD);
			serviceId.setStyle("fontWeight","bold");
			serviceIdText = new RestrictedTextInput();
			// (Redmine Feature # 589) ID of flex components is set so that it can be uniquely identified by Ranorex
			serviceIdText.id=TeevraUIComponentsID.SERVICE_ID_ID;
			
			compSpecificH1.addChild(serviceId);
			compSpecificH1.addChild(serviceIdText);
					
			var schemaLabel:Label = new Label();
			schemaLabel.text = setFieldName(SCHEMA_NAME_FIELD);
			schemaLabel.setStyle("fontWeight", "bold");
			schemaNameSelection = new ComboBox();
			// (Redmine Feature # 589) ID of flex components is set so that it can be uniquely identified by Ranorex
			schemaNameSelection.id=TeevraUIComponentsID.SCHEMA_NAME_ID;
			schemaNameSelection.editable = true;
			schemaNameSelection.itemRenderer = new ClassFactory(Label);
			
			schemaNameSelection.dataProvider = schemas;
			schemaNameSelection.labelField = "schemaName";
			schemaNameSelection.selectedIndex = -1;
			
			compSpecificH1.addChild(schemaLabel);
			compSpecificH1.addChild(schemaNameSelection);
					
			var delimitedLabel:Label = new Label();
			delimitedLabel.text=setFieldName(DELIMITER_FIELD);
			delimitedLabel.setStyle("fontWeight", "bold");
			delimitedCharacter = new TextInput();
			// (Redmine Feature # 589) ID of flex components is set so that it can be uniquely identified by Ranorex
			delimitedCharacter.id=TeevraUIComponentsID.DELIMITER_ID;
			
			compSpecificH2.addChild(delimitedLabel);
			compSpecificH2.addChild(delimitedCharacter);
			
			var considerQuoteLabel:Label = new Label();
			considerQuoteLabel.text=setFieldName(CONSIDER_QUOTE_FIELD);
			considerQuoteLabel.setStyle("fontWeight", "bold");
			considerQuoteSelection = new ComboBox();
			// (Redmine Feature # 589) ID of flex components is set so that it can be uniquely identified by Ranorex
			considerQuoteSelection.id=TeevraUIComponentsID.CONSIDER_QUOTE_ID;
			considerQuoteSelection.editable = false;
			
			var collection:ArrayCollection = new ArrayCollection();
			collection.addItem("TRUE");
			collection.addItem("FALSE");
			considerQuoteSelection.dataProvider= collection;
			
			compSpecificH2.addChild(considerQuoteLabel);
			compSpecificH2.addChild(considerQuoteSelection);
			
			compSpecificDisplay.addChild(compSpecificH1);
			compSpecificDisplay.addChild(compSpecificH2);
			
			// Added as a part of Message start line and Footer Pattern - AP - 29-July-2009 : Code Start
			var messageStartLineLbl:Label = new Label();
			messageStartLineLbl.text=setFieldName(MESSAGE_START_FIELD);
			messageStartLineLbl.setStyle("fontWeight", "bold");
			messageStartLineText = new TextInput();
			// (Redmine Feature # 589) ID of flex components is set so that it can be uniquely identified by Ranorex
			messageStartLineText.id=TeevraUIComponentsID.MESSAGE_START_LINE_ID;
			
			compSpecificDisplayH3.addChild(messageStartLineLbl);
			compSpecificDisplayH3.addChild(messageStartLineText);
			
			var footerPatternLbl:Label = new Label();
			footerPatternLbl.text=setFieldName(FOOTER_OFFSET_FIELD);
			footerPatternLbl.setStyle("fontWeight", "bold");
			footerPatternText = new TextInput();
			// (Redmine Feature # 589) ID of flex components is set so that it can be uniquely identified by Ranorex
			footerPatternText.id=TeevraUIComponentsID.FOOTER_PATTERN_ID;
			compSpecificDisplayH3.addChild(footerPatternLbl);
			compSpecificDisplayH3.addChild(footerPatternText);
			
			compSpecificDisplay.addChild(compSpecificDisplayH3); 			
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
					schemaNameSelection.text = config.simpleValue;
				} else if (CONFIG_KEY_DELIMITERS == config.configKey) {
					delimitedCharacter.text = config.simpleValue;
				}
				else if (MESSAGE_START_LINE == config.configKey)
				{
					messageStartLineText.text = config.simpleValue;					
				}
				else if(FOOTER_PATTERN == config.configKey)
				{
					footerPatternText.text = config.simpleValue;
				}
				else if(FOOTER_PATTERN == config.configKey)
				{
					footerPatternText.text = config.simpleValue;
				}
				else if(CONFIG_KEY_CONSIDER_QUOTE == config.configKey)
				{
					considerQuoteSelection.text = config.simpleValue;
				}
			}
						
			// set attributes for earlier selected Schema on save
			configForm.setSchemaAttributes(schemaNameSelection.text,attributes,true,ATTRIBUTES_INDEX);
			
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
						rowVector.addItem(root.attribute("index").toString());
						rowVector.addItem(root.attribute("name").toString());
						tabularData.addItem(rowVector);
					}
					
				}
						
			}
			return tabularData;
		} 
		public  function getConfigFields():ArrayCollection
		{
			var coll:ArrayCollection = new ArrayCollection();
			
			coll.addItem(getField(FLD_INDEX_LBL, FLD_INDEX_NAME, FLD_INDEX_TYPE, 
				FLD_INDEX_WIDTH, null, null));
				
			attributes= new ArrayCollection();
			
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
			processServiceVO.compId=this.component.compId;
			
			//Set the first Configuration i.e. Schema Name
			var processServiceConfigVO:ProcessServiceConfigurationVO = new ProcessServiceConfigurationVO();
			processServiceConfigVO.serviceId=(serviceIdText.text).toString();			
			processServiceConfigVO.configKey = CONFIG_KEY_SCHEMA_DESCR;
			processServiceConfigVO.simpleValue = schemaNameSelection.text;
			processServiceVO.configurations = new ArrayCollection();
			processServiceVO.configurations.addItem(processServiceConfigVO);
			
			//set the second Configuration i.e. the Delimiters
			processServiceConfigVO = new ProcessServiceConfigurationVO();
			processServiceConfigVO.serviceId=(delimitedCharacter.text).toString();			
			processServiceConfigVO.configKey = CONFIG_KEY_DELIMITERS ;
			processServiceConfigVO.simpleValue = (delimitedCharacter.text).toString();
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
						
			//set the third Configuration i.e. the Schema mapping
			processServiceConfigVO = new ProcessServiceConfigurationVO();
			processServiceConfigVO.serviceId=(serviceIdText.text).toString();			
			processServiceConfigVO.configKey = CONFIG_KEY_SCHEMA_MAPPING;
			processServiceConfigVO.complexValue = createConfigXML(configForm.getUserSpecifiedValues());
			processServiceVO.configurations.addItem(processServiceConfigVO); 
			
			processServiceConfigVO = new ProcessServiceConfigurationVO();
			processServiceConfigVO.serviceId=(serviceIdText.text).toString();	
			processServiceConfigVO.configKey = CONFIG_KEY_CONSIDER_QUOTE;
			processServiceConfigVO.simpleValue = considerQuoteSelection.text;
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
			configForm.setSchemaAttributes(ComboBox(event.currentTarget).text,attributes,false,ATTRIBUTES_INDEX);
		}
		
		private function createConfigXML(tabularData:ArrayCollection):String
		{
			var configXML:XML = new XML("<binding></binding>");
			for(var i:uint=0;i<tabularData.length;i++)
			{
				var rowVector:ArrayCollection=ArrayCollection(tabularData.getItemAt(i));
                var fieldElement:XML = new XML();
               
				if(rowVector.getItemAt(ATTRIBUTES_INDEX)!="")
				{        
	                fieldElement = <field name={rowVector.getItemAt(ATTRIBUTES_INDEX).toString()} 
	                index = {rowVector.getItemAt(SCHEMA_ATTR_INDEX).toString()}/>;
					                           
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
			if(resourceManager.getString('TeevraUI', SCHEMA_NAME_FIELD+'.mandatory')=='Y')
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
			if(resourceManager.getString('TeevraUI', DELIMITER_FIELD+'.mandatory')=='Y')
			{
				for each (config in processServiceVO.configurations)
				{
					if (CONFIG_KEY_DELIMITERS == config.configKey) 
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
			if(resourceManager.getString('TeevraUI', CONSIDER_QUOTE_FIELD+'.mandatory')=='Y')
			{
				for each (config in processServiceVO.configurations)
				{
					if (CONFIG_KEY_CONSIDER_QUOTE == config.configKey) 
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
