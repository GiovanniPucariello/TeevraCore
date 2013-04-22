//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.06.08 at 01:47:27 PM IST 
//


package org.fixprotocol.fixml_5_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * QuotSetGrp is a component
 * 
 * <p>Java class for QuotSetGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuotSetGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0}QuotSetGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0}QuotSetGrpAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuotSetGrp_Block_t", propOrder = {
    "undly",
    "quotEntry"
})
public class QuotSetGrpBlockT {

    @XmlElement(name = "Undly")
    protected List<UnderlyingInstrumentBlockT> undly;
    @XmlElement(name = "QuotEntry", required = true)
    protected List<QuotEntryGrpBlockT> quotEntry;
    @XmlAttribute(name = "SetID", required = true)
    protected String setID;
    @XmlAttribute(name = "ValidTil")
    protected XMLGregorianCalendar validTil;
    @XmlAttribute(name = "TotNoQuotEntries", required = true)
    protected int totNoQuotEntries;
    @XmlAttribute(name = "LastFragment")
    protected LastFragmentEnumT lastFragment;

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
     * {@link UnderlyingInstrumentBlockT }
     * 
     * 
     */
    public List<UnderlyingInstrumentBlockT> getUndly() {
        if (undly == null) {
            undly = new ArrayList<UnderlyingInstrumentBlockT>();
        }
        return this.undly;
    }

    /**
     * Gets the value of the quotEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quotEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuotEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuotEntryGrpBlockT }
     * 
     * 
     */
    public List<QuotEntryGrpBlockT> getQuotEntry() {
        if (quotEntry == null) {
            quotEntry = new ArrayList<QuotEntryGrpBlockT>();
        }
        return this.quotEntry;
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
     */
    public int getTotNoQuotEntries() {
        return totNoQuotEntries;
    }

    /**
     * Sets the value of the totNoQuotEntries property.
     * 
     */
    public void setTotNoQuotEntries(int value) {
        this.totNoQuotEntries = value;
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