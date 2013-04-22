package com.headstrong.teevra.components.transformer
{
	import com.headstrong.teevra.client.graph.model.ComponentConfigurationVO;
	import com.headstrong.teevra.client.graph.model.ProcessServiceConfigurationVO;
	import com.headstrong.teevra.client.graph.model.ProcessServiceVO;
	import com.headstrong.teevra.client.util.RestrictedTextInput;
	import com.headstrong.teevra.components.common.BaseComponentConfigurationUI;
	import com.headstrong.teevra.components.common.ComplexField;
	import com.headstrong.teevra.components.common.GridConfigField;
	import com.headstrong.teevra.components.common.GridConfigForm;
	import com.headstrong.teevra.components.common.ParamConfiguration;
	import com.headstrong.teevra.components.common.TeevraUIComponentsID;
	
	import flash.display.DisplayObject;
	import flash.events.Event;
	
	import mx.collections.ArrayCollection;
	import mx.containers.HBox;
	import mx.containers.VBox;
	import mx.controls.Alert;
	import mx.controls.ComboBox;
	import mx.controls.Label;
	import mx.core.ClassFactory;
	import mx.core.Container;
	import mx.core.IFlexDisplayObject;
	import mx.events.ListEvent;
	import mx.managers.PopUpManager;
	
	/**
	 * Configuration screen for transformation and enrichment component. Transformation component is 
	 * used to transform business object belonging to one schema (input schema) to another business object belonging to 
	 * another schema (output schema). Enrichment component modifies / enhances the same business object.
	 * Transformations / enrichment apply various transformation rules available in the system. Parameters to 
	 * each rule should conform to the format specified by the transformation / enrichment component.
	 */
	public class TransformerConfigUI extends BaseComponentConfigurationUI
	{
		private var popup:IFlexDisplayObject;
		private var inputSchemaNameSelection:ComboBox;
		private var outputSchemaNameSelection:ComboBox;
		private var configForm:GridConfigForm;
		private var serviceIdText:RestrictedTextInput;
		
		private var outputAttributes:ArrayCollection;
		private var transformationRules:ArrayCollection;
		
		private var selectedSchemaName:String;
		private var schemaIsChanged:Boolean;
		private var enrich:Boolean;
		
		/**
		 * Name of the enrichment service component. This name is used to change the state
		 * of the UI between Enrichment and Transformation services.
		 */
		private const ENRICHMENT_SERVICE_NAME:String = "Enrichment Service";

		//indexes of columns in the UI		
		private const SEQ_NO_INDEX:int = 0;
		private const OUTPUT_ATTR_INDEX:int = 1;
		private const RULE_NAME_INDEX:int = 2;
		private const PARAMS_INDEX:int = 3;
		private const CONDITIONAL_MSG_INDEX:int = 4;

		//Keys / config id that identifies the component configuration 
		private const CONFIG_KEY_SCHEMA_DESCR:String = "objectSchemaDescriptor";
		private const CONFIG_KEY_SCHEMA_DESCR_INPUT:String = "inputObjectSchemaDescriptor";
		private const CONFIG_KEY_SCHEMA_MAPPING:String = "schemaMapping";
		private const CONFIG_KEY_TRANSFORM_RULES:String = "transformationRuleTypes";
		private const CONFIG_KEY_ENRICH:String="enrich";
		
		//Specifications for individual fields / columns shown in the UI
		private const FLD_SEQ_LBL_KEY:String = "configField.TransformerConfigUI.sequenceNumber";
		private const FLD_SEQ_NAME:String = "sequenceNumber";
		private const FLD_SEQ_TYPE:String = GridConfigField.SEQUENCE_NUMBER_FIELD;
		private const FLD_SEQ_WIDTH:int = 50;

		private const FLD_ATTR_LBL_KEY:String = "configField.TransformerConfigUI.attribute";
		private const FLD_ATTR_NAME:String = "attribute";
		private const FLD_ATTR_TYPE:String = GridConfigField.EDITABLE_LIST_FIELD;
		private const FLD_ATTR_WIDTH:int = 150;

		private const FLD_RULE_LBL_KEY:String = "configField.TransformerConfigUI.transformationRule";
		private const FLD_RULE_NAME:String = "transformationRule";
		private const FLD_RULE_TYPE:String = GridConfigField.LIST_FIELD;
		private const FLD_RULE_WIDTH:int = 200;
		  
		private const FLD_PARAM_LBL_KEY:String = "configField.TransformerConfigUI.parameters";
		private const FLD_PARAM_NAME:String = "parameters";
		private const FLD_PARAM_TYPE:String = GridConfigField.COMPLEX_FIELD;
		private const FLD_PARAM_WIDTH:int = 250;

		private const FLD_CONDT_LBL_KEY:String = "configField.TransformerConfigUI.conditionExpr";
		private const FLD_CONDT_NAME:String = "conditionExpr";
		private const FLD_CONDT_TYPE:String = GridConfigField.TEXT_AREA;
		private const FLD_CONDT_WIDTH:int = 250;
				
		
		
		private const SERVICE_ID_FIELD:String="label.TransformerConfigUI.serviceID";
		private const INPUT_SCHEMA_NAME_FIELD:String="label.TransformerConfigUI.inputSchemaLabelName";
		private const OUTPUT_SCHEMA_NAME_FIELD:String="label.TransformerConfigUI.outputSchemaLabelName";
		
		public function TransformerConfigUI()
		{
			super();
		}

		/**
		 * Called by the parent application after setting the required schema names and component details in the base class.
		 */
		override public function initUI():void
		{
			enrich = (component.compName == ENRICHMENT_SERVICE_NAME);
			
			addComponentSpecificUI();
			
			addConfigFields();

			if(processServiceConfig != null)
			{
				//loadDetails in process service configuration
				loadProcessServiceConfig();
			}
			configForm.percentWidth = 90;
			this.addChild(configForm);	
	
			this.height = 300;
			this.verticalScrollPolicy = "auto";

			//if enrich is true, then schema is based on input itself		
			if (enrich==false)
				outputSchemaNameSelection.addEventListener(ListEvent.CHANGE, setSchemaAttributesOnChange);	
			else 
				inputSchemaNameSelection.addEventListener(ListEvent.CHANGE, setSchemaAttributesOnChange);	
		}
		
		/**
		 * Creates the container with relevant components that form the top part of the config form.
		 * This shows the serviceId, input and output schema names. When this UI is used for an enricher,
		 *  there are no two schemas. Only input schemas need to be shown if the component is an enricher. 
		 */
 		private function addComponentSpecificUI() : void {
			var compSpecificDisplay:VBox = new VBox();
			compSpecificDisplay.percentWidth = 100;
			compSpecificDisplay.percentHeight = 10;
			
			addServiceIdFields(compSpecificDisplay);
			
			var compSpecificH2:HBox = new HBox();
			compSpecificH2.percentWidth = 100;
			compSpecificH2.percentHeight = 5;
			
			inputSchemaNameSelection = new ComboBox();
			// (Redmine Feature # 589) ID of flex components is set so that it can be uniquely identified by Ranorex
			inputSchemaNameSelection.id=TeevraUIComponentsID.INPUT_SCHEMA_NAME_ID;
			addSchemaFields(compSpecificH2, INPUT_SCHEMA_NAME_FIELD, 
				inputSchemaNameSelection);
									
			//add output schema only if enrichment is false
			if (enrich==false) {
				outputSchemaNameSelection = new ComboBox();
				//(Redmine Feature # 589) ID of flex components is set so that it can be uniquely identified by Ranorex
				outputSchemaNameSelection.id=TeevraUIComponentsID.OUTPUT_SCHEMA_NAME_ID;
				addSchemaFields(compSpecificH2, OUTPUT_SCHEMA_NAME_FIELD, 
					outputSchemaNameSelection);
			}
			compSpecificDisplay.addChild(compSpecificH2);
			
			this.addChild(compSpecificDisplay);
		}
		
		/**
		 * Creates the container that has fields for each of the configuration required for the component.
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
			coll.addItem(getField(FLD_SEQ_LBL_KEY, FLD_SEQ_NAME, FLD_SEQ_TYPE, 
				FLD_SEQ_WIDTH, null, null));
			
			outputAttributes = new ArrayCollection();
			coll.addItem(getField(FLD_ATTR_LBL_KEY, FLD_ATTR_NAME, FLD_ATTR_TYPE,
				FLD_ATTR_WIDTH, outputAttributes, null));
			
			transformationRules = getTransformationRules();
			coll.addItem(getField(FLD_RULE_LBL_KEY, FLD_RULE_NAME, FLD_RULE_TYPE, 
				FLD_RULE_WIDTH, transformationRules, null));
				
			coll.addItem(getField(FLD_PARAM_LBL_KEY,FLD_PARAM_NAME,FLD_PARAM_TYPE,
				FLD_PARAM_WIDTH, null,handleParamLookup));
				
			coll.addItem(getField(FLD_CONDT_LBL_KEY,FLD_CONDT_NAME,FLD_CONDT_TYPE,
				FLD_CONDT_WIDTH, null,null));
				
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
		 * Opens Param configuration as popup for user to enter values on click of lookup image
		 */	
		private function handleParamLookup(fldSeq:DisplayObject, fldAttrName:DisplayObject, 
			fldRuleName:DisplayObject, fldParamLookup:DisplayObject,condExpression:DisplayObject):void
		{ 
			var rule:String = ComboBox(fldRuleName).text;
			if(rule=="")
			{
			    Alert.show("Please select a rule to proceed!", "Select Rule", 
	   				Alert.OK, null, 
	   				null, null, Alert.OK);
	   			return;
			}

			var paramConfig:ParamConfiguration;
			popup = PopUpManager.createPopUp(this, ParamConfiguration, true);
			paramConfig = ParamConfiguration(popup);
			if(enrich == true)
			{
				paramConfig.create(ComplexField(fldParamLookup).getTextArea(),
					component,rule,inputSchemaNameSelection.text,"");
			}
			else
			{
				paramConfig.create(ComplexField(fldParamLookup).getTextArea(),
					component,rule,inputSchemaNameSelection.text,outputSchemaNameSelection.text);
			}
			PopUpManager.centerPopUp(popup);
		}

		/**
		 * Adds a label and input field for serviceId to the given container.
		 */
		private function addServiceIdFields(parent:Container):void {
			var compSpecificH1:HBox = new HBox();
			compSpecificH1.percentWidth = 100;
			compSpecificH1.percentHeight = 5;
			
			var serviceId:Label = new Label();
			serviceId.text=setFieldName(SERVICE_ID_FIELD);
			serviceId.setStyle("fontWeight","bold");
			serviceId.percentWidth=20;

			serviceIdText = new RestrictedTextInput();
			// (Redmine Feature # 589) ID of flex components is set so that it can be uniquely identified by Ranorex
			serviceIdText.id=TeevraUIComponentsID.SERVICE_ID_ID;
			serviceIdText.percentWidth=20;

			compSpecificH1.addChild(serviceId);
			compSpecificH1.addChild(serviceIdText);
			parent.addChild(compSpecificH1);
		}
		
		/**
		 * Adds schema field to the container. Used to add both input and output schemas.
		 */
		private function addSchemaFields(parent:Container, labelKey:String, dropDown:ComboBox):void {
			var schemaLabel:Label = new Label();
			schemaLabel.text = setFieldName(labelKey);
			schemaLabel.setStyle("fontWeight", "bold");
			schemaLabel.percentWidth=20;
			
			dropDown.editable = true;
			dropDown.itemRenderer = new ClassFactory(Label);
			dropDown.dataProvider = schemas;
			dropDown.labelField = "schemaName";
			dropDown.selectedIndex = -1;
			dropDown.percentWidth = 20;

			parent.addChild(schemaLabel);
			parent.addChild(dropDown);
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
				if (CONFIG_KEY_SCHEMA_DESCR_INPUT == config.configKey) {
					inputSchemaNameSelection.text = config.simpleValue;
				} else if ((CONFIG_KEY_SCHEMA_DESCR == config.configKey) && (outputSchemaNameSelection != null)) {
					outputSchemaNameSelection.text = config.simpleValue;
				} 
			}
			
			// set attributes for earlier selected Schema on save
			if (enrich) {
				configForm.setSchemaAttributes(inputSchemaNameSelection.text,outputAttributes,true,OUTPUT_ATTR_INDEX);
			} else {
				configForm.setSchemaAttributes(outputSchemaNameSelection.text,outputAttributes,true,OUTPUT_ATTR_INDEX);				
			}
			//get the user specified fields' data as array collection 		
			var tabularData:ArrayCollection = getTabularData(configurations);
			
			//set grid fields' data
			configForm.setTabularData(tabularData);

		}
		
		/**
		 * When the UI needs to be loaded with ProcessServiceVO, the configurations in the VO are obtained as a list of rowvectors 
		 * so that GridConfigForm can use that to populate the values in its field.
		 */
		private function getTabularData(configurations:ArrayCollection):ArrayCollection
		{
			for(var i:int=0;i<configurations.length;i++)
			{
				var processServiceConfiguration:ProcessServiceConfigurationVO=ProcessServiceConfigurationVO(configurations.getItemAt(i));
				if(processServiceConfiguration.complexValue!=null)
				{
					var configXML:XML=XML(processServiceConfiguration.complexValue);
					var tabularData:ArrayCollection = new ArrayCollection();
					var root:XML;
					var child:XML;
					
					for each(root in configXML.rule)
					{
						var rowVector:ArrayCollection=new ArrayCollection();
						var inputParameter:String ="";
						//add seq # in the first field
						rowVector.addItem(root.attribute("sequence").toString());		
						// add output attr in second field
						for each(child in root.output)
						{
							rowVector.addItem(child.attribute("value").toString());
						}
						//add transformation rule as third field
						rowVector.addItem(root.attribute("name").toString());	
						//add input parameter as fourth field
						for each(child in root.input)
						{
							var inputName:String = child.attribute("name").toString();
							var inputValue:String = child.attribute("value").toString();
							var inputType:String = child.attribute("type").toString();
							inputParameter = inputParameter+inputName+"=["+inputType+"].["+inputValue+"];";							
						}
						rowVector.addItem(inputParameter.slice(0,inputParameter.length-1));
						/*if(child in root.conditionExpr == false)
						{
							Alert.show("false");
							rowVector.addItem("");
						}*/
						for each(child in root.conditionExpr)
						{							
							rowVector.addItem(child.text());	
						}
						tabularData.addItem(rowVector);
					}
				}
			}
			return tabularData;
		}
		
		/**
		 * Gets the list of transformation rules from the transformation / enricher component's configurations.
		 * Assumes that the rules are stored in xml format alnog with its parameters. 
		 */
		private function getTransformationRules():ArrayCollection
		{
			var configList:ArrayCollection =ArrayCollection(component.compConfigList);	
			var rulesList:ArrayCollection = new ArrayCollection();
			for(var i:int=0;i<configList.length;i++)
			{
				var configVO:ComponentConfigurationVO = ComponentConfigurationVO(configList.getItemAt(i));
			
				if (CONFIG_KEY_TRANSFORM_RULES == configVO.configKey)
				{
					var rulesXML:XML =XML(configVO.configReferences);
					var root:XML;

					for each(root in rulesXML.rule)
					{
						rulesList.addItem(root.attribute("name").toString());		
					}
				} 
			}
			return rulesList;
		}
		
		/**
		 * Constructs configuration from the values entered by the user in the UI.
		 */
		override public function getConfiguration():ProcessServiceVO
		{
			if (processServiceConfig == null) {
				processServiceConfig = new ProcessServiceVO();
			}
			if (processServiceConfig.configurations != null) {
				processServiceConfig.configurations.removeAll();
			} else {
				processServiceConfig.configurations = new ArrayCollection();
			}
			
			var processServiceConfigVO:ProcessServiceConfigurationVO = new ProcessServiceConfigurationVO();

			//Set Service Id of ProcessServiceVO
			processServiceConfig.serviceId=(serviceIdText.text).toString();;
			
			//Set input schema name
			processServiceConfig.configurations.addItem(createConfiguration(serviceIdText.text, CONFIG_KEY_SCHEMA_DESCR_INPUT, 
															true, inputSchemaNameSelection.text));
			if (enrich==false) {
				//Set output schema name
				processServiceConfig.configurations.addItem(createConfiguration(serviceIdText.text, 
					CONFIG_KEY_SCHEMA_DESCR, true, outputSchemaNameSelection.text));
			}
			else {
				//Set enrich equal to true
				processServiceConfig.configurations.addItem(createConfiguration(serviceIdText.text, 
					CONFIG_KEY_ENRICH, true, "TRUE"));
			}
			
			//set the values of config fields .. Schema Mapping
			processServiceConfig.configurations.addItem(createConfiguration(serviceIdText.text, 
				CONFIG_KEY_SCHEMA_MAPPING, false, createConfigXML(configForm.getUserSpecifiedValues())));
				
			var mandatoryFlag:Boolean=validateFields(processServiceConfig);
			if(!mandatoryFlag)
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
		 * Constructs a configuration instance from the given params
		 */
		private function createConfiguration(sId:String, key:String, 
			simple:Boolean, configVal:String):ProcessServiceConfigurationVO {
			
			var processServiceConfigVO:ProcessServiceConfigurationVO = new ProcessServiceConfigurationVO();
			processServiceConfigVO.serviceId=sId;
			processServiceConfigVO.configKey = key;
			if (simple) {
				processServiceConfigVO.simpleValue = configVal;
			} else {
				processServiceConfigVO.complexValue = configVal;
			}
			return processServiceConfigVO;
			
		}
		
		/**
		 * Sets attribute list for the selected Schema when the user changes selection from the drop down
		 */
		private function setSchemaAttributesOnChange(event:Event):void
		{	
			configForm.setSchemaAttributes(ComboBox(event.currentTarget).text,outputAttributes,false,OUTPUT_ATTR_INDEX);
		}
		
		/**
		 * Creates the transformation mapping XML from the given tabularData. The tabularData contains
		 * the values specified by the user in the fields of GridConfigForm. 
		 */
		private function createConfigXML(tabularData:ArrayCollection):String
		{
			var configXML:XML = new XML("<ruleset></ruleset>");		
			for(var i:int=0;i<tabularData.length;i++)
			{	
				var rowVector:ArrayCollection=ArrayCollection(tabularData.getItemAt(i));
				if(rowVector.getItemAt(RULE_NAME_INDEX) != null)
				{
	                var ruleElement:XML = new XML();
	                var inputfieldSetElement:String =null;
	                var outputfieldSetElement:String = null;
	                var conditionalExpr:String = null;
	              
	                var inputParameter:String = rowVector.getItemAt(PARAMS_INDEX).toString();
	                var outputParameter:String = rowVector.getItemAt(OUTPUT_ATTR_INDEX).toString();
	                var conditionalExprParameter:String = rowVector.getItemAt(CONDITIONAL_MSG_INDEX).toString();
					
	                //Tokenize the parameters specified by user
	                inputfieldSetElement = createInputParameters(inputParameter);
	                outputfieldSetElement = createOutputParameters(outputParameter);
					conditionalExpr = createConditionalExpr(conditionalExprParameter);
					
	                ruleElement = <rule name={rowVector.getItemAt(RULE_NAME_INDEX).toString()} sequence ={rowVector.getItemAt(SEQ_NO_INDEX).toString()} />
	             
	                ruleElement.appendChild(new XMLList(inputfieldSetElement));
	                ruleElement.appendChild(new XML(outputfieldSetElement));
	                ruleElement.appendChild(new XMLList(conditionalExpr));
	   				
	                configXML.appendChild(ruleElement);
				 }
             }
             return configXML.toXMLString();
		}
		
		/**
		 * As part of the creation of mapping XML, parses the given inputParameter string to create
		 * necessary inputParameter elements.
		 */
		private function createInputParameters(inputParameter:String):String
		{
			var inputParamString:String = "";
			if(inputParameter!="")
			{
				var inputParameterArray:Array =  inputParameter.split(";");
				for(var i:int=0; i<inputParameterArray.length;i++)
				{
					var inputArray:Array = inputParameterArray[i].toString().split("=");
					inputParamString = inputParamString + "<input name =\""+inputArray[0].toString()+"\" ";
					var parameter:String = inputArray[1];
					var parameterArray:Array = parameter.split("].[");
					var value:String = parameterArray[1].toString().substring(0,parameterArray[1].toString().length-1);
					var type :String = parameterArray[0].toString().substring(1);
					inputParamString = inputParamString+ " value=\""+ value+"\"";
					inputParamString = inputParamString+ " type =\""+ type+ "\"/>";
				
				}
			}
			return inputParamString;
		}
		/**
		 * Create the conditional Expression string 
		 * @param conditionalExprParameter
		 * @return 
		 * 
		 */
		private function createConditionalExpr(conditionalExprParameter:String):String
		{
			var conditionalParamater:String = "";
			conditionalParamater = conditionalParamater + "<conditionExpr>"+conditionalExprParameter+"</conditionExpr>";
			return conditionalParamater;
			
		}
		
		/**
		 * As part of the creation of mapping XML, parses the given outputParameter string to create
		 * necessary outputParameter elements.
		 */
		private function createOutputParameters(outputParameter:String):String
		{
			var outputAttrString:String = "<output name=\"result\" value=\"" + outputParameter;
//			if((outputAttributes.length > 0) && (!outputAttributes.contains(outputParameter)))
//			{
//				if(outputParameter!="")			
//				{
//					outputAttrString = outputAttrString + "\" type=\"temp\"/>";
//				}
//			}
			if (outputParameter.charAt(0) == "#")
			{
				outputAttrString = outputAttrString+ "\" type=\"temp\"/>";
			} else 
			{
				outputAttrString = outputAttrString+ "\" type=\"output\"/>";
			}
			return outputAttrString;
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
			if(resourceManager.getString('TeevraUI', INPUT_SCHEMA_NAME_FIELD+'.mandatory')=='Y')
			{
				for each (config in processServiceVO.configurations)
				{
					if (CONFIG_KEY_SCHEMA_DESCR_INPUT == config.configKey) 
					{
						if(config.simpleValue==null || config.simpleValue=="")
							return false;
					}
				}
				
			}
			if(resourceManager.getString('TeevraUI', OUTPUT_SCHEMA_NAME_FIELD+'.mandatory')=='Y')
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
			return true;
		}
		
	}
}
