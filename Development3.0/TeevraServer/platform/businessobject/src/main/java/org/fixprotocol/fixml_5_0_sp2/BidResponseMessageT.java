
package org.fixprotocol.fixml_5_0_sp2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * BidResponse can be found in Volume4 of the specification 
 * 
 * <p>Java class for BidResponse_message_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BidResponse_message_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixprotocol.org/FIXML-5-0-SP2}Abstract_message_t">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}BidResponseElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}BidResponseAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BidResponse_message_t", propOrder = {
    "compRsp"
})
public class BidResponseMessageT
    extends AbstractMessageT
{

    @XmlElement(name = "CompRsp", required = true)
    protected List<BidCompRspGrpBlockT> compRsp;
    @XmlAttribute(name = "BidID")
    protected String bidID;
    @XmlAttribute(name = "ClBidID")
    protected String clBidID;

    /**
     * Gets the value of the compRsp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compRsp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompRsp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BidCompRspGrpBlockT }
     * 
     * 
     */
    public List<BidCompRspGrpBlockT> getCompRsp() {
        if (compRsp == null) {
            compRsp = new ArrayList<BidCompRspGrpBlockT>();
        }
        return this.compRsp;
    }

    /**
     * Gets the value of the bidID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBidID() {
        return bidID;
    }

    /**
     * Sets the value of the bidID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBidID(String value) {
        this.bidID = value;
    }

    /**
     * Gets the value of the clBidID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClBidID() {
        return clBidID;
    }

    /**
     * Sets the value of the clBidID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClBidID(String value) {
        this.clBidID = value;
    }

}
