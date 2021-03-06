///////////////////////////////////////////////////////////////////////////////
//
// This file was automatically generated by RANOREX.
// DO NOT MODIFY THIS FILE! It is regenerated by the designer.
// All your modifications will be lost!
// http://www.ranorex.com
//
///////////////////////////////////////////////////////////////////////////////

using System;
using System.Collections.Generic;
using System.Text;
using System.Text.RegularExpressions;
using System.Drawing;
using System.Threading;
using System.Windows.Forms;

using Ranorex;
using Ranorex.Core;
using Ranorex.Core.Testing;

namespace Finetuned
{
    /// <summary>
    /// The Process_QPID_JMSErr_9 recording.
    /// </summary>
    [TestModule("43ea4728-dfeb-4a45-8fff-cf4a91f39a5c", ModuleType.Recording, 1)]
    public partial class Process_QPID_JMSErr_9 : ITestModule
    {
        /// <summary>
        /// Holds an instance of the QPID_JMS_Error_9 repository.
        /// </summary>
        public static QPID_JMS_Error_9 repo = QPID_JMS_Error_9.Instance;

        static Process_QPID_JMSErr_9 instance = new Process_QPID_JMSErr_9();

        /// <summary>
        /// Constructs a new instance.
        /// </summary>
        public Process_QPID_JMSErr_9()
        {
        }

        /// <summary>
        /// Gets a static instance of this recording.
        /// </summary>
        public static Process_QPID_JMSErr_9 Instance
        {
            get { return instance; }
        }

#region Variables

#endregion

        /// <summary>
        /// Starts the replay of the static recording <see cref="Instance"/>.
        /// </summary>
        [System.CodeDom.Compiler.GeneratedCode("Ranorex", "3.0.2")]
        public static void Start()
        {
            TestModuleRunner.Run(Instance);
        }

        /// <summary>
        /// Performs the playback of actions in this recording.
        /// </summary>
        /// <remarks>You should not call this method directly, instead pass the module
        /// instance to the <see cref="TestModuleRunner.Run(ITestModule)"/> method
        /// that will in turn invoke this method.</remarks>
        [System.CodeDom.Compiler.GeneratedCode("Ranorex", "3.0.2")]
        void ITestModule.Run()
        {
            Mouse.DefaultMoveTime = 300;
            Keyboard.DefaultKeyPressTime = 100;
            Delay.SpeedFactor = 1.0;

            Init();

            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerComponent_Palette.ButtonEndpoints' at 79;8.", repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.ButtonEndpointsInfo, new RecordItemIndex(0));
            repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.ButtonEndpoints.Click("79;8");
            Delay.Milliseconds(4290);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureIcon_46' at 10;13.", repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureIcon_46Info, new RecordItemIndex(1));
            repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureIcon_46.MoveTo("10;13");
            Mouse.ButtonDown(MouseButtons.Left);
            Delay.Milliseconds(2180);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocumentLocalhost_8082.ContainerGraphCanvas' at 153;174.", repo.WebDocumentLocalhost_8082.ContainerGraphCanvasInfo, new RecordItemIndex(2));
            repo.WebDocumentLocalhost_8082.ContainerGraphCanvas.MoveTo("153;174");
            Mouse.ButtonUp(MouseButtons.Left);
            Delay.Milliseconds(2650);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerComponent_Palette.ButtonParsers' at 78;4.", repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.ButtonParsersInfo, new RecordItemIndex(3));
            repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.ButtonParsers.Click("78;4");
            Delay.Milliseconds(2520);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureIcon_6' at 13;13.", repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureIcon_6Info, new RecordItemIndex(4));
            repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureIcon_6.MoveTo("13;13");
            Mouse.ButtonDown(MouseButtons.Left);
            Delay.Milliseconds(930);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocumentLocalhost_8082.ContainerGraphCanvas' at 281;191.", repo.WebDocumentLocalhost_8082.ContainerGraphCanvasInfo, new RecordItemIndex(5));
            repo.WebDocumentLocalhost_8082.ContainerGraphCanvas.MoveTo("281;191");
            Mouse.ButtonUp(MouseButtons.Left);
            Delay.Milliseconds(1540);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerComponent_Palette.ButtonFormatters' at 87;9.", repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.ButtonFormattersInfo, new RecordItemIndex(6));
            repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.ButtonFormatters.Click("87;9");
            Delay.Milliseconds(2690);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureIcon_9' at 10;15.", repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureIcon_9Info, new RecordItemIndex(7));
            repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureIcon_9.MoveTo("10;15");
            Mouse.ButtonDown(MouseButtons.Left);
            Delay.Milliseconds(980);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocumentLocalhost_8082.ContainerGraphCanvas' at 421;209.", repo.WebDocumentLocalhost_8082.ContainerGraphCanvasInfo, new RecordItemIndex(8));
            repo.WebDocumentLocalhost_8082.ContainerGraphCanvas.MoveTo("421;209");
            Mouse.ButtonUp(MouseButtons.Left);
            Delay.Milliseconds(4050);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerComponent_Palette.ButtonEndpoints' at 74;9.", repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.ButtonEndpointsInfo, new RecordItemIndex(9));
            repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.ButtonEndpoints.Click("74;9");
            Delay.Milliseconds(2040);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureIcon_3' at 8;8.", repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureIcon_3Info, new RecordItemIndex(10));
            repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureIcon_3.MoveTo("8;8");
            Mouse.ButtonDown(MouseButtons.Left);
            Delay.Milliseconds(1160);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocumentLocalhost_8082.ContainerGraphCanvas' at 546;218.", repo.WebDocumentLocalhost_8082.ContainerGraphCanvasInfo, new RecordItemIndex(11));
            repo.WebDocumentLocalhost_8082.ContainerGraphCanvas.MoveTo("546;218");
            Mouse.ButtonUp(MouseButtons.Left);
            Delay.Milliseconds(5460);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerTabNavigator.TabPageError_Reporting' at 54;6.", repo.WebDocumentLocalhost_8082.ContainerTabNavigator.TabPageError_ReportingInfo, new RecordItemIndex(12));
            repo.WebDocumentLocalhost_8082.ContainerTabNavigator.TabPageError_Reporting.Click("54;6");
            Delay.Milliseconds(740);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerTabNavigator.ButtonButton' at 141;12.", repo.WebDocumentLocalhost_8082.ContainerTabNavigator.ButtonButtonInfo, new RecordItemIndex(13));
            repo.WebDocumentLocalhost_8082.ContainerTabNavigator.ButtonButton.Click("141;12");
            Delay.Milliseconds(1120);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextJMS_ErrReporter' at 80;5.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextJMS_ErrReporterInfo, new RecordItemIndex(14));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextJMS_ErrReporter.Click("80;5");
            Delay.Milliseconds(690);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerTabNavigator.ButtonConfigure' at 34;10.", repo.WebDocumentLocalhost_8082.ContainerTabNavigator.ButtonConfigureInfo, new RecordItemIndex(15));
            repo.WebDocumentLocalhost_8082.ContainerTabNavigator.ButtonConfigure.Click("34;10");
            Delay.Milliseconds(1180);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad_template___' at 46;8.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad_template___Info, new RecordItemIndex(16));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad_template___.Click("46;8");
            Delay.Milliseconds(960);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonButton1' at 128;6.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonButton1Info, new RecordItemIndex(17));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonButton1.Click("128;6");
            Delay.Milliseconds(800);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextJMSErrReporter' at 39;2.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextJMSErrReporterInfo, new RecordItemIndex(18));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextJMSErrReporter.Click("39;2");
            Delay.Milliseconds(570);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad' at 31;9.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoadInfo, new RecordItemIndex(19));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad.Click("31;9");
            Delay.Milliseconds(830);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId' at 42;9.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceIdInfo, new RecordItemIndex(20));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId.Click("42;9");
            Delay.Milliseconds(1040);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'jmserr' with focus on 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId'.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceIdInfo, new RecordItemIndex(21));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId.PressKeys("jmserr");
            Delay.Milliseconds(2830);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave' at 24;8.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSaveInfo, new RecordItemIndex(22));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave.Click("24;8");
            Delay.Milliseconds(2570);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerTabNavigator.TabPageProcess_Properties' at 73;9.", repo.WebDocumentLocalhost_8082.ContainerTabNavigator.TabPageProcess_PropertiesInfo, new RecordItemIndex(23));
            repo.WebDocumentLocalhost_8082.ContainerTabNavigator.TabPageProcess_Properties.Click("73;9");
            Delay.Milliseconds(2160);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerComponent_Palette.ButtonRouters' at 71;8.", repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.ButtonRoutersInfo, new RecordItemIndex(24));
            repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.ButtonRouters.Click("71;8");
            Delay.Milliseconds(1580);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureLine' at 8;6.", repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureLineInfo, new RecordItemIndex(25));
            repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureLine.Click("8;6");
            Delay.Milliseconds(300);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_46_104135' at 23;27.", repo.WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_46_104135Info, new RecordItemIndex(26));
            repo.WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_46_104135.MoveTo("23;27");
            Mouse.ButtonDown(MouseButtons.Left);
            Delay.Milliseconds(620);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_6_232152' at 12;19.", repo.WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_6_232152Info, new RecordItemIndex(27));
            repo.WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_6_232152.MoveTo("12;19");
            Mouse.ButtonUp(MouseButtons.Left);
            Delay.Milliseconds(630);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureLine' at 12;8.", repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureLineInfo, new RecordItemIndex(28));
            repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureLine.Click("12;8");
            Delay.Milliseconds(340);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_6_232152' at 19;24.", repo.WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_6_232152Info, new RecordItemIndex(29));
            repo.WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_6_232152.MoveTo("19;24");
            Mouse.ButtonDown(MouseButtons.Left);
            Delay.Milliseconds(800);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_9_372170' at 17;24.", repo.WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_9_372170Info, new RecordItemIndex(30));
            repo.WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_9_372170.MoveTo("17;24");
            Mouse.ButtonUp(MouseButtons.Left);
            Delay.Milliseconds(740);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureLine' at 10;6.", repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureLineInfo, new RecordItemIndex(31));
            repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureLine.Click("10;6");
            Delay.Milliseconds(570);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_9_372170' at 17;27.", repo.WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_9_372170Info, new RecordItemIndex(32));
            repo.WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_9_372170.MoveTo("17;27");
            Mouse.ButtonDown(MouseButtons.Left);
            Delay.Milliseconds(870);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_3_497179' at 21;23.", repo.WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_3_497179Info, new RecordItemIndex(33));
            repo.WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_3_497179.MoveTo("21;23");
            Mouse.ButtonUp(MouseButtons.Left);
            Delay.Milliseconds(1070);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Right Click item 'WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_46_104135' at 12;23.", repo.WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_46_104135Info, new RecordItemIndex(34));
            repo.WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_46_104135.Click(MouseButtons.Right, "12;23");
            Delay.Milliseconds(1010);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'ContextMenuIexplore.MenuItemConfigure_Component' at 38;5.", repo.ContextMenuIexplore.MenuItemConfigure_ComponentInfo, new RecordItemIndex(35));
            repo.ContextMenuIexplore.MenuItemConfigure_Component.Click("38;5");
            Delay.Milliseconds(880);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad_template___' at 45;10.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad_template___Info, new RecordItemIndex(36));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad_template___.Click("45;10");
            Delay.Milliseconds(740);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonButton1' at 61;11.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonButton1Info, new RecordItemIndex(37));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonButton1.Click("61;11");
            Delay.Milliseconds(630);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextQpid' at 13;7.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextQpidInfo, new RecordItemIndex(38));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextQpid.Click("13;7");
            Delay.Milliseconds(790);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad' at 17;8.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoadInfo, new RecordItemIndex(39));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad.Click("17;8");
            Delay.Milliseconds(1240);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId1' at 26;14.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId1Info, new RecordItemIndex(40));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId1.Click("26;14");
            Delay.Milliseconds(300);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'q' with focus on 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId1'.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId1Info, new RecordItemIndex(41));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId1.PressKeys("q");
            Delay.Milliseconds(850);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'pidsrc' with focus on 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId1'.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId1Info, new RecordItemIndex(42));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId1.PressKeys("pidsrc");
            Delay.Milliseconds(2410);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave' at 34;9.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSaveInfo, new RecordItemIndex(43));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave.Click("34;9");
            Delay.Milliseconds(480);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Right Click item 'WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_6_232152' at 19;25.", repo.WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_6_232152Info, new RecordItemIndex(44));
            repo.WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_6_232152.Click(MouseButtons.Right, "19;25");
            Delay.Milliseconds(770);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'ContextMenuIexplore.MenuItemConfigure_Component' at 30;12.", repo.ContextMenuIexplore.MenuItemConfigure_ComponentInfo, new RecordItemIndex(45));
            repo.ContextMenuIexplore.MenuItemConfigure_Component.Click("30;12");
            Delay.Milliseconds(880);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad_template___' at 77;11.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad_template___Info, new RecordItemIndex(46));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad_template___.Click("77;11");
            Delay.Milliseconds(980);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonButton1' at 93;11.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonButton1Info, new RecordItemIndex(47));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonButton1.Click("93;11");
            Delay.Milliseconds(650);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextParserfile' at 53;4.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextParserfileInfo, new RecordItemIndex(48));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextParserfile.Click("53;4");
            Delay.Milliseconds(840);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad' at 29;10.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoadInfo, new RecordItemIndex(49));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad.Click("29;10");
            Delay.Milliseconds(880);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId2' at 92;9.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId2Info, new RecordItemIndex(50));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId2.Click("92;9");
            Delay.Milliseconds(590);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'pars{e down}' with focus on 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId2'.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId2Info, new RecordItemIndex(51));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId2.PressKeys("pars{e down}");
            Delay.Milliseconds(1290);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'r{e up}' with focus on 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId2'.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId2Info, new RecordItemIndex(52));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId2.PressKeys("r{e up}");
            Delay.Milliseconds(790);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'file' with focus on 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId2'.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId2Info, new RecordItemIndex(53));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId2.PressKeys("file");
            Delay.Milliseconds(1970);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave' at 31;7.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSaveInfo, new RecordItemIndex(54));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave.Click("31;7");
            Delay.Milliseconds(1080);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Right Click item 'WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_9_372170' at 18;23.", repo.WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_9_372170Info, new RecordItemIndex(55));
            repo.WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_9_372170.Click(MouseButtons.Right, "18;23");
            Delay.Milliseconds(850);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'ContextMenuIexplore.MenuItemConfigure_Component' at 17;4.", repo.ContextMenuIexplore.MenuItemConfigure_ComponentInfo, new RecordItemIndex(56));
            repo.ContextMenuIexplore.MenuItemConfigure_Component.Click("17;4");
            Delay.Milliseconds(1820);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad_template___' at 48;5.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad_template___Info, new RecordItemIndex(57));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad_template___.Click("48;5");
            Delay.Milliseconds(850);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonButton1' at 115;9.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonButton1Info, new RecordItemIndex(58));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonButton1.Click("115;9");
            Delay.Milliseconds(550);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextTagFormater' at 57;11.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextTagFormaterInfo, new RecordItemIndex(59));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextTagFormater.Click("57;11");
            Delay.Milliseconds(650);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad' at 29;13.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoadInfo, new RecordItemIndex(60));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad.Click("29;13");
            Delay.Milliseconds(1130);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId2' at 86;17.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId2Info, new RecordItemIndex(61));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId2.Click("86;17");
            Delay.Milliseconds(1790);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'tagdelfor' with focus on 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId2'.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId2Info, new RecordItemIndex(62));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId2.PressKeys("tagdelfor");
            Delay.Milliseconds(2470);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave' at 26;6.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSaveInfo, new RecordItemIndex(63));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave.Click("26;6");
            Delay.Milliseconds(1160);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Right Click item 'WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_3_497179' at 23;22.", repo.WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_3_497179Info, new RecordItemIndex(64));
            repo.WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_3_497179.Click(MouseButtons.Right, "23;22");
            Delay.Milliseconds(1040);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'ContextMenuIexplore.MenuItemConfigure_Component' at 30;0.", repo.ContextMenuIexplore.MenuItemConfigure_ComponentInfo, new RecordItemIndex(65));
            repo.ContextMenuIexplore.MenuItemConfigure_Component.Click("30;0");
            Delay.Milliseconds(1120);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad_template___' at 71;5.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad_template___Info, new RecordItemIndex(66));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad_template___.Click("71;5");
            Delay.Milliseconds(800);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonButton1' at 124;11.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonButton1Info, new RecordItemIndex(67));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonButton1.Click("124;11");
            Delay.Milliseconds(1580);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextDestinationfile' at 70;10.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextDestinationfileInfo, new RecordItemIndex(68));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextDestinationfile.Click("70;10");
            Delay.Milliseconds(880);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad' at 26;10.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoadInfo, new RecordItemIndex(69));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad.Click("26;10");
            Delay.Milliseconds(910);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId3' at 56;13.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId3Info, new RecordItemIndex(70));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId3.Click("56;13", 290);
            Delay.Milliseconds(0);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'dest' with focus on 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId3'.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId3Info, new RecordItemIndex(71));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId3.PressKeys("dest");
            Delay.Milliseconds(1310);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave' at 25;10.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSaveInfo, new RecordItemIndex(72));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave.Click("25;10");
            Delay.Milliseconds(1940);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerTabNavigator.TextNameText' at 61;12.", repo.WebDocumentLocalhost_8082.ContainerTabNavigator.TextNameTextInfo, new RecordItemIndex(73));
            repo.WebDocumentLocalhost_8082.ContainerTabNavigator.TextNameText.Click("61;12");
            Delay.Milliseconds(1290);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'qpi' with focus on 'WebDocumentLocalhost_8082.ContainerTabNavigator.TextNameText'.", repo.WebDocumentLocalhost_8082.ContainerTabNavigator.TextNameTextInfo, new RecordItemIndex(74));
            repo.WebDocumentLocalhost_8082.ContainerTabNavigator.TextNameText.PressKeys("qpi");
            Delay.Milliseconds(1320);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'd' with focus on 'WebDocumentLocalhost_8082.ContainerTabNavigator.TextNameText'.", repo.WebDocumentLocalhost_8082.ContainerTabNavigator.TextNameTextInfo, new RecordItemIndex(75));
            repo.WebDocumentLocalhost_8082.ContainerTabNavigator.TextNameText.PressKeys("d");
            Delay.Milliseconds(910);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence '{RShiftKey down}_{RShiftKey up}' with focus on 'WebDocumentLocalhost_8082.ContainerTabNavigator.TextNameText'.", repo.WebDocumentLocalhost_8082.ContainerTabNavigator.TextNameTextInfo, new RecordItemIndex(76));
            repo.WebDocumentLocalhost_8082.ContainerTabNavigator.TextNameText.PressKeys("{RShiftKey down}_{RShiftKey up}");
            Delay.Milliseconds(2840);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence '9' with focus on 'WebDocumentLocalhost_8082.ContainerTabNavigator.TextNameText'.", repo.WebDocumentLocalhost_8082.ContainerTabNavigator.TextNameTextInfo, new RecordItemIndex(77));
            repo.WebDocumentLocalhost_8082.ContainerTabNavigator.TextNameText.PressKeys("9");
            Delay.Milliseconds(830);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerTabNavigator.TextUITextField' at 58;16.", repo.WebDocumentLocalhost_8082.ContainerTabNavigator.TextUITextFieldInfo, new RecordItemIndex(78));
            repo.WebDocumentLocalhost_8082.ContainerTabNavigator.TextUITextField.Click("58;16");
            Delay.Milliseconds(240);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'test9' with focus on 'WebDocumentLocalhost_8082.ContainerTabNavigator.TextUITextField'.", repo.WebDocumentLocalhost_8082.ContainerTabNavigator.TextUITextFieldInfo, new RecordItemIndex(79));
            repo.WebDocumentLocalhost_8082.ContainerTabNavigator.TextUITextField.PressKeys("test9");
            Delay.Milliseconds(730);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerTabNavigator.CheckBoxRecovery' at 9;8.", repo.WebDocumentLocalhost_8082.ContainerTabNavigator.CheckBoxRecoveryInfo, new RecordItemIndex(80));
            repo.WebDocumentLocalhost_8082.ContainerTabNavigator.CheckBoxRecovery.Click("9;8");
            Delay.Milliseconds(430);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerTabNavigator.CheckBoxPrcsEvntLog' at 8;9.", repo.WebDocumentLocalhost_8082.ContainerTabNavigator.CheckBoxPrcsEvntLogInfo, new RecordItemIndex(81));
            repo.WebDocumentLocalhost_8082.ContainerTabNavigator.CheckBoxPrcsEvntLog.Click("8;9");
            Delay.Milliseconds(400);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerTabNavigator.CheckBoxMsgEvntLog' at 9;4.", repo.WebDocumentLocalhost_8082.ContainerTabNavigator.CheckBoxMsgEvntLogInfo, new RecordItemIndex(82));
            repo.WebDocumentLocalhost_8082.ContainerTabNavigator.CheckBoxMsgEvntLog.Click("9;4");
            Delay.Milliseconds(790);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave1' at 24;8.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave1Info, new RecordItemIndex(83));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave1.Click("24;8");
            Delay.Milliseconds(2480);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonOK' at 39;6.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonOKInfo, new RecordItemIndex(84));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonOK.Click("39;6");
            Delay.Milliseconds(760);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonPublish' at 31;8.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonPublishInfo, new RecordItemIndex(85));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonPublish.Click("31;8");
            Delay.Milliseconds(4370);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonOK1' at 42;8.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonOK1Info, new RecordItemIndex(86));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonOK1.Click("42;8");
            Delay.Milliseconds(770);
            
        }

#region Image Feature Data
#endregion
    }
}
