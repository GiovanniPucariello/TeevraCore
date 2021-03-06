
package org.fixprotocol.fixml_5_0_sp2;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceLimits_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceLimits_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}PriceLimitsElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}PriceLimitsAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceLimits_Block_t")
public class PriceLimitsBlockT {

    @XmlAttribute(name = "PxLmtTyp")
    protected BigInteger pxLmtTyp;
    @XmlAttribute(name = "LowLmtPx")
    protected BigDecimal lowLmtPx;
    @XmlAttribute(name = "HiLmtPx")
    protected BigDecimal hiLmtPx;
    @XmlAttribute(name = "TrdgRefPx")
    protected BigDecimal trdgRefPx;

    /**
     * Gets the value of the pxLmtTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPxLmtTyp() {
        return pxLmtTyp;
    }

    /**
     * Sets the value of the pxLmtTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPxLmtTyp(BigInteger value) {
        this.pxLmtTyp = value;
    }

    /**
     * Gets the value of the lowLmtPx property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLowLmtPx() {
        return lowLmtPx;
    }

    /**
     * Sets the value of the lowLmtPx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLowLmtPx(BigDecimal value) {
        this.lowLmtPx = value;
    }

    /**
     * Gets the value of the hiLmtPx property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHiLmtPx() {
        return hiLmtPx;
    }

    /**
     * Sets the value of the hiLmtPx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHiLmtPx(BigDecimal value) {
        this.hiLmtPx = value;
    }

    /**
     * Gets the value of the trdgRefPx property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTrdgRefPx() {
        return trdgRefPx;
    }

    /**
     * Sets the value of the trdgRefPx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTrdgRefPx(BigDecimal value) {
        this.trdgRefPx = value;
    }

}
