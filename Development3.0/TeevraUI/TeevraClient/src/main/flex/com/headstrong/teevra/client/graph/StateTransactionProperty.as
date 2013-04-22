package com.headstrong.teevra.client.graph
{
	import com.headstrong.teevra.client.graph.model.ProcessServiceVO;
	import com.headstrong.teevra.client.graph.model.StateMachineLinkVO;
	import com.headstrong.teevra.client.model.ComponentCache;
	import com.headstrong.teevra.client.model.ViewModelLocator;
	
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
	
	public class StateTransactionProperty extends TitleWindow
	{
		private var popup:IFlexDisplayObject;
		private var actionConfigurationUI:ActionConfiguration;
		private var closeEventHandler:Function;
		private var saveEventHandler:Function;
		
		private var sourceStateText:TextInput;
		private var targetStateText:TextInput;
		private var actionCmb:ComboBox;
		private var eventsCmb:ComboBox;
		private var actionConfigure:Button;
		private var saveBtn:Button;
		
		public var stateMachineLinkVO:StateMachineLinkVO;
		private var serviceDetails:ProcessServiceVO;
		private var standardConfig:ComponentConfigurationForm;
		
		private	var viewModel : ViewModelLocator = ViewModelLocator.getInstance();
		
		private const SORUCE_TEXT:String = "configField.TransactionProperty.sourceState";
		private const TARGET_TEXT:String = "configField.TransactionProperty.targetState";
		private const EVENTS:String = "configField.TransactionProperty.events";
		private const TRANSITION_ACTION:String = "configField.TransactionProperty.transitionAction";
		private const EVENT_SEPERATOR:String="configField.TransactionProperty.eventsSeperatorCharacter";
		
		public function StateTransactionProperty()
		{
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
		public function create(stateConfigurationVO:StateMachineLinkVO,closeHandler:Function, saveHandler:Function):void
		{
			this.closeEventHandler = closeHandler;
			this.saveEventHandler = saveHandler;
			this.stateMachineLinkVO = stateConfigurationVO;
			this.title = "Transition Property";
		
			constructConfigUI();
						
			if(stateMachineLinkVO.transitionAction!=null)
			{
				actionConfigure.enabled=true;
			
			}			
			createControlBar();			
		}
		public function constructConfigUI():void
		{			
			var transitionForm:Form = new Form();
			
			//source State
			var sourceStateItem:FormItem = new FormItem();
			sourceStateItem.label=setFieldName(SORUCE_TEXT);
			sourceStateText = new TextInput();
			sourceStateText.editable=false;
			if(stateMachineLinkVO.sourceStateName!=null)
				sourceStateText.text = stateMachineLinkVO.sourceStateName;
			sourceStateItem.addChild(sourceStateText);
			transitionForm.addChild(sourceStateItem);
			
			//target State
			var targetStateItem:FormItem = new FormItem();
			targetStateItem.label=setFieldName(TARGET_TEXT);
			targetStateText = new TextInput();
			targetStateText.editable=false;
			if(stateMachineLinkVO.targetStateName!=null)
				targetStateText.text = stateMachineLinkVO.targetStateName;
			targetStateItem.addChild(targetStateText);
			transitionForm.addChild(targetStateItem);
			
			//Action 
			var transitionHBox:HBox = new HBox();
			var targetActionItem:FormItem = new FormItem();
			targetActionItem.label=setFieldName(TRANSITION_ACTION);
			actionCmb = new ComboBox();
			actionCmb.selectedIndex=-1;
			actionCmb.dataProvider = ComponentCache.getInstance().getActions();
			actionCmb.addEventListener(ListEvent.CHANGE,enabledActionButton);
			actionCmb.labelField = "compName";
			if(stateMachineLinkVO.transitionAction!=null)
			{
				var id:Number = stateMachineLinkVO.transitionAction.compId;
				actionCmb.selectedItem = ComponentCache.getInstance().getComponentFromId(id);
			}	
			targetActionItem.addChild(actionCmb);
			transitionHBox.addChild(targetActionItem);
			actionConfigure = new Button();
			actionConfigure.enabled=false;
			actionConfigure.id = "actionConfiguration";
			actionConfigure.label="Configure Action";
			actionConfigure.addEventListener(MouseEvent.CLICK, actionConfiguration);
			transitionHBox.addChild(actionConfigure);
			transitionForm.addChild(transitionHBox);
			
			var eventItem:FormItem = new FormItem();
			eventItem.label=setFieldName(EVENTS);
			eventsCmb = new ComboBox();
			eventsCmb.editable=true;
			
			if(viewModel.stateMachineEventString!=null)
			{
				eventsCmb.dataProvider = viewModel.stateMachineEventString.split(",");
			}
			if(stateMachineLinkVO.eventName!=null)
			{
				eventsCmb.selectedItem = stateMachineLinkVO.eventName;
			}
			eventItem.addChild(eventsCmb);
			transitionForm.addChild(eventItem);
			this.addChild(transitionForm);
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
		
		private function createControlBar():void
		{
			var controlBar:ControlBar = new ControlBar();
			controlBar.percentHeight = 10;
			controlBar.percentWidth = 90;
				
			saveBtn = new Button();			
			saveBtn.label = "Save";
			saveBtn.addEventListener(MouseEvent.CLICK,saveConfiguration);
			controlBar.addChild(saveBtn);

			var closeBtn:Button = new Button();
			closeBtn.label = "Cancel";
			closeBtn.addEventListener(MouseEvent.CLICK, closeEventHandler);
			controlBar.addChild(closeBtn);
			
			this.addChild(controlBar);
		}
		private function enabledActionButton(event:Event):void
		{
			actionConfigure.enabled = true;
		}
		private function actionConfiguration(event:MouseEvent):void
		{	
			popup = PopUpManager.createPopUp(this, ActionConfiguration, true, null);
			actionConfigurationUI = ActionConfiguration(popup);
			actionConfigurationUI.create(ComponentCache.getInstance().retrieveComponent(actionCmb.text),stateMachineLinkVO.transitionAction,actionpopupClose, actionpopupSave);
			PopUpManager.centerPopUp(popup);			
		}
		public function actionpopupSave():void
		{
			stateMachineLinkVO.transitionAction = actionConfigurationUI.transitionAction;
			PopUpManager.removePopUp(popup);
		}
		public function actionpopupClose(event:MouseEvent):void
		{
			PopUpManager.removePopUp(popup);
		}
		public function saveConfiguration(event:MouseEvent):void
		{
			stateMachineLinkVO.sourceStateName = sourceStateText.text;
			stateMachineLinkVO.targetStateName = targetStateText.text;
			stateMachineLinkVO.eventName = eventsCmb.text;
			eventString(eventsCmb.text);
			if(validateFields())
			{
				saveEventHandler.call();
			}
			else
			{
				Alert.show("Please fill in all the mandatory fields");
			}
		}
		private function eventString(eventString:String):void
		{
			
			if(viewModel.stateMachineEventString==null)
			{
				viewModel.stateMachineEventString=eventString;
			}
			else
			{
				if(viewModel.stateMachineEventString.indexOf(eventString,0)>=0)
				{
					return;
				}
				else
				{
					viewModel.stateMachineEventString +=resourceManager.getString('TeevraUI',EVENT_SEPERATOR)+ eventsCmb.text;	
				}
				
			}			
		}
		private function validateFields():Boolean
		{
			if(resourceManager.getString('TeevraUI', SORUCE_TEXT+'.mandatory')=='Y')
			{
				if(sourceStateText.text==null || sourceStateText.text=="")
				{
					return false;
				}
			}
			if(resourceManager.getString('TeevraUI', TARGET_TEXT+'.mandatory')=='Y')
			{
				if(targetStateText.text==null || targetStateText.text=="")
				{
					return false;
				}
			}
			if(resourceManager.getString('TeevraUI', EVENTS+'.mandatory')=='Y')
			{
				if(eventsCmb.selectedItem==null || eventsCmb.selectedItem=="")
				{
					return false;
				}
				
			}
			if(resourceManager.getString('TeevraUI', TRANSITION_ACTION+'.mandatory')=='Y')
			{
				if(actionCmb.selectedItem==null || actionCmb.selectedItem=="" )
				{
					return false;
				}
				
			}
			if(resourceManager.getString('TeevraUI', EVENTS+'.mandatory')=='Y')
			{
				if(stateMachineLinkVO.eventName==null || stateMachineLinkVO.eventName=="")
				{
					return false;
				}
			}
			return true;
		}
	} 
}