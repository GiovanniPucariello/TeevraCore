/*
 * IzPack - Copyright 2001-2008 Julien Ponge, All Rights Reserved.
 * 
 * http://izpack.org/
 * http://izpack.codehaus.org/
 * 
 * Copyright 2004 Klaus Bartz
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 *     
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.izforge.izpack.panels;

import com.izforge.izpack.installer.InstallData;
import com.izforge.izpack.installer.InstallerFrame;


/**
 * The taget directory selection panel.
 * 
 * @author Julien Ponge
 */
@SuppressWarnings("serial")
public class TeevraTargetPanel extends PathInputPanel {

	public TeevraTargetPanel(InstallerFrame parent, InstallData idata) {
		super(parent, idata);
		// TODO Auto-generated constructor stub
	}/*

	private static final long serialVersionUID = 3257006553327810104L;

	private String variableName;

	*//**
	 * The name of the XML file that specifies the panel layout
	 *//*
	private static final String SPEC_FILE_NAME = "teevraTargetSpec.xml";

	private static final String LANG_FILE_NAME = "teevraTargetLang.xml";
    *//**
     * The parsed result from reading the XML specification from the file
     *//*
    private IXMLElement spec;

    
	
	private Vector<UIElement> elements = new Vector<UIElement>();

	private boolean eventsActivated;

	private LocaleDatabase langpack = null;

    protected int instanceNumber = 0;

    private InstallerFrame parentFrame;
    
    private boolean haveSpec;
    
    private static final String NODE_ID = "panel";

    private static final String FIELD_NODE_ID = "field";

    private static final String INSTANCE_IDENTIFIER = "order";

    protected static final String PANEL_IDENTIFIER = "id";

    private static final String TYPE = "type";

    private static final String DESCRIPTION = "description";

    private static final String VARIABLE = "variable";

    private static final String TEXT = "txt";

    private static final String KEY = "id";

    private static final String SPEC = "spec";

    private static final String SET = "set";

    private static final String REVALIDATE = "revalidate";

    private static final String TOPBUFFER = "topBuffer";

    private static final String TRUE = "true";

    private static final String FALSE = "false";

    private static final String ALIGNMENT = "align";

    private static final String LEFT = "left";

    private static final String CENTER = "center";

    private static final String RIGHT = "right";

    private static final String TOP = "top";

    private static final String ITALICS = "italic";

    private static final String BOLD = "bold";

    private static final String SIZE = "size";

    private static final String VALIDATOR = "validator";

    private static final String PROCESSOR = "processor";

    private static final String CLASS = "class";

    private static final String TITLE_FIELD = "title";

    private static final String TEXT_FIELD = "text";

    private static final String TEXT_SIZE = "size";

    private static final String STATIC_TEXT = "staticText";

    private static final String COMBO_FIELD = "combo";

    private static final String COMBO_CHOICE = "choice";

    private static final String COMBO_VALUE = "value";

    private static final String RADIO_FIELD = "radio";

    private static final String RADIO_CHOICE = "choice";

    private static final String RADIO_VALUE = "value";

    private static final String SPACE_FIELD = "space";

    private static final String DIVIDER_FIELD = "divider";

    private static final String CHECK_FIELD = "check";

    private static final String RULE_FIELD = "rule";

    private static final String RULE_LAYOUT = "layout";

    private static final String RULE_SEPARATOR = "separator";

    private static final String RULE_RESULT_FORMAT = "resultFormat";

    private static final String RULE_PLAIN_STRING = "plainString";

    private static final String RULE_DISPLAY_FORMAT = "displayFormat";

    private static final String RULE_SPECIAL_SEPARATOR = "specialSeparator";

    private static final String RULE_ENCRYPTED = "processed";

    private static final String RULE_PARAM_NAME = "name";

    private static final String RULE_PARAM_VALUE = "value";

    private static final String RULE_PARAM = "param";

    private static final String PWD_FIELD = "password";

    private static final String PWD_INPUT = "pwd";

    private static final String PWD_SIZE = "size";

    private static final String SEARCH_FIELD = "search";

    private static final String FILE_FIELD = "file";

    private static final String DIR_FIELD = "dir";

    private static final String SEARCH_CHOICE = "choice";

    private static final String SEARCH_FILENAME = "filename";

    private static final String SEARCH_RESULT = "result";

    private static final String SEARCH_VALUE = "value";

    private static final String SEARCH_TYPE = "type";

    private static final String SEARCH_FILE = "file";

    private static final String SEARCH_DIRECTORY = "directory";

    private static final String SEARCH_PARENTDIR = "parentdir";

    private static final String SEARCH_CHECKFILENAME = "checkfilename";

    private static final String SELECTEDPACKS = "createForPack"; // renamed

    private static final String UNSELECTEDPACKS = "createForUnselectedPack"; // new

    protected static final String ATTRIBUTE_CONDITIONID_NAME = "conditionid";

    protected static final String VARIABLE_NODE = "variable";

    protected static final String ATTRIBUTE_VARIABLE_NAME = "name";

    protected static final String ATTRIBUTE_VARIABLE_VALUE = "value";

    // node

    private static final String NAME = "name";

    private static final String OS = "os";

    private static final String FAMILY = "family";

    private static final String MULTIPLE_FILE_FIELD = "multiFile";
    
	*//**
	 * The constructor.
	 * 
	 * @param parent
	 *            The parent window.
	 * @param idata
	 *            The installation data.
	 *//*
	public TeevraTargetPanel(InstallerFrame parent, InstallData idata) {
		super(parent, idata);
		this.parentFrame = parent;
		setVariableName("JDKPath");
		setPanelName("TeevraTargetPanel");
	}

	protected void init() {
		eventsActivated = false;
		TwoColumnLayout layout;
		super.removeAll();
		elements.clear();

		// ----------------------------------------------------
		// get a locale database
		// ----------------------------------------------------
		try {
			this.langpack = (LocaleDatabase) parent.langpack.clone();

			String resource = LANG_FILE_NAME + "_" + idata.localeISO3;
			this.langpack.add(ResourceManager.getInstance().getInputStream(
					resource));
		} catch (Throwable exception) {
			exception.printStackTrace();
		}

		// ----------------------------------------------------
		// read the specifications
		// ----------------------------------------------------
		try {
			readSpec();
		} catch (Throwable exception) {
			// log the problem
			exception.printStackTrace();
		}

		// ----------------------------------------------------
		// Set the topBuffer from the attribute. topBuffer=0 is useful
		// if you don't want your panel to be moved up and down during
		// dynamic validation (showing and hiding components within the
		// same panel)
		// ----------------------------------------------------
		int topbuff = 25;
		try {
			topbuff = Integer.parseInt(spec.getAttribute(TOPBUFFER));
		} catch (Exception ex) {
		} finally {
			layout = new TwoColumnLayout(10, 5, 30, topbuff,
					TwoColumnLayout.LEFT);
		}
		setLayout(layout);

		if (!haveSpec) {
			// return if we could not read the spec. further
			// processing will only lead to problems. In this
			// case we must skip the panel when it gets activated.
			return;
		}

		// refresh variables specified in spec
		updateVariables();

		// ----------------------------------------------------
		// process all field nodes. Each field node is analyzed
		// for its type, then an appropriate memeber function
		// is called that will create the correct UI elements.
		// ----------------------------------------------------
		Vector<IXMLElement> fields = spec.getChildrenNamed(FIELD_NODE_ID);

		for (int i = 0; i < fields.size(); i++) {
			IXMLElement field = fields.elementAt(i);
			String attribute = field.getAttribute(TYPE);
			String associatedVariable = field.getAttribute(VARIABLE);
			if (associatedVariable != null) {
				// create automatic existence condition
				createBuiltInVariableConditions(associatedVariable);
			}

			String conditionid = field.getAttribute(ATTRIBUTE_CONDITIONID_NAME);
			if (conditionid != null) {
				// check if condition is fulfilled
				if (!this.parent.getRules().isConditionTrue(conditionid,
						idata.getVariables())) {
					continue;
				}
			}
			if (attribute != null) {
				if (attribute.equals(RULE_FIELD)) {
					addRuleField(field);
				} else if (attribute.equals(TEXT_FIELD)) {
					addTextField(field);
				} else if (attribute.equals(COMBO_FIELD)) {
					addComboBox(field);
				} else if (attribute.equals(RADIO_FIELD)) {
					addRadioButton(field);
				} else if (attribute.equals(PWD_FIELD)) {
					addPasswordField(field);
				} else if (attribute.equals(SPACE_FIELD)) {
					addSpace(field);
				} else if (attribute.equals(DIVIDER_FIELD)) {
					addDivider(field);
				} else if (attribute.equals(CHECK_FIELD)) {
					addCheckBox(field);
				} else if (attribute.equals(STATIC_TEXT)) {
					addText(field);
				} else if (attribute.equals(TITLE_FIELD)) {
					addTitle(field);
				} else if (attribute.equals(SEARCH_FIELD)) {
					addSearch(field);
				} else if (attribute.equals(MULTIPLE_FILE_FIELD)) {
					addMultipleFileField(field);
				} else if (attribute.equals(FILE_FIELD)) {
					addFileField(field);
				} else if (attribute.equals(DIR_FIELD)) {
					addDirectoryField(field);
				}
			}
		}
		eventsActivated = true;
	}

    protected void updateVariables()
    {
        *//**
         * Look if there are new variables defined
         *//*
        Vector<IXMLElement> variables = spec.getChildrenNamed(VARIABLE_NODE);
        RulesEngine rules = parent.getRules();

        VariableSubstitutor vs = new VariableSubstitutor(idata.getVariables());
        for (int i = 0; i < variables.size(); i++)
        {
            IXMLElement variable = variables.elementAt(i);
            String vname = variable.getAttribute(ATTRIBUTE_VARIABLE_NAME);
            String vvalue = variable.getAttribute(ATTRIBUTE_VARIABLE_VALUE);

            if (vvalue == null)
            {
                // try to read value element
                if (variable.hasChildren())
                {
                    IXMLElement value = variable.getFirstChildNamed("value");
                    vvalue = value.getContent();
                }
            }

            String conditionid = variable.getAttribute(ATTRIBUTE_CONDITIONID_NAME);
            if (conditionid != null)
            {
                // check if condition for this variable is fulfilled
                if (!rules.isConditionTrue(conditionid, idata.getVariables()))
                {
                    continue;
                }
            }
            // are there any OS-Constraints?
            if (OsConstraint.oneMatchesCurrentSystem(variable))
            {
                if (vname == null)
                {}
                else
                {
                    // vname is given
                    if (vvalue != null)
                    {
                        // try to substitute variables in value field
                        vvalue = vs.substitute(vvalue, null);
                        // to cut out circular references
                        idata.setVariable(vname, "");
                        vvalue = vs.substitute(vvalue, null);
                    }
                    // try to set variable
                    idata.setVariable(vname, vvalue);

                    // for save this variable to be used later by Automation Helper
                    entries.add(new TextValuePair(vname, vvalue));
                }
            }
        }
    }

	--------------------------------------------------------------------------
	*//**
	 * Reads the XML specification for the panel layout. The result is stored in spec.
	 *
	 * @throws Exception for any problems in reading the specification
	 *//*
	--------------------------------------------------------------------------
	private void readSpec() throws Exception {
		InputStream input = null;
		IXMLElement data;
		Vector<IXMLElement> specElements;
		String attribute;
		String panelattribute;
		String instance = Integer.toString(instanceNumber);

		String panelid = null;
		Panel p = this.getMetadata();
		if (p != null) {
			panelid = p.getPanelid();
		}
		try {
			input = parentFrame.getResource(SPEC_FILE_NAME);
		} catch (Exception exception) {
			haveSpec = false;
			return;
		}
		if (input == null) {
			haveSpec = false;
			return;
		}

		// initialize the parser
		IXMLParser parser = new XMLParser();

		// get the data
		data = parser.parse(input);

		// extract the spec to this specific panel instance
		if (data.hasChildren()) {
			specElements = data.getChildrenNamed(NODE_ID);
			for (int i = 0; i < specElements.size(); i++) {
				data = specElements.elementAt(i);
				attribute = data.getAttribute(INSTANCE_IDENTIFIER);
				panelattribute = data.getAttribute(PANEL_IDENTIFIER);

				if (((attribute != null) && instance.equals(attribute))
						|| ((panelattribute != null) && (panelid != null) && (panelid
								.equals(panelattribute)))) {
					// use the current element as spec
					spec = data;
					// close the stream
					input.close();
					haveSpec = true;
					return;
				}
			}
			haveSpec = false;
			return;
		}
		haveSpec = false;
	}

	--------------------------------------------------------------------------
	*//**
	 * Adds the title to the panel. There can only be one title, if mutiple titles are defined, they
	 * keep overwriting what has already be defined, so that the last definition is the one that
	 * prevails.
	 *
	 * @param spec a <code>IXMLElement</code> containing the specification for the title.
	 *//*
	--------------------------------------------------------------------------
	private void addTitle(IXMLElement spec) {
		String title = getText(spec);
		boolean italic = getBoolean(spec, ITALICS, false);
		boolean bold = getBoolean(spec, BOLD, false);
		float multiplier = getFloat(spec, SIZE, 2.0f);
		int justify = getAlignment(spec);

		String icon = getIconName(spec);

		if (title != null) {
			JLabel label = null;
			ImageIcon imgicon = null;
			try {
				imgicon = parent.icons.getImageIcon(icon);
				label = LabelFactory.create(title, imgicon, JLabel.TRAILING,
						true);
			} catch (Exception e) {
				Debug.trace("Icon " + icon + " not found in icon list. "
						+ e.getMessage());
				label = LabelFactory.create(title);
			}
			Font font = label.getFont();
			float size = font.getSize();
			int style = 0;

			if (bold) {
				style += Font.BOLD;
			}
			if (italic) {
				style += Font.ITALIC;
			}

			font = font.deriveFont(style, (size * multiplier));
			label.setFont(font);
			label.setAlignmentX(0);

			TwoColumnConstraints constraints = new TwoColumnConstraints();
			constraints.align = justify;
			constraints.position = TwoColumnConstraints.NORTH;

			add(label, constraints);
		}
	}

	*//**
	 * Indicates wether the panel has been validated or not.
	 * 
	 * @return Wether the panel has been validated or not.
	 *//*
	public boolean isValidated() {
		// Standard behavior of PathInputPanel.
		if (!super.isValidated()) {
			return (false);
		}
		idata.setVariable(getVariableName(), pathSelectionPanel.getPath());
		return (true);
	}

	*//**
	 * Called when the panel becomes active.
	 *//*
	public void panelActivate() { // Resolve the default for chosenPath
		super.panelActivate();
		// Set the default or old value to the path selection panel.
		pathSelectionPanel.setPath(idata.getVariable(getVariableName()));
	}

	*//**
	 * Returns the name of the variable which should be used for the path.
	 * 
	 * @return the name of the variable which should be used for the path
	 *//*
	public String getVariableName() {
		return variableName;
	}

	*//**
	 * Sets the name for the variable which should be set with the path.
	 * 
	 * @param string
	 *            variable name to be used
	 *//*
	public void setVariableName(String string) {
		variableName = string;
	}

	
	 * (non-Javadoc)
	 * 
	 * @see com.izforge.izpack.installer.IzPanel#getSummaryBody()
	 
	public String getSummaryBody() {
		return (idata.getVariable(getVariableName()));
	}
*/}
