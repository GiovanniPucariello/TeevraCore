//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.11.09 at 04:04:26 PM GMT+05:30 
//


package com.headstrong.fusion.configGenerator.viewObjects.eurex;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}configHeader"/>
 *         &lt;element ref="{}predicate" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "configHeader",
    "predicate"
})
@XmlRootElement(name = "configuration")
public class Configuration implements ViewObject{

    @XmlElement(required = true)
    protected ConfigHeader configHeader;
    @XmlElement(required = true)
    protected List<Predicate> predicate;

    /**
     * Gets the value of the configHeader property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigHeader }
     *     
     */
    public ConfigHeader getConfigHeader() {
        return configHeader;
    }

    /**
     * Sets the value of the configHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigHeader }
     *     
     */
    public void setConfigHeader(ConfigHeader value) {
        this.configHeader = value;
    }

    /**
     * Gets the value of the predicate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the predicate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPredicate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Predicate }
     * 
     * 
     */
    public List<Predicate> getPredicate() {
        if (predicate == null) {
            predicate = new ArrayList<Predicate>();
        }
        return this.predicate;
    }

    
    
	@Override
	public String toXML() {
		StringWriter writer = new StringWriter();
		try {
			JAXBContext context = JAXBContext.newInstance(this.getClass());
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(this, writer);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return writer.toString();
	}

}
