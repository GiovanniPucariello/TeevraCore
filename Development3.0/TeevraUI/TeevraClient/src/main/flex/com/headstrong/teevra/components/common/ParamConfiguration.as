package com.headstrong.teevra.components.common
{
	import com.headstrong.teevra.client.graph.model.ComponentConfigurationVO;
	import com.headstrong.teevra.client.graph.model.ComponentVO;
	import com.headstrong.teevra.client.model.SchemaCache;
	import com.headstrong.teevra.client.view.entity.SchemaVO;
	
	import flash.display.DisplayObject;
	import flash.events.Event;
	import flash.events.MouseEvent;
	
	import mx.collections.ArrayCollection;
	import mx.containers.ControlBar;
	import mx.containers.Grid;
	import mx.containers.GridItem;
	import mx.containers.GridRow;
	import mx.containers.TitleWindow;
	import mx.controls.Alert;
	import mx.controls.Button;
	import mx.controls.ComboBox;
	import mx.controls.TextArea;
	import mx.events.CloseEvent;
	import mx.managers.PopUpManager;
	
	
	public class ParamConfiguration extends TitleWindow
	{
		private var closeEventHandler:Function;
		private var saveEventHandler:Function;
		private var configForm:GridConfigForm;
		
		private var lookupField:TextArea;
		private var component:ComponentVO;
		private var paramValues:String;
		private var rule:String;
		
		private var inputSchemaName:String;
		private var outputSchemaName:String;
	
		private const PARAM_NAME_INDEX:int = 0;
		private const VALUE_TYPE_INDEX:int = 1;
		private const VALUE_INDEX:int = 2;
		
		private const CONFIG_KEY_TRANSFORM_RULES:String = "transformationRuleTypes";
		private const CONFIG_KEY_VALIDATION_RULES:String = "validationRuleTypes";
		
		private const FLD_TYPE_LBL_KEY:String = "configField.ParamConfiguration.paramType";
		private const FLD_TYPE_NAME:String = "paramType";
		private const FLD_TYPE_TYPE:String = GridConfigField.LIST_FIELD;
		private const FLD_TYPE_WIDTH:int = 150;

		private const FLD_NAME_LBL_KEY:String = "configField.ParamConfiguration.paramName";
		private const FLD_NAME_NAME:String = "input";
		private const FLD_NAME_TYPE:String = GridConfigField.LIST_FIELD;
		private const FLD_NAME_WIDTH:int = 150;
		  
		private const FLD_VALUE_LBL_KEY:String = "configField.ParamConfiguration.value";
		private const FLD_VALUE_NAME:String = "value";
		private var FLD_VALUE_TYPE:String = GridConfigField.EDITABLE_LIST_FIELD;
		private const FLD_VALUE_WIDTH:int = 150;
		
		public function ParamConfiguration()
		{
			super();
			this.showCloseButton=true;
			this.title="Parameter Configuration";
			this.addEventListener(CloseEvent.CLOSE,popupClose);
		}
		
		private function popupClose(event:Event):void{
	    	PopUpManager.removePopUp(this);
	    }
		
		public function create(field:TextArea,comp:ComponentVO, selectedRule:String,inputSchema:String,outputSchema:String):void
		{
			this.inputSchemaName = inputSchema;
			this.outputSchemaName = outputSchema;
			this.lookupField = field;
			this.component = comp;
			this.rule = selectedRule;
			paramValues = field.text;
			initUI();
		}
		
		public function initUI():void
		{
			addConfigFields();
			
		}
		
		/**
		 * Creates the container that has fields for each of the parameter required for the component.
		 */
		private function addConfigFields():void {
			configForm = new GridConfigForm(getConfigFields());
			configForm.percentWidth = 90;
			if(!(paramValues==null|| paramValues==""))
			{
				configForm.setTabularData(parseFormattedParam(paramValues));
				//if the tabular data set for value type is input/output then add dataprovide 
				// for corresponding value field
				setDataProviderOnSave();
			}
			this.addChild(configForm);
			createControlBar();
			
		}
		private function createControlBar():void
		{
			var controlBar:ControlBar = new ControlBar();
			controlBar.percentHeight = 10;
			controlBar.percentWidth = 90;
			
			var saveBtn:Button = new Button();
			saveBtn.label = resourceManager.getString('TeevraUI', 'button.ParamConfiguration.save');
			saveBtn.addEventListener(MouseEvent.CLICK,saveConfiguration);
			controlBar.addChild(saveBtn);
			
			var closeBtn:Button = new Button();
			closeBtn.label = resourceManager.getString('TeevraUI', 'button.ParamConfiguration.cancel');
			closeBtn.addEventListener(MouseEvent.CLICK, closeConfiguration);
			controlBar.addChild(closeBtn);
			
			this.addChild(controlBar);
		}
		private function saveConfiguration(event:MouseEvent):void
		{
			//get formatted string
			lookupField.text = getParameter();
			PopUpManager.removePopUp(this);
			
		}
		private function closeConfiguration(event:MouseEvent):void
		{
			PopUpManager.removePopUp(this);
		}
		
		
		/**
		 * Constructs the field models that need to be used to build the GridConfigForm containing fields for component configurations.
		 */
		private function getConfigFields():ArrayCollection
		{
			var coll:ArrayCollection = new ArrayCollection();
						
			coll.addItem(getField(FLD_NAME_LBL_KEY, FLD_NAME_NAME, FLD_NAME_TYPE, 
				FLD_NAME_WIDTH, getParameterNames(),null));		

			coll.addItem(getField(FLD_TYPE_LBL_KEY, FLD_TYPE_NAME, FLD_TYPE_TYPE,
				FLD_TYPE_WIDTH, getValueTypes(),onFieldSelection));
				
			coll.addItem(getField(FLD_VALUE_LBL_KEY, FLD_VALUE_NAME, FLD_VALUE_TYPE, 
				FLD_VALUE_WIDTH, new ArrayCollection(),null, true));
			
			return coll;
		}
		
		 /**
		 * Returns an array collection of value types of the parameters
		 */	
		private function getValueTypes():ArrayCollection
		{
			var valueTypes:ArrayCollection = new ArrayCollection();
			valueTypes.addItem("temp");
			valueTypes.addItem("constant");
			valueTypes.addItem("input");
			if(outputSchemaName!="")
			{
				valueTypes.addItem("output");
			}
			return valueTypes;
			
		}
		/**
		 * Gets the list of parameters for the transformation rule selected
		 */
		private function getParameterNames():ArrayCollection
		{
			var configList:ArrayCollection =ArrayCollection(component.compConfigList);	
			var paramsList:ArrayCollection = new ArrayCollection();
			for(var i:int=0;i<configList.length;i++)
			{
				var configVO:ComponentConfigurationVO = ComponentConfigurationVO(configList.getItemAt(i));
			
				if (CONFIG_KEY_TRANSFORM_RULES == configVO.configKey || CONFIG_KEY_VALIDATION_RULES == configVO.configKey)
				{
					var rulesXML:XML =XML(configVO.configReferences);
						var root:XML;
						var child:XML;

					for each(root in rulesXML.rule)
					{
						if(root.attribute("name").toString()==rule)
						{
							for each(child in root.param)
							{
								paramsList.addItem(child.attribute("name").toString());
							}
						}		
					}
				} 
			}
			return paramsList;
		}
		/**
		 * Creates a GridConfigField with the supplied params.
		 */		
		private function getField(labelKey:String, fieldName:String, fieldType:String, 
			fieldWidth:int, dataprovider:ArrayCollection,handlerFunction:Function,
			independent:Boolean = false):GridConfigField {
			var field:GridConfigField = new GridConfigField();
			field.label = resourceManager.getString('TeevraUI', labelKey);
			field.name = fieldName;
			field.type = fieldType;
			field.fieldWidth = fieldWidth;
			field.lookups = dataprovider;
			field.observer = handlerFunction;
			field.independent = independent;
			return field;
		}
		private function onFieldSelection(fldParamName:DisplayObject, fldValueType:DisplayObject, 
			fldValue:DisplayObject):void
		{ 
			if(ComboBox(fldValueType).text == "input")
			{
				setSchemaAttributes(inputSchemaName, ArrayCollection(ComboBox(fldValue).dataProvider));
				ComboBox(fldValue).selectedIndex = -1;
			}
			else if(ComboBox(fldValueType).text == "output")
			{
				setSchemaAttributes(outputSchemaName, ArrayCollection(ComboBox(fldValue).dataProvider));
				ComboBox(fldValue).selectedIndex = -1;
			}
			else 
			{
				ArrayCollection(ComboBox(fldValue).dataProvider).removeAll();
			}
		}
		/**
		 * Gets the Parameter from the user entered values
		 */		
		private function getParameter():String
		{
			var userData:ArrayCollection = configForm.getUserSpecifiedValues();
			return createParamFormat(userData);		
		}
		/**
		 * returns the required parameter format
		 */	
		private function createParamFormat(userData:ArrayCollection):String
		{
			var paramString:String ="";
			
			for(var i:int=0; i<userData.length;i++)
			{
				var rowVector:ArrayCollection =ArrayCollection(userData.getItemAt(i));
				if(rowVector.getItemAt(0)!=null && rowVector.getItemAt(1)!=null && rowVector.getItemAt(2)!=null )
				{
						var paramName:String = rowVector.getItemAt(PARAM_NAME_INDEX).toString();
						var valueType:String = rowVector.getItemAt(VALUE_TYPE_INDEX).toString();
						var value:String = rowVector.getItemAt(VALUE_INDEX).toString();
						paramString = paramString+paramName+"=["+valueType+"].["+value+"];";
				}
			}
			
			return paramString.slice(0,paramString.length-1);
		}
		
		/**
		 * Creates arraycollection of user specified data 
		 * @param paramString
		 * @return ArrayCollection
		 * 
		 */
		private function parseFormattedParam(paramString:String):ArrayCollection
		{
			var paramColl:ArrayCollection = new ArrayCollection();
			if(paramString!="")
			{
				var inputParameterArray:Array =  paramString.split(";");
				for(var i:int=0; i<inputParameterArray.length;i++)
				{
					var paramArray:ArrayCollection = new ArrayCollection();
					var inputArray:Array = inputParameterArray[i].toString().split("=");
					var paramName:String = inputArray[0].toString();
					paramArray.addItem(paramName);
					
					var parameter:String = inputArray[1];
					var parameterArray:Array = parameter.split("].[");
					var value:String = parameterArray[1].toString().substring(0,parameterArray[1].toString().length-1);
					var valueType :String = parameterArray[0].toString().substring(1);
					paramArray.addItem(valueType);
					paramArray.addItem(value);
					paramColl.addItem(paramArray);					
				}
			}
			return paramColl;
		}
		private function setSchemaAttributes(selectedSchemaName:String, attributes:ArrayCollection):void
		{
			attributes.removeAll();
			var schemas:ArrayCollection = SchemaCache.getInstance().getNonPrimitiveSchema();
			for(var i:int=0; i<schemas.length; i++)
			{
				var schema:SchemaVO = SchemaVO(schemas[i]);
				if(schema.schemaName == selectedSchemaName)
				{
				 	SchemaCache.getInstance().populateAllLeafAttributesNames(schema.schemaId, 
				 		attributes, "");
				 	break;
				 	
				}
			}

		}
		
		/**
		 * if the tabular data set for value type is input/output then add dataprovide 
		 *  for corresponding value field
		 * 
		 */
		private function setDataProviderOnSave():void{
			var grid:Grid = configForm.getGrid();
				for(var i:int= 1; i<grid.getChildren().length; i++)
				{
					var row:GridRow = GridRow(grid.getChildAt(i));
					//+! because of 'X' button
					var fldParamValueType:ComboBox = ComboBox(GridItem(row.getChildAt(VALUE_TYPE_INDEX+1)).getChildAt(0));
					var fldParamValue:ComboBox = ComboBox(GridItem(row.getChildAt(VALUE_INDEX+1)).getChildAt(0));
					
					if(fldParamValueType.selectedItem ==  "input" ){
						setSchemaAttributes(inputSchemaName, ArrayCollection(fldParamValue.dataProvider));
					}
					else if(fldParamValueType.selectedItem ==  "output"){
						setSchemaAttributes(outputSchemaName, ArrayCollection(fldParamValue.dataProvider));
					}
					fldParamValue.selectedIndex = -1;
					
				}
		}
	}
}