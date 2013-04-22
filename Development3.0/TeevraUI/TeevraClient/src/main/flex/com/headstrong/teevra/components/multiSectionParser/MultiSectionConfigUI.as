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
 * $Id: MultiLayerParser.as
 * $Revision: 
 * $Author: PAakash
 * $DateTime: July 16, 2009  
 */
package com.headstrong.teevra.components.multiSectionParser
{
	import com.headstrong.teevra.client.graph.model.ProcessServiceConfigurationVO;
	import com.headstrong.teevra.client.graph.model.ProcessServiceVO;
	import com.headstrong.teevra.client.util.RestrictedTextInput;
	import com.headstrong.teevra.components.common.BaseComponentConfigurationUI;
	import com.headstrong.teevra.components.common.TeevraUIComponentsID;
	
	import flash.events.Event;
	
	import mx.collections.ArrayCollection;
	import mx.containers.HBox;
	import mx.containers.TabNavigator;
	import mx.containers.VBox;
	import mx.controls.ComboBox;
	import mx.controls.Label;
	import mx.core.ClassFactory;
	import mx.events.ListEvent;
	
	/**
	 * MultiSectionConfigUI which create the UI for Multisection parser. 
	 * Allows user to configure data format for generic header, section header and section body
	 */
	public class MultiSectionConfigUI extends BaseComponentConfigurationUI
	{
		private var tabbedControl:TabNavigator;
		private var schemaNameSelection:ComboBox;
		private var serviceIdText:RestrictedTextInput;	
		
		private var attributes:ArrayCollection;			
		private var schemaIsChanged:Boolean;
				
		private var headerConfigUI:HeaderConfigUI;
		private var sectionHeaderConfigUI:HeaderConfigUI;
		private var sectionBodyConfigUI:HeaderConfigUI;
						
		private const SERVICE_ID_FIELD:String="label.MultisectionConfigUI.serviceID";
		private const SCHEMA_NAME_FIELD:String="label.MultisectionConfigUI.schemaName";
		
		private const CONFIG_KEY_SCHEMA_DESCR:String = "objectSchemaDescriptor";		
		private const CONFIG_KEY_SCHEMA_MAPPING:String = "schemaMapping";
		
		/**
		 *Constructor of  MultiSectionConfigUI
		 * 
		 */
		public function MultiSectionConfigUI()
		{
			super();
		}
		/**
		 * Build all the component of Multisection parser i.e. Header, Section header, Section Body 
		 * 
		 */
		override public function initUI():void
		{
			addComponentSpecificUI();
			//create tabs - one for Header, one for Section Header and one for Section Body
			tabbedControl = new TabNavigator();
			tabbedControl.height=300;
			tabbedControl.width=800;
			//Header part
			headerConfigUI = new HeaderConfigUI(HeaderConfigUI.GENERIC_HEADER_MODE);
			headerConfigUI.initUI();
			
			//Section Header Part
			sectionHeaderConfigUI = new HeaderConfigUI(HeaderConfigUI.SECTION_HEADER_MODE);
			sectionHeaderConfigUI.initUI();
			
			//Section Body Part
			sectionBodyConfigUI = new HeaderConfigUI(HeaderConfigUI.SECTION_BODY_MODE);
			sectionBodyConfigUI.initUI();
			
			tabbedControl.addChild(headerConfigUI);
			tabbedControl.addChild(sectionHeaderConfigUI);			
			tabbedControl.addChild(sectionBodyConfigUI);
			schemaNameSelection.addEventListener(ListEvent.CHANGE, setSchemaAttributesOnChange);		
			this.addChild(tabbedControl);
			if(this.processServiceConfig!=null)
			{
				loadProcessServiceConfig();								
			}
		}
		/**
		 *  ComponentSpecificUI containing all the common elements
		 */
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
			serviceIdText.id=TeevraUIComponentsID.SERVICE_ID_ID;
			
			
			compSpecificDisplayH1.addChild(serviceId);
			compSpecificDisplayH1.addChild(serviceIdText);
		
			var schemaLabel:Label = new Label();
			schemaLabel.text = setFieldName(SCHEMA_NAME_FIELD);
			schemaLabel.setStyle("fontWeight", "bold");
			
			schemaNameSelection = new ComboBox();
			// (Redmine Feature # 589) ID of flex components is set so that it can be uniquely identified by Ranorex
			schemaNameSelection.id=TeevraUIComponentsID.SCHEMA_NAME_ID;
			schemaNameSelection.editable = false;
			schemaNameSelection.itemRenderer = new ClassFactory(Label);
			schemaNameSelection.dataProvider = schemas;
			schemaNameSelection.labelField = "schemaName";
			schemaNameSelection.selectedIndex = -1;
		
			compSpecificDisplayH1.addChild(schemaLabel);
			compSpecificDisplayH1.addChild(schemaNameSelection);				
			
			compSpecificDisplay.addChild(compSpecificDisplayH1);
			
			this.addChild(compSpecificDisplay);
		}
		/**
		 * Event which load attributes of the schema   
		 * @param event
		 * 
		 */
		private function setSchemaAttributesOnChange(event:Event):void
		{		
			sectionHeaderConfigUI.schemaSelectionValue = ComboBox(event.currentTarget).text;
			sectionHeaderConfigUI.setHeaderSchemaAttributes();
			
			sectionBodyConfigUI.schemaSelectionValue = ComboBox(event.currentTarget).text;
			sectionBodyConfigUI.setHeaderSchemaAttributes()			
		}	
			
		/**
		 *  Saves the configuration of UI
		 * @return ProcessServiceVO
		 * 
		 */
		override public function getConfiguration():ProcessServiceVO
		{
			var tempString:XML=new XML();
		    
			if (processServiceConfig == null)
			{
				processServiceConfig=new ProcessServiceVO();
			}
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
		
			//set the thrid Configuration i.e. the Schema mapping 
			//containing the XML config for all the blocks
			processServiceConfigVO = new ProcessServiceConfigurationVO();
			processServiceConfigVO.serviceId=(serviceIdText.text).toString();				
			processServiceConfigVO.configKey = CONFIG_KEY_SCHEMA_MAPPING;
			processServiceConfigVO.complexValue = createConfigXML();
			processServiceVO.configurations.addItem(processServiceConfigVO);
			
			return processServiceVO;
		}
		/**
		 * Constructs XML as expected by MultisectionParser component
		 * @param tabularData
		 * @return 
		 * 
		 */
		private function createConfigXML():String
		{
			var configXML:XML = <Config></Config>;

			//construct the generic header part
			if(headerConfigUI.isHeaderPresent())
			{
				  configXML.appendChild(new XML("<IsHeaderPresent>true</IsHeaderPresent>"));
				  if ("" != headerConfigUI.headerLine) {
				  	var line:XML = <HeaderLine>{headerConfigUI.headerLine}</HeaderLine>;
				  	configXML.appendChild(line);
				  }
				  if ("" != headerConfigUI.headerIdentifier) {
				  	var id:XML = <HeaderIdentifier>{headerConfigUI.headerIdentifier}</HeaderIdentifier>;
				  	configXML.appendChild(id);
				  }
				  configXML.appendChild(headerConfigUI.createConfigXML());	  
			}
			else
			{
				configXML.appendChild(new XML("<IsHeaderPresent>false</IsHeaderPresent>"));
			}
			
			//construct the section header part
			var sectionRootXML:XML = new XML("<Sections></Sections>");
			var sectionXML:XML = new XML("<Section></Section>");
			if(sectionHeaderConfigUI.isHeaderPresent())
			{
				configXML.appendChild(new XML("<IsSectionHeaderPresent>true</IsSectionHeaderPresent>"));
				if ("" != sectionHeaderConfigUI.headerLine) {
					var shLine:XML = <SectionHeaderLine>{sectionHeaderConfigUI.headerLine}</SectionHeaderLine>;
					configXML.appendChild(shLine);
				}
				if ("" != sectionHeaderConfigUI.headerIdentifier) {
					var shId:XML = <SectionHeaderIdentifier>{sectionHeaderConfigUI.headerIdentifier}</SectionHeaderIdentifier>;
					configXML.appendChild(shId);
				}
				
				sectionXML.appendChild(sectionHeaderConfigUI.createConfigXML());	  
			}
			else
			{
				configXML.appendChild(new XML("<IsSectionHeaderPresent>false</IsSectionHeaderPresent>"));
			}
			
			//construct the section body part
			if ("" != sectionBodyConfigUI.headerLine) {
				var sbLine:XML = <SectionBodyLine>{sectionBodyConfigUI.headerLine}</SectionBodyLine>;
				configXML.appendChild(sbLine);
			}
			if ("" != sectionBodyConfigUI.headerIdentifier) {
				var sbId:XML = <SectionBodyIdentifier>{sectionBodyConfigUI.headerIdentifier}</SectionBodyIdentifier>;
				configXML.appendChild(sbId);
			}
			sectionXML.appendChild(sectionBodyConfigUI.createConfigXML());
			sectionRootXML.appendChild(sectionXML);
			configXML.appendChild(sectionRootXML);
			return configXML.toXMLString();
		}
		
		/**
		 * Populates the UI field with the values that were saved last time in the 
		 * ProcessServiceConfigurationVO.
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
			var schemaMapping:String;
			for each (var config : ProcessServiceConfigurationVO in configurations) {
				if (CONFIG_KEY_SCHEMA_DESCR == config.configKey) {
					schemaNameSelection.text = config.simpleValue;
				} else if (CONFIG_KEY_SCHEMA_MAPPING == config.configKey) {
					schemaMapping = config.complexValue;
				}
			}
			
			if ((schemaMapping != null) && (schemaMapping != "")) {
				var configXml:XML = XML(schemaMapping);
				//set meta data for header, section header and section body				
				for each (var headerLineXml:XML in configXml.HeaderLine) {
					headerConfigUI.headerLine = headerLineXml.text().toString();
					break;
				}
				for each (var headerIdXml:XML in configXml.HeaderIdentifier) {
					headerConfigUI.headerIdentifier = headerIdXml.text().toString();
					break;
				}
				for each (var sectionHeaderLineXml:XML in configXml.SectionHeaderLine) {
					sectionHeaderConfigUI.headerLine = sectionHeaderLineXml.text().toString();
					break;
				}
				for each (var sectionHeaderIdXml:XML in configXml.SectionHeaderIdentifier) {
					sectionHeaderConfigUI.headerIdentifier = sectionHeaderIdXml.text().toString();
					break;
				}
				for each (var sectionBodyLineXml:XML in configXml.SectionBodyLine) {
					sectionBodyConfigUI.headerLine = sectionBodyLineXml.text().toString();
					break;
				}
				for each (var sectionBodyIdXml:XML in configXml.SectionBodyIdentifier) {
					sectionBodyConfigUI.headerIdentifier = sectionBodyIdXml.text().toString();
					break;
				}
				
				//load binding in generic header
				for each(var genHdr:XML in configXml.GenericHeader) {
					headerConfigUI.loadConfig(genHdr);
					break;
				}
				
				//loading binding for section header and section body
				for each (var sections:XML in configXml.Sections) { 
					for each(var section:XML in sections.Section) {
						for each (var sectionHdr:XML in section.SectionHeader) {
							sectionHeaderConfigUI.schemaSelectionValue = schemaNameSelection.text;
							sectionHeaderConfigUI.loadConfig(sectionHdr);
							break;
						}
						for each (var sectionBody:XML in section.SectionBody) {
							sectionBodyConfigUI.schemaSelectionValue = schemaNameSelection.text;
							sectionBodyConfigUI.loadConfig(sectionBody);
							break;
						}
						break;
					}
					break;
				}
			}
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

	}
}
