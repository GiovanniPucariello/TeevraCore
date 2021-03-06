﻿///////////////////////////////////////////////////////////////////////////////
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
    /// The Recording26 recording.
    /// </summary>
    [TestModule("1aac9f6d-ee21-483c-8ead-46096ec6f41d", ModuleType.Recording, 1)]
    public partial class Recording26 : ITestModule
    {
        /// <summary>
        /// Holds an instance of the project26Repository repository.
        /// </summary>
        public static project26Repository repo = project26Repository.Instance;

        static Recording26 instance = new Recording26();

        /// <summary>
        /// Constructs a new instance.
        /// </summary>
        public Recording26()
        {
        }

        /// <summary>
        /// Gets a static instance of this recording.
        /// </summary>
        public static Recording26 Instance
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
            Mouse.DefaultMoveTime = 100;
            Keyboard.DefaultKeyPressTime = 100;
            Delay.SpeedFactor = 3.0;

            Init();

            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8080.ContainerComponent_Palette.ButtonEndpoints' at 76;9.", repo.WebDocumentLocalhost_8080.ContainerComponent_Palette.ButtonEndpointsInfo, new RecordItemIndex(0));
            repo.WebDocumentLocalhost_8080.ContainerComponent_Palette.ButtonEndpoints.Click("76;9");
            Delay.Milliseconds(800);
            
            RECORDS26();
            Delay.Milliseconds(0);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8080.FlexObjectIceFish.TextProcess_Modeling_' at 15;5.", repo.WebDocumentLocalhost_8080.FlexObjectIceFish.TextProcess_Modeling_Info, new RecordItemIndex(2));
            repo.WebDocumentLocalhost_8080.FlexObjectIceFish.TextProcess_Modeling_.Click("15;5");
            Delay.Milliseconds(550);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8080.FlexObjectIceFish.MenuItemView_Process' at 28;8.", repo.WebDocumentLocalhost_8080.FlexObjectIceFish.MenuItemView_ProcessInfo, new RecordItemIndex(3));
            repo.WebDocumentLocalhost_8080.FlexObjectIceFish.MenuItemView_Process.Click("28;8");
            Delay.Milliseconds(1350);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8080.FlexObjectIceFish.ButtonNew' at 28;9.", repo.WebDocumentLocalhost_8080.FlexObjectIceFish.ButtonNewInfo, new RecordItemIndex(4));
            repo.WebDocumentLocalhost_8080.FlexObjectIceFish.ButtonNew.Click("28;9");
            Delay.Milliseconds(790);
            
        }

#region Image Feature Data
#endregion
    }
}
