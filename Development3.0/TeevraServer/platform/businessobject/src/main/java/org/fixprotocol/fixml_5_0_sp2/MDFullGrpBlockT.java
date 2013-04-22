
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
 * <p>Java class for MDFullGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MDFullGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}MDFullGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}MDFullGrpAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MDFullGrp_Block_t", propOrder = {
    "yield",
    "sprdBnchmkCurve",
    "rtSrc",
    "secSizesGrp",
    "pty"
})
public class MDFullGrpBlockT {

    @XmlElement(name = "Yield")
    protected YieldDataBlockT yield;
    @XmlElement(name = "SprdBnchmkCurve")
    protected SpreadOrBenchmarkCurveDataBlockT sprdBnchmkCurve;
    @XmlElement(name = "RtSrc")
    protected List<RateSourceBlockT> rtSrc;
    @XmlElement(name = "SecSizesGrp")
    protected List<SecSizesGrpBlockT> secSizesGrp;
    @XmlElement(name = "Pty")
    protected List<PartiesBlockT> pty;
    @XmlAttribute(name = "Typ")
    protected String typ;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Px")
    protected BigDecimal px;
    @XmlAttribute(name = "PxTyp")
    protected BigInteger pxTyp;
    @XmlAttribute(name = "OrdTyp")
    protected String ordTyp;
    @XmlAttribute(name = "Ccy")
    protected String ccy;
    @XmlAttribute(name = "SettlCcy")
    protected String settlCcy;
    @XmlAttribute(name = "Sz")
    protected BigDecimal sz;
    @XmlAttribute(name = "LotTyp")
    protected String lotTyp;
    @XmlAttribute(name = "Dt")
    protected XMLGregorianCalendar dt;
    @XmlAttribute(name = "Tm")
    protected XMLGregorianCalendar tm;
    @XmlAttribute(name = "TickDirctn")
    protected String tickDirctn;
    @XmlAttribute(name = "Mkt")
    protected String mkt;
    @XmlAttribute(name = "SesID")
    protected String sesID;
    @XmlAttribute(name = "SesSub")
    protected String sesSub;
    @XmlAttribute(name = "TrdgStat")
    protected String trdgStat;
    @XmlAttribute(name = "HaltRsn")
    protected String haltRsn;
    @XmlAttribute(name = "QCond")
    protected String qCond;
    @XmlAttribute(name = "TrdCond")
    protected String trdCond;
    @XmlAttribute(name = "Orig")
    protected String orig;
    @XmlAttribute(name = "LctnID")
    protected String lctnID;
    @XmlAttribute(name = "DeskID")
    protected String deskID;
    @XmlAttribute(name = "OpenClsSettlFlag")
    protected String openClsSettlFlag;
    @XmlAttribute(name = "TmInForce")
    protected String tmInForce;
    @XmlAttribute(name = "ExpireDt")
    protected XMLGregorianCalendar expireDt;
    @XmlAttribute(name = "ExpireTm")
    protected XMLGregorianCalendar expireTm;
    @XmlAttribute(name = "MinQty")
    protected BigDecimal minQty;
    @XmlAttribute(name = "ExecInst")
    protected String execInst;
    @XmlAttribute(name = "SellerDays")
    protected BigInteger sellerDays;
    @XmlAttribute(name = "OrdID")
    protected String ordID;
    @XmlAttribute(name = "OrdID2")
    protected String ordID2;
    @XmlAttribute(name = "EntryID")
    protected String entryID;
    @XmlAttribute(name = "Buyer")
    protected String buyer;
    @XmlAttribute(name = "Seller")
    protected String seller;
    @XmlAttribute(name = "NumOfOrds")
    protected BigInteger numOfOrds;
    @XmlAttribute(name = "PosNo")
    protected BigInteger posNo;
    @XmlAttribute(name = "Scope")
    protected String scope;
    @XmlAttribute(name = "PxDelta")
    protected BigDecimal pxDelta;
    @XmlAttribute(name = "TrdTyp")
    protected String trdTyp;
    @XmlAttribute(name = "Txt")
    protected String txt;
    @XmlAttribute(name = "EncTxtLen")
    protected BigInteger encTxtLen;
    @XmlAttribute(name = "EncTxt")
    protected String encTxt;
    @XmlAttribute(name = "MDPxLvl")
    protected BigInteger mdPxLvl;
    @XmlAttribute(name = "Cpcty")
    protected OrderCapacityEnumT cpcty;
    @XmlAttribute(name = "MDOrigTyp")
    protected BigInteger mdOrigTyp;
    @XmlAttribute(name = "HighPx")
    protected BigDecimal highPx;
    @XmlAttribute(name = "LowPx")
    protected BigDecimal lowPx;
    @XmlAttribute(name = "FirstPx")
    protected BigDecimal firstPx;
    @XmlAttribute(name = "LastPx")
    protected BigDecimal lastPx;
    @XmlAttribute(name = "TrdVol")
    protected BigDecimal trdVol;
    @XmlAttribute(name = "SettlTyp")
    protected String settlTyp;
    @XmlAttribute(name = "SettlDt")
    protected XMLGregorianCalendar settlDt;
    @XmlAttribute(name = "MDQteTyp")
    protected BigInteger mdQteTyp;
    @XmlAttribute(name = "RptSeq")
    protected BigInteger rptSeq;
    @XmlAttribute(name = "DealingCpcty")
    protected DealingCapacityEnumT dealingCpcty;
    @XmlAttribute(name = "MDEntrySpotRt")
    protected BigDecimal mdEntrySpotRt;
    @XmlAttribute(name = "MDEntryFwdPnts")
    protected BigDecimal mdEntryFwdPnts;

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
     * Gets the value of the secSizesGrp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secSizesGrp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecSizesGrp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecSizesGrpBlockT }
     * 
     * 
     */
    public List<SecSizesGrpBlockT> getSecSizesGrp() {
        if (secSizesGrp == null) {
            secSizesGrp = new ArrayList<SecSizesGrpBlockT>();
        }
        return this.secSizesGrp;
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
     * Gets the value of the typ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTyp() {
        return typ;
    }

    /**
     * Sets the value of the typ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTyp(String value) {
        this.typ = value;
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
     * Gets the value of the sz property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSz() {
        return sz;
    }

    /**
     * Sets the value of the sz property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSz(BigDecimal value) {
        this.sz = value;
    }

    /**
     * Gets the value of the lotTyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLotTyp() {
        return lotTyp;
    }

    /**
     * Sets the value of the lotTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLotTyp(String value) {
        this.lotTyp = value;
    }

    /**
     * Gets the value of the dt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDt() {
        return dt;
    }

    /**
     * Sets the value of the dt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDt(XMLGregorianCalendar value) {
        this.dt = value;
    }

    /**
     * Gets the value of the tm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTm() {
        return tm;
    }

    /**
     * Sets the value of the tm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTm(XMLGregorianCalendar value) {
        this.tm = value;
    }

    /**
     * Gets the value of the tickDirctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTickDirctn() {
        return tickDirctn;
    }

    /**
     * Sets the value of the tickDirctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTickDirctn(String value) {
        this.tickDirctn = value;
    }

    /**
     * Gets the value of the mkt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMkt() {
        return mkt;
    }

    /**
     * Sets the value of the mkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMkt(String value) {
        this.mkt = value;
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
     * Gets the value of the trdgStat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrdgStat() {
        return trdgStat;
    }

    /**
     * Sets the value of the trdgStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrdgStat(String value) {
        this.trdgStat = value;
    }

    /**
     * Gets the value of the haltRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHaltRsn() {
        return haltRsn;
    }

    /**
     * Sets the value of the haltRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHaltRsn(String value) {
        this.haltRsn = value;
    }

    /**
     * Gets the value of the qCond property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQCond() {
        return qCond;
    }

    /**
     * Sets the value of the qCond property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQCond(String value) {
        this.qCond = value;
    }

    /**
     * Gets the value of the trdCond property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrdCond() {
        return trdCond;
    }

    /**
     * Sets the value of the trdCond property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrdCond(String value) {
        this.trdCond = value;
    }

    /**
     * Gets the value of the orig property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrig() {
        return orig;
    }

    /**
     * Sets the value of the orig property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrig(String value) {
        this.orig = value;
    }

    /**
     * Gets the value of the lctnID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLctnID() {
        return lctnID;
    }

    /**
     * Sets the value of the lctnID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLctnID(String value) {
        this.lctnID = value;
    }

    /**
     * Gets the value of the deskID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeskID() {
        return deskID;
    }

    /**
     * Sets the value of the deskID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeskID(String value) {
        this.deskID = value;
    }

    /**
     * Gets the value of the openClsSettlFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpenClsSettlFlag() {
        return openClsSettlFlag;
    }

    /**
     * Sets the value of the openClsSettlFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenClsSettlFlag(String value) {
        this.openClsSettlFlag = value;
    }

    /**
     * Gets the value of the tmInForce property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTmInForce() {
        return tmInForce;
    }

    /**
     * Sets the value of the tmInForce property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTmInForce(String value) {
        this.tmInForce = value;
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
     * Gets the value of the execInst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecInst() {
        return execInst;
    }

    /**
     * Sets the value of the execInst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecInst(String value) {
        this.execInst = value;
    }

    /**
     * Gets the value of the sellerDays property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSellerDays() {
        return sellerDays;
    }

    /**
     * Sets the value of the sellerDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSellerDays(BigInteger value) {
        this.sellerDays = value;
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
     * Gets the value of the entryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntryID() {
        return entryID;
    }

    /**
     * Sets the value of the entryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntryID(String value) {
        this.entryID = value;
    }

    /**
     * Gets the value of the buyer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyer() {
        return buyer;
    }

    /**
     * Sets the value of the buyer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyer(String value) {
        this.buyer = value;
    }

    /**
     * Gets the value of the seller property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeller() {
        return seller;
    }

    /**
     * Sets the value of the seller property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeller(String value) {
        this.seller = value;
    }

    /**
     * Gets the value of the numOfOrds property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumOfOrds() {
        return numOfOrds;
    }

    /**
     * Sets the value of the numOfOrds property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumOfOrds(BigInteger value) {
        this.numOfOrds = value;
    }

    /**
     * Gets the value of the posNo property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPosNo() {
        return posNo;
    }

    /**
     * Sets the value of the posNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPosNo(BigInteger value) {
        this.posNo = value;
    }

    /**
     * Gets the value of the scope property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScope() {
        return scope;
    }

    /**
     * Sets the value of the scope property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScope(String value) {
        this.scope = value;
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
     * Gets the value of the mdPxLvl property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMDPxLvl() {
        return mdPxLvl;
    }

    /**
     * Sets the value of the mdPxLvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMDPxLvl(BigInteger value) {
        this.mdPxLvl = value;
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
     * Gets the value of the mdOrigTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMDOrigTyp() {
        return mdOrigTyp;
    }

    /**
     * Sets the value of the mdOrigTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMDOrigTyp(BigInteger value) {
        this.mdOrigTyp = value;
    }

    /**
     * Gets the value of the highPx property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHighPx() {
        return highPx;
    }

    /**
     * Sets the value of the highPx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHighPx(BigDecimal value) {
        this.highPx = value;
    }

    /**
     * Gets the value of the lowPx property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLowPx() {
        return lowPx;
    }

    /**
     * Sets the value of the lowPx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLowPx(BigDecimal value) {
        this.lowPx = value;
    }

    /**
     * Gets the value of the firstPx property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFirstPx() {
        return firstPx;
    }

    /**
     * Sets the value of the firstPx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFirstPx(BigDecimal value) {
        this.firstPx = value;
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
     * Gets the value of the trdVol property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTrdVol() {
        return trdVol;
    }

    /**
     * Sets the value of the trdVol property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTrdVol(BigDecimal value) {
        this.trdVol = value;
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
     * Gets the value of the mdQteTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMDQteTyp() {
        return mdQteTyp;
    }

    /**
     * Sets the value of the mdQteTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMDQteTyp(BigInteger value) {
        this.mdQteTyp = value;
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
     * Gets the value of the dealingCpcty property.
     * 
     * @return
     *     possible object is
     *     {@link DealingCapacityEnumT }
     *     
     */
    public DealingCapacityEnumT getDealingCpcty() {
        return dealingCpcty;
    }

    /**
     * Sets the value of the dealingCpcty property.
     * 
     * @param value
     *     allowed object is
     *     {@link DealingCapacityEnumT }
     *     
     */
    public void setDealingCpcty(DealingCapacityEnumT value) {
        this.dealingCpcty = value;
    }

    /**
     * Gets the value of the mdEntrySpotRt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMDEntrySpotRt() {
        return mdEntrySpotRt;
    }

    /**
     * Sets the value of the mdEntrySpotRt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMDEntrySpotRt(BigDecimal value) {
        this.mdEntrySpotRt = value;
    }

    /**
     * Gets the value of the mdEntryFwdPnts property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMDEntryFwdPnts() {
        return mdEntryFwdPnts;
    }

    /**
     * Sets the value of the mdEntryFwdPnts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMDEntryFwdPnts(BigDecimal value) {
        this.mdEntryFwdPnts = value;
    }

}
