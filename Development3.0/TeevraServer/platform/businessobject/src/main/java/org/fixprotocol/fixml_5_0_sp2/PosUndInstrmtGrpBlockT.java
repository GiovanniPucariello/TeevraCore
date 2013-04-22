
package org.fixprotocol.fixml_5_0_sp2;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PosUndInstrmtGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PosUndInstrmtGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}PosUndInstrmtGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}PosUndInstrmtGrpAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PosUndInstrmtGrp_Block_t", propOrder = {
    "undly",
    "undDlvAmt"
})
public class PosUndInstrmtGrpBlockT {

    @XmlElement(name = "Undly")
    protected UnderlyingInstrumentBlockT undly;
    @XmlElement(name = "UndDlvAmt")
    protected List<UnderlyingAmountBlockT> undDlvAmt;
    @XmlAttribute(name = "UndSetPx")
    protected BigDecimal undSetPx;
    @XmlAttribute(name = "UndSetPxTyp")
    protected BigInteger undSetPxTyp;
    @XmlAttribute(name = "UndlyDlvAmt")
    protected BigDecimal undlyDlvAmt;

    /**
     * Gets the value of the undly property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingInstrumentBlockT }
     *     
     */
    public UnderlyingInstrumentBlockT getUndly() {
        return undly;
    }

    /**
     * Sets the value of the undly property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingInstrumentBlockT }
     *     
     */
    public void setUndly(UnderlyingInstrumentBlockT value) {
        this.undly = value;
    }

    /**
     * Gets the value of the undDlvAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the undDlvAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUndDlvAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnderlyingAmountBlockT }
     * 
     * 
     */
    public List<UnderlyingAmountBlockT> getUndDlvAmt() {
        if (undDlvAmt == null) {
            undDlvAmt = new ArrayList<UnderlyingAmountBlockT>();
        }
        return this.undDlvAmt;
    }

    /**
     * Gets the value of the undSetPx property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUndSetPx() {
        return undSetPx;
    }

    /**
     * Sets the value of the undSetPx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUndSetPx(BigDecimal value) {
        this.undSetPx = value;
    }

    /**
     * Gets the value of the undSetPxTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUndSetPxTyp() {
        return undSetPxTyp;
    }

    /**
     * Sets the value of the undSetPxTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUndSetPxTyp(BigInteger value) {
        this.undSetPxTyp = value;
    }

    /**
     * Gets the value of the undlyDlvAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUndlyDlvAmt() {
        return undlyDlvAmt;
    }

    /**
     * Sets the value of the undlyDlvAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUndlyDlvAmt(BigDecimal value) {
        this.undlyDlvAmt = value;
    }

}
