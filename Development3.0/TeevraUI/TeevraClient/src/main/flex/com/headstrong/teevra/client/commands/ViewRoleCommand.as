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
 * $Id: ViewRoleCommand.as
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Apr 28, 2008 
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
	import mx.rpc.IResponder;

	/**
	 * ViewRoleCommand calls the UserAdminServiceDelegate's getRoles for retrieving all the roles 
	 * defined in the system and displaying them on UI after sorting the values on role name
	 * 
	 * @author ViswanathP
	 * 
	 */
	public class ViewRoleCommand implements ICommand, IResponder
	{
		private var isViewRolesFlag:Boolean;
		/**
	  	 * ViewRoleCommand constructor
	  	 * 
	  	 */
		public function ViewRoleCommand()
		{
		}
		
		/**
		 * execute calls the delegate's getRoles to retrieve the roles
		 * 
		 * @param event
		 * 
		 */
		public function execute(event:CairngormEvent):void
		{
			var delegate:UserAdminServiceDelegate = new UserAdminServiceDelegate( this );
			delegate.getRoles();
		}
		
		/**
		 * executes if delegate's getRoles successful in retrieving the roles and
		 * sorts the data obtained by role name beforing storing it in ViewModelLocator
		 * 
		 * @param data
		 * 
		 */
		public function result(data:Object):void
		{
			var roles : ICollectionView = ICollectionView( data.result );

			var sortByRoleName:SortField;
            var sortRole:Sort;
			
			sortRole = new Sort();
			sortByRoleName = new SortField("roleName",true,false,null);
			sortRole.fields=[sortByRoleName];
			roles.sort=sortRole;
			roles.refresh();
			
			var viewModel : ViewModelLocator = ViewModelLocator.getInstance();
			viewModel.roles= roles;
			viewModel.loadModule(ViewModelLocator.VIEW_ROLE_SWF);
			viewModel.screenName = "Administration > Roles";	

		}
		
		/**
		 * executes if delegate's getRoles is failed in retrieving the roles
		 * 
		 * @param info
		 * 
		 */
		public function fault(info:Object):void
		{
			AlertHelper.displayFault(info,"Roles could not be retrieved");
		}
		
	}
}