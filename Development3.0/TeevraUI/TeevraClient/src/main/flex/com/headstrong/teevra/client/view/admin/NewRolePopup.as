package com.headstrong.teevra.client.view.admin
{
	import com.headstrong.teevra.client.model.ViewModelLocator;
	import com.headstrong.teevra.client.view.entity.ActivityVO;
	import com.headstrong.teevra.client.view.entity.RoleVO;
	
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
	import mx.controls.TextArea;
	import mx.controls.TextInput;
	import mx.events.CloseEvent;
	import mx.managers.PopUpManager;
	
	public class NewRolePopup extends TitleWindow
	{
		[Bindable]		
		private var modelLocator:ViewModelLocator = ViewModelLocator.getInstance();
		
		private var closeEventHandler:Function;
		private var saveEventHandler:Function;
		private var role:RoleVO;
		private var isNewRole:Boolean;
	
		private var roleNameField:TextInput;
		private var roleDescField:TextArea;
		private var roleStatusField:ComboBox;
		private var activitiesField:HBox;
		private var srcList:List;
		private var buttonsContainer:VBox;
		private var fwdButton:Button;
		private var bkwdButton:Button;
		private var destList:List;
		
		private const ROLE_NAME:String="label.NewRolePopup.roleNameLabel";
		private const ROLE_DESC:String="label.NewRolePopup.roleDescLabel";
		private const ROLE_STATUS:String="label.NewRolePopup.roleStatusLabel";
		private const ROLE_ACTIVITIES:String="label.NewRolePopup.roleActivitiesLabel";
		
		private var sortActivities:Sort  = new Sort();
        private var sortByActivityName:SortField =new SortField("activityName",true,false,null);;
        

		
		public function NewRolePopup()
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
		
		public function create(closeHandler:Function,saveEventHandler:Function,role:RoleVO,isNewRole:Boolean):void
		{	
			this.closeEventHandler = closeHandler;
			this.saveEventHandler = saveEventHandler;
			this.role = role;
			this.isNewRole = isNewRole;
			
			if(isNewRole)
			{
				this.title="New Role";
				addRoleFields(isNewRole);
			}
			else
			{
				this.title="Edit Role";
				addRoleFields(isNewRole);
				setRoleDetails();
			}						
			//create control bar
			createControlBar();

		}
		
		/**
		 * Creates the fields for role details
		 */
		private function addRoleFields(isNewRole:Boolean):void
		{
			var configForm:Form = new Form();
			
			//Text input item for role name
			var roleNameItem:FormItem = new FormItem();
			roleNameItem.label = setFieldName(ROLE_NAME);
			roleNameField = new TextInput();
			roleNameField.width=300;
			roleNameField.maxChars=50;
			if(!isNewRole)
			{
				roleNameField.editable = false;
			}
			roleNameItem.addChild(roleNameField);
			configForm.addChild(roleNameItem);
			
			//Text Area item for role desc
			var roleDescItem:FormItem = new FormItem();
			roleDescItem.label = setFieldName(ROLE_DESC);
			roleDescField = new TextArea();
			roleDescField.width=300;
			roleDescField.maxChars=200;
			roleDescItem.addChild(roleDescField);
			configForm.addChild(roleDescItem);
			
			//Combo box for status
			var statusItem:FormItem = new FormItem();
			statusItem.label = setFieldName(ROLE_STATUS);
			roleStatusField = new ComboBox();
			roleStatusField.width=300;
			roleStatusField.dataProvider = ["ACTIVE","INACTIVE"];
			roleStatusField.selectedIndex = -1;
			statusItem.addChild(roleStatusField);
			configForm.addChild(statusItem);
			
			//VBox(srcList, Button container, destList) for activities
			var activitiesItem:FormItem = new FormItem();
			activitiesItem.label = setFieldName(ROLE_ACTIVITIES);
			activitiesField = new HBox();
			activitiesField.width=300;
			
			//add source list of roles 
			srcList = new List();
			srcList.dataProvider = setSrcDataProvider();
			srcList.dataProvider.sort;
			srcList.allowMultipleSelection=true;
			srcList.labelField = "activityName";
			

			srcList.width=120;
			srcList.horizontalScrollPolicy = "ON";
			activitiesField.addChild(srcList);
			
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
			fwdButton.addEventListener(MouseEvent.CLICK,moveActivityFromSrc);
			buttonsContainer.addChild(fwdButton);
			//add spacer
			var spacer2:Spacer = new Spacer();
			spacer2.height = 25;
			buttonsContainer.addChild(spacer2);
			//backword button
			bkwdButton = new Button();
			bkwdButton.width = 40;
			bkwdButton.label = "<";
			bkwdButton.addEventListener(MouseEvent.CLICK,moveActivityFromDest);
			buttonsContainer.addChild(bkwdButton);
			activitiesField.addChild(buttonsContainer);
			
			//add destination list of activities 
			destList = new List();
			destList.allowMultipleSelection=true;
			destList.dataProvider = setDestDataProvider();
			
			destList.labelField = "activityName";
			destList.width=120;
			destList.horizontalScrollPolicy = "ON";
			activitiesField.addChild(destList);
			
			activitiesItem.addChild(activitiesField);
			configForm.addChild(activitiesItem);
			
			this.addChild(configForm);
		}
		/**
		 * Moves the selected role from srcList to destList
		 */
		private function moveActivityFromSrc(event:MouseEvent):void
		{								
			var selectedActivities:Array=srcList.selectedItems;
			if(selectedActivities != null){
				for(var i:int=0; i<selectedActivities.length; i++){
					destList.dataProvider.addItem(selectedActivities[i]);				
					srcList.dataProvider.removeItemAt(srcList.dataProvider.getItemIndex(selectedActivities[i]));
					
				}
			}
			else{
				Alert.show("Select a Activity to assign");
			}
			
		}
		/**
		 * Moves the selected role from srcList to destList
		 */
		private function moveActivityFromDest(event:MouseEvent):void
		{	
			var selectedActivities:Array= destList.selectedItems;
			if(selectedActivities != null){	
				for(var i:int=0; i<selectedActivities.length; i++){
					srcList.dataProvider.addItem(selectedActivities[i]);
					destList.dataProvider.removeItemAt(destList.dataProvider.getItemIndex(selectedActivities[i]));
				}
			}
			else{
				Alert.show("Select a Activity From Selected Activitys");
			}
		}
		/**
		 * Sets the source list data
		 */
		private function setSrcDataProvider():ArrayCollection{
			var srcActivityList:ArrayCollection = ArrayCollection(modelLocator.activities);
			//If configuring new role, set source data provider with all the available activities, 
			//else remove already asigned activities from the available activities 
			if(!isNewRole){
				var roleActivities:ArrayCollection = role.activities;
					if((roleActivities != null)&& (roleActivities.length!=0)){
						for(var i:int=0; i<roleActivities.length; i++){						
							var roleActivityName:String = ActivityVO(roleActivities[i]).activityName;
							for(var j:int=0; j<srcActivityList.length; j++){
								var srcActivityeName:String = ActivityVO(srcActivityList[j]).activityName;
								if(roleActivityName == srcActivityeName){
									var itemIndex:int = srcActivityList.getItemIndex(ActivityVO(srcActivityList[j]));
									srcActivityList.removeItemAt(itemIndex);
								}															
							}
						}
					}
				}
			sortActivities.fields=[sortByActivityName];
			srcActivityList.sort= sortActivities;
            srcActivityList.refresh();
			return srcActivityList;
		}
		/**
		 * Sets the destination list data
		 */
		private function setDestDataProvider():ArrayCollection{
			var destActivityList:ArrayCollection= new ArrayCollection();
			if(!isNewRole){			
				var roleActivities:ArrayCollection = role.activities;
				if((roleActivities != null)&& (roleActivities.length!=0)){
					for(var i:int=0; i<roleActivities.length; i++){					
						destActivityList.addItem(roleActivities[i]);
					}
				}
			}
			sortActivities.fields=[sortByActivityName];
			destActivityList.sort= sortActivities;
            destActivityList.refresh();
			return destActivityList;
		
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
			saveBtn.addEventListener(MouseEvent.CLICK,saveRole);
			controlBar.addChild(saveBtn);		
			
			var closeBtn:Button = new Button();
			closeBtn.label = "Close";
			closeBtn.addEventListener(MouseEvent.CLICK, closeEventHandler);
			controlBar.addChild(closeBtn);
			
			this.addChild(controlBar);
		}
		
		/**
		 * Gets the details provided for new role
		 */
		private function saveRole(event:MouseEvent):void
		{	
			//set the entered role details to RoleVO
			role.roleName = roleNameField.text;
			role.roleDesc = roleDescField.text;
			role.roleStatus = roleStatusField.text;
			role.activities = ArrayCollection(destList.dataProvider);
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
		 * Sets the details of the saved configuration for editing
		 */
		private function setRoleDetails():void
		{	
			roleNameField.text = role.roleName;
			roleDescField.text = role.roleDesc;
			roleStatusField.text = role.roleStatus;
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
			
			if(resourceManager.getString('TeevraUI', ROLE_NAME+'.mandatory')=='Y' && roleNameField.text=="")
			{
				return false;
			}
			if(resourceManager.getString('TeevraUI', ROLE_DESC+'.mandatory')=='Y' && roleDescField.text=="")
			{
				return false;
			}
			if(resourceManager.getString('TeevraUI', ROLE_STATUS+'.mandatory')=='Y' && roleStatusField.text=="")
			{
				return false;
			}					
			return true;
		}

	}
}