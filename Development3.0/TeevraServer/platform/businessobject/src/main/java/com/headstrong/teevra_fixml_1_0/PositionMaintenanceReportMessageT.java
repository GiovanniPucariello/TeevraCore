
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
 * PositionMaintenanceReport can be found in Volume5 of the specification 
 * 
 * <p>Java class for PositionMaintenanceReport_message_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PositionMaintenanceReport_message_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.headstrong.com/TEEVRA-FIXML-1-0}Abstract_message_t">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}PositionMaintenanceReportElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}PositionMaintenanceReportAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PositionMaintenanceReport_message_t", propOrder = {
    "pty",
    "instrmt",
    "leg",
    "undly",
    "trdSes",
    "qty",
    "amt",
    "cutOff",
    "rptSide"
})
public class PositionMaintenanceReportMessageT
    extends AbstractMessageT
{

    @XmlElement(name = "Pty")
    protected List<PartiesBlockT> pty;
    @XmlElement(name = "Instrmt")
    protected InstrumentBlockT instrmt;
    @XmlElement(name = "Leg")
    protected List<InstrmtLegGrpBlockT> leg;
    @XmlElement(name = "Undly")
    protected List<UndInstrmtGrpBlockT> undly;
    @XmlElement(name = "TrdSes")
    protected List<TrdgSesGrpBlockT> trdSes;
    @XmlElement(name = "Qty")
    protected List<PositionQtyBlockT> qty;
    @XmlElement(name = "Amt")
    protected List<PositionAmountDataBlockT> amt;
    @XmlElement(name = "CutOff")
    protected CutOffT cutOff;
    @XmlElement(name = "RptSide")
    protected List<PosMntRptSideGrpBlockT> rptSide;
    @XmlAttribute
    protected String prodIndctr;
    @XmlAttribute(name = "TransTyp")
    protected String transTyp;
    @XmlAttribute(name = "TrdID")
    protected String trdID;
    @XmlAttribute(name = "ErrorCode")
    protected String errorCode;
    @XmlAttribute(name = "ErrorMessage")
    protected String errorMessage;
    @XmlAttribute(name = "ApplID")
    protected String applID;
    @XmlAttribute(name = "LastUpdateTm")
    protected String lastUpdateTm;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "TrnsfrPx")
    protected BigDecimal trnsfrPx;
    @XmlAttribute(name = "MtchStat")
    protected BigInteger mtchStat;
    @XmlAttribute(name = "OrigDt")
    protected XMLGregorianCalendar origDt;
    @XmlAttribute(name = "PosMntRptOtmWrnInd")
    protected BigInteger posMntRptOtmWrnInd;
    @XmlAttribute(name = "RptID")
    protected String rptID;
    @XmlAttribute(name = "TxnTyp")
    protected BigInteger txnTyp;
    @XmlAttribute(name = "ReqID")
    protected String reqID;
    @XmlAttribute(name = "Actn")
    protected BigInteger actn;
    @XmlAttribute(name = "OrigReqRefID")
    protected String origReqRefID;
    @XmlAttribute(name = "Stat")
    protected BigInteger stat;
    @XmlAttribute(name = "Rslt")
    protected String rslt;
    @XmlAttribute(name = "BizDt")
    protected XMLGregorianCalendar bizDt;
    @XmlAttribute(name = "SetSesID")
    protected SettlSessIDEnumT setSesID;
    @XmlAttribute(name = "SetSesSub")
    protected String setSesSub;
    @XmlAttribute(name = "Acct")
    protected String acct;
    @XmlAttribute(name = "AcctIDSrc")
    protected String acctIDSrc;
    @XmlAttribute(name = "AcctTyp")
    protected BigInteger acctTyp;
    @XmlAttribute(name = "RptRefID")
    protected String rptRefID;
    @XmlAttribute(name = "Ccy")
    protected String ccy;
    @XmlAttribute(name = "SettlCcy")
    protected String settlCcy;
    @XmlAttribute(name = "CntraryInstrctnInd")
    protected String cntraryInstrctnInd;
    @XmlAttribute(name = "PriorSpreadInd")
    protected String priorSpreadInd;
    @XmlAttribute(name = "TxnTm")
    protected XMLGregorianCalendar txnTm;
    @XmlAttribute(name = "AdjTyp")
    protected BigInteger adjTyp;
    @XmlAttribute(name = "ThresholdAmt")
    protected BigDecimal thresholdAmt;
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
     * Gets the value of the trdSes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trdSes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrdSes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrdgSesGrpBlockT }
     * 
     * 
     */
    public List<TrdgSesGrpBlockT> getTrdSes() {
        if (trdSes == null) {
            trdSes = new ArrayList<TrdgSesGrpBlockT>();
        }
        return this.trdSes;
    }

    /**
     * Gets the value of the qty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PositionQtyBlockT }
     * 
     * 
     */
    public List<PositionQtyBlockT> getQty() {
        if (qty == null) {
            qty = new ArrayList<PositionQtyBlockT>();
        }
        return this.qty;
    }

    /**
     * Gets the value of the amt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PositionAmountDataBlockT }
     * 
     * 
     */
    public List<PositionAmountDataBlockT> getAmt() {
        if (amt == null) {
            amt = new ArrayList<PositionAmountDataBlockT>();
        }
        return this.amt;
    }

    /**
     * Gets the value of the cutOff property.
     * 
     * @return
     *     possible object is
     *     {@link CutOffT }
     *     
     */
    public CutOffT getCutOff() {
        return cutOff;
    }

    /**
     * Sets the value of the cutOff property.
     * 
     * @param value
     *     allowed object is
     *     {@link CutOffT }
     *     
     */
    public void setCutOff(CutOffT value) {
        this.cutOff = value;
    }

    /**
     * Gets the value of the rptSide property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rptSide property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRptSide().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PosMntRptSideGrpBlockT }
     * 
     * 
     */
    public List<PosMntRptSideGrpBlockT> getRptSide() {
        if (rptSide == null) {
            rptSide = new ArrayList<PosMntRptSideGrpBlockT>();
        }
        return this.rptSide;
    }

    /**
     * Gets the value of the prodIndctr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdIndctr() {
        return prodIndctr;
    }

    /**
     * Sets the value of the prodIndctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdIndctr(String value) {
        this.prodIndctr = value;
    }

    /**
     * Gets the value of the transTyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransTyp() {
        return transTyp;
    }

    /**
     * Sets the value of the transTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransTyp(String value) {
        this.transTyp = value;
    }

    /**
     * Gets the value of the trdID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrdID() {
        return trdID;
    }

    /**
     * Sets the value of the trdID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrdID(String value) {
        this.trdID = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    /**
     * Gets the value of the applID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplID() {
        return applID;
    }

    /**
     * Sets the value of the applID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplID(String value) {
        this.applID = value;
    }

    /**
     * Gets the value of the lastUpdateTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdateTm() {
        return lastUpdateTm;
    }

    /**
     * Sets the value of the lastUpdateTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdateTm(String value) {
        this.lastUpdateTm = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the trnsfrPx property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTrnsfrPx() {
        return trnsfrPx;
    }

    /**
     * Sets the value of the trnsfrPx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTrnsfrPx(BigDecimal value) {
        this.trnsfrPx = value;
    }

    /**
     * Gets the value of the mtchStat property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMtchStat() {
        return mtchStat;
    }

    /**
     * Sets the value of the mtchStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMtchStat(BigInteger value) {
        this.mtchStat = value;
    }

    /**
     * Gets the value of the origDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrigDt() {
        return origDt;
    }

    /**
     * Sets the value of the origDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrigDt(XMLGregorianCalendar value) {
        this.origDt = value;
    }

    /**
     * Gets the value of the posMntRptOtmWrnInd property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPosMntRptOtmWrnInd() {
        return posMntRptOtmWrnInd;
    }

    /**
     * Sets the value of the posMntRptOtmWrnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPosMntRptOtmWrnInd(BigInteger value) {
        this.posMntRptOtmWrnInd = value;
    }

    /**
     * Gets the value of the rptID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptID() {
        return rptID;
    }

    /**
     * Sets the value of the rptID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRptID(String value) {
        this.rptID = value;
    }

    /**
     * Gets the value of the txnTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTxnTyp() {
        return txnTyp;
    }

    /**
     * Sets the value of the txnTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTxnTyp(BigInteger value) {
        this.txnTyp = value;
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
     * Gets the value of the actn property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getActn() {
        return actn;
    }

    /**
     * Sets the value of the actn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setActn(BigInteger value) {
        this.actn = value;
    }

    /**
     * Gets the value of the origReqRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigReqRefID() {
        return origReqRefID;
    }

    /**
     * Sets the value of the origReqRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigReqRefID(String value) {
        this.origReqRefID = value;
    }

    /**
     * Gets the value of the stat property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStat() {
        return stat;
    }

    /**
     * Sets the value of the stat property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStat(BigInteger value) {
        this.stat = value;
    }

    /**
     * Gets the value of the rslt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRslt() {
        return rslt;
    }

    /**
     * Sets the value of the rslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRslt(String value) {
        this.rslt = value;
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
     * Gets the value of the setSesID property.
     * 
     * @return
     *     possible object is
     *     {@link SettlSessIDEnumT }
     *     
     */
    public SettlSessIDEnumT getSetSesID() {
        return setSesID;
    }

    /**
     * Sets the value of the setSesID property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlSessIDEnumT }
     *     
     */
    public void setSetSesID(SettlSessIDEnumT value) {
        this.setSesID = value;
    }

    /**
     * Gets the value of the setSesSub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSetSesSub() {
        return setSesSub;
    }

    /**
     * Sets the value of the setSesSub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSetSesSub(String value) {
        this.setSesSub = value;
    }

    /**
     * Gets the value of the acct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcct() {
        return acct;
    }

    /**
     * Sets the value of the acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcct(String value) {
        this.acct = value;
    }

    /**
     * Gets the value of the acctIDSrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctIDSrc() {
        return acctIDSrc;
    }

    /**
     * Sets the value of the acctIDSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctIDSrc(String value) {
        this.acctIDSrc = value;
    }

    /**
     * Gets the value of the acctTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAcctTyp() {
        return acctTyp;
    }

    /**
     * Sets the value of the acctTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAcctTyp(BigInteger value) {
        this.acctTyp = value;
    }

    /**
     * Gets the value of the rptRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptRefID() {
        return rptRefID;
    }

    /**
     * Sets the value of the rptRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRptRefID(String value) {
        this.rptRefID = value;
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
     * Gets the value of the settlCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlCcy() {
        return settlCcy;
    }

    /**
     * Sets the value of the settlCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlCcy(String value) {
        this.settlCcy = value;
    }

    /**
     * Gets the value of the cntraryInstrctnInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCntraryInstrctnInd() {
        return cntraryInstrctnInd;
    }

    /**
     * Sets the value of the cntraryInstrctnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCntraryInstrctnInd(String value) {
        this.cntraryInstrctnInd = value;
    }

    /**
     * Gets the value of the priorSpreadInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorSpreadInd() {
        return priorSpreadInd;
    }

    /**
     * Sets the value of the priorSpreadInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorSpreadInd(String value) {
        this.priorSpreadInd = value;
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
     * Gets the value of the adjTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAdjTyp() {
        return adjTyp;
    }

    /**
     * Sets the value of the adjTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAdjTyp(BigInteger value) {
        this.adjTyp = value;
    }

    /**
     * Gets the value of the thresholdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getThresholdAmt() {
        return thresholdAmt;
    }

    /**
     * Sets the value of the thresholdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setThresholdAmt(BigDecimal value) {
        this.thresholdAmt = value;
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
