//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.03.03 at 03:05:55 PM EST 
//


package com.tfp.properties;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TEDIParseConfigType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TEDIParseConfigType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice minOccurs="0">
 *         &lt;element name="Record" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="Observed" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="recordType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="autoRightPad" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                 &lt;attribute name="autoRightTrim" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                 &lt;attribute name="useKeyAsOdsKey" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                 &lt;attribute name="tediPadCharacter" type="{http://www.w3.org/2001/XMLSchema}string" default="255" />
 *                 &lt;attribute name="tfpPadCharacter" type="{http://www.w3.org/2001/XMLSchema}string" default="20" />
 *                 &lt;attribute name="odsObjectTypeRecord" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="odsObjectTypeField" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="odsObjectKeyRecord" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="odsObjectKeyField" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="XML" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="odsObjectTypeXPath" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="odsObjectKeyXPath" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *       &lt;attribute name="sourceName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="defaultOdsObjectType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TEDIParseConfigType", propOrder = {
    "record",
    "xml"
})
public class TEDIParseConfigType {

    @XmlElement(name = "Record")
    protected TEDIParseConfigType.Record record;
    @XmlElement(name = "XML")
    protected TEDIParseConfigType.XML xml;
    @XmlAttribute(required = true)
    protected String sourceName;
    @XmlAttribute
    protected String defaultOdsObjectType;

    /**
     * Gets the value of the record property.
     * 
     * @return
     *     possible object is
     *     {@link TEDIParseConfigType.Record }
     *     
     */
    public TEDIParseConfigType.Record getRecord() {
        return record;
    }

    /**
     * Sets the value of the record property.
     * 
     * @param value
     *     allowed object is
     *     {@link TEDIParseConfigType.Record }
     *     
     */
    public void setRecord(TEDIParseConfigType.Record value) {
        this.record = value;
    }

    /**
     * Gets the value of the xml property.
     * 
     * @return
     *     possible object is
     *     {@link TEDIParseConfigType.XML }
     *     
     */
    public TEDIParseConfigType.XML getXML() {
        return xml;
    }

    /**
     * Sets the value of the xml property.
     * 
     * @param value
     *     allowed object is
     *     {@link TEDIParseConfigType.XML }
     *     
     */
    public void setXML(TEDIParseConfigType.XML value) {
        this.xml = value;
    }

    /**
     * Gets the value of the sourceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceName() {
        return sourceName;
    }

    /**
     * Sets the value of the sourceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceName(String value) {
        this.sourceName = value;
    }

    /**
     * Gets the value of the defaultOdsObjectType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultOdsObjectType() {
        return defaultOdsObjectType;
    }

    /**
     * Sets the value of the defaultOdsObjectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultOdsObjectType(String value) {
        this.defaultOdsObjectType = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence minOccurs="0">
     *         &lt;element name="Observed" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="recordType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="autoRightPad" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *       &lt;attribute name="autoRightTrim" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *       &lt;attribute name="useKeyAsOdsKey" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *       &lt;attribute name="tediPadCharacter" type="{http://www.w3.org/2001/XMLSchema}string" default="255" />
     *       &lt;attribute name="tfpPadCharacter" type="{http://www.w3.org/2001/XMLSchema}string" default="20" />
     *       &lt;attribute name="odsObjectTypeRecord" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="odsObjectTypeField" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="odsObjectKeyRecord" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="odsObjectKeyField" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "observed"
    })
    public static class Record {

        @XmlElement(name = "Observed")
        protected List<TEDIParseConfigType.Record.Observed> observed;
        @XmlAttribute
        protected Boolean autoRightPad;
        @XmlAttribute
        protected Boolean autoRightTrim;
        @XmlAttribute
        protected Boolean useKeyAsOdsKey;
        @XmlAttribute
        protected String tediPadCharacter;
        @XmlAttribute
        protected String tfpPadCharacter;
        @XmlAttribute
        protected String odsObjectTypeRecord;
        @XmlAttribute
        protected String odsObjectTypeField;
        @XmlAttribute
        protected String odsObjectKeyRecord;
        @XmlAttribute
        protected String odsObjectKeyField;

        /**
         * Gets the value of the observed property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the observed property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getObserved().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TEDIParseConfigType.Record.Observed }
         * 
         * 
         */
        public List<TEDIParseConfigType.Record.Observed> getObserved() {
            if (observed == null) {
                observed = new ArrayList<TEDIParseConfigType.Record.Observed>();
            }
            return this.observed;
        }

        /**
         * Gets the value of the autoRightPad property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isAutoRightPad() {
            if (autoRightPad == null) {
                return false;
            } else {
                return autoRightPad;
            }
        }

        /**
         * Sets the value of the autoRightPad property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAutoRightPad(Boolean value) {
            this.autoRightPad = value;
        }

        /**
         * Gets the value of the autoRightTrim property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isAutoRightTrim() {
            if (autoRightTrim == null) {
                return false;
            } else {
                return autoRightTrim;
            }
        }

        /**
         * Sets the value of the autoRightTrim property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAutoRightTrim(Boolean value) {
            this.autoRightTrim = value;
        }

        /**
         * Gets the value of the useKeyAsOdsKey property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isUseKeyAsOdsKey() {
            if (useKeyAsOdsKey == null) {
                return false;
            } else {
                return useKeyAsOdsKey;
            }
        }

        /**
         * Sets the value of the useKeyAsOdsKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setUseKeyAsOdsKey(Boolean value) {
            this.useKeyAsOdsKey = value;
        }

        /**
         * Gets the value of the tediPadCharacter property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTediPadCharacter() {
            if (tediPadCharacter == null) {
                return "255";
            } else {
                return tediPadCharacter;
            }
        }

        /**
         * Sets the value of the tediPadCharacter property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTediPadCharacter(String value) {
            this.tediPadCharacter = value;
        }

        /**
         * Gets the value of the tfpPadCharacter property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTfpPadCharacter() {
            if (tfpPadCharacter == null) {
                return "20";
            } else {
                return tfpPadCharacter;
            }
        }

        /**
         * Sets the value of the tfpPadCharacter property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTfpPadCharacter(String value) {
            this.tfpPadCharacter = value;
        }

        /**
         * Gets the value of the odsObjectTypeRecord property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOdsObjectTypeRecord() {
            return odsObjectTypeRecord;
        }

        /**
         * Sets the value of the odsObjectTypeRecord property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOdsObjectTypeRecord(String value) {
            this.odsObjectTypeRecord = value;
        }

        /**
         * Gets the value of the odsObjectTypeField property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOdsObjectTypeField() {
            return odsObjectTypeField;
        }

        /**
         * Sets the value of the odsObjectTypeField property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOdsObjectTypeField(String value) {
            this.odsObjectTypeField = value;
        }

        /**
         * Gets the value of the odsObjectKeyRecord property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOdsObjectKeyRecord() {
            return odsObjectKeyRecord;
        }

        /**
         * Sets the value of the odsObjectKeyRecord property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOdsObjectKeyRecord(String value) {
            this.odsObjectKeyRecord = value;
        }

        /**
         * Gets the value of the odsObjectKeyField property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOdsObjectKeyField() {
            return odsObjectKeyField;
        }

        /**
         * Sets the value of the odsObjectKeyField property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOdsObjectKeyField(String value) {
            this.odsObjectKeyField = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="recordType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Observed {

            @XmlAttribute(required = true)
            protected String recordType;

            /**
             * Gets the value of the recordType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRecordType() {
                return recordType;
            }

            /**
             * Sets the value of the recordType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRecordType(String value) {
                this.recordType = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="odsObjectTypeXPath" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="odsObjectKeyXPath" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class XML {

        @XmlAttribute
        protected String odsObjectTypeXPath;
        @XmlAttribute
        protected String odsObjectKeyXPath;

        /**
         * Gets the value of the odsObjectTypeXPath property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOdsObjectTypeXPath() {
            return odsObjectTypeXPath;
        }

        /**
         * Sets the value of the odsObjectTypeXPath property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOdsObjectTypeXPath(String value) {
            this.odsObjectTypeXPath = value;
        }

        /**
         * Gets the value of the odsObjectKeyXPath property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOdsObjectKeyXPath() {
            return odsObjectKeyXPath;
        }

        /**
         * Sets the value of the odsObjectKeyXPath property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOdsObjectKeyXPath(String value) {
            this.odsObjectKeyXPath = value;
        }

    }

}
