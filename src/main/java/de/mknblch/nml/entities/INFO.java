//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.19 at 11:17:38 AM CEST 
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
 *       &lt;attribute name="BITRATE" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="GENRE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="COMMENT" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="COVERARTID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PLAYTIME" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="PLAYTIME_FLOAT" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="IMPORT_DATE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RELEASE_DATE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FLAGS" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="FILESIZE" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="LABEL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="KEY" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="LAST_PLAYED" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "INFO")
public class INFO {

    @XmlAttribute(name = "BITRATE")
    protected Integer bitrate;
    @XmlAttribute(name = "GENRE")
    protected String genre;
    @XmlAttribute(name = "COMMENT")
    protected String comment;
    @XmlAttribute(name = "COVERARTID")
    protected String coverartid;
    @XmlAttribute(name = "PLAYTIME")
    protected Integer playtime;
    @XmlAttribute(name = "PLAYTIME_FLOAT")
    protected Double playtimefloat;
    @XmlAttribute(name = "IMPORT_DATE")
    protected String importdate;
    @XmlAttribute(name = "RELEASE_DATE")
    protected String releasedate;
    @XmlAttribute(name = "FLAGS")
    protected Integer flags;
    @XmlAttribute(name = "FILESIZE")
    protected Integer filesize;
    @XmlAttribute(name = "LABEL")
    protected String label;
    @XmlAttribute(name = "KEY")
    protected String key;
    @XmlAttribute(name = "LAST_PLAYED")
    protected String lastplayed;

    /**
     * Gets the value of the bitrate property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBITRATE() {
        return bitrate;
    }

    /**
     * Sets the value of the bitrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBITRATE(Integer value) {
        this.bitrate = value;
    }

    /**
     * Gets the value of the genre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGENRE() {
        return genre;
    }

    /**
     * Sets the value of the genre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGENRE(String value) {
        this.genre = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMMENT() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMMENT(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the coverartid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOVERARTID() {
        return coverartid;
    }

    /**
     * Sets the value of the coverartid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOVERARTID(String value) {
        this.coverartid = value;
    }

    /**
     * Gets the value of the playtime property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPLAYTIME() {
        return playtime;
    }

    /**
     * Sets the value of the playtime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPLAYTIME(Integer value) {
        this.playtime = value;
    }

    /**
     * Gets the value of the playtimefloat property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPLAYTIMEFLOAT() {
        return playtimefloat;
    }

    /**
     * Sets the value of the playtimefloat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPLAYTIMEFLOAT(Double value) {
        this.playtimefloat = value;
    }

    /**
     * Gets the value of the importdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMPORTDATE() {
        return importdate;
    }

    /**
     * Sets the value of the importdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMPORTDATE(String value) {
        this.importdate = value;
    }

    /**
     * Gets the value of the releasedate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRELEASEDATE() {
        return releasedate;
    }

    /**
     * Sets the value of the releasedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRELEASEDATE(String value) {
        this.releasedate = value;
    }

    /**
     * Gets the value of the flags property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFLAGS() {
        return flags;
    }

    /**
     * Sets the value of the flags property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFLAGS(Integer value) {
        this.flags = value;
    }

    /**
     * Gets the value of the filesize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFILESIZE() {
        return filesize;
    }

    /**
     * Sets the value of the filesize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFILESIZE(Integer value) {
        this.filesize = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLABEL() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLABEL(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKEY() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKEY(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the lastplayed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLASTPLAYED() {
        return lastplayed;
    }

    /**
     * Sets the value of the lastplayed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLASTPLAYED(String value) {
        this.lastplayed = value;
    }

}
