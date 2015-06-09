//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.09 at 08:21:17 PM CEST 
//


package org.extensiblecatalog.ncip.v2.binding.ilsdiv1_1.jaxb.elements;

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
 *         &lt;element ref="{http://www.niso.org/2008/ncip}InitiationHeader" minOccurs="0"/>
 *         &lt;element ref="{http://www.niso.org/2008/ncip}MandatedAction" minOccurs="0"/>
 *         &lt;element ref="{http://www.niso.org/2008/ncip}RequestId"/>
 *         &lt;element ref="{http://www.niso.org/2008/ncip}RequestedActionType"/>
 *         &lt;element ref="{http://www.niso.org/2008/ncip}UserId" minOccurs="0"/>
 *         &lt;element ref="{http://www.niso.org/2008/ncip}ItemId" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{http://www.niso.org/2008/ncip}DateForReturn"/>
 *           &lt;element ref="{http://www.niso.org/2008/ncip}IndeterminateLoanPeriodFlag"/>
 *           &lt;element ref="{http://www.niso.org/2008/ncip}NonReturnableFlag"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.niso.org/2008/ncip}RenewalNotPermitted" minOccurs="0"/>
 *         &lt;element ref="{http://www.niso.org/2008/ncip}FiscalTransactionInformation" minOccurs="0"/>
 *         &lt;element ref="{http://www.niso.org/2008/ncip}ItemOptionalFields" minOccurs="0"/>
 *         &lt;element ref="{http://www.niso.org/2008/ncip}UserOptionalFields" minOccurs="0"/>
 *         &lt;element ref="{http://www.niso.org/2008/ncip}PickupLocation" minOccurs="0"/>
 *         &lt;element ref="{http://www.niso.org/2008/ncip}PickupExpiryDate" minOccurs="0"/>
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
    "mandatedAction",
    "requestId",
    "requestedActionType",
    "userId",
    "itemId",
    "dateForReturn",
    "indeterminateLoanPeriodFlag",
    "nonReturnableFlag",
    "renewalNotPermitted",
    "fiscalTransactionInformation",
    "itemOptionalFields",
    "userOptionalFields",
    "pickupLocation",
    "pickupExpiryDate",
    "ext"
})
@XmlRootElement(name = "AcceptItem")
public class AcceptItem {

    @XmlElement(name = "InitiationHeader")
    protected InitiationHeader initiationHeader;
    @XmlElement(name = "MandatedAction")
    protected MandatedAction mandatedAction;
    @XmlElement(name = "RequestId", required = true)
    protected RequestId requestId;
    @XmlElement(name = "RequestedActionType", required = true)
    protected SchemeValuePair requestedActionType;
    @XmlElement(name = "UserId")
    protected UserId userId;
    @XmlElement(name = "ItemId")
    protected ItemId itemId;
    @XmlElement(name = "DateForReturn", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateForReturn;
    @XmlElement(name = "IndeterminateLoanPeriodFlag")
    protected IndeterminateLoanPeriodFlag indeterminateLoanPeriodFlag;
    @XmlElement(name = "NonReturnableFlag")
    protected NonReturnableFlag nonReturnableFlag;
    @XmlElement(name = "RenewalNotPermitted")
    protected RenewalNotPermitted renewalNotPermitted;
    @XmlElement(name = "FiscalTransactionInformation")
    protected FiscalTransactionInformation fiscalTransactionInformation;
    @XmlElement(name = "ItemOptionalFields")
    protected ItemOptionalFields itemOptionalFields;
    @XmlElement(name = "UserOptionalFields")
    protected UserOptionalFields userOptionalFields;
    @XmlElement(name = "PickupLocation")
    protected SchemeValuePair pickupLocation;
    @XmlElement(name = "PickupExpiryDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pickupExpiryDate;
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
     * Gets the value of the mandatedAction property.
     * 
     * @return
     *     possible object is
     *     {@link MandatedAction }
     *     
     */
    public MandatedAction getMandatedAction() {
        return mandatedAction;
    }

    /**
     * Sets the value of the mandatedAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandatedAction }
     *     
     */
    public void setMandatedAction(MandatedAction value) {
        this.mandatedAction = value;
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
     * Gets the value of the requestedActionType property.
     * 
     * @return
     *     possible object is
     *     {@link SchemeValuePair }
     *     
     */
    public SchemeValuePair getRequestedActionType() {
        return requestedActionType;
    }

    /**
     * Sets the value of the requestedActionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchemeValuePair }
     *     
     */
    public void setRequestedActionType(SchemeValuePair value) {
        this.requestedActionType = value;
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
     * Gets the value of the dateForReturn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getDateForReturn() {
        return dateForReturn;
    }

    /**
     * Sets the value of the dateForReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateForReturn(XMLGregorianCalendar value) {
        this.dateForReturn = value;
    }

    /**
     * Gets the value of the indeterminateLoanPeriodFlag property.
     * 
     * @return
     *     possible object is
     *     {@link IndeterminateLoanPeriodFlag }
     *     
     */
    public IndeterminateLoanPeriodFlag getIndeterminateLoanPeriodFlag() {
        return indeterminateLoanPeriodFlag;
    }

    /**
     * Sets the value of the indeterminateLoanPeriodFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndeterminateLoanPeriodFlag }
     *     
     */
    public void setIndeterminateLoanPeriodFlag(IndeterminateLoanPeriodFlag value) {
        this.indeterminateLoanPeriodFlag = value;
    }

    /**
     * Gets the value of the nonReturnableFlag property.
     * 
     * @return
     *     possible object is
     *     {@link NonReturnableFlag }
     *     
     */
    public NonReturnableFlag getNonReturnableFlag() {
        return nonReturnableFlag;
    }

    /**
     * Sets the value of the nonReturnableFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonReturnableFlag }
     *     
     */
    public void setNonReturnableFlag(NonReturnableFlag value) {
        this.nonReturnableFlag = value;
    }

    /**
     * Gets the value of the renewalNotPermitted property.
     * 
     * @return
     *     possible object is
     *     {@link RenewalNotPermitted }
     *     
     */
    public RenewalNotPermitted getRenewalNotPermitted() {
        return renewalNotPermitted;
    }

    /**
     * Sets the value of the renewalNotPermitted property.
     * 
     * @param value
     *     allowed object is
     *     {@link RenewalNotPermitted }
     *     
     */
    public void setRenewalNotPermitted(RenewalNotPermitted value) {
        this.renewalNotPermitted = value;
    }

    /**
     * Gets the value of the fiscalTransactionInformation property.
     * 
     * @return
     *     possible object is
     *     {@link FiscalTransactionInformation }
     *     
     */
    public FiscalTransactionInformation getFiscalTransactionInformation() {
        return fiscalTransactionInformation;
    }

    /**
     * Sets the value of the fiscalTransactionInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FiscalTransactionInformation }
     *     
     */
    public void setFiscalTransactionInformation(FiscalTransactionInformation value) {
        this.fiscalTransactionInformation = value;
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
     * Gets the value of the pickupLocation property.
     * 
     * @return
     *     possible object is
     *     {@link SchemeValuePair }
     *     
     */
    public SchemeValuePair getPickupLocation() {
        return pickupLocation;
    }

    /**
     * Sets the value of the pickupLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchemeValuePair }
     *     
     */
    public void setPickupLocation(SchemeValuePair value) {
        this.pickupLocation = value;
    }

    /**
     * Gets the value of the pickupExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getPickupExpiryDate() {
        return pickupExpiryDate;
    }

    /**
     * Sets the value of the pickupExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickupExpiryDate(XMLGregorianCalendar value) {
        this.pickupExpiryDate = value;
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
