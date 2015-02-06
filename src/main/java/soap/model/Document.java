
package soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für Document complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Document">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Identifiers" type="{http://vwfsag.de/BaseTypes}IdentifiersType" minOccurs="0"/>
 *         &lt;element name="ServiceAttachmentReferences" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ServiceAttachmentReference" type="{http://vwfsag.de/EnhancedFolder}ServiceAttachmentReference" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="InputChannel" type="{http://vwfsag.de/EnhancedFolder}InputChannel" minOccurs="0"/>
 *         &lt;element name="Type" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Authenticity" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Version" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SubVersion" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Description" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MimeType" type="{http://vwfsag.de/EnhancedFolder}MimeType" minOccurs="0"/>
 *         &lt;element name="Status" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Company" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PrintCounter" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IsRescanned" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NeedsSignatureAudit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsNotPartOfFolder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasBeenChecked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasAdditionalAttachments" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FolderPositionNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ScanTimeStamp" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NumberOfPages" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;totalDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ArchiveDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ArchiveTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="Variants" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Variant" type="{http://vwfsag.de/EnhancedFolder}Variant" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="References" type="{http://vwfsag.de/BaseTypes}ReferencesType" minOccurs="0"/>
 *         &lt;element name="RawFormFields" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RawFormField" type="{http://vwfsag.de/EnhancedFolder}RawFormField" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Pages" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Page" type="{http://vwfsag.de/EnhancedFolder}DocumentPage" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "Document", propOrder = {
    "id",
    "identifiers",
    "serviceAttachmentReferences",
    "inputChannel",
    "type",
    "authenticity",
    "version",
    "subVersion",
    "description",
    "mimeType",
    "status",
    "company",
    "printCounter",
    "isRescanned",
    "needsSignatureAudit",
    "isNotPartOfFolder",
    "hasBeenChecked",
    "hasAdditionalAttachments",
    "folderPositionNumber",
    "scanTimeStamp",
    "numberOfPages",
    "archiveDate",
    "archiveTime",
    "variants",
    "references",
    "rawFormFields",
    "pages",
    "clearing"
})
public class Document {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "Identifiers")
    protected IdentifiersType identifiers;
    @XmlElement(name = "ServiceAttachmentReferences")
    protected Document.ServiceAttachmentReferences serviceAttachmentReferences;
    @XmlElement(name = "InputChannel")
    protected InputChannel inputChannel;
    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "Authenticity")
    protected String authenticity;
    @XmlElement(name = "Version")
    protected String version;
    @XmlElement(name = "SubVersion")
    protected String subVersion;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "MimeType")
    protected String mimeType;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "Company")
    protected String company;
    @XmlElement(name = "PrintCounter")
    protected String printCounter;
    @XmlElement(name = "IsRescanned")
    protected Boolean isRescanned;
    @XmlElement(name = "NeedsSignatureAudit")
    protected Boolean needsSignatureAudit;
    @XmlElement(name = "IsNotPartOfFolder")
    protected Boolean isNotPartOfFolder;
    @XmlElement(name = "HasBeenChecked")
    protected Boolean hasBeenChecked;
    @XmlElement(name = "HasAdditionalAttachments")
    protected Boolean hasAdditionalAttachments;
    @XmlElement(name = "FolderPositionNumber")
    protected String folderPositionNumber;
    @XmlElement(name = "ScanTimeStamp")
    protected String scanTimeStamp;
    @XmlElement(name = "NumberOfPages")
    protected Short numberOfPages;
    @XmlElement(name = "ArchiveDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar archiveDate;
    @XmlElement(name = "ArchiveTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar archiveTime;
    @XmlElement(name = "Variants")
    protected Document.Variants variants;
    @XmlElement(name = "References")
    protected ReferencesType references;
    @XmlElement(name = "RawFormFields")
    protected Document.RawFormFields rawFormFields;
    @XmlElement(name = "Pages")
    protected Document.Pages pages;
    @XmlElement(name = "Clearing")
    protected Clearing clearing;

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Ruft den Wert der identifiers-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IdentifiersType }
     *     
     */
    public IdentifiersType getIdentifiers() {
        return identifiers;
    }

    /**
     * Legt den Wert der identifiers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifiersType }
     *     
     */
    public void setIdentifiers(IdentifiersType value) {
        this.identifiers = value;
    }

    /**
     * Ruft den Wert der serviceAttachmentReferences-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Document.ServiceAttachmentReferences }
     *     
     */
    public Document.ServiceAttachmentReferences getServiceAttachmentReferences() {
        return serviceAttachmentReferences;
    }

    /**
     * Legt den Wert der serviceAttachmentReferences-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Document.ServiceAttachmentReferences }
     *     
     */
    public void setServiceAttachmentReferences(Document.ServiceAttachmentReferences value) {
        this.serviceAttachmentReferences = value;
    }

    /**
     * Ruft den Wert der inputChannel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InputChannel }
     *     
     */
    public InputChannel getInputChannel() {
        return inputChannel;
    }

    /**
     * Legt den Wert der inputChannel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InputChannel }
     *     
     */
    public void setInputChannel(InputChannel value) {
        this.inputChannel = value;
    }

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
     * Ruft den Wert der version-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Legt den Wert der version-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Ruft den Wert der subVersion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubVersion() {
        return subVersion;
    }

    /**
     * Legt den Wert der subVersion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubVersion(String value) {
        this.subVersion = value;
    }

    /**
     * Ruft den Wert der description-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Ruft den Wert der mimeType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMimeType() {
        return mimeType;
    }

    /**
     * Legt den Wert der mimeType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMimeType(String value) {
        this.mimeType = value;
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
     * Ruft den Wert der company-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompany() {
        return company;
    }

    /**
     * Legt den Wert der company-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompany(String value) {
        this.company = value;
    }

    /**
     * Ruft den Wert der printCounter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintCounter() {
        return printCounter;
    }

    /**
     * Legt den Wert der printCounter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintCounter(String value) {
        this.printCounter = value;
    }

    /**
     * Ruft den Wert der isRescanned-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRescanned() {
        return isRescanned;
    }

    /**
     * Legt den Wert der isRescanned-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRescanned(Boolean value) {
        this.isRescanned = value;
    }

    /**
     * Ruft den Wert der needsSignatureAudit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNeedsSignatureAudit() {
        return needsSignatureAudit;
    }

    /**
     * Legt den Wert der needsSignatureAudit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNeedsSignatureAudit(Boolean value) {
        this.needsSignatureAudit = value;
    }

    /**
     * Ruft den Wert der isNotPartOfFolder-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsNotPartOfFolder() {
        return isNotPartOfFolder;
    }

    /**
     * Legt den Wert der isNotPartOfFolder-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNotPartOfFolder(Boolean value) {
        this.isNotPartOfFolder = value;
    }

    /**
     * Ruft den Wert der hasBeenChecked-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasBeenChecked() {
        return hasBeenChecked;
    }

    /**
     * Legt den Wert der hasBeenChecked-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasBeenChecked(Boolean value) {
        this.hasBeenChecked = value;
    }

    /**
     * Ruft den Wert der hasAdditionalAttachments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasAdditionalAttachments() {
        return hasAdditionalAttachments;
    }

    /**
     * Legt den Wert der hasAdditionalAttachments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasAdditionalAttachments(Boolean value) {
        this.hasAdditionalAttachments = value;
    }

    /**
     * Ruft den Wert der folderPositionNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolderPositionNumber() {
        return folderPositionNumber;
    }

    /**
     * Legt den Wert der folderPositionNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolderPositionNumber(String value) {
        this.folderPositionNumber = value;
    }

    /**
     * Ruft den Wert der scanTimeStamp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScanTimeStamp() {
        return scanTimeStamp;
    }

    /**
     * Legt den Wert der scanTimeStamp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScanTimeStamp(String value) {
        this.scanTimeStamp = value;
    }

    /**
     * Ruft den Wert der numberOfPages-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNumberOfPages() {
        return numberOfPages;
    }

    /**
     * Legt den Wert der numberOfPages-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNumberOfPages(Short value) {
        this.numberOfPages = value;
    }

    /**
     * Ruft den Wert der archiveDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArchiveDate() {
        return archiveDate;
    }

    /**
     * Legt den Wert der archiveDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArchiveDate(XMLGregorianCalendar value) {
        this.archiveDate = value;
    }

    /**
     * Ruft den Wert der archiveTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArchiveTime() {
        return archiveTime;
    }

    /**
     * Legt den Wert der archiveTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArchiveTime(XMLGregorianCalendar value) {
        this.archiveTime = value;
    }

    /**
     * Ruft den Wert der variants-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Document.Variants }
     *     
     */
    public Document.Variants getVariants() {
        return variants;
    }

    /**
     * Legt den Wert der variants-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Document.Variants }
     *     
     */
    public void setVariants(Document.Variants value) {
        this.variants = value;
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
     * Ruft den Wert der rawFormFields-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Document.RawFormFields }
     *     
     */
    public Document.RawFormFields getRawFormFields() {
        return rawFormFields;
    }

    /**
     * Legt den Wert der rawFormFields-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Document.RawFormFields }
     *     
     */
    public void setRawFormFields(Document.RawFormFields value) {
        this.rawFormFields = value;
    }

    /**
     * Ruft den Wert der pages-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Document.Pages }
     *     
     */
    public Document.Pages getPages() {
        return pages;
    }

    /**
     * Legt den Wert der pages-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Document.Pages }
     *     
     */
    public void setPages(Document.Pages value) {
        this.pages = value;
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
     *         &lt;element name="Page" type="{http://vwfsag.de/EnhancedFolder}DocumentPage" maxOccurs="unbounded" minOccurs="0"/>
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
        "page"
    })
    public static class Pages {

        @XmlElement(name = "Page")
        protected List<DocumentPage> page;

        /**
         * Gets the value of the page property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the page property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DocumentPage }
         * 
         * 
         */
        public List<DocumentPage> getPage() {
            if (page == null) {
                page = new ArrayList<DocumentPage>();
            }
            return this.page;
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
     *         &lt;element name="RawFormField" type="{http://vwfsag.de/EnhancedFolder}RawFormField" maxOccurs="unbounded" minOccurs="0"/>
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
        "rawFormField"
    })
    public static class RawFormFields {

        @XmlElement(name = "RawFormField")
        protected List<RawFormField> rawFormField;

        /**
         * Gets the value of the rawFormField property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the rawFormField property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRawFormField().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RawFormField }
         * 
         * 
         */
        public List<RawFormField> getRawFormField() {
            if (rawFormField == null) {
                rawFormField = new ArrayList<RawFormField>();
            }
            return this.rawFormField;
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
     *         &lt;element name="ServiceAttachmentReference" type="{http://vwfsag.de/EnhancedFolder}ServiceAttachmentReference" maxOccurs="unbounded" minOccurs="0"/>
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
        "serviceAttachmentReference"
    })
    public static class ServiceAttachmentReferences {

        @XmlElement(name = "ServiceAttachmentReference")
        protected List<ServiceAttachmentReference> serviceAttachmentReference;

        /**
         * Gets the value of the serviceAttachmentReference property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the serviceAttachmentReference property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getServiceAttachmentReference().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ServiceAttachmentReference }
         * 
         * 
         */
        public List<ServiceAttachmentReference> getServiceAttachmentReference() {
            if (serviceAttachmentReference == null) {
                serviceAttachmentReference = new ArrayList<ServiceAttachmentReference>();
            }
            return this.serviceAttachmentReference;
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
     *         &lt;element name="Variant" type="{http://vwfsag.de/EnhancedFolder}Variant" maxOccurs="unbounded" minOccurs="0"/>
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
        "variant"
    })
    public static class Variants {

        @XmlElement(name = "Variant")
        protected List<Variant> variant;

        /**
         * Gets the value of the variant property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the variant property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVariant().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Variant }
         * 
         * 
         */
        public List<Variant> getVariant() {
            if (variant == null) {
                variant = new ArrayList<Variant>();
            }
            return this.variant;
        }

    }

}
