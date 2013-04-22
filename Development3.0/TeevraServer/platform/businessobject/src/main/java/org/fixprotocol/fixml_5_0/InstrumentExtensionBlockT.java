//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.06.08 at 01:47:27 PM IST 
//


package org.fixprotocol.fixml_5_0;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * InstrumentExtension is a component
 * 
 * <p>Java class for InstrumentExtension_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstrumentExtension_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0}InstrumentExtensionElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0}InstrumentExtensionAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstrumentExtension_Block_t", propOrder = {
    "attrb"
})
public class InstrumentExtensionBlockT {

    @XmlElement(name = "Attrb")
    protected AttrbGrpBlockT attrb;
    @XmlAttribute(name = "DlvryForm")
    protected Integer dlvryForm;
    @XmlAttribute(name = "PctAtRisk")
    protected BigDecimal pctAtRisk;

    /**
     * Gets the value of the attrb property.
     * 
     * @return
     *     possible object is
     *     {@link AttrbGrpBlockT }
     *     
     */
    public AttrbGrpBlockT getAttrb() {
        return attrb;
    }

    /**
     * Sets the value of the attrb property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttrbGrpBlockT }
     *     
     */
    public void setAttrb(AttrbGrpBlockT value) {
        this.attrb = value;
    }

    /**
     * Gets the value of the dlvryForm property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDlvryForm() {
        return dlvryForm;
    }

    /**
     * Sets the value of the dlvryForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDlvryForm(Integer value) {
        this.dlvryForm = value;
    }

    /**
     * Gets the value of the pctAtRisk property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPctAtRisk() {
        return pctAtRisk;
    }

    /**
     * Sets the value of the pctAtRisk property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPctAtRisk(BigDecimal value) {
        this.pctAtRisk = value;
    }

}