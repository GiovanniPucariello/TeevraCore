
package com.headstrong.teevra_fixml_1_0;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CpctyConfGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CpctyConfGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}CpctyConfGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}CpctyConfGrpAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CpctyConfGrp_Block_t")
public class CpctyConfGrpBlockT {

    @XmlAttribute(name = "Cpcty")
    protected OrderCapacityEnumT cpcty;
    @XmlAttribute(name = "Rstctions")
    protected String rstctions;
    @XmlAttribute(name = "CpctyQty")
    protected BigDecimal cpctyQty;

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
     * Gets the value of the cpctyQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCpctyQty() {
        return cpctyQty;
    }

    /**
     * Sets the value of the cpctyQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCpctyQty(BigDecimal value) {
        this.cpctyQty = value;
    }

}
