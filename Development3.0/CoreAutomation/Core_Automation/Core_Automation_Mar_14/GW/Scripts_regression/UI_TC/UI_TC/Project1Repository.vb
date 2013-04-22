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
Imports System.Drawing
Imports Ranorex
Imports Ranorex.Core
Imports Ranorex.Core.Repository

Namespace UI_TC
	''' <summary>
	''' The class representing the Project1Repository element repository.
	''' </summary>
	<System.CodeDom.Compiler.GeneratedCode("Ranorex", "2.3.6")> _
	Partial Public Class Project1Repository
		Inherits RepoGenBaseFolder

		Shared _instance As Project1Repository

		''' <summary>
		''' Gets the singleton class instance representing the Project1Repository element repository.
		''' </summary>
		Public Shared ReadOnly Property Instance() As Project1Repository
			Get
				Return _instance
			End Get
		End Property

		''' <summary>
		''' Repository class static constructor.
		''' </summary>
		Shared Sub New()
			_instance = New Project1Repository()
		End Sub

		Dim _webdocument10_200_41_15_8880 As Project1RepositoryFolders.WebDocument10_200_41_15_8880AppFolder

		''' <summary>
		''' Repository class constructor.
		''' </summary>
		Public Sub New()
			MyBase.New("Project1Repository", "", Nothing, 30000, False)
			_webdocument10_200_41_15_8880 = New Project1RepositoryFolders.WebDocument10_200_41_15_8880AppFolder(Me)
		End Sub

		''' <summary>
		''' The WebDocument10_200_41_15_8880 folder.
		''' </summary>
		Public Overridable ReadOnly Property WebDocument10_200_41_15_8880 As Project1RepositoryFolders.WebDocument10_200_41_15_8880AppFolder
			Get
				Return _webdocument10_200_41_15_8880
			End Get
		End Property
	End Class

	''' <summary>
	''' Inner folder classes.
	''' </summary>
	Partial Public Class Project1RepositoryFolders
		''' <summary>
		''' The WebDocument10_200_41_15_8880AppFolder folder.
		''' </summary>
		Partial Public Class WebDocument10_200_41_15_8880AppFolder
			Inherits RepoGenBaseFolder
			Dim _flexobjecticefish As Project1RepositoryFolders.FlexObjectIceFishFolder
			Dim _selfInfo As RepoItemInfo

			''' <summary>
			''' Creates a new WebDocument10_200_41_15_8880  folder.
			''' </summary>
			Public Sub New(parentFolder As RepoGenBaseFolder)
				MyBase.New("WebDocument10_200_41_15_8880", "/dom[@domain~'^.*']", Nothing, 30000, False)

				_flexobjecticefish = New Project1RepositoryFolders.FlexObjectIceFishFolder(Me)
				_selfInfo = New RepoItemInfo(Me, "Self", "", 30000, Nothing)
			End Sub

			''' <summary>
			''' The Self item.
			''' </summary>
			Public Overridable ReadOnly Property Self As Ranorex.WebDocument
				Get
					Return _selfInfo.CreateAdapter(Of Ranorex.WebDocument)(True)
				End Get
			End Property

			''' <summary>
			''' The Self item info.
			''' </summary>
			Public Overridable ReadOnly Property SelfInfo As RepoItemInfo
				Get
					Return _selfInfo
				End Get
			End Property

			''' <summary>
			''' The FlexObjectIceFish folder.
			''' </summary>
			Public Overridable ReadOnly Property FlexObjectIceFish As Project1RepositoryFolders.FlexObjectIceFishFolder
				Get
					Return _flexobjecticefish
				End Get
			End Property
		End Class

		''' <summary>
		''' The FlexObjectIceFishFolder folder.
		''' </summary>
		Partial Public Class FlexObjectIceFishFolder
			Inherits RepoGenBaseFolder
			Dim _buttonnewInfo As RepoItemInfo
			Dim _buttoncloseInfo As RepoItemInfo
			Dim _buttonsaveInfo As RepoItemInfo
			Dim _somebutton1Info As RepoItemInfo
			Dim _somebuttonInfo As RepoItemInfo
			Dim _textrolesInfo As RepoItemInfo
			Dim _buttonbuttonInfo As RepoItemInfo
			Dim _textstatusasteriskInfo As RepoItemInfo
			Dim _textemailInfo As RepoItemInfo
			Dim _texttextinput4Info As RepoItemInfo
			Dim _textpasswordasteriskInfo As RepoItemInfo
			Dim _texttextinput3Info As RepoItemInfo
			Dim _textlast_nameInfo As RepoItemInfo
			Dim _texttextinput2Info As RepoItemInfo
			Dim _textfirst_nameasteriskInfo As RepoItemInfo
			Dim _texttextinput1Info As RepoItemInfo
			Dim _textuser_nameasteriskInfo As RepoItemInfo
			Dim _texttextinputInfo As RepoItemInfo
			Dim _textadminInfo As RepoItemInfo
			Dim _selfInfo As RepoItemInfo

			''' <summary>
			''' Creates a new FlexObjectIceFish  folder.
			''' </summary>
			Public Sub New(parentFolder As RepoGenBaseFolder)
				MyBase.New("FlexObjectIceFish", "body/flexobject", parentFolder, 10000, False)

				_buttonnewInfo = New RepoItemInfo(Me, "ButtonNew", "container/container[@id='mainArea']/container/element/container/button[@id='newButton']", 10000, Nothing)
				_buttoncloseInfo = New RepoItemInfo(Me, "ButtonClose", "form/element[@type='ControlBar']/button[@text='Close']", 10000, Nothing)
				_buttonsaveInfo = New RepoItemInfo(Me, "ButtonSave", "form/element[@type='ControlBar']/button[@text='Save']", 10000, Nothing)
				_somebutton1Info = New RepoItemInfo(Me, "SomeButton1", "form/form/container[1]/container/container/button[@text='<']", 10000, Nothing)
				_somebuttonInfo = New RepoItemInfo(Me, "SomeButton", "form/form/container[1]/container/container/button[@text='>']", 10000, Nothing)
				_textrolesInfo = New RepoItemInfo(Me, "TextRoles", "form/form/container[1]/text/text[@caption='Roles']", 10000, Nothing)
				_buttonbuttonInfo = New RepoItemInfo(Me, "ButtonButton", "form/form/container[2]/combobox/button[@type='Button']", 10000, Nothing)
				_textstatusasteriskInfo = New RepoItemInfo(Me, "TextStatusAsterisk", "form/form/container[2]/text/text[@caption='Status*']", 10000, Nothing)
				_textemailInfo = New RepoItemInfo(Me, "TextEmail", "form/form/container[3]/text[@type='FormItemLabel']/text[@caption='Email']", 10000, Nothing)
				_texttextinput4Info = New RepoItemInfo(Me, "TextTextInput4", "form/form/container[3]/text[@type='TextInput']", 10000, Nothing)
				_textpasswordasteriskInfo = New RepoItemInfo(Me, "TextPasswordAsterisk", "form/form/container[4]/text[@type='FormItemLabel']/text[@caption='Password*']", 10000, Nothing)
				_texttextinput3Info = New RepoItemInfo(Me, "TextTextInput3", "form/form/container[4]/text[@type='TextInput']", 10000, Nothing)
				_textlast_nameInfo = New RepoItemInfo(Me, "TextLast_Name", "form/form/container[5]/text[@type='FormItemLabel']/text[@caption='Last Name']", 10000, Nothing)
				_texttextinput2Info = New RepoItemInfo(Me, "TextTextInput2", "form/form/container[5]/text[@type='TextInput']", 10000, Nothing)
				_textfirst_nameasteriskInfo = New RepoItemInfo(Me, "TextFirst_NameAsterisk", "form/form/container[6]/text[@type='FormItemLabel']/text[@caption='First Name*']", 10000, Nothing)
				_texttextinput1Info = New RepoItemInfo(Me, "TextTextInput1", "form/form/container[6]/text[@type='TextInput']", 10000, Nothing)
				_textuser_nameasteriskInfo = New RepoItemInfo(Me, "TextUser_NameAsterisk", "form/form/container[7]/text[@type='FormItemLabel']/text[@caption='User Name*']", 10000, Nothing)
				_texttextinputInfo = New RepoItemInfo(Me, "TextTextInput", "form/form/container[7]/text[@type='TextInput']", 10000, Nothing)
				_textadminInfo = New RepoItemInfo(Me, "TextAdmin", "form/form/container[1]/container/list[2]/listitem[@text='admin']/text[@caption='admin']", 10000, Nothing)
				_selfInfo = New RepoItemInfo(Me, "Self", "", 10000, Nothing)
			End Sub

			''' <summary>
			''' The ButtonNew item.
			''' </summary>
			Public Overridable ReadOnly Property ButtonNew As Ranorex.Button
				Get
					Return _buttonnewInfo.CreateAdapter(Of Ranorex.Button)(True)
				End Get
			End Property

			''' <summary>
			''' The ButtonNew item info.
			''' </summary>
			Public Overridable ReadOnly Property ButtonNewInfo As RepoItemInfo
				Get
					Return _buttonnewInfo
				End Get
			End Property

			''' <summary>
			''' The ButtonClose item.
			''' </summary>
			Public Overridable ReadOnly Property ButtonClose As Ranorex.Button
				Get
					Return _buttoncloseInfo.CreateAdapter(Of Ranorex.Button)(True)
				End Get
			End Property

			''' <summary>
			''' The ButtonClose item info.
			''' </summary>
			Public Overridable ReadOnly Property ButtonCloseInfo As RepoItemInfo
				Get
					Return _buttoncloseInfo
				End Get
			End Property

			''' <summary>
			''' The ButtonSave item.
			''' </summary>
			Public Overridable ReadOnly Property ButtonSave As Ranorex.Button
				Get
					Return _buttonsaveInfo.CreateAdapter(Of Ranorex.Button)(True)
				End Get
			End Property

			''' <summary>
			''' The ButtonSave item info.
			''' </summary>
			Public Overridable ReadOnly Property ButtonSaveInfo As RepoItemInfo
				Get
					Return _buttonsaveInfo
				End Get
			End Property

			''' <summary>
			''' The SomeButton1 item.
			''' </summary>
			Public Overridable ReadOnly Property SomeButton1 As Ranorex.Button
				Get
					Return _somebutton1Info.CreateAdapter(Of Ranorex.Button)(True)
				End Get
			End Property

			''' <summary>
			''' The SomeButton1 item info.
			''' </summary>
			Public Overridable ReadOnly Property SomeButton1Info As RepoItemInfo
				Get
					Return _somebutton1Info
				End Get
			End Property

			''' <summary>
			''' The SomeButton item.
			''' </summary>
			Public Overridable ReadOnly Property SomeButton As Ranorex.Button
				Get
					Return _somebuttonInfo.CreateAdapter(Of Ranorex.Button)(True)
				End Get
			End Property

			''' <summary>
			''' The SomeButton item info.
			''' </summary>
			Public Overridable ReadOnly Property SomeButtonInfo As RepoItemInfo
				Get
					Return _somebuttonInfo
				End Get
			End Property

			''' <summary>
			''' The TextRoles item.
			''' </summary>
			Public Overridable ReadOnly Property TextRoles As Ranorex.Text
				Get
					Return _textrolesInfo.CreateAdapter(Of Ranorex.Text)(True)
				End Get
			End Property

			''' <summary>
			''' The TextRoles item info.
			''' </summary>
			Public Overridable ReadOnly Property TextRolesInfo As RepoItemInfo
				Get
					Return _textrolesInfo
				End Get
			End Property

			''' <summary>
			''' The ButtonButton item.
			''' </summary>
			Public Overridable ReadOnly Property ButtonButton As Ranorex.Button
				Get
					Return _buttonbuttonInfo.CreateAdapter(Of Ranorex.Button)(True)
				End Get
			End Property

			''' <summary>
			''' The ButtonButton item info.
			''' </summary>
			Public Overridable ReadOnly Property ButtonButtonInfo As RepoItemInfo
				Get
					Return _buttonbuttonInfo
				End Get
			End Property

			''' <summary>
			''' The TextStatusAsterisk item.
			''' </summary>
			Public Overridable ReadOnly Property TextStatusAsterisk As Ranorex.Text
				Get
					Return _textstatusasteriskInfo.CreateAdapter(Of Ranorex.Text)(True)
				End Get
			End Property

			''' <summary>
			''' The TextStatusAsterisk item info.
			''' </summary>
			Public Overridable ReadOnly Property TextStatusAsteriskInfo As RepoItemInfo
				Get
					Return _textstatusasteriskInfo
				End Get
			End Property

			''' <summary>
			''' The TextEmail item.
			''' </summary>
			Public Overridable ReadOnly Property TextEmail As Ranorex.Text
				Get
					Return _textemailInfo.CreateAdapter(Of Ranorex.Text)(True)
				End Get
			End Property

			''' <summary>
			''' The TextEmail item info.
			''' </summary>
			Public Overridable ReadOnly Property TextEmailInfo As RepoItemInfo
				Get
					Return _textemailInfo
				End Get
			End Property

			''' <summary>
			''' The TextTextInput4 item.
			''' </summary>
			Public Overridable ReadOnly Property TextTextInput4 As Ranorex.Text
				Get
					Return _texttextinput4Info.CreateAdapter(Of Ranorex.Text)(True)
				End Get
			End Property

			''' <summary>
			''' The TextTextInput4 item info.
			''' </summary>
			Public Overridable ReadOnly Property TextTextInput4Info As RepoItemInfo
				Get
					Return _texttextinput4Info
				End Get
			End Property

			''' <summary>
			''' The TextPasswordAsterisk item.
			''' </summary>
			Public Overridable ReadOnly Property TextPasswordAsterisk As Ranorex.Text
				Get
					Return _textpasswordasteriskInfo.CreateAdapter(Of Ranorex.Text)(True)
				End Get
			End Property

			''' <summary>
			''' The TextPasswordAsterisk item info.
			''' </summary>
			Public Overridable ReadOnly Property TextPasswordAsteriskInfo As RepoItemInfo
				Get
					Return _textpasswordasteriskInfo
				End Get
			End Property

			''' <summary>
			''' The TextTextInput3 item.
			''' </summary>
			Public Overridable ReadOnly Property TextTextInput3 As Ranorex.Text
				Get
					Return _texttextinput3Info.CreateAdapter(Of Ranorex.Text)(True)
				End Get
			End Property

			''' <summary>
			''' The TextTextInput3 item info.
			''' </summary>
			Public Overridable ReadOnly Property TextTextInput3Info As RepoItemInfo
				Get
					Return _texttextinput3Info
				End Get
			End Property

			''' <summary>
			''' The TextLast_Name item.
			''' </summary>
			Public Overridable ReadOnly Property TextLast_Name As Ranorex.Text
				Get
					Return _textlast_nameInfo.CreateAdapter(Of Ranorex.Text)(True)
				End Get
			End Property

			''' <summary>
			''' The TextLast_Name item info.
			''' </summary>
			Public Overridable ReadOnly Property TextLast_NameInfo As RepoItemInfo
				Get
					Return _textlast_nameInfo
				End Get
			End Property

			''' <summary>
			''' The TextTextInput2 item.
			''' </summary>
			Public Overridable ReadOnly Property TextTextInput2 As Ranorex.Text
				Get
					Return _texttextinput2Info.CreateAdapter(Of Ranorex.Text)(True)
				End Get
			End Property

			''' <summary>
			''' The TextTextInput2 item info.
			''' </summary>
			Public Overridable ReadOnly Property TextTextInput2Info As RepoItemInfo
				Get
					Return _texttextinput2Info
				End Get
			End Property

			''' <summary>
			''' The TextFirst_NameAsterisk item.
			''' </summary>
			Public Overridable ReadOnly Property TextFirst_NameAsterisk As Ranorex.Text
				Get
					Return _textfirst_nameasteriskInfo.CreateAdapter(Of Ranorex.Text)(True)
				End Get
			End Property

			''' <summary>
			''' The TextFirst_NameAsterisk item info.
			''' </summary>
			Public Overridable ReadOnly Property TextFirst_NameAsteriskInfo As RepoItemInfo
				Get
					Return _textfirst_nameasteriskInfo
				End Get
			End Property

			''' <summary>
			''' The TextTextInput1 item.
			''' </summary>
			Public Overridable ReadOnly Property TextTextInput1 As Ranorex.Text
				Get
					Return _texttextinput1Info.CreateAdapter(Of Ranorex.Text)(True)
				End Get
			End Property

			''' <summary>
			''' The TextTextInput1 item info.
			''' </summary>
			Public Overridable ReadOnly Property TextTextInput1Info As RepoItemInfo
				Get
					Return _texttextinput1Info
				End Get
			End Property

			''' <summary>
			''' The TextUser_NameAsterisk item.
			''' </summary>
			Public Overridable ReadOnly Property TextUser_NameAsterisk As Ranorex.Text
				Get
					Return _textuser_nameasteriskInfo.CreateAdapter(Of Ranorex.Text)(True)
				End Get
			End Property

			''' <summary>
			''' The TextUser_NameAsterisk item info.
			''' </summary>
			Public Overridable ReadOnly Property TextUser_NameAsteriskInfo As RepoItemInfo
				Get
					Return _textuser_nameasteriskInfo
				End Get
			End Property

			''' <summary>
			''' The TextTextInput item.
			''' </summary>
			Public Overridable ReadOnly Property TextTextInput As Ranorex.Text
				Get
					Return _texttextinputInfo.CreateAdapter(Of Ranorex.Text)(True)
				End Get
			End Property

			''' <summary>
			''' The TextTextInput item info.
			''' </summary>
			Public Overridable ReadOnly Property TextTextInputInfo As RepoItemInfo
				Get
					Return _texttextinputInfo
				End Get
			End Property

			''' <summary>
			''' The TextAdmin item.
			''' </summary>
			Public Overridable ReadOnly Property TextAdmin As Ranorex.Text
				Get
					Return _textadminInfo.CreateAdapter(Of Ranorex.Text)(True)
				End Get
			End Property

			''' <summary>
			''' The TextAdmin item info.
			''' </summary>
			Public Overridable ReadOnly Property TextAdminInfo As RepoItemInfo
				Get
					Return _textadminInfo
				End Get
			End Property

			''' <summary>
			''' The Self item.
			''' </summary>
			Public Overridable ReadOnly Property Self As Ranorex.FlexObject
				Get
					Return _selfInfo.CreateAdapter(Of Ranorex.FlexObject)(True)
				End Get
			End Property

			''' <summary>
			''' The Self item info.
			''' </summary>
			Public Overridable ReadOnly Property SelfInfo As RepoItemInfo
				Get
					Return _selfInfo
				End Get
			End Property
		End Class

	End Class
End Namespace