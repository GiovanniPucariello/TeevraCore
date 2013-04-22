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
 * $Id: GraphCanvasItem.as
 * $Revision: 
 * $Author: PAakash
 * $DateTime: Feb 26, 2009  
 */
package com.headstrong.teevra.client.graph
{
	import com.headstrong.teevra.client.graph.DrawingClasses.ComponentConnector;
	import com.headstrong.teevra.client.graph.common.GraphCanvasItem;
	import com.headstrong.teevra.client.graph.model.ComponentVO;
	import com.headstrong.teevra.client.graph.model.ProcessServiceVO;
	import com.headstrong.teevra.client.model.ViewModelLocator;
	import com.headstrong.teevra.client.view.entity.ProcessVO;
	
	import flash.display.DisplayObject;
	import flash.events.ContextMenuEvent;
	import flash.events.MouseEvent;
	import flash.ui.ContextMenuItem;
	import flash.utils.Dictionary;
	
	import mx.controls.Alert;
	import mx.controls.Image;
	import mx.controls.TextInput;
	import mx.core.Application;
	import mx.core.IFlexDisplayObject;
	import mx.events.CloseEvent;
	import mx.managers.PopUpManager;
	import mx.modules.IModuleInfo;
	import mx.modules.ModuleLoader;
	
	public class ComponentGraphCanvasItem extends GraphCanvasItem
	{
		
		private var popup:IFlexDisplayObject;
		private var popupSWF:IFlexDisplayObject;
		private var moduleInfo:IModuleInfo;
		private var modelLocator:ViewModelLocator = ViewModelLocator.getInstance();
		private var configUI:ComponentConfigurationContainer;
		private var _serviceDetails:ProcessServiceVO;
		private var moduleLoader:ModuleLoader;
		
	
	
		//private var designer:ComponentDesigner;
		public var labelBag:Dictionary=new Dictionary();
		public var parentComponent:ComponentVO;
		public var componentImage:Image;
		public var configLoaderName:String;
		
	
		

		/*(Redmine Feature #589) x and y represents image coordinates in canvas window which will be concatenated with image ID property 
	so that each image can be uniquely identified by Ranorex*/
	
		public function ComponentGraphCanvasItem(parentComponent:ComponentVO, svcDetails:ProcessServiceVO ,x:int ,y:int)
		{
			super();
			this.parentComponent = parentComponent;
			this.serviceDetails = svcDetails;
	        
	      
			addItems(x,y);	
		
		}
		public function get serviceDetails():ProcessServiceVO
		{
			return _serviceDetails;
		}
		public function set serviceDetails(svcDetails:ProcessServiceVO):void
		{
			_serviceDetails = svcDetails;
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
	    
	    /*(Redmine Feature #589) x and y represents image coordinates in canvas window which will be concatenated with image ID property 
	    so that each image can be uniquely identified by Ranorex*/
		
		override public function addItems(x:int, y:int ):void
		{
			componentImage = new Image();
			
			//(Redmine Feature #589) As id will not accept '-' character
			if(x<0){
			   x = -x;
			}
			if(y<0){
			   y = -y;
			}
			// (Redmine Feature #589) Concatenating image coordinate with its id property.
		  	componentImage.id = "icon_" + parentComponent.compId.toString() + "_" + x + y;			
			componentImage.source = "images/components/"+ parentComponent.compImageRef;//.imageRef;
			var toolTip:String = "";
			if ((serviceDetails != null) && (serviceDetails.serviceId != null)) {
				toolTip = serviceDetails.serviceId + ":";
			}
			toolTip = toolTip + parentComponent.compDesc;
			componentImage.toolTip=toolTip;
			this.addChild(componentImage);
			
		
		}
		private function confirmDeleteHandler(event:CloseEvent):void
		{
			var loadedProcess:ProcessVO = modelLocator.loadedProcess;
	   		if (event.detail == Alert.YES) {
				// added not to delete the component while the process is running
				if(loadedProcess!=null && loadedProcess.prcsStatus == 'LOCKED')
				{
					Alert.show("Process is running.Component cannot be deleted");
				}
				else
				{
					var lb:TextInput =TextInput(labelBag[this.id]);	
	    			this.parent.removeChild(lb);
	    			labelBag[this.id]=null;			
					this.removeChild(componentImage);
					designer.deleteBox(this);
				}

	   		}
			
		}	 
	   private function confirmDeleteHandlerForMenu(event:ContextMenuEvent):void
	   {
	   	Alert.show("Do you want to delete this instance?", "Confirm delete", 
		   			Alert.YES | Alert.NO, null, 
	   			confirmDeleteHandler, null, Alert.NO);
	   }

	  
	    override public function mouseDoubleClick(event:ContextMenuEvent):void{
	    	popup = PopUpManager.createPopUp(DisplayObject(Application.application), ComponentConfigurationContainer, true, null);
	    	configUI = ComponentConfigurationContainer(popup);  
	    	configUI.create(parentComponent, serviceDetails, popupClose, popupSave);
	    }
	    public function popupClose(event:MouseEvent):void{
	    	PopUpManager.removePopUp(popup);
	    }	    
	    public function popupSave():void{
	    	PopUpManager.removePopUp(popup);
	    	serviceDetails = configUI.getServiceDetails();
	    	var toolTip:String = "";
			if ((serviceDetails != null) && (serviceDetails.serviceId != null)) {
				toolTip = serviceDetails.serviceId + ":";
			}
			toolTip = toolTip + parentComponent.compDesc;
			componentImage.toolTip=toolTip;
			setComponentName(serviceDetails.serviceId);
			/*if (serviceDetails != null) {
	    		serviceLabel.text = serviceDetails.serviceId;
	    	}
	    	*/
	    }
	    
	    override public function mouseDown(event:MouseEvent):void{
	    		    	
	    	var loadedProcess:ProcessVO = modelLocator.loadedProcess;
//			if (event.ctrlKey) {
//				mouseDoubleClick(event);
//				return;	
//			}
//			if(this.parentComponent.compType=="ERRHANDLER")
//	    	{
//	    		return;
//	    	}			
			if (!designer.isDrawEnable){
				this.startDrag();  
			}
			else{
				if(loadedProcess!=null && loadedProcess.prcsStatus == 'LOCKED')
				{
					Alert.show("Process is running. Cannot be modified");
				}				
				else
				{
					designer.prepareDrawing(); 
					designer.currentFromBox= this;
				}
			}
			
	    }
	    
	    override public function mouseMove(event:MouseEvent):void{
	      if (fromLines.length>0){
	        drawFromLines();  
	      }
	      if (toLines.length>0){
	        drawToLines();  
	      }        
	    }
	   
	    private function drawFromLines():void{
	      for (var i:int=0;i<fromLines.length;i++){
	        ComponentConnector(fromLines[i]).drawLine();
	      }
	    }
	    
	    private function drawToLines():void{
	      for (var i:int=0;i<toLines.length;i++){
	        ComponentConnector(toLines[i]).drawLine();
	      }
	    }
	        
	    override public function mouseUp(event:MouseEvent):void{
	      if (!designer.isDrawEnable){
	        this.stopDrag();
	        moveLabel();
	      }
	      else{  
			        designer.currentToBox= this;
			        if(ComponentGraphCanvasItem(designer.currentFromBox).parentComponent.compType==ComponentVO.ERRREPORTER)
			        {		
						designer.isDrawEnable = false;
			        	designer.cancelDrawing();
			        }
			        else if(ComponentGraphCanvasItem(designer.currentFromBox).parentComponent.compType==ComponentVO.ENDPOINT  && ComponentGraphCanvasItem(designer.currentToBox).parentComponent.compType==ComponentVO.ERRREPORTER)
			        {
			        	designer.isDrawEnable = false;
			        	designer.cancelDrawing();
			        }
			        else
			        {
			        	if(ComponentGraphCanvasItem(designer.currentToBox).parentComponent.compType==ComponentVO.ERRREPORTER)
			        	{
			        		designer.color = 0xF77474;
			        	}
			        	else
			        	{
			        		designer.color = 0x000000;
			        	}
			        	designer.addLine();
			        }
		       	}
	        }      
	    private function moveLabel():void
	    {
	    	//var lb:Label=Label(labelBag[this.id]);
	    	var lb:TextInput =TextInput(labelBag[this.id]);	    	
	    	lb.x=this.x-50;
	    	lb.y=this.y+55;
	    }
	    
	    private function setComponentName(name:String):void
	    {
	    	//var lb:Label=Label(labelBag[this.id]);
	    	var lb:TextInput =TextInput(labelBag[this.id]);    		    		    	
	    	lb.text=name;
	    		    	
			
	    }
	}
}
