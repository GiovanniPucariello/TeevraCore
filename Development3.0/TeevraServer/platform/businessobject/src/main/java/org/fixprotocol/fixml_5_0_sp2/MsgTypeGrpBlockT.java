
package org.fixprotocol.fixml_5_0_sp2;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MsgTypeGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MsgTypeGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}MsgTypeGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}MsgTypeGrpAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MsgTypeGrp_Block_t")
public class MsgTypeGrpBlockT {

    @XmlAttribute(name = "RefMsgTyp")
    protected String refMsgTyp;
    @XmlAttribute(name = "RefApplVerID")
    protected String refApplVerID;
    @XmlAttribute(name = "RefApplExtID")
    protected BigInteger refApplExtID;
    @XmlAttribute(name = "RefCstmApplVerID")
    protected String refCstmApplVerID;
    @XmlAttribute(name = "DfltVerInd")
    protected String dfltVerInd;

    /**
     * Gets the value of the refMsgTyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefMsgTyp() {
        return refMsgTyp;
    }

    /**
     * Sets the value of the refMsgTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefMsgTyp(String value) {
        this.refMsgTyp = value;
    }

    /**
     * Gets the value of the refApplVerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefApplVerID() {
        return refApplVerID;
    }

    /**
     * Sets the value of the refApplVerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefApplVerID(String value) {
        this.refApplVerID = value;
    }

    /**
     * Gets the value of the refApplExtID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRefApplExtID() {
        return refApplExtID;
    }

    /**
     * Sets the value of the refApplExtID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRefApplExtID(BigInteger value) {
        this.refApplExtID = value;
    }

    /**
     * Gets the value of the refCstmApplVerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefCstmApplVerID() {
        return refCstmApplVerID;
    }

    /**
     * Sets the value of the refCstmApplVerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefCstmApplVerID(String value) {
        this.refCstmApplVerID = value;
    }

    /**
     * Gets the value of the dfltVerInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDfltVerInd() {
        return dfltVerInd;
    }

    /**
     * Sets the value of the dfltVerInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDfltVerInd(String value) {
        this.dfltVerInd = value;
    }

}
