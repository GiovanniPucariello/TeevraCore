//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.11.09 at 04:04:26 PM GMT+05:30 
//


package com.headstrong.fusion.configGenerator.viewObjects.eurex;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element ref="{}selectors"/>
 *         &lt;element ref="{}arrayMappings"/>
 *         &lt;element ref="{}map" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="fixmlClassName" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "selectors",
    "arrayMappings",
    "map"
})
@XmlRootElement(name = "mappings")
public class Mappings {

    @XmlElement(required = true)
    protected Selectors selectors;
    @XmlElement(required = true)
    protected ArrayMappings arrayMappings;
    @XmlElement(required = true)
    protected List<Maps> map;
    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String fixmlClassName;

    /**
     * Gets the value of the selectors property.
     * 
     * @return
     *     possible object is
     *     {@link Selectors }
     *     
     */
    public Selectors getSelectors() {
        return selectors;
    }

    /**
     * Sets the value of the selectors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Selectors }
     *     
     */
    public void setSelectors(Selectors value) {
        this.selectors = value;
    }

    /**
     * Gets the value of the arrayMappings property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayMappings }
     *     
     */
    public ArrayMappings getArrayMappings() {
        return arrayMappings;
    }

    /**
     * Sets the value of the arrayMappings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayMappings }
     *     
     */
    public void setArrayMappings(ArrayMappings value) {
        this.arrayMappings = value;
    }

    /**
     * Gets the value of the map property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the map property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMap().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Map }
     * 
     * 
     */
    public List<Maps> getMap() {
        if (map == null) {
            map = new ArrayList<Maps>();
        }
        return this.map;
    }

    /**
     * Gets the value of the fixmlClassName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFixmlClassName() {
        return fixmlClassName;
    }

    /**
     * Sets the value of the fixmlClassName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFixmlClassName(String value) {
        this.fixmlClassName = value;
    }

}
