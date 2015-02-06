
package soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DocumentPage complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DocumentPage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdentifierGroups" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="IdentifierGroup" type="{http://vwfsag.de/BasePatterns}IdentifierGroup" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PageNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Authenticity" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BarcodeData" type="{http://vwfsag.de/EnhancedFolder}Barcode" minOccurs="0"/>
 *         &lt;element name="FormFields" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FormField" type="{http://vwfsag.de/EnhancedFolder}FormField" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Clearing" type="{http://vwfsag.de/EnhancedFolder}Clearing" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentPage", propOrder = {
    "identifierGroups",
    "pageNumber",
    "authenticity",
    "barcodeData",
    "formFields",
    "clearing"
})
public class DocumentPage {

    @XmlElement(name = "IdentifierGroups")
    protected DocumentPage.IdentifierGroups identifierGroups;
    @XmlElement(name = "PageNumber")
    protected String pageNumber;
    @XmlElement(name = "Authenticity")
    protected String authenticity;
    @XmlElement(name = "BarcodeData")
    protected Barcode barcodeData;
    @XmlElement(name = "FormFields")
    protected DocumentPage.FormFields formFields;
    @XmlElement(name = "Clearing")
    protected Clearing clearing;

    /**
     * Ruft den Wert der identifierGroups-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DocumentPage.IdentifierGroups }
     *     
     */
    public DocumentPage.IdentifierGroups getIdentifierGroups() {
        return identifierGroups;
    }

    /**
     * Legt den Wert der identifierGroups-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentPage.IdentifierGroups }
     *     
     */
    public void setIdentifierGroups(DocumentPage.IdentifierGroups value) {
        this.identifierGroups = value;
    }

    /**
     * Ruft den Wert der pageNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageNumber() {
        return pageNumber;
    }

    /**
     * Legt den Wert der pageNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageNumber(String value) {
        this.pageNumber = value;
    }

    /**
     * Ruft den Wert der authenticity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticity() {
        return authenticity;
    }

    /**
     * Legt den Wert der authenticity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticity(String value) {
        this.authenticity = value;
    }

    /**
     * Ruft den Wert der barcodeData-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Barcode }
     *     
     */
    public Barcode getBarcodeData() {
        return barcodeData;
    }

    /**
     * Legt den Wert der barcodeData-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Barcode }
     *     
     */
    public void setBarcodeData(Barcode value) {
        this.barcodeData = value;
    }

    /**
     * Ruft den Wert der formFields-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DocumentPage.FormFields }
     *     
     */
    public DocumentPage.FormFields getFormFields() {
        return formFields;
    }

    /**
     * Legt den Wert der formFields-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentPage.FormFields }
     *     
     */
    public void setFormFields(DocumentPage.FormFields value) {
        this.formFields = value;
    }

    /**
     * Ruft den Wert der clearing-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Clearing }
     *     
     */
    public Clearing getClearing() {
        return clearing;
    }

    /**
     * Legt den Wert der clearing-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Clearing }
     *     
     */
    public void setClearing(Clearing value) {
        this.clearing = value;
    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="FormField" type="{http://vwfsag.de/EnhancedFolder}FormField" maxOccurs="unbounded" minOccurs="0"/>
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
        "formField"
    })
    public static class FormFields {

        @XmlElement(name = "FormField")
        protected List<FormField> formField;

        /**
         * Gets the value of the formField property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the formField property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFormField().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FormField }
         * 
         * 
         */
        public List<FormField> getFormField() {
            if (formField == null) {
                formField = new ArrayList<FormField>();
            }
            return this.formField;
        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="IdentifierGroup" type="{http://vwfsag.de/BasePatterns}IdentifierGroup" maxOccurs="unbounded" minOccurs="0"/>
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
        "identifierGroup"
    })
    public static class IdentifierGroups {

        @XmlElement(name = "IdentifierGroup")
        protected List<IdentifierGroup> identifierGroup;

        /**
         * Gets the value of the identifierGroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the identifierGroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIdentifierGroup().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IdentifierGroup }
         * 
         * 
         */
        public List<IdentifierGroup> getIdentifierGroup() {
            if (identifierGroup == null) {
                identifierGroup = new ArrayList<IdentifierGroup>();
            }
            return this.identifierGroup;
        }

    }

}
