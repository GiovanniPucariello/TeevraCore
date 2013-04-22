
package org.fixprotocol.fixml_5_0_sp2;

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
 * <p>Java class for QuotSetAckGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuotSetAckGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}QuotSetAckGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}QuotSetAckGrpAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuotSetAckGrp_Block_t", propOrder = {
    "undly",
    "quotEntryAck"
})
public class QuotSetAckGrpBlockT {

    @XmlElement(name = "Undly")
    protected UnderlyingInstrumentBlockT undly;
    @XmlElement(name = "QuotEntryAck")
    protected List<QuotEntryAckGrpBlockT> quotEntryAck;
    @XmlAttribute(name = "SetID")
    protected String setID;
    @XmlAttribute(name = "ValidTil")
    protected XMLGregorianCalendar validTil;
    @XmlAttribute(name = "TotNoQuotEntries")
    protected BigInteger totNoQuotEntries;
    @XmlAttribute(name = "TotNoCxldQts")
    protected BigInteger totNoCxldQts;
    @XmlAttribute(name = "TotNoAccQts")
    protected BigInteger totNoAccQts;
    @XmlAttribute(name = "TotNoRejQts")
    protected BigInteger totNoRejQts;
    @XmlAttribute(name = "LastFragment")
    protected LastFragmentEnumT lastFragment;

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
     * Gets the value of the quotEntryAck property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quotEntryAck property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuotEntryAck().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuotEntryAckGrpBlockT }
     * 
     * 
     */
    public List<QuotEntryAckGrpBlockT> getQuotEntryAck() {
        if (quotEntryAck == null) {
            quotEntryAck = new ArrayList<QuotEntryAckGrpBlockT>();
        }
        return this.quotEntryAck;
    }

    /**
     * Gets the value of the setID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSetID() {
        return setID;
    }

    /**
     * Sets the value of the setID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSetID(String value) {
        this.setID = value;
    }

    /**
     * Gets the value of the validTil property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidTil() {
        return validTil;
    }

    /**
     * Sets the value of the validTil property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidTil(XMLGregorianCalendar value) {
        this.validTil = value;
    }

    /**
     * Gets the value of the totNoQuotEntries property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotNoQuotEntries() {
        return totNoQuotEntries;
    }

    /**
     * Sets the value of the totNoQuotEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotNoQuotEntries(BigInteger value) {
        this.totNoQuotEntries = value;
    }

    /**
     * Gets the value of the totNoCxldQts property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotNoCxldQts() {
        return totNoCxldQts;
    }

    /**
     * Sets the value of the totNoCxldQts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotNoCxldQts(BigInteger value) {
        this.totNoCxldQts = value;
    }

    /**
     * Gets the value of the totNoAccQts property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotNoAccQts() {
        return totNoAccQts;
    }

    /**
     * Sets the value of the totNoAccQts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotNoAccQts(BigInteger value) {
        this.totNoAccQts = value;
    }

    /**
     * Gets the value of the totNoRejQts property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotNoRejQts() {
        return totNoRejQts;
    }

    /**
     * Sets the value of the totNoRejQts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotNoRejQts(BigInteger value) {
        this.totNoRejQts = value;
    }

    /**
     * Gets the value of the lastFragment property.
     * 
     * @return
     *     possible object is
     *     {@link LastFragmentEnumT }
     *     
     */
    public LastFragmentEnumT getLastFragment() {
        return lastFragment;
    }

    /**
     * Sets the value of the lastFragment property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastFragmentEnumT }
     *     
     */
    public void setLastFragment(LastFragmentEnumT value) {
        this.lastFragment = value;
    }

}
