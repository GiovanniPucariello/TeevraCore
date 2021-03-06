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
 * LegStipulations is a component
 * 
 * <p>Java class for LegStipulations_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LegStipulations_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0}LegStipulationsElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0}LegStipulationsAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegStipulations_Block_t")
public class LegStipulationsBlockT {

    @XmlAttribute(name = "StipTyp")
    protected StipulationTypeEnumT stipTyp;
    @XmlAttribute(name = "StipVal")
    protected String stipVal;

    /**
     * Gets the value of the stipTyp property.
     * 
     * @return
     *     possible object is
     *     {@link StipulationTypeEnumT }
     *     
     */
    public StipulationTypeEnumT getStipTyp() {
        return stipTyp;
    }

    /**
     * Sets the value of the stipTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link StipulationTypeEnumT }
     *     
     */
    public void setStipTyp(StipulationTypeEnumT value) {
        this.stipTyp = value;
    }

    /**
     * Gets the value of the stipVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStipVal() {
        return stipVal;
    }

    /**
     * Sets the value of the stipVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStipVal(String value) {
        this.stipVal = value;
    }

}
