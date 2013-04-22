package com.headstrong.teevra.components.cStructParserFormatter
{
	import com.headstrong.teevra.components.common.GridConfigField;
	import com.headstrong.teevra.components.common.GridConfigForm;
	import com.headstrong.teevra.components.common.TeevraUIComponentsID;
	
	import flash.events.Event;
	
	import mx.collections.ArrayCollection;
	import mx.containers.HBox;
	import mx.containers.VBox;
	import mx.controls.Alert;
	import mx.controls.Button;
	import mx.controls.CheckBox;
	import mx.controls.DataGrid;
	import mx.controls.Label;
	import mx.controls.Spacer;
	import mx.controls.TextInput;
	import mx.controls.dataGridClasses.DataGridColumn;
	import mx.events.FlexEvent;
	import mx.events.ListEvent;

	/**
	 * UI for viewing the list of structures created and adding additional structure into the configuration.
	 * It contains a grid displaying all the structure available for this component instance on top.
	 * Below the data grid, present is the form displaying the details of the selected struct '
	 * or to create or remove a struct. 
	 */
	public class StructureDefinitionUI extends VBox
	{
		/** Configuration key for the structure definition. */ 
		private const CONFIG_KEY_STRUCT_CONFIG:String = "structConfig";

		//indexes of columns in the UI, tab: Structure Definition for defining the members in structure
		private const FIELD_SEQ_INDEX:int=0;
		private const FIELD_NAME_INDEX:int=1;
		private const FIELD_DATATYPE_INDEX:int=2;
		private const FIELD_LENGTH_INDEX:int=3;

		//Specifications for individual fields / columns shown in the UI, tab:Structure Definition
		private const FLD_SEQ_LBL_KEY:String="configField.CStructParser.structDefinition.sequenceNumber";
		private const FLD_SEQ_NAME:String="sequenceNumber";
		private const FLD_SEQ_TYPE:String=GridConfigField.SEQUENCE_NUMBER_FIELD;
		private const FLD_SEQ_WIDTH:int=50;

		private const FLD_NAME_LBL_KEY:String="configField.CStructParser.structDefinition.fieldName";
		private const FLD_NAME:String="fieldName";
		private const FLD_NAME_TYPE:String=GridConfigField.TEXT_FIELD;
		private const FLD_NAME_WIDTH:int=150;

		private const FLD_DATATYPE_LBL_KEY:String="configField.CStructParser.structDefinition.dataType";
		private const FLD_DATATYPE_NAME:String="dataType";
		private const FLD_DATATYPE_TYPE:String=GridConfigField.LIST_FIELD;
		private const FLD_DATATYPE_WIDTH:int=200;

		private const FLD_LENGTH_LBL_KEY:String="configField.CStructParser.structDefinition.fieldLength";
		private const FLD_LENGTH_NAME:String="fieldLength";
		private const FLD_LENGTH_TYPE:String=GridConfigField.TEXT_FIELD;
		private const FLD_LENGTH_WIDTH:int=250;

		private var structHolder:StructHolder;
		private var nonLeafStructs:ArrayCollection = new ArrayCollection();
		
		//UI controls embedded on this container
		private var structsGrid:DataGrid;
		private var structNameInput:TextInput = new TextInput();
		private var unionCheck:CheckBox = new CheckBox();
		private var rootCheck:CheckBox = new CheckBox();
		private var configForm:GridConfigForm;
		
		/**
		 * Default constructor. Initializes struct holder */
		public function StructureDefinitionUI(s:StructHolder)
		{
			super();
			this.label = "Structure Definition";
			this.structHolder = s;
			unionCheck.label = "Is Union";
			rootCheck.label = "Is Root";
		}

		/**
		 * Creates the controls on the tab */
		public function initUI():void {
			//create the data grid containing list of non-primitive structures
			structsGrid = new DataGrid();
			var detailsBox:HBox = new HBox();
			var structNameLabel:Label = new Label();

			var columns:Array = new Array(3);
			columns[0] = createGridColumn("Struct Name","structName");
			columns[1] = createGridColumn("Is Union","union");
			columns[2] = createGridColumn("Is Root","root");
			// (Redmine Feature # 589) ID of flex components is set so that it can be uniquely identified by Ranorex
			structsGrid.id=TeevraUIComponentsID.STRUCTURE_GRID_ID;
			structsGrid.columns = columns;
			structsGrid.addEventListener(ListEvent.ITEM_CLICK, gridSelectionHandler);
			structsGrid.dataProvider = nonLeafStructs;
			this.addChild(structsGrid);
			
			//buttons to add, update, remove struct
			var controlsBox:HBox = new HBox();
			var addNewBtn:Button = new Button();
			// (Redmine Feature # 589) ID of flex components is set so that it can be uniquely identified by Ranorex
			addNewBtn.id=TeevraUIComponentsID.ADD_NEW_ID;
			addNewBtn.label = "Add New";
			addNewBtn.addEventListener(FlexEvent.BUTTON_DOWN, addNewEventHandler)
			controlsBox.addChild(addNewBtn);
			
			var updateBtn:Button = new Button();
			// (Redmine Feature # 589) ID of flex components is set so that it can be uniquely identified by Ranorex
			updateBtn.id=TeevraUIComponentsID.UPDATE_ID;
			updateBtn.label = "Update";
			updateBtn.addEventListener(FlexEvent.BUTTON_DOWN, updateEventHandler)
			controlsBox.addChild(updateBtn);
			
			var deleteBtn:Button = new Button();
			// (Redmine Feature # 589) ID of flex components is set so that it can be uniquely identified by Ranorex
			deleteBtn.id=TeevraUIComponentsID.DELETE_ID;
			deleteBtn.label = "Delete";
			deleteBtn.addEventListener(FlexEvent.BUTTON_DOWN, deleteEventHandler)
			controlsBox.addChild(deleteBtn);
			this.addChild(controlsBox);
			
			
			
			//create the details form with struct details 
			
			// (Redmine Feature # 589) ID of flex components is set so that it can be uniquely identified by Ranorex
			structNameInput.id=TeevraUIComponentsID.STRUCTURE_NAME_ID;
			unionCheck.id=TeevraUIComponentsID.IS_UNION_ID;
			rootCheck.id=TeevraUIComponentsID.IS_ROOT_ID;
			
			structNameLabel.text = "Structure Name";
		    detailsBox.addChild(structNameLabel);
			detailsBox.addChild(structNameInput);
			detailsBox.addChild(new Spacer());
			detailsBox.addChild(unionCheck);
			detailsBox.addChild(new Spacer());
			detailsBox.addChild(rootCheck);
			this.addChild(detailsBox);

//			var resetBtn:Button = new Button();
//			resetBtn.label = "Reset";
			
			//grid configform for individual field defn
			addConfigFields();
			this.addChild(configForm);
		}
		
		/**
		 * Creates the structConfig based on the root structure selected in the parent container.
		 * Structure are ordered by decreasing levels in the struct tree rooted by given rootStruct
		 */
		public function createConfigXML(rootStruct:StructObjectModel):String
		{
			
			var configXML:XML = <struct type={rootStruct.structName}></struct>;
			var orderedStructList:ArrayCollection = structHolder.getDependentStructList(rootStruct);
			for (var i:int=0; i < orderedStructList.length; i++)
			{
				var struct:StructObjectModel = StructObjectModel(orderedStructList.getItemAt(i));
				var complexType:XML = <complexType name={struct.structName} union={struct.union.toString()}></complexType>;
				var sequence:XML = <sequence></sequence>;
				var fieldSet:ArrayCollection = struct.fieldSet;
				for (var j:int=0; j < fieldSet.length; i++) {
					var structField:StructFieldObjectModel = StructFieldObjectModel(fieldSet.getItemAt(j));
					var element:XML = <element name={structField.fieldName} type={structField.datatype}></element>;
					sequence.appendChild(element);
				}
				complexType.appendChild(sequence);
				configXML.appendChild(complexType);
			}
			Alert.show(configXML.toXMLString());
			return configXML.toXMLString();
		
			
		}

		/**
		 * Loads the UI with the given UI with the struct Config XML given. It also
		 * initializes StructHolder with list of structs present in the XML. It also 
		 * loads the data grid with loaded list of structs 
		 */
		public function loadConfigXML(configXML:XML):void
		{
			var structListToLoad:ArrayCollection = new ArrayCollection();
			var complexType:XML;
			for each (complexType in configXML.complexType)
			{
				var currentStruct:StructObjectModel = new StructObjectModel();
				//populate the attributes for currentStruct
				currentStruct.structName = complexType.name;
				currentStruct.leaf = false;
				if (complexType.attribute("union") == "true") {
					currentStruct.union = true;
				} else {
					currentStruct.union = false;
				}
				if (complexType.attribute("root") == "true") {
					currentStruct.root = true;
				} else {
					currentStruct.root = false;
				}
				
				//populate the fields in currentStruct
				var sequence:XML;
				var fieldSet:ArrayCollection = new ArrayCollection();
				for each (sequence in complexType.sequence) {
					var element:XML;
					for each (element in sequence.element) {
						var structField:StructFieldObjectModel = new StructFieldObjectModel();
						structField.fieldName = element.attribute("name");
						structField.datatype = element.attribute("type");
						if ((element.attribute("size") != null) && (element.attribute("size") != "")) {
							structField.length = element.attribute("size");
						}
						fieldSet.addItem(structField);
					}
				}
				currentStruct.fieldSet = fieldSet;
				structListToLoad.addItem(currentStruct);
			}
			
			//load the list of struct into struct holder and datagrid
			structHolder.loadStructs(structListToLoad);
			structHolder.getNonLeafStructs(nonLeafStructs);
		}

		/**
		 * Called when a new struct is added into struct holder
		 */
		public function structAdded(newStruct:StructObjectModel):void {
			nonLeafStructs.addItem(newStruct);
		}
		
		/**
		 * Called when a struct is removed from the structHolder */
		public function structRemoved(removedStruct:StructObjectModel):void {
			nonLeafStructs.removeItemAt(nonLeafStructs.getItemIndex(removedStruct));
		}
		
		/**
		 * Handler for Add New Button
		 */
		public function addNewEventHandler(event:FlexEvent):void {
			structNameInput.text="";
			unionCheck.selected=false;
			rootCheck.selected=false;
			this.removeChild(configForm);
			addConfigFields();
			this.addChild(configForm);
		}

		/**
		 * Handler for Update Button
		 */
		public function updateEventHandler(event:FlexEvent):void {
			var structName:String = structNameInput.text;
			var union:Boolean = unionCheck.selected;
			var root:Boolean = rootCheck.selected;
			var struct:StructObjectModel = structHolder.getStruct(structName);
			var toUpdate:Boolean = true;
			if (struct == null) {
				struct = new StructObjectModel();
				toUpdate = false;
			}
			struct.structName = structName;
			struct.union = union;
			struct.root = root;
			struct.fieldSet = getFieldSet(configForm.getUserSpecifiedValues());
			
			if (toUpdate) {
				structHolder.updateStruct(struct);
			} else {
				structHolder.addStruct(struct);
			}
		}
		
		/**
		 * Handler for Delete Button
		 */
		public function deleteEventHandler(event:FlexEvent):void {
			var structName:String = structNameInput.text;	
			if ((structName != null) && (structName != "")) {
				structHolder.removeStruct(structName);
			}
		}

		/**
		 * Handler for Reset Button
		 */
		public function resetEventHandler(event:FlexEvent):void {
			
		}

		/**
		 * Handler for selection in data grid to show the grid config form with the details in the struct
		 */
		public function gridSelectionHandler(event:Event):void {
			
			if (structsGrid.selectedIndex != -1) {
				var selectedStruct:StructObjectModel = StructObjectModel(structsGrid.selectedItem);
				//load the data of dataGrid i.e. Root, union and Struct Name
				structNameInput.text = selectedStruct.structName;
				unionCheck.selected = selectedStruct.union;
				rootCheck.selected = selectedStruct.root;
				
				//load the grid config form with the details in the struct
				configForm.setTabularData(getTabularData(selectedStruct));
			}
		}
		
		/**
		 * Creates a DataGridColumn with the given set of attributes */
		private function createGridColumn(colLabel:String, colField:String):DataGridColumn {
			var col:DataGridColumn = new DataGridColumn();
			col.headerText = colLabel;
			col.dataField = colField;
			return col;
		}
		
		/**
		 * Creates the container that has fields for each of the field mapping required for the component.
		 */
		private function addConfigFields():void {
			configForm = new GridConfigForm(getConfigFields());
			configForm.percentWidth = 90;
		}		

		/**
		 * Constructs the field models that need to be used to build the GridConfigForm 
		 * containing fields for a single struct definition - name of the field, 
		 * its datatype & len in case of arrays.
		 */
		private function getConfigFields():ArrayCollection
		{
			var coll:ArrayCollection = new ArrayCollection();
			
			coll.addItem(getField(FLD_SEQ_LBL_KEY, FLD_SEQ_NAME, FLD_SEQ_TYPE, 
			FLD_SEQ_WIDTH, null, null,null));
			
			coll.addItem(getField(setFieldName(FLD_NAME_LBL_KEY), FLD_NAME, FLD_NAME_TYPE, 
				FLD_NAME_WIDTH, null, null, null));
			coll.addItem(getField(setFieldName(FLD_DATATYPE_LBL_KEY), FLD_DATATYPE_NAME, FLD_DATATYPE_TYPE,
				FLD_DATATYPE_WIDTH, structHolder.getAvailableStructs(), null,"structName"));
			coll.addItem(getField(setFieldName(FLD_LENGTH_LBL_KEY), FLD_LENGTH_NAME, FLD_LENGTH_TYPE,
				FLD_LENGTH_WIDTH, null, null, null));
			return coll;
		}

		/**
		 * Creates a GridConfigField with the supplied params.
		 */		
		private function getField(labelKey:String, fieldName:String, fieldType:String, 
			fieldWidth:int, dataprovider:ArrayCollection, observer:Function, labelField:String):GridConfigField {
			var field:GridConfigField = new GridConfigField();
			field.label = labelKey;
			field.name = fieldName;
			field.type = fieldType;
			field.fieldWidth = fieldWidth;
			field.lookups = dataprovider;
			field.observer = observer;
			field.comboLabelField = labelField;
			return field;
		}
		
		/**
		 * When a structure is selected in the top grid, corresponding list of fields along with its
		 * details need to be shown in the grid config form. This method creates the necessary data model
		 * for GridConfigForm from the fieldSet in the struct 
		 */
		private function getTabularData(struct:StructObjectModel):ArrayCollection
		{
			var tabularData:ArrayCollection = new ArrayCollection();
			//check for null
			if ((struct.fieldSet == null) || (struct.leaf)) {
				return tabularData;
			}
			
			for (var i:int=0; i < struct.fieldSet.length; i++)
			{
				var structField:StructFieldObjectModel = 
					StructFieldObjectModel(struct.fieldSet.getItemAt(i));
				var rowVector:ArrayCollection = new ArrayCollection();
				rowVector.addItem(structField.sequence);
				rowVector.addItem(structField.fieldName);
				//rowVector.addItem(structField.datatype);
				rowVector.addItem(structField.structObjectModel);
				if (structField.length != -1) {
					rowVector.addItem(structField.length);
				} else {
					rowVector.addItem("-1");
				}
				tabularData.addItem(rowVector);
			}
			return tabularData;
		}
		
		/**
		 * Gets the list of field definitions specified in GridConfigForm 
		 */
		private function getFieldSet(tabularData:ArrayCollection):ArrayCollection
		{
			var fieldSet:ArrayCollection = new ArrayCollection();
			var maxSequence:int = tabularData.length;
			
			for(var i:int=0;i<maxSequence;i++)
			{	
				var rowVector:ArrayCollection = ArrayCollection(tabularData.getItemAt(i));
				var field:StructFieldObjectModel = new StructFieldObjectModel();
				
				if(rowVector.getItemAt(FIELD_LENGTH_INDEX).toString()!=null && rowVector.getItemAt(FIELD_LENGTH_INDEX).toString()!="")
				{
				
					field.sequence = rowVector.getItemAt(FIELD_SEQ_INDEX).toString();
					if (field.sequence > maxSequence) {
						Alert.show("Invalid sequence specified for field at row " + (i+1));
						return fieldSet;
					}
					field.fieldName = rowVector.getItemAt(FIELD_NAME_INDEX).toString();
					var structObjectModel:StructObjectModel =StructObjectModel(rowVector.getItemAt(FIELD_DATATYPE_INDEX));
					//added by AP 17-Nune-09 to add the StructObjectModel to rowVector-Code Start
					field.structObjectModel = structObjectModel;
					//added by AP 17-Nune-09 to add the StructObjectModel to rowVector-Code End
					field.datatype =  structObjectModel.structName;
					if (rowVector.getItemAt(FIELD_LENGTH_INDEX).toString() != "")
					{
						field.length = rowVector.getItemAt(FIELD_LENGTH_INDEX).toString();
					} else {
						field.length = -1;
					}
					fieldSet.addItem(field);
				}
             }
             return fieldSet;
		}

		/**
		 * Gets the label for the given field */
		private function setFieldName(field:String):String
		{
			var fieldName:String=resourceManager.getString('TeevraUI', field + '.name');
			if (resourceManager.getString('TeevraUI', field + '.mandatory') == 'Y')
			{
				fieldName+="*";
			}
			return fieldName;
		}
	}
}
