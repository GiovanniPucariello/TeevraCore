//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.06.08 at 01:47:27 PM IST 
//


package org.fixprotocol.fixml_5_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * SettlInstructionsData is a component
 * 
 * <p>Java class for SettlInstructionsData_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SettlInstructionsData_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0}SettlInstructionsDataElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0}SettlInstructionsDataAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlInstructionsData_Block_t", propOrder = {
    "dlvInst"
})
public class SettlInstructionsDataBlockT {

    @XmlElement(name = "DlvInst")
    protected DlvyInstGrpBlockT dlvInst;
    @XmlAttribute(name = "DlvryTyp")
    protected Integer dlvryTyp;
    @XmlAttribute(name = "StandInstDbTyp")
    protected Integer standInstDbTyp;
    @XmlAttribute(name = "StandInstDbName")
    protected String standInstDbName;
    @XmlAttribute(name = "StandInstDbID")
    protected String standInstDbID;

    /**
     * Gets the value of the dlvInst property.
     * 
     * @return
     *     possible object is
     *     {@link DlvyInstGrpBlockT }
     *     
     */
    public DlvyInstGrpBlockT getDlvInst() {
        return dlvInst;
    }

    /**
     * Sets the value of the dlvInst property.
     * 
     * @param value
     *     allowed object is
     *     {@link DlvyInstGrpBlockT }
     *     
     */
    public void setDlvInst(DlvyInstGrpBlockT value) {
        this.dlvInst = value;
    }

    /**
     * Gets the value of the dlvryTyp property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDlvryTyp() {
        return dlvryTyp;
    }

    /**
     * Sets the value of the dlvryTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDlvryTyp(Integer value) {
        this.dlvryTyp = value;
    }

    /**
     * Gets the value of the standInstDbTyp property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStandInstDbTyp() {
        return standInstDbTyp;
    }

    /**
     * Sets the value of the standInstDbTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStandInstDbTyp(Integer value) {
        this.standInstDbTyp = value;
    }

    /**
     * Gets the value of the standInstDbName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandInstDbName() {
        return standInstDbName;
    }

    /**
     * Sets the value of the standInstDbName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandInstDbName(String value) {
        this.standInstDbName = value;
    }

    /**
     * Gets the value of the standInstDbID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandInstDbID() {
        return standInstDbID;
    }

    /**
     * Sets the value of the standInstDbID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandInstDbID(String value) {
        this.standInstDbID = value;
    }

}