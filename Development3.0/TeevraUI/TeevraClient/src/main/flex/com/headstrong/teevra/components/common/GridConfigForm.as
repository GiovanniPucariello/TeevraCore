package com.headstrong.teevra.components.common
{
	import com.headstrong.teevra.client.model.SchemaCache;
	import com.headstrong.teevra.client.view.entity.SchemaVO;

	import flash.display.DisplayObject;
	import flash.events.Event;
	import flash.events.MouseEvent;

	import mx.collections.ArrayCollection;
	import mx.containers.Grid;
	import mx.containers.GridItem;
	import mx.containers.GridRow;
	import mx.containers.VBox;
	import mx.controls.Alert;
	import mx.controls.Button;
	import mx.controls.ComboBox;
	import mx.controls.Label;
	import mx.controls.TextArea;
	import mx.controls.TextInput;
	import mx.core.ClassFactory;
	import mx.core.IUIComponent;
	import mx.events.ValidationResultEvent;
	import mx.validators.StringValidator;

	public class GridConfigForm extends VBox
	{
		private var _fieldDefinitions:ArrayCollection;
		private var grid:Grid;
		private var box:VBox;
		private var comboItemRenderer:ClassFactory;
		private var _initialNumRows:int=5;
		private var sequenceHolder:int=0;
		private var configData:ArrayCollection;
		private var _xvalidator:StringValidator;
		private var _vResult:ValidationResultEvent;
		private var lastSequenceHolder:int;
		private var rowCounter:int=0;

		public function GridConfigForm(fieldDefs:ArrayCollection)
		{
			super();
			this.fieldDefinitions=fieldDefs;
			init();
//			this.height = 500;
//			this.verticalScrollPolicy ="on";
		}


		public function getUserSpecifiedValues():ArrayCollection
		{
			var tabularData:ArrayCollection=new ArrayCollection();
			var rowCount:int=grid.getChildren().length;

			for (var i:int=1; i < rowCount; i++)
			{
				//add array collection for each row
				var rowVector:ArrayCollection=new ArrayCollection();

				var row:GridRow=GridRow(grid.getChildAt(i));
				for (var j:int=0; j < fieldDefinitions.length; j++)
				{
					//ignore the first display field at index 0 that is used for deleting row
					var gridItem:GridItem=GridItem(row.getChildAt(j + 1));
					var field:GridConfigField=GridConfigField(fieldDefinitions.getItemAt(j));

					if ((field.type == GridConfigField.TEXT_FIELD) || (field.type == GridConfigField.SEQUENCE_NUMBER_FIELD))
					{
						var textField:TextInput=TextInput(gridItem.getChildAt(0));
						textField.percentWidth=field.fieldWidth;
						rowVector.addItem(textField.text);
					}
					else if ((field.type == GridConfigField.TEXT_AREA))
					{
						var textArea:TextArea=TextArea(gridItem.getChildAt(0));
						textArea.percentWidth=field.fieldWidth;
						textArea.showScrollTips=true;
						textArea.horizontalScrollPosition=1;
						rowVector.addItem(textArea.text);
					}
					else if ((field.type == GridConfigField.LIST_FIELD) || (field.type == GridConfigField.EDITABLE_LIST_FIELD))
					{
						var comboField:ComboBox=ComboBox(gridItem.getChildAt(0));
						comboField.percentWidth=field.fieldWidth;
						if(comboField.selectedItem!=null)
							rowVector.addItem(comboField.selectedItem);
						else
							rowVector.addItem(comboField.value);
					}
					else if ((field.type == GridConfigField.COMPLEX_FIELD))
					{
						var complexField:ComplexField=ComplexField(gridItem.getChildAt(0));
						complexField.percentWidth=field.fieldWidth;
						rowVector.addItem(complexField.getTextAreaValue());
					}

				}
				tabularData.addItem(rowVector);
			}
			return tabularData;
		}

		public function setTabularData(tabularData:ArrayCollection):void
		{
			var comboField:ComboBox;
			var gridRowCount:Number=grid.getChildren().length;
			//gird.getChildren always return the no of row which was present at last load
			initialNumRows=grid.getChildren().length - 1;
			var diffRows:int=tabularData.length - initialNumRows;

			//getItemAt(1). '1' is used as the SEQUENCE_NUMBER_FIELD will be at the 2nd field position
			if (fieldDefinitions.length > 1)
			{
				var field:GridConfigField=GridConfigField(fieldDefinitions.getItemAt(1));
				//If the component has sequence no. then set the sequence holder
				if (field.type == GridConfigField.SEQUENCE_NUMBER_FIELD)
				{
					setSequenceHolder();
				}
			}
			if (tabularData.length >= initialNumRows)
			{         
				addBlankRow(diffRows + 1);
			}
			else
			{
				//sequenceHolder = tabularData.length+1; 
				diffRows=initialNumRows - tabularData.length;
		    	
				deleteRows(diffRows);
		    	this.rowCounter-=diffRows;
				addBlankRow(1);
			}
			for (var i:int=0; i < tabularData.length; i++)
			{

				var rowVector:ArrayCollection=ArrayCollection(tabularData.getItemAt(i));

				var row:GridRow=GridRow(grid.getChildAt(i + 1));
				for (var j:int=0; j < fieldDefinitions.length; j++)
				{

					var gridItem:GridItem=GridItem(row.getChildAt(j + 1));
					field=GridConfigField(fieldDefinitions.getItemAt(j));

					if ((field.type == GridConfigField.TEXT_FIELD) || (field.type == GridConfigField.SEQUENCE_NUMBER_FIELD))
					{

						var textField:TextInput=TextInput(gridItem.getChildAt(0));
						textField.text=rowVector.getItemAt(j).toString();

					}
					else if ((field.type == GridConfigField.LIST_FIELD))
					{
						comboField=ComboBox(gridItem.getChildAt(0));
						comboField.selectedItem=rowVector.getItemAt(j);

					}
					else if ((field.type == GridConfigField.EDITABLE_LIST_FIELD))
					{
						comboField=ComboBox(gridItem.getChildAt(0));
						comboField.text=rowVector.getItemAt(j).toString();
					}
					else if ((field.type == GridConfigField.TEXT_AREA))
					{
						var textArea:TextArea=TextArea(gridItem.getChildAt(0));
						textArea.text=rowVector.getItemAt(j).toString();
					}
					else if ((field.type == GridConfigField.COMPLEX_FIELD))
					{
						var complexField:ComplexField=ComplexField(gridItem.getChildAt(0));
						complexField.setTextAreaValue(rowVector.getItemAt(j).toString());

					}

				}
			}
		}

		private function init():void
		{
			grid=new Grid();
			grid.setStyle("borderStyle", "solid");
			grid.percentWidth=90;
			addHeaderRow();
			this.rowCounter=0;
			addBlankRow(5);

			grid.percentWidth=100;
			grid.percentHeight=100;
			this.addChild(grid);
		}

		private function addHeaderRow():void
		{
			var headerRow:GridRow=new GridRow();
			headerRow.setStyle("backgroundColor", "#6E6E6E");
			headerRow.setStyle("borderStyle", "solid");
			headerRow.percentWidth=100;

			//create dummy item for the first column that 
			//would be used for checkboxes in each row
			var checkItem:GridItem=new GridItem();
			checkItem.percentWidth=5;
			headerRow.addChild(checkItem);

			//var fieldWidth:Number = 90 / fieldDefinitions.length;

			for (var i:int=0; i < fieldDefinitions.length; i++)
			{
				var fieldLabel:Label=new Label();
				var field:GridConfigField=fieldDefinitions.getItemAt(i) as GridConfigField;
				fieldLabel.text=field.label;
				fieldLabel.setStyle("fontWeight", "bold");
				fieldLabel.setStyle("color", "#FFFFFF");

				var item:GridItem=new GridItem();
				item.addChild(fieldLabel);
				if (field.fieldPercentWidth != -1)
				{
					item.percentWidth=field.fieldPercentWidth;
					fieldLabel.percentWidth=field.fieldPercentWidth;
				}
				else
				{
					item.width=field.fieldWidth;
					fieldLabel.width=field.fieldWidth;
				}
				headerRow.addChild(item);
			}
			grid.addChild(headerRow);
		}

		private function addBlankRow(numBlanks:int):void
		{
			var numRows:int=grid.getChildren().length;
			
			for (var j:int=0; j < numBlanks; j++)
			{
				var blankRow:GridRow=new GridRow();
				blankRow.percentWidth=100;

				var deleteBtn:Button=new Button();
				deleteBtn.label="X";
				// (Redmine Feature # 589) ID of flex components is set so that it can be uniquely identified by Ranorex
				deleteBtn.id= "_" + this.rowCounter  + 0 ;
				
				deleteBtn.addEventListener(MouseEvent.CLICK, onConfigRowDelete);

				var btnItem:GridItem=new GridItem();
			
				
				btnItem.addChild(deleteBtn);
				
				blankRow.addChild(btnItem);

				for (var i:int=0; i < fieldDefinitions.length; i++)
				{

					var fieldDisplay:IUIComponent;
					var field:GridConfigField=fieldDefinitions.getItemAt(i) as GridConfigField;

					if (field.type == GridConfigField.TEXT_FIELD)
					{
						var textField:TextInput=new TextInput();
						// (Redmine Feature # 589) ID of flex components is set so that it can be uniquely identified by Ranorex
						textField.id= "_" + (this.rowCounter) + (i+1);
						
						textField.addEventListener(Event.CHANGE, onConfigFieldChange);
						fieldDisplay=textField;
						if (field.validate == GridConfigField.VALIDATION_TYPE)
						{
							xvalidator=new StringValidator();
							xvalidator.source=textField;
							xvalidator.property="text";
							xvalidator.minLength=2;
							xvalidator.listener=textField;
							vResult=xvalidator.validate(textField.text, false);
						}
					}
					else if (field.type == GridConfigField.TEXT_AREA)
					{
						var textArea:TextArea=new TextArea();
						// (Redmine Feature # 589) ID of flex components is set so that it can be uniquely identified by Ranorex
						textArea.id= "_" + (this.rowCounter) + (i+1);
						textArea.addEventListener(Event.CHANGE, onConfigFieldChange);
						fieldDisplay=textArea;
					}

					else if ((field.type == GridConfigField.LIST_FIELD) || (field.type == GridConfigField.EDITABLE_LIST_FIELD))
					{
						var comboField:ComboBox=new ComboBox();
						// (Redmine Feature # 589) ID of flex components is set so that it can be uniquely identified by Ranorex
					    comboField.id = "_" + (this.rowCounter) + (i+1);
						comboField.addEventListener(Event.CHANGE, onConfigFieldChange);

						if (comboItemRenderer == null)
						{
							comboItemRenderer=new ClassFactory(Label);
						}
						comboField.editable=(field.type == GridConfigField.EDITABLE_LIST_FIELD);
						comboField.itemRenderer=comboItemRenderer;
						if (field.independent)
						{
							comboField.dataProvider=new ArrayCollection();
						}
						else
						{
							comboField.dataProvider=field.lookups;
						}
						comboField.selectedIndex=-1;
						if (field.comboLabelField != null) {
							comboField.labelField = field.comboLabelField;
						}
						fieldDisplay=comboField;
					}
					else if (field.type == GridConfigField.SEQUENCE_NUMBER_FIELD)
					{
						var seqField:TextInput=new TextInput();
						// (Redmine Feature # 589) ID of flex components is set so that it can be uniquely identified by Ranorex
						seqField.id = "_" + (this.rowCounter) + (i+1);
						seqField.text=(++sequenceHolder).toString();
						seqField.addEventListener(Event.CHANGE, onConfigFieldChange);
						fieldDisplay=seqField;
					}
					else if (field.type == GridConfigField.COMPLEX_FIELD)
					{
						var complexField:ComplexField=new ComplexField(onLookupChange);
						// (Redmine Feature # 589) ID of flex components is set so that it can be uniquely identified by Ranorex
						complexField.id = "_" + (this.rowCounter) + (i+1);
						fieldDisplay=complexField;
					}
					var item:GridItem=new GridItem();
					if (field.fieldPercentWidth != -1)
					{
						item.percentWidth=field.fieldPercentWidth;
						fieldDisplay.percentWidth=field.fieldPercentWidth;
					}
					else
					{
						item.width=field.fieldWidth;
						fieldDisplay.width=field.fieldWidth;
					}
				
					item.addChild(DisplayObject(fieldDisplay));
					blankRow.addChild(item);

				}
				this.rowCounter++;
				grid.addChild(blankRow);
			}
		}

		private function deleteRows(numDelete:int):void
		{
			for (var i:int=0; i < numDelete; i++)
			{
				grid.removeChildAt(initialNumRows - i);
					//--sequenceHolder;			
			}
		}

		public function setSelectedIndex(fieldIndex:int, flag:Boolean):void
		{
			var rowCount:int=grid.getChildren().length;
			for (var i:int=1; i < rowCount; i++)
			{
				var row:GridRow=GridRow(grid.getChildAt(i));
				//+1 beacause of the 'X' button
				var gridItem:GridItem=GridItem(row.getChildAt(fieldIndex + 1));
				var comboField:ComboBox=ComboBox(gridItem.getChildAt(0));
				if (!flag)
				{
					comboField.text="";
				}

				comboField.selectedIndex=-1;
			}
		}

		public function get fieldDefinitions():ArrayCollection
		{
			return _fieldDefinitions;
		}

		public function set fieldDefinitions(value:ArrayCollection):void
		{
			this._fieldDefinitions=value;
		}

		public function get initialNumRows():int
		{
			return _initialNumRows;
		}

		public function set initialNumRows(value:int):void
		{
			this._initialNumRows=value;
		}

		public function get xvalidator():StringValidator
		{
			return this._xvalidator;
		}

		public function set xvalidator(stv:StringValidator):void
		{
			this._xvalidator=stv;
		}

		public function get vResult():ValidationResultEvent
		{
			return this._vResult;
		}

		public function set vResult(vrs:ValidationResultEvent):void
		{
			this._vResult=vrs;
		}

		public function onConfigFieldChange(e:Event):void
		{
			var eventSource:DisplayObject=e.target as DisplayObject;
			var gridItem:DisplayObject=eventSource.parent as DisplayObject;
			var gridRow:GridRow=gridItem.parent as GridRow;

			//add an empty row if we are editing in the last row
			if (grid.getChildIndex(gridRow) == (grid.getChildren().length - 1))
			{
			
				addBlankRow(1);
			
			}

			notifyObserver(gridRow, gridItem);
		}

		public function onLookupChange(lookupField:DisplayObject):void
		{
			var gridItem:DisplayObject=lookupField.parent as DisplayObject;
			var gridRow:GridRow=gridItem.parent as GridRow;
			notifyObserver(gridRow, gridItem);
		}

		private function notifyObserver(gridRow:GridRow, gridItem:DisplayObject):void
		{
			//check if for the current field any observer is set
			var fieldIndex:int=gridRow.getChildIndex(gridItem) - 1;
			var currentField:GridConfigField=GridConfigField(fieldDefinitions.getItemAt(fieldIndex));
			if (currentField.observer != null)
			{
				//call the observer with handles to all the fields in the current row
				var fieldsInRow:Array=new Array(gridRow.getChildren().length - 1);
				for (var i:int=1; i < gridRow.getChildren().length; i++)
				{
					var item:GridItem=GridItem(gridRow.getChildAt(i));
					fieldsInRow[i - 1]=item.getChildAt(0);
				}
				currentField.observer.apply(this, fieldsInRow);
			}
		}

		public function onConfigRowDelete(e:Event):void
		{
			var eventSource:DisplayObject=e.target as DisplayObject;
			var gridItem:DisplayObject=eventSource.parent as DisplayObject;
			var gridRow:DisplayObject=gridItem.parent as DisplayObject;
			grid.removeChild(gridRow);

			if (grid.getChildren().length == 1)
			{
				//getItemAt(1). '1' is used as the SEQUENCE_NUMBER_FIELD will be at the 2nd field position
				var field:GridConfigField=GridConfigField(fieldDefinitions.getItemAt(1));
				//If the component has sequence no. then set the sequence holder
				if (field.type == GridConfigField.SEQUENCE_NUMBER_FIELD)
				{
					setSequenceHolder();
				}
				
				addBlankRow(1);
			}
		}

		/**
		 * Returns the grid
		 */
		public function getGrid():Grid
		{
			return grid;
		}

		/**
		 * Sets the sequence holder to the sequence number of the last row
		 * if the component has a field for sequence number
		 */
		private function setSequenceHolder():void
		{
			//get the number of rows in the grid
			var gridRowCount:Number=grid.getChildren().length;
			// get the last row 
			var lastRow:GridRow=GridRow(grid.getChildAt(gridRowCount - 1));
			// get the sequence no. of the last row
			var lastRowSeqItem:GridItem=GridItem(lastRow.getChildAt(1));
			var lastSeqNo:TextInput=TextInput(lastRowSeqItem.getChildAt(0));
			// set the sequence holder to this sequence number
			sequenceHolder=int(lastSeqNo.text);

		}

		/**
		 * Sets attribute list based on the given selected schema. If the value in schemaIsChanged is set to true,
		 * the values in attribute combo is not affected, else their values are reset to empty string.
		 */

		public function setSchemaAttributes(selectedSchemaName:String, attributes:ArrayCollection, schemaIsChanged:Boolean, fieldIndex:int):void
		{
			var schemas:ArrayCollection=SchemaCache.getInstance().getPublicSchemas();
			attributes.removeAll();
			for (var i:int=0; i < schemas.length; i++)
			{
				var schema:SchemaVO=SchemaVO(schemas[i]);
				if (schema.schemaName == selectedSchemaName)
				{
					SchemaCache.getInstance().populateAllLeafAttributesNames(schema.schemaId, attributes, "");
					break;

				}
			}
			//set index of the combobox to -1
			setSelectedIndex(fieldIndex, schemaIsChanged);
		}
	}
}
