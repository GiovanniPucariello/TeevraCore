package com.headstrong.teevra.components.cStructParserFormatter
{
	import com.headstrong.teevra.client.graph.model.ProcessServiceConfigurationVO;
	import com.headstrong.teevra.client.graph.model.ProcessServiceVO;
	import com.headstrong.teevra.client.util.RestrictedTextInput;
	import com.headstrong.teevra.components.common.BaseComponentConfigurationUI;
	import com.headstrong.teevra.components.common.TeevraUIComponentsID;
	
	import flash.events.MouseEvent;
	
	import mx.collections.ArrayCollection;
	import mx.containers.HBox;
	import mx.containers.TabNavigator;
	import mx.containers.VBox;
	import mx.controls.Alert;
	import mx.controls.ComboBox;
	import mx.controls.Label;
	import mx.controls.TextInput;
	import mx.core.ClassFactory;
	import mx.core.Container;
	import mx.core.IFlexDisplayObject;
	import mx.events.ListEvent;

	/**
	 * Configuration screen for C-Struct parser & formatter. It allows user to specify mapping of fields to
	 * individual members in the structure and also to specify detailed specification for individual structure.
	 */
	public class CStructParserFormatterUI extends BaseComponentConfigurationUI implements StructModelListener
	{
		private var popup:IFlexDisplayObject;
		private var schemaNameSelection:ComboBox;
		private var rootStructSelection:ComboBox;
		
		/** Holds the list of all root level structure
		 */
		private var rootLevelStructList:ArrayCollection;
		
		private var structHolder:StructHolder;
		private var structDefnUI:StructureDefinitionUI;
		private var structFieldMapping:FieldMappingUI;
		
		private var serviceIdText:RestrictedTextInput;

		private var selectedSchemaName:String;
		private var schemaIsChanged:Boolean;
		
		//Keys / config id that identifies the component configuration 
		private const CONFIG_KEY_SCHEMA_DESCR:String = "objectSchemaDescriptor";
		private const CONFIG_KEY_ROOT_STRUCT_NAME:String = "rootStructure";
		private const CONFIG_KEY_STRUCT_FORMATTER_CONFIG:String = "structFormatterConfig";
		private const CONFIG_KEY_STRUCT_CONFIG:String = "structConfig";
		
		private const SERVICE_ID_FIELD:String="label.CStructParser.serviceID";
		private const SCHEMA_NAME_FIELD:String="label.CStructParser.schemaLabelName";
		private const ROOT_STRUCT_NAME_FIELD:String="label.CStructParser.rootStructName";

		public function CStructParserFormatterUI()
		{
			super();
			structHolder = new StructHolder();
			structHolder.addStructListObserver(this);
			rootLevelStructList = new ArrayCollection();
		}

		/**
		 * Called by the parent application after setting the required schema names and component details in the base class.
		 */
		override public function initUI():void
		{
			//add top level components - service id, schema name, root struct
			addComponentSpecificUI();

			//create tabs - one for structure definition and another for field mapping
			var tabbedControl:TabNavigator = new TabNavigator();
			structDefnUI = new StructureDefinitionUI(structHolder);
			structFieldMapping = new FieldMappingUI(structHolder);
			structDefnUI.initUI();
			structFieldMapping.initUI();
			if (processServiceConfig != null)
			{
				//loadDetails in process service configuration
				loadProcessServiceConfig();
			}
			tabbedControl.addChild(structDefnUI);
			tabbedControl.addChild(structFieldMapping);
			
			//add tabcontrol
			this.addChild(tabbedControl);
			this.height=300;
			this.verticalScrollPolicy="auto";
			schemaNameSelection.addEventListener(ListEvent.CHANGE, structFieldMapping.setSchemaAttributesOnChange);
			rootStructSelection.addEventListener(MouseEvent.CLICK, structFieldMapping.setStructAttributesOnChange);
		}
		
		/**
		 * Call back function to notify that a structure list is being loaded
		 */
		public function structureListLoaded():void {
			rootLevelStructList.removeAll();
			structHolder.getRootLevelStructs(rootLevelStructList);
		}

		/**
		 * Call back function to notify that there a structure is being added
		 */
		public function structureAdded(newStruct:StructObjectModel):void {
			if (newStruct.root) {
				rootLevelStructList.addItem(newStruct);
			}
			structDefnUI.structAdded(newStruct);
		}

		/**
		 * Call back function to notify that a structure is being modified
		 */
		public function structureModified(modifiedStruct:StructObjectModel):void {
			var index:int = rootLevelStructList.getItemIndex(modifiedStruct); 
			if (index != -1) {
				if (!modifiedStruct.root) {
					//modifiedStruct was previously set as root, but now it is not. .// remove from list
					rootLevelStructList.removeItemAt(index);
				}
			}
			else if (modifiedStruct.root) {
				//modifiedStruct was previously not root, but now set as root... add to list
				rootLevelStructList.addItem(modifiedStruct);
			}
		}

		/**
		 * Call back function to notify that a structure is being removed
		 */
		public function structureRemoved(removedStruct:StructObjectModel):void {
			if (removedStruct.root) {
				rootLevelStructList.removeItemAt(rootLevelStructList.getItemIndex(removedStruct));
			}
			structDefnUI.structRemoved(removedStruct);
		}

		/**
		 * Creates the container with relevant components that form the top part of the config form.
		 * This shows the serviceId, schema name, root structure name. When this UI is used for an enricher,
		 *  there are no two schemas. Only input schemas need to be shown if the component is an enricher.
		 */
		private function addComponentSpecificUI():void
		{
			var compSpecificDisplay:VBox=new VBox();
			compSpecificDisplay.percentWidth=100;
			compSpecificDisplay.percentHeight=10;

			addServiceIdFields(compSpecificDisplay);

			var compSpecificH2:HBox=new HBox();
			compSpecificH2.percentWidth=100;
			compSpecificH2.percentHeight=5;

			schemaNameSelection = new ComboBox();
			// (Redmine Feature # 589) ID of flex components is set so that it can be uniquely identified by Ranorex
			schemaNameSelection.id=TeevraUIComponentsID.SCHEMA_NAME_ID;
			addDropdownField(compSpecificH2, SCHEMA_NAME_FIELD, schemaNameSelection, schemas, "schemaName");

			rootStructSelection = new ComboBox();
			// (Redmine Feature # 589) ID of flex components is set so that it can be uniquely identified by Ranorex
			rootStructSelection.id=TeevraUIComponentsID.ROOT_STRUCTURE_ID;
			rootStructSelection.selectedIndex=-1;
			addDropdownField(compSpecificH2, ROOT_STRUCT_NAME_FIELD, rootStructSelection, 
				rootLevelStructList, "structName");
			compSpecificDisplay.addChild(compSpecificH2);

			this.addChild(compSpecificDisplay);
		}

		/**
		 * Adds a label and input field for serviceId to the given container.
		 */
		private function addServiceIdFields(parent:Container):void
		{
			var compSpecificH1:HBox=new HBox();
			compSpecificH1.percentWidth=100;
			compSpecificH1.percentHeight=5;

			var serviceId:Label=new Label();
			serviceId.text=setFieldName(SERVICE_ID_FIELD);
			serviceId.setStyle("fontWeight", "bold");
			serviceId.percentWidth=20;

			serviceIdText=new RestrictedTextInput();
			// (Redmine Feature # 589) ID of flex components is set so that it can be uniquely identified by Ranorex
			serviceIdText.id=TeevraUIComponentsID.SERVICE_ID_ID;
			serviceIdText.percentWidth=20;

			compSpecificH1.addChild(serviceId);
			compSpecificH1.addChild(serviceIdText);
			parent.addChild(compSpecificH1);
		}

		/**
		 * Adds a drop down field to the container. Used to add both list of schemas and structure.
		 */
		private function addDropdownField(parent:Container, labelKey:String, 
			dropDown:ComboBox, dataProvider:ArrayCollection, labelField:String):void
		{
			var schemaLabel:Label=new Label();
			schemaLabel.text=setFieldName(labelKey);
			schemaLabel.setStyle("fontWeight", "bold");
			schemaLabel.percentWidth=20;

			dropDown.editable = true;
			dropDown.itemRenderer = new ClassFactory(Label);
			dropDown.dataProvider = dataProvider;
			dropDown.labelField = labelField;
			dropDown.selectedIndex = -1;
			dropDown.percentWidth = 20;

			parent.addChild(schemaLabel);
			parent.addChild(dropDown);
		}

		/**
		 * Populates the UI field with the values that were saved last time in the ProcessServiceConfigurationVO.
		 */
		private function loadProcessServiceConfig():void
		{
			//set label values
			serviceIdText.text = processServiceConfig.serviceId;
			loadConfigurations(processServiceConfig.configurations);
		}

		/**
		 * Constructs the UI with the given list of component configurations
		 */
		override public function loadConfigurations(configurations:ArrayCollection):void
		{
			//load schema name and root struct name
			var schemaName:String;
			var rootStructName:String;
			var structConfig:String;
			var structFormatterConfig:String;
			
			for each (var config:ProcessServiceConfigurationVO in configurations)
			{
				if (CONFIG_KEY_SCHEMA_DESCR == config.configKey)
				{
					schemaName = config.simpleValue;
				} else if (CONFIG_KEY_ROOT_STRUCT_NAME == config.configKey) {
					rootStructName = config.simpleValue;
				} else if (CONFIG_KEY_STRUCT_CONFIG == config.configKey) {
					structConfig = config.complexValue;
				} else if (CONFIG_KEY_ROOT_STRUCT_NAME == config.configKey) {
					structFormatterConfig = config.complexValue;
				}
			}
			
			schemaNameSelection.text = schemaName;
			// set attributes for earlier selected Schema
			structFieldMapping.setSchemaAttributes(schemaNameSelection.text, true);
			//load all the structures first
			if ((structConfig != null) && (structConfig != "")) {
				var configXML:XML = XML(structConfig);
				structDefnUI.loadConfigXML(configXML);
				//above function would have initialized structHolder and all the dependent lists
				//now update the rest of struct dependent components
				rootStructSelection.text = rootStructName;
				// set attributes for earlier selected root struct on save
				structFieldMapping.setStructAttributes(rootStructName);

				//now load the field mapping				
				configXML = XML(structFormatterConfig);
				structFieldMapping.loadConfigXML(configXML);
			}
		}

		/**
		 * Constructs configuration from the values entered by the user in the UI.
		 */
		override public function getConfiguration():ProcessServiceVO
		{
			if(rootStructSelection.selectedItem!=null)
			{
				if (processServiceConfig == null)
				{
					processServiceConfig=new ProcessServiceVO();
				}
				if (processServiceConfig.configurations != null)
				{
					processServiceConfig.configurations.removeAll();
				}
				else
				{
					processServiceConfig.configurations=new ArrayCollection();
				}
	
				var processServiceConfigVO:ProcessServiceConfigurationVO=new ProcessServiceConfigurationVO();
	
				//Set Service Id of ProcessServiceVO
				processServiceConfig.serviceId=(serviceIdText.text).toString();
				//Set schema name & root struct name
				processServiceConfig.configurations.addItem(createConfiguration(serviceIdText.text, 
					CONFIG_KEY_SCHEMA_DESCR, true, schemaNameSelection.text));
				processServiceConfig.configurations.addItem(createConfiguration(serviceIdText.text, 
					CONFIG_KEY_ROOT_STRUCT_NAME, true, rootStructSelection.text));
				//set the values of complex config fields .. structConfig
				processServiceConfig.configurations.addItem(createConfiguration(serviceIdText.text, 
					CONFIG_KEY_STRUCT_CONFIG, false, 
					structDefnUI.createConfigXML(StructObjectModel(rootStructSelection.selectedItem))));
				processServiceConfig.configurations.addItem(createConfiguration(serviceIdText.text, 
					CONFIG_KEY_STRUCT_FORMATTER_CONFIG, false, 
					structFieldMapping.createConfigXML()));
	
				var mandatoryFlag:Boolean = validateFields(processServiceConfig);
				if (!mandatoryFlag)
				{
					Alert.show("Please fill in all the mandatory fields");
				}
				else
				{
					return processServiceConfig;
				}
				
			}
			else
			{
				Alert.show("Please Create Root Structure Before Saving");
			}
			return null;
		}

		/**
		 * Constructs a configuration instance from the given params
		 */
		private function createConfiguration(sId:String, key:String, simple:Boolean, 
			configVal:String):ProcessServiceConfigurationVO
		{

			var processServiceConfigVO:ProcessServiceConfigurationVO=new ProcessServiceConfigurationVO();
			processServiceConfigVO.serviceId=sId;
			processServiceConfigVO.configKey=key;
			if (simple)
			{
				processServiceConfigVO.simpleValue=configVal;
			}
			else
			{
				processServiceConfigVO.complexValue=configVal;
			}
			return processServiceConfigVO;

		}

		private function setFieldName(field:String):String
		{
			var fieldName:String=resourceManager.getString('TeevraUI', field + '.name');
			if (resourceManager.getString('TeevraUI', field + '.mandatory') == 'Y')
			{
				fieldName+="*";
			}
			return fieldName;
		}

		private function validateFields(processServiceVO:ProcessServiceVO):Boolean
		{
			var config:ProcessServiceConfigurationVO;
			if (resourceManager.getString('TeevraUI', SERVICE_ID_FIELD + '.mandatory') == 'Y')
			{
				if (processServiceVO.serviceId == null || processServiceVO.serviceId == "")
				{
					return false;
				}
			}
			if (resourceManager.getString('TeevraUI', SCHEMA_NAME_FIELD + '.mandatory') == 'Y')
			{
				for each (config in processServiceVO.configurations)
				{
					if (CONFIG_KEY_SCHEMA_DESCR == config.configKey)
					{
						if (config.simpleValue == null || config.simpleValue == "")
							return false;
					}
				}

			}
			if (resourceManager.getString('TeevraUI', ROOT_STRUCT_NAME_FIELD + '.mandatory') == 'Y')
			{
				for each (config in processServiceVO.configurations)
				{
					if (CONFIG_KEY_ROOT_STRUCT_NAME == config.configKey)
					{
						if (config.simpleValue == null || config.simpleValue == "")
							return false;
					}
				}

			}
			return true;
		}

	}
}
