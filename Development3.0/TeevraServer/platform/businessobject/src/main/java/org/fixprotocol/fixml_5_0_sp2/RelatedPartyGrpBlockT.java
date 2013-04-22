
package org.fixprotocol.fixml_5_0_sp2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelatedPartyGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelatedPartyGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}RelatedPartyGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}RelatedPartyGrpAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedPartyGrp_Block_t", propOrder = {
    "ptyDetl",
    "rltnshp"
})
public class RelatedPartyGrpBlockT {

    @XmlElement(name = "PtyDetl")
    protected RelatedPartyDetailBlockT ptyDetl;
    @XmlElement(name = "Rltnshp")
    protected List<PartyRelationshipsBlockT> rltnshp;

    /**
     * Gets the value of the ptyDetl property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedPartyDetailBlockT }
     *     
     */
    public RelatedPartyDetailBlockT getPtyDetl() {
        return ptyDetl;
    }

    /**
     * Sets the value of the ptyDetl property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedPartyDetailBlockT }
     *     
     */
    public void setPtyDetl(RelatedPartyDetailBlockT value) {
        this.ptyDetl = value;
    }

    /**
     * Gets the value of the rltnshp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rltnshp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRltnshp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyRelationshipsBlockT }
     * 
     * 
     */
    public List<PartyRelationshipsBlockT> getRltnshp() {
        if (rltnshp == null) {
            rltnshp = new ArrayList<PartyRelationshipsBlockT>();
        }
        return this.rltnshp;
    }

}
