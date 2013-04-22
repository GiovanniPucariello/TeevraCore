
package org.fixprotocol.fixml_5_0_sp2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeCapLegUnderlyingsGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeCapLegUnderlyingsGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}TradeCapLegUnderlyingsGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}TradeCapLegUnderlyingsGrpAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeCapLegUnderlyingsGrp_Block_t", propOrder = {
    "instrmt"
})
public class TradeCapLegUnderlyingsGrpBlockT {

    @XmlElement(name = "Instrmt")
    protected UnderlyingLegInstrumentBlockT instrmt;

    /**
     * Gets the value of the instrmt property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingLegInstrumentBlockT }
     *     
     */
    public UnderlyingLegInstrumentBlockT getInstrmt() {
        return instrmt;
    }

    /**
     * Sets the value of the instrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingLegInstrumentBlockT }
     *     
     */
    public void setInstrmt(UnderlyingLegInstrumentBlockT value) {
        this.instrmt = value;
    }

}
