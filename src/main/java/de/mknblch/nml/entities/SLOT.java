//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.06 at 01:50:06 PM CEST 
//


package de.mknblch.nml.entities;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{}CELL" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="KEYLOCK" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="FXENABLE" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="PUNCHMODE" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="ACTIVE_CELL_INDEX" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cell"
})
@XmlRootElement(name = "SLOT")
public class SLOT {

    @XmlElement(name = "CELL")
    protected List<CELL> cell;
    @XmlAttribute(name = "KEYLOCK")
    protected Integer keylock;
    @XmlAttribute(name = "FXENABLE")
    protected Integer fxenable;
    @XmlAttribute(name = "PUNCHMODE")
    protected Integer punchmode;
    @XmlAttribute(name = "ACTIVE_CELL_INDEX")
    protected Integer activecellindex;

    /**
     * Gets the value of the cell property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cell property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCELL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CELL }
     * 
     * 
     */
    public List<CELL> getCELL() {
        if (cell == null) {
            cell = new ArrayList<CELL>();
        }
        return this.cell;
    }

    /**
     * Gets the value of the keylock property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getKEYLOCK() {
        return keylock;
    }

    /**
     * Sets the value of the keylock property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKEYLOCK(Integer value) {
        this.keylock = value;
    }

    /**
     * Gets the value of the fxenable property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFXENABLE() {
        return fxenable;
    }

    /**
     * Sets the value of the fxenable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFXENABLE(Integer value) {
        this.fxenable = value;
    }

    /**
     * Gets the value of the punchmode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPUNCHMODE() {
        return punchmode;
    }

    /**
     * Sets the value of the punchmode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPUNCHMODE(Integer value) {
        this.punchmode = value;
    }

    /**
     * Gets the value of the activecellindex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getACTIVECELLINDEX() {
        return activecellindex;
    }

    /**
     * Sets the value of the activecellindex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setACTIVECELLINDEX(Integer value) {
        this.activecellindex = value;
    }

}
