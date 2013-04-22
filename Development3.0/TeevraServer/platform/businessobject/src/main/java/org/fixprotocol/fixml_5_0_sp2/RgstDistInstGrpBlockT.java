
package org.fixprotocol.fixml_5_0_sp2;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RgstDistInstGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RgstDistInstGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}RgstDistInstGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}RgstDistInstGrpAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RgstDistInstGrp_Block_t")
public class RgstDistInstGrpBlockT {

    @XmlAttribute(name = "DistribPmtMethod")
    protected String distribPmtMethod;
    @XmlAttribute(name = "DistribPctage")
    protected BigDecimal distribPctage;
    @XmlAttribute(name = "CshDistribCurr")
    protected String cshDistribCurr;
    @XmlAttribute(name = "CshDistribAgentName")
    protected String cshDistribAgentName;
    @XmlAttribute(name = "CshDistribAgentCode")
    protected String cshDistribAgentCode;
    @XmlAttribute(name = "CshDistribAgentAcctNum")
    protected String cshDistribAgentAcctNum;
    @XmlAttribute(name = "CshDistribPayRef")
    protected String cshDistribPayRef;
    @XmlAttribute(name = "CshDistribAgentAcctName")
    protected String cshDistribAgentAcctName;

    /**
     * Gets the value of the distribPmtMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribPmtMethod() {
        return distribPmtMethod;
    }

    /**
     * Sets the value of the distribPmtMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribPmtMethod(String value) {
        this.distribPmtMethod = value;
    }

    /**
     * Gets the value of the distribPctage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDistribPctage() {
        return distribPctage;
    }

    /**
     * Sets the value of the distribPctage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDistribPctage(BigDecimal value) {
        this.distribPctage = value;
    }

    /**
     * Gets the value of the cshDistribCurr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCshDistribCurr() {
        return cshDistribCurr;
    }

    /**
     * Sets the value of the cshDistribCurr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCshDistribCurr(String value) {
        this.cshDistribCurr = value;
    }

    /**
     * Gets the value of the cshDistribAgentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCshDistribAgentName() {
        return cshDistribAgentName;
    }

    /**
     * Sets the value of the cshDistribAgentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCshDistribAgentName(String value) {
        this.cshDistribAgentName = value;
    }

    /**
     * Gets the value of the cshDistribAgentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCshDistribAgentCode() {
        return cshDistribAgentCode;
    }

    /**
     * Sets the value of the cshDistribAgentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCshDistribAgentCode(String value) {
        this.cshDistribAgentCode = value;
    }

    /**
     * Gets the value of the cshDistribAgentAcctNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCshDistribAgentAcctNum() {
        return cshDistribAgentAcctNum;
    }

    /**
     * Sets the value of the cshDistribAgentAcctNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCshDistribAgentAcctNum(String value) {
        this.cshDistribAgentAcctNum = value;
    }

    /**
     * Gets the value of the cshDistribPayRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCshDistribPayRef() {
        return cshDistribPayRef;
    }

    /**
     * Sets the value of the cshDistribPayRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCshDistribPayRef(String value) {
        this.cshDistribPayRef = value;
    }

    /**
     * Gets the value of the cshDistribAgentAcctName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCshDistribAgentAcctName() {
        return cshDistribAgentAcctName;
    }

    /**
     * Sets the value of the cshDistribAgentAcctName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCshDistribAgentAcctName(String value) {
        this.cshDistribAgentAcctName = value;
    }

}
