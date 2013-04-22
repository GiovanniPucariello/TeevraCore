
package org.fixprotocol.fixml_5_0_sp2;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * BusinessMessageReject can be found in Volume1 of the specification 
 * 
 * <p>Java class for BusinessMessageReject_message_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessMessageReject_message_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixprotocol.org/FIXML-5-0-SP2}Abstract_message_t">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}BusinessMessageRejectElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}BusinessMessageRejectAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessMessageReject_message_t")
public class BusinessMessageRejectMessageT
    extends AbstractMessageT
{

    @XmlAttribute(name = "RefSeqNum")
    protected BigInteger refSeqNum;
    @XmlAttribute(name = "RefMsgTyp")
    protected String refMsgTyp;
    @XmlAttribute(name = "RefApplVerID")
    protected String refApplVerID;
    @XmlAttribute(name = "RefApplExtID")
    protected BigInteger refApplExtID;
    @XmlAttribute(name = "RefCstmApplVerID")
    protected String refCstmApplVerID;
    @XmlAttribute(name = "BizRejRefID")
    protected String bizRejRefID;
    @XmlAttribute(name = "BizRejRsn")
    protected BigInteger bizRejRsn;
    @XmlAttribute(name = "Txt")
    protected String txt;
    @XmlAttribute(name = "EncTxtLen")
    protected BigInteger encTxtLen;
    @XmlAttribute(name = "EncTxt")
    protected String encTxt;

    /**
     * Gets the value of the refSeqNum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRefSeqNum() {
        return refSeqNum;
    }

    /**
     * Sets the value of the refSeqNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRefSeqNum(BigInteger value) {
        this.refSeqNum = value;
    }

    /**
     * Gets the value of the refMsgTyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefMsgTyp() {
        return refMsgTyp;
    }

    /**
     * Sets the value of the refMsgTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefMsgTyp(String value) {
        this.refMsgTyp = value;
    }

    /**
     * Gets the value of the refApplVerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefApplVerID() {
        return refApplVerID;
    }

    /**
     * Sets the value of the refApplVerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefApplVerID(String value) {
        this.refApplVerID = value;
    }

    /**
     * Gets the value of the refApplExtID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRefApplExtID() {
        return refApplExtID;
    }

    /**
     * Sets the value of the refApplExtID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRefApplExtID(BigInteger value) {
        this.refApplExtID = value;
    }

    /**
     * Gets the value of the refCstmApplVerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefCstmApplVerID() {
        return refCstmApplVerID;
    }

    /**
     * Sets the value of the refCstmApplVerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefCstmApplVerID(String value) {
        this.refCstmApplVerID = value;
    }

    /**
     * Gets the value of the bizRejRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBizRejRefID() {
        return bizRejRefID;
    }

    /**
     * Sets the value of the bizRejRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBizRejRefID(String value) {
        this.bizRejRefID = value;
    }

    /**
     * Gets the value of the bizRejRsn property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBizRejRsn() {
        return bizRejRsn;
    }

    /**
     * Sets the value of the bizRejRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBizRejRsn(BigInteger value) {
        this.bizRejRsn = value;
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
