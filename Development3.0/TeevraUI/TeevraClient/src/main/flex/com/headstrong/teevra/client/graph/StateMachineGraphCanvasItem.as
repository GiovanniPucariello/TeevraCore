/*
 * The information in this document is subject to change without notice and 
 * does not represent a commitment by Headstrong Corporation. The software 
 * and/or databases described in this document are furnished under a license 
 * agreement and may be used or copied only in accordance with the terms of 
 * the agreement. 
 * 
 * Copyright �?© 2008 Headstrong Corporation
 * All rights reserved.
 * 
 * $Id: StateMachineCanvasItem.as
 * $Revision: 
 * $Author: PAakash
 * $DateTime: Feb 26, 2009  
 */
package com.headstrong.teevra.client.graph
{
	import com.headstrong.teevra.client.graph.DrawingClasses.StateMachineConnector;
	import com.headstrong.teevra.client.graph.common.GraphCanvasItem;
	import com.headstrong.teevra.client.graph.model.StateVO;
	
	import flash.events.ContextMenuEvent;
	import flash.events.MouseEvent;
	import flash.ui.ContextMenuItem;
	import flash.utils.Dictionary;
	
	import mx.controls.Alert;
	import mx.controls.Image;
	import mx.controls.TextInput;
	import mx.core.IFlexDisplayObject;
	import mx.events.CloseEvent;
	import mx.managers.PopUpManager;
	import mx.modules.IModuleInfo;
	
	
	public class StateMachineGraphCanvasItem extends GraphCanvasItem
	{
		public var componentImage:Image;
		public var configLoaderName:String;
		private var moduleInfo:IModuleInfo;
		private var imageSource:String;
		private var stateType:String;
		public var stateVO:StateVO;
		private var toolTipString:String;
		public var labelBag:Dictionary=new Dictionary();
		private var popup:IFlexDisplayObject; 
	
		public function StateMachineGraphCanvasItem(stateType:String,stateConfiguration:StateVO)
		{
			var x:int=0;
			var y:int=0;
					
			super();
			this.stateType = stateType;
			this.stateVO = stateConfiguration;
			/*(Redmine Feature #589) Added x and y so that it matches the baseclass method signature*/
			addItems(x,y);
		}
		override public function rightClickEvent():void
		{
			var menuItemForDelete:ContextMenuItem = new ContextMenuItem("Delete Component");
			var menuItemForConfig:ContextMenuItem = new ContextMenuItem("Configure Component");
			menuItemForDelete.addEventListener(ContextMenuEvent.MENU_ITEM_SELECT,confirmDeleteHandlerForMenu);
			menuItemForConfig.addEventListener(ContextMenuEvent.MENU_ITEM_SELECT,mouseDoubleClick);
			var customContextMenu:flash.ui.ContextMenu = new flash.ui.ContextMenu();
			//hide the Flash menu
			customContextMenu.hideBuiltInItems();
			customContextMenu.customItems.push(menuItemForDelete);
			customContextMenu.customItems.push(menuItemForConfig);		
			this.contextMenu = customContextMenu;
		}
		
		/*(Redmine Feature #589) Added x and y so that it matches the baseclass method signature*/
		override public function addItems(x:int,y:int):void
		{
			const INITIAL_STATE:String="INIT";
			const END_STATE:String="END";
			const INTER_STATE:String="NORMAL";
			var imageRef:String;
			switch(stateType)
			{
				case(INITIAL_STATE):
				{	
					imageRef=resourceManager.getString('TeevraUI', 'stateMachinePalette.initState.icon');
					toolTipString="Initial State";
					break;
				}
				case(END_STATE):
				{
					imageRef=resourceManager.getString('TeevraUI', 'stateMachinePalette.finalState.icon');
					toolTipString="End State";
					break;
				}
				default:
				{
					imageRef=resourceManager.getString('TeevraUI', 'stateMachinePalette.normalState.icon');
					toolTipString="Normal State";
				}
			}
			componentImage = new Image();
			componentImage.source = imageRef;
			componentImage.width = 50;
			componentImage.height = 50;
			componentImage.toolTip=toolTipString;
			this.addChild(componentImage);
		}
	   private function confirmDeleteHandler(event:CloseEvent):void
	   {
	   		if (event.detail == Alert.YES) {
	   			
	   			var lb:TextInput =TextInput(labelBag[this.id]);	
    			this.parent.removeChild(lb);
    			labelBag[this.id]=null;			
				this.removeChild(componentImage);
				designer.deleteCurveBox(this);
	   			
//	   			this.removeChild(componentImage);
//				designer.deleteCurveBox(this);
	   		}
	   }
	   private function confirmDeleteHandlerForMenu(e:ContextMenuEvent):void
	   {	
	   		Alert.show("Do you want to delete this instance?", "Confirm delete", 
		   			Alert.YES | Alert.NO, null, 
	   			confirmDeleteHandler, null, Alert.NO);
	   			
				
	   }
	   override public function mouseDown(event:MouseEvent):void
	   {
//	   		if (event.ctrlKey) {
//				mouseDoubleClick(event);
//				return;	
//			}
			if(designer.isCurveEnable)
			{
				designer.currentFromBox = this;
				designer.currentToBox = this;
				return;
			}
			if (!designer.isDrawEnable){
				this.startDrag();  
			}
			else{
				designer.prepareDrawing(); 
				designer.currentFromBox = this;				
			}
	    }
	    override public function mouseDoubleClick(event:ContextMenuEvent):void{
	    	var configUI:StateConfiguration;
	    	popup = PopUpManager.createPopUp(this, StateConfiguration, true);
	    	configUI = StateConfiguration(popup);  
	    	configUI.create(stateVO,stateType,popupClose, popupSave);
	    	PopUpManager.centerPopUp(popup);
	    }
	     private function popupClose(event:MouseEvent):void{
	    	PopUpManager.removePopUp(popup);
	    }
	   
	   	private function popupSave():void
	   	{
	   		PopUpManager.removePopUp(popup);
	   		setComponentName(stateType);
	   	}
	  override public function mouseMove(event:MouseEvent):void
	  {	      	
		      if (fromLines.length>0)
		      {
		        drawFromLines();  
		      }
		      if (toLines.length>0)
		      {
		        drawToLines();  
		      }
		      if (fromCurveLines.length>0)
		      {
		        drawFromCurve();  
		      }
		      if (toCurveLines.length>0)
		      {
		        drawToCurve();  
		      }
	    }
	  override public function mouseUp(event:MouseEvent):void
	  {
	     	if(designer.isCurveEnable)
	     	{
	     		designer.addCurve();
	     		return;
	     	}
	      if (!designer.isDrawEnable){
	        this.stopDrag();
	        moveLabel();
	      }
	      else{
	        designer.currentToBox = this;
	        designer.color = 0x000000;
	        designer.addLine();	        
	      }      
	    }
	  private function drawFromLines():void
	  {
	      for (var i:int=0;i<fromLines.length;i++){
	        StateMachineConnector(fromLines[i]).drawLine();
	      }
	  }	    
	  private function drawToLines():void
	  {
	      for (var i:int=0;i<toLines.length;i++){
	        StateMachineConnector(toLines[i]).drawLine();
	      }
	  }
	  private function drawFromCurve():void
	  {
	      for (var i:int=0;i<fromCurveLines.length;i++){
	        StateMachineConnector(fromCurveLines[i]).drawCurve();
	      }
	  }	    
	  private function drawToCurve():void
	  {
	      for (var i:int=0;i<toCurveLines.length;i++){
	        StateMachineConnector(toCurveLines[i]).drawCurve();
	      }
	  }
	  private function moveLabel():void
	  {
	  	 	//var lb:Label=Label(labelBag[this.id]);
	   		var lb:TextInput = TextInput(labelBag[this.id]);	    	
	   		lb.x=this.x-50;
	   		lb.y=this.y+55;
	  }
	  private function setComponentName(name:String):void
	  {
	  		//var lb:Label=Label(labelBag[this.id]);
	    	var lb:TextInput = TextInput(labelBag[this.id]);    		    		    	
	    	lb.text=name;
	  }
	}
}
