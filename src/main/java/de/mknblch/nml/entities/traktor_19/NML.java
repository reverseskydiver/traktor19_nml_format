//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.22 at 12:17:05 PM CET 
//


package de.mknblch.nml.entities.traktor_19;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element ref="{}HEAD"/>
 *         &lt;element ref="{}MUSICFOLDERS"/>
 *         &lt;element ref="{}COLLECTION"/>
 *         &lt;element ref="{}SETS"/>
 *         &lt;element ref="{}PLAYLISTS"/>
 *       &lt;/sequence>
 *       &lt;attribute name="VERSION" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "head",
    "musicfolders",
    "collection",
    "sets",
    "playlists"
})
@XmlRootElement(name = "NML")
public class NML {

    @XmlElement(name = "HEAD", required = true)
    protected HEAD head;
    @XmlElement(name = "MUSICFOLDERS", required = true)
    protected String musicfolders;
    @XmlElement(name = "COLLECTION", required = true)
    protected COLLECTION collection;
    @XmlElement(name = "SETS", required = true)
    protected SETS sets;
    @XmlElement(name = "PLAYLISTS", required = true)
    protected PLAYLISTS playlists;
    @XmlAttribute(name = "VERSION")
    protected Integer version;

    /**
     * Gets the value of the head property.
     * 
     * @return
     *     possible object is
     *     {@link HEAD }
     *     
     */
    public HEAD getHEAD() {
        return head;
    }

    /**
     * Sets the value of the head property.
     * 
     * @param value
     *     allowed object is
     *     {@link HEAD }
     *     
     */
    public void setHEAD(HEAD value) {
        this.head = value;
    }

    /**
     * Gets the value of the musicfolders property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMUSICFOLDERS() {
        return musicfolders;
    }

    /**
     * Sets the value of the musicfolders property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMUSICFOLDERS(String value) {
        this.musicfolders = value;
    }

    /**
     * Gets the value of the collection property.
     * 
     * @return
     *     possible object is
     *     {@link COLLECTION }
     *     
     */
    public COLLECTION getCOLLECTION() {
        return collection;
    }

    /**
     * Sets the value of the collection property.
     * 
     * @param value
     *     allowed object is
     *     {@link COLLECTION }
     *     
     */
    public void setCOLLECTION(COLLECTION value) {
        this.collection = value;
    }

    /**
     * Gets the value of the sets property.
     * 
     * @return
     *     possible object is
     *     {@link SETS }
     *     
     */
    public SETS getSETS() {
        return sets;
    }

    /**
     * Sets the value of the sets property.
     * 
     * @param value
     *     allowed object is
     *     {@link SETS }
     *     
     */
    public void setSETS(SETS value) {
        this.sets = value;
    }

    /**
     * Gets the value of the playlists property.
     * 
     * @return
     *     possible object is
     *     {@link PLAYLISTS }
     *     
     */
    public PLAYLISTS getPLAYLISTS() {
        return playlists;
    }

    /**
     * Sets the value of the playlists property.
     * 
     * @param value
     *     allowed object is
     *     {@link PLAYLISTS }
     *     
     */
    public void setPLAYLISTS(PLAYLISTS value) {
        this.playlists = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVERSION() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVERSION(Integer value) {
        this.version = value;
    }

}
