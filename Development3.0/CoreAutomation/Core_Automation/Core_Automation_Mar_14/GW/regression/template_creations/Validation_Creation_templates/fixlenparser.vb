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
    ''' The fixlenparser recording.
    ''' </summary>
    <TestModule("5909fc38-a6b9-4cdc-9a79-af54368efaeb", ModuleType.Recording, 1)> _
    Partial Public Class Fixlenparser
        Implements ITestModule

        ''' <summary>
        ''' Holds an instance of the parsersRepository repository.
        ''' </summary>
        Public Shared repo as parsersRepository = parsersRepository.Instance

        Shared _instance as Fixlenparser = new Fixlenparser()

        ''' <summary>
        ''' Constructs a new instance.
        ''' </summary>
        Sub New()
        End Sub

        ''' <summary>
        ''' Gets a static instance of this recording.
        ''' </summary>
        Public Shared ReadOnly Property Instance As Fixlenparser
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
            Mouse.DefaultMoveTime = 300
            Keyboard.DefaultKeyPressTime = 100
            Delay.SpeedFactor = 1.0

            Init()

            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.ContainerHBox.ButtonParsers' at 74;10.", repo.WebDocumentIceFish.ContainerHBox.ButtonParsersInfo, new RecordItemIndex(0))
            repo.WebDocumentIceFish.ContainerHBox.ButtonParsers.Click("74;10")
            Delay.Milliseconds(1150)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocumentIceFish.ContainerHBox.PictureIcon_7' at 6;8.", repo.WebDocumentIceFish.ContainerHBox.PictureIcon_7Info, new RecordItemIndex(1))
            repo.WebDocumentIceFish.ContainerHBox.PictureIcon_7.MoveTo("6;8")
            Mouse.ButtonDown(MouseButtons.Left)
            Delay.Milliseconds(1010)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocumentIceFish.ContainerHBox.ContainerGraphCanvas' at 254;85.", repo.WebDocumentIceFish.ContainerHBox.ContainerGraphCanvasInfo, new RecordItemIndex(2))
            repo.WebDocumentIceFish.ContainerHBox.ContainerGraphCanvas.MoveTo("254;85")
            Mouse.ButtonUp(MouseButtons.Left)
            Delay.Milliseconds(880)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Right Click item 'WebDocumentIceFish.FlexObjectIceFish.PictureIcon_7_20546' at 33;19.", repo.WebDocumentIceFish.FlexObjectIceFish.PictureIcon_7_20546Info, new RecordItemIndex(3))
            repo.WebDocumentIceFish.FlexObjectIceFish.PictureIcon_7_20546.Click(MouseButtons.Right, "33;19")
            Delay.Milliseconds(850)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'ContextMenuIexplore.MenuItemConfigure_Component' at 35;5.", repo.ContextMenuIexplore.MenuItemConfigure_ComponentInfo, new RecordItemIndex(4))
            repo.ContextMenuIexplore.MenuItemConfigure_Component.Click("35;5", 193)
            Delay.Milliseconds(0)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Id='serviceId') on item 'WebDocumentIceFish.FlexObjectIceFish.TextServiceId'.", repo.WebDocumentIceFish.FlexObjectIceFish.TextServiceIdInfo, new RecordItemIndex(5))
            Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.TextServiceIdInfo, "Id", "serviceId")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Type='TextInput') on item 'WebDocumentIceFish.FlexObjectIceFish.TextServiceId'.", repo.WebDocumentIceFish.FlexObjectIceFish.TextServiceIdInfo, new RecordItemIndex(6))
            Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.TextServiceIdInfo, "Type", "TextInput")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='') on item 'WebDocumentIceFish.FlexObjectIceFish.TextOffSet'.", repo.WebDocumentIceFish.FlexObjectIceFish.TextOffSetInfo, new RecordItemIndex(7))
            Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.TextOffSetInfo, "Text", "")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Id='offSet') on item 'WebDocumentIceFish.FlexObjectIceFish.TextOffSet'.", repo.WebDocumentIceFish.FlexObjectIceFish.TextOffSetInfo, new RecordItemIndex(8))
            Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.TextOffSetInfo, "Id", "offSet")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Type='TextInput') on item 'WebDocumentIceFish.FlexObjectIceFish.TextOffSet'.", repo.WebDocumentIceFish.FlexObjectIceFish.TextOffSetInfo, new RecordItemIndex(9))
            Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.TextOffSetInfo, "Type", "TextInput")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='Parser Type:') on item 'WebDocumentIceFish.FlexObjectIceFish.TextParser_Type_'.", repo.WebDocumentIceFish.FlexObjectIceFish.TextParser_Type_Info, new RecordItemIndex(10))
            Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.TextParser_Type_Info, "Text", "Parser Type:")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Type='Label') on item 'WebDocumentIceFish.FlexObjectIceFish.TextParser_Type_'.", repo.WebDocumentIceFish.FlexObjectIceFish.TextParser_Type_Info, new RecordItemIndex(11))
            Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.TextParser_Type_Info, "Type", "Label")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='') on item 'WebDocumentIceFish.FlexObjectIceFish.TextTextInput'.", repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInputInfo, new RecordItemIndex(12))
            Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInputInfo, "Text", "")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Type='TextInput') on item 'WebDocumentIceFish.FlexObjectIceFish.TextTextInput'.", repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInputInfo, new RecordItemIndex(13))
            Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInputInfo, "Type", "TextInput")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='Schema Name:') on item 'WebDocumentIceFish.FlexObjectIceFish.TextSchema_Name_'.", repo.WebDocumentIceFish.FlexObjectIceFish.TextSchema_Name_Info, new RecordItemIndex(14))
            Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.TextSchema_Name_Info, "Text", "Schema Name:")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Type='Label') on item 'WebDocumentIceFish.FlexObjectIceFish.TextSchema_Name_'.", repo.WebDocumentIceFish.FlexObjectIceFish.TextSchema_Name_Info, new RecordItemIndex(15))
            Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.TextSchema_Name_Info, "Type", "Label")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='Message Start Line:') on item 'WebDocumentIceFish.FlexObjectIceFish.TextMessage_Start_Line_'.", repo.WebDocumentIceFish.FlexObjectIceFish.TextMessage_Start_Line_Info, new RecordItemIndex(16))
            Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.TextMessage_Start_Line_Info, "Text", "Message Start Line:")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='') on item 'WebDocumentIceFish.FlexObjectIceFish.TextMessageStartLine'.", repo.WebDocumentIceFish.FlexObjectIceFish.TextMessageStartLineInfo, new RecordItemIndex(17))
            Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.TextMessageStartLineInfo, "Text", "")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Id='messageStartLine') on item 'WebDocumentIceFish.FlexObjectIceFish.TextMessageStartLine'.", repo.WebDocumentIceFish.FlexObjectIceFish.TextMessageStartLineInfo, new RecordItemIndex(18))
            Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.TextMessageStartLineInfo, "Id", "messageStartLine")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Type='TextInput') on item 'WebDocumentIceFish.FlexObjectIceFish.TextMessageStartLine'.", repo.WebDocumentIceFish.FlexObjectIceFish.TextMessageStartLineInfo, new RecordItemIndex(19))
            Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.TextMessageStartLineInfo, "Type", "TextInput")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='') on item 'WebDocumentIceFish.FlexObjectIceFish.TextFooterPattern'.", repo.WebDocumentIceFish.FlexObjectIceFish.TextFooterPatternInfo, new RecordItemIndex(20))
            Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.TextFooterPatternInfo, "Text", "")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Id='footerPattern') on item 'WebDocumentIceFish.FlexObjectIceFish.TextFooterPattern'.", repo.WebDocumentIceFish.FlexObjectIceFish.TextFooterPatternInfo, new RecordItemIndex(21))
            Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.TextFooterPatternInfo, "Id", "footerPattern")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Type='TextInput') on item 'WebDocumentIceFish.FlexObjectIceFish.TextFooterPattern'.", repo.WebDocumentIceFish.FlexObjectIceFish.TextFooterPatternInfo, new RecordItemIndex(22))
            Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.TextFooterPatternInfo, "Type", "TextInput")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='Footer Pattern:') on item 'WebDocumentIceFish.FlexObjectIceFish.TextFooter_Pattern_'.", repo.WebDocumentIceFish.FlexObjectIceFish.TextFooter_Pattern_Info, new RecordItemIndex(23))
            Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.TextFooter_Pattern_Info, "Text", "Footer Pattern:")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Type='Label') on item 'WebDocumentIceFish.FlexObjectIceFish.TextFooter_Pattern_'.", repo.WebDocumentIceFish.FlexObjectIceFish.TextFooter_Pattern_Info, new RecordItemIndex(24))
            Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.TextFooter_Pattern_Info, "Type", "Label")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='Start Index') on item 'WebDocumentIceFish.FlexObjectIceFish.TextStart_Index'.", repo.WebDocumentIceFish.FlexObjectIceFish.TextStart_IndexInfo, new RecordItemIndex(25))
            Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.TextStart_IndexInfo, "Text", "Start Index")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='End Index') on item 'WebDocumentIceFish.FlexObjectIceFish.TextEnd_Index'.", repo.WebDocumentIceFish.FlexObjectIceFish.TextEnd_IndexInfo, new RecordItemIndex(26))
            Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.TextEnd_IndexInfo, "Text", "End Index")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='Attributes') on item 'WebDocumentIceFish.FlexObjectIceFish.TextAttributes'.", repo.WebDocumentIceFish.FlexObjectIceFish.TextAttributesInfo, new RecordItemIndex(27))
            Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.TextAttributesInfo, "Text", "Attributes")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='Save') on item 'WebDocumentIceFish.FlexObjectIceFish.ButtonSave'.", repo.WebDocumentIceFish.FlexObjectIceFish.ButtonSaveInfo, new RecordItemIndex(28))
            Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.ButtonSaveInfo, "Text", "Save")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='Cancel') on item 'WebDocumentIceFish.FlexObjectIceFish.ButtonCancel'.", repo.WebDocumentIceFish.FlexObjectIceFish.ButtonCancelInfo, new RecordItemIndex(29))
            Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.ButtonCancelInfo, "Text", "Cancel")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='Load template...') on item 'WebDocumentIceFish.FlexObjectIceFish.ButtonLoad_template___'.", repo.WebDocumentIceFish.FlexObjectIceFish.ButtonLoad_template___Info, new RecordItemIndex(30))
            Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.ButtonLoad_template___Info, "Text", "Load template...")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='Save as Template...') on item 'WebDocumentIceFish.FlexObjectIceFish.ButtonSave_as_Template___'.", repo.WebDocumentIceFish.FlexObjectIceFish.ButtonSave_as_Template___Info, new RecordItemIndex(31))
            Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.ButtonSave_as_Template___Info, "Text", "Save as Template...")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='Configure Error Handler...') on item 'WebDocumentIceFish.FlexObjectIceFish.ButtonConfigure_Error_Handler_'.", repo.WebDocumentIceFish.FlexObjectIceFish.ButtonConfigure_Error_Handler_Info, new RecordItemIndex(32))
            Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.ButtonConfigure_Error_Handler_Info, "Text", "Configure Error Handler...")
            Delay.Milliseconds(1980)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.TextServiceId' at 43;10.", repo.WebDocumentIceFish.FlexObjectIceFish.TextServiceIdInfo, new RecordItemIndex(33))
            repo.WebDocumentIceFish.FlexObjectIceFish.TextServiceId.Click("43;10")
            Delay.Milliseconds(3190)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'fixlengthparser'.", new RecordItemIndex(34))
            Keyboard.Press("fixlengthparser")
            Delay.Milliseconds(0)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.ButtonButton' at 16;10.", repo.WebDocumentIceFish.FlexObjectIceFish.ButtonButtonInfo, new RecordItemIndex(35))
            repo.WebDocumentIceFish.FlexObjectIceFish.ButtonButton.Click("16;10")
            Delay.Milliseconds(4980)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'Sample_typ'.", new RecordItemIndex(36))
            Keyboard.Press("Sample_typ")
            Delay.Milliseconds(1320)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.TextOffSet' at 88;9.", repo.WebDocumentIceFish.FlexObjectIceFish.TextOffSetInfo, new RecordItemIndex(37))
            repo.WebDocumentIceFish.FlexObjectIceFish.TextOffSet.Click("88;9")
            Delay.Milliseconds(1460)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key '1' Press.", new RecordItemIndex(38))
            Keyboard.Press(Keys.D1, 2, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(390)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.TextMessageStartLine' at 32;12.", repo.WebDocumentIceFish.FlexObjectIceFish.TextMessageStartLineInfo, new RecordItemIndex(39))
            repo.WebDocumentIceFish.FlexObjectIceFish.TextMessageStartLine.Click("32;12")
            Delay.Milliseconds(40)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key '1' Press.", new RecordItemIndex(40))
            Keyboard.Press(Keys.D1, 2, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(350)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.Text_01' at 34;1.", repo.WebDocumentIceFish.FlexObjectIceFish.Text_01Info, new RecordItemIndex(41))
            repo.WebDocumentIceFish.FlexObjectIceFish.Text_01.Click("34;1")
            Delay.Milliseconds(300)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key '1' Press.", new RecordItemIndex(42))
            Keyboard.Press(Keys.D1, 2, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(470)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.Text_02' at 45;11.", repo.WebDocumentIceFish.FlexObjectIceFish.Text_02Info, new RecordItemIndex(43))
            repo.WebDocumentIceFish.FlexObjectIceFish.Text_02.Click("45;11")
            Delay.Milliseconds(1090)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'NumPad5' Press.", new RecordItemIndex(44))
            Keyboard.Press(Keys.NumPad5, 76, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(1360)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.Text_11' at 62;14.", repo.WebDocumentIceFish.FlexObjectIceFish.Text_11Info, new RecordItemIndex(45))
            repo.WebDocumentIceFish.FlexObjectIceFish.Text_11.Click("62;14")
            Delay.Milliseconds(590)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'NumPad6' Press.", new RecordItemIndex(46))
            Keyboard.Press(Keys.NumPad6, 77, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(800)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.Text_12' at 45;9.", repo.WebDocumentIceFish.FlexObjectIceFish.Text_12Info, new RecordItemIndex(47))
            repo.WebDocumentIceFish.FlexObjectIceFish.Text_12.Click("45;9")
            Delay.Milliseconds(550)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence '{NumPad1}{NumPad1}'.", new RecordItemIndex(48))
            Keyboard.Press("{NumPad1}{NumPad1}")
            Delay.Milliseconds(1030)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.Text_21' at 80;15.", repo.WebDocumentIceFish.FlexObjectIceFish.Text_21Info, new RecordItemIndex(49))
            repo.WebDocumentIceFish.FlexObjectIceFish.Text_21.Click("80;15")
            Delay.Milliseconds(660)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence '{NumPad1}{NumPad2}'.", new RecordItemIndex(50))
            Keyboard.Press("{NumPad1}{NumPad2}")
            Delay.Milliseconds(1260)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.Text_22' at 28;16.", repo.WebDocumentIceFish.FlexObjectIceFish.Text_22Info, new RecordItemIndex(51))
            repo.WebDocumentIceFish.FlexObjectIceFish.Text_22.Click("28;16")
            Delay.Milliseconds(620)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence '{NumPad2}{NumPad0}'.", new RecordItemIndex(52))
            Keyboard.Press("{NumPad2}{NumPad0}")
            Delay.Milliseconds(1480)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.ButtonButton1' at 8;10.", repo.WebDocumentIceFish.FlexObjectIceFish.ButtonButton1Info, new RecordItemIndex(53))
            repo.WebDocumentIceFish.FlexObjectIceFish.ButtonButton1.Click("8;10")
            Delay.Milliseconds(590)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.TextMessage_id' at 28;9.", repo.WebDocumentIceFish.FlexObjectIceFish.TextMessage_idInfo, new RecordItemIndex(54))
            repo.WebDocumentIceFish.FlexObjectIceFish.TextMessage_id.Click("28;9")
            Delay.Milliseconds(400)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.ButtonButton2' at 4;5.", repo.WebDocumentIceFish.FlexObjectIceFish.ButtonButton2Info, new RecordItemIndex(55))
            repo.WebDocumentIceFish.FlexObjectIceFish.ButtonButton2.Click("4;5")
            Delay.Milliseconds(790)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.TextContract_id' at 85;7.", repo.WebDocumentIceFish.FlexObjectIceFish.TextContract_idInfo, new RecordItemIndex(56))
            repo.WebDocumentIceFish.FlexObjectIceFish.TextContract_id.Click("85;7")
            Delay.Milliseconds(540)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.ButtonButton3' at 10;7.", repo.WebDocumentIceFish.FlexObjectIceFish.ButtonButton3Info, new RecordItemIndex(57))
            repo.WebDocumentIceFish.FlexObjectIceFish.ButtonButton3.Click("10;7")
            Delay.Milliseconds(940)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.TextStatus' at 54;9.", repo.WebDocumentIceFish.FlexObjectIceFish.TextStatusInfo, new RecordItemIndex(58))
            repo.WebDocumentIceFish.FlexObjectIceFish.TextStatus.Click("54;9")
            Delay.Milliseconds(2150)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.ButtonSave_as_Template___' at 85;9.", repo.WebDocumentIceFish.FlexObjectIceFish.ButtonSave_as_Template___Info, new RecordItemIndex(59))
            repo.WebDocumentIceFish.FlexObjectIceFish.ButtonSave_as_Template___.Click("85;9")
            Delay.Milliseconds(940)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.TextTextInput1' at 39;8.", repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInput1Info, new RecordItemIndex(60))
            repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInput1.Click("39;8")
            Delay.Milliseconds(660)
                        
            getTempname_fixlen()
            Delay.Milliseconds(2790)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.ButtonSave' at 43;20.", repo.WebDocumentIceFish.FlexObjectIceFish.ButtonSaveInfo, new RecordItemIndex(62))
            repo.WebDocumentIceFish.FlexObjectIceFish.ButtonSave.Click("43;20")
            Delay.Milliseconds(1430)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.ButtonOK' at 39;15.", repo.WebDocumentIceFish.FlexObjectIceFish.ButtonOKInfo, new RecordItemIndex(63))
            repo.WebDocumentIceFish.FlexObjectIceFish.ButtonOK.Click("39;15")
            Delay.Milliseconds(3540)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.ButtonSave' at 47;7.", repo.WebDocumentIceFish.FlexObjectIceFish.ButtonSaveInfo, new RecordItemIndex(64))
            repo.WebDocumentIceFish.FlexObjectIceFish.ButtonSave.Click("47;7")
            Delay.Milliseconds(770)
                        
        End Sub

#Region "Image Feature Data"
#End Region

    End Class

End Namespace