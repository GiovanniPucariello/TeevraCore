
package com.headstrong.teevra_fixml_1_0;

import java.math.BigDecimal;
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
 * SecurityStatus can be found in Volume3 of the specification 
 * 
 * <p>Java class for SecurityStatus_message_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecurityStatus_message_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.headstrong.com/TEEVRA-FIXML-1-0}Abstract_message_t">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}SecurityStatusElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}SecurityStatusAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityStatus_message_t", propOrder = {
    "applSeqCtrl",
    "instrmt",
    "instrmtExt",
    "undly",
    "leg"
})
public class SecurityStatusMessageT
    extends AbstractMessageT
{

    @XmlElement(name = "ApplSeqCtrl")
    protected ApplicationSequenceControlBlockT applSeqCtrl;
    @XmlElement(name = "Instrmt", required = true)
    protected InstrumentBlockT instrmt;
    @XmlElement(name = "InstrmtExt")
    protected InstrumentExtensionBlockT instrmtExt;
    @XmlElement(name = "Undly")
    protected List<UndInstrmtGrpBlockT> undly;
    @XmlElement(name = "Leg")
    protected List<InstrmtLegGrpBlockT> leg;
    @XmlAttribute(name = "StatReqID")
    protected String statReqID;
    @XmlAttribute(name = "Ccy")
    protected String ccy;
    @XmlAttribute(name = "MktID")
    protected String mktID;
    @XmlAttribute(name = "MktSegID")
    protected String mktSegID;
    @XmlAttribute(name = "SesID")
    protected String sesID;
    @XmlAttribute(name = "SesSub")
    protected String sesSub;
    @XmlAttribute(name = "Unsol")
    protected UnsolicitedIndicatorEnumT unsol;
    @XmlAttribute(name = "TrdgStat")
    protected String trdgStat;
    @XmlAttribute(name = "SecTrdEvnt")
    protected String secTrdEvnt;
    @XmlAttribute(name = "FinclStat")
    protected String finclStat;
    @XmlAttribute(name = "CorpActn")
    protected CorporateActionEnumT corpActn;
    @XmlAttribute(name = "HaltRsn")
    protected String haltRsn;
    @XmlAttribute(name = "InViewOfCmn")
    protected InViewOfCommonEnumT inViewOfCmn;
    @XmlAttribute(name = "DueToReltd")
    protected DueToRelatedEnumT dueToReltd;
    @XmlAttribute(name = "MDBkTyp")
    protected BigInteger mdBkTyp;
    @XmlAttribute(name = "MktDepth")
    protected BigInteger mktDepth;
    @XmlAttribute(name = "BuyVol")
    protected BigDecimal buyVol;
    @XmlAttribute(name = "SellVol")
    protected BigDecimal sellVol;
    @XmlAttribute(name = "HighPx")
    protected BigDecimal highPx;
    @XmlAttribute(name = "LowPx")
    protected BigDecimal lowPx;
    @XmlAttribute(name = "LastPx")
    protected BigDecimal lastPx;
    @XmlAttribute(name = "TxnTm")
    protected XMLGregorianCalendar txnTm;
    @XmlAttribute(name = "Adjmt")
    protected BigInteger adjmt;
    @XmlAttribute(name = "FirstPx")
    protected BigDecimal firstPx;
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
     * Gets the value of the instrmt property.
     * 
     * @return
     *     possible object is
     *     {@link InstrumentBlockT }
     *     
     */
    public InstrumentBlockT getInstrmt() {
        return instrmt;
    }

    /**
     * Sets the value of the instrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstrumentBlockT }
     *     
     */
    public void setInstrmt(InstrumentBlockT value) {
        this.instrmt = value;
    }

    /**
     * Gets the value of the instrmtExt property.
     * 
     * @return
     *     possible object is
     *     {@link InstrumentExtensionBlockT }
     *     
     */
    public InstrumentExtensionBlockT getInstrmtExt() {
        return instrmtExt;
    }

    /**
     * Sets the value of the instrmtExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstrumentExtensionBlockT }
     *     
     */
    public void setInstrmtExt(InstrumentExtensionBlockT value) {
        this.instrmtExt = value;
    }

    /**
     * Gets the value of the undly property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the undly property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUndly().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UndInstrmtGrpBlockT }
     * 
     * 
     */
    public List<UndInstrmtGrpBlockT> getUndly() {
        if (undly == null) {
            undly = new ArrayList<UndInstrmtGrpBlockT>();
        }
        return this.undly;
    }

    /**
     * Gets the value of the leg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the leg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLeg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstrmtLegGrpBlockT }
     * 
     * 
     */
    public List<InstrmtLegGrpBlockT> getLeg() {
        if (leg == null) {
            leg = new ArrayList<InstrmtLegGrpBlockT>();
        }
        return this.leg;
    }

    /**
     * Gets the value of the statReqID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatReqID() {
        return statReqID;
    }

    /**
     * Sets the value of the statReqID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatReqID(String value) {
        this.statReqID = value;
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
     * Gets the value of the sesID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSesID() {
        return sesID;
    }

    /**
     * Sets the value of the sesID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSesID(String value) {
        this.sesID = value;
    }

    /**
     * Gets the value of the sesSub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSesSub() {
        return sesSub;
    }

    /**
     * Sets the value of the sesSub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSesSub(String value) {
        this.sesSub = value;
    }

    /**
     * Gets the value of the unsol property.
     * 
     * @return
     *     possible object is
     *     {@link UnsolicitedIndicatorEnumT }
     *     
     */
    public UnsolicitedIndicatorEnumT getUnsol() {
        return unsol;
    }

    /**
     * Sets the value of the unsol property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnsolicitedIndicatorEnumT }
     *     
     */
    public void setUnsol(UnsolicitedIndicatorEnumT value) {
        this.unsol = value;
    }

    /**
     * Gets the value of the trdgStat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrdgStat() {
        return trdgStat;
    }

    /**
     * Sets the value of the trdgStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrdgStat(String value) {
        this.trdgStat = value;
    }

    /**
     * Gets the value of the secTrdEvnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecTrdEvnt() {
        return secTrdEvnt;
    }

    /**
     * Sets the value of the secTrdEvnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecTrdEvnt(String value) {
        this.secTrdEvnt = value;
    }

    /**
     * Gets the value of the finclStat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinclStat() {
        return finclStat;
    }

    /**
     * Sets the value of the finclStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinclStat(String value) {
        this.finclStat = value;
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
     * Gets the value of the haltRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHaltRsn() {
        return haltRsn;
    }

    /**
     * Sets the value of the haltRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHaltRsn(String value) {
        this.haltRsn = value;
    }

    /**
     * Gets the value of the inViewOfCmn property.
     * 
     * @return
     *     possible object is
     *     {@link InViewOfCommonEnumT }
     *     
     */
    public InViewOfCommonEnumT getInViewOfCmn() {
        return inViewOfCmn;
    }

    /**
     * Sets the value of the inViewOfCmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link InViewOfCommonEnumT }
     *     
     */
    public void setInViewOfCmn(InViewOfCommonEnumT value) {
        this.inViewOfCmn = value;
    }

    /**
     * Gets the value of the dueToReltd property.
     * 
     * @return
     *     possible object is
     *     {@link DueToRelatedEnumT }
     *     
     */
    public DueToRelatedEnumT getDueToReltd() {
        return dueToReltd;
    }

    /**
     * Sets the value of the dueToReltd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DueToRelatedEnumT }
     *     
     */
    public void setDueToReltd(DueToRelatedEnumT value) {
        this.dueToReltd = value;
    }

    /**
     * Gets the value of the mdBkTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMDBkTyp() {
        return mdBkTyp;
    }

    /**
     * Sets the value of the mdBkTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMDBkTyp(BigInteger value) {
        this.mdBkTyp = value;
    }

    /**
     * Gets the value of the mktDepth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMktDepth() {
        return mktDepth;
    }

    /**
     * Sets the value of the mktDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMktDepth(BigInteger value) {
        this.mktDepth = value;
    }

    /**
     * Gets the value of the buyVol property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBuyVol() {
        return buyVol;
    }

    /**
     * Sets the value of the buyVol property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBuyVol(BigDecimal value) {
        this.buyVol = value;
    }

    /**
     * Gets the value of the sellVol property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSellVol() {
        return sellVol;
    }

    /**
     * Sets the value of the sellVol property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSellVol(BigDecimal value) {
        this.sellVol = value;
    }

    /**
     * Gets the value of the highPx property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHighPx() {
        return highPx;
    }

    /**
     * Sets the value of the highPx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHighPx(BigDecimal value) {
        this.highPx = value;
    }

    /**
     * Gets the value of the lowPx property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLowPx() {
        return lowPx;
    }

    /**
     * Sets the value of the lowPx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLowPx(BigDecimal value) {
        this.lowPx = value;
    }

    /**
     * Gets the value of the lastPx property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLastPx() {
        return lastPx;
    }

    /**
     * Sets the value of the lastPx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLastPx(BigDecimal value) {
        this.lastPx = value;
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
     * Gets the value of the adjmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAdjmt() {
        return adjmt;
    }

    /**
     * Sets the value of the adjmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAdjmt(BigInteger value) {
        this.adjmt = value;
    }

    /**
     * Gets the value of the firstPx property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFirstPx() {
        return firstPx;
    }

    /**
     * Sets the value of the firstPx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFirstPx(BigDecimal value) {
        this.firstPx = value;
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
