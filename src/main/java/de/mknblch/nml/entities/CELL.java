//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.19 at 04:27:12 PM CEST 
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
 *       &lt;attribute name="INDEX" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="CELLNAME" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="COLOR" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="SYNC" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="REVERSE" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="MODE" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="TYPE" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="SPEED" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="TRANSPOSE" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="OFFSET" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="NUDGE" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="GAIN" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="START_MARKER" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="END_MARKER" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="BPM" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="DIR" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FILE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="VOLUME" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "CELL")
public class CELL {

    @XmlAttribute(name = "INDEX")
    protected Integer index;
    @XmlAttribute(name = "CELLNAME")
    protected String cellname;
    @XmlAttribute(name = "COLOR")
    protected Integer color;
    @XmlAttribute(name = "SYNC")
    protected Integer sync;
    @XmlAttribute(name = "REVERSE")
    protected Integer reverse;
    @XmlAttribute(name = "MODE")
    protected Integer mode;
    @XmlAttribute(name = "TYPE")
    protected Integer type;
    @XmlAttribute(name = "SPEED")
    protected Integer speed;
    @XmlAttribute(name = "TRANSPOSE")
    protected Double transpose;
    @XmlAttribute(name = "OFFSET")
    protected Double offset;
    @XmlAttribute(name = "NUDGE")
    protected Integer nudge;
    @XmlAttribute(name = "GAIN")
    protected Double gain;
    @XmlAttribute(name = "START_MARKER")
    protected Integer startmarker;
    @XmlAttribute(name = "END_MARKER")
    protected Integer endmarker;
    @XmlAttribute(name = "BPM")
    protected Double bpm;
    @XmlAttribute(name = "DIR")
    protected String dir;
    @XmlAttribute(name = "FILE")
    protected String file;
    @XmlAttribute(name = "VOLUME")
    protected String volume;

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getINDEX() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setINDEX(Integer value) {
        this.index = value;
    }

    /**
     * Gets the value of the cellname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCELLNAME() {
        return cellname;
    }

    /**
     * Sets the value of the cellname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCELLNAME(String value) {
        this.cellname = value;
    }

    /**
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCOLOR() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCOLOR(Integer value) {
        this.color = value;
    }

    /**
     * Gets the value of the sync property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSYNC() {
        return sync;
    }

    /**
     * Sets the value of the sync property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSYNC(Integer value) {
        this.sync = value;
    }

    /**
     * Gets the value of the reverse property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getREVERSE() {
        return reverse;
    }

    /**
     * Sets the value of the reverse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setREVERSE(Integer value) {
        this.reverse = value;
    }

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMODE() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMODE(Integer value) {
        this.mode = value;
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
     * Gets the value of the speed property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSPEED() {
        return speed;
    }

    /**
     * Sets the value of the speed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSPEED(Integer value) {
        this.speed = value;
    }

    /**
     * Gets the value of the transpose property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTRANSPOSE() {
        return transpose;
    }

    /**
     * Sets the value of the transpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTRANSPOSE(Double value) {
        this.transpose = value;
    }

    /**
     * Gets the value of the offset property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOFFSET() {
        return offset;
    }

    /**
     * Sets the value of the offset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOFFSET(Double value) {
        this.offset = value;
    }

    /**
     * Gets the value of the nudge property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNUDGE() {
        return nudge;
    }

    /**
     * Sets the value of the nudge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNUDGE(Integer value) {
        this.nudge = value;
    }

    /**
     * Gets the value of the gain property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGAIN() {
        return gain;
    }

    /**
     * Sets the value of the gain property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGAIN(Double value) {
        this.gain = value;
    }

    /**
     * Gets the value of the startmarker property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSTARTMARKER() {
        return startmarker;
    }

    /**
     * Sets the value of the startmarker property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSTARTMARKER(Integer value) {
        this.startmarker = value;
    }

    /**
     * Gets the value of the endmarker property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getENDMARKER() {
        return endmarker;
    }

    /**
     * Sets the value of the endmarker property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setENDMARKER(Integer value) {
        this.endmarker = value;
    }

    /**
     * Gets the value of the bpm property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBPM() {
        return bpm;
    }

    /**
     * Sets the value of the bpm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBPM(Double value) {
        this.bpm = value;
    }

    /**
     * Gets the value of the dir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIR() {
        return dir;
    }

    /**
     * Sets the value of the dir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIR(String value) {
        this.dir = value;
    }

    /**
     * Gets the value of the file property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFILE() {
        return file;
    }

    /**
     * Sets the value of the file property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFILE(String value) {
        this.file = value;
    }

    /**
     * Gets the value of the volume property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVOLUME() {
        return volume;
    }

    /**
     * Sets the value of the volume property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVOLUME(String value) {
        this.volume = value;
    }

}
