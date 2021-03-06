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
Imports Ranorex.Core.Testing

Namespace Validation_Creation_templates
    ''' <summary>
    ''' The FixLenFormatter recording.
    ''' </summary>
    <TestModule("b4395cad-d8d2-4fe5-bb75-70582cd77294", ModuleType.Recording, 1)> _
    Partial Public Class FixLenFormatter
        Implements ITestModule

        ''' <summary>
        ''' Holds an instance of the FormattersRepository repository.
        ''' </summary>
        Public Shared repo as FormattersRepository = FormattersRepository.Instance

        Shared _instance as FixLenFormatter = new FixLenFormatter()

        ''' <summary>
        ''' Constructs a new instance.
        ''' </summary>
        Sub New()
        End Sub

        ''' <summary>
        ''' Gets a static instance of this recording.
        ''' </summary>
        Public Shared ReadOnly Property Instance As FixLenFormatter
            Get
                Return _instance
            End Get
        End Property

#Region "Variables"

#End Region

        ''' <summary>
        ''' Starts the replay of the static recording <see cref="Instance"/>.
        ''' </summary>
        <System.CodeDom.Compiler.GeneratedCode("Ranorex", "3.0.2")> _
        Public Shared Sub Start()
            TestModuleRunner.Run(Instance)
        End Sub

        ''' <summary>
        ''' Performs the playback of actions in this recording.
        ''' </summary>
        ''' <remarks>You should not call this method directly, instead pass the module
        ''' instance to the <see cref="TestModuleRunner.Run(Of ITestModule)"/> method
        ''' that will in turn invoke this method.</remarks>
        <System.CodeDom.Compiler.GeneratedCode("Ranorex", "3.0.2")> _
        Sub Run() Implements ITestModule.Run
            Mouse.DefaultMoveTime = 60
            Keyboard.DefaultKeyPressTime = 100
            Delay.SpeedFactor = 5.0

            Init()

            Records_Action()
            Delay.Milliseconds(0)
                        
        End Sub

#Region "Image Feature Data"
#End Region

    End Class

End Namespace
