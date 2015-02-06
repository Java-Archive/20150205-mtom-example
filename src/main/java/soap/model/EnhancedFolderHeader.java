
package soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für EnhancedFolderHeader complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="EnhancedFolderHeader">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdentifierGroups" type="{http://vwfsag.de/BasePatterns}IdentifierGroups" minOccurs="0"/>
 *         &lt;element name="FolderId" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="32"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FolderType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Status" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ReceiptDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="InputChannel" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Type" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="IsProcessed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsSubsequentDelivery" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Pile" type="{http://vwfsag.de/EnhancedFolder}FolderPile" minOccurs="0"/>
 *         &lt;element name="References" type="{http://vwfsag.de/BaseTypes}ReferencesType" minOccurs="0"/>
 *         &lt;element name="FolderTargets" type="{http://vwfsag.de/EnhancedFolder}FolderTargets" minOccurs="0"/>
 *         &lt;element name="Clearing" type="{http://vwfsag.de/EnhancedFolder}HeaderClearing" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnhancedFolderHeader", propOrder = {
    "identifierGroups",
    "folderId",
    "folderType",
    "status",
    "receiptDate",
    "inputChannel",
    "isProcessed",
    "isSubsequentDelivery",
    "pile",
    "references",
    "folderTargets",
    "clearing"
})
public class EnhancedFolderHeader {

    @XmlElement(name = "IdentifierGroups")
    protected IdentifierGroups identifierGroups;
    @XmlElement(name = "FolderId")
    protected String folderId;
    @XmlElement(name = "FolderType")
    protected String folderType;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "ReceiptDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar receiptDate;
    @XmlElement(name = "InputChannel")
    protected EnhancedFolderHeader.InputChannel inputChannel;
    @XmlElement(name = "IsProcessed")
    protected Boolean isProcessed;
    @XmlElement(name = "IsSubsequentDelivery")
    protected Boolean isSubsequentDelivery;
    @XmlElement(name = "Pile")
    protected FolderPile pile;
    @XmlElement(name = "References")
    protected ReferencesType references;
    @XmlElement(name = "FolderTargets")
    protected FolderTargets folderTargets;
    @XmlElement(name = "Clearing")
    protected HeaderClearing clearing;

    /**
     * Ruft den Wert der identifierGroups-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierGroups }
     *     
     */
    public IdentifierGroups getIdentifierGroups() {
        return identifierGroups;
    }

    /**
     * Legt den Wert der identifierGroups-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierGroups }
     *     
     */
    public void setIdentifierGroups(IdentifierGroups value) {
        this.identifierGroups = value;
    }

    /**
     * Ruft den Wert der folderId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolderId() {
        return folderId;
    }

    /**
     * Legt den Wert der folderId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolderId(String value) {
        this.folderId = value;
    }

    /**
     * Ruft den Wert der folderType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolderType() {
        return folderType;
    }

    /**
     * Legt den Wert der folderType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolderType(String value) {
        this.folderType = value;
    }

    /**
     * Ruft den Wert der status-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Legt den Wert der status-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Ruft den Wert der receiptDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReceiptDate() {
        return receiptDate;
    }

    /**
     * Legt den Wert der receiptDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReceiptDate(XMLGregorianCalendar value) {
        this.receiptDate = value;
    }

    /**
     * Ruft den Wert der inputChannel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EnhancedFolderHeader.InputChannel }
     *     
     */
    public EnhancedFolderHeader.InputChannel getInputChannel() {
        return inputChannel;
    }

    /**
     * Legt den Wert der inputChannel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EnhancedFolderHeader.InputChannel }
     *     
     */
    public void setInputChannel(EnhancedFolderHeader.InputChannel value) {
        this.inputChannel = value;
    }

    /**
     * Ruft den Wert der isProcessed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsProcessed() {
        return isProcessed;
    }

    /**
     * Legt den Wert der isProcessed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsProcessed(Boolean value) {
        this.isProcessed = value;
    }

    /**
     * Ruft den Wert der isSubsequentDelivery-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSubsequentDelivery() {
        return isSubsequentDelivery;
    }

    /**
     * Legt den Wert der isSubsequentDelivery-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSubsequentDelivery(Boolean value) {
        this.isSubsequentDelivery = value;
    }

    /**
     * Ruft den Wert der pile-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FolderPile }
     *     
     */
    public FolderPile getPile() {
        return pile;
    }

    /**
     * Legt den Wert der pile-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FolderPile }
     *     
     */
    public void setPile(FolderPile value) {
        this.pile = value;
    }

    /**
     * Ruft den Wert der references-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReferencesType }
     *     
     */
    public ReferencesType getReferences() {
        return references;
    }

    /**
     * Legt den Wert der references-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferencesType }
     *     
     */
    public void setReferences(ReferencesType value) {
        this.references = value;
    }

    /**
     * Ruft den Wert der folderTargets-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FolderTargets }
     *     
     */
    public FolderTargets getFolderTargets() {
        return folderTargets;
    }

    /**
     * Legt den Wert der folderTargets-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FolderTargets }
     *     
     */
    public void setFolderTargets(FolderTargets value) {
        this.folderTargets = value;
    }

    /**
     * Ruft den Wert der clearing-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link HeaderClearing }
     *     
     */
    public HeaderClearing getClearing() {
        return clearing;
    }

    /**
     * Legt den Wert der clearing-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderClearing }
     *     
     */
    public void setClearing(HeaderClearing value) {
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
     *         &lt;element name="Type" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "type",
        "value"
    })
    public static class InputChannel {

        @XmlElement(name = "Type")
        protected String type;
        @XmlElement(name = "Value")
        protected String value;

        /**
         * Ruft den Wert der type-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Legt den Wert der type-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

        /**
         * Ruft den Wert der value-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Legt den Wert der value-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

    }

}
