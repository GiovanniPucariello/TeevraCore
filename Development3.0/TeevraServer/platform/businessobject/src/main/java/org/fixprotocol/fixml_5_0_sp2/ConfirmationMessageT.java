
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
 * Confirmation can be found in Volume5 of the specification 
 * 
 * <p>Java class for Confirmation_message_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Confirmation_message_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixprotocol.org/FIXML-5-0-SP2}Abstract_message_t">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}ConfirmationElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}ConfirmationAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Confirmation_message_t", propOrder = {
    "pty",
    "ordAlloc",
    "trdRegTS",
    "instrmt",
    "instrmtExt",
    "finDetls",
    "undly",
    "leg",
    "yield",
    "cpcty",
    "sprdBnchmkCurve",
    "setInstr",
    "comm",
    "stip",
    "miscFees"
})
public class ConfirmationMessageT
    extends AbstractMessageT
{

    @XmlElement(name = "Pty")
    protected List<PartiesBlockT> pty;
    @XmlElement(name = "OrdAlloc")
    protected List<OrdAllocGrpBlockT> ordAlloc;
    @XmlElement(name = "TrdRegTS")
    protected List<TrdRegTimestampsBlockT> trdRegTS;
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
    @XmlElement(name = "Yield")
    protected YieldDataBlockT yield;
    @XmlElement(name = "Cpcty", required = true)
    protected List<CpctyConfGrpBlockT> cpcty;
    @XmlElement(name = "SprdBnchmkCurve")
    protected SpreadOrBenchmarkCurveDataBlockT sprdBnchmkCurve;
    @XmlElement(name = "SetInstr")
    protected SettlInstructionsDataBlockT setInstr;
    @XmlElement(name = "Comm")
    protected CommissionDataBlockT comm;
    @XmlElement(name = "Stip")
    protected List<StipulationsBlockT> stip;
    @XmlElement(name = "MiscFees")
    protected List<MiscFeesGrpBlockT> miscFees;
    @XmlAttribute(name = "CnfmID")
    protected String cnfmID;
    @XmlAttribute(name = "CnfmRefID")
    protected String cnfmRefID;
    @XmlAttribute(name = "CnfmReqID")
    protected String cnfmReqID;
    @XmlAttribute(name = "CnfmTransTyp")
    protected BigInteger cnfmTransTyp;
    @XmlAttribute(name = "CnfmTyp")
    protected BigInteger cnfmTyp;
    @XmlAttribute(name = "CopyMsgInd")
    protected String copyMsgInd;
    @XmlAttribute(name = "LegalCnfm")
    protected LegalConfirmEnumT legalCnfm;
    @XmlAttribute(name = "CnfmStat")
    protected BigInteger cnfmStat;
    @XmlAttribute(name = "AllocID")
    protected String allocID;
    @XmlAttribute(name = "AllocID2")
    protected String allocID2;
    @XmlAttribute(name = "IndAllocID")
    protected String indAllocID;
    @XmlAttribute(name = "TxnTm")
    protected XMLGregorianCalendar txnTm;
    @XmlAttribute(name = "TrdDt")
    protected XMLGregorianCalendar trdDt;
    @XmlAttribute(name = "Qty")
    protected BigDecimal qty;
    @XmlAttribute(name = "QtyTyp")
    protected BigInteger qtyTyp;
    @XmlAttribute(name = "Side")
    protected String side;
    @XmlAttribute(name = "Ccy")
    protected String ccy;
    @XmlAttribute(name = "LastMkt")
    protected String lastMkt;
    @XmlAttribute(name = "Acct")
    protected String acct;
    @XmlAttribute(name = "ActIDSrc")
    protected BigInteger actIDSrc;
    @XmlAttribute(name = "AcctTyp")
    protected BigInteger acctTyp;
    @XmlAttribute(name = "AvgPx")
    protected BigDecimal avgPx;
    @XmlAttribute(name = "AvgPxPrcsn")
    protected BigInteger avgPxPrcsn;
    @XmlAttribute(name = "PxTyp")
    protected BigInteger pxTyp;
    @XmlAttribute(name = "AvgParPx")
    protected BigDecimal avgParPx;
    @XmlAttribute(name = "RptedPx")
    protected BigDecimal rptedPx;
    @XmlAttribute(name = "Txt")
    protected String txt;
    @XmlAttribute(name = "EncTxtLen")
    protected BigInteger encTxtLen;
    @XmlAttribute(name = "EncTxt")
    protected String encTxt;
    @XmlAttribute(name = "ProcCode")
    protected String procCode;
    @XmlAttribute(name = "GrossTrdAmt")
    protected BigDecimal grossTrdAmt;
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
    @XmlAttribute(name = "MatNetMny")
    protected BigDecimal matNetMny;
    @XmlAttribute(name = "SettlCurrAmt")
    protected BigDecimal settlCurrAmt;
    @XmlAttribute(name = "SettlCcy")
    protected String settlCcy;
    @XmlAttribute(name = "SettlCurrFxRt")
    protected BigDecimal settlCurrFxRt;
    @XmlAttribute(name = "SettlCurrFxRtCalc")
    protected SettlCurrFxRateCalcEnumT settlCurrFxRtCalc;
    @XmlAttribute(name = "SettlTyp")
    protected String settlTyp;
    @XmlAttribute(name = "SettlDt")
    protected XMLGregorianCalendar settlDt;
    @XmlAttribute(name = "SharedComm")
    protected BigDecimal sharedComm;

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
     * Gets the value of the cpcty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cpcty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCpcty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CpctyConfGrpBlockT }
     * 
     * 
     */
    public List<CpctyConfGrpBlockT> getCpcty() {
        if (cpcty == null) {
            cpcty = new ArrayList<CpctyConfGrpBlockT>();
        }
        return this.cpcty;
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
     * Gets the value of the setInstr property.
     * 
     * @return
     *     possible object is
     *     {@link SettlInstructionsDataBlockT }
     *     
     */
    public SettlInstructionsDataBlockT getSetInstr() {
        return setInstr;
    }

    /**
     * Sets the value of the setInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlInstructionsDataBlockT }
     *     
     */
    public void setSetInstr(SettlInstructionsDataBlockT value) {
        this.setInstr = value;
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
     * Gets the value of the cnfmID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnfmID() {
        return cnfmID;
    }

    /**
     * Sets the value of the cnfmID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnfmID(String value) {
        this.cnfmID = value;
    }

    /**
     * Gets the value of the cnfmRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnfmRefID() {
        return cnfmRefID;
    }

    /**
     * Sets the value of the cnfmRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnfmRefID(String value) {
        this.cnfmRefID = value;
    }

    /**
     * Gets the value of the cnfmReqID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnfmReqID() {
        return cnfmReqID;
    }

    /**
     * Sets the value of the cnfmReqID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnfmReqID(String value) {
        this.cnfmReqID = value;
    }

    /**
     * Gets the value of the cnfmTransTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCnfmTransTyp() {
        return cnfmTransTyp;
    }

    /**
     * Sets the value of the cnfmTransTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCnfmTransTyp(BigInteger value) {
        this.cnfmTransTyp = value;
    }

    /**
     * Gets the value of the cnfmTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCnfmTyp() {
        return cnfmTyp;
    }

    /**
     * Sets the value of the cnfmTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCnfmTyp(BigInteger value) {
        this.cnfmTyp = value;
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
     * Gets the value of the cnfmStat property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCnfmStat() {
        return cnfmStat;
    }

    /**
     * Sets the value of the cnfmStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCnfmStat(BigInteger value) {
        this.cnfmStat = value;
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
     * Gets the value of the allocID2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllocID2() {
        return allocID2;
    }

    /**
     * Sets the value of the allocID2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllocID2(String value) {
        this.allocID2 = value;
    }

    /**
     * Gets the value of the indAllocID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndAllocID() {
        return indAllocID;
    }

    /**
     * Sets the value of the indAllocID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndAllocID(String value) {
        this.indAllocID = value;
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
     * Gets the value of the actIDSrc property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getActIDSrc() {
        return actIDSrc;
    }

    /**
     * Sets the value of the actIDSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setActIDSrc(BigInteger value) {
        this.actIDSrc = value;
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
     * Gets the value of the rptedPx property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRptedPx() {
        return rptedPx;
    }

    /**
     * Sets the value of the rptedPx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRptedPx(BigDecimal value) {
        this.rptedPx = value;
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
     * Gets the value of the matNetMny property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMatNetMny() {
        return matNetMny;
    }

    /**
     * Sets the value of the matNetMny property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMatNetMny(BigDecimal value) {
        this.matNetMny = value;
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
     * Gets the value of the sharedComm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSharedComm() {
        return sharedComm;
    }

    /**
     * Sets the value of the sharedComm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSharedComm(BigDecimal value) {
        this.sharedComm = value;
    }

}
