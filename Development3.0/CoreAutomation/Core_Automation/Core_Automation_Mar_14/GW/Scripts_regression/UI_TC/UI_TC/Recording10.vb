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
	''' The Recording10 recording.
	''' </summary>
	Partial Public Class Recording10

		Public Shared repo as Project10Repository = Project10Repository.Instance

		<System.CodeDom.Compiler.GeneratedCode("Ranorex", "2.3.6")> _
		Public Shared Sub Start()
			Mouse.DefaultMoveTime = 300
			Keyboard.DefaultKeyPressTime = 100
			Delay.SpeedFactor = 1.0

			Report.Info("Mouse Left Click item 'WebDocumentIceFishHash.ContainerMainArea.TextUserIdTextInput' at 36;11.")
			repo.WebDocumentIceFishHash.ContainerMainArea.TextUserIdTextInput.Click("36;11")
			Delay.Milliseconds(1130)
			Report.Info("Key sequence 'icefish'.")
			Keyboard.Press("icefish")
			Delay.Milliseconds(1480)
			Report.Info("Mouse Left Click item 'WebDocumentIceFishHash.ContainerMainArea.TextPasswordTextInput' at 36;11.")
			repo.WebDocumentIceFishHash.ContainerMainArea.TextPasswordTextInput.Click("36;11")
			Delay.Milliseconds(690)
			Report.Info("Key sequence 'icefish'.")
			Keyboard.Press("icefish")
			Delay.Milliseconds(1400)
			Report.Info("Mouse Left Click item 'WebDocumentIceFishHash.ContainerMainArea.ButtonSubmit' at 33;14.")
			repo.WebDocumentIceFishHash.ContainerMainArea.ButtonSubmit.Click("33;14")
			Delay.Milliseconds(2190)
			Report.Info("Mouse Left Click item 'WebDocumentIceFishHash.ContainerHBox.ButtonNew' at 23;12.")
			repo.WebDocumentIceFishHash.ContainerHBox.ButtonNew.Click("23;12")
			Delay.Milliseconds(3050)
			Report.Info("Mouse Left Down item 'WebDocumentIceFishHash.ContainerHBox.PictureIcon_1' at 4;13.")
			repo.WebDocumentIceFishHash.ContainerHBox.PictureIcon_1.MoveTo("4;13")
			Mouse.ButtonDown(MouseButtons.Left)
			Delay.Milliseconds(740)
			Report.Info("Mouse Left Up item 'WebDocumentIceFishHash.ContainerHBox.ContainerGraphCanvas' at 130;120.")
			repo.WebDocumentIceFishHash.ContainerHBox.ContainerGraphCanvas.MoveTo("130;120")
			Mouse.ButtonUp(MouseButtons.Left)
			Delay.Milliseconds(600)
			Report.Info("Mouse Right Click item 'WebDocumentIceFishHash.ContainerHBox.PictureIcon_1_8181' at 27;23.")
			repo.WebDocumentIceFishHash.ContainerHBox.PictureIcon_1_8181.Click(MouseButtons.Right, "27;23")
			Delay.Milliseconds(790)
			Report.Info("Mouse Left Click item 'ContextMenuIexplore.MenuItemConfigure_Component' at 29;11.")
			repo.ContextMenuIexplore.MenuItemConfigure_Component.Click("29;11")
			Delay.Milliseconds(1790)
			Report.Info("Mouse Left Click item 'WebDocumentIceFishHash.FlexObjectIceFish.TextServiceId' at 44;11.")
			repo.WebDocumentIceFishHash.FlexObjectIceFish.TextServiceId.Click("44;11")
			Delay.Milliseconds(960)
			Report.Info("Key sequence 'dummy'.")
			Keyboard.Press("dummy")
			Delay.Milliseconds(3400)
			Report.Info("Key sequence 'sample'.")
			Keyboard.Press("sample")
			Delay.Milliseconds(2180)
			Report.Info("Mouse Left Click item 'WebDocumentIceFishHash.FlexObjectIceFish.ButtonSave' at 27;14.")
			repo.WebDocumentIceFishHash.FlexObjectIceFish.ButtonSave.Click("27;14")
			Delay.Milliseconds(790)
			Report.Info("Mouse Left Click item 'WebDocumentIceFishHash.ContainerHBox.TextNameText' at 99;10.")
			repo.WebDocumentIceFishHash.ContainerHBox.TextNameText.Click("99;10")
			Delay.Milliseconds(620)
			Report.Info("Key sequence 'dummysample'.")
			Keyboard.Press("dummysample")
			Delay.Milliseconds(2210)
			Report.Info("Mouse Left Click item 'WebDocumentIceFishHash.ContainerHBox.TextUITextField' at 86;17.")
			repo.WebDocumentIceFishHash.ContainerHBox.TextUITextField.Click("86;17")
			Delay.Milliseconds(100)
			Report.Info("Key sequence 'test'.")
			Keyboard.Press("test")
			Delay.Milliseconds(970)
			Report.Info("Mouse Left Click item 'WebDocumentIceFishHash.ContainerHBox.CheckBoxRecovery' at 8;13.")
			repo.WebDocumentIceFishHash.ContainerHBox.CheckBoxRecovery.Click("8;13")
			Delay.Milliseconds(460)
			Report.Info("Mouse Left Click item 'WebDocumentIceFishHash.ContainerHBox.CheckBoxPrcsEvntLog' at 8;12.")
			repo.WebDocumentIceFishHash.ContainerHBox.CheckBoxPrcsEvntLog.Click("8;12")
			Delay.Milliseconds(540)
			Report.Info("Mouse Left Click item 'WebDocumentIceFishHash.ContainerHBox.CheckBoxMsgEvntLog' at 6;8.")
			repo.WebDocumentIceFishHash.ContainerHBox.CheckBoxMsgEvntLog.Click("6;8")
			Delay.Milliseconds(2190)
			Report.Info("Mouse Left Click item 'WebDocumentIceFishHash.ContainerHBox.ButtonSave1' at Center.")
			repo.WebDocumentIceFishHash.ContainerHBox.ButtonSave1.Click()
			Delay.Milliseconds(2440)
			Report.Info("Mouse Left Click item 'WebDocumentIceFishHash.FlexObjectIceFish.ButtonOK' at Center.")
			repo.WebDocumentIceFishHash.FlexObjectIceFish.ButtonOK.Click()
			Delay.Milliseconds(3130)
			Report.Info("Key 'F11' Press.")
			Keyboard.Press(Keys.F11, 87, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(3220)
			Report.Info("Mouse Left Click item 'WebDocumentIceFishHash.FlexObjectIceFish.TextProcess_Modeling_' at 17;6.")
			repo.WebDocumentIceFishHash.FlexObjectIceFish.TextProcess_Modeling_.Click("17;6")
			Delay.Milliseconds(1320)
			Report.Info("Mouse Left Click item 'WebDocumentIceFishHash.FlexObjectIceFish.MenuItemView_Process' at 66;7.")
			repo.WebDocumentIceFishHash.FlexObjectIceFish.MenuItemView_Process.Click("66;7")
			Delay.Milliseconds(790)
			Report.Info("Mouse Left Click item 'WebDocumentIceFishHash.ContainerMainArea.CellString' at 93;7.")
			repo.WebDocumentIceFishHash.ContainerMainArea.CellString.Click("93;7")
			Delay.Milliseconds(5850)
			Report.Info("Mouse Left Click item 'WebDocumentIceFishHash.ContainerHBox.ButtonDelete' at 43;11.")
			repo.WebDocumentIceFishHash.ContainerHBox.ButtonDelete.Click("43;11")
			Delay.Milliseconds(2290)
			Report.Info("Mouse Left Click item 'WebDocumentIceFishHash.FlexObjectIceFish.ButtonNo' at 43;9.")
			repo.WebDocumentIceFishHash.FlexObjectIceFish.ButtonNo.Click("43;9")
			Delay.Milliseconds(820)
			Recording10.Mouse_Click_ContainerHBox1()
			Delay.Milliseconds(1090)
			Report.Info("Mouse Left Click item 'WebDocumentIceFishHash.FlexObjectIceFish.TextProcess_Modeling_' at 33;6.")
			repo.WebDocumentIceFishHash.FlexObjectIceFish.TextProcess_Modeling_.Click("33;6")
			Delay.Milliseconds(9260)
			Report.Info("Mouse Left Click item 'WebDocumentIceFishHash.ContainerHBox.TextNameText' at 6;11.")
			repo.WebDocumentIceFishHash.ContainerHBox.TextNameText.Click("6;11")
			Delay.Milliseconds(1380)
			Report.Info("Key 'Tab' Press.")
			Keyboard.Press(Keys.Tab, 15, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(5360)
			Report.Info("Key sequence 'modified'.")
			Keyboard.Press("modified")
			Delay.Milliseconds(2200)
			Report.Info("Mouse Left Click item 'WebDocumentIceFishHash.ContainerHBox.ButtonSave1' at 35;12.")
			repo.WebDocumentIceFishHash.ContainerHBox.ButtonSave1.Click("35;12")
			Delay.Milliseconds(1570)
			Report.Info("Mouse Left Click item 'WebDocumentIceFishHash.FlexObjectIceFish.ButtonOK' at 49;16.")
			repo.WebDocumentIceFishHash.FlexObjectIceFish.ButtonOK.Click("49;16")
			Delay.Milliseconds(2120)
			Report.Info("Mouse Left Click item 'WebDocumentIceFishHash.FlexObjectIceFish.TextProcess_Modeling_' at 28;3.")
			repo.WebDocumentIceFishHash.FlexObjectIceFish.TextProcess_Modeling_.Click("28;3")
			Delay.Milliseconds(1980)
			Report.Info("Mouse Left Click item 'WebDocumentIceFishHash.FlexObjectIceFish.MenuItemView_Process' at 77;9.")
			repo.WebDocumentIceFishHash.FlexObjectIceFish.MenuItemView_Process.Click("77;9")
			Delay.Milliseconds(790)
			Recording10.Mouse_Click_CellString1()
			Delay.Milliseconds(1100)
			Report.Info("Mouse Left Click item 'WebDocumentIceFishHash.FlexObjectIceFish.TextProcess_Modeling_' at 24;5.")
			repo.WebDocumentIceFishHash.FlexObjectIceFish.TextProcess_Modeling_.Click("24;5")
			Delay.Milliseconds(2730)
			Report.Info("Mouse Left Click item 'WebDocumentIceFishHash.ContainerHBox.TextNameText' at 7;13.")
			repo.WebDocumentIceFishHash.ContainerHBox.TextNameText.Click("7;13")
			Delay.Milliseconds(1790)
			Report.Info("Key 'Tab' Press.")
			Keyboard.Press(Keys.Tab, 15, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(1660)
			Report.Info("Key sequence 'test'.")
			Keyboard.Press("test")
			Delay.Milliseconds(1380)
			Report.Info("Key 'D1' Press.")
			Keyboard.Press(Keys.D1, 2, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(11140)
			Report.Info("Mouse Left Click item 'WebDocumentIceFishHash.ContainerHBox.ButtonSave1' at 30;10.")
			repo.WebDocumentIceFishHash.ContainerHBox.ButtonSave1.Click("30;10")
			Delay.Milliseconds(2940)
			Report.Info("Mouse Left Click item 'WebDocumentIceFishHash.FlexObjectIceFish.ButtonOK' at 46;8.")
			repo.WebDocumentIceFishHash.FlexObjectIceFish.ButtonOK.Click("46;8")
			Delay.Milliseconds(3540)
			Report.Info("Mouse Left Click item 'WebDocumentIceFishHash.ContainerHBox.ButtonPublish' at 40;8.")
			repo.WebDocumentIceFishHash.ContainerHBox.ButtonPublish.Click("40;8")
			Delay.Milliseconds(2120)
			Report.Info("Mouse Left Click item 'WebDocumentIceFishHash.FlexObjectIceFish.ButtonOK1' at 47;8.")
			repo.WebDocumentIceFishHash.FlexObjectIceFish.ButtonOK1.Click("47;8")
			Delay.Milliseconds(2770)
			Report.Info("Mouse Left Click item 'WebDocumentIceFishHash.FlexObjectIceFish.TextProcess_Modeling_' at 34;4.")
			repo.WebDocumentIceFishHash.FlexObjectIceFish.TextProcess_Modeling_.Click("34;4")
			Delay.Milliseconds(2660)
			Report.Info("Mouse Left Click item 'WebDocumentIceFishHash.FlexObjectIceFish.MenuItemView_Process' at 77;9.")
			repo.WebDocumentIceFishHash.FlexObjectIceFish.MenuItemView_Process.Click("77;9")
			Delay.Milliseconds(790)
			Recording10.Mouse_Click_ContainerHBox3()
			Delay.Milliseconds(1070)
			Report.Info("Mouse Left Click item 'WebDocumentIceFishHash.FlexObjectIceFish.TextProcess_Modeling_' at 28;3.")
			repo.WebDocumentIceFishHash.FlexObjectIceFish.TextProcess_Modeling_.Click("28;3")
			Delay.Milliseconds(2050)
			Report.Info("Mouse Left Click item 'WebDocumentIceFishHash.ContainerHBox.TextNameText' at 4;13.")
			repo.WebDocumentIceFishHash.ContainerHBox.TextNameText.Click("4;13")
			Delay.Milliseconds(1400)
			Report.Info("Key 'Tab' Press.")
			Keyboard.Press(Keys.Tab, 15, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(2330)
			Report.Info("Key sequence 'test'.")
			Keyboard.Press("test")
			Delay.Milliseconds(1200)
			Report.Info("Key 'D2' Press.")
			Keyboard.Press(Keys.D2, 3, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(1680)
			Report.Info("Mouse Left Click item 'WebDocumentIceFishHash.ContainerHBox.ButtonSave1' at 21;12.")
			repo.WebDocumentIceFishHash.ContainerHBox.ButtonSave1.Click("21;12")
			Delay.Milliseconds(4180)
			Report.Info("Mouse Left Click item 'WebDocumentIceFishHash.FlexObjectIceFish.ButtonOK' at 46;9.")
			repo.WebDocumentIceFishHash.FlexObjectIceFish.ButtonOK.Click("46;9")
			Delay.Milliseconds(3590)
			Report.Info("Mouse Left Click item 'WebDocumentIceFishHash.FlexObjectIceFish.TextProcess_Modeling_' at 21;3.")
			repo.WebDocumentIceFishHash.FlexObjectIceFish.TextProcess_Modeling_.Click("21;3")
			Delay.Milliseconds(1120)
			Report.Info("Mouse Left Click item 'WebDocumentIceFishHash.FlexObjectIceFish.MenuItemView_Process' at 80;7.")
			repo.WebDocumentIceFishHash.FlexObjectIceFish.MenuItemView_Process.Click("80;7")
			Delay.Milliseconds(790)
			Recording10.Mouse_Click_ContainerHBox4()
			Delay.Milliseconds(1120)
		End Sub

#Region "Image Feature Data"
#End Region

	End Class

End Namespace