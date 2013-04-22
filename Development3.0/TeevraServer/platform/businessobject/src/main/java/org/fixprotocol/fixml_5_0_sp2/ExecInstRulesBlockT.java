
package org.fixprotocol.fixml_5_0_sp2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExecInstRules_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExecInstRules_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}ExecInstRulesElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}ExecInstRulesAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExecInstRules_Block_t")
public class ExecInstRulesBlockT {

    @XmlAttribute(name = "ExecInstValu")
    protected String execInstValu;

    /**
     * Gets the value of the execInstValu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecInstValu() {
        return execInstValu;
    }

    /**
     * Sets the value of the execInstValu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecInstValu(String value) {
        this.execInstValu = value;
    }

}
