//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.22 at 12:17:05 PM CET 
//


package de.mknblch.nml.entities.traktor_19;

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
 *         &lt;element ref="{}NODE"/>
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
    "node"
})
@XmlRootElement(name = "PLAYLISTS")
public class PLAYLISTS {

    @XmlElement(name = "NODE", required = true)
    protected NODE node;

    /**
     * Gets the value of the node property.
     * 
     * @return
     *     possible object is
     *     {@link NODE }
     *     
     */
    public NODE getNODE() {
        return node;
    }

    /**
     * Sets the value of the node property.
     * 
     * @param value
     *     allowed object is
     *     {@link NODE }
     *     
     */
    public void setNODE(NODE value) {
        this.node = value;
    }

}
