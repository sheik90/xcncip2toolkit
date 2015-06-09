//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.09 at 08:21:17 PM CEST 
//


package org.extensiblecatalog.ncip.v2.binding.ilsdiv1_1.jaxb.elements;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
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
 *         &lt;element ref="{http://www.niso.org/2008/ncip}UserId"/>
 *         &lt;choice>
 *           &lt;element ref="{http://www.niso.org/2008/ncip}ItemId"/>
 *           &lt;sequence>
 *             &lt;element ref="{http://www.niso.org/2008/ncip}RequestId"/>
 *             &lt;element ref="{http://www.niso.org/2008/ncip}ItemId" minOccurs="0"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.niso.org/2008/ncip}RequestType"/>
 *         &lt;element ref="{http://www.niso.org/2008/ncip}RequestScopeType" minOccurs="0"/>
 *         &lt;element ref="{http://www.niso.org/2008/ncip}FiscalTransactionInformation" minOccurs="0"/>
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
    "content"
})
@XmlRootElement(name = "ItemRequestCancelled")
public class ItemRequestCancelled {

    @XmlElementRefs({
        @XmlElementRef(name = "RequestId", namespace = "http://www.niso.org/2008/ncip", type = RequestId.class),
        @XmlElementRef(name = "FiscalTransactionInformation", namespace = "http://www.niso.org/2008/ncip", type = FiscalTransactionInformation.class),
        @XmlElementRef(name = "ItemOptionalFields", namespace = "http://www.niso.org/2008/ncip", type = ItemOptionalFields.class),
        @XmlElementRef(name = "RequestType", namespace = "http://www.niso.org/2008/ncip", type = JAXBElement.class),
        @XmlElementRef(name = "UserOptionalFields", namespace = "http://www.niso.org/2008/ncip", type = UserOptionalFields.class),
        @XmlElementRef(name = "ItemId", namespace = "http://www.niso.org/2008/ncip", type = ItemId.class),
        @XmlElementRef(name = "Ext", namespace = "http://www.niso.org/2008/ncip", type = Ext.class),
        @XmlElementRef(name = "UserId", namespace = "http://www.niso.org/2008/ncip", type = UserId.class),
        @XmlElementRef(name = "RequestScopeType", namespace = "http://www.niso.org/2008/ncip", type = JAXBElement.class),
        @XmlElementRef(name = "InitiationHeader", namespace = "http://www.niso.org/2008/ncip", type = InitiationHeader.class)
    })
    protected List<Object> content;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "ItemId" is used by two different parts of a schema. See: 
     * line 1066 of file:/home/kozlovsky/workspaces/ncip/xcncip2toolkit/core/trunk/binding/ilsdiv1_1/src/main/xsd/ncip_v2_02.xsd
     * line 1063 of file:/home/kozlovsky/workspaces/ncip/xcncip2toolkit/core/trunk/binding/ilsdiv1_1/src/main/xsd/ncip_v2_02.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
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
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequestId }
     * {@link FiscalTransactionInformation }
     * {@link JAXBElement }{@code <}{@link SchemeValuePair }{@code >}
     * {@link ItemOptionalFields }
     * {@link ItemId }
     * {@link UserOptionalFields }
     * {@link Ext }
     * {@link UserId }
     * {@link JAXBElement }{@code <}{@link SchemeValuePair }{@code >}
     * {@link InitiationHeader }
     * 
     * 
     */
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
    }

}
