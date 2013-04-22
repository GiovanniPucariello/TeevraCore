package com.headstrong.teevra.components.componentForm
{
	//import com.headstrong.teevra.client.view.entity.ComponentVO;
	
	import com.headstrong.teevra.client.graph.model.ComponentVO;
	import com.headstrong.teevra.client.model.ViewModelLocator;
	
	import flash.events.Event;
	import flash.events.MouseEvent;
	import flash.net.FileReference;
	
	import mx.collections.ArrayCollection;
	import mx.containers.ControlBar;
	import mx.containers.Form;
	import mx.containers.FormItem;
	import mx.containers.HBox;
	import mx.containers.Panel;
	import mx.containers.TitleWindow;
	import mx.controls.Alert;
	import mx.controls.Button;
	import mx.controls.ComboBox;
	import mx.controls.Label;
	import mx.controls.TextInput;
	import mx.events.CloseEvent;
	import mx.managers.PopUpManager;
	public class ComponentUI extends TitleWindow 
	{
		private var closeEventHandler:Function;
		private var saveEventHandler:Function;
		private var componentVO:ComponentVO;
		private var refUploadFile:FileReference;
		private var UploadFiles:Array = new Array();
		
		private var compNameText:TextInput;
		private var compTypeText:TextInput;
		private var compVersionText:TextInput;
		private var compTypeCmb:ComboBox;
		private var compDescText:TextInput;
		private var compServiceText:TextInput;
		private var uploadBtn:Button;
		private var fileLabel:TextInput; 
				
		[Bindable]
		public var modelLocator:ViewModelLocator = ViewModelLocator.getInstance();
		
		private const FILE_NAME:String="label.ComponentUI.fileName";
		private const COMP_NAME:String="label.ComponentUI.compName";
		private const COMP_TYPE:String="label.ComponentUI.compType";
		private const COMP_DESC:String="label.ComponentUI.compDesc";
		private const COMP_VERSN:String="label.ComponentUI.version";
		private const COMP_SERVNM:String="label.ComponentUI.compServiceName";
		
		public function ComponentUI()
		{
			
			super();
			this.layout = "vertical";
			this.showCloseButton=true;
			this.addEventListener(CloseEvent.CLOSE,popupClose);
			this.setStyle("borderAlpha", 1.0);
			this.title="Component Uploader";
			
		
		}
		private function addFiles(event:MouseEvent):void 
		{	
				refUploadFile = new  FileReference();
	  			refUploadFile.browse();
	  			refUploadFile.addEventListener(Event.SELECT,onFileSelect);
	  			refUploadFile.addEventListener(Event.COMPLETE,onFileComplete);
          
		}
		private function onFileSelect(event:Event):void 
		{	
			refUploadFile.load();
		}
		private function onFileComplete(event:Event):void
  		{
  			refUploadFile = event.currentTarget as FileReference;
  			fileLabel.text = refUploadFile.name;
            componentVO.fileName = refUploadFile.name;
            componentVO.byteData = refUploadFile.data;
	  	  }
	  	
		private function popupClose(event:Event):void
		{
	    	PopUpManager.removePopUp(this);
	    }
	    public function create(closeHandler:Function,saveEventHandler:Function,componentVO:ComponentVO):void
	    {
	    	this.closeEventHandler = closeHandler;
			this.saveEventHandler = saveEventHandler;
			this.componentVO = componentVO;
			
			var fileUploaderpanel:Panel = new Panel();
			var fileloaderhBox:HBox = new HBox();
			
			var componentForm:Form = new Form();
			
			var fileNameHBox:HBox = new HBox();
			
			//first row of the form i.e. CompName and CompType
			
			var componentNameItem:FormItem = new FormItem();
			componentNameItem.label=setFieldName(COMP_NAME);
			compNameText = new TextInput();
			componentNameItem.addChild(compNameText);
			componentForm.addChild(componentNameItem);
			
			var componentTypeItem:FormItem = new FormItem();
			componentTypeItem.label=setFieldName(COMP_TYPE);
			
			var compTypeList:ArrayCollection = new ArrayCollection();
			compTypeList.addItem("ENDPOINT");
			compTypeList.addItem("PARSER");
			compTypeList.addItem("FORMATTER");
			compTypeList.addItem("SERVICE");
			compTypeList.addItem("ROUTER");
			compTypeCmb = new ComboBox();
			compTypeCmb.dataProvider = compTypeList;
			componentTypeItem.addChild(compTypeCmb);
			componentForm.addChild(componentTypeItem);
			
			var componentDescItem:FormItem = new FormItem();
			componentDescItem.label=setFieldName(COMP_DESC);
			compDescText = new TextInput();
			compDescText.width = 400;
			componentDescItem.addChild(compDescText);
			componentForm.addChild(componentDescItem);
			
			var componentVersItem:FormItem = new FormItem();
			componentVersItem.label=setFieldName(COMP_VERSN);
			compVersionText = new TextInput();
			compVersionText.width = 400;
			componentVersItem.addChild(compVersionText);
			componentForm.addChild(componentVersItem);
			
			var componentServNMItem:FormItem = new FormItem();
			componentServNMItem.label=setFieldName(COMP_SERVNM);
			compServiceText = new TextInput();
			compServiceText.width=400;
			componentServNMItem.addChild(compServiceText);
			componentForm.addChild(componentServNMItem);
			
			fileLabel = new TextInput();
			fileLabel.width = 400;
			fileLabel.editable = false;		
			fileNameHBox.addChild(fileLabel);
			var browseButton:Button = new Button();
			browseButton.label=resourceManager.getString('TeevraUI', 'button.ComponentUI.browse');
			browseButton.addEventListener(MouseEvent.CLICK,addFiles);
			fileNameHBox.addChild(browseButton);
			
			var componentFileNMItem:FormItem = new FormItem();
			componentFileNMItem.label = setFieldName(FILE_NAME);
			componentFileNMItem.addChild(fileNameHBox);
			componentForm.addChild(componentFileNMItem);
			
			if(componentVO.compName!=null)
			{
				compNameText.text = componentVO.compName;
				compTypeText.text = componentVO.compType;
				compTypeCmb.selectedItem = componentVO.compType;
				compDescText.text = componentVO.compDesc;
				compVersionText.text = componentVO.compVerId ;
				compServiceText.text = componentVO.compServiceName; 
				
				
			}
			this.addChild(componentForm);
			
			createControlBar();
		}
		private function createControlBar():void
		{
			var controlBar:ControlBar = new ControlBar();
			controlBar.percentHeight = 10;
			controlBar.percentWidth = 90;
			
			
			var saveBtn:Button = new Button();
			saveBtn.label = resourceManager.getString('TeevraUI', 'button.ComponentUI.save');
			saveBtn.addEventListener(MouseEvent.CLICK,saveConfiguration);
			controlBar.addChild(saveBtn);
			
			var closeBtn:Button = new Button();
			closeBtn.label = resourceManager.getString('TeevraUI', 'button.ComponentUI.close');
			closeBtn.addEventListener(MouseEvent.CLICK,closeEventHandler);
			controlBar.addChild(closeBtn);
			
		
			this.addChild(controlBar);
		}
		
		public function saveConfiguration(event:MouseEvent):void
		{
			if(validateFields())
			{
				componentVO.compName = compNameText.text;
				componentVO.compType = String(compTypeCmb.value); //compTypeText.text;
				componentVO.compDesc = compDescText.text;
				componentVO.compServiceName = compServiceText.text;
				componentVO.compVerId = compVersionText.text;
				saveEventHandler.call();
			}
			else
			{
				Alert.show("Please enter component Information");
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
		private function validateFields():Boolean
		{	
			if(resourceManager.getString('TeevraUI', COMP_NAME+'.mandatory')=='Y' && compNameText.length==0)
			{
				return false;
			}
			if(resourceManager.getString('TeevraUI', COMP_DESC+'.mandatory')=='Y' && compDescText.length==0)
			{
				return false;
			}
			if(resourceManager.getString('TeevraUI', COMP_SERVNM+'.mandatory')=='Y' && compServiceText.length==0)
			{
				return false;
			}
			if(resourceManager.getString('TeevraUI', COMP_TYPE+'.mandatory')=='Y' && compTypeCmb.selectedIndex==-1)
			{
				return false;
			}
			if(resourceManager.getString('TeevraUI', COMP_VERSN+'.mandatory')=='Y' && compVersionText.length==0)
			{
				return false;
			}
			if(resourceManager.getString('TeevraUI', FILE_NAME+'.mandatory')=='Y' && fileLabel.length==0)
			{
				return false;
			}
			
			return true;
		}
	}
}