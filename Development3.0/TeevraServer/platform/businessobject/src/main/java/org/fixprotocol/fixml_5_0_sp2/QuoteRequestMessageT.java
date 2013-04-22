
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
 * QuoteRequest can be found in Volume3 of the specification 
 * 
 * <p>Java class for QuoteRequest_message_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuoteRequest_message_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixprotocol.org/FIXML-5-0-SP2}Abstract_message_t">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}QuoteRequestElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}QuoteRequestAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuoteRequest_message_t", propOrder = {
    "pty",
    "quotReq"
})
public class QuoteRequestMessageT
    extends AbstractMessageT
{

    @XmlElement(name = "Pty")
    protected List<RootPartiesBlockT> pty;
    @XmlElement(name = "QuotReq", required = true)
    protected List<QuotReqGrpBlockT> quotReq;
    @XmlAttribute(name = "ReqID")
    protected String reqID;
    @XmlAttribute(name = "RFQReqID")
    protected String rfqReqID;
    @XmlAttribute(name = "ClOrdID")
    protected String clOrdID;
    @XmlAttribute(name = "BkngTyp")
    protected BigInteger bkngTyp;
    @XmlAttribute(name = "Cpcty")
    protected OrderCapacityEnumT cpcty;
    @XmlAttribute(name = "Rstctions")
    protected String rstctions;
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
     * Gets the value of the quotReq property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quotReq property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuotReq().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuotReqGrpBlockT }
     * 
     * 
     */
    public List<QuotReqGrpBlockT> getQuotReq() {
        if (quotReq == null) {
            quotReq = new ArrayList<QuotReqGrpBlockT>();
        }
        return this.quotReq;
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
     * Gets the value of the clOrdID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClOrdID() {
        return clOrdID;
    }

    /**
     * Sets the value of the clOrdID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClOrdID(String value) {
        this.clOrdID = value;
    }

    /**
     * Gets the value of the bkngTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBkngTyp() {
        return bkngTyp;
    }

    /**
     * Sets the value of the bkngTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBkngTyp(BigInteger value) {
        this.bkngTyp = value;
    }

    /**
     * Gets the value of the cpcty property.
     * 
     * @return
     *     possible object is
     *     {@link OrderCapacityEnumT }
     *     
     */
    public OrderCapacityEnumT getCpcty() {
        return cpcty;
    }

    /**
     * Sets the value of the cpcty property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderCapacityEnumT }
     *     
     */
    public void setCpcty(OrderCapacityEnumT value) {
        this.cpcty = value;
    }

    /**
     * Gets the value of the rstctions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRstctions() {
        return rstctions;
    }

    /**
     * Sets the value of the rstctions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRstctions(String value) {
        this.rstctions = value;
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
