
package com.headstrong.teevra_fixml_1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyRelationships_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyRelationships_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}PartyRelationshipsElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}PartyRelationshipsAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyRelationships_Block_t")
public class PartyRelationshipsBlockT {

    @XmlAttribute(name = "Rltnshp")
    protected String rltnshp;

    /**
     * Gets the value of the rltnshp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRltnshp() {
        return rltnshp;
    }

    /**
     * Sets the value of the rltnshp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRltnshp(String value) {
        this.rltnshp = value;
    }

}
