﻿'//////////////////////////////////////////////////////////////////////////////
'
' This file was automatically generated by RANOREX.
' DO NOT MODIFY THIS FILE! It is regenerated by the designer.
' All your modifications will be lost!
' http://www.ranorex.com
'
'//////////////////////////////////////////////////////////////////////////////

Imports System
Imports System.Collections.Generic
Imports System.Text
Imports System.Text.RegularExpressions
Imports System.Drawing
Imports System.Threading
Imports System.Windows.Forms

Imports Ranorex
Imports Ranorex.Core

Namespace UI_TC
	''' <summary>
	''' The Scenario15 recording.
	''' </summary>
	Partial Public Class Scenario15

		Public Shared repo as UI_TCRepository = UI_TCRepository.Instance

		<System.CodeDom.Compiler.GeneratedCode("Ranorex", "2.3.6")> _
		Public Shared Sub Start()
			Mouse.DefaultMoveTime = 100
			Keyboard.DefaultKeyPressTime = 100
			Delay.SpeedFactor = 1.0

			Scenario15.start15()
			Delay.Milliseconds(0)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.FlexObjectIceFish.TextProcess_Modeling_' at 30;5.")
			repo.WebDocumentIceFish1.FlexObjectIceFish.TextProcess_Modeling_.Click("30;5")
			Delay.Milliseconds(1860)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.FlexObjectIceFish.MenuItemReference_Data' at 63;8.")
			repo.WebDocumentIceFish1.FlexObjectIceFish.MenuItemReference_Data.Click("63;8")
			Delay.Milliseconds(60)
			Report.Info("Validating AttributeEqual (Text='Ref Data Id') on item 'WebDocumentIceFish1.ContainerVBox.ColumnRef_Data_Id'.")
			Validate.Attribute(repo.WebDocumentIceFish1.ContainerVBox.ColumnRef_Data_IdInfo, "Text", "Ref Data Id")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Text='Name') on item 'WebDocumentIceFish1.ContainerVBox.ColumnName'.")
			Validate.Attribute(repo.WebDocumentIceFish1.ContainerVBox.ColumnNameInfo, "Text", "Name")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Text='Data Source') on item 'WebDocumentIceFish1.ContainerVBox.ColumnData_Source'.")
			Validate.Attribute(repo.WebDocumentIceFish1.ContainerVBox.ColumnData_SourceInfo, "Text", "Data Source")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Text='Query') on item 'WebDocumentIceFish1.ContainerVBox.ColumnQuery'.")
			Validate.Attribute(repo.WebDocumentIceFish1.ContainerVBox.ColumnQueryInfo, "Text", "Query")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Text='--select server--') on item 'WebDocumentIceFish1.ContainerHBox.TextTextInput'.")
			Validate.Attribute(repo.WebDocumentIceFish1.ContainerHBox.TextTextInputInfo, "Text", "--select server--")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Text='Add Reference Data') on item 'WebDocumentIceFish.ContainerHBox.ButtonNew'.")
			Validate.Attribute(repo.WebDocumentIceFish.ContainerHBox.ButtonNewInfo, "Text", "Add Reference Data")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Enabled='False') on item 'WebDocumentIceFish.ContainerHBox.ButtonDelete'.")
			Validate.Attribute(repo.WebDocumentIceFish.ContainerHBox.ButtonDeleteInfo, "Enabled", "False")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Text='Delete') on item 'WebDocumentIceFish.ContainerHBox.ButtonDelete'.")
			Validate.Attribute(repo.WebDocumentIceFish.ContainerHBox.ButtonDeleteInfo, "Text", "Delete")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Enabled='True') on item 'WebDocumentIceFish.ContainerHBox.ButtonRefresh'.")
			Validate.Attribute(repo.WebDocumentIceFish.ContainerHBox.ButtonRefreshInfo, "Enabled", "True")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Text='Refresh') on item 'WebDocumentIceFish.ContainerHBox.ButtonRefresh'.")
			Validate.Attribute(repo.WebDocumentIceFish.ContainerHBox.ButtonRefreshInfo, "Text", "Refresh")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Enabled='True') on item 'WebDocumentIceFish1.ContainerVBox.ButtonSchedule_Reload'.")
			Validate.Attribute(repo.WebDocumentIceFish1.ContainerVBox.ButtonSchedule_ReloadInfo, "Enabled", "True")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Text='Schedule Reload') on item 'WebDocumentIceFish1.ContainerVBox.ButtonSchedule_Reload'.")
			Validate.Attribute(repo.WebDocumentIceFish1.ContainerVBox.ButtonSchedule_ReloadInfo, "Text", "Schedule Reload")
			Delay.Milliseconds(3360)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.ContainerVBox.ColumnQuery' at 77;398.")
			repo.WebDocumentIceFish1.ContainerVBox.ColumnQuery.Click("77;398")
			Delay.Milliseconds(1470)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.ContainerHBox.ButtonNew' at 77;13.")
			repo.WebDocumentIceFish.ContainerHBox.ButtonNew.Click("77;13")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Text='Name*') on item 'WebDocumentIceFish1.FlexObjectIceFish.TextNameAsterisk1'.")
			Validate.Attribute(repo.WebDocumentIceFish1.FlexObjectIceFish.TextNameAsterisk1Info, "Text", "Name*")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Type='TextInput') on item 'WebDocumentIceFish.FlexObjectIceFish.TextTextInput3'.")
			Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInput3Info, "Type", "TextInput")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Text='Data Source Name*') on item 'WebDocumentIceFish1.FlexObjectIceFish.TextData_Source_NameAsterisk'.")
			Validate.Attribute(repo.WebDocumentIceFish1.FlexObjectIceFish.TextData_Source_NameAsteriskInfo, "Text", "Data Source Name*")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Text='Query*') on item 'WebDocumentIceFish1.FlexObjectIceFish.TextQueryAsterisk'.")
			Validate.Attribute(repo.WebDocumentIceFish1.FlexObjectIceFish.TextQueryAsteriskInfo, "Text", "Query*")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Text='') on item 'WebDocumentIceFish1.FlexObjectIceFish.TextUITextField1'.")
			Validate.Attribute(repo.WebDocumentIceFish1.FlexObjectIceFish.TextUITextField1Info, "Text", "")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Text='Save') on item 'WebDocumentIceFish.FlexObjectIceFish.ButtonSave'.")
			Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.ButtonSaveInfo, "Text", "Save")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Text='Close') on item 'WebDocumentIceFish.FlexObjectIceFish.ButtonClose'.")
			Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.ButtonCloseInfo, "Text", "Close")
			Delay.Milliseconds(100)
			Report.Info("Validating Exists on item 'WebDocumentIceFish1.FlexObjectIceFish.TextUITextField1'.")
			Validate.Exists(repo.WebDocumentIceFish1.FlexObjectIceFish.TextUITextField1Info)
			Delay.Milliseconds(2330)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.TextTextInput3' at 140;9.")
			repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInput3.Click("140;9")
			Delay.Milliseconds(1190)
			Report.Info("Key sequence 'na'.")
			Keyboard.Press("na")
			Delay.Milliseconds(900)
			Report.Info("Key 'N' Press.")
			Keyboard.Press(Keys.N, 49, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(80)
			Report.Info("Key 'E' Press.")
			Keyboard.Press(Keys.E, 18, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(2930)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.ButtonSave' at 26;7.")
			repo.WebDocumentIceFish.FlexObjectIceFish.ButtonSave.Click("26;7")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Text='Please enter all mandatory fields') on item 'WebDocumentIceFish.FlexObjectIceFish.TextPlease_enter_all_mandato'.")
			Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.TextPlease_enter_all_mandatoInfo, "Text", "Please enter all mandatory fields")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Text='OK') on item 'WebDocumentIceFish.FlexObjectIceFish.ButtonOK2'.")
			Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.ButtonOK2Info, "Text", "OK")
			Delay.Milliseconds(1550)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.ButtonOK2' at 40;13.")
			repo.WebDocumentIceFish.FlexObjectIceFish.ButtonOK2.Click("40;13")
			Delay.Milliseconds(1250)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.TextTextInput4' at 108;14.")
			repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInput4.Click("108;14")
			Delay.Milliseconds(2110)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.FlexObjectIceFish.TextTest' at 97;1.")
			repo.WebDocumentIceFish1.FlexObjectIceFish.TextTest.Click("97;1")
			Delay.Milliseconds(640)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.FlexObjectIceFish.TextUITextField1' at 101;17.")
			repo.WebDocumentIceFish1.FlexObjectIceFish.TextUITextField1.Click("101;17")
			Delay.Milliseconds(1250)
			Report.Info("Key 'S' Press.")
			Keyboard.Press(Keys.S, 31, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(130)
			Report.Info("Key sequence 'ele'.")
			Keyboard.Press("ele")
			Delay.Milliseconds(120)
			Report.Info("Key 'C' Press.")
			Keyboard.Press(Keys.C, 46, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(70)
			Report.Info("Key 'T' Press.")
			Keyboard.Press(Keys.T, 20, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(100)
			Report.Info("Key 'Space' Press.")
			Keyboard.Press(Keys.Space, 57, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(290)
			Report.Info("Key 'D' Press.")
			Keyboard.Press(Keys.D, 32, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(80)
			Report.Info("Key 'U' Press.")
			Keyboard.Press(Keys.U, 22, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(160)
			Report.Info("Key sequence 'mm'.")
			Keyboard.Press("mm")
			Delay.Milliseconds(550)
			Report.Info("Key 'Y' Press.")
			Keyboard.Press(Keys.Y, 21, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(160)
			Report.Info("Key 'Space' Press.")
			Keyboard.Press(Keys.Space, 57, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(70)
			Report.Info("Key 'D' Press.")
			Keyboard.Press(Keys.D, 32, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(2830)
			Report.Info("Key 'Space' Press.")
			Keyboard.Press(Keys.Space, 57, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(70)
			Report.Info("Key sequence 'fr'.")
			Keyboard.Press("fr")
			Delay.Milliseconds(250)
			Report.Info("Key 'O' Press.")
			Keyboard.Press(Keys.O, 24, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(190)
			Report.Info("Key sequence 'm{Space}'.")
			Keyboard.Press("m{Space}")
			Delay.Milliseconds(1440)
			Report.Info("Key 'D' Press.")
			Keyboard.Press(Keys.D, 32, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(130)
			Report.Info("Key 'U' Press.")
			Keyboard.Press(Keys.U, 22, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(180)
			Report.Info("Key sequence 'mm'.")
			Keyboard.Press("mm")
			Delay.Milliseconds(280)
			Report.Info("Key 'Y' Press.")
			Keyboard.Press(Keys.Y, 21, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(2830)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.ButtonClose' at 42;15.")
			repo.WebDocumentIceFish.FlexObjectIceFish.ButtonClose.Click("42;15")
			Delay.Milliseconds(1040)
			Scenario15.Close_button()
			Delay.Milliseconds(1210)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.ContainerHBox.ButtonNew' at 65;7.")
			repo.WebDocumentIceFish.ContainerHBox.ButtonNew.Click("65;7")
			Delay.Milliseconds(1160)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.TextTextInput3' at 79;11.")
			repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInput3.Click("79;11")
			Delay.Milliseconds(910)
			Report.Info("Key 'LShiftKey, Shift' Down.")
			Keyboard.Down(Keys.LShiftKey, 42, False)
			Delay.Milliseconds(170)
			Report.Info("Key sequence 'Nam'.")
			Keyboard.Press("Nam")
			Delay.Milliseconds(130)
			Report.Info("Key 'E' Press.")
			Keyboard.Press(Keys.E, 18, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(1460)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.FlexObjectIceFish.ButtonButton1' at 290;10.")
			repo.WebDocumentIceFish1.FlexObjectIceFish.ButtonButton1.Click("290;10")
			Delay.Milliseconds(1070)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.FlexObjectIceFish.TextTest' at 197;11.")
			repo.WebDocumentIceFish1.FlexObjectIceFish.TextTest.Click("197;11")
			Delay.Milliseconds(800)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.FlexObjectIceFish.TextUITextField1' at 200;19.")
			repo.WebDocumentIceFish1.FlexObjectIceFish.TextUITextField1.Click("200;19")
			Delay.Milliseconds(520)
			Report.Info("Key 'LShiftKey, Shift' Down.")
			Keyboard.Down(Keys.LShiftKey, 42, False)
			Delay.Milliseconds(230)
			Report.Info("Key 'S, Shift' Down.")
			Keyboard.Down(Keys.S, 31, False)
			Delay.Milliseconds(90)
			Report.Info("Key 'LShiftKey' Up.")
			Keyboard.Up(Keys.LShiftKey, 42, False)
			Delay.Milliseconds(60)
			Report.Info("Key 'S' Up.")
			Keyboard.Up(Keys.S, 31, False)
			Delay.Milliseconds(120)
			Report.Info("Key 'E' Press.")
			Keyboard.Press(Keys.E, 18, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(80)
			Report.Info("Key sequence 'le'.")
			Keyboard.Press("le")
			Delay.Milliseconds(90)
			Report.Info("Key 'C' Press.")
			Keyboard.Press(Keys.C, 46, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(80)
			Report.Info("Key 'T' Press.")
			Keyboard.Press(Keys.T, 20, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(110)
			Report.Info("Key 'Space' Press.")
			Keyboard.Press(Keys.Space, 57, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(160)
			Report.Info("Key 'D' Press.")
			Keyboard.Press(Keys.D, 32, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(160)
			Report.Info("Key 'U' Press.")
			Keyboard.Press(Keys.U, 22, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(190)
			Report.Info("Key sequence 'mm'.")
			Keyboard.Press("mm")
			Delay.Milliseconds(250)
			Report.Info("Key 'Y' Press.")
			Keyboard.Press(Keys.Y, 21, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(110)
			Report.Info("Key 'Space' Press.")
			Keyboard.Press(Keys.Space, 57, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(100)
			Report.Info("Key 'F' Press.")
			Keyboard.Press(Keys.F, 33, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(70)
			Report.Info("Key sequence 'ro'.")
			Keyboard.Press("ro")
			Delay.Milliseconds(120)
			Report.Info("Key 'M' Press.")
			Keyboard.Press(Keys.M, 50, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(70)
			Report.Info("Key 'Space' Press.")
			Keyboard.Press(Keys.Space, 57, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(190)
			Report.Info("Key sequence 'test'.")
			Keyboard.Press("test")
			Delay.Milliseconds(420)
			Report.Info("Key 'LShiftKey, Shift' Down.")
			Keyboard.Down(Keys.LShiftKey, 42, False)
			Delay.Milliseconds(120)
			Report.Info("Key 'OemMinus, Shift' Press.")
			Keyboard.Press(Keys.OemMinus, 12, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(20)
			Report.Info("Key 'LShiftKey' Up.")
			Keyboard.Up(Keys.LShiftKey, 42, False)
			Delay.Milliseconds(350)
			Report.Info("Key 'D' Press.")
			Keyboard.Press(Keys.D, 32, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(220)
			Report.Info("Key 'U' Press.")
			Keyboard.Press(Keys.U, 22, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(180)
			Report.Info("Key sequence 'mm'.")
			Keyboard.Press("mm")
			Delay.Milliseconds(230)
			Report.Info("Key 'Y' Press.")
			Keyboard.Press(Keys.Y, 21, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(2720)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.ButtonSave' at 25;11.")
			repo.WebDocumentIceFish.FlexObjectIceFish.ButtonSave.Click("25;11")
			Delay.Milliseconds(150)
			Report.Info("Validating AttributeEqual (Text='Configurations saved successfully') on item 'WebDocumentIceFish1.FlexObjectIceFish.TextConfigurations_saved_suc'.")
			Validate.Attribute(repo.WebDocumentIceFish1.FlexObjectIceFish.TextConfigurations_saved_sucInfo, "Text", "Configurations saved successfully")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Text='Save Configuration') on item 'WebDocumentIceFish1.FlexObjectIceFish.TextSave_Configuration'.")
			Validate.Attribute(repo.WebDocumentIceFish1.FlexObjectIceFish.TextSave_ConfigurationInfo, "Text", "Save Configuration")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Text='OK') on item 'WebDocumentIceFish1.FlexObjectIceFish.ButtonOK3'.")
			Validate.Attribute(repo.WebDocumentIceFish1.FlexObjectIceFish.ButtonOK3Info, "Text", "OK")
			Delay.Milliseconds(1080)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.FlexObjectIceFish.ButtonOK3' at 27;10.")
			repo.WebDocumentIceFish1.FlexObjectIceFish.ButtonOK3.Click("27;10")
			Delay.Milliseconds(990)
			Scenario15.Save_button()
			Delay.Milliseconds(0)
			Scenario15.click_testrecord()
			Delay.Milliseconds(0)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.TextTextInput3' at 61;9.")
			repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInput3.Click("61;9")
			Delay.Milliseconds(1410)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.FlexObjectIceFish.TextSelect_dummy_from_test_d' at 138;17.")
			repo.WebDocumentIceFish1.FlexObjectIceFish.TextSelect_dummy_from_test_d.Click("138;17")
			Delay.Milliseconds(2990)
			Report.Info("Key 'LShiftKey, Shift' Down.")
			Keyboard.Down(Keys.LShiftKey, 42, False)
			Delay.Milliseconds(210)
			Report.Info("Key 'OemMinus, Shift' Press.")
			Keyboard.Press(Keys.OemMinus, 12, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(20)
			Report.Info("Key 'LShiftKey' Up.")
			Keyboard.Up(Keys.LShiftKey, 42, False)
			Delay.Milliseconds(2820)
			Report.Info("Key sequence 'test'.")
			Keyboard.Press("test")
			Delay.Milliseconds(770)
			Report.Info("Key 'D2' Press.")
			Keyboard.Press(Keys.D2, 3, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(2130)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.ButtonSave' at 35;10.")
			repo.WebDocumentIceFish.FlexObjectIceFish.ButtonSave.Click("35;10")
			Delay.Milliseconds(1440)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.FlexObjectIceFish.ButtonOK3' at 17;9.")
			repo.WebDocumentIceFish1.FlexObjectIceFish.ButtonOK3.Click("17;9")
			Delay.Milliseconds(1740)
			Scenario15.click_testrecord()
			Delay.Milliseconds(340)
			Report.Info("Validating AttributeEqual (Text='test') on item 'WebDocumentIceFish.FlexObjectIceFish.TextTextInput3'.")
			Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInput3Info, "Text", "test")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Text='Select dummy from test_dummy') on item 'WebDocumentIceFish1.FlexObjectIceFish.TextSelect_Asterisk_from_tes1'.")
			Validate.Attribute(repo.WebDocumentIceFish1.FlexObjectIceFish.TextSelect_Asterisk_from_tes1Info, "Text", "Select dummy from test_dummy")
			Delay.Milliseconds(1290)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.ButtonClose' at 47;16.")
			repo.WebDocumentIceFish.FlexObjectIceFish.ButtonClose.Click("47;16")
			Delay.Milliseconds(1800)
			Scenario15.click_testrecord()
			Delay.Milliseconds(8200)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.FlexObjectIceFish.TextSelect_Asterisk_from_tes1' at 154;9.")
			repo.WebDocumentIceFish1.FlexObjectIceFish.TextSelect_Asterisk_from_tes1.Click("154;9")
			Delay.Milliseconds(800)
			Report.Info("Key 'LShiftKey, Shift' Down.")
			Keyboard.Down(Keys.LShiftKey, 42, False)
			Delay.Milliseconds(430)
			Report.Info("Key 'D0, Shift' Press.")
			Keyboard.Press(Keys.D0, 11, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(20)
			Report.Info("Key 'LShiftKey' Up.")
			Keyboard.Up(Keys.LShiftKey, 42, False)
			Delay.Milliseconds(390)
			Report.Info("Key 'D2' Press.")
			Keyboard.Press(Keys.D2, 3, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(1280)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.ButtonClose' at 19;12.")
			repo.WebDocumentIceFish.FlexObjectIceFish.ButtonClose.Click("19;12")
			Delay.Milliseconds(1130)
			Scenario15.click_testrecord()
			Delay.Milliseconds(340)
			Report.Info("Validating AttributeEqual (Text='test') on item 'WebDocumentIceFish.FlexObjectIceFish.TextTextInput3'.")
			Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInput3Info, "Text", "test")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Text='select * from test_test2') on item 'WebDocumentIceFish1.FlexObjectIceFish.TextSelect_Asterisk_from_tes1'.")
			Validate.Attribute(repo.WebDocumentIceFish1.FlexObjectIceFish.TextSelect_Asterisk_from_tes1Info, "Text", "select * from test_test2")
			Delay.Milliseconds(100)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.ButtonClose' at 32;14.")
			repo.WebDocumentIceFish.FlexObjectIceFish.ButtonClose.Click("32;14")
			Delay.Milliseconds(940)
			Scenario15.Delete_NO_YEs()
			Delay.Milliseconds(0)
			Scenario15.end15()
			Delay.Milliseconds(0)
		End Sub

#Region "Image Feature Data"
#End Region

	End Class

End Namespace
