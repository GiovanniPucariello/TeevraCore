
package org.fixprotocol.fixml_5_0_sp2;

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
 * QuoteStatusReport can be found in Volume3 of the specification 
 * 
 * <p>Java class for QuoteStatusReport_message_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuoteStatusReport_message_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixprotocol.org/FIXML-5-0-SP2}Abstract_message_t">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}QuoteStatusReportElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}QuoteStatusReportAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuoteStatusReport_message_t", propOrder = {
    "pty",
    "tgtPty",
    "instrmt",
    "finDetls",
    "undly",
    "ordQty",
    "stip",
    "quoteStat",
    "quotQual",
    "sprdBnchmkCurve",
    "yield"
})
public class QuoteStatusReportMessageT
    extends AbstractMessageT
{

    @XmlElement(name = "Pty")
    protected List<PartiesBlockT> pty;
    @XmlElement(name = "TgtPty")
    protected List<TargetPartiesBlockT> tgtPty;
    @XmlElement(name = "Instrmt")
    protected InstrumentBlockT instrmt;
    @XmlElement(name = "FinDetls")
    protected FinancingDetailsBlockT finDetls;
    @XmlElement(name = "Undly")
    protected List<UndInstrmtGrpBlockT> undly;
    @XmlElement(name = "OrdQty")
    protected OrderQtyDataBlockT ordQty;
    @XmlElement(name = "Stip")
    protected List<StipulationsBlockT> stip;
    @XmlElement(name = "QuoteStat")
    protected List<LegQuotStatGrpBlockT> quoteStat;
    @XmlElement(name = "QuotQual")
    protected List<QuotQualGrpBlockT> quotQual;
    @XmlElement(name = "SprdBnchmkCurve")
    protected SpreadOrBenchmarkCurveDataBlockT sprdBnchmkCurve;
    @XmlElement(name = "Yield")
    protected YieldDataBlockT yield;
    @XmlAttribute(name = "StatReqID")
    protected String statReqID;
    @XmlAttribute(name = "ReqID")
    protected String reqID;
    @XmlAttribute(name = "QID")
    protected String qid;
    @XmlAttribute(name = "QtMsgID")
    protected String qtMsgID;
    @XmlAttribute(name = "RspID")
    protected String rspID;
    @XmlAttribute(name = "Typ")
    protected BigInteger typ;
    @XmlAttribute(name = "CxlTyp")
    protected String cxlTyp;
    @XmlAttribute(name = "SesID")
    protected String sesID;
    @XmlAttribute(name = "SesSub")
    protected String sesSub;
    @XmlAttribute(name = "Side")
    protected String side;
    @XmlAttribute(name = "SettlTyp")
    protected String settlTyp;
    @XmlAttribute(name = "SettlDt")
    protected XMLGregorianCalendar settlDt;
    @XmlAttribute(name = "SettlDt2")
    protected XMLGregorianCalendar settlDt2;
    @XmlAttribute(name = "Qty2")
    protected BigDecimal qty2;
    @XmlAttribute(name = "Ccy")
    protected String ccy;
    @XmlAttribute(name = "Acct")
    protected String acct;
    @XmlAttribute(name = "AcctIDSrc")
    protected String acctIDSrc;
    @XmlAttribute(name = "AcctTyp")
    protected BigInteger acctTyp;
    @XmlAttribute(name = "ExpireTm")
    protected XMLGregorianCalendar expireTm;
    @XmlAttribute(name = "Px")
    protected BigDecimal px;
    @XmlAttribute(name = "PxTyp")
    protected BigInteger pxTyp;
    @XmlAttribute(name = "BidPx")
    protected BigDecimal bidPx;
    @XmlAttribute(name = "OfrPx")
    protected BigDecimal ofrPx;
    @XmlAttribute(name = "MktBidPx")
    protected BigDecimal mktBidPx;
    @XmlAttribute(name = "MktOfrPx")
    protected BigDecimal mktOfrPx;
    @XmlAttribute(name = "MinBidSz")
    protected BigDecimal minBidSz;
    @XmlAttribute(name = "BidSz")
    protected BigDecimal bidSz;
    @XmlAttribute(name = "MinOfrSz")
    protected BigDecimal minOfrSz;
    @XmlAttribute(name = "OfrSz")
    protected BigDecimal ofrSz;
    @XmlAttribute(name = "MinQty")
    protected BigDecimal minQty;
    @XmlAttribute(name = "ValidUntilTm")
    protected XMLGregorianCalendar validUntilTm;
    @XmlAttribute(name = "BidSpotRt")
    protected BigDecimal bidSpotRt;
    @XmlAttribute(name = "OfrSpotRt")
    protected BigDecimal ofrSpotRt;
    @XmlAttribute(name = "BidFwdPnts")
    protected BigDecimal bidFwdPnts;
    @XmlAttribute(name = "OfrFwdPnts")
    protected BigDecimal ofrFwdPnts;
    @XmlAttribute(name = "MidPx")
    protected BigDecimal midPx;
    @XmlAttribute(name = "BidYld")
    protected BigDecimal bidYld;
    @XmlAttribute(name = "MidYld")
    protected BigDecimal midYld;
    @XmlAttribute(name = "OfrYld")
    protected BigDecimal ofrYld;
    @XmlAttribute(name = "TxnTm")
    protected XMLGregorianCalendar txnTm;
    @XmlAttribute(name = "OrdTyp")
    protected String ordTyp;
    @XmlAttribute(name = "BidFwdPnts2")
    protected BigDecimal bidFwdPnts2;
    @XmlAttribute(name = "OfrFwdPnts2")
    protected BigDecimal ofrFwdPnts2;
    @XmlAttribute(name = "SettlCurrBidFxRt")
    protected BigDecimal settlCurrBidFxRt;
    @XmlAttribute(name = "SettlCurrOfrFxRt")
    protected BigDecimal settlCurrOfrFxRt;
    @XmlAttribute(name = "SettlCurrFxRtCalc")
    protected SettlCurrFxRateCalcEnumT settlCurrFxRtCalc;
    @XmlAttribute(name = "CommTyp")
    protected String commTyp;
    @XmlAttribute(name = "Comm")
    protected BigDecimal comm;
    @XmlAttribute(name = "CustCpcty")
    protected BigInteger custCpcty;
    @XmlAttribute(name = "ExDest")
    protected String exDest;
    @XmlAttribute(name = "ExDestIDSrc")
    protected ExDestinationIDSourceEnumT exDestIDSrc;
    @XmlAttribute(name = "BkngTyp")
    protected BigInteger bkngTyp;
    @XmlAttribute(name = "Cpcty")
    protected OrderCapacityEnumT cpcty;
    @XmlAttribute(name = "Rstctions")
    protected String rstctions;
    @XmlAttribute(name = "Stat")
    protected BigInteger stat;
    @XmlAttribute(name = "RejRsn")
    protected String rejRsn;
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
     * Gets the value of the tgtPty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tgtPty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTgtPty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TargetPartiesBlockT }
     * 
     * 
     */
    public List<TargetPartiesBlockT> getTgtPty() {
        if (tgtPty == null) {
            tgtPty = new ArrayList<TargetPartiesBlockT>();
        }
        return this.tgtPty;
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
     * Gets the value of the finDetls property.
     * 
     * @return
     *     possible object is
     *     {@link FinancingDetailsBlockT }
     *     
     */
    public FinancingDetailsBlockT getFinDetls() {
        return finDetls;
    }

    /**
     * Sets the value of the finDetls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancingDetailsBlockT }
     *     
     */
    public void setFinDetls(FinancingDetailsBlockT value) {
        this.finDetls = value;
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
     * Gets the value of the ordQty property.
     * 
     * @return
     *     possible object is
     *     {@link OrderQtyDataBlockT }
     *     
     */
    public OrderQtyDataBlockT getOrdQty() {
        return ordQty;
    }

    /**
     * Sets the value of the ordQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderQtyDataBlockT }
     *     
     */
    public void setOrdQty(OrderQtyDataBlockT value) {
        this.ordQty = value;
    }

    /**
     * Gets the value of the stip property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stip property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStip().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StipulationsBlockT }
     * 
     * 
     */
    public List<StipulationsBlockT> getStip() {
        if (stip == null) {
            stip = new ArrayList<StipulationsBlockT>();
        }
        return this.stip;
    }

    /**
     * Gets the value of the quoteStat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quoteStat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuoteStat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LegQuotStatGrpBlockT }
     * 
     * 
     */
    public List<LegQuotStatGrpBlockT> getQuoteStat() {
        if (quoteStat == null) {
            quoteStat = new ArrayList<LegQuotStatGrpBlockT>();
        }
        return this.quoteStat;
    }

    /**
     * Gets the value of the quotQual property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quotQual property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuotQual().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuotQualGrpBlockT }
     * 
     * 
     */
    public List<QuotQualGrpBlockT> getQuotQual() {
        if (quotQual == null) {
            quotQual = new ArrayList<QuotQualGrpBlockT>();
        }
        return this.quotQual;
    }

    /**
     * Gets the value of the sprdBnchmkCurve property.
     * 
     * @return
     *     possible object is
     *     {@link SpreadOrBenchmarkCurveDataBlockT }
     *     
     */
    public SpreadOrBenchmarkCurveDataBlockT getSprdBnchmkCurve() {
        return sprdBnchmkCurve;
    }

    /**
     * Sets the value of the sprdBnchmkCurve property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpreadOrBenchmarkCurveDataBlockT }
     *     
     */
    public void setSprdBnchmkCurve(SpreadOrBenchmarkCurveDataBlockT value) {
        this.sprdBnchmkCurve = value;
    }

    /**
     * Gets the value of the yield property.
     * 
     * @return
     *     possible object is
     *     {@link YieldDataBlockT }
     *     
     */
    public YieldDataBlockT getYield() {
        return yield;
    }

    /**
     * Sets the value of the yield property.
     * 
     * @param value
     *     allowed object is
     *     {@link YieldDataBlockT }
     *     
     */
    public void setYield(YieldDataBlockT value) {
        this.yield = value;
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
     * Gets the value of the qid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQID() {
        return qid;
    }

    /**
     * Sets the value of the qid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQID(String value) {
        this.qid = value;
    }

    /**
     * Gets the value of the qtMsgID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQtMsgID() {
        return qtMsgID;
    }

    /**
     * Sets the value of the qtMsgID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQtMsgID(String value) {
        this.qtMsgID = value;
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
     * Gets the value of the typ property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTyp() {
        return typ;
    }

    /**
     * Sets the value of the typ property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTyp(BigInteger value) {
        this.typ = value;
    }

    /**
     * Gets the value of the cxlTyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCxlTyp() {
        return cxlTyp;
    }

    /**
     * Sets the value of the cxlTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCxlTyp(String value) {
        this.cxlTyp = value;
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
     * Gets the value of the side property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSide() {
        return side;
    }

    /**
     * Sets the value of the side property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSide(String value) {
        this.side = value;
    }

    /**
     * Gets the value of the settlTyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlTyp() {
        return settlTyp;
    }

    /**
     * Sets the value of the settlTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlTyp(String value) {
        this.settlTyp = value;
    }

    /**
     * Gets the value of the settlDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSettlDt() {
        return settlDt;
    }

    /**
     * Sets the value of the settlDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSettlDt(XMLGregorianCalendar value) {
        this.settlDt = value;
    }

    /**
     * Gets the value of the settlDt2 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSettlDt2() {
        return settlDt2;
    }

    /**
     * Sets the value of the settlDt2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSettlDt2(XMLGregorianCalendar value) {
        this.settlDt2 = value;
    }

    /**
     * Gets the value of the qty2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQty2() {
        return qty2;
    }

    /**
     * Sets the value of the qty2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQty2(BigDecimal value) {
        this.qty2 = value;
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
     * Gets the value of the expireTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpireTm() {
        return expireTm;
    }

    /**
     * Sets the value of the expireTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpireTm(XMLGregorianCalendar value) {
        this.expireTm = value;
    }

    /**
     * Gets the value of the px property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPx() {
        return px;
    }

    /**
     * Sets the value of the px property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPx(BigDecimal value) {
        this.px = value;
    }

    /**
     * Gets the value of the pxTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPxTyp() {
        return pxTyp;
    }

    /**
     * Sets the value of the pxTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPxTyp(BigInteger value) {
        this.pxTyp = value;
    }

    /**
     * Gets the value of the bidPx property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBidPx() {
        return bidPx;
    }

    /**
     * Sets the value of the bidPx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBidPx(BigDecimal value) {
        this.bidPx = value;
    }

    /**
     * Gets the value of the ofrPx property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOfrPx() {
        return ofrPx;
    }

    /**
     * Sets the value of the ofrPx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOfrPx(BigDecimal value) {
        this.ofrPx = value;
    }

    /**
     * Gets the value of the mktBidPx property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMktBidPx() {
        return mktBidPx;
    }

    /**
     * Sets the value of the mktBidPx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMktBidPx(BigDecimal value) {
        this.mktBidPx = value;
    }

    /**
     * Gets the value of the mktOfrPx property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMktOfrPx() {
        return mktOfrPx;
    }

    /**
     * Sets the value of the mktOfrPx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMktOfrPx(BigDecimal value) {
        this.mktOfrPx = value;
    }

    /**
     * Gets the value of the minBidSz property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinBidSz() {
        return minBidSz;
    }

    /**
     * Sets the value of the minBidSz property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinBidSz(BigDecimal value) {
        this.minBidSz = value;
    }

    /**
     * Gets the value of the bidSz property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBidSz() {
        return bidSz;
    }

    /**
     * Sets the value of the bidSz property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBidSz(BigDecimal value) {
        this.bidSz = value;
    }

    /**
     * Gets the value of the minOfrSz property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinOfrSz() {
        return minOfrSz;
    }

    /**
     * Sets the value of the minOfrSz property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinOfrSz(BigDecimal value) {
        this.minOfrSz = value;
    }

    /**
     * Gets the value of the ofrSz property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOfrSz() {
        return ofrSz;
    }

    /**
     * Sets the value of the ofrSz property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOfrSz(BigDecimal value) {
        this.ofrSz = value;
    }

    /**
     * Gets the value of the minQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinQty() {
        return minQty;
    }

    /**
     * Sets the value of the minQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinQty(BigDecimal value) {
        this.minQty = value;
    }

    /**
     * Gets the value of the validUntilTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidUntilTm() {
        return validUntilTm;
    }

    /**
     * Sets the value of the validUntilTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidUntilTm(XMLGregorianCalendar value) {
        this.validUntilTm = value;
    }

    /**
     * Gets the value of the bidSpotRt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBidSpotRt() {
        return bidSpotRt;
    }

    /**
     * Sets the value of the bidSpotRt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBidSpotRt(BigDecimal value) {
        this.bidSpotRt = value;
    }

    /**
     * Gets the value of the ofrSpotRt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOfrSpotRt() {
        return ofrSpotRt;
    }

    /**
     * Sets the value of the ofrSpotRt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOfrSpotRt(BigDecimal value) {
        this.ofrSpotRt = value;
    }

    /**
     * Gets the value of the bidFwdPnts property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBidFwdPnts() {
        return bidFwdPnts;
    }

    /**
     * Sets the value of the bidFwdPnts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBidFwdPnts(BigDecimal value) {
        this.bidFwdPnts = value;
    }

    /**
     * Gets the value of the ofrFwdPnts property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOfrFwdPnts() {
        return ofrFwdPnts;
    }

    /**
     * Sets the value of the ofrFwdPnts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOfrFwdPnts(BigDecimal value) {
        this.ofrFwdPnts = value;
    }

    /**
     * Gets the value of the midPx property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMidPx() {
        return midPx;
    }

    /**
     * Sets the value of the midPx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMidPx(BigDecimal value) {
        this.midPx = value;
    }

    /**
     * Gets the value of the bidYld property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBidYld() {
        return bidYld;
    }

    /**
     * Sets the value of the bidYld property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBidYld(BigDecimal value) {
        this.bidYld = value;
    }

    /**
     * Gets the value of the midYld property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMidYld() {
        return midYld;
    }

    /**
     * Sets the value of the midYld property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMidYld(BigDecimal value) {
        this.midYld = value;
    }

    /**
     * Gets the value of the ofrYld property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOfrYld() {
        return ofrYld;
    }

    /**
     * Sets the value of the ofrYld property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOfrYld(BigDecimal value) {
        this.ofrYld = value;
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
     * Gets the value of the ordTyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdTyp() {
        return ordTyp;
    }

    /**
     * Sets the value of the ordTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdTyp(String value) {
        this.ordTyp = value;
    }

    /**
     * Gets the value of the bidFwdPnts2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBidFwdPnts2() {
        return bidFwdPnts2;
    }

    /**
     * Sets the value of the bidFwdPnts2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBidFwdPnts2(BigDecimal value) {
        this.bidFwdPnts2 = value;
    }

    /**
     * Gets the value of the ofrFwdPnts2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOfrFwdPnts2() {
        return ofrFwdPnts2;
    }

    /**
     * Sets the value of the ofrFwdPnts2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOfrFwdPnts2(BigDecimal value) {
        this.ofrFwdPnts2 = value;
    }

    /**
     * Gets the value of the settlCurrBidFxRt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSettlCurrBidFxRt() {
        return settlCurrBidFxRt;
    }

    /**
     * Sets the value of the settlCurrBidFxRt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSettlCurrBidFxRt(BigDecimal value) {
        this.settlCurrBidFxRt = value;
    }

    /**
     * Gets the value of the settlCurrOfrFxRt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSettlCurrOfrFxRt() {
        return settlCurrOfrFxRt;
    }

    /**
     * Sets the value of the settlCurrOfrFxRt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSettlCurrOfrFxRt(BigDecimal value) {
        this.settlCurrOfrFxRt = value;
    }

    /**
     * Gets the value of the settlCurrFxRtCalc property.
     * 
     * @return
     *     possible object is
     *     {@link SettlCurrFxRateCalcEnumT }
     *     
     */
    public SettlCurrFxRateCalcEnumT getSettlCurrFxRtCalc() {
        return settlCurrFxRtCalc;
    }

    /**
     * Sets the value of the settlCurrFxRtCalc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlCurrFxRateCalcEnumT }
     *     
     */
    public void setSettlCurrFxRtCalc(SettlCurrFxRateCalcEnumT value) {
        this.settlCurrFxRtCalc = value;
    }

    /**
     * Gets the value of the commTyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommTyp() {
        return commTyp;
    }

    /**
     * Sets the value of the commTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommTyp(String value) {
        this.commTyp = value;
    }

    /**
     * Gets the value of the comm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getComm() {
        return comm;
    }

    /**
     * Sets the value of the comm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setComm(BigDecimal value) {
        this.comm = value;
    }

    /**
     * Gets the value of the custCpcty property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCustCpcty() {
        return custCpcty;
    }

    /**
     * Sets the value of the custCpcty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCustCpcty(BigInteger value) {
        this.custCpcty = value;
    }

    /**
     * Gets the value of the exDest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExDest() {
        return exDest;
    }

    /**
     * Sets the value of the exDest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExDest(String value) {
        this.exDest = value;
    }

    /**
     * Gets the value of the exDestIDSrc property.
     * 
     * @return
     *     possible object is
     *     {@link ExDestinationIDSourceEnumT }
     *     
     */
    public ExDestinationIDSourceEnumT getExDestIDSrc() {
        return exDestIDSrc;
    }

    /**
     * Sets the value of the exDestIDSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExDestinationIDSourceEnumT }
     *     
     */
    public void setExDestIDSrc(ExDestinationIDSourceEnumT value) {
        this.exDestIDSrc = value;
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
     * Gets the value of the rejRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRejRsn() {
        return rejRsn;
    }

    /**
     * Sets the value of the rejRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRejRsn(String value) {
        this.rejRsn = value;
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
