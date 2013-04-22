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
 * $Id: XMLParserConfigUI.as
 * $Revision: 
 * $Author: PAakash
 * $DateTime: Nov 26, 2008  
 */
package com.headstrong.teevra.components.xmlparser
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
	import mx.core.ClassFactory;
	import mx.events.ListEvent;
	
	public class XMLParserConfigUI extends BaseComponentConfigurationUI
	{
		private var schemaNameSelection:ComboBox;
		private var configForm:GridConfigForm;
		private var attributes:ArrayCollection;
			
		private var serviceIdText:RestrictedTextInput;	
		private var schemaIsChanged:Boolean;
			
		private const SCHEMA_ATTR_INDEX:int = 0;
		private const XPATH_ATTR_INDEX:int = 1;
		private const CONFIG_KEY_SCHEMA_DESCR:String = "objectSchemaDescriptor";
		private const CONFIG_KEY_SCHEMA_MAPPING:String = "schemaMapping";
	
		
		private const FLD_ATTR_LBL:String = "configField.XMLParserConfigUI.attributes";
		private const FLD_ATTR_NAME:String = "schemaAttribute";
		private const FLD_ATTR_TYPE:String = GridConfigField.EDITABLE_LIST_FIELD;
		private const FLD_ATTR_WIDTH:Number = 50;
		
		private const FLD_XPATH_LBL:String = "configField.XMLParserConfigUI.XPath";
		private const FLD_XPATH_NAME:String = "xpath";
		private const FLD_XPATH_TYPE:String = GridConfigField.TEXT_FIELD;
		private const FLD_XPATH_WIDTH:Number = 50;
		
		private const SERVICE_ID_FIELD:String="label.XMLParserConfigUI.serviceID";
		private const SCHEMA_NAME_FIELD:String="label.XMLParserConfigUI.schemaName";
			
		public function XMLParserConfigUI()
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
			this.height = 300;
			this.verticalScrollPolicy = "auto";
			this.addChild(configForm);
			schemaNameSelection.addEventListener(ListEvent.CHANGE, setSchemaAttributesOnChange);			
			this.verticalScrollPolicy = "auto";
		}
		private function addComponentSpecificUI() : void 
		{
				var compSpecificDisplay:VBox = new VBox();
				compSpecificDisplay.percentWidth = 100;
				compSpecificDisplay.percentHeight = 10;
				
				var compSpecificDisplayH1:HBox = new HBox();
				compSpecificDisplayH1.percentWidth = 100;
				compSpecificDisplayH1.percentHeight = 5;
				
				var serviceId:Label = new Label();
			
				serviceId.text=setFieldName(SERVICE_ID_FIELD);
				serviceId.setStyle("fontWeight","bold");
				
				serviceIdText = new RestrictedTextInput();
				// (Redmine Feature # 589) ID of flex components is set so that it can be uniquely identified by Ranorex
				serviceIdText.id =TeevraUIComponentsID.SERVICE_ID_ID;   
				
				compSpecificDisplayH1.addChild(serviceId);
				compSpecificDisplayH1.addChild(serviceIdText);
			
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
			
				compSpecificDisplayH1.addChild(schemaLabel);
				compSpecificDisplayH1.addChild(schemaNameSelection);				
				
				compSpecificDisplay.addChild(compSpecificDisplayH1);
				
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
				if (CONFIG_KEY_SCHEMA_DESCR == config.configKey) {
					schemaNameSelection.text = config.simpleValue;
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
						rowVector.addItem(root.attribute("name").toString());
						rowVector.addItem(root.attribute("xpath").toString());
						tabularData.addItem(rowVector);  
					}
					
				}
						
			}
			return tabularData;
		} 
		
		public function getConfigFields():ArrayCollection
		{	
			var coll:ArrayCollection = new ArrayCollection();
			
			attributes = new ArrayCollection();	
			coll.addItem(getField(FLD_ATTR_LBL, FLD_ATTR_NAME, FLD_ATTR_TYPE, 
				FLD_ATTR_WIDTH, attributes, null));
			
			coll.addItem(getField(FLD_XPATH_LBL, FLD_XPATH_NAME, FLD_XPATH_TYPE, 
				FLD_XPATH_WIDTH, null, null));
						
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
		private function setSchemaAttributesOnChange(event:Event):void
		{	
			configForm.setSchemaAttributes(ComboBox(event.currentTarget).text,attributes,false,SCHEMA_ATTR_INDEX);
		}	

		private function createConfigXML(tabularData:ArrayCollection):String
		{
			var configXML:XML = new XML("<binding></binding>");
			for(var i:uint=0;i<tabularData.length;i++)
			{
					var rowVector:ArrayCollection=ArrayCollection(tabularData.getItemAt(i));
					if(rowVector.getItemAt(SCHEMA_ATTR_INDEX)!="")
					{
	                var fieldElement:XML = new XML();
	               
	                fieldElement = <field name={rowVector.getItemAt(SCHEMA_ATTR_INDEX).toString()} 
	                xpath={rowVector.getItemAt(XPATH_ATTR_INDEX).toString()}/>;
	                            
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
			if(resourceManager.getString('TeevraUI', SERVICE_ID_FIELD+'.mandatory')=='Y')
			{
				if(processServiceVO.serviceId==null ||processServiceVO.serviceId=="")
				{
					return false;
				}
			}
			if(resourceManager.getString('TeevraUI', SCHEMA_NAME_FIELD+'.mandatory')=='Y')
			{
				for each (var config : ProcessServiceConfigurationVO in processServiceVO.configurations)
				{
					if (CONFIG_KEY_SCHEMA_DESCR == config.configKey) 
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