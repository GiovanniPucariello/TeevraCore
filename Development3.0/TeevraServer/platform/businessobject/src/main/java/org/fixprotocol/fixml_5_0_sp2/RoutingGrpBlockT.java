
package org.fixprotocol.fixml_5_0_sp2;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoutingGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoutingGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}RoutingGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}RoutingGrpAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoutingGrp_Block_t")
public class RoutingGrpBlockT {

    @XmlAttribute(name = "RtgTyp")
    protected BigInteger rtgTyp;
    @XmlAttribute(name = "RtgID")
    protected String rtgID;

    /**
     * Gets the value of the rtgTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRtgTyp() {
        return rtgTyp;
    }

    /**
     * Sets the value of the rtgTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRtgTyp(BigInteger value) {
        this.rtgTyp = value;
    }

    /**
     * Gets the value of the rtgID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRtgID() {
        return rtgID;
    }

    /**
     * Sets the value of the rtgID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRtgID(String value) {
        this.rtgID = value;
    }

}
