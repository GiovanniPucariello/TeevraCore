package com.headstrong.teevra.client.graph
{
	import com.headstrong.teevra.client.graph.model.ComponentConfigurationVO;
	import com.headstrong.teevra.client.graph.model.ComponentVO;
	import com.headstrong.teevra.client.graph.model.ProcessServiceConfigurationVO;
	import com.headstrong.teevra.client.graph.model.ProcessServiceVO;
	import com.headstrong.teevra.client.graph.model.StateMachineActionVO;
	import com.headstrong.teevra.client.model.ViewModelLocator;
	import com.headstrong.teevra.client.util.RestrictedTextInput;
	import com.headstrong.teevra.client.view.entity.ProcessVO;
	import mx.collections.ArrayCollection;
	import mx.containers.Form;
	import mx.containers.FormItem;
	import mx.controls.ComboBox;
	import mx.controls.TextArea;
	import mx.controls.TextInput;

	public class ComponentConfigurationForm extends Form
	{
		private var _componentVO:ComponentVO;
		private var serviceDetails:ProcessServiceVO;
		private var stateMachineActionVO:StateMachineActionVO;
		private var isComponentConfiguration:Boolean;
		private var compConfigurations:ArrayCollection;
		private var serviceIdInput:RestrictedTextInput;
		
		//Component configuration types
		private const TYPE_LIST:String="LIST";
		private const TYPE_TEXT_AREA:String="TEXTAREA";
		private const TYPE_DYNAMIC_LIST:String="DYNAMIC_LIST";
		private const TYPE_BOOLEAN:String="BOOLEAN";
		private const TYPE_PASSWORD:String="PASSWORD";
		private const TYPE_NUMBER:String="NUMBER";
			

		public function ComponentConfigurationForm(componentVO:ComponentVO,actionConfiguration:StateMachineActionVO, 
			svcDetails:ProcessServiceVO, isComponentConfiguration:Boolean)
		{
			super();
			this.componentVO=componentVO;
			this.serviceDetails=svcDetails;
			this.stateMachineActionVO=actionConfiguration;
			this.isComponentConfiguration=isComponentConfiguration
			this.percentWidth=100;
			this.percentHeight=100;
			
			var viewModel : ViewModelLocator = ViewModelLocator.getInstance();
			
			
			if (isComponentConfiguration) {
				//add the first item that is used for serviceId
				var serviceIdItem:FormItem=new FormItem();
				serviceIdItem.label="Service Id";
				serviceIdInput=new RestrictedTextInput();
				if (serviceDetails != null)
				{
					serviceIdInput.text=serviceDetails.serviceId;
				}
				// (Redmine Feature # 589) ID of flex components is set so that it can be uniquely identified by Ranorex
				serviceIdInput.id = trim(serviceIdItem.label);
				serviceIdItem.addChild(serviceIdInput);
				this.addChild(serviceIdItem);
			}
			
			//add form items for each of the config field			
			compConfigurations=ArrayCollection(componentVO.compConfigList);
	
			for (var i:int=0; i < compConfigurations.length; i++)
			{
				var configVO:ComponentConfigurationVO=ComponentConfigurationVO(compConfigurations.getItemAt(i));
				var configValue:String=null;
				if (serviceDetails != null || (actionConfiguration != null && componentVO.compId == stateMachineActionVO.compId))
				{
					configValue=loadConfigValue(configVO.configKey);
				}
				var formItem:FormItem=new FormItem();
				formItem.label=configVO.cofigLabel;
				var configCombo:ComboBox=null;
			
				switch (configVO.configType)
				{
					
					case(TYPE_LIST):
					{
					    configCombo=new ComboBox();
						configCombo.dataProvider=configVO.configReferences.split(",");
						configCombo.percentWidth=100;
						if (configValue != null)
						{
							configCombo.selectedItem=configValue;
						}
						// (Redmine Feature # 589) ID of flex components is set so that it can be uniquely identified by Ranorex
						configCombo.id = trim(configVO.cofigLabel);
						formItem.addChild(configCombo);
				
						break;
					}
					case(TYPE_PASSWORD):
					{
						//by default it is a text input
						var configInput:TextInput=new TextInput();
						configInput.percentWidth=100;
						configInput.displayAsPassword = true;
						if (configValue != null)
						{
							configInput.text=configValue;
						}
						// (Redmine Feature # 589) ID of flex components is set so that it can be uniquely identified by Ranorex
						configInput.id = trim(configVO.cofigLabel);					
						formItem.addChild(configInput);
					
						break;
					}
					case(TYPE_TEXT_AREA):
					{
						var configArea:TextArea = new TextArea();
						configArea.width = 250;
						configArea.showScrollTips = true;
						configArea.horizontalScrollPosition = 1;
						// configArea.percentWidth = 100;
						if (configValue != null)
						{
							configArea.text = configValue;
						}
						// (Redmine Feature # 589) ID of flex components is set so that it can be uniquely identified by Ranorex
				        configArea.id = trim(configVO.cofigLabel);
						formItem.addChild(configArea);
					
						break;
					}
					case(TYPE_BOOLEAN):
					{
					    configCombo=new ComboBox();
						configCombo.dataProvider=new Array("FALSE", "TRUE");
						configCombo.percentWidth=100;
						if (configValue != null)
						{
							configCombo.selectedItem=configValue;
						}
						else
						{
							configCombo.selectedIndex=0;
						}
						// (Redmine Feature # 589) ID of flex components is set so that it can be uniquely identified by Ranorex
					    configCombo.id = trim(configVO.cofigLabel);
						formItem.addChild(configCombo);
					
						break;
					}					
					default:
					{
						//by default it is a text input
						var configInput:TextInput=new TextInput();
						configInput.percentWidth=100;
						
						if (configVO.configType == TYPE_NUMBER)
						{
							configInput.restrict="0-9";
						}
						if (configValue != null)
						{
							configInput.text=configValue;
						}
						// (Redmine Feature # 589) ID of flex components is set so that it can be uniquely identified by Ranorex
						configInput.id = trim(configVO.cofigLabel);
						formItem.addChild(configInput);
					
					}

				}
				this.addChild(formItem);
			}
		}

		public function getProcessServiceConfig():ProcessServiceVO
		{
			if (serviceDetails == null)
			{
				serviceDetails=new ProcessServiceVO();
			}
			serviceDetails.compId=componentVO.compId;
			if (isComponentConfiguration)
				serviceDetails.serviceId=serviceIdInput.text;
			var processVO:ProcessVO=ViewModelLocator.getInstance().loadedProcess;
			if (processVO != null)
			{
				serviceDetails.prcsId=processVO.prcsId;
			}
			serviceDetails.configurations=new ArrayCollection();
			for (var i:int=0; i < compConfigurations.length; i++)
			{
				var config:ProcessServiceConfigurationVO=new ProcessServiceConfigurationVO();
				config.prcsId=serviceDetails.prcsId;
				config.serviceId=serviceDetails.serviceId;
				config.configKey=(ComponentConfigurationVO(compConfigurations.getItemAt(i))).configKey;
				config.simpleValue=getConfigValue(i);
				//if the simple value of the configuration is not empty, then add it to the service details
				if (config.simpleValue.length != 0)
				{
					serviceDetails.configurations.addItem(config);
				}
			}
			return serviceDetails;
		}

		public function getActionServiceConfiguration():ArrayCollection
		{
			return getProcessServiceConfig().configurations;
		}

		private function loadConfigValue(configKey:String):String
		{
			var configList:ArrayCollection;
			if (isComponentConfiguration && serviceDetails == null)
			{
				return null;
			}
			if (isComponentConfiguration)
			{
				configList=serviceDetails.configurations;
			}
			else
			{
				configList=stateMachineActionVO.configurations;
			}
			if (configList != null)
			{
				for (var i:int=0; i < configList.length; i++)
				{
					var config:ProcessServiceConfigurationVO=ProcessServiceConfigurationVO(configList.getItemAt(i));
					if (config.configKey == configKey)
					{
						return config.simpleValue;
					}
				}
			}
			return null;
		}

		private function getConfigValue(configIndex:int):String
		{
			//configurations start at index 1. Index 0 is for service Id.
			var item:FormItem;
			if (isComponentConfiguration)
			{
				item=FormItem(this.getChildAt(configIndex + 1));
			}
			else
			{
				item=FormItem(this.getChildAt(configIndex));
			}
			//var item:FormItem = FormItem(this.getChildAt(configIndex + 1));
			var compConfig:ComponentConfigurationVO=ComponentConfigurationVO(compConfigurations.getItemAt(configIndex));
			switch (compConfig.configType)
			{
				case(TYPE_LIST):
				case(TYPE_BOOLEAN):
				{
					return ComboBox(item.getChildAt(0)).text;
					break;
				}
				case(TYPE_TEXT_AREA):
				{
					return TextArea(item.getChildAt(0)).text;
					break;
				}
				case(TYPE_PASSWORD):
				{
					return TextInput(item.getChildAt(0)).text;
					break;
				}
				default:
				{
					//by default it is a text input
					return TextInput(item.getChildAt(0)).text;
					break;
				}
			}
		}

		private function setConfigValue(configIndex:int, configValue:String):void
		{
			//configurations start at index 1. Index 0 is for service Id
			var item:FormItem;
			if (isComponentConfiguration)
			{
				item = FormItem(this.getChildAt(configIndex + 1));
			}
			else
			{
				item = FormItem(this.getChildAt(configIndex));
			}
			//var item:FormItem = FormItem(this.getChildAt(configIndex + 1));
			var compConfig:ComponentConfigurationVO=ComponentConfigurationVO(compConfigurations.getItemAt(configIndex));
			switch (compConfig.configType)
			{
				case(TYPE_LIST):
				case(TYPE_BOOLEAN):
				{
					ComboBox(item.getChildAt(0)).text = configValue;
					break;
				}
				case(TYPE_TEXT_AREA):
				{
					TextArea(item.getChildAt(0)).text = configValue;
					break;
				}
				case(TYPE_PASSWORD):
				{
					TextInput(item.getChildAt(0)).text = configValue;
					break;
				}
				default:
				{
					//by default it is a text input
					TextInput(item.getChildAt(0)).text = configValue;
					break;
				}
			}
		}

		public function get componentVO():ComponentVO
		{
			return _componentVO;
		}

		public function set componentVO(compVO:ComponentVO):void
		{
			this._componentVO=compVO;
		}
		
		public function loadTemplateConfigurations(configurations:ArrayCollection):void {
			
			//before loading the new template clearing old template
			for(var i:int=0; i<compConfigurations.length;i++)
			{
				var cconfig:ComponentConfigurationVO = ComponentConfigurationVO(compConfigurations.getItemAt(i));
				var configKey:String = cconfig.configKey;
				
				
				var fieldIndex:Number = getConfigFieldIndex(configKey);
				if (fieldIndex != -1) {
					setConfigValue(fieldIndex, null);
				}
			}
			
			if (!isComponentConfiguration)
				return;
			for (var i:int=0; i < configurations.length; i++)
			{
				var config:ProcessServiceConfigurationVO = ProcessServiceConfigurationVO(configurations.getItemAt(i));
				var configKey:String = config.configKey;
				var simpleValue:String = config.simpleValue;
				
				var fieldIndex:Number = getConfigFieldIndex(configKey);
				if (fieldIndex != -1) {
					setConfigValue(fieldIndex, simpleValue);
				}
			}
		}
		
		private function getConfigFieldIndex(configKey:String):Number {
			for (var i:int=0; i < compConfigurations.length; i++)
			{
				var compConfig:ComponentConfigurationVO = ComponentConfigurationVO(compConfigurations.getItemAt(i));
				if (compConfig.configKey == configKey)
				{
					return i;
				}
			}
			return -1;
		}
	/**
	 *   (Redmine Feature # 589) Creates Id name from label name by removing all character except a-zA-Z
	 */
	 
	   private function trim(label:String):String{
           var idname:String = "";  
           for (var i:int=0, len:int = label.length-1; i<=len ; i++)
           { 
              if( (label.charCodeAt(i)>=97 && label.charCodeAt(i)<=122)||(label.charCodeAt(i)>=65 && label.charCodeAt(i)<=90)){
     	         idname +=  label.charAt(i).toString();
              }
               
           }  
          if(idname == ""){
              idname = "noname";
         }
         return idname;
      }	
		
		
	}
}
