
package com.headstrong.teevra_fixml_1_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * ApplicationMessageReport can be found in Volume1 of the specification 
 * 
 * <p>Java class for ApplicationMessageReport_message_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApplicationMessageReport_message_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.headstrong.com/TEEVRA-FIXML-1-0}Abstract_message_t">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}ApplicationMessageReportElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}ApplicationMessageReportAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicationMessageReport_message_t", propOrder = {
    "applIDRptGrp"
})
public class ApplicationMessageReportMessageT
    extends AbstractMessageT
{

    @XmlElement(name = "ApplIDRptGrp")
    protected List<ApplIDReportGrpBlockT> applIDRptGrp;
    @XmlAttribute(name = "ApplRptID")
    protected String applRptID;
    @XmlAttribute(name = "ApplReqID")
    protected String applReqID;
    @XmlAttribute(name = "ApplRptTyp")
    protected BigInteger applRptTyp;
    @XmlAttribute(name = "Txt")
    protected String txt;
    @XmlAttribute(name = "EncTxtLen")
    protected BigInteger encTxtLen;
    @XmlAttribute(name = "EncTxt")
    protected String encTxt;

    /**
     * Gets the value of the applIDRptGrp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applIDRptGrp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplIDRptGrp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApplIDReportGrpBlockT }
     * 
     * 
     */
    public List<ApplIDReportGrpBlockT> getApplIDRptGrp() {
        if (applIDRptGrp == null) {
            applIDRptGrp = new ArrayList<ApplIDReportGrpBlockT>();
        }
        return this.applIDRptGrp;
    }

    /**
     * Gets the value of the applRptID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplRptID() {
        return applRptID;
    }

    /**
     * Sets the value of the applRptID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplRptID(String value) {
        this.applRptID = value;
    }

    /**
     * Gets the value of the applReqID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplReqID() {
        return applReqID;
    }

    /**
     * Sets the value of the applReqID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplReqID(String value) {
        this.applReqID = value;
    }

    /**
     * Gets the value of the applRptTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getApplRptTyp() {
        return applRptTyp;
    }

    /**
     * Sets the value of the applRptTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setApplRptTyp(BigInteger value) {
        this.applRptTyp = value;
    }

    /**
     * Gets the value of the txt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxt() {
        return txt;
    }

    /**
     * Sets the value of the txt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxt(String value) {
        this.txt = value;
    }

    /**
     * Gets the value of the encTxtLen property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEncTxtLen() {
        return encTxtLen;
    }

    /**
     * Sets the value of the encTxtLen property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEncTxtLen(BigInteger value) {
        this.encTxtLen = value;
    }

    /**
     * Gets the value of the encTxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncTxt() {
        return encTxt;
    }

    /**
     * Sets the value of the encTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncTxt(String value) {
        this.encTxt = value;
    }

}
