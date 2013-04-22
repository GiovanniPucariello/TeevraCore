
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
 * DontKnowTradeDK can be found in Volume4 of the specification 
 * 
 * <p>Java class for DontKnowTradeDK_message_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DontKnowTradeDK_message_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixprotocol.org/FIXML-5-0-SP2}Abstract_message_t">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}DontKnowTradeDKElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}DontKnowTradeDKAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DontKnowTradeDK_message_t", propOrder = {
    "instrmt",
    "undly",
    "leg",
    "ordQty"
})
public class DontKnowTradeDKMessageT
    extends AbstractMessageT
{

    @XmlElement(name = "Instrmt", required = true)
    protected InstrumentBlockT instrmt;
    @XmlElement(name = "Undly")
    protected List<UndInstrmtGrpBlockT> undly;
    @XmlElement(name = "Leg")
    protected List<InstrmtLegGrpBlockT> leg;
    @XmlElement(name = "OrdQty", required = true)
    protected OrderQtyDataBlockT ordQty;
    @XmlAttribute(name = "OrdID")
    protected String ordID;
    @XmlAttribute(name = "OrdID2")
    protected String ordID2;
    @XmlAttribute(name = "ExecID")
    protected String execID;
    @XmlAttribute(name = "DkRsn")
    protected DKReasonEnumT dkRsn;
    @XmlAttribute(name = "Side")
    protected String side;
    @XmlAttribute(name = "LastQty")
    protected BigDecimal lastQty;
    @XmlAttribute(name = "LastPx")
    protected BigDecimal lastPx;
    @XmlAttribute(name = "Txt")
    protected String txt;
    @XmlAttribute(name = "EncTxtLen")
    protected BigInteger encTxtLen;
    @XmlAttribute(name = "EncTxt")
    protected String encTxt;

    /**
     * Gets the value of the instrmt property.
     * 
     * @return
     *     possible object is
     *     {@link InstrumentBlockT }
     *     
     */
    public InstrumentBlockT getInstrmt() {
        return instrmt;
    }

    /**
     * Sets the value of the instrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstrumentBlockT }
     *     
     */
    public void setInstrmt(InstrumentBlockT value) {
        this.instrmt = value;
    }

    /**
     * Gets the value of the undly property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the undly property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUndly().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UndInstrmtGrpBlockT }
     * 
     * 
     */
    public List<UndInstrmtGrpBlockT> getUndly() {
        if (undly == null) {
            undly = new ArrayList<UndInstrmtGrpBlockT>();
        }
        return this.undly;
    }

    /**
     * Gets the value of the leg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the leg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLeg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstrmtLegGrpBlockT }
     * 
     * 
     */
    public List<InstrmtLegGrpBlockT> getLeg() {
        if (leg == null) {
            leg = new ArrayList<InstrmtLegGrpBlockT>();
        }
        return this.leg;
    }

    /**
     * Gets the value of the ordQty property.
     * 
     * @return
     *     possible object is
     *     {@link OrderQtyDataBlockT }
     *     
     */
    public OrderQtyDataBlockT getOrdQty() {
        return ordQty;
    }

    /**
     * Sets the value of the ordQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderQtyDataBlockT }
     *     
     */
    public void setOrdQty(OrderQtyDataBlockT value) {
        this.ordQty = value;
    }

    /**
     * Gets the value of the ordID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdID() {
        return ordID;
    }

    /**
     * Sets the value of the ordID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdID(String value) {
        this.ordID = value;
    }

    /**
     * Gets the value of the ordID2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdID2() {
        return ordID2;
    }

    /**
     * Sets the value of the ordID2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdID2(String value) {
        this.ordID2 = value;
    }

    /**
     * Gets the value of the execID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecID() {
        return execID;
    }

    /**
     * Sets the value of the execID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecID(String value) {
        this.execID = value;
    }

    /**
     * Gets the value of the dkRsn property.
     * 
     * @return
     *     possible object is
     *     {@link DKReasonEnumT }
     *     
     */
    public DKReasonEnumT getDkRsn() {
        return dkRsn;
    }

    /**
     * Sets the value of the dkRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DKReasonEnumT }
     *     
     */
    public void setDkRsn(DKReasonEnumT value) {
        this.dkRsn = value;
    }

    /**
     * Gets the value of the side property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSide() {
        return side;
    }

    /**
     * Sets the value of the side property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSide(String value) {
        this.side = value;
    }

    /**
     * Gets the value of the lastQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLastQty() {
        return lastQty;
    }

    /**
     * Sets the value of the lastQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLastQty(BigDecimal value) {
        this.lastQty = value;
    }

    /**
     * Gets the value of the lastPx property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLastPx() {
        return lastPx;
    }

    /**
     * Sets the value of the lastPx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLastPx(BigDecimal value) {
        this.lastPx = value;
    }

    /**
     * Gets the value of the txt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxt() {
        return txt;
    }

    /**
     * Sets the value of the txt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxt(String value) {
        this.txt = value;
    }

    /**
     * Gets the value of the encTxtLen property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEncTxtLen() {
        return encTxtLen;
    }

    /**
     * Sets the value of the encTxtLen property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEncTxtLen(BigInteger value) {
        this.encTxtLen = value;
    }

    /**
     * Gets the value of the encTxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncTxt() {
        return encTxt;
    }

    /**
     * Sets the value of the encTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncTxt(String value) {
        this.encTxt = value;
    }

}