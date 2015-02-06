
package soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Referenzen auf ein dem HTTP-Request angehängtes Datenobjekt
 *                     
 * 
 * <p>Java-Klasse für AttachmentReference complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AttachmentReference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReferenceId" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="32"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Attachment" type="{http://vwfsag.de/BaseTypes}Attachment" minOccurs="0"/>
 *         &lt;element name="AttachmentContent" type="{http://vwfsag.de/BaseTypes}AttachmentV2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachmentReference", propOrder = {
    "referenceId",
    "attachment",
    "attachmentContent"
})
public class AttachmentReference {

    @XmlElement(name = "ReferenceId")
    protected String referenceId;
    @XmlElement(name = "Attachment")
    protected Attachment attachment;
    @XmlElement(name = "AttachmentContent")
    protected AttachmentV2 attachmentContent;

    /**
     * Ruft den Wert der referenceId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceId() {
        return referenceId;
    }

    /**
     * Legt den Wert der referenceId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceId(String value) {
        this.referenceId = value;
    }

    /**
     * Ruft den Wert der attachment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Attachment }
     *     
     */
    public Attachment getAttachment() {
        return attachment;
    }

    /**
     * Legt den Wert der attachment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Attachment }
     *     
     */
    public void setAttachment(Attachment value) {
        this.attachment = value;
    }

    /**
     * Ruft den Wert der attachmentContent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AttachmentV2 }
     *     
     */
    public AttachmentV2 getAttachmentContent() {
        return attachmentContent;
    }

    /**
     * Legt den Wert der attachmentContent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachmentV2 }
     *     
     */
    public void setAttachmentContent(AttachmentV2 value) {
        this.attachmentContent = value;
    }

}
