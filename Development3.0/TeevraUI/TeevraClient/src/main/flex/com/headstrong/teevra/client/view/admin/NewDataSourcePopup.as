package com.headstrong.teevra.client.view.admin
{
	import com.headstrong.teevra.client.model.ViewModelLocator;
	import com.headstrong.teevra.client.view.entity.DataSourceConfigVO;
	
	import flash.events.Event;
	import flash.events.MouseEvent;
	
	import mx.collections.ArrayCollection;
	import mx.containers.ControlBar;
	import mx.containers.Form;
	import mx.containers.FormItem;
	import mx.containers.TitleWindow;
	import mx.controls.Alert;
	import mx.controls.Button;
	import mx.controls.Label;
	import mx.controls.TextInput;
	import mx.events.CloseEvent;
	import mx.managers.PopUpManager;
	
	public class NewDataSourcePopup extends TitleWindow
	{
		[Bindable]		
		private var modelLocator:ViewModelLocator = ViewModelLocator.getInstance();
		
		private var closeEventHandler:Function;
		private var saveEventHandler:Function;
		private var newDataSourceConfig:DataSourceConfigVO;
	
		private var dataSourceIdField:Label;
		private var dataSourceNameField:TextInput;
		private var dbUrlField:TextInput;
		private var dbUserNameField:TextInput;
		private var dbPasswordField:TextInput;
		private var dbTypeField:TextInput;
		
		private const DATA_SOURCE_ID:String="label.NewDataSourcePopup.dataSourceIdLabel";
		private const DATA_SOURCE_NAME:String="label.NewDataSourcePopup.dataSourceNameLabel";
		private const DB_URL:String="label.NewDataSourcePopup.dbUrlLabel";
		private const DB_USER_NAME:String="label.NewDataSourcePopup.dbUserNameLabel";
		private const DB_PASSWORD:String="label.NewDataSourcePopup.dbPasswordLabel";
		private const DB_TYPE:String="label.NewDataSourcePopup.dbTypeLabel";

		public function NewDataSourcePopup()
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
		
		public function create(closeHandler:Function,saveEventHandler:Function,newDataSourceConfig:DataSourceConfigVO, isNewConfig:Boolean):void
		{	
			this.closeEventHandler = closeHandler;
			this.saveEventHandler = saveEventHandler;
			this.newDataSourceConfig = newDataSourceConfig;
			
			if(isNewConfig)
			{
				this.title="New Data Source Configuration";
				addConfigFields(isNewConfig);
			}
			else
			{
				this.title="Edit Data Source Configuration";
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
			
//			if(!(isNewConfig))
//			{
//				var dataSourceIdItem:FormItem = new FormItem();
//				dataSourceIdItem.label = setFieldName(DATA_SOURCE_ID);
//				dataSourceIdField = new Label();
//				dataSourceIdItem.addChild(dataSourceIdField);
//				configForm.addChild(dataSourceIdItem);
//			}
			
			var dbSourceItem:FormItem = new FormItem();
			dbSourceItem.label = setFieldName(DATA_SOURCE_NAME);
			dataSourceNameField = new TextInput();;
			dataSourceNameField.width=300;
			if(!isNewConfig)
			{
				dataSourceNameField.editable = false;
			}
			dbSourceItem.addChild(dataSourceNameField);
			configForm.addChild(dbSourceItem);
			
			var dbURLItem:FormItem = new FormItem();
			dbURLItem.label = setFieldName(DB_URL);
			dbUrlField = new TextInput();
			dbUrlField.width=300;
			dbURLItem.addChild(dbUrlField);
			configForm.addChild(dbURLItem);
			
			var dbUserNameItem:FormItem = new FormItem();
			dbUserNameItem.label = setFieldName(DB_USER_NAME);
			dbUserNameField = new TextInput();
			dbUserNameField.width=300;			
			dbUserNameItem.addChild(dbUserNameField);
			configForm.addChild(dbUserNameItem);
			
			var dbPasswordItem:FormItem = new FormItem();
			dbPasswordItem.label = setFieldName(DB_PASSWORD);
			dbPasswordField = new TextInput();;
			dbPasswordField.width=300;
			dbPasswordField.displayAsPassword = true;		
			dbPasswordItem.addChild(dbPasswordField);
			configForm.addChild(dbPasswordItem);
			
			var dbTypeItem:FormItem = new FormItem();
			dbTypeItem.label = setFieldName(DB_TYPE);
			dbTypeField = new TextInput();;
			dbTypeField.width=300;
			dbTypeItem.addChild(dbTypeField);
			configForm.addChild(dbTypeItem);		
			
			
			this.addChild(configForm);
		}
		
		/**
		 * method to create control bar with save and close buttons
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
			newDataSourceConfig.dataSourceName = dataSourceNameField.text;
			newDataSourceConfig.dbUrl = dbUrlField.text;
			newDataSourceConfig.dbUsername = dbUserNameField.text;
			newDataSourceConfig.dbPassword = dbPasswordField.text;
			newDataSourceConfig.dbType = dbTypeField.text;			
			//call parent
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
		 * method to set the details of the saved configuration for editing
		 */
		private function setConfigDetails():void
		{	
    		
		//	dataSourceIdField.text = newDataSourceConfig.dataSourceId.toString();
			dataSourceNameField.text = newDataSourceConfig.dataSourceName;
			dbUrlField.text = newDataSourceConfig.dbUrl;
			dbUserNameField.text = newDataSourceConfig.dbUsername;
			dbPasswordField.text = newDataSourceConfig.dbPassword;
			dbTypeField.text = newDataSourceConfig.dbType; 
				
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
//			if(resourceManager.getString('TeevraUI', DATA_SOURCE_ID+'.mandatory')=='Y')
//			{
//				return false;
//			}
			if(resourceManager.getString('TeevraUI', DATA_SOURCE_NAME+'.mandatory')=='Y' && dataSourceNameField.length==0)
			{
				return false;
			}
			if(resourceManager.getString('TeevraUI', DB_URL+'.mandatory')=='Y' && dbUrlField.length==0)
			{
				return false;
			}
			if(resourceManager.getString('TeevraUI', DB_USER_NAME+'.mandatory')=='Y' && dbUserNameField.length==0)
			{
				return false;
			}
			if(resourceManager.getString('TeevraUI', DB_PASSWORD+'.mandatory')=='Y' && dbPasswordField.length==0)
			{
				return false;
			}
			if(resourceManager.getString('TeevraUI', DB_TYPE+'.mandatory')=='Y' && dbTypeField.length==0)
			{
				return false;
			}
			
			return true;
		}
	}
}