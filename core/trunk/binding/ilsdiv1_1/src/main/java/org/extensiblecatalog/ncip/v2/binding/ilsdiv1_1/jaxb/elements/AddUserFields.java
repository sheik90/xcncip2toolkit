//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.09 at 08:21:17 PM CEST 
//


package org.extensiblecatalog.ncip.v2.binding.ilsdiv1_1.jaxb.elements;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 *       &lt;sequence>
 *         &lt;element ref="{http://www.niso.org/2008/ncip}AuthenticationInput" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.niso.org/2008/ncip}NameInformation" minOccurs="0"/>
 *         &lt;element ref="{http://www.niso.org/2008/ncip}UserAddressInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.niso.org/2008/ncip}DateOfBirth" minOccurs="0"/>
 *         &lt;element ref="{http://www.niso.org/2008/ncip}UserLanguage" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.niso.org/2008/ncip}UserPrivilege" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.niso.org/2008/ncip}BlockOrTrap" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.niso.org/2008/ncip}Ext" minOccurs="0"/>
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
    "authenticationInput",
    "nameInformation",
    "userAddressInformation",
    "dateOfBirth",
    "userLanguage",
    "userPrivilege",
    "blockOrTrap",
    "ext"
})
@XmlRootElement(name = "AddUserFields")
public class AddUserFields {

    @XmlElement(name = "AuthenticationInput")
    protected List<AuthenticationInput> authenticationInput;
    @XmlElement(name = "NameInformation")
    protected NameInformation nameInformation;
    @XmlElement(name = "UserAddressInformation")
    protected List<UserAddressInformation> userAddressInformation;
    @XmlElement(name = "DateOfBirth", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOfBirth;
    @XmlElement(name = "UserLanguage")
    protected List<SchemeValuePair> userLanguage;
    @XmlElement(name = "UserPrivilege")
    protected List<UserPrivilege> userPrivilege;
    @XmlElement(name = "BlockOrTrap")
    protected List<BlockOrTrap> blockOrTrap;
    @XmlElement(name = "Ext")
    protected Ext ext;

    /**
     * Gets the value of the authenticationInput property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authenticationInput property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthenticationInput().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuthenticationInput }
     * 
     * 
     */
    public List<AuthenticationInput> getAuthenticationInput() {
        if (authenticationInput == null) {
            authenticationInput = new ArrayList<AuthenticationInput>();
        }
        return this.authenticationInput;
    }

    /**
     * Gets the value of the nameInformation property.
     * 
     * @return
     *     possible object is
     *     {@link NameInformation }
     *     
     */
    public NameInformation getNameInformation() {
        return nameInformation;
    }

    /**
     * Sets the value of the nameInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameInformation }
     *     
     */
    public void setNameInformation(NameInformation value) {
        this.nameInformation = value;
    }

    /**
     * Gets the value of the userAddressInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userAddressInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserAddressInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserAddressInformation }
     * 
     * 
     */
    public List<UserAddressInformation> getUserAddressInformation() {
        if (userAddressInformation == null) {
            userAddressInformation = new ArrayList<UserAddressInformation>();
        }
        return this.userAddressInformation;
    }

    /**
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOfBirth(XMLGregorianCalendar value) {
        this.dateOfBirth = value;
    }

    /**
     * Gets the value of the userLanguage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userLanguage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserLanguage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SchemeValuePair }
     * 
     * 
     */
    public List<SchemeValuePair> getUserLanguage() {
        if (userLanguage == null) {
            userLanguage = new ArrayList<SchemeValuePair>();
        }
        return this.userLanguage;
    }

    /**
     * Gets the value of the userPrivilege property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userPrivilege property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserPrivilege().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserPrivilege }
     * 
     * 
     */
    public List<UserPrivilege> getUserPrivilege() {
        if (userPrivilege == null) {
            userPrivilege = new ArrayList<UserPrivilege>();
        }
        return this.userPrivilege;
    }

    /**
     * Gets the value of the blockOrTrap property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the blockOrTrap property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBlockOrTrap().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BlockOrTrap }
     * 
     * 
     */
    public List<BlockOrTrap> getBlockOrTrap() {
        if (blockOrTrap == null) {
            blockOrTrap = new ArrayList<BlockOrTrap>();
        }
        return this.blockOrTrap;
    }

    /**
     * Gets the value of the ext property.
     * 
     * @return
     *     possible object is
     *     {@link Ext }
     *     
     */
    public Ext getExt() {
        return ext;
    }

    /**
     * Sets the value of the ext property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ext }
     *     
     */
    public void setExt(Ext value) {
        this.ext = value;
    }

}
