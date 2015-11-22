//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.22 at 12:17:05 PM CET 
//


package de.mknblch.nml.entities.traktor_19;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{}LOCATION"/>
 *         &lt;element ref="{}MODIFICATION_INFO"/>
 *         &lt;element ref="{}INFO"/>
 *         &lt;element ref="{}TEMPO"/>
 *         &lt;element ref="{}LOUDNESS"/>
 *         &lt;element ref="{}CUE_V2"/>
 *         &lt;element ref="{}MUSICAL_KEY"/>
 *         &lt;element ref="{}ALBUM"/>
 *         &lt;element ref="{}PRIMARYKEY"/>
 *       &lt;/choice>
 *       &lt;attribute name="MODIFIED_DATE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MODIFIED_TIME" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="LOCK" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="LOCK_MODIFICATION_TIME" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="AUDIO_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TITLE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ARTIST" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "ENTRY")
public class ENTRY {

    @XmlElements({
        @XmlElement(name = "LOCATION", type = LOCATION.class),
        @XmlElement(name = "MODIFICATION_INFO", type = MODIFICATIONINFO.class),
        @XmlElement(name = "INFO", type = INFO.class),
        @XmlElement(name = "TEMPO", type = TEMPO.class),
        @XmlElement(name = "LOUDNESS", type = LOUDNESS.class),
        @XmlElement(name = "CUE_V2", type = CUEV2 .class),
        @XmlElement(name = "MUSICAL_KEY", type = MUSICALKEY.class),
        @XmlElement(name = "ALBUM", type = ALBUM.class),
        @XmlElement(name = "PRIMARYKEY", type = PRIMARYKEY.class)
    })
    protected List<Object> content;
    @XmlAttribute(name = "MODIFIED_DATE")
    protected String modifieddate;
    @XmlAttribute(name = "MODIFIED_TIME")
    protected Integer modifiedtime;
    @XmlAttribute(name = "LOCK")
    protected Integer lock;
    @XmlAttribute(name = "LOCK_MODIFICATION_TIME")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lockmodificationtime;
    @XmlAttribute(name = "AUDIO_ID")
    protected String audioid;
    @XmlAttribute(name = "TITLE")
    protected String title;
    @XmlAttribute(name = "ARTIST")
    protected String artist;

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCONTENT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LOCATION }
     * {@link MODIFICATIONINFO }
     * {@link INFO }
     * {@link TEMPO }
     * {@link LOUDNESS }
     * {@link CUEV2 }
     * {@link MUSICALKEY }
     * {@link ALBUM }
     * {@link PRIMARYKEY }
     * 
     * 
     */
    public List<Object> getCONTENT() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
    }

    /**
     * Gets the value of the modifieddate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMODIFIEDDATE() {
        return modifieddate;
    }

    /**
     * Sets the value of the modifieddate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMODIFIEDDATE(String value) {
        this.modifieddate = value;
    }

    /**
     * Gets the value of the modifiedtime property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMODIFIEDTIME() {
        return modifiedtime;
    }

    /**
     * Sets the value of the modifiedtime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMODIFIEDTIME(Integer value) {
        this.modifiedtime = value;
    }

    /**
     * Gets the value of the lock property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLOCK() {
        return lock;
    }

    /**
     * Sets the value of the lock property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLOCK(Integer value) {
        this.lock = value;
    }

    /**
     * Gets the value of the lockmodificationtime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLOCKMODIFICATIONTIME() {
        return lockmodificationtime;
    }

    /**
     * Sets the value of the lockmodificationtime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLOCKMODIFICATIONTIME(XMLGregorianCalendar value) {
        this.lockmodificationtime = value;
    }

    /**
     * Gets the value of the audioid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUDIOID() {
        return audioid;
    }

    /**
     * Sets the value of the audioid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUDIOID(String value) {
        this.audioid = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTITLE() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTITLE(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the artist property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getARTIST() {
        return artist;
    }

    /**
     * Sets the value of the artist property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setARTIST(String value) {
        this.artist = value;
    }

}
