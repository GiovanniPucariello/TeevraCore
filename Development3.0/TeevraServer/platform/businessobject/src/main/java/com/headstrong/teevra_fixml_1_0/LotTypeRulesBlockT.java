
package com.headstrong.teevra_fixml_1_0;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LotTypeRules_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LotTypeRules_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}LotTypeRulesElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}LotTypeRulesAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LotTypeRules_Block_t")
public class LotTypeRulesBlockT {

    @XmlAttribute(name = "LotTyp")
    protected String lotTyp;
    @XmlAttribute(name = "MinLotSz")
    protected BigDecimal minLotSz;

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
     * Gets the value of the minLotSz property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinLotSz() {
        return minLotSz;
    }

    /**
     * Sets the value of the minLotSz property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinLotSz(BigDecimal value) {
        this.minLotSz = value;
    }

}
