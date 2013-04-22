
package com.headstrong.teevra_fixml_1_0;

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
 * SecurityListUpdateReport can be found in Volume3 of the specification 
 * 
 * <p>Java class for SecurityListUpdateReport_message_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecurityListUpdateReport_message_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.headstrong.com/TEEVRA-FIXML-1-0}Abstract_message_t">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}SecurityListUpdateReportElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}SecurityListUpdateReportAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityListUpdateReport_message_t", propOrder = {
    "applSeqCtrl",
    "secL"
})
public class SecurityListUpdateReportMessageT
    extends AbstractMessageT
{

    @XmlElement(name = "ApplSeqCtrl")
    protected ApplicationSequenceControlBlockT applSeqCtrl;
    @XmlElement(name = "SecL")
    protected List<SecLstUpdRelSymGrpBlockT> secL;
    @XmlAttribute(name = "RptID")
    protected BigInteger rptID;
    @XmlAttribute(name = "ListID")
    protected String listID;
    @XmlAttribute(name = "ListRefID")
    protected String listRefID;
    @XmlAttribute(name = "ListDesc")
    protected String listDesc;
    @XmlAttribute(name = "ListTyp")
    protected String listTyp;
    @XmlAttribute(name = "LstTypSrc")
    protected String lstTypSrc;
    @XmlAttribute(name = "ReqID")
    protected String reqID;
    @XmlAttribute(name = "RspID")
    protected String rspID;
    @XmlAttribute(name = "ReqRslt")
    protected BigInteger reqRslt;
    @XmlAttribute(name = "TotNoReltdSym")
    protected BigInteger totNoReltdSym;
    @XmlAttribute(name = "BizDt")
    protected XMLGregorianCalendar bizDt;
    @XmlAttribute(name = "UpdActn")
    protected SecurityUpdateActionEnumT updActn;
    @XmlAttribute(name = "CorpActn")
    protected CorporateActionEnumT corpActn;
    @XmlAttribute(name = "MktID")
    protected String mktID;
    @XmlAttribute(name = "MktSegID")
    protected String mktSegID;
    @XmlAttribute(name = "TxnTm")
    protected XMLGregorianCalendar txnTm;
    @XmlAttribute(name = "LastFragment")
    protected LastFragmentEnumT lastFragment;

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
     * Gets the value of the secL property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secL property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecLstUpdRelSymGrpBlockT }
     * 
     * 
     */
    public List<SecLstUpdRelSymGrpBlockT> getSecL() {
        if (secL == null) {
            secL = new ArrayList<SecLstUpdRelSymGrpBlockT>();
        }
        return this.secL;
    }

    /**
     * Gets the value of the rptID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRptID() {
        return rptID;
    }

    /**
     * Sets the value of the rptID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRptID(BigInteger value) {
        this.rptID = value;
    }

    /**
     * Gets the value of the listID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListID() {
        return listID;
    }

    /**
     * Sets the value of the listID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListID(String value) {
        this.listID = value;
    }

    /**
     * Gets the value of the listRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListRefID() {
        return listRefID;
    }

    /**
     * Sets the value of the listRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListRefID(String value) {
        this.listRefID = value;
    }

    /**
     * Gets the value of the listDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListDesc() {
        return listDesc;
    }

    /**
     * Sets the value of the listDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListDesc(String value) {
        this.listDesc = value;
    }

    /**
     * Gets the value of the listTyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListTyp() {
        return listTyp;
    }

    /**
     * Sets the value of the listTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListTyp(String value) {
        this.listTyp = value;
    }

    /**
     * Gets the value of the lstTypSrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLstTypSrc() {
        return lstTypSrc;
    }

    /**
     * Sets the value of the lstTypSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLstTypSrc(String value) {
        this.lstTypSrc = value;
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
     * Gets the value of the rspID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRspID() {
        return rspID;
    }

    /**
     * Sets the value of the rspID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRspID(String value) {
        this.rspID = value;
    }

    /**
     * Gets the value of the reqRslt property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReqRslt() {
        return reqRslt;
    }

    /**
     * Sets the value of the reqRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReqRslt(BigInteger value) {
        this.reqRslt = value;
    }

    /**
     * Gets the value of the totNoReltdSym property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotNoReltdSym() {
        return totNoReltdSym;
    }

    /**
     * Sets the value of the totNoReltdSym property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotNoReltdSym(BigInteger value) {
        this.totNoReltdSym = value;
    }

    /**
     * Gets the value of the bizDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBizDt() {
        return bizDt;
    }

    /**
     * Sets the value of the bizDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBizDt(XMLGregorianCalendar value) {
        this.bizDt = value;
    }

    /**
     * Gets the value of the updActn property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityUpdateActionEnumT }
     *     
     */
    public SecurityUpdateActionEnumT getUpdActn() {
        return updActn;
    }

    /**
     * Sets the value of the updActn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityUpdateActionEnumT }
     *     
     */
    public void setUpdActn(SecurityUpdateActionEnumT value) {
        this.updActn = value;
    }

    /**
     * Gets the value of the corpActn property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionEnumT }
     *     
     */
    public CorporateActionEnumT getCorpActn() {
        return corpActn;
    }

    /**
     * Sets the value of the corpActn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionEnumT }
     *     
     */
    public void setCorpActn(CorporateActionEnumT value) {
        this.corpActn = value;
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
     * Gets the value of the lastFragment property.
     * 
     * @return
     *     possible object is
     *     {@link LastFragmentEnumT }
     *     
     */
    public LastFragmentEnumT getLastFragment() {
        return lastFragment;
    }

    /**
     * Sets the value of the lastFragment property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastFragmentEnumT }
     *     
     */
    public void setLastFragment(LastFragmentEnumT value) {
        this.lastFragment = value;
    }

}
