
package org.fixprotocol.fixml_5_0_sp2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Cut_Off_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Cut_Off_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Typ" type="{http://www.fixprotocol.org/FIXML-5-0-SP2}GenericString_hs" />
 *       &lt;attribute name="Time" type="{http://www.fixprotocol.org/FIXML-5-0-SP2}GenericDateTime_hs" />
 *       &lt;attribute name="Indctr" type="{http://www.fixprotocol.org/FIXML-5-0-SP2}GenericString_hs" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cut_Off_t")
public class CutOffT {

    @XmlAttribute(name = "Typ")
    protected String typ;
    @XmlAttribute(name = "Time")
    protected XMLGregorianCalendar time;
    @XmlAttribute(name = "Indctr")
    protected String indctr;

    /**
     * Gets the value of the typ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTyp() {
        return typ;
    }

    /**
     * Sets the value of the typ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTyp(String value) {
        this.typ = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTime(XMLGregorianCalendar value) {
        this.time = value;
    }

    /**
     * Gets the value of the indctr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndctr() {
        return indctr;
    }

    /**
     * Sets the value of the indctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndctr(String value) {
        this.indctr = value;
    }

}
