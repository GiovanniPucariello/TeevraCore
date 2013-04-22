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
 * $Id: ViewUserCommand.as
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Apr 27, 2008 
 */
package com.headstrong.teevra.client.commands
/**
 * 
 */
{
	import com.adobe.cairngorm.commands.ICommand;
	import com.adobe.cairngorm.control.CairngormEvent;
	import com.headstrong.teevra.client.business.UserAdminServiceDelegate;
	import com.headstrong.teevra.client.model.ViewModelLocator;
	import com.headstrong.teevra.client.util.AlertHelper;
	
	import mx.collections.ICollectionView;
	import mx.collections.Sort;
	import mx.collections.SortField;
	import mx.controls.Alert;
	import mx.rpc.IResponder;

	/**
	 * ViewUserCommand calls the UserAdminServiceDelegate's getUsers for retrieving all the users 
	 * registered in the system and displaying them on UI after sorting the values on user name
	 * 
	 * @author ViswanathP
	 * 
	 */
	public class ViewUserCommand implements ICommand, IResponder
	{
		/**
	  	 * ViewUserCommand constructor
	  	 * 
	  	 */
		public function ViewUserCommand()
		{
		}
		/**
		 * execute calls the delegate's getUsers to retrieve the users
		 * 
		 * @param event
		 * 
		 */
		public function execute(event:CairngormEvent):void
		{
			var delegate:UserAdminServiceDelegate = new UserAdminServiceDelegate( this );
			delegate.getUsers();
		}
		
		/**
		 * executes if delegate's getUsers successful in retrieving the users and
		 * sorts the data obtained by user name beforing storing it in ViewModelLocator
		 * 
		 * @param data
		 * 
		 */
		public function result(data:Object):void
		{

			var users : ICollectionView = ICollectionView( data.result );
										
			var sortByUserName:SortField;
            var sortUser:Sort;
			sortUser = new Sort();
			sortByUserName = new SortField("userName",true,false,null);
			sortUser.fields=[sortByUserName];
			users.sort=sortUser;
			users.refresh();
			
			var viewModel : ViewModelLocator = ViewModelLocator.getInstance();
			viewModel.users= users;
			viewModel.loadModule(ViewModelLocator.VIEW_USER_SWF);
			viewModel.screenName = "Administration > User Admin";

		}
		
		/**
		 * executes if delegate's getUsers is failed in retrieving the users
		 * 
		 * @param info
		 * 
		 */
		public function fault(info:Object):void
		{
			AlertHelper.displayFault(info,"Users could not be retrieved");
		}
		
	}
}