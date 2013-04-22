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

Namespace Validation_Creation_templates
	''' <summary>
	''' The IbmMQ recording.
	''' </summary>
	Partial Public Class IbmMQ

		Public Shared repo as Validation_Creation_templatesRepository = Validation_Creation_templatesRepository.Instance

		<System.CodeDom.Compiler.GeneratedCode("Ranorex", "2.3.6")> _
		Public Shared Sub Start()
			Mouse.DefaultMoveTime = 300
			Keyboard.DefaultKeyPressTime = 100
			Delay.SpeedFactor = 1.0

			Report.Info("Mouse Left Click item 'WebDocument10_200_123_11_8080.ContainerVBox1.ButtonEndpoints' at 100;14.")
			repo.WebDocument10_200_123_11_8080.ContainerVBox1.ButtonEndpoints.Click("100;14")
			Delay.Milliseconds(2070)
			Report.Info("Mouse Left Down item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.PictureIcon_41' at 11;15.")
			repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.PictureIcon_41.MoveTo("11;15")
			Mouse.ButtonDown(MouseButtons.Left)
			Delay.Milliseconds(1260)
			Report.Info("Mouse Left Up item 'WebDocument10_200_123_11_8080.ContainerHBox.ContainerGraphCanvas' at 315;233.")
			repo.WebDocument10_200_123_11_8080.ContainerHBox.ContainerGraphCanvas.MoveTo("315;233")
			Mouse.ButtonUp(MouseButtons.Left)
			Delay.Milliseconds(1620)
			Report.Info("Mouse Right Click item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.PictureIcon_47_18479' at 18;18.")
			repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.PictureIcon_47_18479.Click(MouseButtons.Right, "18;18")
			Delay.Milliseconds(1880)
			Report.Info("Mouse Left Click item 'ContextMenuIexplore.MenuItemConfigure_Component' at 23;0.")
			repo.ContextMenuIexplore.MenuItemConfigure_Component.Click("23;0", 209)
			Delay.Milliseconds(0)
			Report.Info("Validating AttributeEqual (Text='Service Id') on item 'WebDocument10_200_123_11_8080.FormForm1.TextService_Id'.")
'			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FormForm1.TextService_IdInfo, "Text", "Service Id")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Text='Broker Url') on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextBroker_Url'.")
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextBroker_UrlInfo, "Text", "Broker Url")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Text='Port') on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextPort'.")
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextPortInfo, "Text", "Port")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Text='Queue Manager') on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextQueue_Manager'.")
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextQueue_ManagerInfo, "Text", "Queue Manager")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Text='Channel') on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextChannel'.")
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextChannelInfo, "Text", "Channel")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Text='Delivery Mode') on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextDelivery_Mode'.")
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextDelivery_ModeInfo, "Text", "Delivery Mode")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Text='User Name') on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextUser_Name'.")
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextUser_NameInfo, "Text", "User Name")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Text='Password') on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextPassword2'.")
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextPassword2Info, "Text", "Password")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Text='Destination') on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextDestination'.")
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextDestinationInfo, "Text", "Destination")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Text='SSL Enabled') on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextSSL_Enabled'.")
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextSSL_EnabledInfo, "Text", "SSL Enabled")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Text='SSL KeyStore Location') on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextSSL_KeyStore_Location'.")
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextSSL_KeyStore_LocationInfo, "Text", "SSL KeyStore Location")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Text='SSL Cipher Suite') on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextSSL_Cipher_Suite'.")
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextSSL_Cipher_SuiteInfo, "Text", "SSL Cipher Suite")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Text='SSL KeyStore Password') on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextSSL_KeyStore_Password'.")
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextSSL_KeyStore_PasswordInfo, "Text", "SSL KeyStore Password")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Text='SSL Fips Required') on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextSSL_Fips_Required'.")
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextSSL_Fips_RequiredInfo, "Text", "SSL Fips Required")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Text='SSL Fips Required') on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextSSL_Fips_Required'.")
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextSSL_Fips_RequiredInfo, "Text", "SSL Fips Required")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Text='SSL Algorithm') on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextSSL_Algorithm'.")
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextSSL_AlgorithmInfo, "Text", "SSL Algorithm")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Text='SSL Algorithm') on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextSSL_Algorithm'.")
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextSSL_AlgorithmInfo, "Text", "SSL Algorithm")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Text='SSL TrustStore Location') on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextSSL_TrustStore_Location'.")
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextSSL_TrustStore_LocationInfo, "Text", "SSL TrustStore Location")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Text='Save') on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonSave1'.")
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonSave1Info, "Text", "Save")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Text='Cancel') on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonCancel1'.")
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonCancel1Info, "Text", "Cancel")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Text='Save as Template...') on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonSave_as_Template___'.")
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonSave_as_Template___Info, "Text", "Save as Template...")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Text='Load template...') on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonLoad_template___'.")
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonLoad_template___Info, "Text", "Load template...")
			Delay.Milliseconds(1100)
			Report.Info("Mouse Left Click item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextBrokerUrl' at 32;17.")
			repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextBrokerUrl.Click("32;17")
			Delay.Milliseconds(1130)
			Report.Info("Key sequence '{NumPad1}{NumPad0}{Decimal}{NumPad2}{NumPad0}{NumPad0}{Decimal}{NumPad2}{NumPad0}{Decimal}{NumPad3}{NumPad6}'.")
			Keyboard.Press("{NumPad1}{NumPad0}{Decimal}{NumPad2}{NumPad0}{NumPad0}{Decimal}{NumPad2}{NumPad0}{Decimal}{NumPad3}{NumPad6}")
			Delay.Milliseconds(3290)
			Report.Info("Mouse Left Click item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextPort1' at 42;9.")
			repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextPort1.Click("42;9")
			Delay.Milliseconds(1010)
			Report.Info("Key sequence '{NumPad1}{NumPad5}{NumPad2}{NumPad1}'.")
			Keyboard.Press("{NumPad1}{NumPad5}{NumPad2}{NumPad1}")
			Delay.Milliseconds(1810)
			Report.Info("Mouse Left Click item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextQueueManager' at 10;7.")
			repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextQueueManager.Click("10;7")
			Delay.Milliseconds(1080)
			Report.Info("Key sequence '{Capital}ICEFISH'.")
			Keyboard.Press("{Capital}ICEFISH")
			Delay.Milliseconds(2760)
			Report.Info("Mouse Left Click item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextChannel1' at 19;11.")
			repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextChannel1.Click("19;11")
			Delay.Milliseconds(1160)
			Report.Info("Key sequence 'ICEFISH'.")
			Keyboard.Press("ICEFISH")
			Delay.Milliseconds(1140)
			Report.Info("Key sequence '.JPMC'.")
			Keyboard.Press(".JPMC")
			Delay.Milliseconds(1870)
			Report.Info("Mouse Left Click item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextDeliveryMode' at 22;5.")
			repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextDeliveryMode.Click("22;5")
			Delay.Milliseconds(1230)
			Report.Info("Key 'D1' Press.")
			Keyboard.Press(Keys.D1, 2, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(500)
			Report.Info("Mouse Left Click item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextUserName2' at 19;9.")
			repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextUserName2.Click("19;9")
			Delay.Milliseconds(930)
			Report.Info("Key sequence '{Capital}{LShiftKey down}A{LShiftKey up}dministr'.")
			Keyboard.Press("{Capital}{LShiftKey down}A{LShiftKey up}dministr")
			Delay.Milliseconds(2060)
			Report.Info("Key sequence 'ator'.")
			Keyboard.Press("ator")
			Delay.Milliseconds(1410)
			Report.Info("Mouse Left Click item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextPassword3' at 25;8.")
			repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextPassword3.Click("25;8")
			Delay.Milliseconds(2100)
			Report.Info("Key sequence '{LShiftKey down}H{LShiftKey up}eadstrong{LShiftKey down}!@#{LShiftKey up}'.")
			Keyboard.Press("{LShiftKey down}H{LShiftKey up}eadstrong{LShiftKey down}!@#{LShiftKey up}")
			Delay.Milliseconds(2110)
			Report.Info("Mouse Left Click item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextDestination1' at 25;3.")
			repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextDestination1.Click("25;3")
			Delay.Milliseconds(1690)
			Report.Info("Key 'LShiftKey, Shift' Down.")
			Keyboard.Down(Keys.LShiftKey, 42, False)
			Delay.Milliseconds(210)
			Report.Info("Key 'I, Shift' Press.")
			Keyboard.Press(Keys.I, 23, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(570)
			Report.Info("Key sequence 'BM'.")
			Keyboard.Press("BM")
			Delay.Milliseconds(1500)
			Report.Info("Key sequence 'MQ{LShiftKey up}'.")
			Keyboard.Press("MQ{LShiftKey up}")
			Delay.Milliseconds(1800)
			Report.Info("Key 'LShiftKey, Shift' Down.")
			Keyboard.Down(Keys.LShiftKey, 42, False)
			Delay.Milliseconds(780)
			Report.Info("Key sequence 'D{LShiftKey up}est'.")
			Keyboard.Press("D{LShiftKey up}est")
			Delay.Milliseconds(2700)
			Report.Info("Mouse Left Click item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonSave_as_Template___' at 66;16.")
			repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonSave_as_Template___.Click("66;16")
			Delay.Milliseconds(1330)
			Report.Info("Mouse Left Click item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextTextInput4' at 102;19.")
			repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextTextInput4.Click("102;19")
			Delay.Milliseconds(830)
			Report.Info("Key sequence '{LShiftKey down}I{LShiftKey up}'.")
			Keyboard.Press("{LShiftKey down}I{LShiftKey up}")
			Delay.Milliseconds(740)
			Report.Info("Key sequence 'bm{LShiftKey down}M{LShiftKey up}q'.")
			Keyboard.Press("bm{LShiftKey down}M{LShiftKey up}q")
			Delay.Milliseconds(1940)
			Report.Info("Mouse Left Click item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonSave' at 28;16.")
			repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonSave.Click("28;16")
			Delay.Milliseconds(1660)
			Report.Info("Mouse Left Click item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonOK2' at 32;5.")
			repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonOK2.Click("32;5")
			Delay.Milliseconds(1680)
			Report.Info("Mouse Left Click item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonLoad_template___' at 62;13.")
			repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonLoad_template___.Click("62;13")
			Delay.Milliseconds(1410)
			Report.Info("Mouse Left Click item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextTextInput6' at 34;8.")
			repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextTextInput6.Click("34;8")
			Delay.Milliseconds(1370)
			Report.Info("Mouse Left Click item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextIbmMq' at 26;1.")
			repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextIbmMq.Click("26;1")
			Delay.Milliseconds(1270)
			Report.Info("Mouse Left Click item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonCancel1' at 40;12.")
			repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonCancel1.Click("40;12")
			Delay.Milliseconds(1550)
			Report.Info("Mouse Left Click item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonSave1' at 46;9.")
			repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonSave1.Click("46;9")
			Delay.Milliseconds(820)
		End Sub

#Region "Image Feature Data"
#End Region

	End Class

End Namespace