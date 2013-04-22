
package org.fixprotocol.fixml_5_0_sp2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * MarketDefinitionUpdateReport can be found in Volume3 of the specification 
 * 
 * <p>Java class for MarketDefinitionUpdateReport_message_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MarketDefinitionUpdateReport_message_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixprotocol.org/FIXML-5-0-SP2}Abstract_message_t">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}MarketDefinitionUpdateReportElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}MarketDefinitionUpdateReportAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketDefinitionUpdateReport_message_t", propOrder = {
    "applSeqCtrl",
    "baseTrdgRules",
    "ordTypRules",
    "tmInForceRules",
    "execInstRules"
})
public class MarketDefinitionUpdateReportMessageT
    extends AbstractMessageT
{

    @XmlElement(name = "ApplSeqCtrl")
    protected ApplicationSequenceControlBlockT applSeqCtrl;
    @XmlElement(name = "BaseTrdgRules")
    protected BaseTradingRulesBlockT baseTrdgRules;
    @XmlElement(name = "OrdTypRules")
    protected List<OrdTypeRulesBlockT> ordTypRules;
    @XmlElement(name = "TmInForceRules")
    protected List<TimeInForceRulesBlockT> tmInForceRules;
    @XmlElement(name = "ExecInstRules")
    protected List<ExecInstRulesBlockT> execInstRules;
    @XmlAttribute(name = "MktRptID")
    protected String mktRptID;
    @XmlAttribute(name = "MktReqID")
    protected String mktReqID;
    @XmlAttribute(name = "MktUpdtActn")
    protected SecurityUpdateActionEnumT mktUpdtActn;
    @XmlAttribute(name = "MktID")
    protected String mktID;
    @XmlAttribute(name = "MktSegID")
    protected String mktSegID;
    @XmlAttribute(name = "MarketSegmentDesc")
    protected String marketSegmentDesc;
    @XmlAttribute(name = "EncodedMktSegmDescLen")
    protected BigInteger encodedMktSegmDescLen;
    @XmlAttribute(name = "EncodedMktSegmDesc")
    protected String encodedMktSegmDesc;
    @XmlAttribute(name = "ParentMktSegmID")
    protected String parentMktSegmID;
    @XmlAttribute(name = "Ccy")
    protected String ccy;
    @XmlAttribute(name = "TxnTm")
    protected XMLGregorianCalendar txnTm;
    @XmlAttribute(name = "Txt")
    protected String txt;
    @XmlAttribute(name = "EncTxtLen")
    protected BigInteger encTxtLen;
    @XmlAttribute(name = "EncTxt")
    protected String encTxt;

    /**
     * Gets the value of the applSeqCtrl property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationSequenceControlBlockT }
     *     
     */
    public ApplicationSequenceControlBlockT getApplSeqCtrl() {
        return applSeqCtrl;
    }

    /**
     * Sets the value of the applSeqCtrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationSequenceControlBlockT }
     *     
     */
    public void setApplSeqCtrl(ApplicationSequenceControlBlockT value) {
        this.applSeqCtrl = value;
    }

    /**
     * Gets the value of the baseTrdgRules property.
     * 
     * @return
     *     possible object is
     *     {@link BaseTradingRulesBlockT }
     *     
     */
    public BaseTradingRulesBlockT getBaseTrdgRules() {
        return baseTrdgRules;
    }

    /**
     * Sets the value of the baseTrdgRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseTradingRulesBlockT }
     *     
     */
    public void setBaseTrdgRules(BaseTradingRulesBlockT value) {
        this.baseTrdgRules = value;
    }

    /**
     * Gets the value of the ordTypRules property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ordTypRules property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrdTypRules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrdTypeRulesBlockT }
     * 
     * 
     */
    public List<OrdTypeRulesBlockT> getOrdTypRules() {
        if (ordTypRules == null) {
            ordTypRules = new ArrayList<OrdTypeRulesBlockT>();
        }
        return this.ordTypRules;
    }

    /**
     * Gets the value of the tmInForceRules property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tmInForceRules property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTmInForceRules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeInForceRulesBlockT }
     * 
     * 
     */
    public List<TimeInForceRulesBlockT> getTmInForceRules() {
        if (tmInForceRules == null) {
            tmInForceRules = new ArrayList<TimeInForceRulesBlockT>();
        }
        return this.tmInForceRules;
    }

    /**
     * Gets the value of the execInstRules property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the execInstRules property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExecInstRules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExecInstRulesBlockT }
     * 
     * 
     */
    public List<ExecInstRulesBlockT> getExecInstRules() {
        if (execInstRules == null) {
            execInstRules = new ArrayList<ExecInstRulesBlockT>();
        }
        return this.execInstRules;
    }

    /**
     * Gets the value of the mktRptID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMktRptID() {
        return mktRptID;
    }

    /**
     * Sets the value of the mktRptID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMktRptID(String value) {
        this.mktRptID = value;
    }

    /**
     * Gets the value of the mktReqID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMktReqID() {
        return mktReqID;
    }

    /**
     * Sets the value of the mktReqID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMktReqID(String value) {
        this.mktReqID = value;
    }

    /**
     * Gets the value of the mktUpdtActn property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityUpdateActionEnumT }
     *     
     */
    public SecurityUpdateActionEnumT getMktUpdtActn() {
        return mktUpdtActn;
    }

    /**
     * Sets the value of the mktUpdtActn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityUpdateActionEnumT }
     *     
     */
    public void setMktUpdtActn(SecurityUpdateActionEnumT value) {
        this.mktUpdtActn = value;
    }

    /**
     * Gets the value of the mktID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMktID() {
        return mktID;
    }

    /**
     * Sets the value of the mktID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMktID(String value) {
        this.mktID = value;
    }

    /**
     * Gets the value of the mktSegID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMktSegID() {
        return mktSegID;
    }

    /**
     * Sets the value of the mktSegID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMktSegID(String value) {
        this.mktSegID = value;
    }

    /**
     * Gets the value of the marketSegmentDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketSegmentDesc() {
        return marketSegmentDesc;
    }

    /**
     * Sets the value of the marketSegmentDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketSegmentDesc(String value) {
        this.marketSegmentDesc = value;
    }

    /**
     * Gets the value of the encodedMktSegmDescLen property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEncodedMktSegmDescLen() {
        return encodedMktSegmDescLen;
    }

    /**
     * Sets the value of the encodedMktSegmDescLen property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEncodedMktSegmDescLen(BigInteger value) {
        this.encodedMktSegmDescLen = value;
    }

    /**
     * Gets the value of the encodedMktSegmDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncodedMktSegmDesc() {
        return encodedMktSegmDesc;
    }

    /**
     * Sets the value of the encodedMktSegmDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncodedMktSegmDesc(String value) {
        this.encodedMktSegmDesc = value;
    }

    /**
     * Gets the value of the parentMktSegmID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentMktSegmID() {
        return parentMktSegmID;
    }

    /**
     * Sets the value of the parentMktSegmID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentMktSegmID(String value) {
        this.parentMktSegmID = value;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcy(String value) {
        this.ccy = value;
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
