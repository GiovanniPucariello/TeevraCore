
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
 * TradeCaptureReportAck can be found in Volume5 of the specification 
 * 
 * <p>Java class for TradeCaptureReportAck_message_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeCaptureReportAck_message_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixprotocol.org/FIXML-5-0-SP2}Abstract_message_t">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}TradeCaptureReportAckElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}TradeCaptureReportAckAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeCaptureReportAck_message_t", propOrder = {
    "pty",
    "instrmt",
    "undly",
    "trdRepIndicatorsGrp",
    "trdLeg",
    "trdRegTS",
    "amt",
    "rptSide"
})
public class TradeCaptureReportAckMessageT
    extends AbstractMessageT
{

    @XmlElement(name = "Pty")
    protected List<RootPartiesBlockT> pty;
    @XmlElement(name = "Instrmt", required = true)
    protected InstrumentBlockT instrmt;
    @XmlElement(name = "Undly")
    protected List<UndInstrmtGrpBlockT> undly;
    @XmlElement(name = "TrdRepIndicatorsGrp")
    protected List<TrdRepIndicatorsGrpBlockT> trdRepIndicatorsGrp;
    @XmlElement(name = "TrdLeg")
    protected List<TrdInstrmtLegGrpBlockT> trdLeg;
    @XmlElement(name = "TrdRegTS")
    protected List<TrdRegTimestampsBlockT> trdRegTS;
    @XmlElement(name = "Amt")
    protected List<PositionAmountDataBlockT> amt;
    @XmlElement(name = "RptSide")
    protected List<TrdCapRptAckSideGrpBlockT> rptSide;
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
    @XmlAttribute(name = "RptRefID")
    protected String rptRefID;
    @XmlAttribute(name = "RptRefID2")
    protected String rptRefID2;
    @XmlAttribute(name = "TrdRptStat")
    protected BigInteger trdRptStat;
    @XmlAttribute(name = "RejRsn")
    protected String rejRsn;
    @XmlAttribute(name = "RptID2")
    protected String rptID2;
    @XmlAttribute(name = "SubReqTyp")
    protected String subReqTyp;
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
    @XmlAttribute(name = "UndSesID")
    protected String undSesID;
    @XmlAttribute(name = "UndSesSub")
    protected String undSesSub;
    @XmlAttribute(name = "SetSesID")
    protected SettlSessIDEnumT setSesID;
    @XmlAttribute(name = "SetSesSub")
    protected String setSesSub;
    @XmlAttribute(name = "QtyTyp")
    protected BigInteger qtyTyp;
    @XmlAttribute(name = "LastQty")
    protected BigDecimal lastQty;
    @XmlAttribute(name = "LastPx")
    protected BigDecimal lastPx;
    @XmlAttribute(name = "VenuTyp")
    protected VenueTypeEnumT venuTyp;
    @XmlAttribute(name = "MktSegID")
    protected String mktSegID;
    @XmlAttribute(name = "MktID")
    protected String mktID;
    @XmlAttribute(name = "LastParPx")
    protected BigDecimal lastParPx;
    @XmlAttribute(name = "CalcCcyLastQty")
    protected BigDecimal calcCcyLastQty;
    @XmlAttribute(name = "LastSwapPnts")
    protected BigDecimal lastSwapPnts;
    @XmlAttribute(name = "Ccy")
    protected String ccy;
    @XmlAttribute(name = "SettlCcy")
    protected String settlCcy;
    @XmlAttribute(name = "LastSpotRt")
    protected BigDecimal lastSpotRt;
    @XmlAttribute(name = "LastFwdPnts")
    protected BigDecimal lastFwdPnts;
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
    @XmlAttribute(name = "MtchStat")
    protected String mtchStat;
    @XmlAttribute(name = "MtchTyp")
    protected String mtchTyp;
    @XmlAttribute(name = "CopyMsgInd")
    protected String copyMsgInd;
    @XmlAttribute(name = "PubTrdInd")
    protected PublishTrdIndicatorEnumT pubTrdInd;
    @XmlAttribute(name = "TrdPubInd")
    protected BigInteger trdPubInd;
    @XmlAttribute(name = "ShrtSaleRsn")
    protected BigInteger shrtSaleRsn;
    @XmlAttribute(name = "RspTransportTyp")
    protected BigInteger rspTransportTyp;
    @XmlAttribute(name = "RspDest")
    protected String rspDest;
    @XmlAttribute(name = "Txt")
    protected String txt;
    @XmlAttribute(name = "EncTxtLen")
    protected BigInteger encTxtLen;
    @XmlAttribute(name = "EncTxt")
    protected String encTxt;
    @XmlAttribute(name = "AsOfInd")
    protected String asOfInd;
    @XmlAttribute(name = "ClrFeeInd")
    protected String clrFeeInd;
    @XmlAttribute(name = "TierCD")
    protected String tierCD;
    @XmlAttribute(name = "MsgEvtSrc")
    protected String msgEvtSrc;
    @XmlAttribute(name = "LastUpdateTm")
    protected String lastUpdateTm;
    @XmlAttribute(name = "RndPx")
    protected BigDecimal rndPx;
    @XmlAttribute(name = "RptSys")
    protected String rptSys;
    @XmlAttribute(name = "GrossTrdAmt")
    protected BigDecimal grossTrdAmt;
    @XmlAttribute(name = "SettlDt")
    protected XMLGregorianCalendar settlDt;
    @XmlAttribute(name = "FeeMult")
    protected BigDecimal feeMult;

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
     * {@link TrdCapRptAckSideGrpBlockT }
     * 
     * 
     */
    public List<TrdCapRptAckSideGrpBlockT> getRptSide() {
        if (rptSide == null) {
            rptSide = new ArrayList<TrdCapRptAckSideGrpBlockT>();
        }
        return this.rptSide;
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
     * Gets the value of the rspTransportTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRspTransportTyp() {
        return rspTransportTyp;
    }

    /**
     * Sets the value of the rspTransportTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRspTransportTyp(BigInteger value) {
        this.rspTransportTyp = value;
    }

    /**
     * Gets the value of the rspDest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRspDest() {
        return rspDest;
    }

    /**
     * Sets the value of the rspDest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRspDest(String value) {
        this.rspDest = value;
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
     * Gets the value of the clrFeeInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClrFeeInd() {
        return clrFeeInd;
    }

    /**
     * Sets the value of the clrFeeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClrFeeInd(String value) {
        this.clrFeeInd = value;
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
     * Gets the value of the rptSys property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptSys() {
        return rptSys;
    }

    /**
     * Sets the value of the rptSys property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRptSys(String value) {
        this.rptSys = value;
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
