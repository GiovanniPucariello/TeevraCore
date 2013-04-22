package com.headstrong.teevra.client.view.admin
{
	import flash.events.MouseEvent;
	
	import mx.collections.ArrayCollection;
	import mx.containers.HBox;
	import mx.containers.Tile;
	import mx.containers.VBox;
	import mx.controls.CheckBox;
	import mx.controls.Label;
	import mx.controls.TextInput;
	
	
	public class WeeklySchedule extends Tile implements IRecurrenceForm
	{
		private var textInput:TextInput;
		private var checkBoxList:Array = new Array(7);
		
		public function WeeklySchedule()
		{
			this.percentHeight=100;
			this.percentWidth=100;
			var weeklyVBox:VBox = new VBox();
			
			var recurHBox:HBox = new HBox();
			var weekdayHBox1:HBox = new HBox();
			var weekdayHBox2:HBox = new HBox();
			
			var recurLabel1:Label = new Label();
			recurLabel1.text=resourceManager.getString('TeevraUI', 'label.WeeklySchedule.recurEvery');
			
			textInput = new TextInput();
			
			var recurLabel2:Label = new Label();
			textInput.percentWidth=20;
			recurLabel2.text=resourceManager.getString('TeevraUI', 'label.WeeklySchedule.weekOn');
			
			recurHBox.addChild(recurLabel1);
			recurHBox.addChild(textInput);
			recurHBox.addChild(recurLabel2);
			
			weeklyVBox.addChild(recurHBox);//first element 
			
			createCheckbox('label.WeeklySchedule.sunday', weekdayHBox1, 0);
			createCheckbox('label.WeeklySchedule.monday', weekdayHBox1, 1);
			createCheckbox('label.WeeklySchedule.tuesday', weekdayHBox1, 2);
			createCheckbox('label.WeeklySchedule.wednesday', weekdayHBox1, 3);
			createCheckbox('label.WeeklySchedule.thursday', weekdayHBox2, 4);
			createCheckbox('label.WeeklySchedule.friday', weekdayHBox2, 5);
			createCheckbox('label.WeeklySchedule.saturday', weekdayHBox2, 6);
			
			weeklyVBox.addChild(weekdayHBox1);//second element week day
			weeklyVBox.addChild(weekdayHBox2);//third element week day remin
			
			this.addChild(weeklyVBox);
		}
		
		private function createCheckbox(label:String, container:HBox, index:int):void {
			var checkBox:CheckBox = new CheckBox();
			checkBox.label=resourceManager.getString('TeevraUI', label);
			container.addChild(checkBox);
			checkBoxList[index] = checkBox;
		}
					
		public function getTextValue():String
		{
			return textInput.text;
		}
		public function getListValue():ArrayCollection
		{
			var selectedDays:ArrayCollection = new ArrayCollection();
			for (var i:int=0;i<7;i++) {
				if (CheckBox(checkBoxList[i]).selected) {
					selectedDays.addItem(i+1);
				}
			}
			return selectedDays;
		}

		public function setListValue(selectedDays:ArrayCollection):void
		{
			for (var i:int=0;i<selectedDays.length;i++) {
				CheckBox(checkBoxList[selectedDays[i] - 1]).selected = true;
			}
		}
		
		public function getRecurrence():IRecurrence {
			var recurrence:IRecurrence = new WeeklyRecurrence();
			return recurrence;
		}
		
		public function setRecurrence(recurrence:WeeklyRecurrence):void {
			textInput.text = String(recurrence.recurrenceGap);
			if (recurrence.daysOfWeek != null) {
				setListValue(recurrence.daysOfWeek);
			}
		}

	}
}