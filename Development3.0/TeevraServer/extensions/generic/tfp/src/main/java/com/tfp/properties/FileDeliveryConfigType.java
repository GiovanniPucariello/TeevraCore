//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.03.03 at 03:05:55 PM EST 
//


package com.tfp.properties;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileDeliveryConfigType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FileDeliveryConfigType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="directoryPath" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="retainFile" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileDeliveryConfigType")
public class FileDeliveryConfigType {

    @XmlAttribute(required = true)
    protected String directoryPath;
    @XmlAttribute
    protected Boolean retainFile;

    /**
     * Gets the value of the directoryPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectoryPath() {
        return directoryPath;
    }

    /**
     * Sets the value of the directoryPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectoryPath(String value) {
        this.directoryPath = value;
    }

    /**
     * Gets the value of the retainFile property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRetainFile() {
        if (retainFile == null) {
            return false;
        } else {
            return retainFile;
        }
    }

    /**
     * Sets the value of the retainFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRetainFile(Boolean value) {
        this.retainFile = value;
    }

}
