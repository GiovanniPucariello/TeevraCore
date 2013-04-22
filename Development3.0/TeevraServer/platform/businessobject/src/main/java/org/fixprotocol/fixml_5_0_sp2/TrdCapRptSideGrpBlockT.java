
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
 * <p>Java class for TrdCapRptSideGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrdCapRptSideGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}TrdCapRptSideGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}TrdCapRptSideGrpAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrdCapRptSideGrp_Block_t", propOrder = {
    "pty",
    "clrInst",
    "comm",
    "contAmt",
    "stip",
    "miscFees",
    "alloc",
    "trdRegTS",
    "settlDetails",
    "trdRptOrdDetl"
})
public class TrdCapRptSideGrpBlockT {

    @XmlElement(name = "Pty")
    protected List<PartiesBlockT> pty;
    @XmlElement(name = "ClrInst")
    protected List<ClrInstGrpBlockT> clrInst;
    @XmlElement(name = "Comm")
    protected CommissionDataBlockT comm;
    @XmlElement(name = "ContAmt")
    protected List<ContAmtGrpBlockT> contAmt;
    @XmlElement(name = "Stip")
    protected List<StipulationsBlockT> stip;
    @XmlElement(name = "MiscFees")
    protected List<MiscFeesGrpBlockT> miscFees;
    @XmlElement(name = "Alloc")
    protected List<TrdAllocGrpBlockT> alloc;
    @XmlElement(name = "TrdRegTS")
    protected List<SideTrdRegTSBlockT> trdRegTS;
    @XmlElement(name = "SettlDetails")
    protected List<SettlDetailsBlockT> settlDetails;
    @XmlElement(name = "TrdRptOrdDetl")
    protected TradeReportOrderDetailBlockT trdRptOrdDetl;
    @XmlAttribute(name = "Qty")
    protected BigInteger qty;
    @XmlAttribute(name = "ClAcctRef")
    protected String clAcctRef;
    @XmlAttribute(name = "TrdActn")
    protected String trdActn;
    @XmlAttribute(name = "SubTrdRefNo")
    protected String subTrdRefNo;
    @XmlAttribute(name = "TrdStat")
    protected String trdStat;
    @XmlAttribute(name = "LegTyp")
    protected String legTyp;
    @XmlAttribute(name = "AcctCode")
    protected String acctCode;
    @XmlAttribute(name = "ClAcctRefFrom")
    protected String clAcctRefFrom;
    @XmlAttribute(name = "ClAcctRefTo")
    protected String clAcctRefTo;
    @XmlAttribute(name = "ClOrdID")
    protected String clOrdID;
    @XmlAttribute(name = "OrdID2")
    protected String ordID2;
    @XmlAttribute(name = "AcctTypFrm")
    protected String acctTypFrm;
    @XmlAttribute(name = "AcctCodeFrm")
    protected String acctCodeFrm;
    @XmlAttribute(name = "PrmAmt")
    protected BigDecimal prmAmt;
    @XmlAttribute(name = "FeeDistribution")
    protected BigInteger feeDistribution;
    @XmlAttribute(name = "BrokFeeInd")
    protected BigInteger brokFeeInd;
    @XmlAttribute(name = "Side")
    protected String side;
    @XmlAttribute(name = "SideExecID")
    protected String sideExecID;
    @XmlAttribute(name = "OrdDelay")
    protected BigInteger ordDelay;
    @XmlAttribute(name = "OrdDelayUnit")
    protected String ordDelayUnit;
    @XmlAttribute(name = "SideQty")
    protected BigInteger sideQty;
    @XmlAttribute(name = "RptID")
    protected String rptID;
    @XmlAttribute(name = "FillStationCd")
    protected String fillStationCd;
    @XmlAttribute(name = "RsnCD")
    protected String rsnCD;
    @XmlAttribute(name = "RptSeq")
    protected BigInteger rptSeq;
    @XmlAttribute(name = "TrdSubTyp")
    protected BigInteger trdSubTyp;
    @XmlAttribute(name = "NetGrossInd")
    protected BigInteger netGrossInd;
    @XmlAttribute(name = "Ccy")
    protected String ccy;
    @XmlAttribute(name = "SettlCcy")
    protected String settlCcy;
    @XmlAttribute(name = "Acct")
    protected String acct;
    @XmlAttribute(name = "AcctIDSrc")
    protected String acctIDSrc;
    @XmlAttribute(name = "AcctTyp")
    protected BigInteger acctTyp;
    @XmlAttribute(name = "ProcCode")
    protected String procCode;
    @XmlAttribute(name = "OddLot")
    protected OddLotEnumT oddLot;
    @XmlAttribute(name = "InptSrc")
    protected String inptSrc;
    @XmlAttribute(name = "InptDev")
    protected String inptDev;
    @XmlAttribute(name = "ComplianceID")
    protected String complianceID;
    @XmlAttribute(name = "SolFlag")
    protected SolicitedFlagEnumT solFlag;
    @XmlAttribute(name = "CustCpcty")
    protected BigInteger custCpcty;
    @XmlAttribute(name = "SesID")
    protected String sesID;
    @XmlAttribute(name = "SesSub")
    protected String sesSub;
    @XmlAttribute(name = "TmBkt")
    protected String tmBkt;
    @XmlAttribute(name = "NumDaysInt")
    protected BigInteger numDaysInt;
    @XmlAttribute(name = "ExDt")
    protected XMLGregorianCalendar exDt;
    @XmlAttribute(name = "AcrdIntRt")
    protected BigDecimal acrdIntRt;
    @XmlAttribute(name = "AcrdIntAmt")
    protected BigDecimal acrdIntAmt;
    @XmlAttribute(name = "IntAtMat")
    protected BigDecimal intAtMat;
    @XmlAttribute(name = "EndAcrdIntAmt")
    protected BigDecimal endAcrdIntAmt;
    @XmlAttribute(name = "StartCsh")
    protected BigDecimal startCsh;
    @XmlAttribute(name = "EndCsh")
    protected BigDecimal endCsh;
    @XmlAttribute(name = "Concession")
    protected BigDecimal concession;
    @XmlAttribute(name = "TotTakedown")
    protected BigDecimal totTakedown;
    @XmlAttribute(name = "NetMny")
    protected BigDecimal netMny;
    @XmlAttribute(name = "SettlCurrAmt")
    protected BigDecimal settlCurrAmt;
    @XmlAttribute(name = "SettlCurrFxRt")
    protected BigDecimal settlCurrFxRt;
    @XmlAttribute(name = "SettlCurrFxRtCalc")
    protected SettlCurrFxRateCalcEnumT settlCurrFxRtCalc;
    @XmlAttribute(name = "PosEfct")
    protected PositionEffectEnumT posEfct;
    @XmlAttribute(name = "Txt")
    protected String txt;
    @XmlAttribute(name = "EncTxtLen")
    protected BigInteger encTxtLen;
    @XmlAttribute(name = "EncTxt")
    protected String encTxt;
    @XmlAttribute(name = "MLegRptTyp")
    protected BigInteger mLegRptTyp;
    @XmlAttribute(name = "ExchRule")
    protected String exchRule;
    @XmlAttribute(name = "AllocInd")
    protected BigInteger allocInd;
    @XmlAttribute(name = "PreallocMeth")
    protected String preallocMeth;
    @XmlAttribute(name = "AllocID")
    protected String allocID;
    @XmlAttribute(name = "SideGrossTradeAmt")
    protected BigDecimal sideGrossTradeAmt;
    @XmlAttribute(name = "AgrsrInd")
    protected AggressorIndicatorEnumT agrsrInd;
    @XmlAttribute(name = "ExchSpeclInstr")
    protected String exchSpeclInstr;
    @XmlAttribute(name = "OrdCat")
    protected String ordCat;
    @XmlAttribute(name = "LqdtyInd")
    protected BigInteger lqdtyInd;

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
     * Gets the value of the clrInst property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clrInst property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClrInst().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClrInstGrpBlockT }
     * 
     * 
     */
    public List<ClrInstGrpBlockT> getClrInst() {
        if (clrInst == null) {
            clrInst = new ArrayList<ClrInstGrpBlockT>();
        }
        return this.clrInst;
    }

    /**
     * Gets the value of the comm property.
     * 
     * @return
     *     possible object is
     *     {@link CommissionDataBlockT }
     *     
     */
    public CommissionDataBlockT getComm() {
        return comm;
    }

    /**
     * Sets the value of the comm property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionDataBlockT }
     *     
     */
    public void setComm(CommissionDataBlockT value) {
        this.comm = value;
    }

    /**
     * Gets the value of the contAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContAmtGrpBlockT }
     * 
     * 
     */
    public List<ContAmtGrpBlockT> getContAmt() {
        if (contAmt == null) {
            contAmt = new ArrayList<ContAmtGrpBlockT>();
        }
        return this.contAmt;
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
     * Gets the value of the miscFees property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the miscFees property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMiscFees().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MiscFeesGrpBlockT }
     * 
     * 
     */
    public List<MiscFeesGrpBlockT> getMiscFees() {
        if (miscFees == null) {
            miscFees = new ArrayList<MiscFeesGrpBlockT>();
        }
        return this.miscFees;
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
     * {@link TrdAllocGrpBlockT }
     * 
     * 
     */
    public List<TrdAllocGrpBlockT> getAlloc() {
        if (alloc == null) {
            alloc = new ArrayList<TrdAllocGrpBlockT>();
        }
        return this.alloc;
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
     * {@link SideTrdRegTSBlockT }
     * 
     * 
     */
    public List<SideTrdRegTSBlockT> getTrdRegTS() {
        if (trdRegTS == null) {
            trdRegTS = new ArrayList<SideTrdRegTSBlockT>();
        }
        return this.trdRegTS;
    }

    /**
     * Gets the value of the settlDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the settlDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSettlDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SettlDetailsBlockT }
     * 
     * 
     */
    public List<SettlDetailsBlockT> getSettlDetails() {
        if (settlDetails == null) {
            settlDetails = new ArrayList<SettlDetailsBlockT>();
        }
        return this.settlDetails;
    }

    /**
     * Gets the value of the trdRptOrdDetl property.
     * 
     * @return
     *     possible object is
     *     {@link TradeReportOrderDetailBlockT }
     *     
     */
    public TradeReportOrderDetailBlockT getTrdRptOrdDetl() {
        return trdRptOrdDetl;
    }

    /**
     * Sets the value of the trdRptOrdDetl property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeReportOrderDetailBlockT }
     *     
     */
    public void setTrdRptOrdDetl(TradeReportOrderDetailBlockT value) {
        this.trdRptOrdDetl = value;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQty(BigInteger value) {
        this.qty = value;
    }

    /**
     * Gets the value of the clAcctRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClAcctRef() {
        return clAcctRef;
    }

    /**
     * Sets the value of the clAcctRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClAcctRef(String value) {
        this.clAcctRef = value;
    }

    /**
     * Gets the value of the trdActn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrdActn() {
        return trdActn;
    }

    /**
     * Sets the value of the trdActn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrdActn(String value) {
        this.trdActn = value;
    }

    /**
     * Gets the value of the subTrdRefNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubTrdRefNo() {
        return subTrdRefNo;
    }

    /**
     * Sets the value of the subTrdRefNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubTrdRefNo(String value) {
        this.subTrdRefNo = value;
    }

    /**
     * Gets the value of the trdStat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrdStat() {
        return trdStat;
    }

    /**
     * Sets the value of the trdStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrdStat(String value) {
        this.trdStat = value;
    }

    /**
     * Gets the value of the legTyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegTyp() {
        return legTyp;
    }

    /**
     * Sets the value of the legTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegTyp(String value) {
        this.legTyp = value;
    }

    /**
     * Gets the value of the acctCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctCode() {
        return acctCode;
    }

    /**
     * Sets the value of the acctCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctCode(String value) {
        this.acctCode = value;
    }

    /**
     * Gets the value of the clAcctRefFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClAcctRefFrom() {
        return clAcctRefFrom;
    }

    /**
     * Sets the value of the clAcctRefFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClAcctRefFrom(String value) {
        this.clAcctRefFrom = value;
    }

    /**
     * Gets the value of the clAcctRefTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClAcctRefTo() {
        return clAcctRefTo;
    }

    /**
     * Sets the value of the clAcctRefTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClAcctRefTo(String value) {
        this.clAcctRefTo = value;
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
     * Gets the value of the ordID2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdID2() {
        return ordID2;
    }

    /**
     * Sets the value of the ordID2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdID2(String value) {
        this.ordID2 = value;
    }

    /**
     * Gets the value of the acctTypFrm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctTypFrm() {
        return acctTypFrm;
    }

    /**
     * Sets the value of the acctTypFrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctTypFrm(String value) {
        this.acctTypFrm = value;
    }

    /**
     * Gets the value of the acctCodeFrm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctCodeFrm() {
        return acctCodeFrm;
    }

    /**
     * Sets the value of the acctCodeFrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctCodeFrm(String value) {
        this.acctCodeFrm = value;
    }

    /**
     * Gets the value of the prmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrmAmt() {
        return prmAmt;
    }

    /**
     * Sets the value of the prmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrmAmt(BigDecimal value) {
        this.prmAmt = value;
    }

    /**
     * Gets the value of the feeDistribution property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFeeDistribution() {
        return feeDistribution;
    }

    /**
     * Sets the value of the feeDistribution property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFeeDistribution(BigInteger value) {
        this.feeDistribution = value;
    }

    /**
     * Gets the value of the brokFeeInd property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBrokFeeInd() {
        return brokFeeInd;
    }

    /**
     * Sets the value of the brokFeeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBrokFeeInd(BigInteger value) {
        this.brokFeeInd = value;
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
     * Gets the value of the sideExecID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSideExecID() {
        return sideExecID;
    }

    /**
     * Sets the value of the sideExecID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSideExecID(String value) {
        this.sideExecID = value;
    }

    /**
     * Gets the value of the ordDelay property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrdDelay() {
        return ordDelay;
    }

    /**
     * Sets the value of the ordDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrdDelay(BigInteger value) {
        this.ordDelay = value;
    }

    /**
     * Gets the value of the ordDelayUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdDelayUnit() {
        return ordDelayUnit;
    }

    /**
     * Sets the value of the ordDelayUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdDelayUnit(String value) {
        this.ordDelayUnit = value;
    }

    /**
     * Gets the value of the sideQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSideQty() {
        return sideQty;
    }

    /**
     * Sets the value of the sideQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSideQty(BigInteger value) {
        this.sideQty = value;
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
     * Gets the value of the fillStationCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFillStationCd() {
        return fillStationCd;
    }

    /**
     * Sets the value of the fillStationCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFillStationCd(String value) {
        this.fillStationCd = value;
    }

    /**
     * Gets the value of the rsnCD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRsnCD() {
        return rsnCD;
    }

    /**
     * Sets the value of the rsnCD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRsnCD(String value) {
        this.rsnCD = value;
    }

    /**
     * Gets the value of the rptSeq property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRptSeq() {
        return rptSeq;
    }

    /**
     * Sets the value of the rptSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRptSeq(BigInteger value) {
        this.rptSeq = value;
    }

    /**
     * Gets the value of the trdSubTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTrdSubTyp() {
        return trdSubTyp;
    }

    /**
     * Sets the value of the trdSubTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTrdSubTyp(BigInteger value) {
        this.trdSubTyp = value;
    }

    /**
     * Gets the value of the netGrossInd property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNetGrossInd() {
        return netGrossInd;
    }

    /**
     * Sets the value of the netGrossInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNetGrossInd(BigInteger value) {
        this.netGrossInd = value;
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
     * Gets the value of the procCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcCode() {
        return procCode;
    }

    /**
     * Sets the value of the procCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcCode(String value) {
        this.procCode = value;
    }

    /**
     * Gets the value of the oddLot property.
     * 
     * @return
     *     possible object is
     *     {@link OddLotEnumT }
     *     
     */
    public OddLotEnumT getOddLot() {
        return oddLot;
    }

    /**
     * Sets the value of the oddLot property.
     * 
     * @param value
     *     allowed object is
     *     {@link OddLotEnumT }
     *     
     */
    public void setOddLot(OddLotEnumT value) {
        this.oddLot = value;
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
     * Gets the value of the inptDev property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInptDev() {
        return inptDev;
    }

    /**
     * Sets the value of the inptDev property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInptDev(String value) {
        this.inptDev = value;
    }

    /**
     * Gets the value of the complianceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplianceID() {
        return complianceID;
    }

    /**
     * Sets the value of the complianceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplianceID(String value) {
        this.complianceID = value;
    }

    /**
     * Gets the value of the solFlag property.
     * 
     * @return
     *     possible object is
     *     {@link SolicitedFlagEnumT }
     *     
     */
    public SolicitedFlagEnumT getSolFlag() {
        return solFlag;
    }

    /**
     * Sets the value of the solFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolicitedFlagEnumT }
     *     
     */
    public void setSolFlag(SolicitedFlagEnumT value) {
        this.solFlag = value;
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
     * Gets the value of the tmBkt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTmBkt() {
        return tmBkt;
    }

    /**
     * Sets the value of the tmBkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTmBkt(String value) {
        this.tmBkt = value;
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
     * Gets the value of the exDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExDt() {
        return exDt;
    }

    /**
     * Sets the value of the exDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExDt(XMLGregorianCalendar value) {
        this.exDt = value;
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
     * Gets the value of the settlCurrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSettlCurrAmt() {
        return settlCurrAmt;
    }

    /**
     * Sets the value of the settlCurrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSettlCurrAmt(BigDecimal value) {
        this.settlCurrAmt = value;
    }

    /**
     * Gets the value of the settlCurrFxRt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSettlCurrFxRt() {
        return settlCurrFxRt;
    }

    /**
     * Sets the value of the settlCurrFxRt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSettlCurrFxRt(BigDecimal value) {
        this.settlCurrFxRt = value;
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
     * Gets the value of the mLegRptTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMLegRptTyp() {
        return mLegRptTyp;
    }

    /**
     * Sets the value of the mLegRptTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMLegRptTyp(BigInteger value) {
        this.mLegRptTyp = value;
    }

    /**
     * Gets the value of the exchRule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchRule() {
        return exchRule;
    }

    /**
     * Sets the value of the exchRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchRule(String value) {
        this.exchRule = value;
    }

    /**
     * Gets the value of the allocInd property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAllocInd() {
        return allocInd;
    }

    /**
     * Sets the value of the allocInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAllocInd(BigInteger value) {
        this.allocInd = value;
    }

    /**
     * Gets the value of the preallocMeth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreallocMeth() {
        return preallocMeth;
    }

    /**
     * Sets the value of the preallocMeth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreallocMeth(String value) {
        this.preallocMeth = value;
    }

    /**
     * Gets the value of the allocID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllocID() {
        return allocID;
    }

    /**
     * Sets the value of the allocID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllocID(String value) {
        this.allocID = value;
    }

    /**
     * Gets the value of the sideGrossTradeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSideGrossTradeAmt() {
        return sideGrossTradeAmt;
    }

    /**
     * Sets the value of the sideGrossTradeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSideGrossTradeAmt(BigDecimal value) {
        this.sideGrossTradeAmt = value;
    }

    /**
     * Gets the value of the agrsrInd property.
     * 
     * @return
     *     possible object is
     *     {@link AggressorIndicatorEnumT }
     *     
     */
    public AggressorIndicatorEnumT getAgrsrInd() {
        return agrsrInd;
    }

    /**
     * Sets the value of the agrsrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AggressorIndicatorEnumT }
     *     
     */
    public void setAgrsrInd(AggressorIndicatorEnumT value) {
        this.agrsrInd = value;
    }

    /**
     * Gets the value of the exchSpeclInstr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchSpeclInstr() {
        return exchSpeclInstr;
    }

    /**
     * Sets the value of the exchSpeclInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchSpeclInstr(String value) {
        this.exchSpeclInstr = value;
    }

    /**
     * Gets the value of the ordCat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdCat() {
        return ordCat;
    }

    /**
     * Sets the value of the ordCat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdCat(String value) {
        this.ordCat = value;
    }

    /**
     * Gets the value of the lqdtyInd property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLqdtyInd() {
        return lqdtyInd;
    }

    /**
     * Sets the value of the lqdtyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLqdtyInd(BigInteger value) {
        this.lqdtyInd = value;
    }

}
