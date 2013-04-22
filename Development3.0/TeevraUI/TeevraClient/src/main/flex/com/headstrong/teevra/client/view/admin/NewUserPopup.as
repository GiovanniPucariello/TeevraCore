package com.headstrong.teevra.client.view.admin
{
	import com.headstrong.teevra.client.model.ViewModelLocator;
	import com.headstrong.teevra.client.view.entity.RoleVO;
	import com.headstrong.teevra.client.view.entity.UserVO;
	
	import flash.events.Event;
	import flash.events.MouseEvent;
	
	import mx.collections.ArrayCollection;
	import mx.collections.Sort;
	import mx.collections.SortField;
	import mx.containers.ControlBar;
	import mx.containers.Form;
	import mx.containers.FormItem;
	import mx.containers.HBox;
	import mx.containers.TitleWindow;
	import mx.containers.VBox;
	import mx.controls.Alert;
	import mx.controls.Button;
	import mx.controls.ComboBox;
	import mx.controls.List;
	import mx.controls.Spacer;
	import mx.controls.TextInput;
	import mx.events.CloseEvent;
	import mx.managers.PopUpManager;
	import mx.validators.RegExpValidator;
	
	public class NewUserPopup extends TitleWindow
	{
		[Bindable]		
		private var modelLocator:ViewModelLocator = ViewModelLocator.getInstance();
		
		private var closeEventHandler:Function;
		private var saveEventHandler:Function;
		private var user:UserVO;
		private var isNewUser:Boolean;
	
		private var userNameField:TextInput;
		private var firstNameField:TextInput;
		private var lastNameField:TextInput;
		private var passwordField:TextInput;
		private var emailField:TextInput;
		private var statusField:ComboBox;
		private var rolesField:HBox;
		private var srcList:List;
		private var buttonsContainer:VBox;
		private var fwdButton:Button;
		private var bkwdButton:Button;
		private var destList:List;
		
		private const USER_NAME:String="label.NewUserPopup.userNameLabel";
		private const FIRST_NAME:String="label.NewUserPopup.firstNameLabel";
		private const LAST_NAME:String="label.NewUserPopup.lastNameLabel";
		private const PASSWORD:String="label.NewUserPopup.passwordLabel";
		private const EMAIL:String="label.NewUserPopup.emailLabel";
		private const STATUS:String="label.NewUserPopup.statusLabel";
		private const ROLES:String ="label.NewUserPopup.rolesLabel";
		
		private var sortRoles:Sort  = new Sort();
        private var sortByRoleName:SortField =new SortField("roleName",true,false,null);;
		
		public function NewUserPopup()
		{
			super();
			this.layout = "vertical";
			this.showCloseButton=true;
			this.addEventListener(CloseEvent.CLOSE,popupClose);
		}
		
		private function popupClose(event:Event):void
		{
	    	PopUpManager.removePopUp(this);
	    }
		
		public function create(closeHandler:Function,saveEventHandler:Function,user:UserVO,isNewUser:Boolean):void
		{	
			this.closeEventHandler = closeHandler;
			this.saveEventHandler = saveEventHandler;
			this.user = user;
			this.isNewUser = isNewUser;
			
			if(isNewUser)
			{
				this.title="New User";
				addUserFields(isNewUser);
			}
			else
			{
				this.title="Edit User";
				addUserFields(isNewUser);
				setUserDetails();
			}						
			//create control bar
			createControlBar();

		}
		
		/**
		 * Creates the fields for user details
		 */
		private function addUserFields(isNewUser:Boolean):void
		{
			var configForm:Form = new Form();
			
			//Text input item for user name
			var userNameItem:FormItem = new FormItem();
			userNameItem.label = setFieldName(USER_NAME);
			userNameField = new TextInput();
			userNameField.width=300;
			userNameField.maxChars=20;
			if(!isNewUser)
			{
				userNameField.editable = false;
			}
			userNameItem.addChild(userNameField);
			configForm.addChild(userNameItem);
			
			
			//Text input item for user first name
			var firstNameItem:FormItem = new FormItem();
			firstNameItem.label = setFieldName(FIRST_NAME);
			firstNameField = new TextInput();
			firstNameField.width=300;
			firstNameField.maxChars=50;
			firstNameItem.addChild(firstNameField);
			configForm.addChild(firstNameItem);
			
			//Text input item for user last name
			var lastNameItem:FormItem = new FormItem();
			lastNameItem.label = setFieldName(LAST_NAME);
			lastNameField = new TextInput();
			lastNameField.width=300;
			lastNameField.maxChars=50;			
			lastNameItem.addChild(lastNameField);
			configForm.addChild(lastNameItem);
			
			//Text input item for password
			var passwordeItem:FormItem = new FormItem();
			passwordeItem.label = setFieldName(PASSWORD);
			passwordField = new TextInput();
			passwordField.width=300;
			passwordField.maxChars=20;
			passwordField.displayAsPassword = true;
			passwordeItem.addChild(passwordField);
			if(modelLocator.authType != 'LDAP')
			{
				configForm.addChild(passwordeItem);	
			}
			
			//Text input item for email
			var emailItem:FormItem = new FormItem();
			emailItem.label = setFieldName(EMAIL);
			emailField = new TextInput();
			emailField.width=300;
			emailField.maxChars=50;
			emailItem.addChild(emailField);
			configForm.addChild(emailItem);
			
			//Combo box for status
			var statusItem:FormItem = new FormItem();
			statusItem.label = setFieldName(STATUS);
			statusField = new ComboBox();
			statusField.width=300;
			statusField.dataProvider = ["ACTIVE","INACTIVE"];
			statusField.selectedIndex=-1;
			statusItem.addChild(statusField);
			configForm.addChild(statusItem);
			
			//VBox(srcList, Button container, destList) for roles
			var rolesItem:FormItem = new FormItem();
			rolesItem.label = setFieldName(ROLES);
			rolesField = new HBox();
			rolesField.width=300;
			
			//add source list of roles 
			srcList = new List();	
			srcList.allowMultipleSelection=true;	    
			srcList.dataProvider = setSrcDataProvider();			
			srcList.labelField = "roleName";
			srcList.width=120;
			rolesField.addChild(srcList);
			
			//add VBox as container for forward, backward buttons
			buttonsContainer = new VBox();
			buttonsContainer.width = 40;
			//add spacer
			var spacer1:Spacer = new Spacer();
			spacer1.height = 25;
			buttonsContainer.addChild(spacer1);
			//forward button
			fwdButton = new Button();
			fwdButton.width = 40;
			fwdButton.label = ">";
			fwdButton.addEventListener(MouseEvent.CLICK,moveRoleFromSrc);
			buttonsContainer.addChild(fwdButton);
			//add spacer
			var spacer2:Spacer = new Spacer();
			spacer2.height = 25;
			buttonsContainer.addChild(spacer2);
			//backword button
			bkwdButton = new Button();
			bkwdButton.width = 40;
			bkwdButton.label = "<";
			bkwdButton.addEventListener(MouseEvent.CLICK,moveRoleFromDest);
			buttonsContainer.addChild(bkwdButton);
			rolesField.addChild(buttonsContainer);
			
			//add destination list of roles 
			destList = new List();
			destList.allowMultipleSelection=true;
			destList.dataProvider = setDestDataProvider();
			destList.labelField = "roleName";
			destList.width=120;
			rolesField.addChild(destList);
			
			rolesItem.addChild(rolesField);
			configForm.addChild(rolesItem);
			
			this.addChild(configForm);
		}
		
		/**
		 * Moves the selected role from srcList to destList
		 */
		private function moveRoleFromSrc(event:MouseEvent):void
		{	
			//var selectedRole:RoleVO= RoleVO(srcList.selectedItem);
			var selectedRoles:Array= srcList.selectedItems;
			if(selectedRoles != null){
				for(var i:int=0; i<selectedRoles.length; i++){	
					destList.dataProvider.addItem(selectedRoles[i]);
					srcList.dataProvider.removeItemAt(srcList.dataProvider.getItemIndex(selectedRoles[i]));
				}
			}
			else{
				Alert.show("Select a Role to assign");
			}
			
		}
		/**
		 * Moves the selected role from srcList to destList
		 */
		private function moveRoleFromDest(event:MouseEvent):void
		{	
			var selectedRoles:Array= destList.selectedItems;
			if(selectedRoles != null){	
				for(var i:int=0; i<selectedRoles.length; i++){
					srcList.dataProvider.addItem(selectedRoles[i]);
					destList.dataProvider.removeItemAt(destList.dataProvider.getItemIndex(selectedRoles[i]));
				}
			}
			else{
				Alert.show("Select a Role From Selected Roles");
			}
		}
		/**
		 * Sets the source list data
		 */
		private function setSrcDataProvider():ArrayCollection{
			var srcRolesList:ArrayCollection = ArrayCollection(modelLocator.roles);
			//If configuring new user, set source data provider with all the available roles, 
			//else remove already asigned roles from the available roles 
			if(!isNewUser){
				var userRoles:ArrayCollection = user.roles;
					if((userRoles != null)&& (userRoles.length!=0)){
						for(var i:int=0; i<userRoles.length; i++){						
							var userRoleName:String = RoleVO(userRoles[i]).roleName;
							for(var j:int=0; j<srcRolesList.length; j++){
								var srcRoleName:String = RoleVO(srcRolesList[j]).roleName;
								if(userRoleName == srcRoleName){
									var itemIndex:int = srcRolesList.getItemIndex(RoleVO(srcRolesList[j]));
									srcRolesList.removeItemAt(itemIndex);
								}															
							}
						}
					}			
			}
			sortRoles.fields=[sortByRoleName];
			srcRolesList.sort= sortRoles;
            srcRolesList.refresh();
			return srcRolesList;
		}
		/**
		 * Sets the destination list data
		 */
		private function setDestDataProvider():ArrayCollection{
			var destRolesList:ArrayCollection=new ArrayCollection();
			if(!isNewUser){
				//destRolesList = user.roles;
				var userRoles:ArrayCollection = user.roles;
					if((userRoles != null)&& (userRoles.length!=0)){
						for(var i:int=0; i<userRoles.length; i++){	
							destRolesList.addItem(userRoles[i]);
						}
					}									
			}
			sortRoles.fields=[sortByRoleName];
			destRolesList.sort= sortRoles;
            destRolesList.refresh();
			return destRolesList;
		
		}
		
		/**
		 * creats control bar with save and close buttons
		 */
		private function createControlBar():void
		{
			var controlBar:ControlBar = new ControlBar();
			controlBar.percentHeight = 10;
			controlBar.percentWidth = 90;
			
			var saveBtn:Button = new Button();
			saveBtn.label = "Save";
			saveBtn.addEventListener(MouseEvent.CLICK,saveUser);
			controlBar.addChild(saveBtn);		
			
			var closeBtn:Button = new Button();
			closeBtn.label = "Close";
			closeBtn.addEventListener(MouseEvent.CLICK, closeEventHandler);
			controlBar.addChild(closeBtn);
			
			this.addChild(controlBar);
		}
		
		/**
		 * Gets the details provided for new user
		 */
		private function saveUser(event:MouseEvent):void
		{	
			//set the entered user details to UserVO
			user.userName = userNameField.text;
			user.userFirstName = firstNameField.text;
			user.userLastName = lastNameField.text;
			if(modelLocator.authType != 'LDAP')
			{
				user.password = passwordField.text;
			}
			user.emailId = emailField.text;
			user.userStatus = statusField.text;
			user.roles = ArrayCollection(destList.dataProvider);
			// call parent 
			if(validateFields())
			{
				saveEventHandler.call();
			}
			else
			{
				Alert.show("Please enter all mandatory fields");
			}
		}
		
		/**
		 * Sets the details of the saved user for editing
		 */
		private function setUserDetails():void
		{	
			userNameField.text = user.userName;
			firstNameField.text = user.userFirstName;
			lastNameField.text = user.userLastName;
			if(modelLocator.authType != 'LDAP')
			{
				passwordField.text = user.password;
			}
			emailField.text = user.emailId;
			statusField.text = user.userStatus;
		}
		/**
		 * Sets the field names on th UI
		 */	
		private function setFieldName(field:String):String
		{
			var fieldName:String = resourceManager.getString('TeevraUI', field+'.name');
			if(resourceManager.getString('TeevraUI', field+'.mandatory')=='Y')
			{
				fieldName+="*";
			}
			return fieldName;
		}
		/**
		 * Validates the mandatory fields
		 */
		private function validateFields():Boolean
		{	

			if(resourceManager.getString('TeevraUI', USER_NAME+'.mandatory')=='Y' && userNameField.text=="")
			{
				return false;
			}
			if(resourceManager.getString('TeevraUI', FIRST_NAME+'.mandatory')=='Y' && firstNameField.text=="")
			{
				return false;
			}
			if(resourceManager.getString('TeevraUI', LAST_NAME+'.mandatory')=='Y' && lastNameField.text=="")
			{
				return false;
			}
			if((modelLocator.authType != 'LDAP') && (resourceManager.getString('TeevraUI', PASSWORD+'.mandatory')=='Y' && passwordField.text==""))
			{
				return false;
			}
			if(resourceManager.getString('TeevraUI', EMAIL+'.mandatory')=='Y' && emailField.text=="")
			{
				return false;
			}
			if(resourceManager.getString('TeevraUI', STATUS+'.mandatory')=='Y' && statusField.text=="")
			{
				return false;
			}						
			return true;
		}

	}
}