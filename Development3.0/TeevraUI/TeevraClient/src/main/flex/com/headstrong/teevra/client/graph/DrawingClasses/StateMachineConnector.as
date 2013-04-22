package com.headstrong.teevra.client.graph.DrawingClasses
{
  import com.headstrong.teevra.client.graph.StateMachineGraphCanvasItem;
  import com.headstrong.teevra.client.graph.StateTransactionProperty;
  import com.headstrong.teevra.client.graph.common.Line;
  import com.headstrong.teevra.client.graph.model.StateMachineLinkVO;
  
  import flash.events.ContextMenuEvent;
  import flash.events.Event;
  import flash.events.MouseEvent;
  import flash.ui.ContextMenuItem;
  
  import mx.controls.Alert;
  import mx.core.IFlexDisplayObject;
  import mx.events.CloseEvent;
  import mx.events.FlexEvent;
  import mx.managers.PopUpManager;
  
  public class StateMachineConnector extends Line
  {
  	private var popup:IFlexDisplayObject;
	private var transactionPropertyUI:StateTransactionProperty;
	public var stateMachineLinkVO:StateMachineLinkVO;
	
   	public function StateMachineConnector()
   	{
     	super();    
     	stateMachineLinkVO = new StateMachineLinkVO();
      	this.addEventListener(FlexEvent.ADD,addMenu);
    }
    public function addMenu(event:Event):void
    {
    	rightClickEvent();
    }
     override public function rightClickEvent():void
	{
		var menuItemForDelete:ContextMenuItem = new ContextMenuItem("Delete Connector");
		var menuItemForConfig:ContextMenuItem = new ContextMenuItem("Configure Component");
		menuItemForDelete.addEventListener(ContextMenuEvent.MENU_ITEM_SELECT,confirmDeleteHandlerForMenu);
		menuItemForConfig.addEventListener(ContextMenuEvent.MENU_ITEM_SELECT,connectorPopUp);
		var customContextMenu:flash.ui.ContextMenu = new flash.ui.ContextMenu();
		//hide the Flash menu
		customContextMenu.hideBuiltInItems();
		customContextMenu.customItems.push(menuItemForDelete);
		customContextMenu.customItems.push(menuItemForConfig);		
		this.contextMenu = customContextMenu;
	}
	private function confirmDeleteHandlerForMenu(event:ContextMenuEvent):void
	 {
	   	Alert.show("Do you want to delete this instance?", "Confirm delete", 
		   			Alert.YES | Alert.NO, null, 
	   			confirmDeleteHandler, null, Alert.NO);
	 }    
    public function connectorPopUp(event:ContextMenuEvent):void
    {
    	popup = PopUpManager.createPopUp(this, StateTransactionProperty, true, null);
    	transactionPropertyUI = StateTransactionProperty(popup);  
    	var fromState:StateMachineGraphCanvasItem=StateMachineGraphCanvasItem(fromBox);
    	var toState:StateMachineGraphCanvasItem=StateMachineGraphCanvasItem(toBox);
    	stateMachineLinkVO.sourceStateName = fromState.stateVO.stateName;
    	stateMachineLinkVO.targetStateName = toState.stateVO.stateName;
    	transactionPropertyUI.create(stateMachineLinkVO,popupClose, popupSave);
    	PopUpManager.centerPopUp(popup);
	 }
    public function popupClose(event:MouseEvent):void
	{
		PopUpManager.removePopUp(popup);
	}
	public function popupSave():void
	{
		PopUpManager.removePopUp(popup);
	}   
	private function confirmDeleteHandler(e:CloseEvent):void 
	{
	   	if (e.detail == Alert.YES) 
	   	{
	   		designer.deleteCurveLine(this);
	   	}
	  }
   }
}