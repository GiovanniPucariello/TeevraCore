
package org.fixprotocol.fixml_5_0_sp2;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ContraGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContraGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}ContraGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}ContraGrpAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContraGrp_Block_t")
public class ContraGrpBlockT {

    @XmlAttribute(name = "CntraBrkr")
    protected String cntraBrkr;
    @XmlAttribute(name = "CntraTrdr")
    protected String cntraTrdr;
    @XmlAttribute(name = "CntraTrdQty")
    protected BigDecimal cntraTrdQty;
    @XmlAttribute(name = "CntraTrdTm")
    protected XMLGregorianCalendar cntraTrdTm;
    @XmlAttribute(name = "CntraLegRefID")
    protected String cntraLegRefID;

    /**
     * Gets the value of the cntraBrkr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCntraBrkr() {
        return cntraBrkr;
    }

    /**
     * Sets the value of the cntraBrkr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCntraBrkr(String value) {
        this.cntraBrkr = value;
    }

    /**
     * Gets the value of the cntraTrdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCntraTrdr() {
        return cntraTrdr;
    }

    /**
     * Sets the value of the cntraTrdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCntraTrdr(String value) {
        this.cntraTrdr = value;
    }

    /**
     * Gets the value of the cntraTrdQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCntraTrdQty() {
        return cntraTrdQty;
    }

    /**
     * Sets the value of the cntraTrdQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCntraTrdQty(BigDecimal value) {
        this.cntraTrdQty = value;
    }

    /**
     * Gets the value of the cntraTrdTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCntraTrdTm() {
        return cntraTrdTm;
    }

    /**
     * Sets the value of the cntraTrdTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCntraTrdTm(XMLGregorianCalendar value) {
        this.cntraTrdTm = value;
    }

    /**
     * Gets the value of the cntraLegRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCntraLegRefID() {
        return cntraLegRefID;
    }

    /**
     * Sets the value of the cntraLegRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCntraLegRefID(String value) {
        this.cntraLegRefID = value;
    }

}
