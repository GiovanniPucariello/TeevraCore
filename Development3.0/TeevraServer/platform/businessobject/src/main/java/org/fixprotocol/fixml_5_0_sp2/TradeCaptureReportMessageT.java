
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
 * TradeCaptureReport can be found in Volume5 of the specification 
 * 
 * <p>Java class for TradeCaptureReport_message_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeCaptureReport_message_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixprotocol.org/FIXML-5-0-SP2}Abstract_message_t">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}TradeCaptureReportElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}TradeCaptureReportAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeCaptureReport_message_t", propOrder = {
    "applSeqCtrl",
    "pty",
    "instrmt",
    "finDetls",
    "yield",
    "undly",
    "sprdBnchmkCurve",
    "amt",
    "trdLeg",
    "trdRegTS",
    "rptSide",
    "trdRepIndicatorsGrp",
    "reference",
    "qty"
})
public class TradeCaptureReportMessageT
    extends AbstractMessageT
{

    @XmlElement(name = "ApplSeqCtrl")
    protected ApplicationSequenceControlBlockT applSeqCtrl;
    @XmlElement(name = "Pty")
    protected List<RootPartiesBlockT> pty;
    @XmlElement(name = "Instrmt")
    protected InstrumentBlockT instrmt;
    @XmlElement(name = "FinDetls")
    protected FinancingDetailsBlockT finDetls;
    @XmlElement(name = "Yield")
    protected YieldDataBlockT yield;
    @XmlElement(name = "Undly")
    protected List<UndInstrmtGrpBlockT> undly;
    @XmlElement(name = "SprdBnchmkCurve")
    protected SpreadOrBenchmarkCurveDataBlockT sprdBnchmkCurve;
    @XmlElement(name = "Amt")
    protected List<PositionAmountDataBlockT> amt;
    @XmlElement(name = "TrdLeg")
    protected List<TrdInstrmtLegGrpBlockT> trdLeg;
    @XmlElement(name = "TrdRegTS")
    protected List<TrdRegTimestampsBlockT> trdRegTS;
    @XmlElement(name = "RptSide")
    protected List<TrdCapRptSideGrpBlockT> rptSide;
    @XmlElement(name = "TrdRepIndicatorsGrp")
    protected List<TrdRepIndicatorsGrpBlockT> trdRepIndicatorsGrp;
    @XmlElement(name = "Reference")
    protected List<ReferenceBlockT> reference;
    @XmlElement(name = "Qty")
    protected List<PositionQtyBlockT> qty;
    @XmlAttribute(name = "HistInd")
    protected String histInd;
    @XmlAttribute(name = "OrigTxnTm")
    protected XMLGregorianCalendar origTxnTm;
    @XmlAttribute(name = "OrigTrdDtCET")
    protected XMLGregorianCalendar origTrdDtCET;
    @XmlAttribute(name = "OrigTxnTmCET")
    protected XMLGregorianCalendar origTxnTmCET;
    @XmlAttribute(name = "MultiLegID")
    protected String multiLegID;
    @XmlAttribute(name = "MultiLegReportingType")
    protected String multiLegReportingType;
    @XmlAttribute(name = "PostingCode")
    protected String postingCode;
    @XmlAttribute(name = "TrdEnv")
    protected String trdEnv;
    @XmlAttribute(name = "AllocTrnStat")
    protected String allocTrnStat;
    @XmlAttribute(name = "TxtTo")
    protected String txtTo;
    @XmlAttribute(name = "TxtFrom")
    protected String txtFrom;
    @XmlAttribute(name = "Txt")
    protected String txt;
    @XmlAttribute(name = "TradingStrategyCode")
    protected String tradingStrategyCode;
    @XmlAttribute(name = "GiveUpHistInd")
    protected String giveUpHistInd;
    @XmlAttribute(name = "NoOfSplits")
    protected String noOfSplits;
    @XmlAttribute(name = "CrossTyp")
    protected String crossTyp;
    @XmlAttribute(name = "ExerStyle")
    protected BigInteger exerStyle;
    @XmlAttribute(name = "AsgnStat")
    protected BigInteger asgnStat;
    @XmlAttribute(name = "NoAsgnMsgs")
    protected BigInteger noAsgnMsgs;
    @XmlAttribute(name = "RefID")
    protected String refID;
    @XmlAttribute(name = "AbdnInd")
    protected String abdnInd;
    @XmlAttribute(name = "ClsPx")
    protected BigDecimal clsPx;
    @XmlAttribute(name = "OrigTrdID2")
    protected String origTrdID2;
    @XmlAttribute(name = "RptID")
    protected String rptID;
    @XmlAttribute(name = "TrdID")
    protected String trdID;
    @XmlAttribute(name = "TrdID2")
    protected String trdID2;
    @XmlAttribute(name = "FirmTrdID")
    protected String firmTrdID;
    @XmlAttribute(name = "FirmTrdID2")
    protected String firmTrdID2;
    @XmlAttribute(name = "TransTyp")
    protected BigInteger transTyp;
    @XmlAttribute(name = "RptTyp")
    protected BigInteger rptTyp;
    @XmlAttribute(name = "TrdRptStat")
    protected BigInteger trdRptStat;
    @XmlAttribute(name = "ReqID")
    protected String reqID;
    @XmlAttribute(name = "TrdTyp")
    protected String trdTyp;
    @XmlAttribute(name = "TrdSubTyp")
    protected String trdSubTyp;
    @XmlAttribute(name = "TrdTyp2")
    protected BigInteger trdTyp2;
    @XmlAttribute(name = "TrdHandlInst")
    protected String trdHandlInst;
    @XmlAttribute(name = "OrigTrdHandlInst")
    protected String origTrdHandlInst;
    @XmlAttribute(name = "OrigTrdDt")
    protected XMLGregorianCalendar origTrdDt;
    @XmlAttribute(name = "OrigTrdID")
    protected String origTrdID;
    @XmlAttribute(name = "OrignTrdID2")
    protected String orignTrdID2;
    @XmlAttribute(name = "TrnsfrRsn")
    protected String trnsfrRsn;
    @XmlAttribute(name = "ExecTyp")
    protected String execTyp;
    @XmlAttribute(name = "TotNumTrdRpts")
    protected BigInteger totNumTrdRpts;
    @XmlAttribute(name = "LastRptReqed")
    protected LastRptRequestedEnumT lastRptReqed;
    @XmlAttribute(name = "Unsol")
    protected UnsolicitedIndicatorEnumT unsol;
    @XmlAttribute(name = "SubReqTyp")
    protected String subReqTyp;
    @XmlAttribute(name = "RptRefID")
    protected String rptRefID;
    @XmlAttribute(name = "RptRefID2")
    protected String rptRefID2;
    @XmlAttribute(name = "RptID2")
    protected String rptID2;
    @XmlAttribute(name = "LinkID")
    protected String linkID;
    @XmlAttribute(name = "MtchID")
    protected String mtchID;
    @XmlAttribute(name = "ExecID")
    protected String execID;
    @XmlAttribute(name = "ExecID2")
    protected String execID2;
    @XmlAttribute(name = "ExecRstmtRsn")
    protected String execRstmtRsn;
    @XmlAttribute(name = "PrevlyRpted")
    protected PreviouslyReportedEnumT prevlyRpted;
    @XmlAttribute(name = "PxTyp")
    protected BigInteger pxTyp;
    @XmlAttribute(name = "AsOfInd")
    protected String asOfInd;
    @XmlAttribute(name = "SetSesID")
    protected SettlSessIDEnumT setSesID;
    @XmlAttribute(name = "SetSesSub")
    protected String setSesSub;
    @XmlAttribute(name = "VenuTyp")
    protected VenueTypeEnumT venuTyp;
    @XmlAttribute(name = "MktSegID")
    protected String mktSegID;
    @XmlAttribute(name = "MktID")
    protected String mktID;
    @XmlAttribute(name = "QtyTyp")
    protected BigInteger qtyTyp;
    @XmlAttribute(name = "UndSesID")
    protected String undSesID;
    @XmlAttribute(name = "UndSesSub")
    protected String undSesSub;
    @XmlAttribute(name = "LastQty")
    protected BigDecimal lastQty;
    @XmlAttribute(name = "LastPx")
    protected BigDecimal lastPx;
    @XmlAttribute(name = "CalcCcyLastQty")
    protected BigDecimal calcCcyLastQty;
    @XmlAttribute(name = "Ccy")
    protected String ccy;
    @XmlAttribute(name = "SettlCcy")
    protected String settlCcy;
    @XmlAttribute(name = "LastParPx")
    protected BigDecimal lastParPx;
    @XmlAttribute(name = "LastSpotRt")
    protected BigDecimal lastSpotRt;
    @XmlAttribute(name = "LastFwdPnts")
    protected BigDecimal lastFwdPnts;
    @XmlAttribute(name = "LastSwapPnts")
    protected BigDecimal lastSwapPnts;
    @XmlAttribute(name = "LastMkt")
    protected String lastMkt;
    @XmlAttribute(name = "TrdDt")
    protected XMLGregorianCalendar trdDt;
    @XmlAttribute(name = "BizDt")
    protected XMLGregorianCalendar bizDt;
    @XmlAttribute(name = "AvgPx")
    protected BigDecimal avgPx;
    @XmlAttribute(name = "AvgPxInd")
    protected BigInteger avgPxInd;
    @XmlAttribute(name = "MLegRptTyp")
    protected String mLegRptTyp;
    @XmlAttribute(name = "TrdLegRefID")
    protected String trdLegRefID;
    @XmlAttribute(name = "TxnTm")
    protected XMLGregorianCalendar txnTm;
    @XmlAttribute(name = "SettlTyp")
    protected String settlTyp;
    @XmlAttribute(name = "SettlDt")
    protected XMLGregorianCalendar settlDt;
    @XmlAttribute(name = "StlDt")
    protected XMLGregorianCalendar stlDt;
    @XmlAttribute(name = "MtchStat")
    protected String mtchStat;
    @XmlAttribute(name = "MtchTyp")
    protected String mtchTyp;
    @XmlAttribute(name = "Vol")
    protected BigDecimal vol;
    @XmlAttribute(name = "DividendYield")
    protected BigDecimal dividendYield;
    @XmlAttribute(name = "RFR")
    protected BigDecimal rfr;
    @XmlAttribute(name = "CurrencyRatio")
    protected BigDecimal currencyRatio;
    @XmlAttribute(name = "CopyMsgInd")
    protected String copyMsgInd;
    @XmlAttribute(name = "PubTrdInd")
    protected PublishTrdIndicatorEnumT pubTrdInd;
    @XmlAttribute(name = "TrdPubInd")
    protected BigInteger trdPubInd;
    @XmlAttribute(name = "ShrtSaleRsn")
    protected BigInteger shrtSaleRsn;
    @XmlAttribute(name = "TierCD")
    protected String tierCD;
    @XmlAttribute(name = "MsgEvtSrc")
    protected String msgEvtSrc;
    @XmlAttribute(name = "LastUpdateTm")
    protected String lastUpdateTm;
    @XmlAttribute(name = "RndPx")
    protected BigDecimal rndPx;
    @XmlAttribute(name = "TZTransactTime")
    protected XMLGregorianCalendar tzTransactTime;
    @XmlAttribute(name = "ReportedPxDiff")
    protected String reportedPxDiff;
    @XmlAttribute(name = "GrossTrdAmt")
    protected BigDecimal grossTrdAmt;
    @XmlAttribute(name = "RejTxt")
    protected String rejTxt;
    @XmlAttribute(name = "FeeMult")
    protected BigDecimal feeMult;

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
     * Gets the value of the trdLeg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trdLeg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrdLeg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrdInstrmtLegGrpBlockT }
     * 
     * 
     */
    public List<TrdInstrmtLegGrpBlockT> getTrdLeg() {
        if (trdLeg == null) {
            trdLeg = new ArrayList<TrdInstrmtLegGrpBlockT>();
        }
        return this.trdLeg;
    }

    /**
     * Gets the value of the trdRegTS property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trdRegTS property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrdRegTS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrdRegTimestampsBlockT }
     * 
     * 
     */
    public List<TrdRegTimestampsBlockT> getTrdRegTS() {
        if (trdRegTS == null) {
            trdRegTS = new ArrayList<TrdRegTimestampsBlockT>();
        }
        return this.trdRegTS;
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
     * {@link TrdCapRptSideGrpBlockT }
     * 
     * 
     */
    public List<TrdCapRptSideGrpBlockT> getRptSide() {
        if (rptSide == null) {
            rptSide = new ArrayList<TrdCapRptSideGrpBlockT>();
        }
        return this.rptSide;
    }

    /**
     * Gets the value of the trdRepIndicatorsGrp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trdRepIndicatorsGrp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrdRepIndicatorsGrp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrdRepIndicatorsGrpBlockT }
     * 
     * 
     */
    public List<TrdRepIndicatorsGrpBlockT> getTrdRepIndicatorsGrp() {
        if (trdRepIndicatorsGrp == null) {
            trdRepIndicatorsGrp = new ArrayList<TrdRepIndicatorsGrpBlockT>();
        }
        return this.trdRepIndicatorsGrp;
    }

    /**
     * Gets the value of the reference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceBlockT }
     * 
     * 
     */
    public List<ReferenceBlockT> getReference() {
        if (reference == null) {
            reference = new ArrayList<ReferenceBlockT>();
        }
        return this.reference;
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
     * Gets the value of the histInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHistInd() {
        return histInd;
    }

    /**
     * Sets the value of the histInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHistInd(String value) {
        this.histInd = value;
    }

    /**
     * Gets the value of the origTxnTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrigTxnTm() {
        return origTxnTm;
    }

    /**
     * Sets the value of the origTxnTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrigTxnTm(XMLGregorianCalendar value) {
        this.origTxnTm = value;
    }

    /**
     * Gets the value of the origTrdDtCET property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrigTrdDtCET() {
        return origTrdDtCET;
    }

    /**
     * Sets the value of the origTrdDtCET property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrigTrdDtCET(XMLGregorianCalendar value) {
        this.origTrdDtCET = value;
    }

    /**
     * Gets the value of the origTxnTmCET property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrigTxnTmCET() {
        return origTxnTmCET;
    }

    /**
     * Sets the value of the origTxnTmCET property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrigTxnTmCET(XMLGregorianCalendar value) {
        this.origTxnTmCET = value;
    }

    /**
     * Gets the value of the multiLegID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultiLegID() {
        return multiLegID;
    }

    /**
     * Sets the value of the multiLegID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultiLegID(String value) {
        this.multiLegID = value;
    }

    /**
     * Gets the value of the multiLegReportingType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultiLegReportingType() {
        return multiLegReportingType;
    }

    /**
     * Sets the value of the multiLegReportingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultiLegReportingType(String value) {
        this.multiLegReportingType = value;
    }

    /**
     * Gets the value of the postingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostingCode() {
        return postingCode;
    }

    /**
     * Sets the value of the postingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostingCode(String value) {
        this.postingCode = value;
    }

    /**
     * Gets the value of the trdEnv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrdEnv() {
        return trdEnv;
    }

    /**
     * Sets the value of the trdEnv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrdEnv(String value) {
        this.trdEnv = value;
    }

    /**
     * Gets the value of the allocTrnStat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllocTrnStat() {
        return allocTrnStat;
    }

    /**
     * Sets the value of the allocTrnStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllocTrnStat(String value) {
        this.allocTrnStat = value;
    }

    /**
     * Gets the value of the txtTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxtTo() {
        return txtTo;
    }

    /**
     * Sets the value of the txtTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxtTo(String value) {
        this.txtTo = value;
    }

    /**
     * Gets the value of the txtFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxtFrom() {
        return txtFrom;
    }

    /**
     * Sets the value of the txtFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxtFrom(String value) {
        this.txtFrom = value;
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
     * Gets the value of the tradingStrategyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradingStrategyCode() {
        return tradingStrategyCode;
    }

    /**
     * Sets the value of the tradingStrategyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradingStrategyCode(String value) {
        this.tradingStrategyCode = value;
    }

    /**
     * Gets the value of the giveUpHistInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiveUpHistInd() {
        return giveUpHistInd;
    }

    /**
     * Sets the value of the giveUpHistInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiveUpHistInd(String value) {
        this.giveUpHistInd = value;
    }

    /**
     * Gets the value of the noOfSplits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoOfSplits() {
        return noOfSplits;
    }

    /**
     * Sets the value of the noOfSplits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoOfSplits(String value) {
        this.noOfSplits = value;
    }

    /**
     * Gets the value of the crossTyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrossTyp() {
        return crossTyp;
    }

    /**
     * Sets the value of the crossTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrossTyp(String value) {
        this.crossTyp = value;
    }

    /**
     * Gets the value of the exerStyle property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExerStyle() {
        return exerStyle;
    }

    /**
     * Sets the value of the exerStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExerStyle(BigInteger value) {
        this.exerStyle = value;
    }

    /**
     * Gets the value of the asgnStat property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAsgnStat() {
        return asgnStat;
    }

    /**
     * Sets the value of the asgnStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAsgnStat(BigInteger value) {
        this.asgnStat = value;
    }

    /**
     * Gets the value of the noAsgnMsgs property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNoAsgnMsgs() {
        return noAsgnMsgs;
    }

    /**
     * Sets the value of the noAsgnMsgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNoAsgnMsgs(BigInteger value) {
        this.noAsgnMsgs = value;
    }

    /**
     * Gets the value of the refID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefID() {
        return refID;
    }

    /**
     * Sets the value of the refID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefID(String value) {
        this.refID = value;
    }

    /**
     * Gets the value of the abdnInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbdnInd() {
        return abdnInd;
    }

    /**
     * Sets the value of the abdnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbdnInd(String value) {
        this.abdnInd = value;
    }

    /**
     * Gets the value of the clsPx property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getClsPx() {
        return clsPx;
    }

    /**
     * Sets the value of the clsPx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setClsPx(BigDecimal value) {
        this.clsPx = value;
    }

    /**
     * Gets the value of the origTrdID2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigTrdID2() {
        return origTrdID2;
    }

    /**
     * Sets the value of the origTrdID2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigTrdID2(String value) {
        this.origTrdID2 = value;
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
     * Gets the value of the trdID2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrdID2() {
        return trdID2;
    }

    /**
     * Sets the value of the trdID2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrdID2(String value) {
        this.trdID2 = value;
    }

    /**
     * Gets the value of the firmTrdID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirmTrdID() {
        return firmTrdID;
    }

    /**
     * Sets the value of the firmTrdID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirmTrdID(String value) {
        this.firmTrdID = value;
    }

    /**
     * Gets the value of the firmTrdID2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirmTrdID2() {
        return firmTrdID2;
    }

    /**
     * Sets the value of the firmTrdID2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirmTrdID2(String value) {
        this.firmTrdID2 = value;
    }

    /**
     * Gets the value of the transTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTransTyp() {
        return transTyp;
    }

    /**
     * Sets the value of the transTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTransTyp(BigInteger value) {
        this.transTyp = value;
    }

    /**
     * Gets the value of the rptTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRptTyp() {
        return rptTyp;
    }

    /**
     * Sets the value of the rptTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRptTyp(BigInteger value) {
        this.rptTyp = value;
    }

    /**
     * Gets the value of the trdRptStat property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTrdRptStat() {
        return trdRptStat;
    }

    /**
     * Sets the value of the trdRptStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTrdRptStat(BigInteger value) {
        this.trdRptStat = value;
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
     * Gets the value of the trdTyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrdTyp() {
        return trdTyp;
    }

    /**
     * Sets the value of the trdTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrdTyp(String value) {
        this.trdTyp = value;
    }

    /**
     * Gets the value of the trdSubTyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrdSubTyp() {
        return trdSubTyp;
    }

    /**
     * Sets the value of the trdSubTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrdSubTyp(String value) {
        this.trdSubTyp = value;
    }

    /**
     * Gets the value of the trdTyp2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTrdTyp2() {
        return trdTyp2;
    }

    /**
     * Sets the value of the trdTyp2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTrdTyp2(BigInteger value) {
        this.trdTyp2 = value;
    }

    /**
     * Gets the value of the trdHandlInst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrdHandlInst() {
        return trdHandlInst;
    }

    /**
     * Sets the value of the trdHandlInst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrdHandlInst(String value) {
        this.trdHandlInst = value;
    }

    /**
     * Gets the value of the origTrdHandlInst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigTrdHandlInst() {
        return origTrdHandlInst;
    }

    /**
     * Sets the value of the origTrdHandlInst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigTrdHandlInst(String value) {
        this.origTrdHandlInst = value;
    }

    /**
     * Gets the value of the origTrdDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrigTrdDt() {
        return origTrdDt;
    }

    /**
     * Sets the value of the origTrdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrigTrdDt(XMLGregorianCalendar value) {
        this.origTrdDt = value;
    }

    /**
     * Gets the value of the origTrdID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigTrdID() {
        return origTrdID;
    }

    /**
     * Sets the value of the origTrdID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigTrdID(String value) {
        this.origTrdID = value;
    }

    /**
     * Gets the value of the orignTrdID2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrignTrdID2() {
        return orignTrdID2;
    }

    /**
     * Sets the value of the orignTrdID2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrignTrdID2(String value) {
        this.orignTrdID2 = value;
    }

    /**
     * Gets the value of the trnsfrRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrnsfrRsn() {
        return trnsfrRsn;
    }

    /**
     * Sets the value of the trnsfrRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrnsfrRsn(String value) {
        this.trnsfrRsn = value;
    }

    /**
     * Gets the value of the execTyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecTyp() {
        return execTyp;
    }

    /**
     * Sets the value of the execTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecTyp(String value) {
        this.execTyp = value;
    }

    /**
     * Gets the value of the totNumTrdRpts property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotNumTrdRpts() {
        return totNumTrdRpts;
    }

    /**
     * Sets the value of the totNumTrdRpts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotNumTrdRpts(BigInteger value) {
        this.totNumTrdRpts = value;
    }

    /**
     * Gets the value of the lastRptReqed property.
     * 
     * @return
     *     possible object is
     *     {@link LastRptRequestedEnumT }
     *     
     */
    public LastRptRequestedEnumT getLastRptReqed() {
        return lastRptReqed;
    }

    /**
     * Sets the value of the lastRptReqed property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastRptRequestedEnumT }
     *     
     */
    public void setLastRptReqed(LastRptRequestedEnumT value) {
        this.lastRptReqed = value;
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
     * Gets the value of the subReqTyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubReqTyp() {
        return subReqTyp;
    }

    /**
     * Sets the value of the subReqTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubReqTyp(String value) {
        this.subReqTyp = value;
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
     * Gets the value of the rptRefID2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptRefID2() {
        return rptRefID2;
    }

    /**
     * Sets the value of the rptRefID2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRptRefID2(String value) {
        this.rptRefID2 = value;
    }

    /**
     * Gets the value of the rptID2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptID2() {
        return rptID2;
    }

    /**
     * Sets the value of the rptID2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRptID2(String value) {
        this.rptID2 = value;
    }

    /**
     * Gets the value of the linkID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkID() {
        return linkID;
    }

    /**
     * Sets the value of the linkID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkID(String value) {
        this.linkID = value;
    }

    /**
     * Gets the value of the mtchID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMtchID() {
        return mtchID;
    }

    /**
     * Sets the value of the mtchID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMtchID(String value) {
        this.mtchID = value;
    }

    /**
     * Gets the value of the execID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecID() {
        return execID;
    }

    /**
     * Sets the value of the execID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecID(String value) {
        this.execID = value;
    }

    /**
     * Gets the value of the execID2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecID2() {
        return execID2;
    }

    /**
     * Sets the value of the execID2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecID2(String value) {
        this.execID2 = value;
    }

    /**
     * Gets the value of the execRstmtRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecRstmtRsn() {
        return execRstmtRsn;
    }

    /**
     * Sets the value of the execRstmtRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecRstmtRsn(String value) {
        this.execRstmtRsn = value;
    }

    /**
     * Gets the value of the prevlyRpted property.
     * 
     * @return
     *     possible object is
     *     {@link PreviouslyReportedEnumT }
     *     
     */
    public PreviouslyReportedEnumT getPrevlyRpted() {
        return prevlyRpted;
    }

    /**
     * Sets the value of the prevlyRpted property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreviouslyReportedEnumT }
     *     
     */
    public void setPrevlyRpted(PreviouslyReportedEnumT value) {
        this.prevlyRpted = value;
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
     * Gets the value of the asOfInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsOfInd() {
        return asOfInd;
    }

    /**
     * Sets the value of the asOfInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsOfInd(String value) {
        this.asOfInd = value;
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
     * Gets the value of the venuTyp property.
     * 
     * @return
     *     possible object is
     *     {@link VenueTypeEnumT }
     *     
     */
    public VenueTypeEnumT getVenuTyp() {
        return venuTyp;
    }

    /**
     * Sets the value of the venuTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link VenueTypeEnumT }
     *     
     */
    public void setVenuTyp(VenueTypeEnumT value) {
        this.venuTyp = value;
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
     * Gets the value of the qtyTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQtyTyp() {
        return qtyTyp;
    }

    /**
     * Sets the value of the qtyTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQtyTyp(BigInteger value) {
        this.qtyTyp = value;
    }

    /**
     * Gets the value of the undSesID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUndSesID() {
        return undSesID;
    }

    /**
     * Sets the value of the undSesID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUndSesID(String value) {
        this.undSesID = value;
    }

    /**
     * Gets the value of the undSesSub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUndSesSub() {
        return undSesSub;
    }

    /**
     * Sets the value of the undSesSub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUndSesSub(String value) {
        this.undSesSub = value;
    }

    /**
     * Gets the value of the lastQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLastQty() {
        return lastQty;
    }

    /**
     * Sets the value of the lastQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLastQty(BigDecimal value) {
        this.lastQty = value;
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
     * Gets the value of the calcCcyLastQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCalcCcyLastQty() {
        return calcCcyLastQty;
    }

    /**
     * Sets the value of the calcCcyLastQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCalcCcyLastQty(BigDecimal value) {
        this.calcCcyLastQty = value;
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
     * Gets the value of the lastParPx property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLastParPx() {
        return lastParPx;
    }

    /**
     * Sets the value of the lastParPx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLastParPx(BigDecimal value) {
        this.lastParPx = value;
    }

    /**
     * Gets the value of the lastSpotRt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLastSpotRt() {
        return lastSpotRt;
    }

    /**
     * Sets the value of the lastSpotRt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLastSpotRt(BigDecimal value) {
        this.lastSpotRt = value;
    }

    /**
     * Gets the value of the lastFwdPnts property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLastFwdPnts() {
        return lastFwdPnts;
    }

    /**
     * Sets the value of the lastFwdPnts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLastFwdPnts(BigDecimal value) {
        this.lastFwdPnts = value;
    }

    /**
     * Gets the value of the lastSwapPnts property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLastSwapPnts() {
        return lastSwapPnts;
    }

    /**
     * Sets the value of the lastSwapPnts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLastSwapPnts(BigDecimal value) {
        this.lastSwapPnts = value;
    }

    /**
     * Gets the value of the lastMkt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastMkt() {
        return lastMkt;
    }

    /**
     * Sets the value of the lastMkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastMkt(String value) {
        this.lastMkt = value;
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
     * Gets the value of the avgPx property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAvgPx() {
        return avgPx;
    }

    /**
     * Sets the value of the avgPx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAvgPx(BigDecimal value) {
        this.avgPx = value;
    }

    /**
     * Gets the value of the avgPxInd property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAvgPxInd() {
        return avgPxInd;
    }

    /**
     * Sets the value of the avgPxInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAvgPxInd(BigInteger value) {
        this.avgPxInd = value;
    }

    /**
     * Gets the value of the mLegRptTyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMLegRptTyp() {
        return mLegRptTyp;
    }

    /**
     * Sets the value of the mLegRptTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMLegRptTyp(String value) {
        this.mLegRptTyp = value;
    }

    /**
     * Gets the value of the trdLegRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrdLegRefID() {
        return trdLegRefID;
    }

    /**
     * Sets the value of the trdLegRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrdLegRefID(String value) {
        this.trdLegRefID = value;
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
     * Gets the value of the stlDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStlDt() {
        return stlDt;
    }

    /**
     * Sets the value of the stlDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStlDt(XMLGregorianCalendar value) {
        this.stlDt = value;
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
     * Gets the value of the mtchTyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMtchTyp() {
        return mtchTyp;
    }

    /**
     * Sets the value of the mtchTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMtchTyp(String value) {
        this.mtchTyp = value;
    }

    /**
     * Gets the value of the vol property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVol() {
        return vol;
    }

    /**
     * Sets the value of the vol property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVol(BigDecimal value) {
        this.vol = value;
    }

    /**
     * Gets the value of the dividendYield property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDividendYield() {
        return dividendYield;
    }

    /**
     * Sets the value of the dividendYield property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDividendYield(BigDecimal value) {
        this.dividendYield = value;
    }

    /**
     * Gets the value of the rfr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRFR() {
        return rfr;
    }

    /**
     * Sets the value of the rfr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRFR(BigDecimal value) {
        this.rfr = value;
    }

    /**
     * Gets the value of the currencyRatio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrencyRatio() {
        return currencyRatio;
    }

    /**
     * Sets the value of the currencyRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrencyRatio(BigDecimal value) {
        this.currencyRatio = value;
    }

    /**
     * Gets the value of the copyMsgInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyMsgInd() {
        return copyMsgInd;
    }

    /**
     * Sets the value of the copyMsgInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopyMsgInd(String value) {
        this.copyMsgInd = value;
    }

    /**
     * Gets the value of the pubTrdInd property.
     * 
     * @return
     *     possible object is
     *     {@link PublishTrdIndicatorEnumT }
     *     
     */
    public PublishTrdIndicatorEnumT getPubTrdInd() {
        return pubTrdInd;
    }

    /**
     * Sets the value of the pubTrdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublishTrdIndicatorEnumT }
     *     
     */
    public void setPubTrdInd(PublishTrdIndicatorEnumT value) {
        this.pubTrdInd = value;
    }

    /**
     * Gets the value of the trdPubInd property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTrdPubInd() {
        return trdPubInd;
    }

    /**
     * Sets the value of the trdPubInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTrdPubInd(BigInteger value) {
        this.trdPubInd = value;
    }

    /**
     * Gets the value of the shrtSaleRsn property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getShrtSaleRsn() {
        return shrtSaleRsn;
    }

    /**
     * Sets the value of the shrtSaleRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setShrtSaleRsn(BigInteger value) {
        this.shrtSaleRsn = value;
    }

    /**
     * Gets the value of the tierCD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTierCD() {
        return tierCD;
    }

    /**
     * Sets the value of the tierCD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTierCD(String value) {
        this.tierCD = value;
    }

    /**
     * Gets the value of the msgEvtSrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgEvtSrc() {
        return msgEvtSrc;
    }

    /**
     * Sets the value of the msgEvtSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgEvtSrc(String value) {
        this.msgEvtSrc = value;
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
     * Gets the value of the rndPx property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRndPx() {
        return rndPx;
    }

    /**
     * Sets the value of the rndPx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRndPx(BigDecimal value) {
        this.rndPx = value;
    }

    /**
     * Gets the value of the tzTransactTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTZTransactTime() {
        return tzTransactTime;
    }

    /**
     * Sets the value of the tzTransactTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTZTransactTime(XMLGregorianCalendar value) {
        this.tzTransactTime = value;
    }

    /**
     * Gets the value of the reportedPxDiff property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportedPxDiff() {
        return reportedPxDiff;
    }

    /**
     * Sets the value of the reportedPxDiff property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportedPxDiff(String value) {
        this.reportedPxDiff = value;
    }

    /**
     * Gets the value of the grossTrdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGrossTrdAmt() {
        return grossTrdAmt;
    }

    /**
     * Sets the value of the grossTrdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGrossTrdAmt(BigDecimal value) {
        this.grossTrdAmt = value;
    }

    /**
     * Gets the value of the rejTxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRejTxt() {
        return rejTxt;
    }

    /**
     * Sets the value of the rejTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRejTxt(String value) {
        this.rejTxt = value;
    }

    /**
     * Gets the value of the feeMult property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFeeMult() {
        return feeMult;
    }

    /**
     * Sets the value of the feeMult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFeeMult(BigDecimal value) {
        this.feeMult = value;
    }

}
