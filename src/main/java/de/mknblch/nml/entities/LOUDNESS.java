//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.13 at 10:40:36 PM CEST 
//


package de.mknblch.nml.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attribute name="PEAK_DB" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="PERCEIVED_DB" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="ANALYZED_DB" type="{http://www.w3.org/2001/XMLSchema}double" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "LOUDNESS")
public class LOUDNESS {

    @XmlAttribute(name = "PEAK_DB")
    protected Double peakdb;
    @XmlAttribute(name = "PERCEIVED_DB")
    protected Double perceiveddb;
    @XmlAttribute(name = "ANALYZED_DB")
    protected Double analyzeddb;

    /**
     * Gets the value of the peakdb property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPEAKDB() {
        return peakdb;
    }

    /**
     * Sets the value of the peakdb property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPEAKDB(Double value) {
        this.peakdb = value;
    }

    /**
     * Gets the value of the perceiveddb property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPERCEIVEDDB() {
        return perceiveddb;
    }

    /**
     * Sets the value of the perceiveddb property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPERCEIVEDDB(Double value) {
        this.perceiveddb = value;
    }

    /**
     * Gets the value of the analyzeddb property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getANALYZEDDB() {
        return analyzeddb;
    }

    /**
     * Sets the value of the analyzeddb property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setANALYZEDDB(Double value) {
        this.analyzeddb = value;
    }

}
