
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
 * TradeCaptureReportRequest can be found in Volume5 of the specification 
 * 
 * <p>Java class for TradeCaptureReportRequest_message_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeCaptureReportRequest_message_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.headstrong.com/TEEVRA-FIXML-1-0}Abstract_message_t">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}TradeCaptureReportRequestElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}TradeCaptureReportRequestAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeCaptureReportRequest_message_t", propOrder = {
    "pty",
    "instrmt",
    "instrmtExt",
    "finDetls",
    "undly",
    "leg",
    "trdCapDt"
})
public class TradeCaptureReportRequestMessageT
    extends AbstractMessageT
{

    @XmlElement(name = "Pty")
    protected List<PartiesBlockT> pty;
    @XmlElement(name = "Instrmt")
    protected InstrumentBlockT instrmt;
    @XmlElement(name = "InstrmtExt")
    protected InstrumentExtensionBlockT instrmtExt;
    @XmlElement(name = "FinDetls")
    protected FinancingDetailsBlockT finDetls;
    @XmlElement(name = "Undly")
    protected List<UndInstrmtGrpBlockT> undly;
    @XmlElement(name = "Leg")
    protected List<InstrmtLegGrpBlockT> leg;
    @XmlElement(name = "TrdCapDt")
    protected List<TrdCapDtGrpBlockT> trdCapDt;
    @XmlAttribute(name = "CrossTyp")
    protected String crossTyp;
    @XmlAttribute(name = "ReqID")
    protected String reqID;
    @XmlAttribute(name = "TrdID")
    protected String trdID;
    @XmlAttribute(name = "TrdID2")
    protected String trdID2;
    @XmlAttribute(name = "FirmTrdID")
    protected String firmTrdID;
    @XmlAttribute(name = "FirmTrdID2")
    protected String firmTrdID2;
    @XmlAttribute(name = "ReqTyp")
    protected BigInteger reqTyp;
    @XmlAttribute(name = "SubReqTyp")
    protected String subReqTyp;
    @XmlAttribute(name = "RptID")
    protected String rptID;
    @XmlAttribute(name = "RptID2")
    protected String rptID2;
    @XmlAttribute(name = "ExecID")
    protected String execID;
    @XmlAttribute(name = "ExecTyp")
    protected String execTyp;
    @XmlAttribute(name = "OrdID")
    protected String ordID;
    @XmlAttribute(name = "ClOrdID")
    protected String clOrdID;
    @XmlAttribute(name = "MtchStat")
    protected String mtchStat;
    @XmlAttribute(name = "TrdTyp")
    protected String trdTyp;
    @XmlAttribute(name = "TrdSubTyp")
    protected String trdSubTyp;
    @XmlAttribute(name = "TrdHandlInst")
    protected String trdHandlInst;
    @XmlAttribute(name = "TrnsfrRsn")
    protected String trnsfrRsn;
    @XmlAttribute(name = "TrdTyp2")
    protected BigInteger trdTyp2;
    @XmlAttribute(name = "LinkID")
    protected String linkID;
    @XmlAttribute(name = "MtchID")
    protected String mtchID;
    @XmlAttribute(name = "BizDt")
    protected XMLGregorianCalendar bizDt;
    @XmlAttribute(name = "SesID")
    protected String sesID;
    @XmlAttribute(name = "SesSub")
    protected String sesSub;
    @XmlAttribute(name = "TmBkt")
    protected String tmBkt;
    @XmlAttribute(name = "Side")
    protected String side;
    @XmlAttribute(name = "MLegRptTyp")
    protected String mLegRptTyp;
    @XmlAttribute(name = "InptSrc")
    protected String inptSrc;
    @XmlAttribute(name = "InptDev")
    protected String inptDev;
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
    @XmlAttribute(name = "MsgEvtSrc")
    protected String msgEvtSrc;

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
     * Gets the value of the trdCapDt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trdCapDt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrdCapDt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrdCapDtGrpBlockT }
     * 
     * 
     */
    public List<TrdCapDtGrpBlockT> getTrdCapDt() {
        if (trdCapDt == null) {
            trdCapDt = new ArrayList<TrdCapDtGrpBlockT>();
        }
        return this.trdCapDt;
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
     * Gets the value of the reqTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReqTyp() {
        return reqTyp;
    }

    /**
     * Sets the value of the reqTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReqTyp(BigInteger value) {
        this.reqTyp = value;
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
     * Gets the value of the ordID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdID() {
        return ordID;
    }

    /**
     * Sets the value of the ordID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdID(String value) {
        this.ordID = value;
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

}
