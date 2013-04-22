
package com.headstrong.teevra_fixml_1_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MaturityRules_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaturityRules_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}MaturityRulesElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}MaturityRulesAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaturityRules_Block_t")
public class MaturityRulesBlockT {

    @XmlAttribute(name = "MatRuleID")
    protected String matRuleID;
    @XmlAttribute(name = "MMYFmt")
    protected BigInteger mmyFmt;
    @XmlAttribute(name = "MMYIncrUnits")
    protected BigInteger mmyIncrUnits;
    @XmlAttribute(name = "StartMMY")
    protected String startMMY;
    @XmlAttribute(name = "EndMMY")
    protected String endMMY;
    @XmlAttribute(name = "MMYIncr")
    protected BigInteger mmyIncr;

    /**
     * Gets the value of the matRuleID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatRuleID() {
        return matRuleID;
    }

    /**
     * Sets the value of the matRuleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatRuleID(String value) {
        this.matRuleID = value;
    }

    /**
     * Gets the value of the mmyFmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMMYFmt() {
        return mmyFmt;
    }

    /**
     * Sets the value of the mmyFmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMMYFmt(BigInteger value) {
        this.mmyFmt = value;
    }

    /**
     * Gets the value of the mmyIncrUnits property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMMYIncrUnits() {
        return mmyIncrUnits;
    }

    /**
     * Sets the value of the mmyIncrUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMMYIncrUnits(BigInteger value) {
        this.mmyIncrUnits = value;
    }

    /**
     * Gets the value of the startMMY property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartMMY() {
        return startMMY;
    }

    /**
     * Sets the value of the startMMY property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartMMY(String value) {
        this.startMMY = value;
    }

    /**
     * Gets the value of the endMMY property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndMMY() {
        return endMMY;
    }

    /**
     * Sets the value of the endMMY property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndMMY(String value) {
        this.endMMY = value;
    }

    /**
     * Gets the value of the mmyIncr property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMMYIncr() {
        return mmyIncr;
    }

    /**
     * Sets the value of the mmyIncr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMMYIncr(BigInteger value) {
        this.mmyIncr = value;
    }

}