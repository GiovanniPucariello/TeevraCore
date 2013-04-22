package com.headstrong.teevra.client.view.admin
{
	import com.headstrong.teevra.client.model.DataSourceCache;
	import com.headstrong.teevra.client.model.ViewModelLocator;
	import com.headstrong.teevra.client.view.entity.DataSourceConfigVO;
	import com.headstrong.teevra.client.view.entity.RefDataConfigVO;
	
	import flash.events.Event;
	import flash.events.MouseEvent;
	
	import mx.collections.ArrayCollection;
	import mx.containers.ControlBar;
	import mx.containers.Form;
	import mx.containers.FormItem;
	import mx.containers.TitleWindow;
	import mx.controls.Alert;
	import mx.controls.Button;
	import mx.controls.ComboBox;
	import mx.controls.Label;
	import mx.controls.TextArea;
	import mx.controls.TextInput;
	import mx.events.CloseEvent;
	import mx.managers.PopUpManager;
	
	public class NewRefDataPopup extends TitleWindow
	{
		[Bindable]		
		private var modelLocator:ViewModelLocator = ViewModelLocator.getInstance();
		
		private var closeEventHandler:Function;
		private var saveEventHandler:Function;
		private var newRefDataConfig:RefDataConfigVO;
	
		private var refDataIdField:Label;
		private var refDataNameField:TextInput;
		private var dataSourceNameField:ComboBox;
		private var refDataQueryField:TextArea;
		
		private const REF_DATA_ID:String="label.NewRefDataConfig.refDataIdLabel";
		private const REF_DATA_NAME:String="label.NewRefDataConfig.refDataNameLabel";
		private const DATA_SOURCE_NAME:String="label.NewRefDataConfig.dataSourceNameLabel";
		private const REF_DATA_QUERY:String="label.NewRefDataConfig.refDataQueryLabel";
		
		public function NewRefDataPopup()
		{
			super();
			this.layout = "vertical";
			this.showCloseButton=true;
			this.addEventListener(CloseEvent.CLOSE,popupClose);
		}
		
		private function popupClose(event:Event):void
		{
	    	PopUpManager.removePopUp(this);
	    }
		
		public function create(closeHandler:Function,saveEventHandler:Function,newRefDataConfig:RefDataConfigVO,isNewConfig:Boolean):void
		{	
			this.closeEventHandler = closeHandler;
			this.saveEventHandler = saveEventHandler;
			this.newRefDataConfig = newRefDataConfig;
			
			if(isNewConfig)
			{
				this.title="New Reference Data Configuration";
				addConfigFields(isNewConfig);
			}
			else
			{
				this.title="Edit Reference Data Configuration";
				addConfigFields(isNewConfig);
				setConfigDetails();
			}						
			//create control bar
			createControlBar();

		}
		
		/**
		 * Creates the fields for configuration
		 */
		private function addConfigFields(isNewConfig:Boolean):void
		{
			var configForm:Form = new Form();
			//ref data Id is shown only after saving configuration once
//			if(!(isNewConfig))
//			{
//				var refDataIdItem:FormItem = new FormItem();
//				refDataIdItem.label = setFieldName(REF_DATA_ID);
//				refDataIdField = new Label();
//				refDataIdItem.addChild(refDataIdField);
//				configForm.addChild(refDataIdItem);
//			}
			
			var refDataNameItem:FormItem = new FormItem();
			refDataNameItem.label = setFieldName(REF_DATA_NAME);
			refDataNameField = new TextInput();
			refDataNameField.width=300;
			if(!isNewConfig)
			{
				refDataNameField.editable = false;
			}
			refDataNameItem.addChild(refDataNameField);
			configForm.addChild(refDataNameItem);
			
			var refDataSourceItem:FormItem = new FormItem();
			refDataSourceItem.label = setFieldName(DATA_SOURCE_NAME);
			dataSourceNameField = new ComboBox();
			dataSourceNameField.width=300;
			dataSourceNameField.selectedIndex= -1;
			dataSourceNameField.dataProvider = getDataSources();
			dataSourceNameField.labelField = "dataSourceName";
			refDataSourceItem.addChild(dataSourceNameField);
			configForm.addChild(refDataSourceItem);
			
			var refDataQueryItem:FormItem = new FormItem();
			refDataQueryItem.label = setFieldName(REF_DATA_QUERY);
			refDataQueryField = new TextArea();;
			refDataQueryField.width=300;
			refDataQueryItem.addChild(refDataQueryField);
			configForm.addChild(refDataQueryItem);
			
			this.addChild(configForm);
		}
		
		/**
		 * creats control bar with save and close buttons
		 */
		private function createControlBar():void
		{
			var controlBar:ControlBar = new ControlBar();
			controlBar.percentHeight = 10;
			controlBar.percentWidth = 90;
			
			var saveBtn:Button = new Button();
			saveBtn.label = "Save";
			saveBtn.addEventListener(MouseEvent.CLICK,saveConfiguration);
			controlBar.addChild(saveBtn);		
			
			var closeBtn:Button = new Button();
			closeBtn.label = "Close";
			closeBtn.addEventListener(MouseEvent.CLICK, closeEventHandler);
			controlBar.addChild(closeBtn);
			
			this.addChild(controlBar);
		}
		
		/**
		 * method to get the details provided by the user to add new reference data
		 */
		private function saveConfiguration(event:MouseEvent):void
		{	
			//set the user specified data to the Vo
			newRefDataConfig.refDataName = refDataNameField.text;
			newRefDataConfig.dataSourceId = getDataSourceId(dataSourceNameField.text);
			newRefDataConfig.refDataQuery = refDataQueryField.text;
			// call parent 
			if(validateFields())
			{
				saveEventHandler.call();
			}
			else
			{
				Alert.show("Please enter all mandatory fields");
			}
		}
		
		/**
		 * method to get the data sources in the system
		 */
		private function getDataSources():ArrayCollection
		{	
    		var dataSourceConfigList:ArrayCollection = DataSourceCache.getInstance().getConfigs();
    		var dataSourceNamesList:ArrayCollection = new ArrayCollection();
    		for(var i:int=0; i<dataSourceConfigList.length; i++)
    		{
    			var dataSourceConfig:DataSourceConfigVO = DataSourceConfigVO(dataSourceConfigList[i]);
    			dataSourceNamesList.addItem(dataSourceConfig.dataSourceName);
    		}
    		
			return dataSourceNamesList;				
		}
		
		/**
		 * method to set the details of the saved configuration for editing
		 */
		private function setConfigDetails():void
		{	
    		
		//	refDataIdField.text = newRefDataConfig.refDataId.toString();
			refDataNameField.text = newRefDataConfig.refDataName;
			dataSourceNameField.text =newRefDataConfig.dataSourceName;
			refDataQueryField.text = newRefDataConfig.refDataQuery;
				
		}
		
		// returns data source id for the given data source name
		private function getDataSourceId(name:String):Number
		{
			var dataSourceConfigList:ArrayCollection = DataSourceCache.getInstance().getConfigs();
			var dataSourceId:Number;
			for(var i:int=0; i<dataSourceConfigList.length; i++)
			{
				var dataSourceConfig:DataSourceConfigVO = DataSourceConfigVO(dataSourceConfigList[i]);
				if(dataSourceConfig.dataSourceName == name)
				{
					dataSourceId = dataSourceConfig.dataSourceId;
				}
			}
			return dataSourceId;
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
		private function validateFields():Boolean
		{	
//			if(resourceManager.getString('TeevraUI', REF_DATA_ID+'.mandatory')=='Y')
//			{
//				return false;
//			}
			if(resourceManager.getString('TeevraUI', REF_DATA_NAME+'.mandatory')=='Y' && refDataNameField.length==0)
			{
				return false;
			}
			if(resourceManager.getString('TeevraUI', DATA_SOURCE_NAME+'.mandatory')=='Y' && dataSourceNameField.text=="")
			{
				return false;
			}
			if(resourceManager.getString('TeevraUI', REF_DATA_QUERY+'.mandatory')=='Y' && refDataQueryField.length==0)
			{
				return false;
			}						
			return true;
		}

	}
}