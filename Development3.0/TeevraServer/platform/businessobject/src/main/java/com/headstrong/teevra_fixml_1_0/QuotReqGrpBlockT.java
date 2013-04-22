
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
 * <p>Java class for QuotReqGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuotReqGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}QuotReqGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}QuotReqGrpAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuotReqGrp_Block_t", propOrder = {
    "instrmt",
    "finDetls",
    "undly",
    "ordQty",
    "rtSrc",
    "stip",
    "leg",
    "quotQual",
    "sprdBnchmkCurve",
    "yield",
    "pty"
})
public class QuotReqGrpBlockT {

    @XmlElement(name = "Instrmt", required = true)
    protected InstrumentBlockT instrmt;
    @XmlElement(name = "FinDetls")
    protected FinancingDetailsBlockT finDetls;
    @XmlElement(name = "Undly")
    protected UndInstrmtGrpBlockT undly;
    @XmlElement(name = "OrdQty")
    protected OrderQtyDataBlockT ordQty;
    @XmlElement(name = "RtSrc")
    protected List<RateSourceBlockT> rtSrc;
    @XmlElement(name = "Stip")
    protected List<StipulationsBlockT> stip;
    @XmlElement(name = "Leg")
    protected List<QuotReqLegsGrpBlockT> leg;
    @XmlElement(name = "QuotQual")
    protected List<QuotQualGrpBlockT> quotQual;
    @XmlElement(name = "SprdBnchmkCurve")
    protected SpreadOrBenchmarkCurveDataBlockT sprdBnchmkCurve;
    @XmlElement(name = "Yield")
    protected YieldDataBlockT yield;
    @XmlElement(name = "Pty")
    protected List<PartiesBlockT> pty;
    @XmlAttribute(name = "PrevClsPx")
    protected BigDecimal prevClsPx;
    @XmlAttribute(name = "ReqTyp")
    protected BigInteger reqTyp;
    @XmlAttribute(name = "Typ")
    protected BigInteger typ;
    @XmlAttribute(name = "SesID")
    protected String sesID;
    @XmlAttribute(name = "SesSub")
    protected String sesSub;
    @XmlAttribute(name = "OrignDt")
    protected XMLGregorianCalendar orignDt;
    @XmlAttribute(name = "Side")
    protected String side;
    @XmlAttribute(name = "QtyTyp")
    protected BigInteger qtyTyp;
    @XmlAttribute(name = "MinQty")
    protected BigDecimal minQty;
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
    @XmlAttribute(name = "SettlCcy")
    protected String settlCcy;
    @XmlAttribute(name = "Acct")
    protected String acct;
    @XmlAttribute(name = "AcctIDSrc")
    protected String acctIDSrc;
    @XmlAttribute(name = "AcctTyp")
    protected BigInteger acctTyp;
    @XmlAttribute(name = "QuotPxTyp")
    protected BigInteger quotPxTyp;
    @XmlAttribute(name = "OrdTyp")
    protected String ordTyp;
    @XmlAttribute(name = "ValidUntilTm")
    protected XMLGregorianCalendar validUntilTm;
    @XmlAttribute(name = "ExpireTm")
    protected XMLGregorianCalendar expireTm;
    @XmlAttribute(name = "TxnTm")
    protected XMLGregorianCalendar txnTm;
    @XmlAttribute(name = "PxTyp")
    protected BigInteger pxTyp;
    @XmlAttribute(name = "Px")
    protected BigDecimal px;
    @XmlAttribute(name = "Px2")
    protected BigDecimal px2;

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
     * @return
     *     possible object is
     *     {@link UndInstrmtGrpBlockT }
     *     
     */
    public UndInstrmtGrpBlockT getUndly() {
        return undly;
    }

    /**
     * Sets the value of the undly property.
     * 
     * @param value
     *     allowed object is
     *     {@link UndInstrmtGrpBlockT }
     *     
     */
    public void setUndly(UndInstrmtGrpBlockT value) {
        this.undly = value;
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
     * {@link QuotReqLegsGrpBlockT }
     * 
     * 
     */
    public List<QuotReqLegsGrpBlockT> getLeg() {
        if (leg == null) {
            leg = new ArrayList<QuotReqLegsGrpBlockT>();
        }
        return this.leg;
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
     * Gets the value of the prevClsPx property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrevClsPx() {
        return prevClsPx;
    }

    /**
     * Sets the value of the prevClsPx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrevClsPx(BigDecimal value) {
        this.prevClsPx = value;
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
     * Gets the value of the quotPxTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuotPxTyp() {
        return quotPxTyp;
    }

    /**
     * Sets the value of the quotPxTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuotPxTyp(BigInteger value) {
        this.quotPxTyp = value;
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
     * Gets the value of the px2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPx2() {
        return px2;
    }

    /**
     * Sets the value of the px2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPx2(BigDecimal value) {
        this.px2 = value;
    }

}
