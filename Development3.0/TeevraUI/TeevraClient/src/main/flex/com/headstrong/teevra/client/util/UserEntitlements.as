package com.headstrong.teevra.client.util
{
	import com.headstrong.teevra.client.model.ViewModelLocator;
	import com.headstrong.teevra.client.view.entity.UserVO;
	
	import mx.collections.ArrayCollection;
	import mx.controls.Alert;
	public class UserEntitlements
	{
			
		public var modelLocator: ViewModelLocator = ViewModelLocator.getInstance();
		public var modules:ArrayCollection=new ArrayCollection();
		public var userVO:UserVO;
					
		public var isAdmin:Boolean=true;
		public var viewProcess:Boolean=true;
		public var crudProcess:Boolean=true;
		public var publishProcess:Boolean=true;
		public var viewSchema:Boolean=true;
		public var crudSchema:Boolean=true;
		public var viewStateMachine:Boolean=true;
		public var crudStateMachine:Boolean=true;
		public var publishStateMachine:Boolean=true;
		public var viewDataSource:Boolean=true;
		public var crudDataSource:Boolean=true;
		public var viewRefData:Boolean=true;
		public var crudRefData:Boolean=true;
		
		
		public var viewPublishedProcess:Boolean=true;
		public var startStopServer:Boolean=true;
		public var assignUnassignServer:Boolean=true;
		public var scheduleProcess:Boolean=true;
		
		
		
		public var viewErrorLog:Boolean=true;
		public var viewErrorMessage:Boolean=true;
		
		public var viewComponents:Boolean=true;
		public var createComponent:Boolean=true;
		public var viewUsers:Boolean=true;
		public var crudUsers:Boolean=true;
		public var viewRoles:Boolean=true;
		public var crudRoles:Boolean=true;
		public var viewServers:Boolean=true;
		public var regUnregServervers:Boolean=true;
		
		public var pModelMenu:Boolean=true;
		public var pStatusMenu:Boolean=true;
		public var errorMonitorMenu:Boolean=true;
		public var adminMenu:Boolean=true;
		
		public function UserEntitlements()
		{
			userVO=modelLocator.loggedInUser;
			modules=userVO.activityIds;
			isAdmin=userVO.isAdmin;
			if(!isAdmin)
			{
				checkUserEntitlements();
				checkMainMenuItems();
			}
		}
		
		private function checkMainMenuItems():void{			
			
			if(!(viewProcess || crudProcess || publishProcess || 
			   viewSchema || crudSchema || viewStateMachine || crudStateMachine ||
			   publishStateMachine || viewDataSource || crudDataSource || viewRefData || 
			   crudRefData)){
			   		pModelMenu=false;
			   }			   
			  
			 if(!(viewPublishedProcess || startStopServer || assignUnassignServer ||  scheduleProcess)){
			   	
			   		pStatusMenu=false;
			 }
			 if(!(viewErrorLog || viewErrorMessage)){
			 	
			 		errorMonitorMenu=false;
			 }  
			 if(!(viewComponents || createComponent || viewUsers || crudUsers ||
			 	viewRoles || crudRoles || viewServers || regUnregServervers )){
			 		adminMenu=false;
			 }
								
		}
		
		private function checkUserEntitlements():void{			
			
			checkProcessModelling();
			checkProcessStatus();
			errorMonitoring();
			administration();	
								
		}
		
		private function checkProcessModelling():void{
			
			if(!(modules.contains(UIModules.VIEW_PROCESS) ||
				 modules.contains(UIModules.CRUD_PROCESS) ||
				 modules.contains(UIModules.PUBLISH_PROCESS))){
				
				viewProcess=false;
			}
			
			if(!modules.contains(UIModules.CRUD_PROCESS)){
				
				crudProcess=false;
			}
			if(!modules.contains(UIModules.PUBLISH_PROCESS)){
				
				publishProcess=false;
			}
			if(!(modules.contains(UIModules.VIEW_SCHEMA) ||
				 modules.contains(UIModules.CRUD_SCHEMA))){
				
				viewSchema=false;
			}
			
			if(!modules.contains(UIModules.CRUD_SCHEMA)){
				
				crudSchema=false;
			}
			
			if(!(modules.contains(UIModules.VIEW_STATEMACHINE) ||
				 modules.contains(UIModules.CRUD_STATEMACHINE) ||
				 modules.contains(UIModules.PUBLISH_STATEMACHINE))){
				
				viewStateMachine=false;
			}
			
			if(!modules.contains(UIModules.CRUD_STATEMACHINE)){
				
				crudStateMachine=false;
			}
			if(!modules.contains(UIModules.PUBLISH_STATEMACHINE)){
				
				publishStateMachine=false;
			}
			
			if(!(modules.contains(UIModules.VIEW_DATASOURCE) ||
				 modules.contains(UIModules.CRUD_DATASOURCE))){
				
				viewDataSource=false;
			}
			
			if(!modules.contains(UIModules.CRUD_DATASOURCE)){
				
				crudDataSource=false;
			}
			if(!(modules.contains(UIModules.VIEW_REFDATA) ||
				 modules.contains(UIModules.CRUD_REFDATA))){
				
				viewRefData=false;
			}
			
			if(!modules.contains(UIModules.CRUD_REFDATA)){
				
				crudRefData=false;
			}
			
		}
		
		private function checkProcessStatus():void{
			
			if(!(modules.contains(UIModules.VIEW_PUBLISHED_PROCESS) ||
				 modules.contains(UIModules.START_STOP_SERVER) ||
				 modules.contains(UIModules.ASSIGN_UNASSIGN_SERVER) ||				
				 modules.contains(UIModules.SCHEDULE_PROCESS))){
				
				 viewPublishedProcess=false;
			}
			if(!modules.contains(UIModules.START_STOP_SERVER)){
				
				 startStopServer=false;
			}
			if(!modules.contains(UIModules.SCHEDULE_PROCESS)){
				
				 scheduleProcess=false;
			}
			if(!(modules.contains(UIModules.ASSIGN_UNASSIGN_SERVER))){
				 	
				 	assignUnassignServer=false;				 	
			}
			
			
		}
		
		private function errorMonitoring():void	{
			
			if(! (modules.contains(UIModules.VIEW_ERROR_LOG) || modules.contains(UIModules.VIEW_ERROR_MESSAGE))){
				
				viewErrorLog=false;
			}
			if(!modules.contains(UIModules.VIEW_ERROR_MESSAGE)){
				
				viewErrorMessage=false;
			}
		}
		
		private function administration():void	{
			
			if(!(modules.contains(UIModules.VIEW_COMPONENT) || 
				 modules.contains(UIModules.CREATE_COMPONENT))){  				 
				viewComponents=false;
					
			}
			if(!modules.contains(UIModules.CREATE_COMPONENT)){
				
				createComponent=false;
			}
			
			if(!(modules.contains(UIModules.VIEW_USERS) || 
				 modules.contains(UIModules.CRUD_USERS))){  				 
				
				viewUsers=false;
			}
			if(!modules.contains(UIModules.CRUD_USERS)){
				
				crudUsers=false;
			}
			if(!(modules.contains(UIModules.VIEW_ROLES) || 
				 modules.contains(UIModules.CRUD_ROLES))){  				 
				
				viewRoles=false;
			}
			if(!modules.contains(UIModules.CRUD_ROLES)){
				
				crudRoles=false;
			}
			if(!(modules.contains(UIModules.VIEW_SERVERS) || 
				 modules.contains(UIModules.REG_UNREG_SERVERS))){  				 
				
				viewServers=false;
			}
			if(!modules.contains(UIModules.REG_UNREG_SERVERS)){
				
				regUnregServervers=false;
			}
			
			
		}

	}
}