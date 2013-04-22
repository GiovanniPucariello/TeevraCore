
package org.fixprotocol.fixml_5_0_sp2;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for QuotEntryGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuotEntryGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}QuotEntryGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}QuotEntryGrpAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuotEntryGrp_Block_t", propOrder = {
    "instrmt",
    "leg"
})
public class QuotEntryGrpBlockT {

    @XmlElement(name = "Instrmt")
    protected InstrumentBlockT instrmt;
    @XmlElement(name = "Leg")
    protected InstrmtLegGrpBlockT leg;
    @XmlAttribute(name = "EntryID")
    protected String entryID;
    @XmlAttribute(name = "BidPx")
    protected BigDecimal bidPx;
    @XmlAttribute(name = "OfrPx")
    protected BigDecimal ofrPx;
    @XmlAttribute(name = "BidSz")
    protected BigDecimal bidSz;
    @XmlAttribute(name = "OfrSz")
    protected BigDecimal ofrSz;
    @XmlAttribute(name = "ValidUntilTm")
    protected XMLGregorianCalendar validUntilTm;
    @XmlAttribute(name = "BidSpotRt")
    protected BigDecimal bidSpotRt;
    @XmlAttribute(name = "OfrSpotRt")
    protected BigDecimal ofrSpotRt;
    @XmlAttribute(name = "BidFwdPnts")
    protected BigDecimal bidFwdPnts;
    @XmlAttribute(name = "OfrFwdPnts")
    protected BigDecimal ofrFwdPnts;
    @XmlAttribute(name = "MidPx")
    protected BigDecimal midPx;
    @XmlAttribute(name = "BidYld")
    protected BigDecimal bidYld;
    @XmlAttribute(name = "MidYld")
    protected BigDecimal midYld;
    @XmlAttribute(name = "OfrYld")
    protected BigDecimal ofrYld;
    @XmlAttribute(name = "TxnTm")
    protected XMLGregorianCalendar txnTm;
    @XmlAttribute(name = "SesID")
    protected String sesID;
    @XmlAttribute(name = "SesSub")
    protected String sesSub;
    @XmlAttribute(name = "SettlDt")
    protected XMLGregorianCalendar settlDt;
    @XmlAttribute(name = "OrdTyp")
    protected String ordTyp;
    @XmlAttribute(name = "SettlDt2")
    protected XMLGregorianCalendar settlDt2;
    @XmlAttribute(name = "Qty2")
    protected BigDecimal qty2;
    @XmlAttribute(name = "BidFwdPnts2")
    protected BigDecimal bidFwdPnts2;
    @XmlAttribute(name = "OfrFwdPnts2")
    protected BigDecimal ofrFwdPnts2;
    @XmlAttribute(name = "Ccy")
    protected String ccy;
    @XmlAttribute(name = "BkngTyp")
    protected BigInteger bkngTyp;
    @XmlAttribute(name = "Cpcty")
    protected OrderCapacityEnumT cpcty;
    @XmlAttribute(name = "Rstctions")
    protected String rstctions;

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
     * @return
     *     possible object is
     *     {@link InstrmtLegGrpBlockT }
     *     
     */
    public InstrmtLegGrpBlockT getLeg() {
        return leg;
    }

    /**
     * Sets the value of the leg property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstrmtLegGrpBlockT }
     *     
     */
    public void setLeg(InstrmtLegGrpBlockT value) {
        this.leg = value;
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
     * Gets the value of the bidPx property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBidPx() {
        return bidPx;
    }

    /**
     * Sets the value of the bidPx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBidPx(BigDecimal value) {
        this.bidPx = value;
    }

    /**
     * Gets the value of the ofrPx property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOfrPx() {
        return ofrPx;
    }

    /**
     * Sets the value of the ofrPx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOfrPx(BigDecimal value) {
        this.ofrPx = value;
    }

    /**
     * Gets the value of the bidSz property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBidSz() {
        return bidSz;
    }

    /**
     * Sets the value of the bidSz property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBidSz(BigDecimal value) {
        this.bidSz = value;
    }

    /**
     * Gets the value of the ofrSz property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOfrSz() {
        return ofrSz;
    }

    /**
     * Sets the value of the ofrSz property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOfrSz(BigDecimal value) {
        this.ofrSz = value;
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
     * Gets the value of the bidSpotRt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBidSpotRt() {
        return bidSpotRt;
    }

    /**
     * Sets the value of the bidSpotRt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBidSpotRt(BigDecimal value) {
        this.bidSpotRt = value;
    }

    /**
     * Gets the value of the ofrSpotRt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOfrSpotRt() {
        return ofrSpotRt;
    }

    /**
     * Sets the value of the ofrSpotRt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOfrSpotRt(BigDecimal value) {
        this.ofrSpotRt = value;
    }

    /**
     * Gets the value of the bidFwdPnts property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBidFwdPnts() {
        return bidFwdPnts;
    }

    /**
     * Sets the value of the bidFwdPnts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBidFwdPnts(BigDecimal value) {
        this.bidFwdPnts = value;
    }

    /**
     * Gets the value of the ofrFwdPnts property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOfrFwdPnts() {
        return ofrFwdPnts;
    }

    /**
     * Sets the value of the ofrFwdPnts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOfrFwdPnts(BigDecimal value) {
        this.ofrFwdPnts = value;
    }

    /**
     * Gets the value of the midPx property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMidPx() {
        return midPx;
    }

    /**
     * Sets the value of the midPx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMidPx(BigDecimal value) {
        this.midPx = value;
    }

    /**
     * Gets the value of the bidYld property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBidYld() {
        return bidYld;
    }

    /**
     * Sets the value of the bidYld property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBidYld(BigDecimal value) {
        this.bidYld = value;
    }

    /**
     * Gets the value of the midYld property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMidYld() {
        return midYld;
    }

    /**
     * Sets the value of the midYld property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMidYld(BigDecimal value) {
        this.midYld = value;
    }

    /**
     * Gets the value of the ofrYld property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOfrYld() {
        return ofrYld;
    }

    /**
     * Sets the value of the ofrYld property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOfrYld(BigDecimal value) {
        this.ofrYld = value;
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
     * Gets the value of the bidFwdPnts2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBidFwdPnts2() {
        return bidFwdPnts2;
    }

    /**
     * Sets the value of the bidFwdPnts2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBidFwdPnts2(BigDecimal value) {
        this.bidFwdPnts2 = value;
    }

    /**
     * Gets the value of the ofrFwdPnts2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOfrFwdPnts2() {
        return ofrFwdPnts2;
    }

    /**
     * Sets the value of the ofrFwdPnts2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOfrFwdPnts2(BigDecimal value) {
        this.ofrFwdPnts2 = value;
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
     * Gets the value of the rstctions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRstctions() {
        return rstctions;
    }

    /**
     * Sets the value of the rstctions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRstctions(String value) {
        this.rstctions = value;
    }

}
