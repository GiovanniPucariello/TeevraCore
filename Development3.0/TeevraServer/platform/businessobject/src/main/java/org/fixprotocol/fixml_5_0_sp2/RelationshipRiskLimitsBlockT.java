
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
 * <p>Java class for RelationshipRiskLimits_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelationshipRiskLimits_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}RelationshipRiskLimitsElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}RelationshipRiskLimitsAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelationshipRiskLimits_Block_t", propOrder = {
    "instrmtScope",
    "warnLvl"
})
public class RelationshipRiskLimitsBlockT {

    @XmlElement(name = "InstrmtScope")
    protected List<RelationshipRiskInstrumentScopeBlockT> instrmtScope;
    @XmlElement(name = "WarnLvl")
    protected List<RelationshipRiskWarningLevelsBlockT> warnLvl;
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
     * {@link RelationshipRiskInstrumentScopeBlockT }
     * 
     * 
     */
    public List<RelationshipRiskInstrumentScopeBlockT> getInstrmtScope() {
        if (instrmtScope == null) {
            instrmtScope = new ArrayList<RelationshipRiskInstrumentScopeBlockT>();
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
     * {@link RelationshipRiskWarningLevelsBlockT }
     * 
     * 
     */
    public List<RelationshipRiskWarningLevelsBlockT> getWarnLvl() {
        if (warnLvl == null) {
            warnLvl = new ArrayList<RelationshipRiskWarningLevelsBlockT>();
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
