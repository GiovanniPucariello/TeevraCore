
package org.fixprotocol.fixml_5_0_sp2;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RiskWarningLevels_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RiskWarningLevels_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}RiskWarningLevelsElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}RiskWarningLevelsAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RiskWarningLevels_Block_t")
public class RiskWarningLevelsBlockT {

    @XmlAttribute(name = "Pct")
    protected BigDecimal pct;
    @XmlAttribute(name = "Nme")
    protected String nme;

    /**
     * Gets the value of the pct property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPct() {
        return pct;
    }

    /**
     * Sets the value of the pct property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPct(BigDecimal value) {
        this.pct = value;
    }

    /**
     * Gets the value of the nme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNme() {
        return nme;
    }

    /**
     * Sets the value of the nme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNme(String value) {
        this.nme = value;
    }

}
