
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
 * QuoteRequestReject can be found in Volume3 of the specification 
 * 
 * <p>Java class for QuoteRequestReject_message_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuoteRequestReject_message_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.headstrong.com/TEEVRA-FIXML-1-0}Abstract_message_t">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}QuoteRequestRejectElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}QuoteRequestRejectAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuoteRequestReject_message_t", propOrder = {
    "pty",
    "quotReqRej"
})
public class QuoteRequestRejectMessageT
    extends AbstractMessageT
{

    @XmlElement(name = "Pty")
    protected List<RootPartiesBlockT> pty;
    @XmlElement(name = "QuotReqRej", required = true)
    protected List<QuotReqRjctGrpBlockT> quotReqRej;
    @XmlAttribute(name = "ReqID")
    protected String reqID;
    @XmlAttribute(name = "RFQReqID")
    protected String rfqReqID;
    @XmlAttribute(name = "ReqRejRsn")
    protected String reqRejRsn;
    @XmlAttribute(name = "PrvtQt")
    protected String prvtQt;
    @XmlAttribute(name = "RspdntTyp")
    protected BigInteger rspdntTyp;
    @XmlAttribute(name = "PrTrdAnon")
    protected String prTrdAnon;
    @XmlAttribute(name = "Txt")
    protected String txt;
    @XmlAttribute(name = "EncTxtLen")
    protected BigInteger encTxtLen;
    @XmlAttribute(name = "EncTxt")
    protected String encTxt;

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
     * {@link RootPartiesBlockT }
     * 
     * 
     */
    public List<RootPartiesBlockT> getPty() {
        if (pty == null) {
            pty = new ArrayList<RootPartiesBlockT>();
        }
        return this.pty;
    }

    /**
     * Gets the value of the quotReqRej property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quotReqRej property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuotReqRej().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuotReqRjctGrpBlockT }
     * 
     * 
     */
    public List<QuotReqRjctGrpBlockT> getQuotReqRej() {
        if (quotReqRej == null) {
            quotReqRej = new ArrayList<QuotReqRjctGrpBlockT>();
        }
        return this.quotReqRej;
    }

    /**
     * Gets the value of the reqID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqID() {
        return reqID;
    }

    /**
     * Sets the value of the reqID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqID(String value) {
        this.reqID = value;
    }

    /**
     * Gets the value of the rfqReqID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFQReqID() {
        return rfqReqID;
    }

    /**
     * Sets the value of the rfqReqID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRFQReqID(String value) {
        this.rfqReqID = value;
    }

    /**
     * Gets the value of the reqRejRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqRejRsn() {
        return reqRejRsn;
    }

    /**
     * Sets the value of the reqRejRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqRejRsn(String value) {
        this.reqRejRsn = value;
    }

    /**
     * Gets the value of the prvtQt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrvtQt() {
        return prvtQt;
    }

    /**
     * Sets the value of the prvtQt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrvtQt(String value) {
        this.prvtQt = value;
    }

    /**
     * Gets the value of the rspdntTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRspdntTyp() {
        return rspdntTyp;
    }

    /**
     * Sets the value of the rspdntTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRspdntTyp(BigInteger value) {
        this.rspdntTyp = value;
    }

    /**
     * Gets the value of the prTrdAnon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrTrdAnon() {
        return prTrdAnon;
    }

    /**
     * Sets the value of the prTrdAnon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrTrdAnon(String value) {
        this.prTrdAnon = value;
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
