//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.10 at 06:29:22 PM CEST 
//


package de.mknblch.nml.entities.traktor_19;

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
 *       &lt;attribute name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DISPL_ORDER" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="TYPE" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="START" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="LEN" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="REPEATS" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="HOTCUE" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "CUE_V2")
public class CUEV2 {

    @XmlAttribute(name = "NAME")
    protected String name;
    @XmlAttribute(name = "DISPL_ORDER")
    protected Integer displorder;
    @XmlAttribute(name = "TYPE")
    protected Integer type;
    @XmlAttribute(name = "START")
    protected Double start;
    @XmlAttribute(name = "LEN")
    protected Double len;
    @XmlAttribute(name = "REPEATS")
    protected Integer repeats;
    @XmlAttribute(name = "HOTCUE")
    protected Integer hotcue;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAME() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAME(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the displorder property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDISPLORDER() {
        return displorder;
    }

    /**
     * Sets the value of the displorder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDISPLORDER(Integer value) {
        this.displorder = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTYPE() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTYPE(Integer value) {
        this.type = value;
    }

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSTART() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSTART(Double value) {
        this.start = value;
    }

    /**
     * Gets the value of the len property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLEN() {
        return len;
    }

    /**
     * Sets the value of the len property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLEN(Double value) {
        this.len = value;
    }

    /**
     * Gets the value of the repeats property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getREPEATS() {
        return repeats;
    }

    /**
     * Sets the value of the repeats property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setREPEATS(Integer value) {
        this.repeats = value;
    }

    /**
     * Gets the value of the hotcue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHOTCUE() {
        return hotcue;
    }

    /**
     * Sets the value of the hotcue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHOTCUE(Integer value) {
        this.hotcue = value;
    }

}
