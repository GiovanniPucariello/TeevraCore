package com.headstrong.teevra.client.graph.DrawingClasses
{
  import com.headstrong.teevra.client.graph.common.Line;
  import com.headstrong.teevra.client.model.ViewModelLocator;
  import com.headstrong.teevra.client.view.entity.ProcessVO;
  
  import flash.events.ContextMenuEvent;
  import flash.events.Event;
  import flash.events.MouseEvent;
  import flash.ui.ContextMenuItem;
  
  import mx.controls.Alert;
  import mx.events.CloseEvent;
  import mx.events.FlexEvent;
  
  public class ComponentConnector extends Line
  {
    
    private var modelLocator:ViewModelLocator = ViewModelLocator.getInstance();
    
    public function ComponentConnector(){
      super();   
       this.addEventListener(FlexEvent.ADD,addMenu);
    }
    public function addMenu(event:Event):void
    {
    	rightClickEvent();
    }
    override public function rightClickEvent():void
	{
		var menuItemForDelete:ContextMenuItem = new ContextMenuItem("Delete Connector");
		menuItemForDelete.addEventListener(ContextMenuEvent.MENU_ITEM_SELECT,confirmDeleteHandlerForMenu);
		var customContextMenu:flash.ui.ContextMenu = new flash.ui.ContextMenu();
		//hide the Flash menu
		customContextMenu.hideBuiltInItems();
		customContextMenu.customItems.push(menuItemForDelete);
		this.contextMenu = customContextMenu;
	}
	 private function confirmDeleteHandlerForMenu(event:ContextMenuEvent):void
	 {
	   	Alert.show("Do you want to delete this instance?", "Confirm delete", 
		   			Alert.YES | Alert.NO, null, 
	   			confirmDeleteHandler, null, Alert.NO);
	 }
    
	private function confirmDeleteHandler(e:CloseEvent):void 
	{
	   	var loadedProcess:ProcessVO = modelLocator.loadedProcess;
	   	if (e.detail == Alert.YES) 
	   	{
			if(loadedProcess!=null && (!loadedProcess.isProcessEditable()))
			{
				Alert.show("Process is running.Connector cannot be deleted");
			}
			else
			{
				designer.deleteLine(this);
			}
	   	}
	  }
   }
}