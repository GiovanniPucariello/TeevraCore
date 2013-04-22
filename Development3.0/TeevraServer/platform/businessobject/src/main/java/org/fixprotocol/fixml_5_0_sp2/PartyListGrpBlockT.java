
package org.fixprotocol.fixml_5_0_sp2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyListGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyListGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}PartyListGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}PartyListGrpAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyListGrp_Block_t", propOrder = {
    "ptyDetl",
    "reltdPty"
})
public class PartyListGrpBlockT {

    @XmlElement(name = "PtyDetl")
    protected PartyDetailBlockT ptyDetl;
    @XmlElement(name = "ReltdPty")
    protected List<RelatedPartyGrpBlockT> reltdPty;

    /**
     * Gets the value of the ptyDetl property.
     * 
     * @return
     *     possible object is
     *     {@link PartyDetailBlockT }
     *     
     */
    public PartyDetailBlockT getPtyDetl() {
        return ptyDetl;
    }

    /**
     * Sets the value of the ptyDetl property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyDetailBlockT }
     *     
     */
    public void setPtyDetl(PartyDetailBlockT value) {
        this.ptyDetl = value;
    }

    /**
     * Gets the value of the reltdPty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reltdPty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReltdPty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedPartyGrpBlockT }
     * 
     * 
     */
    public List<RelatedPartyGrpBlockT> getReltdPty() {
        if (reltdPty == null) {
            reltdPty = new ArrayList<RelatedPartyGrpBlockT>();
        }
        return this.reltdPty;
    }

}
