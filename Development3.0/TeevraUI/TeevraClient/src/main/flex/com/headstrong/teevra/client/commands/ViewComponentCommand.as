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
 * $Id: ViewComponentCommand.as
 * $Revision: 
 * $Author: PAakash
 * $DateTime: Dec 17, 2008  
 */
package com.headstrong.teevra.client.commands
{
	import com.adobe.cairngorm.commands.ICommand;
	import com.adobe.cairngorm.control.CairngormEvent;
	import com.headstrong.teevra.client.business.ComponentServiceDelegate;
	import com.headstrong.teevra.client.events.ViewComponentEvent;
	import com.headstrong.teevra.client.model.ComponentCache;
	import com.headstrong.teevra.client.model.ViewModelLocator;
	import com.headstrong.teevra.client.util.AlertHelper;
	
	import mx.collections.ICollectionView;
	import mx.collections.Sort;
	import mx.collections.SortField;
	import mx.rpc.IResponder;
	
	/**
	 * ViewComponentCommand calls the delegator ComponentServiceDelegate's getComponent
	 * for getting the components
	 * 
	 * @author PAakash
	 * 
	 */
	public class ViewComponentCommand implements ICommand, IResponder
	{
		private var isViewComponentEvent:Boolean;
		
		/**
		 * ViewComponentCommand constroctor
		 * 
		 */
		public function ViewComponentCommand()
		{
		}
		/**
		 * execute calls the delegator ComponentServiceDelegate's getComponent
		 * for getting the components
		 * 
		 * @param event
		 * 
		 */
		public function execute(event:CairngormEvent):void 
		{	
			isViewComponentEvent = (event as ViewComponentEvent).isViewComponentEvent;
			var delegate:ComponentServiceDelegate = new ComponentServiceDelegate( this );
			delegate.getComponents();
		}
		/**
		 * executed if delegator's getComponent successful in getting all the components  
		 * 
		 * @param data
		 * 
		 */
		public function result( data : Object ) : void
		{	
			var sortByComponentType:SortField;
			var sortComponentType:Sort;
			var viewModel : ViewModelLocator = ViewModelLocator.getInstance();
			
			var coll : ICollectionView = ICollectionView( data.result );
			if(isViewComponentEvent)
			{
				sortComponentType = new Sort();
				sortByComponentType = new SortField("compType",true,false);
				sortComponentType.fields = [sortByComponentType];
				coll.sort = sortComponentType;
				coll.refresh();
				
				viewModel.components=coll;
				viewModel.loadModule(ViewModelLocator.VIEW_COMPONENT_SWF);
				viewModel.screenName = "Administration > List of Component";
			}
			else
			{	
				ComponentCache.getInstance().loadComponents(coll);
			}
		}
	
		/**
		 * executed if delegator's getComponent failed in getting all the component 
		 * 
		 * @param info
		 * 
		 */
		public function fault( info : Object ) : void
		{
			AlertHelper.displayFault(info,"Components could not be retrieved");
		}

	}
}