
package org.fixprotocol.fixml_5_0_sp2;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FinancingDetails_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancingDetails_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}FinancingDetailsElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}FinancingDetailsAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancingDetails_Block_t")
public class FinancingDetailsBlockT {

    @XmlAttribute(name = "AgmtDesc")
    protected String agmtDesc;
    @XmlAttribute(name = "AgmtID")
    protected String agmtID;
    @XmlAttribute(name = "AgmtDt")
    protected XMLGregorianCalendar agmtDt;
    @XmlAttribute(name = "AgmtCcy")
    protected String agmtCcy;
    @XmlAttribute(name = "TrmTyp")
    protected BigInteger trmTyp;
    @XmlAttribute(name = "StartDt")
    protected XMLGregorianCalendar startDt;
    @XmlAttribute(name = "EndDt")
    protected XMLGregorianCalendar endDt;
    @XmlAttribute(name = "DlvryTyp")
    protected BigInteger dlvryTyp;
    @XmlAttribute(name = "MgnRatio")
    protected BigDecimal mgnRatio;

    /**
     * Gets the value of the agmtDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgmtDesc() {
        return agmtDesc;
    }

    /**
     * Sets the value of the agmtDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgmtDesc(String value) {
        this.agmtDesc = value;
    }

    /**
     * Gets the value of the agmtID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgmtID() {
        return agmtID;
    }

    /**
     * Sets the value of the agmtID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgmtID(String value) {
        this.agmtID = value;
    }

    /**
     * Gets the value of the agmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAgmtDt() {
        return agmtDt;
    }

    /**
     * Sets the value of the agmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAgmtDt(XMLGregorianCalendar value) {
        this.agmtDt = value;
    }

    /**
     * Gets the value of the agmtCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgmtCcy() {
        return agmtCcy;
    }

    /**
     * Sets the value of the agmtCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgmtCcy(String value) {
        this.agmtCcy = value;
    }

    /**
     * Gets the value of the trmTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTrmTyp() {
        return trmTyp;
    }

    /**
     * Sets the value of the trmTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTrmTyp(BigInteger value) {
        this.trmTyp = value;
    }

    /**
     * Gets the value of the startDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDt() {
        return startDt;
    }

    /**
     * Sets the value of the startDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDt(XMLGregorianCalendar value) {
        this.startDt = value;
    }

    /**
     * Gets the value of the endDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDt() {
        return endDt;
    }

    /**
     * Sets the value of the endDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDt(XMLGregorianCalendar value) {
        this.endDt = value;
    }

    /**
     * Gets the value of the dlvryTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDlvryTyp() {
        return dlvryTyp;
    }

    /**
     * Sets the value of the dlvryTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDlvryTyp(BigInteger value) {
        this.dlvryTyp = value;
    }

    /**
     * Gets the value of the mgnRatio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMgnRatio() {
        return mgnRatio;
    }

    /**
     * Sets the value of the mgnRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMgnRatio(BigDecimal value) {
        this.mgnRatio = value;
    }

}
