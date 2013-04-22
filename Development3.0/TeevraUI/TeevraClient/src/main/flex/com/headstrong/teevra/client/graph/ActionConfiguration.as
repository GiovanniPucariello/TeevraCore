package com.headstrong.teevra.client.graph
{
	import com.headstrong.teevra.client.graph.model.ComponentVO;
	import com.headstrong.teevra.client.graph.model.ProcessServiceVO;
	import com.headstrong.teevra.client.graph.model.StateMachineActionVO;
	import com.headstrong.teevra.client.graph.model.StateMachineLinkVO;
	
	import flash.events.Event;
	import flash.events.MouseEvent;
	
	import mx.containers.ControlBar;
	import mx.containers.TitleWindow;
	import mx.controls.Button;
	import mx.events.CloseEvent;
	import mx.managers.PopUpManager;
	
	public class ActionConfiguration extends TitleWindow
	{
		private var closeEventHandler:Function;
		private var saveEventHandler:Function;
		private var standardConfig:ComponentConfigurationForm;
		private var serviceDetails:ProcessServiceVO;
		private var stateMachineLinkVO:StateMachineLinkVO;
		private var _transitionAction:StateMachineActionVO;
		private var componentVO:ComponentVO;
		
		public function ActionConfiguration()
		{
			this.layout = "vertical";
			this.percentHeight = 100;
			this.percentWidth = 100;
			this.showCloseButton=true;
			this.addEventListener(CloseEvent.CLOSE,popupClose);
			this.title="Action Configuration";
		}
		public function get transitionAction():StateMachineActionVO
		{
			return _transitionAction;
		}
		public function set transitionAction(value:StateMachineActionVO):void
		{
			this._transitionAction = value;	
		}
		private function popupClose(event:Event):void{
	    	PopUpManager.removePopUp(this);
	    }

		public function centerPopup(event:Event):void{
			PopUpManager.centerPopUp(this);
		}
		public function create(componentVO:ComponentVO,transitionAction:StateMachineActionVO,closeHandler:Function, saveHandler:Function):void
		{
			this.closeEventHandler = closeHandler;
			this.saveEventHandler = saveHandler;
			this.stateMachineLinkVO = stateMachineLinkVO;
			this.transitionAction = transitionAction;
			this.componentVO = componentVO;
			
			standardConfig = new ComponentConfigurationForm(componentVO, this.transitionAction,serviceDetails,false);
			
			this.addChild(standardConfig);
			createControlBar();
		}
		private function createControlBar():void
		{
			var controlBar:ControlBar = new ControlBar();
			controlBar.percentHeight = 10;
			controlBar.percentWidth = 90;
			var saveBtn:Button = new Button();
			saveBtn.label = "Save";
			saveBtn.addEventListener(MouseEvent.CLICK,saveComponentConfiguration);
			controlBar.addChild(saveBtn);

			var closeBtn:Button = new Button();
			closeBtn.label = "Cancel";
			closeBtn.addEventListener(MouseEvent.CLICK, closeEventHandler);
			controlBar.addChild(closeBtn);
			
			this.addChild(controlBar);
		}
		public function saveComponentConfiguration(event:MouseEvent):void
		{	
			if(transitionAction==null)
			{
				transitionAction = new StateMachineActionVO();
			}	
			transitionAction.configurations = standardConfig.getActionServiceConfiguration();
			transitionAction.compId = componentVO.compId;
			saveEventHandler.call();			
		}

	}
}