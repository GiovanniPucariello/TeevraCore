
package com.headstrong.teevra_fixml_1_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StrategyParametersGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StrategyParametersGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}StrategyParametersGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}StrategyParametersGrpAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StrategyParametersGrp_Block_t")
public class StrategyParametersGrpBlockT {

    @XmlAttribute(name = "StrtPrmNme")
    protected String strtPrmNme;
    @XmlAttribute(name = "StrtPrmTyp")
    protected BigInteger strtPrmTyp;
    @XmlAttribute(name = "StrtPrmVal")
    protected String strtPrmVal;

    /**
     * Gets the value of the strtPrmNme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrtPrmNme() {
        return strtPrmNme;
    }

    /**
     * Sets the value of the strtPrmNme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrtPrmNme(String value) {
        this.strtPrmNme = value;
    }

    /**
     * Gets the value of the strtPrmTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStrtPrmTyp() {
        return strtPrmTyp;
    }

    /**
     * Sets the value of the strtPrmTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStrtPrmTyp(BigInteger value) {
        this.strtPrmTyp = value;
    }

    /**
     * Gets the value of the strtPrmVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrtPrmVal() {
        return strtPrmVal;
    }

    /**
     * Sets the value of the strtPrmVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrtPrmVal(String value) {
        this.strtPrmVal = value;
    }

}
