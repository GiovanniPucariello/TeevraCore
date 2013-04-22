
package org.fixprotocol.fixml_5_0_sp2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IOIQualGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IOIQualGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}IOIQualGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}IOIQualGrpAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IOIQualGrp_Block_t")
public class IOIQualGrpBlockT {

    @XmlAttribute(name = "Qual")
    protected IOIQualifierEnumT qual;

    /**
     * Gets the value of the qual property.
     * 
     * @return
     *     possible object is
     *     {@link IOIQualifierEnumT }
     *     
     */
    public IOIQualifierEnumT getQual() {
        return qual;
    }

    /**
     * Sets the value of the qual property.
     * 
     * @param value
     *     allowed object is
     *     {@link IOIQualifierEnumT }
     *     
     */
    public void setQual(IOIQualifierEnumT value) {
        this.qual = value;
    }

}
