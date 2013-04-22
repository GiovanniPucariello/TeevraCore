
package org.fixprotocol.fixml_5_0_sp2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Reference_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Reference_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Ref" type="{http://www.fixprotocol.org/FIXML-5-0-SP2}GenericString_hs" />
 *       &lt;attribute name="RefTyp" type="{http://www.fixprotocol.org/FIXML-5-0-SP2}GenericString_hs" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reference_Block_t")
public class ReferenceBlockT {

    @XmlAttribute(name = "Ref")
    protected String ref;
    @XmlAttribute(name = "RefTyp")
    protected String refTyp;

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRef(String value) {
        this.ref = value;
    }

    /**
     * Gets the value of the refTyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefTyp() {
        return refTyp;
    }

    /**
     * Sets the value of the refTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefTyp(String value) {
        this.refTyp = value;
    }

}
