//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.11 at 02:59:27 PM CEST 
//


package org.extensiblecatalog.ncip.v2.binding.ilsdiv1_1.jaxb.elements;

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
 *         &lt;element ref="{http://www.niso.org/2008/ncip}InitiationHeader" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element ref="{http://www.niso.org/2008/ncip}UserId"/>
 *             &lt;element ref="{http://www.niso.org/2008/ncip}ItemId"/>
 *             &lt;element ref="{http://www.niso.org/2008/ncip}RequestType"/>
 *           &lt;/sequence>
 *           &lt;element ref="{http://www.niso.org/2008/ncip}RequestId"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.niso.org/2008/ncip}DeleteRequestFields" minOccurs="0"/>
 *         &lt;element ref="{http://www.niso.org/2008/ncip}AddRequestFields" minOccurs="0"/>
 *         &lt;element ref="{http://www.niso.org/2008/ncip}ItemOptionalFields" minOccurs="0"/>
 *         &lt;element ref="{http://www.niso.org/2008/ncip}UserOptionalFields" minOccurs="0"/>
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
    "initiationHeader",
    "userId",
    "itemId",
    "requestType",
    "requestId",
    "deleteRequestFields",
    "addRequestFields",
    "itemOptionalFields",
    "userOptionalFields",
    "ext"
})
@XmlRootElement(name = "ItemRequestUpdated")
public class ItemRequestUpdated {

    @XmlElement(name = "InitiationHeader")
    protected InitiationHeader initiationHeader;
    @XmlElement(name = "UserId")
    protected UserId userId;
    @XmlElement(name = "ItemId")
    protected ItemId itemId;
    @XmlElement(name = "RequestType")
    protected SchemeValuePair requestType;
    @XmlElement(name = "RequestId")
    protected RequestId requestId;
    @XmlElement(name = "DeleteRequestFields")
    protected DeleteRequestFields deleteRequestFields;
    @XmlElement(name = "AddRequestFields")
    protected AddRequestFields addRequestFields;
    @XmlElement(name = "ItemOptionalFields")
    protected ItemOptionalFields itemOptionalFields;
    @XmlElement(name = "UserOptionalFields")
    protected UserOptionalFields userOptionalFields;
    @XmlElement(name = "Ext")
    protected Ext ext;

    /**
     * Gets the value of the initiationHeader property.
     * 
     * @return
     *     possible object is
     *     {@link InitiationHeader }
     *     
     */
    public InitiationHeader getInitiationHeader() {
        return initiationHeader;
    }

    /**
     * Sets the value of the initiationHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link InitiationHeader }
     *     
     */
    public void setInitiationHeader(InitiationHeader value) {
        this.initiationHeader = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link UserId }
     *     
     */
    public UserId getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserId }
     *     
     */
    public void setUserId(UserId value) {
        this.userId = value;
    }

    /**
     * Gets the value of the itemId property.
     * 
     * @return
     *     possible object is
     *     {@link ItemId }
     *     
     */
    public ItemId getItemId() {
        return itemId;
    }

    /**
     * Sets the value of the itemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemId }
     *     
     */
    public void setItemId(ItemId value) {
        this.itemId = value;
    }

    /**
     * Gets the value of the requestType property.
     * 
     * @return
     *     possible object is
     *     {@link SchemeValuePair }
     *     
     */
    public SchemeValuePair getRequestType() {
        return requestType;
    }

    /**
     * Sets the value of the requestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchemeValuePair }
     *     
     */
    public void setRequestType(SchemeValuePair value) {
        this.requestType = value;
    }

    /**
     * Gets the value of the requestId property.
     * 
     * @return
     *     possible object is
     *     {@link RequestId }
     *     
     */
    public RequestId getRequestId() {
        return requestId;
    }

    /**
     * Sets the value of the requestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestId }
     *     
     */
    public void setRequestId(RequestId value) {
        this.requestId = value;
    }

    /**
     * Gets the value of the deleteRequestFields property.
     * 
     * @return
     *     possible object is
     *     {@link DeleteRequestFields }
     *     
     */
    public DeleteRequestFields getDeleteRequestFields() {
        return deleteRequestFields;
    }

    /**
     * Sets the value of the deleteRequestFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteRequestFields }
     *     
     */
    public void setDeleteRequestFields(DeleteRequestFields value) {
        this.deleteRequestFields = value;
    }

    /**
     * Gets the value of the addRequestFields property.
     * 
     * @return
     *     possible object is
     *     {@link AddRequestFields }
     *     
     */
    public AddRequestFields getAddRequestFields() {
        return addRequestFields;
    }

    /**
     * Sets the value of the addRequestFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddRequestFields }
     *     
     */
    public void setAddRequestFields(AddRequestFields value) {
        this.addRequestFields = value;
    }

    /**
     * Gets the value of the itemOptionalFields property.
     * 
     * @return
     *     possible object is
     *     {@link ItemOptionalFields }
     *     
     */
    public ItemOptionalFields getItemOptionalFields() {
        return itemOptionalFields;
    }

    /**
     * Sets the value of the itemOptionalFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemOptionalFields }
     *     
     */
    public void setItemOptionalFields(ItemOptionalFields value) {
        this.itemOptionalFields = value;
    }

    /**
     * Gets the value of the userOptionalFields property.
     * 
     * @return
     *     possible object is
     *     {@link UserOptionalFields }
     *     
     */
    public UserOptionalFields getUserOptionalFields() {
        return userOptionalFields;
    }

    /**
     * Sets the value of the userOptionalFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserOptionalFields }
     *     
     */
    public void setUserOptionalFields(UserOptionalFields value) {
        this.userOptionalFields = value;
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