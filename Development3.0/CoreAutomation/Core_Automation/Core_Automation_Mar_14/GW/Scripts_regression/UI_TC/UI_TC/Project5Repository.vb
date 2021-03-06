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
	''' The class representing the Project5Repository element repository.
	''' </summary>
	<System.CodeDom.Compiler.GeneratedCode("Ranorex", "2.3.6")> _
	Partial Public Class Project5Repository
		Inherits RepoGenBaseFolder

		Shared _instance As Project5Repository

		''' <summary>
		''' Gets the singleton class instance representing the Project5Repository element repository.
		''' </summary>
		Public Shared ReadOnly Property Instance() As Project5Repository
			Get
				Return _instance
			End Get
		End Property

		''' <summary>
		''' Repository class static constructor.
		''' </summary>
		Shared Sub New()
			_instance = New Project5Repository()
		End Sub

		Dim _webdocumenticefish As Project5RepositoryFolders.WebDocumentIceFishAppFolder

		''' <summary>
		''' Repository class constructor.
		''' </summary>
		Public Sub New()
			MyBase.New("Project5Repository", "", Nothing, 30000, False)
			_webdocumenticefish = New Project5RepositoryFolders.WebDocumentIceFishAppFolder(Me)
		End Sub

		''' <summary>
		''' The WebDocumentIceFish folder.
		''' </summary>
		Public Overridable ReadOnly Property WebDocumentIceFish As Project5RepositoryFolders.WebDocumentIceFishAppFolder
			Get
				Return _webdocumenticefish
			End Get
		End Property
	End Class

	''' <summary>
	''' Inner folder classes.
	''' </summary>
	Partial Public Class Project5RepositoryFolders
		''' <summary>
		''' The WebDocumentIceFishAppFolder folder.
		''' </summary>
		Partial Public Class WebDocumentIceFishAppFolder
			Inherits RepoGenBaseFolder
			Dim _tableprocessgrid As Project5RepositoryFolders.TableProcessGridFolder
			Dim _formform As Project5RepositoryFolders.FormFormFolder
			Dim _containerhbox As Project5RepositoryFolders.ContainerHBoxFolder
			Dim _containerhbox1 As Project5RepositoryFolders.ContainerHBox1Folder
			Dim _buttonnewInfo As RepoItemInfo
			Dim _buttondeleteInfo As RepoItemInfo
			Dim _textprocess_modeling_Info As RepoItemInfo
			Dim _buttonlogoutInfo As RepoItemInfo
			Dim _texticefish_loginInfo As RepoItemInfo
			Dim _selfInfo As RepoItemInfo

			''' <summary>
			''' Creates a new WebDocumentIceFish  folder.
			''' </summary>
			Public Sub New(parentFolder As RepoGenBaseFolder)
				MyBase.New("WebDocumentIceFish", "/dom[@domain~'^.*']", Nothing, 30000, False)

				_tableprocessgrid = New Project5RepositoryFolders.TableProcessGridFolder(Me)
				_formform = New Project5RepositoryFolders.FormFormFolder(Me)
				_containerhbox = New Project5RepositoryFolders.ContainerHBoxFolder(Me)
				_containerhbox1 = New Project5RepositoryFolders.ContainerHBox1Folder(Me)
				_buttonnewInfo = New RepoItemInfo(Me, "ButtonNew", "body/flexobject/container/container[@id='mainArea']/container/element/container/button[@id='newButton']", 10000, Nothing)
				_buttondeleteInfo = New RepoItemInfo(Me, "ButtonDelete", "body/flexobject/container/container[@id='mainArea']/container/element/container/button[@id='deleteButton']", 10000, Nothing)
				_textprocess_modeling_Info = New RepoItemInfo(Me, "TextProcess_Modeling_", "body/flexobject/container/toolbar/container/text[@id='nav_processModel']", 10000, Nothing)
				_buttonlogoutInfo = New RepoItemInfo(Me, "ButtonLogout", "body/flexobject/container/container[@id='logoBox']/button[@id='logoutBtn']", 10000, Nothing)
				_texticefish_loginInfo = New RepoItemInfo(Me, "TextIceFish_Login", "body/flexobject/container/container[@id='mainArea']/container[@id='loginHbox']/container/container/element/text[@caption='iceFish Login']", 10000, Nothing)
				_selfInfo = New RepoItemInfo(Me, "Self", "", 30000, Nothing)
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
			''' The ButtonDelete item.
			''' </summary>
			Public Overridable ReadOnly Property ButtonDelete As Ranorex.Button
				Get
					Return _buttondeleteInfo.CreateAdapter(Of Ranorex.Button)(True)
				End Get
			End Property

			''' <summary>
			''' The ButtonDelete item info.
			''' </summary>
			Public Overridable ReadOnly Property ButtonDeleteInfo As RepoItemInfo
				Get
					Return _buttondeleteInfo
				End Get
			End Property

			''' <summary>
			''' The TextProcess_Modeling_ item.
			''' </summary>
			Public Overridable ReadOnly Property TextProcess_Modeling_ As Ranorex.Text
				Get
					Return _textprocess_modeling_Info.CreateAdapter(Of Ranorex.Text)(True)
				End Get
			End Property

			''' <summary>
			''' The TextProcess_Modeling_ item info.
			''' </summary>
			Public Overridable ReadOnly Property TextProcess_Modeling_Info As RepoItemInfo
				Get
					Return _textprocess_modeling_Info
				End Get
			End Property

			''' <summary>
			''' The ButtonLogout item.
			''' </summary>
			Public Overridable ReadOnly Property ButtonLogout As Ranorex.Button
				Get
					Return _buttonlogoutInfo.CreateAdapter(Of Ranorex.Button)(True)
				End Get
			End Property

			''' <summary>
			''' The ButtonLogout item info.
			''' </summary>
			Public Overridable ReadOnly Property ButtonLogoutInfo As RepoItemInfo
				Get
					Return _buttonlogoutInfo
				End Get
			End Property

			''' <summary>
			''' The TextIceFish_Login item.
			''' </summary>
			Public Overridable ReadOnly Property TextIceFish_Login As Ranorex.Text
				Get
					Return _texticefish_loginInfo.CreateAdapter(Of Ranorex.Text)(True)
				End Get
			End Property

			''' <summary>
			''' The TextIceFish_Login item info.
			''' </summary>
			Public Overridable ReadOnly Property TextIceFish_LoginInfo As RepoItemInfo
				Get
					Return _texticefish_loginInfo
				End Get
			End Property

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
			''' The TableProcessGrid folder.
			''' </summary>
			Public Overridable ReadOnly Property TableProcessGrid As Project5RepositoryFolders.TableProcessGridFolder
				Get
					Return _tableprocessgrid
				End Get
			End Property

			''' <summary>
			''' The FormForm folder.
			''' </summary>
			Public Overridable ReadOnly Property FormForm As Project5RepositoryFolders.FormFormFolder
				Get
					Return _formform
				End Get
			End Property

			''' <summary>
			''' The ContainerHBox folder.
			''' </summary>
			Public Overridable ReadOnly Property ContainerHBox As Project5RepositoryFolders.ContainerHBoxFolder
				Get
					Return _containerhbox
				End Get
			End Property

			''' <summary>
			''' The ContainerHBox1 folder.
			''' </summary>
			Public Overridable ReadOnly Property ContainerHBox1 As Project5RepositoryFolders.ContainerHBox1Folder
				Get
					Return _containerhbox1
				End Get
			End Property
		End Class

		''' <summary>
		''' The TableProcessGridFolder folder.
		''' </summary>
		Partial Public Class TableProcessGridFolder
			Inherits RepoGenBaseFolder
			Dim _cellstring4Info As RepoItemInfo
			Dim _cellstring2Info As RepoItemInfo
			Dim _cellstring5Info As RepoItemInfo
			Dim _cellstringInfo As RepoItemInfo
			Dim _cellstring1Info As RepoItemInfo
			Dim _cellstring3Info As RepoItemInfo
			Dim _selfInfo As RepoItemInfo

			''' <summary>
			''' Creates a new TableProcessGrid  folder.
			''' </summary>
			Public Sub New(parentFolder As RepoGenBaseFolder)
				MyBase.New("TableProcessGrid", "body/flexobject/container/container[@id='mainArea']/container/element/table", parentFolder, 10000, False)

				_cellstring4Info = New RepoItemInfo(Me, "CellString4", "column[@text='Date Created']/cell[@text='Date Created']", 10000, Nothing)
				_cellstring2Info = New RepoItemInfo(Me, "CellString2", "column[@text='Description']/cell[@text='Description']", 10000, Nothing)
				_cellstring5Info = New RepoItemInfo(Me, "CellString5", "column[@text='Last Modified']/cell[@text='Last Modified']", 10000, Nothing)
				_cellstringInfo = New RepoItemInfo(Me, "CellString", "column[@text='Process Id']/cell[@text='Process Id']", 10000, Nothing)
				_cellstring1Info = New RepoItemInfo(Me, "CellString1", "column[@text='Process Name']/cell[@text='Process Name']", 10000, Nothing)
				_cellstring3Info = New RepoItemInfo(Me, "CellString3", "column[@text='Status']/cell[@text='Status']", 10000, Nothing)
				_selfInfo = New RepoItemInfo(Me, "Self", "", 10000, Nothing)
			End Sub

			''' <summary>
			''' The CellString4 item.
			''' </summary>
			Public Overridable ReadOnly Property CellString4 As Ranorex.Cell
				Get
					Return _cellstring4Info.CreateAdapter(Of Ranorex.Cell)(True)
				End Get
			End Property

			''' <summary>
			''' The CellString4 item info.
			''' </summary>
			Public Overridable ReadOnly Property CellString4Info As RepoItemInfo
				Get
					Return _cellstring4Info
				End Get
			End Property

			''' <summary>
			''' The CellString2 item.
			''' </summary>
			Public Overridable ReadOnly Property CellString2 As Ranorex.Cell
				Get
					Return _cellstring2Info.CreateAdapter(Of Ranorex.Cell)(True)
				End Get
			End Property

			''' <summary>
			''' The CellString2 item info.
			''' </summary>
			Public Overridable ReadOnly Property CellString2Info As RepoItemInfo
				Get
					Return _cellstring2Info
				End Get
			End Property

			''' <summary>
			''' The CellString5 item.
			''' </summary>
			Public Overridable ReadOnly Property CellString5 As Ranorex.Cell
				Get
					Return _cellstring5Info.CreateAdapter(Of Ranorex.Cell)(True)
				End Get
			End Property

			''' <summary>
			''' The CellString5 item info.
			''' </summary>
			Public Overridable ReadOnly Property CellString5Info As RepoItemInfo
				Get
					Return _cellstring5Info
				End Get
			End Property

			''' <summary>
			''' The CellString item.
			''' </summary>
			Public Overridable ReadOnly Property CellString As Ranorex.Cell
				Get
					Return _cellstringInfo.CreateAdapter(Of Ranorex.Cell)(True)
				End Get
			End Property

			''' <summary>
			''' The CellString item info.
			''' </summary>
			Public Overridable ReadOnly Property CellStringInfo As RepoItemInfo
				Get
					Return _cellstringInfo
				End Get
			End Property

			''' <summary>
			''' The CellString1 item.
			''' </summary>
			Public Overridable ReadOnly Property CellString1 As Ranorex.Cell
				Get
					Return _cellstring1Info.CreateAdapter(Of Ranorex.Cell)(True)
				End Get
			End Property

			''' <summary>
			''' The CellString1 item info.
			''' </summary>
			Public Overridable ReadOnly Property CellString1Info As RepoItemInfo
				Get
					Return _cellstring1Info
				End Get
			End Property

			''' <summary>
			''' The CellString3 item.
			''' </summary>
			Public Overridable ReadOnly Property CellString3 As Ranorex.Cell
				Get
					Return _cellstring3Info.CreateAdapter(Of Ranorex.Cell)(True)
				End Get
			End Property

			''' <summary>
			''' The CellString3 item info.
			''' </summary>
			Public Overridable ReadOnly Property CellString3Info As RepoItemInfo
				Get
					Return _cellstring3Info
				End Get
			End Property

			''' <summary>
			''' The Self item.
			''' </summary>
			Public Overridable ReadOnly Property Self As Ranorex.Table
				Get
					Return _selfInfo.CreateAdapter(Of Ranorex.Table)(True)
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

		''' <summary>
		''' The FormFormFolder folder.
		''' </summary>
		Partial Public Class FormFormFolder
			Inherits RepoGenBaseFolder
			Dim _buttonsubmitInfo As RepoItemInfo
			Dim _textpasswordtextinputInfo As RepoItemInfo
			Dim _textuseridtextinputInfo As RepoItemInfo
			Dim _selfInfo As RepoItemInfo

			''' <summary>
			''' Creates a new FormForm  folder.
			''' </summary>
			Public Sub New(parentFolder As RepoGenBaseFolder)
				MyBase.New("FormForm", "body/flexobject/container/container[@id='mainArea']/container[@id='loginHbox']/container/container/form", parentFolder, 10000, False)

				_buttonsubmitInfo = New RepoItemInfo(Me, "ButtonSubmit", "container[1]/container/button[@text='Submit']", 10000, Nothing)
				_textpasswordtextinputInfo = New RepoItemInfo(Me, "TextPasswordTextInput", "container[2]/text[@id='passwordTextInput']", 10000, Nothing)
				_textuseridtextinputInfo = New RepoItemInfo(Me, "TextUserIdTextInput", "container[3]/text[@id='userIdTextInput']", 10000, Nothing)
				_selfInfo = New RepoItemInfo(Me, "Self", "", 10000, Nothing)
			End Sub

			''' <summary>
			''' The ButtonSubmit item.
			''' </summary>
			Public Overridable ReadOnly Property ButtonSubmit As Ranorex.Button
				Get
					Return _buttonsubmitInfo.CreateAdapter(Of Ranorex.Button)(True)
				End Get
			End Property

			''' <summary>
			''' The ButtonSubmit item info.
			''' </summary>
			Public Overridable ReadOnly Property ButtonSubmitInfo As RepoItemInfo
				Get
					Return _buttonsubmitInfo
				End Get
			End Property

			''' <summary>
			''' The TextPasswordTextInput item.
			''' </summary>
			Public Overridable ReadOnly Property TextPasswordTextInput As Ranorex.Text
				Get
					Return _textpasswordtextinputInfo.CreateAdapter(Of Ranorex.Text)(True)
				End Get
			End Property

			''' <summary>
			''' The TextPasswordTextInput item info.
			''' </summary>
			Public Overridable ReadOnly Property TextPasswordTextInputInfo As RepoItemInfo
				Get
					Return _textpasswordtextinputInfo
				End Get
			End Property

			''' <summary>
			''' The TextUserIdTextInput item.
			''' </summary>
			Public Overridable ReadOnly Property TextUserIdTextInput As Ranorex.Text
				Get
					Return _textuseridtextinputInfo.CreateAdapter(Of Ranorex.Text)(True)
				End Get
			End Property

			''' <summary>
			''' The TextUserIdTextInput item info.
			''' </summary>
			Public Overridable ReadOnly Property TextUserIdTextInputInfo As RepoItemInfo
				Get
					Return _textuseridtextinputInfo
				End Get
			End Property

			''' <summary>
			''' The Self item.
			''' </summary>
			Public Overridable ReadOnly Property Self As Ranorex.Form
				Get
					Return _selfInfo.CreateAdapter(Of Ranorex.Form)(True)
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

		''' <summary>
		''' The ContainerHBoxFolder folder.
		''' </summary>
		Partial Public Class ContainerHBoxFolder
			Inherits RepoGenBaseFolder
			Dim _buttonendpointsInfo As RepoItemInfo
			Dim _textcomponent_paletteInfo As RepoItemInfo
			Dim _checkboxcompevntlogInfo As RepoItemInfo
			Dim _textenable_component_eventloInfo As RepoItemInfo
			Dim _checkboxmsgevntlogInfo As RepoItemInfo
			Dim _textenable_message_eventlogsInfo As RepoItemInfo
			Dim _checkboxprcsevntlogInfo As RepoItemInfo
			Dim _textenable_process_eventlogsInfo As RepoItemInfo
			Dim _checkboxrecoveryInfo As RepoItemInfo
			Dim _textenable_recoveryInfo As RepoItemInfo
			Dim _textdescriptionInfo As RepoItemInfo
			Dim _textnametextInfo As RepoItemInfo
			Dim _textnameasteriskInfo As RepoItemInfo
			Dim _tabpageerror_handlerInfo As RepoItemInfo
			Dim _tabpageerror_reportingInfo As RepoItemInfo
			Dim _tabpagemessage_throttlingInfo As RepoItemInfo
			Dim _tabpageprocess_propertiesInfo As RepoItemInfo
			Dim _textnewInfo As RepoItemInfo
			Dim _textstatusInfo As RepoItemInfo
			Dim _selfInfo As RepoItemInfo

			''' <summary>
			''' Creates a new ContainerHBox  folder.
			''' </summary>
			Public Sub New(parentFolder As RepoGenBaseFolder)
				MyBase.New("ContainerHBox", "body/flexobject/container/container[@id='mainArea']/container/element/container/container[1]", parentFolder, 10000, False)

				_buttonendpointsInfo = New RepoItemInfo(Me, "ButtonEndpoints", "container[@caption='Component Palette']/element[@id='compPalette']/button[@text='Endpoints']", 10000, Nothing)
				_textcomponent_paletteInfo = New RepoItemInfo(Me, "TextComponent_Palette", "container[@caption='Component Palette']/element[@type='UIComponent']/text[@caption='Component Palette']", 10000, Nothing)
				_checkboxcompevntlogInfo = New RepoItemInfo(Me, "CheckBoxCompEvntLog", "container[@type='VBox']/container[@id='processDetails']/element[@id='newProcess']/container/container/container[4]/container[1]/form/container[1]/container/checkbox[@id='compEvntLog']", 10000, Nothing)
				_textenable_component_eventloInfo = New RepoItemInfo(Me, "TextEnable_Component_EventLo", "container[@type='VBox']/container[@id='processDetails']/element[@id='newProcess']/container/container/container[4]/container[1]/form/container[1]/container/text[@caption~'^Enable\ Component\ EventLog']", 10000, Nothing)
				_checkboxmsgevntlogInfo = New RepoItemInfo(Me, "CheckBoxMsgEvntLog", "container[@type='VBox']/container[@id='processDetails']/element[@id='newProcess']/container/container/container[4]/container[1]/form/container[2]/container/checkbox[@id='msgEvntLog']", 10000, Nothing)
				_textenable_message_eventlogsInfo = New RepoItemInfo(Me, "TextEnable_Message_EventLogs", "container[@type='VBox']/container[@id='processDetails']/element[@id='newProcess']/container/container/container[4]/container[1]/form/container[2]/container/text[@caption='Enable Message EventLogs']", 10000, Nothing)
				_checkboxprcsevntlogInfo = New RepoItemInfo(Me, "CheckBoxPrcsEvntLog", "container[@type='VBox']/container[@id='processDetails']/element[@id='newProcess']/container/container/container[4]/container[1]/form/container[3]/container/checkbox[@id='prcsEvntLog']", 10000, Nothing)
				_textenable_process_eventlogsInfo = New RepoItemInfo(Me, "TextEnable_Process_EventLogs", "container[@type='VBox']/container[@id='processDetails']/element[@id='newProcess']/container/container/container[4]/container[1]/form/container[3]/container/text[@caption='Enable Process EventLogs']", 10000, Nothing)
				_checkboxrecoveryInfo = New RepoItemInfo(Me, "CheckBoxRecovery", "container[@type='VBox']/container[@id='processDetails']/element[@id='newProcess']/container/container/container[4]/container[1]/form/container[4]/container/checkbox[@id='recovery']", 10000, Nothing)
				_textenable_recoveryInfo = New RepoItemInfo(Me, "TextEnable_Recovery", "container[@type='VBox']/container[@id='processDetails']/element[@id='newProcess']/container/container/container[4]/container[1]/form/container[4]/container/text[@caption='Enable Recovery']", 10000, Nothing)
				_textdescriptionInfo = New RepoItemInfo(Me, "TextDescription", "container[@type='VBox']/container[@id='processDetails']/element[@id='newProcess']/container/container/container[4]/container[2]/form/container[1]/text[@type='FormItemLabel']/text[@caption='Description']", 10000, Nothing)
				_textnametextInfo = New RepoItemInfo(Me, "TextNameText", "container[@type='VBox']/container[@id='processDetails']/element[@id='newProcess']/container/container/container[4]/container[2]/form/container[2]/text[@id='nameText']", 10000, Nothing)
				_textnameasteriskInfo = New RepoItemInfo(Me, "TextNameAsterisk", "container[@type='VBox']/container[@id='processDetails']/element[@id='newProcess']/container/container/container[4]/container[2]/form/container[2]/text[@type='FormItemLabel']/text[@caption='Name*']", 10000, Nothing)
				_tabpageerror_handlerInfo = New RepoItemInfo(Me, "TabPageError_Handler", "container[@type='VBox']/container[@id='processDetails']/element[@id='newProcess']/container/container/tabpagelist/tabpage[@title='Error Handler']", 10000, Nothing)
				_tabpageerror_reportingInfo = New RepoItemInfo(Me, "TabPageError_Reporting", "container[@type='VBox']/container[@id='processDetails']/element[@id='newProcess']/container/container/tabpagelist/tabpage[@title='Error Reporting']", 10000, Nothing)
				_tabpagemessage_throttlingInfo = New RepoItemInfo(Me, "TabPageMessage_Throttling", "container[@type='VBox']/container[@id='processDetails']/element[@id='newProcess']/container/container/tabpagelist/tabpage[@title='Message Throttling']", 10000, Nothing)
				_tabpageprocess_propertiesInfo = New RepoItemInfo(Me, "TabPageProcess_Properties", "container[@type='VBox']/container[@id='processDetails']/element[@id='newProcess']/container/container/tabpagelist/tabpage[@title='Process Properties']", 10000, Nothing)
				_textnewInfo = New RepoItemInfo(Me, "TextNEW", "container[@type='VBox']/container[@id='processDetails']/element[@type='UIComponent']/text[@caption='NEW']", 10000, Nothing)
				_textstatusInfo = New RepoItemInfo(Me, "TextStatus", "container[@type='VBox']/container[@id='processDetails']/element[@type='UIComponent']/text[@caption='Status']", 10000, Nothing)
				_selfInfo = New RepoItemInfo(Me, "Self", "", 10000, Nothing)
			End Sub

			''' <summary>
			''' The ButtonEndpoints item.
			''' </summary>
			Public Overridable ReadOnly Property ButtonEndpoints As Ranorex.Button
				Get
					Return _buttonendpointsInfo.CreateAdapter(Of Ranorex.Button)(True)
				End Get
			End Property

			''' <summary>
			''' The ButtonEndpoints item info.
			''' </summary>
			Public Overridable ReadOnly Property ButtonEndpointsInfo As RepoItemInfo
				Get
					Return _buttonendpointsInfo
				End Get
			End Property

			''' <summary>
			''' The TextComponent_Palette item.
			''' </summary>
			Public Overridable ReadOnly Property TextComponent_Palette As Ranorex.Text
				Get
					Return _textcomponent_paletteInfo.CreateAdapter(Of Ranorex.Text)(True)
				End Get
			End Property

			''' <summary>
			''' The TextComponent_Palette item info.
			''' </summary>
			Public Overridable ReadOnly Property TextComponent_PaletteInfo As RepoItemInfo
				Get
					Return _textcomponent_paletteInfo
				End Get
			End Property

			''' <summary>
			''' The CheckBoxCompEvntLog item.
			''' </summary>
			Public Overridable ReadOnly Property CheckBoxCompEvntLog As Ranorex.CheckBox
				Get
					Return _checkboxcompevntlogInfo.CreateAdapter(Of Ranorex.CheckBox)(True)
				End Get
			End Property

			''' <summary>
			''' The CheckBoxCompEvntLog item info.
			''' </summary>
			Public Overridable ReadOnly Property CheckBoxCompEvntLogInfo As RepoItemInfo
				Get
					Return _checkboxcompevntlogInfo
				End Get
			End Property

			''' <summary>
			''' The TextEnable_Component_EventLo item.
			''' </summary>
			Public Overridable ReadOnly Property TextEnable_Component_EventLo As Ranorex.Text
				Get
					Return _textenable_component_eventloInfo.CreateAdapter(Of Ranorex.Text)(True)
				End Get
			End Property

			''' <summary>
			''' The TextEnable_Component_EventLo item info.
			''' </summary>
			Public Overridable ReadOnly Property TextEnable_Component_EventLoInfo As RepoItemInfo
				Get
					Return _textenable_component_eventloInfo
				End Get
			End Property

			''' <summary>
			''' The CheckBoxMsgEvntLog item.
			''' </summary>
			Public Overridable ReadOnly Property CheckBoxMsgEvntLog As Ranorex.CheckBox
				Get
					Return _checkboxmsgevntlogInfo.CreateAdapter(Of Ranorex.CheckBox)(True)
				End Get
			End Property

			''' <summary>
			''' The CheckBoxMsgEvntLog item info.
			''' </summary>
			Public Overridable ReadOnly Property CheckBoxMsgEvntLogInfo As RepoItemInfo
				Get
					Return _checkboxmsgevntlogInfo
				End Get
			End Property

			''' <summary>
			''' The TextEnable_Message_EventLogs item.
			''' </summary>
			Public Overridable ReadOnly Property TextEnable_Message_EventLogs As Ranorex.Text
				Get
					Return _textenable_message_eventlogsInfo.CreateAdapter(Of Ranorex.Text)(True)
				End Get
			End Property

			''' <summary>
			''' The TextEnable_Message_EventLogs item info.
			''' </summary>
			Public Overridable ReadOnly Property TextEnable_Message_EventLogsInfo As RepoItemInfo
				Get
					Return _textenable_message_eventlogsInfo
				End Get
			End Property

			''' <summary>
			''' The CheckBoxPrcsEvntLog item.
			''' </summary>
			Public Overridable ReadOnly Property CheckBoxPrcsEvntLog As Ranorex.CheckBox
				Get
					Return _checkboxprcsevntlogInfo.CreateAdapter(Of Ranorex.CheckBox)(True)
				End Get
			End Property

			''' <summary>
			''' The CheckBoxPrcsEvntLog item info.
			''' </summary>
			Public Overridable ReadOnly Property CheckBoxPrcsEvntLogInfo As RepoItemInfo
				Get
					Return _checkboxprcsevntlogInfo
				End Get
			End Property

			''' <summary>
			''' The TextEnable_Process_EventLogs item.
			''' </summary>
			Public Overridable ReadOnly Property TextEnable_Process_EventLogs As Ranorex.Text
				Get
					Return _textenable_process_eventlogsInfo.CreateAdapter(Of Ranorex.Text)(True)
				End Get
			End Property

			''' <summary>
			''' The TextEnable_Process_EventLogs item info.
			''' </summary>
			Public Overridable ReadOnly Property TextEnable_Process_EventLogsInfo As RepoItemInfo
				Get
					Return _textenable_process_eventlogsInfo
				End Get
			End Property

			''' <summary>
			''' The CheckBoxRecovery item.
			''' </summary>
			Public Overridable ReadOnly Property CheckBoxRecovery As Ranorex.CheckBox
				Get
					Return _checkboxrecoveryInfo.CreateAdapter(Of Ranorex.CheckBox)(True)
				End Get
			End Property

			''' <summary>
			''' The CheckBoxRecovery item info.
			''' </summary>
			Public Overridable ReadOnly Property CheckBoxRecoveryInfo As RepoItemInfo
				Get
					Return _checkboxrecoveryInfo
				End Get
			End Property

			''' <summary>
			''' The TextEnable_Recovery item.
			''' </summary>
			Public Overridable ReadOnly Property TextEnable_Recovery As Ranorex.Text
				Get
					Return _textenable_recoveryInfo.CreateAdapter(Of Ranorex.Text)(True)
				End Get
			End Property

			''' <summary>
			''' The TextEnable_Recovery item info.
			''' </summary>
			Public Overridable ReadOnly Property TextEnable_RecoveryInfo As RepoItemInfo
				Get
					Return _textenable_recoveryInfo
				End Get
			End Property

			''' <summary>
			''' The TextDescription item.
			''' </summary>
			Public Overridable ReadOnly Property TextDescription As Ranorex.Text
				Get
					Return _textdescriptionInfo.CreateAdapter(Of Ranorex.Text)(True)
				End Get
			End Property

			''' <summary>
			''' The TextDescription item info.
			''' </summary>
			Public Overridable ReadOnly Property TextDescriptionInfo As RepoItemInfo
				Get
					Return _textdescriptionInfo
				End Get
			End Property

			''' <summary>
			''' The TextNameText item.
			''' </summary>
			Public Overridable ReadOnly Property TextNameText As Ranorex.Text
				Get
					Return _textnametextInfo.CreateAdapter(Of Ranorex.Text)(True)
				End Get
			End Property

			''' <summary>
			''' The TextNameText item info.
			''' </summary>
			Public Overridable ReadOnly Property TextNameTextInfo As RepoItemInfo
				Get
					Return _textnametextInfo
				End Get
			End Property

			''' <summary>
			''' The TextNameAsterisk item.
			''' </summary>
			Public Overridable ReadOnly Property TextNameAsterisk As Ranorex.Text
				Get
					Return _textnameasteriskInfo.CreateAdapter(Of Ranorex.Text)(True)
				End Get
			End Property

			''' <summary>
			''' The TextNameAsterisk item info.
			''' </summary>
			Public Overridable ReadOnly Property TextNameAsteriskInfo As RepoItemInfo
				Get
					Return _textnameasteriskInfo
				End Get
			End Property

			''' <summary>
			''' The TabPageError_Handler item.
			''' </summary>
			Public Overridable ReadOnly Property TabPageError_Handler As Ranorex.TabPage
				Get
					Return _tabpageerror_handlerInfo.CreateAdapter(Of Ranorex.TabPage)(True)
				End Get
			End Property

			''' <summary>
			''' The TabPageError_Handler item info.
			''' </summary>
			Public Overridable ReadOnly Property TabPageError_HandlerInfo As RepoItemInfo
				Get
					Return _tabpageerror_handlerInfo
				End Get
			End Property

			''' <summary>
			''' The TabPageError_Reporting item.
			''' </summary>
			Public Overridable ReadOnly Property TabPageError_Reporting As Ranorex.TabPage
				Get
					Return _tabpageerror_reportingInfo.CreateAdapter(Of Ranorex.TabPage)(True)
				End Get
			End Property

			''' <summary>
			''' The TabPageError_Reporting item info.
			''' </summary>
			Public Overridable ReadOnly Property TabPageError_ReportingInfo As RepoItemInfo
				Get
					Return _tabpageerror_reportingInfo
				End Get
			End Property

			''' <summary>
			''' The TabPageMessage_Throttling item.
			''' </summary>
			Public Overridable ReadOnly Property TabPageMessage_Throttling As Ranorex.TabPage
				Get
					Return _tabpagemessage_throttlingInfo.CreateAdapter(Of Ranorex.TabPage)(True)
				End Get
			End Property

			''' <summary>
			''' The TabPageMessage_Throttling item info.
			''' </summary>
			Public Overridable ReadOnly Property TabPageMessage_ThrottlingInfo As RepoItemInfo
				Get
					Return _tabpagemessage_throttlingInfo
				End Get
			End Property

			''' <summary>
			''' The TabPageProcess_Properties item.
			''' </summary>
			Public Overridable ReadOnly Property TabPageProcess_Properties As Ranorex.TabPage
				Get
					Return _tabpageprocess_propertiesInfo.CreateAdapter(Of Ranorex.TabPage)(True)
				End Get
			End Property

			''' <summary>
			''' The TabPageProcess_Properties item info.
			''' </summary>
			Public Overridable ReadOnly Property TabPageProcess_PropertiesInfo As RepoItemInfo
				Get
					Return _tabpageprocess_propertiesInfo
				End Get
			End Property

			''' <summary>
			''' The TextNEW item.
			''' </summary>
			Public Overridable ReadOnly Property TextNEW As Ranorex.Text
				Get
					Return _textnewInfo.CreateAdapter(Of Ranorex.Text)(True)
				End Get
			End Property

			''' <summary>
			''' The TextNEW item info.
			''' </summary>
			Public Overridable ReadOnly Property TextNEWInfo As RepoItemInfo
				Get
					Return _textnewInfo
				End Get
			End Property

			''' <summary>
			''' The TextStatus item.
			''' </summary>
			Public Overridable ReadOnly Property TextStatus As Ranorex.Text
				Get
					Return _textstatusInfo.CreateAdapter(Of Ranorex.Text)(True)
				End Get
			End Property

			''' <summary>
			''' The TextStatus item info.
			''' </summary>
			Public Overridable ReadOnly Property TextStatusInfo As RepoItemInfo
				Get
					Return _textstatusInfo
				End Get
			End Property

			''' <summary>
			''' The Self item.
			''' </summary>
			Public Overridable ReadOnly Property Self As Ranorex.Container
				Get
					Return _selfInfo.CreateAdapter(Of Ranorex.Container)(True)
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

		''' <summary>
		''' The ContainerHBox1Folder folder.
		''' </summary>
		Partial Public Class ContainerHBox1Folder
			Inherits RepoGenBaseFolder
			Dim _buttondelete1Info As RepoItemInfo
			Dim _buttonpublishInfo As RepoItemInfo
			Dim _buttonsaveInfo As RepoItemInfo
			Dim _buttoncancelInfo As RepoItemInfo
			Dim _selfInfo As RepoItemInfo

			''' <summary>
			''' Creates a new ContainerHBox1  folder.
			''' </summary>
			Public Sub New(parentFolder As RepoGenBaseFolder)
				MyBase.New("ContainerHBox1", "body/flexobject/container/container[@id='mainArea']/container/element/container/container[2]", parentFolder, 10000, False)

				_buttondelete1Info = New RepoItemInfo(Me, "ButtonDelete1", "button[@id='deleteButton']", 10000, Nothing)
				_buttonpublishInfo = New RepoItemInfo(Me, "ButtonPublish", "button[@id='publishButton']", 10000, Nothing)
				_buttonsaveInfo = New RepoItemInfo(Me, "ButtonSave", "button[@id='saveButton']", 10000, Nothing)
				_buttoncancelInfo = New RepoItemInfo(Me, "ButtonCancel", "button[@text='Cancel']", 10000, Nothing)
				_selfInfo = New RepoItemInfo(Me, "Self", "", 10000, Nothing)
			End Sub

			''' <summary>
			''' The ButtonDelete1 item.
			''' </summary>
			Public Overridable ReadOnly Property ButtonDelete1 As Ranorex.Button
				Get
					Return _buttondelete1Info.CreateAdapter(Of Ranorex.Button)(True)
				End Get
			End Property

			''' <summary>
			''' The ButtonDelete1 item info.
			''' </summary>
			Public Overridable ReadOnly Property ButtonDelete1Info As RepoItemInfo
				Get
					Return _buttondelete1Info
				End Get
			End Property

			''' <summary>
			''' The ButtonPublish item.
			''' </summary>
			Public Overridable ReadOnly Property ButtonPublish As Ranorex.Button
				Get
					Return _buttonpublishInfo.CreateAdapter(Of Ranorex.Button)(True)
				End Get
			End Property

			''' <summary>
			''' The ButtonPublish item info.
			''' </summary>
			Public Overridable ReadOnly Property ButtonPublishInfo As RepoItemInfo
				Get
					Return _buttonpublishInfo
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
			''' The ButtonCancel item.
			''' </summary>
			Public Overridable ReadOnly Property ButtonCancel As Ranorex.Button
				Get
					Return _buttoncancelInfo.CreateAdapter(Of Ranorex.Button)(True)
				End Get
			End Property

			''' <summary>
			''' The ButtonCancel item info.
			''' </summary>
			Public Overridable ReadOnly Property ButtonCancelInfo As RepoItemInfo
				Get
					Return _buttoncancelInfo
				End Get
			End Property

			''' <summary>
			''' The Self item.
			''' </summary>
			Public Overridable ReadOnly Property Self As Ranorex.Container
				Get
					Return _selfInfo.CreateAdapter(Of Ranorex.Container)(True)
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
