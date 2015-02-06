
package soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Angereicherte Mappe zur Verteilung
 * 
 * <p>Java-Klasse für EnhancedFolderAttachmentProcessMessage complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="EnhancedFolderAttachmentProcessMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceHeader" type="{http://vwfsag.de/EnhancedFolder}ServiceHeader" minOccurs="0"/>
 *         &lt;element name="ServiceRequest" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="EnhancedFolder" type="{http://vwfsag.de/EnhancedFolder}EnhancedFolder" minOccurs="0"/>
 *                   &lt;element name="AttachmentReferences" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="AttachmentReference" type="{http://vwfsag.de/EnhancedFolder}AttachmentReference" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnhancedFolderAttachmentProcessMessage", propOrder = {
    "serviceHeader",
    "serviceRequest"
})
public class EnhancedFolderAttachmentProcessMessage {

    @XmlElement(name = "ServiceHeader")
    protected ServiceHeader serviceHeader;
    @XmlElement(name = "ServiceRequest")
    protected EnhancedFolderAttachmentProcessMessage.ServiceRequest serviceRequest;

    /**
     * Ruft den Wert der serviceHeader-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ServiceHeader }
     *     
     */
    public ServiceHeader getServiceHeader() {
        return serviceHeader;
    }

    /**
     * Legt den Wert der serviceHeader-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceHeader }
     *     
     */
    public void setServiceHeader(ServiceHeader value) {
        this.serviceHeader = value;
    }

    /**
     * Ruft den Wert der serviceRequest-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EnhancedFolderAttachmentProcessMessage.ServiceRequest }
     *     
     */
    public EnhancedFolderAttachmentProcessMessage.ServiceRequest getServiceRequest() {
        return serviceRequest;
    }

    /**
     * Legt den Wert der serviceRequest-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EnhancedFolderAttachmentProcessMessage.ServiceRequest }
     *     
     */
    public void setServiceRequest(EnhancedFolderAttachmentProcessMessage.ServiceRequest value) {
        this.serviceRequest = value;
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
     *         &lt;element name="EnhancedFolder" type="{http://vwfsag.de/EnhancedFolder}EnhancedFolder" minOccurs="0"/>
     *         &lt;element name="AttachmentReferences" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="AttachmentReference" type="{http://vwfsag.de/EnhancedFolder}AttachmentReference" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "enhancedFolder",
        "attachmentReferences"
    })
    public static class ServiceRequest {

        @XmlElement(name = "EnhancedFolder")
        protected EnhancedFolder enhancedFolder;
        @XmlElement(name = "AttachmentReferences")
        protected EnhancedFolderAttachmentProcessMessage.ServiceRequest.AttachmentReferences attachmentReferences;

        /**
         * Ruft den Wert der enhancedFolder-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link EnhancedFolder }
         *     
         */
        public EnhancedFolder getEnhancedFolder() {
            return enhancedFolder;
        }

        /**
         * Legt den Wert der enhancedFolder-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link EnhancedFolder }
         *     
         */
        public void setEnhancedFolder(EnhancedFolder value) {
            this.enhancedFolder = value;
        }

        /**
         * Ruft den Wert der attachmentReferences-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link EnhancedFolderAttachmentProcessMessage.ServiceRequest.AttachmentReferences }
         *     
         */
        public EnhancedFolderAttachmentProcessMessage.ServiceRequest.AttachmentReferences getAttachmentReferences() {
            return attachmentReferences;
        }

        /**
         * Legt den Wert der attachmentReferences-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link EnhancedFolderAttachmentProcessMessage.ServiceRequest.AttachmentReferences }
         *     
         */
        public void setAttachmentReferences(EnhancedFolderAttachmentProcessMessage.ServiceRequest.AttachmentReferences value) {
            this.attachmentReferences = value;
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
         *         &lt;element name="AttachmentReference" type="{http://vwfsag.de/EnhancedFolder}AttachmentReference" maxOccurs="unbounded" minOccurs="0"/>
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
            "attachmentReference"
        })
        public static class AttachmentReferences {

            @XmlElement(name = "AttachmentReference")
            protected List<AttachmentReference> attachmentReference;

            /**
             * Gets the value of the attachmentReference property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the attachmentReference property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAttachmentReference().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AttachmentReference }
             * 
             * 
             */
            public List<AttachmentReference> getAttachmentReference() {
                if (attachmentReference == null) {
                    attachmentReference = new ArrayList<AttachmentReference>();
                }
                return this.attachmentReference;
            }

        }

    }

}
