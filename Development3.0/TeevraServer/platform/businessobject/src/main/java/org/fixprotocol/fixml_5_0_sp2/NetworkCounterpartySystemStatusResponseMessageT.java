
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
 * NetworkCounterpartySystemStatusResponse can be found in Volume1 of the specification 
 * 
 * <p>Java class for NetworkCounterpartySystemStatusResponse_message_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetworkCounterpartySystemStatusResponse_message_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixprotocol.org/FIXML-5-0-SP2}Abstract_message_t">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}NetworkCounterpartySystemStatusResponseElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}NetworkCounterpartySystemStatusResponseAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkCounterpartySystemStatusResponse_message_t", propOrder = {
    "cidStat"
})
public class NetworkCounterpartySystemStatusResponseMessageT
    extends AbstractMessageT
{

    @XmlElement(name = "CIDStat", required = true)
    protected List<CompIDStatGrpBlockT> cidStat;
    @XmlAttribute(name = "NtwkStatRspTyp")
    protected BigInteger ntwkStatRspTyp;
    @XmlAttribute(name = "NtwkReqID")
    protected String ntwkReqID;
    @XmlAttribute(name = "NtwkRspID")
    protected String ntwkRspID;
    @XmlAttribute(name = "LastNtwkRspID")
    protected String lastNtwkRspID;

    /**
     * Gets the value of the cidStat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cidStat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCIDStat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompIDStatGrpBlockT }
     * 
     * 
     */
    public List<CompIDStatGrpBlockT> getCIDStat() {
        if (cidStat == null) {
            cidStat = new ArrayList<CompIDStatGrpBlockT>();
        }
        return this.cidStat;
    }

    /**
     * Gets the value of the ntwkStatRspTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNtwkStatRspTyp() {
        return ntwkStatRspTyp;
    }

    /**
     * Sets the value of the ntwkStatRspTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNtwkStatRspTyp(BigInteger value) {
        this.ntwkStatRspTyp = value;
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

    /**
     * Gets the value of the ntwkRspID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtwkRspID() {
        return ntwkRspID;
    }

    /**
     * Sets the value of the ntwkRspID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNtwkRspID(String value) {
        this.ntwkRspID = value;
    }

    /**
     * Gets the value of the lastNtwkRspID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastNtwkRspID() {
        return lastNtwkRspID;
    }

    /**
     * Sets the value of the lastNtwkRspID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastNtwkRspID(String value) {
        this.lastNtwkRspID = value;
    }

}
