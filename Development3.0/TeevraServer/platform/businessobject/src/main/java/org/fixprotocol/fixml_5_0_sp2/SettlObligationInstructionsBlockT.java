
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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SettlObligationInstructions_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SettlObligationInstructions_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}SettlObligationInstructionsElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}SettlObligationInstructionsAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlObligationInstructions_Block_t", propOrder = {
    "instrmt",
    "pty",
    "settlDetails"
})
public class SettlObligationInstructionsBlockT {

    @XmlElement(name = "Instrmt")
    protected InstrumentBlockT instrmt;
    @XmlElement(name = "Pty")
    protected List<PartiesBlockT> pty;
    @XmlElement(name = "SettlDetails")
    protected List<SettlDetailsBlockT> settlDetails;
    @XmlAttribute(name = "NetGrossInd")
    protected BigInteger netGrossInd;
    @XmlAttribute(name = "SettlID")
    protected String settlID;
    @XmlAttribute(name = "SettlTransTyp")
    protected SettlObligTransTypeEnumT settlTransTyp;
    @XmlAttribute(name = "SettlRefID")
    protected String settlRefID;
    @XmlAttribute(name = "CcyAmt")
    protected BigDecimal ccyAmt;
    @XmlAttribute(name = "SettlCurrAmt")
    protected BigDecimal settlCurrAmt;
    @XmlAttribute(name = "Ccy")
    protected String ccy;
    @XmlAttribute(name = "SettlCcy")
    protected String settlCcy;
    @XmlAttribute(name = "SettlCurrFxRt")
    protected BigDecimal settlCurrFxRt;
    @XmlAttribute(name = "SettlDt")
    protected XMLGregorianCalendar settlDt;
    @XmlAttribute(name = "EfctvTm")
    protected XMLGregorianCalendar efctvTm;
    @XmlAttribute(name = "ExpireTm")
    protected XMLGregorianCalendar expireTm;
    @XmlAttribute(name = "LastUpdateTm")
    protected String lastUpdateTm;

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
     * Gets the value of the pty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartiesBlockT }
     * 
     * 
     */
    public List<PartiesBlockT> getPty() {
        if (pty == null) {
            pty = new ArrayList<PartiesBlockT>();
        }
        return this.pty;
    }

    /**
     * Gets the value of the settlDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the settlDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSettlDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SettlDetailsBlockT }
     * 
     * 
     */
    public List<SettlDetailsBlockT> getSettlDetails() {
        if (settlDetails == null) {
            settlDetails = new ArrayList<SettlDetailsBlockT>();
        }
        return this.settlDetails;
    }

    /**
     * Gets the value of the netGrossInd property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNetGrossInd() {
        return netGrossInd;
    }

    /**
     * Sets the value of the netGrossInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNetGrossInd(BigInteger value) {
        this.netGrossInd = value;
    }

    /**
     * Gets the value of the settlID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlID() {
        return settlID;
    }

    /**
     * Sets the value of the settlID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlID(String value) {
        this.settlID = value;
    }

    /**
     * Gets the value of the settlTransTyp property.
     * 
     * @return
     *     possible object is
     *     {@link SettlObligTransTypeEnumT }
     *     
     */
    public SettlObligTransTypeEnumT getSettlTransTyp() {
        return settlTransTyp;
    }

    /**
     * Sets the value of the settlTransTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlObligTransTypeEnumT }
     *     
     */
    public void setSettlTransTyp(SettlObligTransTypeEnumT value) {
        this.settlTransTyp = value;
    }

    /**
     * Gets the value of the settlRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlRefID() {
        return settlRefID;
    }

    /**
     * Sets the value of the settlRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlRefID(String value) {
        this.settlRefID = value;
    }

    /**
     * Gets the value of the ccyAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCcyAmt() {
        return ccyAmt;
    }

    /**
     * Sets the value of the ccyAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCcyAmt(BigDecimal value) {
        this.ccyAmt = value;
    }

    /**
     * Gets the value of the settlCurrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSettlCurrAmt() {
        return settlCurrAmt;
    }

    /**
     * Sets the value of the settlCurrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSettlCurrAmt(BigDecimal value) {
        this.settlCurrAmt = value;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcy(String value) {
        this.ccy = value;
    }

    /**
     * Gets the value of the settlCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlCcy() {
        return settlCcy;
    }

    /**
     * Sets the value of the settlCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlCcy(String value) {
        this.settlCcy = value;
    }

    /**
     * Gets the value of the settlCurrFxRt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSettlCurrFxRt() {
        return settlCurrFxRt;
    }

    /**
     * Sets the value of the settlCurrFxRt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSettlCurrFxRt(BigDecimal value) {
        this.settlCurrFxRt = value;
    }

    /**
     * Gets the value of the settlDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSettlDt() {
        return settlDt;
    }

    /**
     * Sets the value of the settlDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSettlDt(XMLGregorianCalendar value) {
        this.settlDt = value;
    }

    /**
     * Gets the value of the efctvTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEfctvTm() {
        return efctvTm;
    }

    /**
     * Sets the value of the efctvTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEfctvTm(XMLGregorianCalendar value) {
        this.efctvTm = value;
    }

    /**
     * Gets the value of the expireTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpireTm() {
        return expireTm;
    }

    /**
     * Sets the value of the expireTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpireTm(XMLGregorianCalendar value) {
        this.expireTm = value;
    }

    /**
     * Gets the value of the lastUpdateTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdateTm() {
        return lastUpdateTm;
    }

    /**
     * Sets the value of the lastUpdateTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdateTm(String value) {
        this.lastUpdateTm = value;
    }

}
