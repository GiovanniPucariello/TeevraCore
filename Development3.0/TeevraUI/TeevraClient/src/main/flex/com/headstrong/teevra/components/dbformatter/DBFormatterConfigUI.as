/*
 * The information in this document is subject to change without notice and 
 * does not represent a commitment by Headstrong Corporation. The software 
 * and/or databases described in this document are furnished under a license 
 * agreement and may be used or copied only in accordance with the terms of 
 * the agreement. 
 * 
 * Copyright �?© 2008 Headstrong Corporation
 * All rights reserved.
 * 
 * $Id: DBFormatterConfigUI.as
 * $Revision: 
 * $Author: PAakash
 * $DateTime: Nov 26, 2008  
 */
package com.headstrong.teevra.components.dbformatter
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
	
	public class DBFormatterConfigUI extends BaseComponentConfigurationUI
	{
		private var schmNmForParserDynamicTyp:ArrayCollection;
		private var schemaNameSelection:ComboBox;
		private var schemaTypeCmb:ComboBox;
		private var configForm:GridConfigForm;
		private var delimitedCharacter:TextInput
		private var attributes:ArrayCollection;
		
		private var serviceIdText:RestrictedTextInput;
		private var schemaIsChanged:Boolean;
		private var rootText:TextInput;
		
		private const CONFIG_KEY_PARSE_TYPE:String = "parseType";
		
		private const SCHEMA_ATTR_INDEX:int = 0;
		private const ATTRIBUTES_INDEX:int = 1;
		private const CONFIG_KEY_SCHEMA_DESCR:String = "objectSchemaDescriptor";
		private const CONFIG_KEY_SCHEMA_MAPPING:String = "schemaMapping";
		private const CONFIG_KEY_SCHEMA_TYPE:String = "schemaType";
		private const CONFIG_KEY_SCHEMA_ROOT:String = "root";
		
		private const FLD_ATTR_LBL:String = "configField.DBFormatterConfigUI.index";
		private const FLD_ATTR_NAME:String = "dbIndex";
		private const FLD_ATTR_TYPE:String = GridConfigField.TEXT_FIELD;
		private const FLD_ATTR_WIDTH:Number = 50;
			
		private const FLD_FIELD_LBL:String = "configField.DBFormatterConfigUI.fieldName";
		private const FLD_FIELD_NAME:String = "fieldColumn";
		private const FLD_FIELD_TYPE:String = GridConfigField.EDITABLE_LIST_FIELD;
		private const FLD_FIELD_WIDTH:Number = 50;
		
		private const SERVICE_ID_FIELD:String="label.DBFormatterConfigUI.serviceID";
		private const SCHEMA_NAME_FIELD:String="label.DBFormatterConfigUI.schemaName";
		private const SCHEMA_TYPE_LBL:String = "label.DBFormatterConfigUI.schemaType";
		private const ROOT_LBL:String = "label.DBFormatterConfigUI.root";
		
		private const SCHEMA_TYPE_DEFAULT:String = "Default";
		private const SCHEMA_TYPE_DYNAMIC:String = "Dynamic";
		
		
		
		public function DBFormatterConfigUI()
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
		}
		private function addComponentSpecificUI() : void 
		{
			var compSpecificDisplay:VBox = new VBox();
			compSpecificDisplay.percentWidth = 100;
			compSpecificDisplay.percentHeight = 10;
			
			var compSpecificDisplayH1:HBox = new HBox();
			compSpecificDisplayH1.percentWidth = 100;
			compSpecificDisplayH1.percentHeight = 5;
			
			var compSpecificDisplayH2:HBox = new HBox();
			compSpecificDisplayH2.percentWidth = 100;
			compSpecificDisplayH2.percentHeight = 5;
			
			var serviceId:Label = new Label();
			serviceId.text=setFieldName(SERVICE_ID_FIELD);
			serviceId.setStyle("fontWeight","bold");
			serviceIdText = new RestrictedTextInput();
		    // (Redmine Feature # 589) ID of flex components is set so that it can be uniquely identified by Ranorex
			serviceIdText.id=TeevraUIComponentsID.SERVICE_ID_ID;
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
			compSpecificDisplayH2.addChild(schemaType);
			compSpecificDisplayH2.addChild(schemaTypeCmb);			
							
			var rootLbl:Label = new Label();
			rootLbl.text=setFieldName(ROOT_LBL);
			rootLbl.setStyle("fontWeight","bold");
			rootText = new RestrictedTextInput();
			// (Redmine Feature # 589) ID of flex components is set so that it can be uniquely identified by Ranorex
			rootText.id=TeevraUIComponentsID.ROOT_ID;
			compSpecificDisplayH2.addChild(rootLbl);
			compSpecificDisplayH2.addChild(rootText);
			
			compSpecificDisplay.addChild(compSpecificDisplayH1);
			compSpecificDisplay.addChild(compSpecificDisplayH2);
			
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
					schmNmForParserDynamicTyp  = new ArrayCollection();
					schmNmForParserDynamicTyp.addItem(config.simpleValue);
					schemaNameSelection.text = config.simpleValue;
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
				else if(CONFIG_KEY_SCHEMA_ROOT == config.configKey)
				{
					rootText.text = config.simpleValue;
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
		
		public function getConfigFields():ArrayCollection
		{
			var coll:ArrayCollection = new ArrayCollection();
			
			coll.addItem(getField(FLD_ATTR_LBL, FLD_ATTR_NAME, FLD_ATTR_TYPE, 
				FLD_ATTR_WIDTH, null, null));
				
			attributes = new ArrayCollection();
			
			coll.addItem(getField(FLD_FIELD_LBL, FLD_FIELD_NAME, FLD_FIELD_TYPE, 
				FLD_FIELD_WIDTH, attributes, null));
			
						
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
			
			//Schema Type
			processServiceConfigVO = new ProcessServiceConfigurationVO();
			processServiceConfigVO.serviceId=(serviceIdText.text).toString();	
			processServiceConfigVO.configKey = CONFIG_KEY_SCHEMA_TYPE;
			processServiceConfigVO.simpleValue = schemaTypeCmb.text;
			processServiceVO.configurations.addItem(processServiceConfigVO);
			
			//Root
			processServiceConfigVO = new ProcessServiceConfigurationVO();
			processServiceConfigVO.serviceId=(serviceIdText.text).toString();	
			processServiceConfigVO.configKey = CONFIG_KEY_SCHEMA_ROOT;
			processServiceConfigVO.simpleValue = rootText.text;
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
	                index={rowVector.getItemAt(SCHEMA_ATTR_INDEX).toString()}/>;
	                            
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
			
			if(resourceManager.getString('TeevraUI', ROOT_LBL+'.mandatory')=='Y')
			{
				for each (config in processServiceVO.configurations)
				{
					if (CONFIG_KEY_SCHEMA_ROOT == config.configKey) 
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
