
package org.fixprotocol.fixml_5_0_sp2;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Confirmation_Ack can be found in Volume5 of the specification 
 * 
 * <p>Java class for Confirmation_Ack_message_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Confirmation_Ack_message_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixprotocol.org/FIXML-5-0-SP2}Abstract_message_t">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}Confirmation_AckElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}Confirmation_AckAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Confirmation_Ack_message_t")
public class ConfirmationAckMessageT
    extends AbstractMessageT
{

    @XmlAttribute(name = "CnfmID")
    protected String cnfmID;
    @XmlAttribute(name = "TrdDt")
    protected XMLGregorianCalendar trdDt;
    @XmlAttribute(name = "TxnTm")
    protected XMLGregorianCalendar txnTm;
    @XmlAttribute(name = "AffirmStat")
    protected BigInteger affirmStat;
    @XmlAttribute(name = "CnfmRejRsn")
    protected String cnfmRejRsn;
    @XmlAttribute(name = "MtchStat")
    protected String mtchStat;
    @XmlAttribute(name = "Txt")
    protected String txt;
    @XmlAttribute(name = "EncTxtLen")
    protected BigInteger encTxtLen;
    @XmlAttribute(name = "EncTxt")
    protected String encTxt;

    /**
     * Gets the value of the cnfmID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnfmID() {
        return cnfmID;
    }

    /**
     * Sets the value of the cnfmID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnfmID(String value) {
        this.cnfmID = value;
    }

    /**
     * Gets the value of the trdDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTrdDt() {
        return trdDt;
    }

    /**
     * Sets the value of the trdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTrdDt(XMLGregorianCalendar value) {
        this.trdDt = value;
    }

    /**
     * Gets the value of the txnTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTxnTm() {
        return txnTm;
    }

    /**
     * Sets the value of the txnTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTxnTm(XMLGregorianCalendar value) {
        this.txnTm = value;
    }

    /**
     * Gets the value of the affirmStat property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAffirmStat() {
        return affirmStat;
    }

    /**
     * Sets the value of the affirmStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAffirmStat(BigInteger value) {
        this.affirmStat = value;
    }

    /**
     * Gets the value of the cnfmRejRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnfmRejRsn() {
        return cnfmRejRsn;
    }

    /**
     * Sets the value of the cnfmRejRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnfmRejRsn(String value) {
        this.cnfmRejRsn = value;
    }

    /**
     * Gets the value of the mtchStat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMtchStat() {
        return mtchStat;
    }

    /**
     * Sets the value of the mtchStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMtchStat(String value) {
        this.mtchStat = value;
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
