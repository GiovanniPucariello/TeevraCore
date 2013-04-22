
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
 * AssignmentReport can be found in Volume5 of the specification 
 * 
 * <p>Java class for AssignmentReport_message_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssignmentReport_message_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.headstrong.com/TEEVRA-FIXML-1-0}Abstract_message_t">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}AssignmentReportElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}AssignmentReportAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssignmentReport_message_t", propOrder = {
    "applSeqCtrl",
    "pty",
    "instrmt",
    "leg",
    "undly",
    "qty",
    "amt"
})
public class AssignmentReportMessageT
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
    @XmlElement(name = "Undly")
    protected List<UndInstrmtGrpBlockT> undly;
    @XmlElement(name = "Qty")
    protected List<PositionQtyBlockT> qty;
    @XmlElement(name = "Amt")
    protected List<PositionAmountDataBlockT> amt;
    @XmlAttribute(name = "TransTyp")
    protected String transTyp;
    @XmlAttribute(name = "TrdID")
    protected String trdID;
    @XmlAttribute(name = "RptID")
    protected String rptID;
    @XmlAttribute(name = "ReqID")
    protected String reqID;
    @XmlAttribute(name = "TotNumAsgnRpts")
    protected BigInteger totNumAsgnRpts;
    @XmlAttribute(name = "LastRptReqed")
    protected LastRptRequestedEnumT lastRptReqed;
    @XmlAttribute(name = "Acct")
    protected String acct;
    @XmlAttribute(name = "AcctTyp")
    protected BigInteger acctTyp;
    @XmlAttribute(name = "Ccy")
    protected String ccy;
    @XmlAttribute(name = "ThresholdAmt")
    protected BigDecimal thresholdAmt;
    @XmlAttribute(name = "SetPx")
    protected BigDecimal setPx;
    @XmlAttribute(name = "SetPxTyp")
    protected BigInteger setPxTyp;
    @XmlAttribute(name = "UndSetPx")
    protected BigDecimal undSetPx;
    @XmlAttribute(name = "PriSetPx")
    protected BigDecimal priSetPx;
    @XmlAttribute(name = "ExpireDt")
    protected XMLGregorianCalendar expireDt;
    @XmlAttribute(name = "AsgnMeth")
    protected AssignmentMethodEnumT asgnMeth;
    @XmlAttribute(name = "Unit")
    protected BigDecimal unit;
    @XmlAttribute(name = "OpenInt")
    protected BigDecimal openInt;
    @XmlAttribute(name = "ExrMethod")
    protected ExerciseMethodEnumT exrMethod;
    @XmlAttribute(name = "SetSesID")
    protected SettlSessIDEnumT setSesID;
    @XmlAttribute(name = "SetSesSub")
    protected String setSesSub;
    @XmlAttribute(name = "BizDt")
    protected XMLGregorianCalendar bizDt;
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
     * Gets the value of the totNumAsgnRpts property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotNumAsgnRpts() {
        return totNumAsgnRpts;
    }

    /**
     * Sets the value of the totNumAsgnRpts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotNumAsgnRpts(BigInteger value) {
        this.totNumAsgnRpts = value;
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
     * Gets the value of the undSetPx property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUndSetPx() {
        return undSetPx;
    }

    /**
     * Sets the value of the undSetPx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUndSetPx(BigDecimal value) {
        this.undSetPx = value;
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
     * Gets the value of the expireDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpireDt() {
        return expireDt;
    }

    /**
     * Sets the value of the expireDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpireDt(XMLGregorianCalendar value) {
        this.expireDt = value;
    }

    /**
     * Gets the value of the asgnMeth property.
     * 
     * @return
     *     possible object is
     *     {@link AssignmentMethodEnumT }
     *     
     */
    public AssignmentMethodEnumT getAsgnMeth() {
        return asgnMeth;
    }

    /**
     * Sets the value of the asgnMeth property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssignmentMethodEnumT }
     *     
     */
    public void setAsgnMeth(AssignmentMethodEnumT value) {
        this.asgnMeth = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnit(BigDecimal value) {
        this.unit = value;
    }

    /**
     * Gets the value of the openInt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOpenInt() {
        return openInt;
    }

    /**
     * Sets the value of the openInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOpenInt(BigDecimal value) {
        this.openInt = value;
    }

    /**
     * Gets the value of the exrMethod property.
     * 
     * @return
     *     possible object is
     *     {@link ExerciseMethodEnumT }
     *     
     */
    public ExerciseMethodEnumT getExrMethod() {
        return exrMethod;
    }

    /**
     * Sets the value of the exrMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExerciseMethodEnumT }
     *     
     */
    public void setExrMethod(ExerciseMethodEnumT value) {
        this.exrMethod = value;
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
