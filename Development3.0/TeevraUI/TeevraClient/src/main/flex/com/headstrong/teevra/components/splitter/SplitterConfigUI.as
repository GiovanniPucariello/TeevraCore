package com.headstrong.teevra.components.splitter
{
	import com.headstrong.teevra.client.graph.model.ProcessServiceConfigurationVO;
	import com.headstrong.teevra.client.graph.model.ProcessServiceVO;
	import com.headstrong.teevra.client.util.RestrictedTextInput;
	import com.headstrong.teevra.components.common.BaseComponentConfigurationUI;
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
	import mx.core.Container;
	import mx.events.ListEvent;

	/**
	 * Configuration screen for Splitter component's Configuration.
	 * Allows user to choose the strategy for splitting and based on the strategy allows user
	 * to configure the splitter.
	 */
	public class SplitterConfigUI extends BaseComponentConfigurationUI
	{
		private var serviceIdText:RestrictedTextInput;
		private var splitterLogicSelection:ComboBox;
		private var schemaSelection:ComboBox;
		private var splitterStrategy:ISplitterStrategy;
		private var splitterConfigurationContainer:Container;
		private var splitterStrategyCache:Object=new Object();

		private const SERVICE_ID_FIELD:String="label.SplitterConfigUI.serviceID";
		private const SCHEMA_NAME_FIELD:String="label.SplitterConfigUI.schemaLabelName";
		private const SPLITTER_LOGIC_FIELD:String="label.SplitterConfigUI.splitterLogic";
		private const PARTITION_KEY_LOGIC_OPTION:String="Partition Key";
		private const BATCH_SPLITTER_LOGIC_OPTION:String="Batch Splitter";
		private var splitterLogicNames:Array=new Array(PARTITION_KEY_LOGIC_OPTION, BATCH_SPLITTER_LOGIC_OPTION);

		public static const CONFIG_KEY_SCHEMA_DESCR:String="objectSchemaDescriptor";
		public static const CONFIG_KEY_SPLITTER_LOGIC:String="splitterLogic";
		public static const CONFIG_KEY_CONFIGURATION:String="splitterLogicConfiguration";

		public function SplitterConfigUI()
		{
			super();
		}

		/**
		 * Called by the parent application after setting the required schema names and component details in the base class.
		 */
		override public function initUI():void
		{
			addComponentSpecificUI();
		
			if (processServiceConfig != null)
			{
				//loadDetails in process service configuration
				loadProcessServiceConfig();
			}
			 else 
			 {
			    loadStrategy();
			    this.addChild(splitterConfigurationContainer);	     
			   	this.height=300;
			 	this.verticalScrollPolicy="auto";	
			 }
		}

		/**
		 * Constructs the UI with the given list of component configurations
		 */
		override public function loadConfigurations(configurations:ArrayCollection):void
		{
		
			for each (var config:ProcessServiceConfigurationVO in configurations)
			{
				if (CONFIG_KEY_SCHEMA_DESCR == config.configKey)
				{
					schemaSelection.text=config.simpleValue;
				}
				else if (CONFIG_KEY_SPLITTER_LOGIC == config.configKey)
				{
					splitterLogicSelection.text=config.simpleValue;
					splitterLogicSelection.selectedIndex=getStrategyIndex(config.simpleValue);
				}
				 
				 //since configuraton is  dynamically loaded any previously saved configuration is first removed  
				 if (this.splitterConfigurationContainer!= null)
				 {
				    removeChild(splitterConfigurationContainer);
				 }		       
			       
			     loadStrategy();	
			     splitterStrategy.loadConfigurations(configurations);  // load configuration for particular selected strategy
			     this.addChild(splitterConfigurationContainer);	
			     this.height=300;
   			     this.verticalScrollPolicy="auto";	
	
			}
			
		
		}

		/**
		 * Constructs configuration from the values entered by the user in the UI.
		 */
		override public function getConfiguration():ProcessServiceVO
		{
			if (this.processServiceConfig == null)
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

			//Set Service Id of ProcessServiceVO
			processServiceConfig.serviceId=(serviceIdText.text).toString();

			//Set schema name & splitter logic 
			processServiceConfig.configurations.addItem(createConfiguration(serviceIdText.text, CONFIG_KEY_SCHEMA_DESCR, true, schemaSelection.text));
			processServiceConfig.configurations.addItem(createConfiguration(serviceIdText.text, CONFIG_KEY_SPLITTER_LOGIC, true, splitterLogicSelection.text));

			//set the values of config fields .. Schema Mapping
			processServiceConfig.configurations.addItem(splitterStrategy.getConfiguration());

			var mandatoryFlag:Boolean=validateFields(processServiceConfig);
			if (!mandatoryFlag)
			{
				Alert.show("Please fill in all the mandatory fields");

			}
			else
			{
				return processServiceConfig;
			}
			return null;
		}

		/**
		 * Returns the serviceId specified by the user in the text field
		 */
		public function getServiceId():String
		{
			return serviceIdText.text;
		}

		/**
		 * Gets the label from Resource
		 */
		public function getLabelFromResource(field:String):String
		{
			var fieldName:String=resourceManager.getString('TeevraUI', field + '.name');
			if (resourceManager.getString('TeevraUI', field + '.mandatory') == 'Y')
			{
				fieldName+="*";
			}
			return fieldName;
		}

		/**
		 * Constructs a configuration instance from the given params
		 */
		public function createConfiguration(sId:String, key:String, simple:Boolean, configVal:String):ProcessServiceConfigurationVO
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

		/**
		 * Populates the UI field with the values that were saved last time in the ProcessServiceConfigurationVO.
		 */
		private function loadProcessServiceConfig():void
		{
			//set label values
			serviceIdText.text=processServiceConfig.serviceId;
			loadConfigurations(processServiceConfig.configurations);
		}

		/**
		 * Creates the container with relevant components that form the top part of the config form.
		 * This shows the serviceId, schema selection combo and splitting logic.
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

			schemaSelection=new ComboBox();
			// (Redmine Feature # 589) ID of flex components is set so that it can be uniquely identified by Ranorex
			schemaSelection.id=TeevraUIComponentsID.SCHEMA_NAME_ID;
			
			addSchemaFields(compSpecificH2, SCHEMA_NAME_FIELD, schemaSelection);

			splitterLogicSelection=new ComboBox();
			// (Redmine Feature # 589) ID of flex components is set so that it can be uniquely identified by Ranorex
			splitterLogicSelection.id=TeevraUIComponentsID.SPLITTING_STRATEGY_ID;
			addSplitterLogicField(compSpecificH2, SPLITTER_LOGIC_FIELD, splitterLogicSelection);
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
			serviceId.text=getLabelFromResource(SERVICE_ID_FIELD);
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
		 * Adds schema field to the container.
		 */
		private function addSchemaFields(parent:Container, labelKey:String, dropDown:ComboBox):void
		{
			var schemaLabel:Label=new Label();
			schemaLabel.text=getLabelFromResource(labelKey);
			schemaLabel.setStyle("fontWeight", "bold");
			schemaLabel.percentWidth=20;

			dropDown.editable=true;
			dropDown.itemRenderer=new ClassFactory(Label);
			dropDown.dataProvider=schemas;
			dropDown.labelField="schemaName";
			dropDown.selectedIndex=-1;
			dropDown.percentWidth=20;

			parent.addChild(schemaLabel);
			parent.addChild(dropDown);
		}

		/**
		 * Adds splitter logic field to the container.
		 */
		private function addSplitterLogicField(parent:Container, labelKey:String, dropDown:ComboBox):void
		{
			var schemaLabel:Label=new Label();
			schemaLabel.text=getLabelFromResource(labelKey);
			schemaLabel.setStyle("fontWeight", "bold");
			schemaLabel.percentWidth=20;

			dropDown.editable=false;
			dropDown.itemRenderer=new ClassFactory(Label);
			dropDown.dataProvider=splitterLogicNames;
			dropDown.text=PARTITION_KEY_LOGIC_OPTION;
			dropDown.percentWidth=20;

			parent.addChild(schemaLabel);
			parent.addChild(dropDown);
		}

		/**
		 * Validates the user entries before saving the details
		 */
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
			if (resourceManager.getString('TeevraUI', SPLITTER_LOGIC_FIELD + '.mandatory') == 'Y')
			{
				for each (config in processServiceVO.configurations)
				{
					if (CONFIG_KEY_SPLITTER_LOGIC == config.configKey)
					{
						if (config.simpleValue == null || config.simpleValue == "")
							return false;
					}
				}

			}
			return true;
		}

		/**
		 * Handler for splitter strategy dropdown change event
		 */
		private function onStrategyChange(event:Event):void
		{
			this.removeChild(splitterConfigurationContainer);
			loadStrategy();
			if (splitterStrategy != null)
			{
				this.addChild(splitterConfigurationContainer);
			}
		}

		/**
		 * Gets the main configuration based on the splitter strategy chosen
		 */
		private function loadStrategy():void
		{
			var selectedStrategy:String=splitterLogicSelection.text;
			var strategy:ISplitterStrategy;
			if (splitterStrategyCache[selectedStrategy] != null)
			{
				strategy=ISplitterStrategy(splitterStrategyCache[selectedStrategy]);
			}
			else
			{
				if (PARTITION_KEY_LOGIC_OPTION == selectedStrategy)
				{
					strategy=new PartitionKeyStrategy(this);
				}
				else if (BATCH_SPLITTER_LOGIC_OPTION == selectedStrategy)
				{
					strategy=new BatchSplitterStrategy(this);
				}
			}
			splitterStrategyCache[selectedStrategy]=strategy;

			splitterStrategy=strategy;
			splitterConfigurationContainer=splitterStrategy.getConfigForm();
			schemaSelection.addEventListener(ListEvent.CHANGE, splitterStrategy.getSchemaChangeHandler());
			splitterLogicSelection.addEventListener(ListEvent.CHANGE, onStrategyChange);
			splitterStrategy.refresh();
		}

		/**
		 * Gets index of given strategy in the list of available strategies
		 */
		private function getStrategyIndex(strategyName:String):int
		{
			for (var i:int=0; i < splitterLogicNames.length; i++)
			{
				if (splitterLogicNames[i] == strategyName)
					return i;
			}
			return -1;
		}
	}
}
