
package com.headstrong.teevra_fixml_1_0;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExecAllocGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExecAllocGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}ExecAllocGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}ExecAllocGrpAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExecAllocGrp_Block_t")
public class ExecAllocGrpBlockT {

    @XmlAttribute(name = "LastQty")
    protected BigDecimal lastQty;
    @XmlAttribute(name = "ExecID")
    protected String execID;
    @XmlAttribute(name = "ExecID2")
    protected String execID2;
    @XmlAttribute(name = "LastPx")
    protected BigDecimal lastPx;
    @XmlAttribute(name = "LastParPx")
    protected BigDecimal lastParPx;
    @XmlAttribute(name = "LastCpcty")
    protected String lastCpcty;
    @XmlAttribute(name = "TrdID")
    protected String trdID;
    @XmlAttribute(name = "FirmTrdID")
    protected String firmTrdID;

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
     * Gets the value of the lastCpcty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastCpcty() {
        return lastCpcty;
    }

    /**
     * Sets the value of the lastCpcty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastCpcty(String value) {
        this.lastCpcty = value;
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

}
