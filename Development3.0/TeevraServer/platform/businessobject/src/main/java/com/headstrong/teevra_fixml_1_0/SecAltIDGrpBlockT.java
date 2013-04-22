
package com.headstrong.teevra_fixml_1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecAltIDGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecAltIDGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}SecAltIDGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}SecAltIDGrpAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecAltIDGrp_Block_t")
public class SecAltIDGrpBlockT {

    @XmlAttribute(name = "AltID")
    protected String altID;
    @XmlAttribute(name = "AltIDSrc")
    protected String altIDSrc;

    /**
     * Gets the value of the altID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltID() {
        return altID;
    }

    /**
     * Sets the value of the altID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltID(String value) {
        this.altID = value;
    }

    /**
     * Gets the value of the altIDSrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltIDSrc() {
        return altIDSrc;
    }

    /**
     * Sets the value of the altIDSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltIDSrc(String value) {
        this.altIDSrc = value;
    }

}
