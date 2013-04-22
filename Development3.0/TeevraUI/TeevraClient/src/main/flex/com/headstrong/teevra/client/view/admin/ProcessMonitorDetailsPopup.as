/*
 * The information in this document is subject to change without notice and 
 * does not represent a commitment by Headstrong Corporation. The software 
 * and/or databases described in this document are furnished under a license 
 * agreement and may be used or copied only in accordance with the terms of 
 * the agreement. 
 * 
 * Copyright © 2008 Headstrong Corporation
 * All rights reserved.
 * 
 * $Id: ProcessMonitorDetailsPopup.as
 * $Revision: 
 * $Author: VSelvaraju
 * $Feature : Redmine#611 [ProcessMonitoringConsole]
 * $DateTime: Feb 3, 2011  
 */
 package com.headstrong.teevra.client.view.admin
{
	import com.headstrong.teevra.client.events.ProcessAdminServiceEvent;
	import com.headstrong.teevra.client.util.AlertHelper;
	import com.headstrong.teevra.client.view.entity.ComponentDetailsEO;
	import com.headstrong.teevra.components.common.TeevraUIComponentsID;
	
	import flash.events.Event;
	import flash.events.MouseEvent;
	
	import mx.collections.ArrayCollection;
	import mx.collections.ICollectionView;
	import mx.containers.HBox;
	import mx.containers.TitleWindow;
	import mx.containers.VBox;
	import mx.controls.Alert;
	import mx.controls.Button;
	import mx.controls.DataGrid;
	import mx.controls.HRule;
	import mx.controls.Label;
	import mx.controls.Spacer;
	import mx.controls.dataGridClasses.DataGridColumn;
	import mx.events.CloseEvent;
	import mx.managers.PopUpManager;
	import mx.rpc.IResponder;
	
	public class ProcessMonitorDetailsPopup extends TitleWindow implements IResponder
	{	
		
		// Following are declared at instance level to accomodate Refresh
		private var processAdminServiceEvent:ProcessAdminServiceEvent;
		private var table:DataGrid;
		private var main:VBox;
		private var hbox:HBox;	
		private var _label:Label;
		private var component:ComponentDetailsEO;	
		
		public function ProcessMonitorDetailsPopup()
		{
			super();
			this.showCloseButton=true;
			this.autoLayout=true;
			this.addEventListener(CloseEvent.CLOSE,popupClose);
			this.verticalScrollPolicy="auto";
			this.maxHeight=900;		
			//minMaxBtn.label="_";
			 
		}
		/** 
		 * @param ProcessAdminServiceEvent
		 * @param ICollectionView
		 * 
		 * Builds flex components for the popup
		 * */
		public function create(processAdminServiceEvent:ProcessAdminServiceEvent,dataprovider:ICollectionView):void
		{	
			/* Check if same Popup is already open */
			var i:int=0;;
			var popup:Object;
			var _title:String=resourceManager.getString('TeevraUI','title.ProcessMonitorDetailsPopup')
			+resourceManager.getString('TeevraUI','title_process_id.ProcessMonitorDetailsPopup')
			+processAdminServiceEvent.getArgument(ProcessAdminServiceEvent.VIEW_PROCESS_ID)
			+resourceManager.getString('TeevraUI','title_process_name.ProcessMonitorDetailsPopup')
			+processAdminServiceEvent.getArgument(ProcessAdminServiceEvent.VIEW_PROCESS_NAME);
			
			for (i=0 ; i<systemManager.rawChildren.numChildren ; i++)
			{ 
				popup=systemManager.rawChildren.getChildAt(i) ;
				//Alert.show(systemManager.popUpChildren.numChildren.toString(),TitleWindow(popup).title);
				if( (popup is TitleWindow) && TitleWindow(popup).title == _title )
					{
						PopUpManager.removePopUp(this);
						Alert.show(TitleWindow(popup).title+" is already open","Process Monitoring Details is not retrieved for "
						+resourceManager.getString('TeevraUI','title_process_id.ProcessMonitorDetailsPopup')
						+processAdminServiceEvent.getArgument(ProcessAdminServiceEvent.VIEW_PROCESS_ID));
						PopUpManager.centerPopUp(popup as TitleWindow);
					}			
			}			
			
			/* Set the title for Popup i.e Process Id: 1 | Process Name = Sample*/
			this.title=resourceManager.getString('TeevraUI','title.ProcessMonitorDetailsPopup')
			+resourceManager.getString('TeevraUI','title_process_id.ProcessMonitorDetailsPopup')
			+processAdminServiceEvent.getArgument(ProcessAdminServiceEvent.VIEW_PROCESS_ID)
			+resourceManager.getString('TeevraUI','title_process_name.ProcessMonitorDetailsPopup')
			+processAdminServiceEvent.getArgument(ProcessAdminServiceEvent.VIEW_PROCESS_NAME);			
			
			/* This Event will be used to redispatch the event to Refresh the Process Details Datagrid and process msg rate label*/  
			this.processAdminServiceEvent=processAdminServiceEvent;
			
			/* Create a Vertical Box that holds all other Panels */
			main= new VBox();
			main.percentWidth=100;
			
			/* Panel for Msg processing rate and Refresh Button */
			hbox=new HBox();
			hbox.percentWidth=100;
			hbox.width=800;
			_label=new Label();
			_label.text=calcProcessRate(dataprovider);
			_label.id=TeevraUIComponentsID.PROCESS_RATE_ID;
			_label.percentWidth=85;
						
			/* Temp hbox to place Refresh button on the right most side */
			var temp:HBox=new HBox();
			temp.percentWidth=50;
			var space:Spacer=new Spacer();
			space.width=200;	
			temp.addChild(space);
			
			/* Refresh Button */
			var refresh:Button=new Button();
			refresh.label=resourceManager.getString('TeevraUI','button.ProcessMonitorDetailsPopup.refresh');
			refresh.id=TeevraUIComponentsID.REFRESH_ID;
			refresh.addEventListener(MouseEvent.CLICK,popupRefresh);
			temp.addChild(refresh);
			
			/* Ruler to differntiate the HBox and Datagrid */
			var scale1:HRule =new HRule();
			scale1.percentWidth=100;			
			
			hbox.addChild(_label);
			hbox.addChild(temp);
						
			/* Datagrid of component details */ 
			table=new DataGrid();
			/* Unique id for Datagrid *for each process */
			table.id=TeevraUIComponentsID.DATAGRID_ID+processAdminServiceEvent.getArgument(ProcessAdminServiceEvent.VIEW_PROCESS_ID);
			/* List<ComponentDetailsVO> */ 
			table.dataProvider=dataprovider;
			table.maxHeight=800;
			table.percentWidth=100;
			table.percentHeight=100;
						
			/*  **Note** Setting the height of datagrid to header height + number of rows * row height 
			 * This is a hack around to Flex Builder 3 behaviour for datagird rowcount
			 * which places extra row at the end and a scrollbar.
			 * For further versions,  the datagrid should be displayed fine without this line */			
			table.height=table.headerHeight + ( table.rowHeight *(dataprovider.length + 1) );
			/* For further verisons remove the previous line and uncomment the following */
			//table.rowCount=dataprovider.length  ; 
			
			/* Trials */
			//table.variableRowHeight=true;						
			//table.height =table.measureHeightOfItems(0,table.dataProvider.length) + table.headerHeight + 2;
			//table.validateSize(true);
				
			/* Coluumns for the Daragrid */ 
			var comp:DataGridColumn =new DataGridColumn();
			comp.dataField="name";
			comp.headerText=resourceManager.getString('TeevraUI','column.ProcessMonitorDetailsPopup.componentName');
			//firstMsgTime.minWidth=150;

			var firstMsgTime:DataGridColumn =new DataGridColumn();
			firstMsgTime.dataField="firstMsgTime";
			firstMsgTime.headerText=resourceManager.getString('TeevraUI','column.ProcessMonitorDetailsPopup.firstMsgTime');
			firstMsgTime.minWidth=180;
			
			var lastMsgTime:DataGridColumn =new DataGridColumn();
			lastMsgTime.dataField="lastMsgTime";
			lastMsgTime.headerText=resourceManager.getString('TeevraUI','column.ProcessMonitorDetailsPopup.lastMsgTime');
			lastMsgTime.minWidth=180;			
			
			var processRate:DataGridColumn =new DataGridColumn();
			processRate.dataField="meanProcessingRate";
			processRate.headerText=resourceManager.getString('TeevraUI','column.ProcessMonitorDetailsPopup.meanPrcsRate');
			processRate.minWidth=130;			
			table.columns=new Array (comp,processRate,firstMsgTime,lastMsgTime);
											
			main.addChild(hbox);
			main.addChild(scale1);
							
			this.addChild(main);
			this.addChild(table);
		}
				
		/* Handler for window close Button */
		private function popupClose(event:Event):void
		{
	    	PopUpManager.removePopUp(this);
	    }
		
		/* Handler for Refresh Button */
		private function popupRefresh(event:Event):void
		{
			// Set IResponder of the event to this 
			processAdminServiceEvent.resultHandler=this;
			/* Redispatch the event as  clone method of ProcessAdminServiceEvent is overriden */
			processAdminServiceEvent.dispatch();			
	    }
	    	    		
		/**
		 * @param  Event Object 
		 *  Handles the result and refresh the datagrid and label  */
		public function result(event:Object):void
		{				
			/* dataprovider:ICollectionView is not required to be bindable as this popup is not MODAL 
			*  multiple popups can be open and as this popup is a IResponder , 
			*  local dataprovider can be refreshed in  this result
			*/
			table.dataProvider=event.result;
			table.dataProvider.refresh();
			
			/* To Refresh the Process Msg Rate Label  
			 Step 1 : Get the Hbox from this popup which contains the label
			 Step 2 : Get the Label from Hbox ,change the label text and inject into hbox  
			 Step 3 : Push the changed Hbox to the  popup */
			main=VBox(this.getChildAt(0));
			hbox=HBox(main.getChildAt(0));
			_label=Label(hbox.getChildAt(0));
				
			_label.text=calcProcessRate(event.result as ICollectionView);	
			hbox.addChildAt(_label,0);
			main.addChildAt(hbox,0);
			
			this.removeChildAt(0);
			this.addChildAt(main,0);
		}
		
		/**
		 * @param Event Object 
		 *  Handles fault */
		public function fault(info:Object):void
		{			
			AlertHelper.displayFault(info,"Process Monitoring Details cannot be retrieved for "
						+resourceManager.getString('TeevraUI','title_process_id.ProcessMonitorDetailsPopup')
						+processAdminServiceEvent.getArgument(ProcessAdminServiceEvent.VIEW_PROCESS_ID)
						//+resourceManager.getString('TeevraUI','title_process_name.ProcessMonitorDetailsPopup')
						//+processAdminServiceEvent.getArgument(ProcessAdminServiceEvent.VIEW_PROCESS_NAME)
						/* Alert width depends on title width so uncomment the above lines for further flex builde version and try */
						);
			PopUpManager.removePopUp(this);						
		}
		
		/**
		 * @param ICollectionView
		 * @return String
		 * 
		 *  Calculates mean processing rate for overall process  
		 *  Note : There is ideally no way to calculate overall process rate 
		 *  due to SEDA flows where each component works seperatly and in async
		 *  yet mean of  processing rate of individual components
		 *  will give indicative idea on overall process rate   
		 */
		private function calcProcessRate(components:ICollectionView):String
		{	
			var rate:int=0;
			var date:Date;
			var dateInMillis:Number=0;
			
			/* Iterate thru the Collection to calculate mean of processing rate of components*/			
			for (var i:int; i < components.length; i++)
			{
				component=ArrayCollection(components).getItemAt(i) as ComponentDetailsEO;
				rate+=component.meanProcessingRate;
				date=component.lastMsgTime;
				if ( date != null )
					dateInMillis+=component.lastMsgTime.getMilliseconds();				
			}
			/* Handle if no message is processed *
			 * If no message is processed then last message time would be null for all components*/
			if  (dateInMillis == 0) 
			{
						Alert.show("No message has been processed for the current run " ,"Process Monitoring Details cannot be retrieved for "
						+resourceManager.getString('TeevraUI','title_process_id.ProcessMonitorDetailsPopup')
						+processAdminServiceEvent.getArgument(ProcessAdminServiceEvent.VIEW_PROCESS_ID)
					//	+resourceManager.getString('TeevraUI','title_process_name.ProcessMonitorDetailsPopup')
					//	+processAdminServiceEvent.getArgument(ProcessAdminServiceEvent.VIEW_PROCESS_NAME)
					/* Alert width depends on title width so uncomment the above lines for further flex builde version and try */
					);
					
					/* Remove the popup */	
					PopUpManager.removePopUp(this);
					return 	null ;//resourceManager.getString('TeevraUI','label.ProcessMonitorDetailsPopup.processRate')+rate;
			}
			/* Set overall processing rate to zero if processing rate for all components is zero */
			else if (rate == 0)
			{
				return 	resourceManager.getString('TeevraUI','label.ProcessMonitorDetailsPopup.processRate')+rate;
			}
			/* return mean of processing rate of each component */
			return 	resourceManager.getString('TeevraUI','label.ProcessMonitorDetailsPopup.processRate')+ int (rate/components.length);			
		}			   		
	}
}