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
	''' The Recording11 recording.
	''' </summary>
	Partial Public Class Recording11

		Public Shared repo as Project11Repository = Project11Repository.Instance

		<System.CodeDom.Compiler.GeneratedCode("Ranorex", "2.3.6")> _
		Public Shared Sub Start()
			Mouse.DefaultMoveTime = 300
			Keyboard.DefaultKeyPressTime = 100
			Delay.SpeedFactor = 1.0

			Report.Info("Mouse Left Click item 'WebDocumentIceFish.ContainerMainArea.TextUserIdTextInput' at 38;10.")
			repo.WebDocumentIceFish.ContainerMainArea.TextUserIdTextInput.Click("38;10")
			Delay.Milliseconds(900)
			Report.Info("Key sequence 'icefish'.")
			Keyboard.Press("icefish")
			Delay.Milliseconds(2840)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.ContainerMainArea.TextPasswordTextInput' at 37;9.")
			repo.WebDocumentIceFish.ContainerMainArea.TextPasswordTextInput.Click("37;9")
			Delay.Milliseconds(660)
			Report.Info("Key sequence 'icefish'.")
			Keyboard.Press("icefish")
			Delay.Milliseconds(1810)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.ContainerMainArea.ButtonSubmit' at 48;7.")
			repo.WebDocumentIceFish.ContainerMainArea.ButtonSubmit.Click("48;7")
			Delay.Milliseconds(3900)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.ContainerVBox.ButtonNew' at 26;9.")
			repo.WebDocumentIceFish.ContainerVBox.ButtonNew.Click("26;9")
			Delay.Milliseconds(5130)
			Report.Info("Mouse Left Down item 'WebDocumentIceFish.ContainerVBox.PictureIcon_1' at Center.")
			repo.WebDocumentIceFish.ContainerVBox.PictureIcon_1.MoveTo()
			Mouse.ButtonDown(MouseButtons.Left)
			Delay.Milliseconds(1370)
			Report.Info("Mouse Left Up item 'WebDocumentIceFish.ContainerVBox.ContainerGraphCanvas' at 137;113.")
			repo.WebDocumentIceFish.ContainerVBox.ContainerGraphCanvas.MoveTo("137;113")
			Mouse.ButtonUp(MouseButtons.Left)
			Delay.Milliseconds(2320)
			Report.Info("Mouse Left Down item 'WebDocumentIceFish.ContainerVBox.PictureIcon_3' at 7;9.")
			repo.WebDocumentIceFish.ContainerVBox.PictureIcon_3.MoveTo("7;9")
			Mouse.ButtonDown(MouseButtons.Left)
			Delay.Milliseconds(2200)
			Report.Info("Mouse Left Up item 'WebDocumentIceFish.ContainerVBox.ContainerGraphCanvas' at 339;122.")
			repo.WebDocumentIceFish.ContainerVBox.ContainerGraphCanvas.MoveTo("339;122")
			Mouse.ButtonUp(MouseButtons.Left)
			Delay.Milliseconds(2430)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.ContainerHBox.ButtonRouters' at 74;8.")
			repo.WebDocumentIceFish.ContainerHBox.ButtonRouters.Click("74;8")
			Delay.Milliseconds(1930)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.ContainerHBox.PictureLine' at 11;7.")
			repo.WebDocumentIceFish.ContainerHBox.PictureLine.Click("11;7")
			Delay.Milliseconds(1080)
			Report.Info("Mouse Left Down item 'WebDocumentIceFish.ContainerHBox.PictureIcon_1_8874' at 25;22.")
			repo.WebDocumentIceFish.ContainerHBox.PictureIcon_1_8874.MoveTo("25;22")
			Mouse.ButtonDown(MouseButtons.Left)
			Delay.Milliseconds(1270)
			Report.Info("Mouse Left Up item 'WebDocumentIceFish.ContainerHBox.PictureIcon_3_29083' at 25;19.")
			repo.WebDocumentIceFish.ContainerHBox.PictureIcon_3_29083.MoveTo("25;19")
			Mouse.ButtonUp(MouseButtons.Left)
			Delay.Milliseconds(2620)
			Report.Info("Mouse Right Click item 'WebDocumentIceFish.ContainerHBox.PictureIcon_1_8874' at 12;19.")
			repo.WebDocumentIceFish.ContainerHBox.PictureIcon_1_8874.Click(MouseButtons.Right, "12;19")
			Delay.Milliseconds(1120)
			Report.Info("Mouse Left Click item 'ContextMenuIexplore.MenuItemConfigure_Component' at 32;9.")
			repo.ContextMenuIexplore.MenuItemConfigure_Component.Click("32;9")
			Delay.Milliseconds(1850)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.TextServiceId' at 21;10.")
			repo.WebDocumentIceFish.FlexObjectIceFish.TextServiceId.Click("21;10")
			Delay.Milliseconds(3980)
			Report.Info("Key sequence 'dbsource'.")
			Keyboard.Press("dbsource")
			Delay.Milliseconds(2370)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FormForm.TextServerURL' at 68;10.")
			repo.WebDocumentIceFish.FormForm.TextServerURL.Click("68;10")
			Delay.Milliseconds(2910)
			Report.Info("Key sequence 'jd'.")
			Keyboard.Press("jd")
			Delay.Milliseconds(730)
			Report.Info("Key sequence 'bc'.")
			Keyboard.Press("bc")
			Delay.Milliseconds(640)
			Report.Info("Key sequence '{RShiftKey down}:{RShiftKey up}'.")
			Keyboard.Press("{RShiftKey down}:{RShiftKey up}")
			Delay.Milliseconds(1180)
			Report.Info("Key sequence 'oracle'.")
			Keyboard.Press("oracle")
			Delay.Milliseconds(1960)
			Report.Info("Key sequence '{RShiftKey down}:{RShiftKey up}'.")
			Keyboard.Press("{RShiftKey down}:{RShiftKey up}")
			Delay.Milliseconds(540)
			Report.Info("Key sequence 'thin'.")
			Keyboard.Press("thin")
			Delay.Milliseconds(1350)
			Report.Info("Key sequence '{RShiftKey down}:{RShiftKey up}'.")
			Keyboard.Press("{RShiftKey down}:{RShiftKey up}")
			Delay.Milliseconds(990)
			Report.Info("Key sequence '{LShiftKey down}@{LShiftKey up}'.")
			Keyboard.Press("{LShiftKey down}@{LShiftKey up}")
			Delay.Milliseconds(2070)
			Report.Info("Key sequence '10'.")
			Keyboard.Press("10")
			Delay.Milliseconds(1280)
			Report.Info("Key sequence '.200'.")
			Keyboard.Press(".200")
			Delay.Milliseconds(1860)
			Report.Info("Key 'OemPeriod' Press.")
			Keyboard.Press(Keys.OemPeriod, 52, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(570)
			Report.Info("Key sequence '20'.")
			Keyboard.Press("20")
			Delay.Milliseconds(1200)
			Report.Info("Key 'OemPeriod' Press.")
			Keyboard.Press(Keys.OemPeriod, 52, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(1070)
			Report.Info("Key sequence '36'.")
			Keyboard.Press("36")
			Delay.Milliseconds(1890)
			Report.Info("Key 'OemPeriod' Press.")
			Keyboard.Press(Keys.OemPeriod, 52, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(740)
			Report.Info("Key 'D1' Press.")
			Keyboard.Press(Keys.D1, 2, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(640)
			Report.Info("Key sequence '521'.")
			Keyboard.Press("521")
			Delay.Milliseconds(1590)
			Report.Info("Key sequence '{RShiftKey down}:{RShiftKey up}'.")
			Keyboard.Press("{RShiftKey down}:{RShiftKey up}")
			Delay.Milliseconds(520)
			Report.Info("Key sequence 'ice'.")
			Keyboard.Press("ice")
			Delay.Milliseconds(1350)
			Report.Info("Key sequence 'fish'.")
			Keyboard.Press("fish")
			Delay.Milliseconds(1060)
			Report.Info("Key sequence 'core'.")
			Keyboard.Press("core")
			Delay.Milliseconds(910)
			Report.Info("Key 'U' Press.")
			Keyboard.Press(Keys.U, 22, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(1050)
			Report.Info("Key sequence 'nix'.")
			Keyboard.Press("nix")
			Delay.Milliseconds(2400)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FormForm.TextUserName' at 63;16.")
			repo.WebDocumentIceFish.FormForm.TextUserName.Click("63;16")
			Delay.Milliseconds(540)
			Report.Info("Key sequence 'scott'.")
			Keyboard.Press("scott")
			Delay.Milliseconds(2230)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FormForm.TextPassword' at 58;14.")
			repo.WebDocumentIceFish.FormForm.TextPassword.Click("58;14")
			Delay.Milliseconds(850)
			Report.Info("Key sequence 'ice{Capital}F{Capital}ish{LShiftKey down}@{LShiftKey up}1234'.")
			Keyboard.Press("ice{Capital}F{Capital}ish{LShiftKey down}@{LShiftKey up}1234")
			Delay.Milliseconds(3380)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FormForm.TextQuery' at 57;7.")
			repo.WebDocumentIceFish.FormForm.TextQuery.Click("57;7")
			Delay.Milliseconds(1240)
			Report.Info("Key sequence 'selec'.")
			Keyboard.Press("selec")
			Delay.Milliseconds(1500)
			Report.Info("Key sequence 't{Space}id,'.")
			Keyboard.Press("t{Space}id,")
			Delay.Milliseconds(1730)
			Report.Info("Key sequence 'ename'.")
			Keyboard.Press("ename")
			Delay.Milliseconds(1200)
			Report.Info("Key sequence '{Space}from'.")
			Keyboard.Press("{Space}from")
			Delay.Milliseconds(870)
			Report.Info("Key sequence '{Space}test{RShiftKey down}_{RShiftKey up}src{Space}where'.")
			Keyboard.Press("{Space}test{RShiftKey down}_{RShiftKey up}src{Space}where")
			Delay.Milliseconds(3090)
			Report.Info("Key sequence '{Space}state'.")
			Keyboard.Press("{Space}state")
			Delay.Milliseconds(1790)
			Report.Info("Key sequence '=''.")
			Keyboard.Press("='")
			Delay.Milliseconds(1060)
			Report.Info("Key sequence '{Capital}CLOSED'.")
			Keyboard.Press("{Capital}CLOSED")
			Delay.Milliseconds(1470)
			Report.Info("Key 'Oem7' Press.")
			Keyboard.Press(Keys.Oem7, 40, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(2020)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FormForm.TextWaitInterval' at 50;14.")
			repo.WebDocumentIceFish.FormForm.TextWaitInterval.Click("50;14")
			Delay.Milliseconds(630)
			Report.Info("Key sequence '1000'.")
			Keyboard.Press("1000")
			Delay.Milliseconds(1440)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FormForm.ButtonButton' at 122;10.")
			repo.WebDocumentIceFish.FormForm.ButtonButton.Click("122;10")
			Delay.Milliseconds(630)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.TextOracle' at 64;11.")
			repo.WebDocumentIceFish.FlexObjectIceFish.TextOracle.Click("64;11")
			Delay.Milliseconds(440)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FormForm.TextUpdateQuery' at 86;4.")
			repo.WebDocumentIceFish.FormForm.TextUpdateQuery.Click("86;4")
			Delay.Milliseconds(2020)
			Report.Info("Key sequence '{Capital}update'.")
			Keyboard.Press("{Capital}update")
			Delay.Milliseconds(1370)
			Report.Info("Key sequence '{Space}test'.")
			Keyboard.Press("{Space}test")
			Delay.Milliseconds(1760)
			Report.Info("Key sequence '{RShiftKey down}_{RShiftKey up}'.")
			Keyboard.Press("{RShiftKey down}_{RShiftKey up}")
			Delay.Milliseconds(2710)
			Report.Info("Key sequence 'src{Space}'.")
			Keyboard.Press("src{Space}")
			Delay.Milliseconds(1140)
			Report.Info("Key sequence 'set{Space}state'.")
			Keyboard.Press("set{Space}state")
			Delay.Milliseconds(2220)
			Report.Info("Key sequence '='{Capital}OPEN'.")
			Keyboard.Press("='{Capital}OPEN")
			Delay.Milliseconds(2190)
			Report.Info("Key 'Oem7' Press.")
			Keyboard.Press(Keys.Oem7, 40, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(1330)
			Report.Info("Key sequence '{Space}{Capital}where'.")
			Keyboard.Press("{Space}{Capital}where")
			Delay.Milliseconds(1150)
			Report.Info("Key sequence '{Space}state'.")
			Keyboard.Press("{Space}state")
			Delay.Milliseconds(2130)
			Report.Info("Key sequence '='{Capital}CLOSED'.")
			Keyboard.Press("='{Capital}CLOSED")
			Delay.Milliseconds(3560)
			Report.Info("Key 'Capital' Press.")
			Keyboard.Press(Keys.Capital, 58, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(1850)
			Report.Info("Key 'Oem7' Press.")
			Keyboard.Press(Keys.Oem7, 40, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(1070)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FormForm.TextReadSize' at 94;8.")
			repo.WebDocumentIceFish.FormForm.TextReadSize.Click("94;8")
			Delay.Milliseconds(1190)
			Report.Info("Key sequence '10000'.")
			Keyboard.Press("10000")
			Delay.Milliseconds(1680)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.ButtonSave' at 36;9.")
			repo.WebDocumentIceFish.FlexObjectIceFish.ButtonSave.Click("36;9")
			Delay.Milliseconds(770)
			Report.Info("Mouse Right Click item 'WebDocumentIceFish.ContainerHBox.PictureIcon_3_29083' at 24;22.")
			repo.WebDocumentIceFish.ContainerHBox.PictureIcon_3_29083.Click(MouseButtons.Right, "24;22")
			Delay.Milliseconds(1150)
			Report.Info("Mouse Left Click item 'ContextMenuIexplore.MenuItemConfigure_Component' at 62;10.")
			repo.ContextMenuIexplore.MenuItemConfigure_Component.Click("62;10")
			Delay.Milliseconds(1090)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FormForm.TextServiceId' at 78;11.")
			repo.WebDocumentIceFish.FormForm.TextServiceId.Click("78;11")
			Delay.Milliseconds(1320)
			Report.Info("Key sequence 'DESTINATION'.")
			Keyboard.Press("DESTINATION")
			Delay.Milliseconds(2210)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FormForm.TextDirectory' at 73;12.")
			repo.WebDocumentIceFish.FormForm.TextDirectory.Click("73;12")
			Delay.Milliseconds(1370)
			Report.Info("Key sequence 'C{RShiftKey down}:{RShiftKey up}'.")
			Keyboard.Press("C{RShiftKey down}:{RShiftKey up}")
			Delay.Milliseconds(1350)
			Report.Info("Key 'Oem5' Press.")
			Keyboard.Press(Keys.Oem5, 43, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(540)
			Report.Info("Key sequence 'T{Capital}est'.")
			Keyboard.Press("T{Capital}est")
			Delay.Milliseconds(2530)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.ButtonSave' at 35;8.")
			repo.WebDocumentIceFish.FlexObjectIceFish.ButtonSave.Click("35;8")
			Delay.Milliseconds(850)
			Report.Info("Key 'Capital' Press.")
			Keyboard.Press(Keys.Capital, 58, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(1080)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.ContainerVBox.TextNameText' at 143;9.")
			repo.WebDocumentIceFish.ContainerVBox.TextNameText.Click("143;9")
			Delay.Milliseconds(2020)
			Report.Info("Key sequence 'Headstrong'.")
			Keyboard.Press("Headstrong")
			Delay.Milliseconds(260)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.ContainerVBox.CheckBoxRecovery' at 3;10.")
			repo.WebDocumentIceFish.ContainerVBox.CheckBoxRecovery.Click("3;10")
			Delay.Milliseconds(520)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.ContainerVBox.CheckBoxPrcsEvntLog' at 4;5.")
			repo.WebDocumentIceFish.ContainerVBox.CheckBoxPrcsEvntLog.Click("4;5")
			Delay.Milliseconds(550)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.ContainerVBox.CheckBoxMsgEvntLog' at 4;8.")
			repo.WebDocumentIceFish.ContainerVBox.CheckBoxMsgEvntLog.Click("4;8")
			Delay.Milliseconds(1510)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.ContainerVBox.ButtonSave1' at 34;10.")
			repo.WebDocumentIceFish.ContainerVBox.ButtonSave1.Click("34;10")
			Delay.Milliseconds(1710)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.ButtonOK' at 50;8.")
			repo.WebDocumentIceFish.FlexObjectIceFish.ButtonOK.Click("50;8")
			Delay.Milliseconds(1570)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.TextProcess_Modeling_' at 27;4.")
			repo.WebDocumentIceFish.FlexObjectIceFish.TextProcess_Modeling_.Click("27;4")
			Delay.Milliseconds(900)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.MenuItemView_Process' at 34;8.")
			repo.WebDocumentIceFish.FlexObjectIceFish.MenuItemView_Process.Click("34;8")
			Delay.Milliseconds(7760)
			Recording11.Mouse_Click_ContainerPanel1()
			Delay.Milliseconds(1100)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.TextProcess_Management_' at 87;4.")
			repo.WebDocumentIceFish.FlexObjectIceFish.TextProcess_Management_.Click("87;4")
			Delay.Milliseconds(1340)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.MenuItemProcesses_Status' at 78;9.")
			repo.WebDocumentIceFish.FlexObjectIceFish.MenuItemProcesses_Status.Click("78;9")
			Delay.Milliseconds(5440)
			Recording11.Mouse_Click_CellString1()
			Delay.Milliseconds(1090)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.TextProcess_Modeling_' at 36;6.")
			repo.WebDocumentIceFish.FlexObjectIceFish.TextProcess_Modeling_.Click("36;6")
			Delay.Milliseconds(4260)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.MenuItemView_Process' at 39;8.")
			repo.WebDocumentIceFish.FlexObjectIceFish.MenuItemView_Process.Click("39;8")
			Delay.Milliseconds(760)
			Recording11.Mouse_Click_ContainerPanel2()
			Delay.Milliseconds(1060)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.ContainerVBox.ButtonPublish' at 40;9.")
			repo.WebDocumentIceFish.ContainerVBox.ButtonPublish.Click("40;9")
			Delay.Milliseconds(2180)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.ButtonOK1' at 38;10.")
			repo.WebDocumentIceFish.FlexObjectIceFish.ButtonOK1.Click("38;10")
			Delay.Milliseconds(1930)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.TextProcess_Modeling_' at 19;0.")
			repo.WebDocumentIceFish.FlexObjectIceFish.TextProcess_Modeling_.Click("19;0")
			Delay.Milliseconds(1580)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.MenuItemView_Process' at 88;9.")
			repo.WebDocumentIceFish.FlexObjectIceFish.MenuItemView_Process.Click("88;9")
			Delay.Milliseconds(790)
			Recording11.Mouse_Click_ContainerPanel3()
			Delay.Milliseconds(1070)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.TextProcess_Management_' at 59;5.")
			repo.WebDocumentIceFish.FlexObjectIceFish.TextProcess_Management_.Click("59;5")
			Delay.Milliseconds(680)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.MenuItemProcesses_Status' at 64;8.")
			repo.WebDocumentIceFish.FlexObjectIceFish.MenuItemProcesses_Status.Click("64;8")
			Delay.Milliseconds(760)
			Recording11.Mouse_Click_ContainerPanel4()
			Delay.Milliseconds(1070)
			Recording11.Mouse_Click_CellString12()
			Delay.Milliseconds(2350)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.ContainerVBox1.ButtonButton' at 141;10.")
			repo.WebDocumentIceFish.ContainerVBox1.ButtonButton.Click("141;10")
			Delay.Milliseconds(1830)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.TextIceFish_server' at 64;10.")
			repo.WebDocumentIceFish.FlexObjectIceFish.TextIceFish_server.Click("64;10")
			Delay.Milliseconds(1070)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.ContainerVBox1.ButtonAssign' at 33;10.")
			repo.WebDocumentIceFish.ContainerVBox1.ButtonAssign.Click("33;10")
			Delay.Milliseconds(2150)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.ButtonOK2' at 41;10.")
			repo.WebDocumentIceFish.FlexObjectIceFish.ButtonOK2.Click("41;10")
			Delay.Milliseconds(760)
			Recording11.Mouse_Click_ContainerHBox1()
			Delay.Milliseconds(1090)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.ContainerVBox.ButtonStart' at 30;10.")
			repo.WebDocumentIceFish.ContainerVBox.ButtonStart.Click("30;10")
			Delay.Milliseconds(2240)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.ButtonOK3' at 42;9.")
			repo.WebDocumentIceFish.FlexObjectIceFish.ButtonOK3.Click("42;9")
			Delay.Milliseconds(770)
			Recording11.Mouse_Click_ContainerPanel5()
			Delay.Milliseconds(1060)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.TextProcess_Modeling_' at 26;4.")
			repo.WebDocumentIceFish.FlexObjectIceFish.TextProcess_Modeling_.Click("26;4")
			Delay.Milliseconds(2740)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.MenuItemView_Process' at 79;7.")
			repo.WebDocumentIceFish.FlexObjectIceFish.MenuItemView_Process.Click("79;7")
			Delay.Milliseconds(760)
			Recording11.Mouse_Click_Co()
			Delay.Milliseconds(1060)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.TextProcess_Modeling_' at 20;2.")
			repo.WebDocumentIceFish.FlexObjectIceFish.TextProcess_Modeling_.Click("20;2")
			Delay.Milliseconds(3100)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.TextProcess_Management_' at 86;7.")
			repo.WebDocumentIceFish.FlexObjectIceFish.TextProcess_Management_.Click("86;7")
			Delay.Milliseconds(980)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.MenuItemProcesses_Status' at 88;5.")
			repo.WebDocumentIceFish.FlexObjectIceFish.MenuItemProcesses_Status.Click("88;5")
			Delay.Milliseconds(760)
			Recording11.Mouse_Click_ContainerPanel7()
			Delay.Milliseconds(1060)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.ContainerVBox.ButtonStop' at 27;10.")
			repo.WebDocumentIceFish.ContainerVBox.ButtonStop.Click("27;10")
			Delay.Milliseconds(3570)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.ButtonOK3' at 33;11.")
			repo.WebDocumentIceFish.FlexObjectIceFish.ButtonOK3.Click("33;11")
			Delay.Milliseconds(740)
			Recording11.Mouse_Click_ContainerPanel8()
			Delay.Milliseconds(1070)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.TextProcess_Modeling_' at 50;3.")
			repo.WebDocumentIceFish.FlexObjectIceFish.TextProcess_Modeling_.Click("50;3")
			Delay.Milliseconds(1010)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.MenuItemView_Process' at 75;7.")
			repo.WebDocumentIceFish.FlexObjectIceFish.MenuItemView_Process.Click("75;7")
			Delay.Milliseconds(770)
			Recording11.Mouse_Click_ContainerHBox3()
			Delay.Milliseconds(1060)
		End Sub

#Region "Image Feature Data"
#End Region

	End Class

End Namespace
