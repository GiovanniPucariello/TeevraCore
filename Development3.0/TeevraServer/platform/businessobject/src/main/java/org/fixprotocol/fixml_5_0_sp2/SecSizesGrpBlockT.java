
package org.fixprotocol.fixml_5_0_sp2;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecSizesGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecSizesGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}SecSizesGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}SecSizesGrpAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecSizesGrp_Block_t")
public class SecSizesGrpBlockT {

    @XmlAttribute(name = "MDSecSizeType")
    protected String mdSecSizeType;
    @XmlAttribute(name = "MDSecSize")
    protected BigDecimal mdSecSize;

    /**
     * Gets the value of the mdSecSizeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMDSecSizeType() {
        return mdSecSizeType;
    }

    /**
     * Sets the value of the mdSecSizeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMDSecSizeType(String value) {
        this.mdSecSizeType = value;
    }

    /**
     * Gets the value of the mdSecSize property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMDSecSize() {
        return mdSecSize;
    }

    /**
     * Sets the value of the mdSecSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMDSecSize(BigDecimal value) {
        this.mdSecSize = value;
    }

}
