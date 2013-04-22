
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
 * <p>Java class for TradeReportOrderDetail_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeReportOrderDetail_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}TradeReportOrderDetailElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}TradeReportOrderDetailAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeReportOrderDetail_Block_t", propOrder = {
    "ordQty",
    "dsplyInstr"
})
public class TradeReportOrderDetailBlockT {

    @XmlElement(name = "OrdQty")
    protected OrderQtyDataBlockT ordQty;
    @XmlElement(name = "DsplyInstr")
    protected DisplayInstructionBlockT dsplyInstr;
    @XmlAttribute(name = "OrdID")
    protected String ordID;
    @XmlAttribute(name = "OrdID2")
    protected String ordID2;
    @XmlAttribute(name = "ClOrdID")
    protected String clOrdID;
    @XmlAttribute(name = "ClOrdID2")
    protected String clOrdID2;
    @XmlAttribute(name = "ListID")
    protected String listID;
    @XmlAttribute(name = "RefOrdID")
    protected String refOrdID;
    @XmlAttribute(name = "RefOrdIDSrc")
    protected String refOrdIDSrc;
    @XmlAttribute(name = "RefOrdIDRsn")
    protected String refOrdIDRsn;
    @XmlAttribute(name = "OrdTyp")
    protected String ordTyp;
    @XmlAttribute(name = "Px")
    protected BigDecimal px;
    @XmlAttribute(name = "StopPx")
    protected BigDecimal stopPx;
    @XmlAttribute(name = "ExecInst")
    protected String execInst;
    @XmlAttribute(name = "OrdStat")
    protected String ordStat;
    @XmlAttribute(name = "LeavesQty")
    protected BigDecimal leavesQty;
    @XmlAttribute(name = "CumQty")
    protected BigDecimal cumQty;
    @XmlAttribute(name = "TmInForce")
    protected String tmInForce;
    @XmlAttribute(name = "ExpireTm")
    protected XMLGregorianCalendar expireTm;
    @XmlAttribute(name = "Cpcty")
    protected OrderCapacityEnumT cpcty;
    @XmlAttribute(name = "Rstctions")
    protected String rstctions;
    @XmlAttribute(name = "BkngTyp")
    protected BigInteger bkngTyp;
    @XmlAttribute(name = "OrigCustOrdCpcty")
    protected BigInteger origCustOrdCpcty;
    @XmlAttribute(name = "OrdInptDev")
    protected String ordInptDev;
    @XmlAttribute(name = "LotTyp")
    protected String lotTyp;
    @XmlAttribute(name = "TransBkdTm")
    protected XMLGregorianCalendar transBkdTm;
    @XmlAttribute(name = "OrigOrdModTm")
    protected XMLGregorianCalendar origOrdModTm;

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
     * Gets the value of the dsplyInstr property.
     * 
     * @return
     *     possible object is
     *     {@link DisplayInstructionBlockT }
     *     
     */
    public DisplayInstructionBlockT getDsplyInstr() {
        return dsplyInstr;
    }

    /**
     * Sets the value of the dsplyInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisplayInstructionBlockT }
     *     
     */
    public void setDsplyInstr(DisplayInstructionBlockT value) {
        this.dsplyInstr = value;
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
     * Gets the value of the clOrdID2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClOrdID2() {
        return clOrdID2;
    }

    /**
     * Sets the value of the clOrdID2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClOrdID2(String value) {
        this.clOrdID2 = value;
    }

    /**
     * Gets the value of the listID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListID() {
        return listID;
    }

    /**
     * Sets the value of the listID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListID(String value) {
        this.listID = value;
    }

    /**
     * Gets the value of the refOrdID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefOrdID() {
        return refOrdID;
    }

    /**
     * Sets the value of the refOrdID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefOrdID(String value) {
        this.refOrdID = value;
    }

    /**
     * Gets the value of the refOrdIDSrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefOrdIDSrc() {
        return refOrdIDSrc;
    }

    /**
     * Sets the value of the refOrdIDSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefOrdIDSrc(String value) {
        this.refOrdIDSrc = value;
    }

    /**
     * Gets the value of the refOrdIDRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefOrdIDRsn() {
        return refOrdIDRsn;
    }

    /**
     * Sets the value of the refOrdIDRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefOrdIDRsn(String value) {
        this.refOrdIDRsn = value;
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
     * Gets the value of the stopPx property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStopPx() {
        return stopPx;
    }

    /**
     * Sets the value of the stopPx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStopPx(BigDecimal value) {
        this.stopPx = value;
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
     * Gets the value of the ordStat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdStat() {
        return ordStat;
    }

    /**
     * Sets the value of the ordStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdStat(String value) {
        this.ordStat = value;
    }

    /**
     * Gets the value of the leavesQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLeavesQty() {
        return leavesQty;
    }

    /**
     * Sets the value of the leavesQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLeavesQty(BigDecimal value) {
        this.leavesQty = value;
    }

    /**
     * Gets the value of the cumQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCumQty() {
        return cumQty;
    }

    /**
     * Sets the value of the cumQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCumQty(BigDecimal value) {
        this.cumQty = value;
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
     * Gets the value of the origCustOrdCpcty property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrigCustOrdCpcty() {
        return origCustOrdCpcty;
    }

    /**
     * Sets the value of the origCustOrdCpcty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrigCustOrdCpcty(BigInteger value) {
        this.origCustOrdCpcty = value;
    }

    /**
     * Gets the value of the ordInptDev property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdInptDev() {
        return ordInptDev;
    }

    /**
     * Sets the value of the ordInptDev property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdInptDev(String value) {
        this.ordInptDev = value;
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
     * Gets the value of the transBkdTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransBkdTm() {
        return transBkdTm;
    }

    /**
     * Sets the value of the transBkdTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransBkdTm(XMLGregorianCalendar value) {
        this.transBkdTm = value;
    }

    /**
     * Gets the value of the origOrdModTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrigOrdModTm() {
        return origOrdModTm;
    }

    /**
     * Sets the value of the origOrdModTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrigOrdModTm(XMLGregorianCalendar value) {
        this.origOrdModTm = value;
    }

}
