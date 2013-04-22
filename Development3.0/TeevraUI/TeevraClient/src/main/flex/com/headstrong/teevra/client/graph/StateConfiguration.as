package com.headstrong.teevra.client.graph
{
	import com.headstrong.teevra.client.graph.model.StateVO;
	import com.headstrong.teevra.client.model.ComponentCache;
	
	import flash.events.Event;
	import flash.events.MouseEvent;
	
	import mx.containers.ControlBar;
	import mx.containers.Form;
	import mx.containers.FormItem;
	import mx.containers.HBox;
	import mx.containers.TitleWindow;
	import mx.controls.Alert;
	import mx.controls.Button;
	import mx.controls.ComboBox;
	import mx.controls.TextInput;
	import mx.core.IFlexDisplayObject;
	import mx.events.CloseEvent;
	import mx.events.ListEvent;
	import mx.managers.PopUpManager;
	
	public class StateConfiguration extends TitleWindow 
	{
		private var popup:IFlexDisplayObject;
		private var actionConfigurationUI:ActionConfiguration;
		
		private var closeEventHandler:Function;
		private var saveEventHandler:Function;
		private var stateVO:StateVO;
		private var stateType:String;
		
		private var stateNameText:TextInput;
		private var stateDescription:TextInput;
		private var entryActionCmb:ComboBox;
		private var exitActionCmb:ComboBox;
		
		private var entryActionHBox:HBox;
		private var exitActionHBox:HBox;
		
		private var entryActionButton:Button;
		private var exitActionButton:Button;
		
		private var stateExitItem:FormItem;
		private var stateEntryItem:FormItem;
		private var stateForm:Form;
		
		private const STATE_NAME:String="configField.StateConfiguration.stateName";
		private const STATE_DESC:String="configField.StateConfiguration.description";
		private const ENTRY_ACTION:String="configField.StateConfiguration.entryAction";
		private const EXIT_ACTION:String="configField.StateConfiguration.exitAction";
	
		public function StateConfiguration()
		{
			super();
			this.layout = "vertical";
			this.percentHeight = 100;
			this.percentWidth = 100;
			this.showCloseButton=true;
			this.addEventListener(CloseEvent.CLOSE,popupClose);
		}
		private function popupClose(event:Event):void{
	    	PopUpManager.removePopUp(this);
	    }

		public function centerPopup(event:Event):void{
			PopUpManager.centerPopUp(this);
		}
		public function create(stateConfigVO:StateVO,stateType:String,closeHandler:Function, saveHandler:Function):void
		{
			this.stateVO = stateConfigVO;
			this.stateType = stateType;
			this.closeEventHandler = closeHandler;
			this.saveEventHandler = saveHandler;
			this.title="State configuration";
			
			constructConfigUI();
			if(stateVO.exitAction!=null)
			{
				exitActionButton.enabled=true;
			}
			if(stateVO.entryAction!=null)
			{
				entryActionButton.enabled=true;
			}	
			createControlBar();
		}
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
			closeBtn.label = "Cancel";
			closeBtn.addEventListener(MouseEvent.CLICK, closeEventHandler);
			controlBar.addChild(closeBtn);
			
			this.addChild(controlBar);
		}
		public function constructConfigUI():void
		{
			stateForm = new Form();
			
			var stateNameItem:FormItem = new FormItem();
			stateNameItem.label=setFieldName(STATE_NAME);
			stateNameText = new TextInput();
			if(stateVO.stateName!=null)
				stateNameText.text = stateVO.stateName;
			stateNameItem.addChild(stateNameText);
			stateForm.addChild(stateNameItem);
			
			var stateDescItem:FormItem = new FormItem();
			stateDescItem.label=setFieldName(STATE_DESC);
			stateDescription = new TextInput();
			if(stateVO.stateDesc!=null)
				stateDescription.text = stateVO.stateDesc;
			stateDescItem.addChild(stateDescription);
			stateForm.addChild(stateDescItem);
					
			if(stateType=="INIT")
			{
				exitAction();
				entryAction();
			}
			else if(stateType=="END")
			{
				entryAction();
			}
			else
			{		
				exitAction();
				entryAction();
			}
			this.addChild(stateForm);
		}
		private function exitActionConfiguration(event:MouseEvent):void
		{	
			popup = PopUpManager.createPopUp(this, ActionConfiguration, true, null);
			actionConfigurationUI = ActionConfiguration(popup);
			actionConfigurationUI.create(ComponentCache.getInstance().retrieveComponent(exitActionCmb.text),stateVO.exitAction,actionpopupClose, exitActionpopupSave);
			PopUpManager.centerPopUp(popup);			
		}
		private function entryActionConfiguration(event:MouseEvent):void
		{	
			popup = PopUpManager.createPopUp(this, ActionConfiguration, true, null);
			actionConfigurationUI = ActionConfiguration(popup);
			actionConfigurationUI.create(ComponentCache.getInstance().retrieveComponent(entryActionCmb.text),stateVO.entryAction,actionpopupClose, entryActionpopupSave);
			PopUpManager.centerPopUp(popup);			
		}
		public function exitActionpopupSave():void
		{
			stateVO.exitAction = actionConfigurationUI.transitionAction;
			PopUpManager.removePopUp(popup);
		}
		public function entryActionpopupSave():void
		{
			stateVO.entryAction = actionConfigurationUI.transitionAction;
			PopUpManager.removePopUp(popup);
		}
		
		public function actionpopupClose(event:MouseEvent):void
		{
			PopUpManager.removePopUp(popup);
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
		private function validateFields(stateVO:StateVO):Boolean
		{			
			if(resourceManager.getString('TeevraUI', STATE_NAME+'.mandatory')=='Y')
			{
				if(stateVO.stateName==null  || stateVO.stateName=="")
				{
					return false;
				}
			}
			if(resourceManager.getString('TeevraUI', STATE_DESC+'.mandatory')=='Y')
			{
				if(stateVO.stateDesc==null  || stateVO.stateDesc=="")
				{
					return false;
				}
				
			}
			if(resourceManager.getString('TeevraUI', ENTRY_ACTION+'.mandatory')=='Y' && (stateVO.stateType=="END" || stateVO.stateType=="NORMAL"))
			{
				if(stateVO.entryAction==null )
				{
					return false;
				}
			}
			if(resourceManager.getString('TeevraUI', EXIT_ACTION+'.mandatory')=='Y' && (stateVO.stateType=="INIT" || stateVO.stateType=="NORMAL"))
			{
				if(stateVO.exitAction==null )
				{
					return false;
				}
			}
			return true;
		}
		public function saveConfiguration(event:MouseEvent):void
		{
			stateVO.stateName = stateNameText.text;
			stateVO.stateDesc = stateDescription.text;
			stateVO.stateType = stateType;
			if(validateFields(stateVO))
			{
				saveEventHandler.call();
			}
			else
			{
				Alert.show("Please fill in all the mandatory fields");
			}
			
		}
		private function entryAction():void
		{
				entryActionHBox = new HBox();
				stateEntryItem = new FormItem();
				stateEntryItem.label=setFieldName(ENTRY_ACTION);
				entryActionCmb = new ComboBox();
				entryActionCmb.dataProvider = ComponentCache.getInstance().getActions();
				entryActionCmb.addEventListener(ListEvent.CHANGE,enabledEntryActionButton);
				entryActionCmb.labelField = "compName";
				entryActionCmb.selectedIndex=-1;
				if(stateVO.entryAction!=null)
				{
				var id:Number = stateVO.entryAction.compId;
				entryActionCmb.selectedItem = ComponentCache.getInstance().getComponentFromId(id);
				}
				stateEntryItem.addChild(entryActionCmb);
				entryActionHBox.addChild(stateEntryItem);
				entryActionButton = new Button();
				entryActionButton.enabled=false;
				entryActionButton.label="Configure Action";
				entryActionButton.addEventListener(MouseEvent.CLICK, entryActionConfiguration);
				entryActionHBox.addChild(entryActionButton);			
				stateForm.addChild(entryActionHBox);
		}
		private function exitAction():void
		{
				exitActionHBox = new HBox();
				stateExitItem = new FormItem();
				stateExitItem.label=setFieldName(EXIT_ACTION);
				exitActionCmb = new ComboBox();
				exitActionCmb.dataProvider = ComponentCache.getInstance().getActions();
				exitActionCmb.addEventListener(ListEvent.CHANGE,enabledExitActionButton);
				exitActionCmb.labelField = "compName";
				exitActionCmb.selectedIndex=-1;
				if(stateVO.exitAction!=null)
				{
					var id:Number = stateVO.exitAction.compId;
					exitActionCmb.selectedItem = ComponentCache.getInstance().getComponentFromId(id);
				}
				stateExitItem.addChild(exitActionCmb);
				exitActionHBox.addChild(stateExitItem);
				exitActionButton = new Button();
				exitActionButton.enabled=false;
				exitActionButton.label="Configure Action";
				exitActionButton.addEventListener(MouseEvent.CLICK, exitActionConfiguration);
				exitActionHBox.addChild(exitActionButton);
				stateForm.addChild(exitActionHBox);
		}
		private function enabledEntryActionButton(event:Event):void
		{
			entryActionButton.enabled = true;
		}
		private function enabledExitActionButton(event:Event):void
		{
			exitActionButton.enabled = true;
		}
	}
}