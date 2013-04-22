
package org.fixprotocol.fixml_5_0_sp2;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PegInstructions_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PegInstructions_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}PegInstructionsElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}PegInstructionsAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PegInstructions_Block_t")
public class PegInstructionsBlockT {

    @XmlAttribute(name = "OfstVal")
    protected BigDecimal ofstVal;
    @XmlAttribute(name = "PegPxTyp")
    protected BigInteger pegPxTyp;
    @XmlAttribute(name = "MoveTyp")
    protected BigInteger moveTyp;
    @XmlAttribute(name = "OfstTyp")
    protected BigInteger ofstTyp;
    @XmlAttribute(name = "LmtTyp")
    protected BigInteger lmtTyp;
    @XmlAttribute(name = "RndDir")
    protected BigInteger rndDir;
    @XmlAttribute(name = "Scope")
    protected BigInteger scope;
    @XmlAttribute(name = "PegSecurityIDSource")
    protected String pegSecurityIDSource;
    @XmlAttribute(name = "PegSecID")
    protected String pegSecID;
    @XmlAttribute(name = "PgSymbl")
    protected String pgSymbl;
    @XmlAttribute(name = "PegSecDesc")
    protected String pegSecDesc;

    /**
     * Gets the value of the ofstVal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOfstVal() {
        return ofstVal;
    }

    /**
     * Sets the value of the ofstVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOfstVal(BigDecimal value) {
        this.ofstVal = value;
    }

    /**
     * Gets the value of the pegPxTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPegPxTyp() {
        return pegPxTyp;
    }

    /**
     * Sets the value of the pegPxTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPegPxTyp(BigInteger value) {
        this.pegPxTyp = value;
    }

    /**
     * Gets the value of the moveTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMoveTyp() {
        return moveTyp;
    }

    /**
     * Sets the value of the moveTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMoveTyp(BigInteger value) {
        this.moveTyp = value;
    }

    /**
     * Gets the value of the ofstTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOfstTyp() {
        return ofstTyp;
    }

    /**
     * Sets the value of the ofstTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOfstTyp(BigInteger value) {
        this.ofstTyp = value;
    }

    /**
     * Gets the value of the lmtTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLmtTyp() {
        return lmtTyp;
    }

    /**
     * Sets the value of the lmtTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLmtTyp(BigInteger value) {
        this.lmtTyp = value;
    }

    /**
     * Gets the value of the rndDir property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRndDir() {
        return rndDir;
    }

    /**
     * Sets the value of the rndDir property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRndDir(BigInteger value) {
        this.rndDir = value;
    }

    /**
     * Gets the value of the scope property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getScope() {
        return scope;
    }

    /**
     * Sets the value of the scope property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setScope(BigInteger value) {
        this.scope = value;
    }

    /**
     * Gets the value of the pegSecurityIDSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPegSecurityIDSource() {
        return pegSecurityIDSource;
    }

    /**
     * Sets the value of the pegSecurityIDSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPegSecurityIDSource(String value) {
        this.pegSecurityIDSource = value;
    }

    /**
     * Gets the value of the pegSecID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPegSecID() {
        return pegSecID;
    }

    /**
     * Sets the value of the pegSecID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPegSecID(String value) {
        this.pegSecID = value;
    }

    /**
     * Gets the value of the pgSymbl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPgSymbl() {
        return pgSymbl;
    }

    /**
     * Sets the value of the pgSymbl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPgSymbl(String value) {
        this.pgSymbl = value;
    }

    /**
     * Gets the value of the pegSecDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPegSecDesc() {
        return pegSecDesc;
    }

    /**
     * Sets the value of the pegSecDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPegSecDesc(String value) {
        this.pegSecDesc = value;
    }

}