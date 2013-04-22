
package com.headstrong.teevra_fixml_1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MatchRules_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MatchRules_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}MatchRulesElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}MatchRulesAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatchRules_Block_t")
public class MatchRulesBlockT {

    @XmlAttribute(name = "MtchAlgo")
    protected String mtchAlgo;
    @XmlAttribute(name = "MtchTyp")
    protected String mtchTyp;

    /**
     * Gets the value of the mtchAlgo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMtchAlgo() {
        return mtchAlgo;
    }

    /**
     * Sets the value of the mtchAlgo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMtchAlgo(String value) {
        this.mtchAlgo = value;
    }

    /**
     * Gets the value of the mtchTyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMtchTyp() {
        return mtchTyp;
    }

    /**
     * Sets the value of the mtchTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMtchTyp(String value) {
        this.mtchTyp = value;
    }

}
