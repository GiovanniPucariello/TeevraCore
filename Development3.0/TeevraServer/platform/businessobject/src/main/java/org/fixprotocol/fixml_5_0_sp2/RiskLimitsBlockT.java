
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
 * <p>Java class for RiskLimits_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RiskLimits_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}RiskLimitsElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}RiskLimitsAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RiskLimits_Block_t", propOrder = {
    "instrmtScope",
    "warnLvl"
})
public class RiskLimitsBlockT {

    @XmlElement(name = "InstrmtScope")
    protected List<RiskInstrumentScopeBlockT> instrmtScope;
    @XmlElement(name = "WarnLvl")
    protected List<RiskWarningLevelsBlockT> warnLvl;
    @XmlAttribute(name = "Typ")
    protected BigInteger typ;
    @XmlAttribute(name = "Amt")
    protected BigDecimal amt;
    @XmlAttribute(name = "Ccy")
    protected String ccy;
    @XmlAttribute(name = "Pltfm")
    protected String pltfm;

    /**
     * Gets the value of the instrmtScope property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instrmtScope property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstrmtScope().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RiskInstrumentScopeBlockT }
     * 
     * 
     */
    public List<RiskInstrumentScopeBlockT> getInstrmtScope() {
        if (instrmtScope == null) {
            instrmtScope = new ArrayList<RiskInstrumentScopeBlockT>();
        }
        return this.instrmtScope;
    }

    /**
     * Gets the value of the warnLvl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warnLvl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarnLvl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RiskWarningLevelsBlockT }
     * 
     * 
     */
    public List<RiskWarningLevelsBlockT> getWarnLvl() {
        if (warnLvl == null) {
            warnLvl = new ArrayList<RiskWarningLevelsBlockT>();
        }
        return this.warnLvl;
    }

    /**
     * Gets the value of the typ property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTyp() {
        return typ;
    }

    /**
     * Sets the value of the typ property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTyp(BigInteger value) {
        this.typ = value;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmt(BigDecimal value) {
        this.amt = value;
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
     * Gets the value of the pltfm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPltfm() {
        return pltfm;
    }

    /**
     * Sets the value of the pltfm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPltfm(String value) {
        this.pltfm = value;
    }

}
