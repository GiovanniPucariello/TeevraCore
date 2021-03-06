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
Imports Ranorex.Core.Testing

Namespace UI_TC
    ''' <summary>
    ''' The class representing the Project3Repository element repository.
    ''' </summary>
    <System.CodeDom.Compiler.GeneratedCode("Ranorex", "3.0.2"), RepositoryFolder("31097da2-1aff-446c-99c8-77ee9da049d7")> _
    Partial Public Class Project3Repository
        Inherits RepoGenBaseFolder

        Shared _instance As Project3Repository = New Project3Repository()

        ''' <summary>
        ''' Gets the singleton class instance representing the Project3Repository element repository.
        ''' </summary>
        Public Shared ReadOnly Property Instance() As Project3Repository
            Get
                Return _instance
            End Get
        End Property

        Dim _webdocumenticefish As Project3RepositoryFolders.WebDocumentIceFishAppFolder

        ''' <summary>
        ''' Repository class constructor.
        ''' </summary>
        Public Sub New()
            MyBase.New("Project3Repository", "", Nothing, 30000, False)
            _webdocumenticefish = New Project3RepositoryFolders.WebDocumentIceFishAppFolder(Me)
        End Sub

#Region "Variables"

#End Region

        ''' <summary>
        ''' The WebDocumentIceFish folder.
        ''' </summary>
        <RepositoryFolder("6b1ee4a4-0f24-421e-9184-50912031ffde")> _
        Public Overridable ReadOnly Property WebDocumentIceFish As Project3RepositoryFolders.WebDocumentIceFishAppFolder
            Get
                Return _webdocumenticefish
            End Get
        End Property
    End Class

    ''' <summary>
    ''' Inner folder classes.
    ''' </summary>
    Partial Public Class Project3RepositoryFolders
        ''' <summary>
        ''' The WebDocumentIceFishAppFolder folder.
        ''' </summary>
        <RepositoryFolder("6b1ee4a4-0f24-421e-9184-50912031ffde")> _
        Partial Public Class WebDocumentIceFishAppFolder
            Inherits RepoGenBaseFolder
            Dim _containermainarea As Project3RepositoryFolders.ContainerMainAreaFolder
            Dim _contextmenumenu As Project3RepositoryFolders.ContextMenuMenuFolder
            Dim _flexobjecticefish As Project3RepositoryFolders.FlexObjectIceFishFolder
            Dim _selfInfo As RepoItemInfo
            Dim _textprocess_modeling_Info As RepoItemInfo
            Dim _textprocess_management_Info As RepoItemInfo

            ''' <summary>
            ''' Creates a new WebDocumentIceFish  folder.
            ''' </summary>
            Public Sub New(parentFolder As RepoGenBaseFolder)
                MyBase.New("WebDocumentIceFish", "/dom[@domain~'^.*']", parentFolder, 30000, False, "6b1ee4a4-0f24-421e-9184-50912031ffde")

                _containermainarea = New Project3RepositoryFolders.ContainerMainAreaFolder(Me)
                _contextmenumenu = New Project3RepositoryFolders.ContextMenuMenuFolder(Me)
                _flexobjecticefish = New Project3RepositoryFolders.FlexObjectIceFishFolder(Me)
                _selfInfo = New RepoItemInfo(Me, "Self", "", 30000, Nothing, "6b1ee4a4-0f24-421e-9184-50912031ffde")
                _textprocess_modeling_Info = New RepoItemInfo(Me, "TextProcess_Modeling_", "body/flexobject/container/toolbar/container/text[@id='nav_processModel']", 10000, Nothing, "b7edf8b9-fb84-4a8d-b4ea-e38062705678")
                _textprocess_management_Info = New RepoItemInfo(Me, "TextProcess_Management_", "body/flexobject/container/toolbar/container/text[@id='nav_processManagement']", 10000, Nothing, "7c675430-13c1-4327-b3a1-f17cd29c3363")
            End Sub

            ''' <summary>
            ''' The Self item.
            ''' </summary>
            <RepositoryItem("6b1ee4a4-0f24-421e-9184-50912031ffde")> _
            Public Overridable ReadOnly Property Self As Ranorex.WebDocument
                Get
                    Return _selfInfo.CreateAdapter(Of Ranorex.WebDocument)(True)
                End Get
            End Property

            ''' <summary>
            ''' The Self item info.
            ''' </summary>
            <RepositoryItemInfo("6b1ee4a4-0f24-421e-9184-50912031ffde")> _
            Public Overridable ReadOnly Property SelfInfo As RepoItemInfo
                Get
                    Return _selfInfo
                End Get
            End Property

            ''' <summary>
            ''' The TextProcess_Modeling_ item.
            ''' </summary>
            <RepositoryItem("b7edf8b9-fb84-4a8d-b4ea-e38062705678")> _
            Public Overridable ReadOnly Property TextProcess_Modeling_ As Ranorex.Text
                Get
                    Return _textprocess_modeling_Info.CreateAdapter(Of Ranorex.Text)(True)
                End Get
            End Property

            ''' <summary>
            ''' The TextProcess_Modeling_ item info.
            ''' </summary>
            <RepositoryItemInfo("b7edf8b9-fb84-4a8d-b4ea-e38062705678")> _
            Public Overridable ReadOnly Property TextProcess_Modeling_Info As RepoItemInfo
                Get
                    Return _textprocess_modeling_Info
                End Get
            End Property

            ''' <summary>
            ''' The TextProcess_Management_ item.
            ''' </summary>
            <RepositoryItem("7c675430-13c1-4327-b3a1-f17cd29c3363")> _
            Public Overridable ReadOnly Property TextProcess_Management_ As Ranorex.Text
                Get
                    Return _textprocess_management_Info.CreateAdapter(Of Ranorex.Text)(True)
                End Get
            End Property

            ''' <summary>
            ''' The TextProcess_Management_ item info.
            ''' </summary>
            <RepositoryItemInfo("7c675430-13c1-4327-b3a1-f17cd29c3363")> _
            Public Overridable ReadOnly Property TextProcess_Management_Info As RepoItemInfo
                Get
                    Return _textprocess_management_Info
                End Get
            End Property

            ''' <summary>
            ''' The ContainerMainArea folder.
            ''' </summary>
            <RepositoryFolder("d44ae4d6-c91b-4486-b91e-09d75f644303")> _
            Public Overridable ReadOnly Property ContainerMainArea As Project3RepositoryFolders.ContainerMainAreaFolder
                Get
                    Return _containermainarea
                End Get
            End Property

            ''' <summary>
            ''' The ContextMenuMenu folder.
            ''' </summary>
            <RepositoryFolder("739f41ce-441c-4f81-80aa-79f58e593644")> _
            Public Overridable ReadOnly Property ContextMenuMenu As Project3RepositoryFolders.ContextMenuMenuFolder
                Get
                    Return _contextmenumenu
                End Get
            End Property

            ''' <summary>
            ''' The FlexObjectIceFish folder.
            ''' </summary>
            <RepositoryFolder("8abb97f1-b562-426b-b28c-b43d3f8205e5")> _
            Public Overridable ReadOnly Property FlexObjectIceFish As Project3RepositoryFolders.FlexObjectIceFishFolder
                Get
                    Return _flexobjecticefish
                End Get
            End Property
        End Class

        ''' <summary>
        ''' The ContainerMainAreaFolder folder.
        ''' </summary>
        <RepositoryFolder("d44ae4d6-c91b-4486-b91e-09d75f644303")> _
        Partial Public Class ContainerMainAreaFolder
            Inherits RepoGenBaseFolder
            Dim _selfInfo As RepoItemInfo
            Dim _textprocess_modeling__view_pInfo As RepoItemInfo
            Dim _buttonsubmitInfo As RepoItemInfo
            Dim _textpasswordtextinputInfo As RepoItemInfo
            Dim _textuseridtextinputInfo As RepoItemInfo

            ''' <summary>
            ''' Creates a new ContainerMainArea  folder.
            ''' </summary>
            Public Sub New(parentFolder As RepoGenBaseFolder)
                MyBase.New("ContainerMainArea", "body/flexobject/container/container[@id='mainArea']", parentFolder, 10000, False, "d44ae4d6-c91b-4486-b91e-09d75f644303")

                _selfInfo = New RepoItemInfo(Me, "Self", "", 10000, Nothing, "d44ae4d6-c91b-4486-b91e-09d75f644303")
                _textprocess_modeling__view_pInfo = New RepoItemInfo(Me, "TextProcess_Modeling__View_P", "container/element/container/text[@id='_ViewProcess_Label1']", 10000, Nothing, "d5308aee-ec93-4d3d-a088-5cd6833727d9")
                _buttonsubmitInfo = New RepoItemInfo(Me, "ButtonSubmit", "container[@id='loginHbox']/container/container/form/container[1]/container/button[@text='Submit']", 10000, Nothing, "87acb574-83af-4325-8006-b00cc488a1c4")
                _textpasswordtextinputInfo = New RepoItemInfo(Me, "TextPasswordTextInput", "container[@id='loginHbox']/container/container/form/container[2]/text[@id='passwordTextInput']", 10000, Nothing, "46d9a32e-a73e-4c70-957d-208453d7668d")
                _textuseridtextinputInfo = New RepoItemInfo(Me, "TextUserIdTextInput", "container[@id='loginHbox']/container/container/form/container[3]/text[@id='userIdTextInput']", 10000, Nothing, "aaf8b00d-8223-4ba9-a4a7-eddfa96dd4bd")
            End Sub

            ''' <summary>
            ''' The Self item.
            ''' </summary>
            <RepositoryItem("d44ae4d6-c91b-4486-b91e-09d75f644303")> _
            Public Overridable ReadOnly Property Self As Ranorex.Container
                Get
                    Return _selfInfo.CreateAdapter(Of Ranorex.Container)(True)
                End Get
            End Property

            ''' <summary>
            ''' The Self item info.
            ''' </summary>
            <RepositoryItemInfo("d44ae4d6-c91b-4486-b91e-09d75f644303")> _
            Public Overridable ReadOnly Property SelfInfo As RepoItemInfo
                Get
                    Return _selfInfo
                End Get
            End Property

            ''' <summary>
            ''' The TextProcess_Modeling__View_P item.
            ''' </summary>
            <RepositoryItem("d5308aee-ec93-4d3d-a088-5cd6833727d9")> _
            Public Overridable ReadOnly Property TextProcess_Modeling__View_P As Ranorex.Text
                Get
                    Return _textprocess_modeling__view_pInfo.CreateAdapter(Of Ranorex.Text)(True)
                End Get
            End Property

            ''' <summary>
            ''' The TextProcess_Modeling__View_P item info.
            ''' </summary>
            <RepositoryItemInfo("d5308aee-ec93-4d3d-a088-5cd6833727d9")> _
            Public Overridable ReadOnly Property TextProcess_Modeling__View_PInfo As RepoItemInfo
                Get
                    Return _textprocess_modeling__view_pInfo
                End Get
            End Property

            ''' <summary>
            ''' The ButtonSubmit item.
            ''' </summary>
            <RepositoryItem("87acb574-83af-4325-8006-b00cc488a1c4")> _
            Public Overridable ReadOnly Property ButtonSubmit As Ranorex.Button
                Get
                    Return _buttonsubmitInfo.CreateAdapter(Of Ranorex.Button)(True)
                End Get
            End Property

            ''' <summary>
            ''' The ButtonSubmit item info.
            ''' </summary>
            <RepositoryItemInfo("87acb574-83af-4325-8006-b00cc488a1c4")> _
            Public Overridable ReadOnly Property ButtonSubmitInfo As RepoItemInfo
                Get
                    Return _buttonsubmitInfo
                End Get
            End Property

            ''' <summary>
            ''' The TextPasswordTextInput item.
            ''' </summary>
            <RepositoryItem("46d9a32e-a73e-4c70-957d-208453d7668d")> _
            Public Overridable ReadOnly Property TextPasswordTextInput As Ranorex.Text
                Get
                    Return _textpasswordtextinputInfo.CreateAdapter(Of Ranorex.Text)(True)
                End Get
            End Property

            ''' <summary>
            ''' The TextPasswordTextInput item info.
            ''' </summary>
            <RepositoryItemInfo("46d9a32e-a73e-4c70-957d-208453d7668d")> _
            Public Overridable ReadOnly Property TextPasswordTextInputInfo As RepoItemInfo
                Get
                    Return _textpasswordtextinputInfo
                End Get
            End Property

            ''' <summary>
            ''' The TextUserIdTextInput item.
            ''' </summary>
            <RepositoryItem("aaf8b00d-8223-4ba9-a4a7-eddfa96dd4bd")> _
            Public Overridable ReadOnly Property TextUserIdTextInput As Ranorex.Text
                Get
                    Return _textuseridtextinputInfo.CreateAdapter(Of Ranorex.Text)(True)
                End Get
            End Property

            ''' <summary>
            ''' The TextUserIdTextInput item info.
            ''' </summary>
            <RepositoryItemInfo("aaf8b00d-8223-4ba9-a4a7-eddfa96dd4bd")> _
            Public Overridable ReadOnly Property TextUserIdTextInputInfo As RepoItemInfo
                Get
                    Return _textuseridtextinputInfo
                End Get
            End Property
        End Class

        ''' <summary>
        ''' The ContextMenuMenuFolder folder.
        ''' </summary>
        <RepositoryFolder("739f41ce-441c-4f81-80aa-79f58e593644")> _
        Partial Public Class ContextMenuMenuFolder
            Inherits RepoGenBaseFolder
            Dim _selfInfo As RepoItemInfo
            Dim _menuitemdatasourceInfo As RepoItemInfo
            Dim _menuitemreference_dataInfo As RepoItemInfo
            Dim _menuitemview_processInfo As RepoItemInfo
            Dim _menuitemview_schemaInfo As RepoItemInfo
            Dim _menuitemview_statemachineInfo As RepoItemInfo
            Dim _menuitemprocesses_statusInfo As RepoItemInfo

            ''' <summary>
            ''' Creates a new ContextMenuMenu  folder.
            ''' </summary>
            Public Sub New(parentFolder As RepoGenBaseFolder)
                MyBase.New("ContextMenuMenu", "body/flexobject/contextmenu[1]", parentFolder, 10000, False, "739f41ce-441c-4f81-80aa-79f58e593644")

                _selfInfo = New RepoItemInfo(Me, "Self", "", 10000, Nothing, "739f41ce-441c-4f81-80aa-79f58e593644")
                _menuitemdatasourceInfo = New RepoItemInfo(Me, "MenuItemDataSource", "menuitem[@text='DataSource']", 10000, Nothing, "de609546-1050-459b-b862-0d59c03e7f0e")
                _menuitemreference_dataInfo = New RepoItemInfo(Me, "MenuItemReference_Data", "menuitem[@text='Reference Data']", 10000, Nothing, "e59bf09d-bfd0-43db-af1f-eb60019c0187")
                _menuitemview_processInfo = New RepoItemInfo(Me, "MenuItemView_Process", "menuitem[@text='View Process']", 10000, Nothing, "53b33711-8bb2-4075-b60a-7b84a8156a44")
                _menuitemview_schemaInfo = New RepoItemInfo(Me, "MenuItemView_Schema", "menuitem[@text='View Schema']", 10000, Nothing, "d8ef863a-ec07-43da-ade0-0c397b364edb")
                _menuitemview_statemachineInfo = New RepoItemInfo(Me, "MenuItemView_StateMachine", "menuitem[@text='View StateMachine']", 10000, Nothing, "784f021c-5d67-4064-aadf-43128e0c29b6")
                _menuitemprocesses_statusInfo = New RepoItemInfo(Me, "MenuItemProcesses_Status", "menuitem[@text='Processes Status']", 10000, Nothing, "a4f4e2fb-bc69-43ab-bab5-30f7d76e3f44")
            End Sub

            ''' <summary>
            ''' The Self item.
            ''' </summary>
            <RepositoryItem("739f41ce-441c-4f81-80aa-79f58e593644")> _
            Public Overridable ReadOnly Property Self As Ranorex.ContextMenu
                Get
                    Return _selfInfo.CreateAdapter(Of Ranorex.ContextMenu)(True)
                End Get
            End Property

            ''' <summary>
            ''' The Self item info.
            ''' </summary>
            <RepositoryItemInfo("739f41ce-441c-4f81-80aa-79f58e593644")> _
            Public Overridable ReadOnly Property SelfInfo As RepoItemInfo
                Get
                    Return _selfInfo
                End Get
            End Property

            ''' <summary>
            ''' The MenuItemDataSource item.
            ''' </summary>
            <RepositoryItem("de609546-1050-459b-b862-0d59c03e7f0e")> _
            Public Overridable ReadOnly Property MenuItemDataSource As Ranorex.MenuItem
                Get
                    Return _menuitemdatasourceInfo.CreateAdapter(Of Ranorex.MenuItem)(True)
                End Get
            End Property

            ''' <summary>
            ''' The MenuItemDataSource item info.
            ''' </summary>
            <RepositoryItemInfo("de609546-1050-459b-b862-0d59c03e7f0e")> _
            Public Overridable ReadOnly Property MenuItemDataSourceInfo As RepoItemInfo
                Get
                    Return _menuitemdatasourceInfo
                End Get
            End Property

            ''' <summary>
            ''' The MenuItemReference_Data item.
            ''' </summary>
            <RepositoryItem("e59bf09d-bfd0-43db-af1f-eb60019c0187")> _
            Public Overridable ReadOnly Property MenuItemReference_Data As Ranorex.MenuItem
                Get
                    Return _menuitemreference_dataInfo.CreateAdapter(Of Ranorex.MenuItem)(True)
                End Get
            End Property

            ''' <summary>
            ''' The MenuItemReference_Data item info.
            ''' </summary>
            <RepositoryItemInfo("e59bf09d-bfd0-43db-af1f-eb60019c0187")> _
            Public Overridable ReadOnly Property MenuItemReference_DataInfo As RepoItemInfo
                Get
                    Return _menuitemreference_dataInfo
                End Get
            End Property

            ''' <summary>
            ''' The MenuItemView_Process item.
            ''' </summary>
            <RepositoryItem("53b33711-8bb2-4075-b60a-7b84a8156a44")> _
            Public Overridable ReadOnly Property MenuItemView_Process As Ranorex.MenuItem
                Get
                    Return _menuitemview_processInfo.CreateAdapter(Of Ranorex.MenuItem)(True)
                End Get
            End Property

            ''' <summary>
            ''' The MenuItemView_Process item info.
            ''' </summary>
            <RepositoryItemInfo("53b33711-8bb2-4075-b60a-7b84a8156a44")> _
            Public Overridable ReadOnly Property MenuItemView_ProcessInfo As RepoItemInfo
                Get
                    Return _menuitemview_processInfo
                End Get
            End Property

            ''' <summary>
            ''' The MenuItemView_Schema item.
            ''' </summary>
            <RepositoryItem("d8ef863a-ec07-43da-ade0-0c397b364edb")> _
            Public Overridable ReadOnly Property MenuItemView_Schema As Ranorex.MenuItem
                Get
                    Return _menuitemview_schemaInfo.CreateAdapter(Of Ranorex.MenuItem)(True)
                End Get
            End Property

            ''' <summary>
            ''' The MenuItemView_Schema item info.
            ''' </summary>
            <RepositoryItemInfo("d8ef863a-ec07-43da-ade0-0c397b364edb")> _
            Public Overridable ReadOnly Property MenuItemView_SchemaInfo As RepoItemInfo
                Get
                    Return _menuitemview_schemaInfo
                End Get
            End Property

            ''' <summary>
            ''' The MenuItemView_StateMachine item.
            ''' </summary>
            <RepositoryItem("784f021c-5d67-4064-aadf-43128e0c29b6")> _
            Public Overridable ReadOnly Property MenuItemView_StateMachine As Ranorex.MenuItem
                Get
                    Return _menuitemview_statemachineInfo.CreateAdapter(Of Ranorex.MenuItem)(True)
                End Get
            End Property

            ''' <summary>
            ''' The MenuItemView_StateMachine item info.
            ''' </summary>
            <RepositoryItemInfo("784f021c-5d67-4064-aadf-43128e0c29b6")> _
            Public Overridable ReadOnly Property MenuItemView_StateMachineInfo As RepoItemInfo
                Get
                    Return _menuitemview_statemachineInfo
                End Get
            End Property

            ''' <summary>
            ''' The MenuItemProcesses_Status item.
            ''' </summary>
            <RepositoryItem("a4f4e2fb-bc69-43ab-bab5-30f7d76e3f44")> _
            Public Overridable ReadOnly Property MenuItemProcesses_Status As Ranorex.MenuItem
                Get
                    Return _menuitemprocesses_statusInfo.CreateAdapter(Of Ranorex.MenuItem)(True)
                End Get
            End Property

            ''' <summary>
            ''' The MenuItemProcesses_Status item info.
            ''' </summary>
            <RepositoryItemInfo("a4f4e2fb-bc69-43ab-bab5-30f7d76e3f44")> _
            Public Overridable ReadOnly Property MenuItemProcesses_StatusInfo As RepoItemInfo
                Get
                    Return _menuitemprocesses_statusInfo
                End Get
            End Property
        End Class

        ''' <summary>
        ''' The FlexObjectIceFishFolder folder.
        ''' </summary>
        <RepositoryFolder("8abb97f1-b562-426b-b28c-b43d3f8205e5")> _
        Partial Public Class FlexObjectIceFishFolder
            Inherits RepoGenBaseFolder
            Dim _selfInfo As RepoItemInfo
            Dim _textadministration_Info As RepoItemInfo
            Dim _textmonitoring_console_Info As RepoItemInfo
            Dim _menuitemcomponentsInfo As RepoItemInfo
            Dim _menuitemerror_reportingInfo As RepoItemInfo
            Dim _menuitemrolesInfo As RepoItemInfo
            Dim _menuitemserver_adminInfo As RepoItemInfo
            Dim _menuitemuser_adminInfo As RepoItemInfo

            ''' <summary>
            ''' Creates a new FlexObjectIceFish  folder.
            ''' </summary>
            Public Sub New(parentFolder As RepoGenBaseFolder)
                MyBase.New("FlexObjectIceFish", "body/flexobject", parentFolder, 10000, False, "8abb97f1-b562-426b-b28c-b43d3f8205e5")

                _selfInfo = New RepoItemInfo(Me, "Self", "", 10000, Nothing, "8abb97f1-b562-426b-b28c-b43d3f8205e5")
                _textadministration_Info = New RepoItemInfo(Me, "TextAdministration_", "container/toolbar/container/text[@id='nav_admin']", 10000, Nothing, "7d52f729-a010-4f91-a11c-a4e15ead5364")
                _textmonitoring_console_Info = New RepoItemInfo(Me, "TextMonitoring_Console_", "container/toolbar/container/text[@id='nav_exceptionHandling']", 10000, Nothing, "30938ff7-4f08-4a4b-a4bf-33203931e9e3")
                _menuitemcomponentsInfo = New RepoItemInfo(Me, "MenuItemComponents", "contextmenu[1]/menuitem[@text='Components']", 10000, Nothing, "87eca099-5412-42f8-af2d-ef617b264df0")
                _menuitemerror_reportingInfo = New RepoItemInfo(Me, "MenuItemError_Reporting", "contextmenu[1]/menuitem[@text='Error Reporting']", 10000, Nothing, "016ef2e5-e611-4a16-99b3-1b590f16ee35")
                _menuitemrolesInfo = New RepoItemInfo(Me, "MenuItemRoles", "contextmenu[1]/menuitem[@text='Roles']", 10000, Nothing, "a80ae687-1484-4acf-8eb8-26033c248ab5")
                _menuitemserver_adminInfo = New RepoItemInfo(Me, "MenuItemServer_Admin", "contextmenu[1]/menuitem[@text='Server Admin']", 10000, Nothing, "74c47bbc-2636-41a5-ad22-a003817c6c0d")
                _menuitemuser_adminInfo = New RepoItemInfo(Me, "MenuItemUser_Admin", "contextmenu[1]/menuitem[@text='User Admin']", 10000, Nothing, "56118301-556f-4b9a-a251-ee769b13a247")
            End Sub

            ''' <summary>
            ''' The Self item.
            ''' </summary>
            <RepositoryItem("8abb97f1-b562-426b-b28c-b43d3f8205e5")> _
            Public Overridable ReadOnly Property Self As Ranorex.FlexObject
                Get
                    Return _selfInfo.CreateAdapter(Of Ranorex.FlexObject)(True)
                End Get
            End Property

            ''' <summary>
            ''' The Self item info.
            ''' </summary>
            <RepositoryItemInfo("8abb97f1-b562-426b-b28c-b43d3f8205e5")> _
            Public Overridable ReadOnly Property SelfInfo As RepoItemInfo
                Get
                    Return _selfInfo
                End Get
            End Property

            ''' <summary>
            ''' The TextAdministration_ item.
            ''' </summary>
            <RepositoryItem("7d52f729-a010-4f91-a11c-a4e15ead5364")> _
            Public Overridable ReadOnly Property TextAdministration_ As Ranorex.Text
                Get
                    Return _textadministration_Info.CreateAdapter(Of Ranorex.Text)(True)
                End Get
            End Property

            ''' <summary>
            ''' The TextAdministration_ item info.
            ''' </summary>
            <RepositoryItemInfo("7d52f729-a010-4f91-a11c-a4e15ead5364")> _
            Public Overridable ReadOnly Property TextAdministration_Info As RepoItemInfo
                Get
                    Return _textadministration_Info
                End Get
            End Property

            ''' <summary>
            ''' The TextMonitoring_Console_ item.
            ''' </summary>
            <RepositoryItem("30938ff7-4f08-4a4b-a4bf-33203931e9e3")> _
            Public Overridable ReadOnly Property TextMonitoring_Console_ As Ranorex.Text
                Get
                    Return _textmonitoring_console_Info.CreateAdapter(Of Ranorex.Text)(True)
                End Get
            End Property

            ''' <summary>
            ''' The TextMonitoring_Console_ item info.
            ''' </summary>
            <RepositoryItemInfo("30938ff7-4f08-4a4b-a4bf-33203931e9e3")> _
            Public Overridable ReadOnly Property TextMonitoring_Console_Info As RepoItemInfo
                Get
                    Return _textmonitoring_console_Info
                End Get
            End Property

            ''' <summary>
            ''' The MenuItemComponents item.
            ''' </summary>
            <RepositoryItem("87eca099-5412-42f8-af2d-ef617b264df0")> _
            Public Overridable ReadOnly Property MenuItemComponents As Ranorex.MenuItem
                Get
                    Return _menuitemcomponentsInfo.CreateAdapter(Of Ranorex.MenuItem)(True)
                End Get
            End Property

            ''' <summary>
            ''' The MenuItemComponents item info.
            ''' </summary>
            <RepositoryItemInfo("87eca099-5412-42f8-af2d-ef617b264df0")> _
            Public Overridable ReadOnly Property MenuItemComponentsInfo As RepoItemInfo
                Get
                    Return _menuitemcomponentsInfo
                End Get
            End Property

            ''' <summary>
            ''' The MenuItemError_Reporting item.
            ''' </summary>
            <RepositoryItem("016ef2e5-e611-4a16-99b3-1b590f16ee35")> _
            Public Overridable ReadOnly Property MenuItemError_Reporting As Ranorex.MenuItem
                Get
                    Return _menuitemerror_reportingInfo.CreateAdapter(Of Ranorex.MenuItem)(True)
                End Get
            End Property

            ''' <summary>
            ''' The MenuItemError_Reporting item info.
            ''' </summary>
            <RepositoryItemInfo("016ef2e5-e611-4a16-99b3-1b590f16ee35")> _
            Public Overridable ReadOnly Property MenuItemError_ReportingInfo As RepoItemInfo
                Get
                    Return _menuitemerror_reportingInfo
                End Get
            End Property

            ''' <summary>
            ''' The MenuItemRoles item.
            ''' </summary>
            <RepositoryItem("a80ae687-1484-4acf-8eb8-26033c248ab5")> _
            Public Overridable ReadOnly Property MenuItemRoles As Ranorex.MenuItem
                Get
                    Return _menuitemrolesInfo.CreateAdapter(Of Ranorex.MenuItem)(True)
                End Get
            End Property

            ''' <summary>
            ''' The MenuItemRoles item info.
            ''' </summary>
            <RepositoryItemInfo("a80ae687-1484-4acf-8eb8-26033c248ab5")> _
            Public Overridable ReadOnly Property MenuItemRolesInfo As RepoItemInfo
                Get
                    Return _menuitemrolesInfo
                End Get
            End Property

            ''' <summary>
            ''' The MenuItemServer_Admin item.
            ''' </summary>
            <RepositoryItem("74c47bbc-2636-41a5-ad22-a003817c6c0d")> _
            Public Overridable ReadOnly Property MenuItemServer_Admin As Ranorex.MenuItem
                Get
                    Return _menuitemserver_adminInfo.CreateAdapter(Of Ranorex.MenuItem)(True)
                End Get
            End Property

            ''' <summary>
            ''' The MenuItemServer_Admin item info.
            ''' </summary>
            <RepositoryItemInfo("74c47bbc-2636-41a5-ad22-a003817c6c0d")> _
            Public Overridable ReadOnly Property MenuItemServer_AdminInfo As RepoItemInfo
                Get
                    Return _menuitemserver_adminInfo
                End Get
            End Property

            ''' <summary>
            ''' The MenuItemUser_Admin item.
            ''' </summary>
            <RepositoryItem("56118301-556f-4b9a-a251-ee769b13a247")> _
            Public Overridable ReadOnly Property MenuItemUser_Admin As Ranorex.MenuItem
                Get
                    Return _menuitemuser_adminInfo.CreateAdapter(Of Ranorex.MenuItem)(True)
                End Get
            End Property

            ''' <summary>
            ''' The MenuItemUser_Admin item info.
            ''' </summary>
            <RepositoryItemInfo("56118301-556f-4b9a-a251-ee769b13a247")> _
            Public Overridable ReadOnly Property MenuItemUser_AdminInfo As RepoItemInfo
                Get
                    Return _menuitemuser_adminInfo
                End Get
            End Property
        End Class

    End Class
End Namespace
