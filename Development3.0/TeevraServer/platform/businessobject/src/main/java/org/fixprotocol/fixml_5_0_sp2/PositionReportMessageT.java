
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
 * PositionReport can be found in Volume5 of the specification 
 * 
 * <p>Java class for PositionReport_message_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PositionReport_message_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixprotocol.org/FIXML-5-0-SP2}Abstract_message_t">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}PositionReportElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}PositionReportAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PositionReport_message_t", propOrder = {
    "applSeqCtrl",
    "pty",
    "instrmt",
    "leg",
    "posUnd",
    "qty",
    "amt"
})
public class PositionReportMessageT
    extends AbstractMessageT
{

    @XmlElement(name = "ApplSeqCtrl")
    protected ApplicationSequenceControlBlockT applSeqCtrl;
    @XmlElement(name = "Pty", required = true)
    protected List<PartiesBlockT> pty;
    @XmlElement(name = "Instrmt")
    protected InstrumentBlockT instrmt;
    @XmlElement(name = "Leg")
    protected List<InstrmtLegGrpBlockT> leg;
    @XmlElement(name = "PosUnd")
    protected List<PosUndInstrmtGrpBlockT> posUnd;
    @XmlElement(name = "Qty")
    protected List<PositionQtyBlockT> qty;
    @XmlElement(name = "Amt")
    protected List<PositionAmountDataBlockT> amt;
    @XmlAttribute(name = "RptID")
    protected String rptID;
    @XmlAttribute(name = "ReqID")
    protected String reqID;
    @XmlAttribute(name = "ReqTyp")
    protected BigInteger reqTyp;
    @XmlAttribute(name = "SubReqTyp")
    protected String subReqTyp;
    @XmlAttribute(name = "TotRpts")
    protected BigInteger totRpts;
    @XmlAttribute(name = "Rslt")
    protected String rslt;
    @XmlAttribute(name = "Unsol")
    protected UnsolicitedIndicatorEnumT unsol;
    @XmlAttribute(name = "BizDt")
    protected XMLGregorianCalendar bizDt;
    @XmlAttribute(name = "SetSesID")
    protected SettlSessIDEnumT setSesID;
    @XmlAttribute(name = "SetSesSub")
    protected String setSesSub;
    @XmlAttribute(name = "PxTyp")
    protected BigInteger pxTyp;
    @XmlAttribute(name = "SettlCcy")
    protected String settlCcy;
    @XmlAttribute(name = "MsgEvtSrc")
    protected String msgEvtSrc;
    @XmlAttribute(name = "Acct")
    protected String acct;
    @XmlAttribute(name = "AcctIDSrc")
    protected String acctIDSrc;
    @XmlAttribute(name = "AcctTyp")
    protected BigInteger acctTyp;
    @XmlAttribute(name = "Ccy")
    protected String ccy;
    @XmlAttribute(name = "SetPx")
    protected BigDecimal setPx;
    @XmlAttribute(name = "SetPxTyp")
    protected BigInteger setPxTyp;
    @XmlAttribute(name = "PriSetPx")
    protected BigDecimal priSetPx;
    @XmlAttribute(name = "MtchStat")
    protected String mtchStat;
    @XmlAttribute(name = "RegStat")
    protected RegistStatusEnumT regStat;
    @XmlAttribute(name = "DlvDt")
    protected XMLGregorianCalendar dlvDt;
    @XmlAttribute(name = "ModelTyp")
    protected BigInteger modelTyp;
    @XmlAttribute(name = "PxDelta")
    protected BigDecimal pxDelta;
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
     * Gets the value of the posUnd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the posUnd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPosUnd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PosUndInstrmtGrpBlockT }
     * 
     * 
     */
    public List<PosUndInstrmtGrpBlockT> getPosUnd() {
        if (posUnd == null) {
            posUnd = new ArrayList<PosUndInstrmtGrpBlockT>();
        }
        return this.posUnd;
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
     * Gets the value of the totRpts property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotRpts() {
        return totRpts;
    }

    /**
     * Sets the value of the totRpts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotRpts(BigInteger value) {
        this.totRpts = value;
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
     * Gets the value of the setPx property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSetPx() {
        return setPx;
    }

    /**
     * Sets the value of the setPx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSetPx(BigDecimal value) {
        this.setPx = value;
    }

    /**
     * Gets the value of the setPxTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSetPxTyp() {
        return setPxTyp;
    }

    /**
     * Sets the value of the setPxTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSetPxTyp(BigInteger value) {
        this.setPxTyp = value;
    }

    /**
     * Gets the value of the priSetPx property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriSetPx() {
        return priSetPx;
    }

    /**
     * Sets the value of the priSetPx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriSetPx(BigDecimal value) {
        this.priSetPx = value;
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
     * Gets the value of the regStat property.
     * 
     * @return
     *     possible object is
     *     {@link RegistStatusEnumT }
     *     
     */
    public RegistStatusEnumT getRegStat() {
        return regStat;
    }

    /**
     * Sets the value of the regStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistStatusEnumT }
     *     
     */
    public void setRegStat(RegistStatusEnumT value) {
        this.regStat = value;
    }

    /**
     * Gets the value of the dlvDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDlvDt() {
        return dlvDt;
    }

    /**
     * Sets the value of the dlvDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDlvDt(XMLGregorianCalendar value) {
        this.dlvDt = value;
    }

    /**
     * Gets the value of the modelTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getModelTyp() {
        return modelTyp;
    }

    /**
     * Sets the value of the modelTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setModelTyp(BigInteger value) {
        this.modelTyp = value;
    }

    /**
     * Gets the value of the pxDelta property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPxDelta() {
        return pxDelta;
    }

    /**
     * Sets the value of the pxDelta property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPxDelta(BigDecimal value) {
        this.pxDelta = value;
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
