
package com.headstrong.teevra_fixml_1_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Hop_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Hop_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ID" type="{http://www.headstrong.com/TEEVRA-FIXML-1-0}HopCompID_t" />
 *       &lt;attribute name="Ref" type="{http://www.headstrong.com/TEEVRA-FIXML-1-0}HopRefID_t" />
 *       &lt;attribute name="Snt" type="{http://www.headstrong.com/TEEVRA-FIXML-1-0}HopSendingTime_t" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Hop_t")
public class HopT {

    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Ref")
    protected BigInteger ref;
    @XmlAttribute(name = "Snt")
    protected XMLGregorianCalendar snt;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRef(BigInteger value) {
        this.ref = value;
    }

    /**
     * Gets the value of the snt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSnt() {
        return snt;
    }

    /**
     * Sets the value of the snt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSnt(XMLGregorianCalendar value) {
        this.snt = value;
    }

}
