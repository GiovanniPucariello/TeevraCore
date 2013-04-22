
package org.fixprotocol.fixml_5_0_sp2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * NetworkCounterpartySystemStatusRequest can be found in Volume1 of the specification 
 * 
 * <p>Java class for NetworkCounterpartySystemStatusRequest_message_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetworkCounterpartySystemStatusRequest_message_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixprotocol.org/FIXML-5-0-SP2}Abstract_message_t">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}NetworkCounterpartySystemStatusRequestElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}NetworkCounterpartySystemStatusRequestAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkCounterpartySystemStatusRequest_message_t", propOrder = {
    "cidReq"
})
public class NetworkCounterpartySystemStatusRequestMessageT
    extends AbstractMessageT
{

    @XmlElement(name = "CIDReq")
    protected List<CompIDReqGrpBlockT> cidReq;
    @XmlAttribute(name = "NtwkReqTyp")
    protected BigInteger ntwkReqTyp;
    @XmlAttribute(name = "NtwkReqID")
    protected String ntwkReqID;

    /**
     * Gets the value of the cidReq property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cidReq property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCIDReq().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompIDReqGrpBlockT }
     * 
     * 
     */
    public List<CompIDReqGrpBlockT> getCIDReq() {
        if (cidReq == null) {
            cidReq = new ArrayList<CompIDReqGrpBlockT>();
        }
        return this.cidReq;
    }

    /**
     * Gets the value of the ntwkReqTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNtwkReqTyp() {
        return ntwkReqTyp;
    }

    /**
     * Sets the value of the ntwkReqTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNtwkReqTyp(BigInteger value) {
        this.ntwkReqTyp = value;
    }

    /**
     * Gets the value of the ntwkReqID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtwkReqID() {
        return ntwkReqID;
    }

    /**
     * Sets the value of the ntwkReqID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNtwkReqID(String value) {
        this.ntwkReqID = value;
    }

}
