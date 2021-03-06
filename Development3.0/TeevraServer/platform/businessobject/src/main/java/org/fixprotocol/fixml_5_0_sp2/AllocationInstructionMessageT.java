
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
 * AllocationInstruction can be found in Volume5 of the specification 
 * 
 * <p>Java class for AllocationInstruction_message_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AllocationInstruction_message_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixprotocol.org/FIXML-5-0-SP2}Abstract_message_t">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}AllocationInstructionElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}AllocationInstructionAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AllocationInstruction_message_t", propOrder = {
    "ordAlloc",
    "allExc",
    "instrmt",
    "instrmtExt",
    "finDetls",
    "undly",
    "leg",
    "sprdBnchmkCurve",
    "pty",
    "stip",
    "yield",
    "amt",
    "alloc",
    "rtSrc",
    "rptSide",
    "reference",
    "trdRegTS"
})
public class AllocationInstructionMessageT
    extends AbstractMessageT
{

    @XmlElement(name = "OrdAlloc")
    protected List<OrdAllocGrpBlockT> ordAlloc;
    @XmlElement(name = "AllExc")
    protected List<ExecAllocGrpBlockT> allExc;
    @XmlElement(name = "Instrmt", required = true)
    protected InstrumentBlockT instrmt;
    @XmlElement(name = "InstrmtExt")
    protected InstrumentExtensionBlockT instrmtExt;
    @XmlElement(name = "FinDetls")
    protected FinancingDetailsBlockT finDetls;
    @XmlElement(name = "Undly")
    protected List<UndInstrmtGrpBlockT> undly;
    @XmlElement(name = "Leg")
    protected List<InstrmtLegGrpBlockT> leg;
    @XmlElement(name = "SprdBnchmkCurve")
    protected SpreadOrBenchmarkCurveDataBlockT sprdBnchmkCurve;
    @XmlElement(name = "Pty")
    protected List<PartiesBlockT> pty;
    @XmlElement(name = "Stip")
    protected List<StipulationsBlockT> stip;
    @XmlElement(name = "Yield")
    protected YieldDataBlockT yield;
    @XmlElement(name = "Amt")
    protected List<PositionAmountDataBlockT> amt;
    @XmlElement(name = "Alloc")
    protected List<AllocGrpBlockT> alloc;
    @XmlElement(name = "RtSrc")
    protected List<RateSourceBlockT> rtSrc;
    @XmlElement(name = "RptSide")
    protected List<AllocInstrnRptSideGrpBlockT> rptSide;
    @XmlElement(name = "Reference")
    protected List<ReferenceBlockT> reference;
    @XmlElement(name = "TrdRegTS")
    protected List<TrdRegTimestampsBlockT> trdRegTS;
    @XmlAttribute(name = "ApplID")
    protected String applID;
    @XmlAttribute(name = "TrdID")
    protected String trdID;
    @XmlAttribute(name = "TrdID2")
    protected String trdID2;
    @XmlAttribute(name = "HistInd")
    protected String histInd;
    @XmlAttribute(name = "TrdRptStat")
    protected String trdRptStat;
    @XmlAttribute(name = "LastPx")
    protected BigDecimal lastPx;
    @XmlAttribute(name = "TrdEnv")
    protected String trdEnv;
    @XmlAttribute(name = "MultiLegID")
    protected String multiLegID;
    @XmlAttribute(name = "MultiLegReportingType")
    protected String multiLegReportingType;
    @XmlAttribute(name = "PostingCode")
    protected String postingCode;
    @XmlAttribute(name = "LastUpdateTm")
    protected String lastUpdateTm;
    @XmlAttribute(name = "NoOfSplits")
    protected String noOfSplits;
    @XmlAttribute(name = "TxtTo")
    protected String txtTo;
    @XmlAttribute(name = "TradingStrategyCode")
    protected String tradingStrategyCode;
    @XmlAttribute(name = "CrossTyp")
    protected String crossTyp;
    @XmlAttribute(name = "AbdnInd")
    protected String abdnInd;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "TransTyp")
    protected String transTyp;
    @XmlAttribute(name = "Typ")
    protected BigInteger typ;
    @XmlAttribute(name = "ID2")
    protected String id2;
    @XmlAttribute(name = "RefID")
    protected String refID;
    @XmlAttribute(name = "CxlRplcRsn")
    protected String cxlRplcRsn;
    @XmlAttribute(name = "ImReqTyp")
    protected BigInteger imReqTyp;
    @XmlAttribute(name = "LinkID")
    protected String linkID;
    @XmlAttribute(name = "LinkTyp")
    protected BigInteger linkTyp;
    @XmlAttribute(name = "BkngRefID")
    protected String bkngRefID;
    @XmlAttribute(name = "NoOrdsTyp")
    protected BigInteger noOrdsTyp;
    @XmlAttribute(name = "PrevlyRpted")
    protected PreviouslyReportedEnumT prevlyRpted;
    @XmlAttribute(name = "ReversalInd")
    protected String reversalInd;
    @XmlAttribute(name = "MtchTyp")
    protected String mtchTyp;
    @XmlAttribute(name = "Side")
    protected String side;
    @XmlAttribute(name = "Qty")
    protected BigDecimal qty;
    @XmlAttribute(name = "QtyTyp")
    protected BigInteger qtyTyp;
    @XmlAttribute(name = "LastMkt")
    protected String lastMkt;
    @XmlAttribute(name = "OrignDt")
    protected XMLGregorianCalendar orignDt;
    @XmlAttribute(name = "SesID")
    protected String sesID;
    @XmlAttribute(name = "SesSub")
    protected String sesSub;
    @XmlAttribute(name = "PxTyp")
    protected BigInteger pxTyp;
    @XmlAttribute(name = "AvgPx")
    protected BigDecimal avgPx;
    @XmlAttribute(name = "AvgParPx")
    protected BigDecimal avgParPx;
    @XmlAttribute(name = "Ccy")
    protected String ccy;
    @XmlAttribute(name = "AvgPxPrcsn")
    protected BigInteger avgPxPrcsn;
    @XmlAttribute(name = "TrdDt")
    protected XMLGregorianCalendar trdDt;
    @XmlAttribute(name = "TxnTm")
    protected XMLGregorianCalendar txnTm;
    @XmlAttribute(name = "SettlTyp")
    protected String settlTyp;
    @XmlAttribute(name = "SettlDt")
    protected XMLGregorianCalendar settlDt;
    @XmlAttribute(name = "BkngTyp")
    protected BigInteger bkngTyp;
    @XmlAttribute(name = "GrossTrdAmt")
    protected BigDecimal grossTrdAmt;
    @XmlAttribute(name = "Concession")
    protected BigDecimal concession;
    @XmlAttribute(name = "TotTakedown")
    protected BigDecimal totTakedown;
    @XmlAttribute(name = "NetMny")
    protected BigDecimal netMny;
    @XmlAttribute(name = "PosEfct")
    protected PositionEffectEnumT posEfct;
    @XmlAttribute(name = "AutoAcceptInd")
    protected String autoAcceptInd;
    @XmlAttribute(name = "Txt")
    protected String txt;
    @XmlAttribute(name = "EncTxtLen")
    protected BigInteger encTxtLen;
    @XmlAttribute(name = "EncTxt")
    protected String encTxt;
    @XmlAttribute(name = "NumDaysInt")
    protected BigInteger numDaysInt;
    @XmlAttribute(name = "AcrdIntRt")
    protected BigDecimal acrdIntRt;
    @XmlAttribute(name = "AcrdIntAmt")
    protected BigDecimal acrdIntAmt;
    @XmlAttribute(name = "TotAcrdIntAmt")
    protected BigDecimal totAcrdIntAmt;
    @XmlAttribute(name = "IntAtMat")
    protected BigDecimal intAtMat;
    @XmlAttribute(name = "EndAcrdIntAmt")
    protected BigDecimal endAcrdIntAmt;
    @XmlAttribute(name = "StartCsh")
    protected BigDecimal startCsh;
    @XmlAttribute(name = "EndCsh")
    protected BigDecimal endCsh;
    @XmlAttribute(name = "LegalCnfm")
    protected LegalConfirmEnumT legalCnfm;
    @XmlAttribute(name = "TotNoAllocs")
    protected BigInteger totNoAllocs;
    @XmlAttribute(name = "LastFragment")
    protected LastFragmentEnumT lastFragment;
    @XmlAttribute(name = "AvgPxInd")
    protected BigInteger avgPxInd;
    @XmlAttribute(name = "BizDt")
    protected XMLGregorianCalendar bizDt;
    @XmlAttribute(name = "TrdTyp")
    protected String trdTyp;
    @XmlAttribute(name = "TrdSubTyp")
    protected String trdSubTyp;
    @XmlAttribute(name = "CustCpcty")
    protected BigInteger custCpcty;
    @XmlAttribute(name = "InptSrc")
    protected String inptSrc;
    @XmlAttribute(name = "MLegRptTyp")
    protected String mLegRptTyp;
    @XmlAttribute(name = "MsgEvtSrc")
    protected String msgEvtSrc;
    @XmlAttribute(name = "RndPx")
    protected BigDecimal rndPx;

    /**
     * Gets the value of the ordAlloc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ordAlloc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrdAlloc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrdAllocGrpBlockT }
     * 
     * 
     */
    public List<OrdAllocGrpBlockT> getOrdAlloc() {
        if (ordAlloc == null) {
            ordAlloc = new ArrayList<OrdAllocGrpBlockT>();
        }
        return this.ordAlloc;
    }

    /**
     * Gets the value of the allExc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allExc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllExc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExecAllocGrpBlockT }
     * 
     * 
     */
    public List<ExecAllocGrpBlockT> getAllExc() {
        if (allExc == null) {
            allExc = new ArrayList<ExecAllocGrpBlockT>();
        }
        return this.allExc;
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
     * Gets the value of the alloc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alloc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlloc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AllocGrpBlockT }
     * 
     * 
     */
    public List<AllocGrpBlockT> getAlloc() {
        if (alloc == null) {
            alloc = new ArrayList<AllocGrpBlockT>();
        }
        return this.alloc;
    }

    /**
     * Gets the value of the rtSrc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rtSrc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRtSrc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RateSourceBlockT }
     * 
     * 
     */
    public List<RateSourceBlockT> getRtSrc() {
        if (rtSrc == null) {
            rtSrc = new ArrayList<RateSourceBlockT>();
        }
        return this.rtSrc;
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
     * {@link AllocInstrnRptSideGrpBlockT }
     * 
     * 
     */
    public List<AllocInstrnRptSideGrpBlockT> getRptSide() {
        if (rptSide == null) {
            rptSide = new ArrayList<AllocInstrnRptSideGrpBlockT>();
        }
        return this.rptSide;
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
     * Gets the value of the trdRptStat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrdRptStat() {
        return trdRptStat;
    }

    /**
     * Sets the value of the trdRptStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrdRptStat(String value) {
        this.trdRptStat = value;
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
     * Gets the value of the id2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID2() {
        return id2;
    }

    /**
     * Sets the value of the id2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID2(String value) {
        this.id2 = value;
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
     * Gets the value of the cxlRplcRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCxlRplcRsn() {
        return cxlRplcRsn;
    }

    /**
     * Sets the value of the cxlRplcRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCxlRplcRsn(String value) {
        this.cxlRplcRsn = value;
    }

    /**
     * Gets the value of the imReqTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getImReqTyp() {
        return imReqTyp;
    }

    /**
     * Sets the value of the imReqTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setImReqTyp(BigInteger value) {
        this.imReqTyp = value;
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
     * Gets the value of the linkTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLinkTyp() {
        return linkTyp;
    }

    /**
     * Sets the value of the linkTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLinkTyp(BigInteger value) {
        this.linkTyp = value;
    }

    /**
     * Gets the value of the bkngRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBkngRefID() {
        return bkngRefID;
    }

    /**
     * Sets the value of the bkngRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBkngRefID(String value) {
        this.bkngRefID = value;
    }

    /**
     * Gets the value of the noOrdsTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNoOrdsTyp() {
        return noOrdsTyp;
    }

    /**
     * Sets the value of the noOrdsTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNoOrdsTyp(BigInteger value) {
        this.noOrdsTyp = value;
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
     * Gets the value of the reversalInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReversalInd() {
        return reversalInd;
    }

    /**
     * Sets the value of the reversalInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReversalInd(String value) {
        this.reversalInd = value;
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
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQty(BigDecimal value) {
        this.qty = value;
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
     * Gets the value of the orignDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrignDt() {
        return orignDt;
    }

    /**
     * Sets the value of the orignDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrignDt(XMLGregorianCalendar value) {
        this.orignDt = value;
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
     * Gets the value of the avgParPx property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAvgParPx() {
        return avgParPx;
    }

    /**
     * Sets the value of the avgParPx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAvgParPx(BigDecimal value) {
        this.avgParPx = value;
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
     * Gets the value of the avgPxPrcsn property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAvgPxPrcsn() {
        return avgPxPrcsn;
    }

    /**
     * Sets the value of the avgPxPrcsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAvgPxPrcsn(BigInteger value) {
        this.avgPxPrcsn = value;
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
     * Gets the value of the concession property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getConcession() {
        return concession;
    }

    /**
     * Sets the value of the concession property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setConcession(BigDecimal value) {
        this.concession = value;
    }

    /**
     * Gets the value of the totTakedown property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotTakedown() {
        return totTakedown;
    }

    /**
     * Sets the value of the totTakedown property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotTakedown(BigDecimal value) {
        this.totTakedown = value;
    }

    /**
     * Gets the value of the netMny property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetMny() {
        return netMny;
    }

    /**
     * Sets the value of the netMny property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetMny(BigDecimal value) {
        this.netMny = value;
    }

    /**
     * Gets the value of the posEfct property.
     * 
     * @return
     *     possible object is
     *     {@link PositionEffectEnumT }
     *     
     */
    public PositionEffectEnumT getPosEfct() {
        return posEfct;
    }

    /**
     * Sets the value of the posEfct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionEffectEnumT }
     *     
     */
    public void setPosEfct(PositionEffectEnumT value) {
        this.posEfct = value;
    }

    /**
     * Gets the value of the autoAcceptInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoAcceptInd() {
        return autoAcceptInd;
    }

    /**
     * Sets the value of the autoAcceptInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoAcceptInd(String value) {
        this.autoAcceptInd = value;
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

    /**
     * Gets the value of the numDaysInt property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumDaysInt() {
        return numDaysInt;
    }

    /**
     * Sets the value of the numDaysInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumDaysInt(BigInteger value) {
        this.numDaysInt = value;
    }

    /**
     * Gets the value of the acrdIntRt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAcrdIntRt() {
        return acrdIntRt;
    }

    /**
     * Sets the value of the acrdIntRt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAcrdIntRt(BigDecimal value) {
        this.acrdIntRt = value;
    }

    /**
     * Gets the value of the acrdIntAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAcrdIntAmt() {
        return acrdIntAmt;
    }

    /**
     * Sets the value of the acrdIntAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAcrdIntAmt(BigDecimal value) {
        this.acrdIntAmt = value;
    }

    /**
     * Gets the value of the totAcrdIntAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotAcrdIntAmt() {
        return totAcrdIntAmt;
    }

    /**
     * Sets the value of the totAcrdIntAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotAcrdIntAmt(BigDecimal value) {
        this.totAcrdIntAmt = value;
    }

    /**
     * Gets the value of the intAtMat property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIntAtMat() {
        return intAtMat;
    }

    /**
     * Sets the value of the intAtMat property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIntAtMat(BigDecimal value) {
        this.intAtMat = value;
    }

    /**
     * Gets the value of the endAcrdIntAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEndAcrdIntAmt() {
        return endAcrdIntAmt;
    }

    /**
     * Sets the value of the endAcrdIntAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEndAcrdIntAmt(BigDecimal value) {
        this.endAcrdIntAmt = value;
    }

    /**
     * Gets the value of the startCsh property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStartCsh() {
        return startCsh;
    }

    /**
     * Sets the value of the startCsh property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStartCsh(BigDecimal value) {
        this.startCsh = value;
    }

    /**
     * Gets the value of the endCsh property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEndCsh() {
        return endCsh;
    }

    /**
     * Sets the value of the endCsh property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEndCsh(BigDecimal value) {
        this.endCsh = value;
    }

    /**
     * Gets the value of the legalCnfm property.
     * 
     * @return
     *     possible object is
     *     {@link LegalConfirmEnumT }
     *     
     */
    public LegalConfirmEnumT getLegalCnfm() {
        return legalCnfm;
    }

    /**
     * Sets the value of the legalCnfm property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalConfirmEnumT }
     *     
     */
    public void setLegalCnfm(LegalConfirmEnumT value) {
        this.legalCnfm = value;
    }

    /**
     * Gets the value of the totNoAllocs property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotNoAllocs() {
        return totNoAllocs;
    }

    /**
     * Sets the value of the totNoAllocs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotNoAllocs(BigInteger value) {
        this.totNoAllocs = value;
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
     * Gets the value of the inptSrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInptSrc() {
        return inptSrc;
    }

    /**
     * Sets the value of the inptSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInptSrc(String value) {
        this.inptSrc = value;
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

}
