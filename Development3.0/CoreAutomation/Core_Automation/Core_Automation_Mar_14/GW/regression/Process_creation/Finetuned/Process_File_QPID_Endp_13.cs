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
    /// The Process_File_QPID_Endp_13 recording.
    /// </summary>
    [TestModule("ef64521e-2772-46bb-8c61-4d7005aeb4e1", ModuleType.Recording, 1)]
    public partial class Process_File_QPID_Endp_13 : ITestModule
    {
        /// <summary>
        /// Holds an instance of the Pross_FILEEndpoint_13 repository.
        /// </summary>
        public static Pross_FILEEndpoint_13 repo = Pross_FILEEndpoint_13.Instance;

        static Process_File_QPID_Endp_13 instance = new Process_File_QPID_Endp_13();

        /// <summary>
        /// Constructs a new instance.
        /// </summary>
        public Process_File_QPID_Endp_13()
        {
        }

        /// <summary>
        /// Gets a static instance of this recording.
        /// </summary>
        public static Process_File_QPID_Endp_13 Instance
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

            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonEndpoints' at 75;7.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonEndpointsInfo, new RecordItemIndex(0));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonEndpoints.Click("75;7");
            Delay.Milliseconds(800);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureIcon_3' at 10;12.", repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureIcon_3Info, new RecordItemIndex(1));
            repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureIcon_3.MoveTo("10;12");
            Mouse.ButtonDown(MouseButtons.Left);
            Delay.Milliseconds(1150);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocumentLocalhost_8082.ContainerGraphCanvas' at 87;86.", repo.WebDocumentLocalhost_8082.ContainerGraphCanvasInfo, new RecordItemIndex(2));
            repo.WebDocumentLocalhost_8082.ContainerGraphCanvas.MoveTo("87;86");
            Mouse.ButtonUp(MouseButtons.Left);
            Delay.Milliseconds(1680);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerComponent_Palette.ButtonParsers' at 71;8.", repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.ButtonParsersInfo, new RecordItemIndex(3));
            repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.ButtonParsers.Click("71;8");
            Delay.Milliseconds(1960);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureIcon_7' at 6;13.", repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureIcon_7Info, new RecordItemIndex(4));
            repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureIcon_7.MoveTo("6;13");
            Mouse.ButtonDown(MouseButtons.Left);
            Delay.Milliseconds(850);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocumentLocalhost_8082.ContainerGraphCanvas' at 194;156.", repo.WebDocumentLocalhost_8082.ContainerGraphCanvasInfo, new RecordItemIndex(5));
            repo.WebDocumentLocalhost_8082.ContainerGraphCanvas.MoveTo("194;156");
            Mouse.ButtonUp(MouseButtons.Left);
            Delay.Milliseconds(820);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerComponent_Palette.ButtonFormatters' at 91;6.", repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.ButtonFormattersInfo, new RecordItemIndex(6));
            repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.ButtonFormatters.Click("91;6");
            Delay.Milliseconds(2150);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureIcon_10' at 8;17.", repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureIcon_10Info, new RecordItemIndex(7));
            repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureIcon_10.MoveTo("8;17");
            Mouse.ButtonDown(MouseButtons.Left);
            Delay.Milliseconds(790);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocumentLocalhost_8082.ContainerGraphCanvas' at 314;198.", repo.WebDocumentLocalhost_8082.ContainerGraphCanvasInfo, new RecordItemIndex(8));
            repo.WebDocumentLocalhost_8082.ContainerGraphCanvas.MoveTo("314;198");
            Mouse.ButtonUp(MouseButtons.Left);
            Delay.Milliseconds(1790);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerComponent_Palette.ButtonEndpoints' at 69;9.", repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.ButtonEndpointsInfo, new RecordItemIndex(9));
            repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.ButtonEndpoints.Click("69;9");
            Delay.Milliseconds(1880);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureIcon_46' at 9;13.", repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureIcon_46Info, new RecordItemIndex(10));
            repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureIcon_46.MoveTo("9;13");
            Mouse.ButtonDown(MouseButtons.Left);
            Delay.Milliseconds(960);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocumentLocalhost_8082.ContainerGraphCanvas' at 437;228.", repo.WebDocumentLocalhost_8082.ContainerGraphCanvasInfo, new RecordItemIndex(11));
            repo.WebDocumentLocalhost_8082.ContainerGraphCanvas.MoveTo("437;228");
            Mouse.ButtonUp(MouseButtons.Left);
            Delay.Milliseconds(1160);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerComponent_Palette.ButtonRouters' at 60;8.", repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.ButtonRoutersInfo, new RecordItemIndex(12));
            repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.ButtonRouters.Click("60;8");
            Delay.Milliseconds(1260);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureLine' at 10;2.", repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureLineInfo, new RecordItemIndex(13));
            repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureLine.Click("10;2");
            Delay.Milliseconds(320);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_3_3847' at 13;29.", repo.WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_3_3847Info, new RecordItemIndex(14));
            repo.WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_3_3847.MoveTo("13;29");
            Mouse.ButtonDown(MouseButtons.Left);
            Delay.Milliseconds(430);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_7_145117' at 17;35.", repo.WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_7_145117Info, new RecordItemIndex(15));
            repo.WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_7_145117.MoveTo("17;35");
            Mouse.ButtonUp(MouseButtons.Left);
            Delay.Milliseconds(880);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureLine' at 7;14.", repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureLineInfo, new RecordItemIndex(16));
            repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureLine.Click("7;14");
            Delay.Milliseconds(380);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_7_145117' at 14;25.", repo.WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_7_145117Info, new RecordItemIndex(17));
            repo.WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_7_145117.MoveTo("14;25");
            Mouse.ButtonDown(MouseButtons.Left);
            Delay.Milliseconds(680);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_10_265159' at 23;30.", repo.WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_10_265159Info, new RecordItemIndex(18));
            repo.WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_10_265159.MoveTo("23;30");
            Mouse.ButtonUp(MouseButtons.Left);
            Delay.Milliseconds(910);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureLine' at 6;9.", repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureLineInfo, new RecordItemIndex(19));
            repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureLine.Click("6;9");
            Delay.Milliseconds(1010);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_10_265159' at 22;23.", repo.WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_10_265159Info, new RecordItemIndex(20));
            repo.WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_10_265159.MoveTo("22;23");
            Mouse.ButtonDown(MouseButtons.Left);
            Delay.Milliseconds(980);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_46_388189' at 22;19.", repo.WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_46_388189Info, new RecordItemIndex(21));
            repo.WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_46_388189.MoveTo("22;19");
            Mouse.ButtonUp(MouseButtons.Left);
            Delay.Milliseconds(3900);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Right Click item 'WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_3_3847' at 16;23.", repo.WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_3_3847Info, new RecordItemIndex(22));
            repo.WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_3_3847.Click(MouseButtons.Right, "16;23");
            Delay.Milliseconds(930);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'ContextMenuIexplore.MenuItemConfigure_Component' at 25;5.", repo.ContextMenuIexplore.MenuItemConfigure_ComponentInfo, new RecordItemIndex(23));
            repo.ContextMenuIexplore.MenuItemConfigure_Component.Click("25;5");
            Delay.Milliseconds(1010);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad_template___' at 39;8.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad_template___Info, new RecordItemIndex(24));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad_template___.Click("39;8");
            Delay.Milliseconds(850);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonButton' at 124;13.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonButtonInfo, new RecordItemIndex(25));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonButton.Click("124;13");
            Delay.Milliseconds(1260);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextSourcefile' at 50;9.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextSourcefileInfo, new RecordItemIndex(26));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextSourcefile.Click("50;9");
            Delay.Milliseconds(460);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad' at 25;9.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoadInfo, new RecordItemIndex(27));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad.Click("25;9");
            Delay.Milliseconds(1100);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId' at 52;14.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceIdInfo, new RecordItemIndex(28));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId.Click("52;14");
            Delay.Milliseconds(1290);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'filesrc' with focus on 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId'.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceIdInfo, new RecordItemIndex(29));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId.PressKeys("filesrc");
            Delay.Milliseconds(2510);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave' at 28;11.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSaveInfo, new RecordItemIndex(30));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave.Click("28;11");
            Delay.Milliseconds(1010);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Right Click item 'WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_7_145117' at 20;22.", repo.WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_7_145117Info, new RecordItemIndex(31));
            repo.WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_7_145117.Click(MouseButtons.Right, "20;22");
            Delay.Milliseconds(870);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'ContextMenuIexplore.MenuItemConfigure_Component' at 15;7.", repo.ContextMenuIexplore.MenuItemConfigure_ComponentInfo, new RecordItemIndex(32));
            repo.ContextMenuIexplore.MenuItemConfigure_Component.Click("15;7");
            Delay.Milliseconds(880);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad_template___' at 31;9.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad_template___Info, new RecordItemIndex(33));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad_template___.Click("31;9");
            Delay.Milliseconds(840);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonButton' at 111;7.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonButtonInfo, new RecordItemIndex(34));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonButton.Click("111;7");
            Delay.Milliseconds(550);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextFixlenparser' at 51;4.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextFixlenparserInfo, new RecordItemIndex(35));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextFixlenparser.Click("51;4");
            Delay.Milliseconds(520);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad' at 26;8.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoadInfo, new RecordItemIndex(36));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad.Click("26;8");
            Delay.Milliseconds(660);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId1' at 63;13.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId1Info, new RecordItemIndex(37));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId1.Click("63;13");
            Delay.Milliseconds(490);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'fixlenp' with focus on 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId1'.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId1Info, new RecordItemIndex(38));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId1.PressKeys("fixlenp");
            Delay.Milliseconds(2060);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'arser' with focus on 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId1'.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId1Info, new RecordItemIndex(39));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId1.PressKeys("arser");
            Delay.Milliseconds(1540);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave' at 29;4.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSaveInfo, new RecordItemIndex(40));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave.Click("29;4");
            Delay.Milliseconds(930);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Right Click item 'WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_10_265159' at 16;22.", repo.WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_10_265159Info, new RecordItemIndex(41));
            repo.WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_10_265159.Click(MouseButtons.Right, "16;22");
            Delay.Milliseconds(730);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'ContextMenuIexplore.MenuItemConfigure_Component' at 26;4.", repo.ContextMenuIexplore.MenuItemConfigure_ComponentInfo, new RecordItemIndex(42));
            repo.ContextMenuIexplore.MenuItemConfigure_Component.Click("26;4");
            Delay.Milliseconds(960);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad_template___' at 54;9.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad_template___Info, new RecordItemIndex(43));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad_template___.Click("54;9");
            Delay.Milliseconds(820);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonButton' at 126;9.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonButtonInfo, new RecordItemIndex(44));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonButton.Click("126;9");
            Delay.Milliseconds(630);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextFixlenformater' at 76;3.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextFixlenformaterInfo, new RecordItemIndex(45));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextFixlenformater.Click("76;3");
            Delay.Milliseconds(650);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad' at 31;11.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoadInfo, new RecordItemIndex(46));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad.Click("31;11");
            Delay.Milliseconds(710);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId1' at 60;9.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId1Info, new RecordItemIndex(47));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId1.Click("60;9");
            Delay.Milliseconds(510);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'fixlen' with focus on 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId1'.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId1Info, new RecordItemIndex(48));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId1.PressKeys("fixlen");
            Delay.Milliseconds(1020);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'for' with focus on 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId1'.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId1Info, new RecordItemIndex(49));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId1.PressKeys("for");
            Delay.Milliseconds(1290);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave' at 30;11.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSaveInfo, new RecordItemIndex(50));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave.Click("30;11");
            Delay.Milliseconds(930);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Right Click item 'WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_46_388189' at 18;22.", repo.WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_46_388189Info, new RecordItemIndex(51));
            repo.WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_46_388189.Click(MouseButtons.Right, "18;22");
            Delay.Milliseconds(590);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'ContextMenuIexplore.MenuItemConfigure_Component' at 26;9.", repo.ContextMenuIexplore.MenuItemConfigure_ComponentInfo, new RecordItemIndex(52));
            repo.ContextMenuIexplore.MenuItemConfigure_Component.Click("26;9");
            Delay.Milliseconds(910);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad_template___' at 61;6.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad_template___Info, new RecordItemIndex(53));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad_template___.Click("61;6");
            Delay.Milliseconds(990);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonButton' at 58;8.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonButtonInfo, new RecordItemIndex(54));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonButton.Click("58;8");
            Delay.Milliseconds(550);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextQpid' at 20;3.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextQpidInfo, new RecordItemIndex(55));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextQpid.Click("20;3");
            Delay.Milliseconds(490);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad' at 26;10.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoadInfo, new RecordItemIndex(56));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad.Click("26;10");
            Delay.Milliseconds(690);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId2' at 93;16.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId2Info, new RecordItemIndex(57));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId2.Click("93;16");
            Delay.Milliseconds(840);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'qpi' with focus on 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId2'.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId2Info, new RecordItemIndex(58));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId2.PressKeys("qpi");
            Delay.Milliseconds(1180);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'd' with focus on 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId2'.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId2Info, new RecordItemIndex(59));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId2.PressKeys("d");
            Delay.Milliseconds(1460);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'dest' with focus on 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId2'.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId2Info, new RecordItemIndex(60));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId2.PressKeys("dest");
            Delay.Milliseconds(1310);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave' at 34;8.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSaveInfo, new RecordItemIndex(61));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave.Click("34;8");
            Delay.Milliseconds(2430);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerTabNavigator.TabPageError_Reporting' at 49;10.", repo.WebDocumentLocalhost_8082.ContainerTabNavigator.TabPageError_ReportingInfo, new RecordItemIndex(62));
            repo.WebDocumentLocalhost_8082.ContainerTabNavigator.TabPageError_Reporting.Click("49;10");
            Delay.Milliseconds(760);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerTabNavigator.ButtonButton1' at 144;8.", repo.WebDocumentLocalhost_8082.ContainerTabNavigator.ButtonButton1Info, new RecordItemIndex(63));
            repo.WebDocumentLocalhost_8082.ContainerTabNavigator.ButtonButton1.Click("144;8");
            Delay.Milliseconds(1100);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextJMS_ErrReporter' at 69;7.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextJMS_ErrReporterInfo, new RecordItemIndex(64));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextJMS_ErrReporter.Click("69;7");
            Delay.Milliseconds(740);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerTabNavigator.ButtonConfigure' at 37;8.", repo.WebDocumentLocalhost_8082.ContainerTabNavigator.ButtonConfigureInfo, new RecordItemIndex(65));
            repo.WebDocumentLocalhost_8082.ContainerTabNavigator.ButtonConfigure.Click("37;8");
            Delay.Milliseconds(1260);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad_template___' at 56;4.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad_template___Info, new RecordItemIndex(66));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad_template___.Click("56;4");
            Delay.Milliseconds(990);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonButton' at 128;6.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonButtonInfo, new RecordItemIndex(67));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonButton.Click("128;6");
            Delay.Milliseconds(730);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextJMSErrReporter' at 58;7.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextJMSErrReporterInfo, new RecordItemIndex(68));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextJMSErrReporter.Click("58;7");
            Delay.Milliseconds(570);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad' at 24;10.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoadInfo, new RecordItemIndex(69));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad.Click("24;10");
            Delay.Milliseconds(880);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId3' at 59;11.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId3Info, new RecordItemIndex(70));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId3.Click("59;11");
            Delay.Milliseconds(1740);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'jmserr' with focus on 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId3'.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId3Info, new RecordItemIndex(71));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId3.PressKeys("jmserr");
            Delay.Milliseconds(2040);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave' at 27;11.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSaveInfo, new RecordItemIndex(72));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave.Click("27;11");
            Delay.Milliseconds(1510);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerTabNavigator.TabPageProcess_Properties' at 69;7.", repo.WebDocumentLocalhost_8082.ContainerTabNavigator.TabPageProcess_PropertiesInfo, new RecordItemIndex(73));
            repo.WebDocumentLocalhost_8082.ContainerTabNavigator.TabPageProcess_Properties.Click("69;7");
            Delay.Milliseconds(900);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerTabNavigator.TextNameText' at 39;6.", repo.WebDocumentLocalhost_8082.ContainerTabNavigator.TextNameTextInfo, new RecordItemIndex(74));
            repo.WebDocumentLocalhost_8082.ContainerTabNavigator.TextNameText.Click("39;6");
            Delay.Milliseconds(1180);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'file' with focus on 'WebDocumentLocalhost_8082.ContainerTabNavigator.TextNameText'.", repo.WebDocumentLocalhost_8082.ContainerTabNavigator.TextNameTextInfo, new RecordItemIndex(75));
            repo.WebDocumentLocalhost_8082.ContainerTabNavigator.TextNameText.PressKeys("file");
            Delay.Milliseconds(1270);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence '{RShiftKey down}_{RShiftKey up}13' with focus on 'WebDocumentLocalhost_8082.ContainerTabNavigator.TextNameText'.", repo.WebDocumentLocalhost_8082.ContainerTabNavigator.TextNameTextInfo, new RecordItemIndex(76));
            repo.WebDocumentLocalhost_8082.ContainerTabNavigator.TextNameText.PressKeys("{RShiftKey down}_{RShiftKey up}13");
            Delay.Milliseconds(1530);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerTabNavigator.TextUITextField' at 51;14.", repo.WebDocumentLocalhost_8082.ContainerTabNavigator.TextUITextFieldInfo, new RecordItemIndex(77));
            repo.WebDocumentLocalhost_8082.ContainerTabNavigator.TextUITextField.Click("51;14", 260);
            Delay.Milliseconds(0);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'test' with focus on 'WebDocumentLocalhost_8082.ContainerTabNavigator.TextUITextField'.", repo.WebDocumentLocalhost_8082.ContainerTabNavigator.TextUITextFieldInfo, new RecordItemIndex(78));
            repo.WebDocumentLocalhost_8082.ContainerTabNavigator.TextUITextField.PressKeys("test");
            Delay.Milliseconds(1060);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerTabNavigator.CheckBoxRecovery' at 4;8.", repo.WebDocumentLocalhost_8082.ContainerTabNavigator.CheckBoxRecoveryInfo, new RecordItemIndex(79));
            repo.WebDocumentLocalhost_8082.ContainerTabNavigator.CheckBoxRecovery.Click("4;8");
            Delay.Milliseconds(380);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerTabNavigator.CheckBoxPrcsEvntLog' at 6;8.", repo.WebDocumentLocalhost_8082.ContainerTabNavigator.CheckBoxPrcsEvntLogInfo, new RecordItemIndex(80));
            repo.WebDocumentLocalhost_8082.ContainerTabNavigator.CheckBoxPrcsEvntLog.Click("6;8");
            Delay.Milliseconds(320);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerTabNavigator.CheckBoxMsgEvntLog' at 6;4.", repo.WebDocumentLocalhost_8082.ContainerTabNavigator.CheckBoxMsgEvntLogInfo, new RecordItemIndex(81));
            repo.WebDocumentLocalhost_8082.ContainerTabNavigator.CheckBoxMsgEvntLog.Click("6;4");
            Delay.Milliseconds(770);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave1' at 26;8.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave1Info, new RecordItemIndex(82));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave1.Click("26;8");
            Delay.Milliseconds(1380);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonOK' at 44;8.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonOKInfo, new RecordItemIndex(83));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonOK.Click("44;8");
            Delay.Milliseconds(650);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonPublish' at 33;4.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonPublishInfo, new RecordItemIndex(84));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonPublish.Click("33;4");
            Delay.Milliseconds(2120);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonOK1' at 39;8.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonOK1Info, new RecordItemIndex(85));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonOK1.Click("39;8");
            Delay.Milliseconds(870);
            
        }

#region Image Feature Data
#endregion
    }
}
