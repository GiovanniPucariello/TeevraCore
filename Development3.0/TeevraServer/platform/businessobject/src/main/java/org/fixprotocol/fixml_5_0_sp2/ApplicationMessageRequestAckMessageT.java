
package org.fixprotocol.fixml_5_0_sp2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * ApplicationMessageRequestAck can be found in Volume1 of the specification 
 * 
 * <p>Java class for ApplicationMessageRequestAck_message_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApplicationMessageRequestAck_message_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixprotocol.org/FIXML-5-0-SP2}Abstract_message_t">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}ApplicationMessageRequestAckElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}ApplicationMessageRequestAckAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicationMessageRequestAck_message_t", propOrder = {
    "applIDReqAckGrp",
    "pty"
})
public class ApplicationMessageRequestAckMessageT
    extends AbstractMessageT
{

    @XmlElement(name = "ApplIDReqAckGrp")
    protected List<ApplIDRequestAckGrpBlockT> applIDReqAckGrp;
    @XmlElement(name = "Pty")
    protected List<PartiesBlockT> pty;
    @XmlAttribute(name = "ApplRespID")
    protected String applRespID;
    @XmlAttribute(name = "ApplReqID")
    protected String applReqID;
    @XmlAttribute(name = "ApplReqTyp")
    protected BigInteger applReqTyp;
    @XmlAttribute(name = "ApplRespTyp")
    protected BigInteger applRespTyp;
    @XmlAttribute(name = "ApplTotMsgCnt")
    protected BigInteger applTotMsgCnt;
    @XmlAttribute(name = "Txt")
    protected String txt;
    @XmlAttribute(name = "EncTxtLen")
    protected BigInteger encTxtLen;
    @XmlAttribute(name = "EncTxt")
    protected String encTxt;

    /**
     * Gets the value of the applIDReqAckGrp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applIDReqAckGrp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplIDReqAckGrp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApplIDRequestAckGrpBlockT }
     * 
     * 
     */
    public List<ApplIDRequestAckGrpBlockT> getApplIDReqAckGrp() {
        if (applIDReqAckGrp == null) {
            applIDReqAckGrp = new ArrayList<ApplIDRequestAckGrpBlockT>();
        }
        return this.applIDReqAckGrp;
    }

    /**
     * Gets the value of the pty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartiesBlockT }
     * 
     * 
     */
    public List<PartiesBlockT> getPty() {
        if (pty == null) {
            pty = new ArrayList<PartiesBlockT>();
        }
        return this.pty;
    }

    /**
     * Gets the value of the applRespID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplRespID() {
        return applRespID;
    }

    /**
     * Sets the value of the applRespID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplRespID(String value) {
        this.applRespID = value;
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
     * Gets the value of the applReqTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getApplReqTyp() {
        return applReqTyp;
    }

    /**
     * Sets the value of the applReqTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setApplReqTyp(BigInteger value) {
        this.applReqTyp = value;
    }

    /**
     * Gets the value of the applRespTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getApplRespTyp() {
        return applRespTyp;
    }

    /**
     * Sets the value of the applRespTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setApplRespTyp(BigInteger value) {
        this.applRespTyp = value;
    }

    /**
     * Gets the value of the applTotMsgCnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getApplTotMsgCnt() {
        return applTotMsgCnt;
    }

    /**
     * Sets the value of the applTotMsgCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setApplTotMsgCnt(BigInteger value) {
        this.applTotMsgCnt = value;
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
