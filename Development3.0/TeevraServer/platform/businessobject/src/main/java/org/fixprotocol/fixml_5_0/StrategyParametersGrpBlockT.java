//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.06.08 at 01:47:27 PM IST 
//


package org.fixprotocol.fixml_5_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * StrategyParametersGrp is a component
 * 
 * <p>Java class for StrategyParametersGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StrategyParametersGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0}StrategyParametersGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0}StrategyParametersGrpAttributes"/>
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
    protected Integer strtPrmTyp;
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
     *     {@link Integer }
     *     
     */
    public Integer getStrtPrmTyp() {
        return strtPrmTyp;
    }

    /**
     * Sets the value of the strtPrmTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStrtPrmTyp(Integer value) {
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