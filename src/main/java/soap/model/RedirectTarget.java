
package soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für RedirectTarget complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RedirectTarget">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrganisationalUnit" type="{http://vwfsag.de/EnhancedFolder}OrganisationalUnit" minOccurs="0"/>
 *         &lt;element name="Application" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="System" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
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
@XmlType(name = "RedirectTarget", propOrder = {
    "organisationalUnit",
    "application",
    "system"
})
public class RedirectTarget {

    @XmlElement(name = "OrganisationalUnit")
    protected OrganisationalUnit organisationalUnit;
    @XmlElement(name = "Application")
    protected String application;
    @XmlElement(name = "System")
    protected String system;

    /**
     * Ruft den Wert der organisationalUnit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationalUnit }
     *     
     */
    public OrganisationalUnit getOrganisationalUnit() {
        return organisationalUnit;
    }

    /**
     * Legt den Wert der organisationalUnit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationalUnit }
     *     
     */
    public void setOrganisationalUnit(OrganisationalUnit value) {
        this.organisationalUnit = value;
    }

    /**
     * Ruft den Wert der application-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplication() {
        return application;
    }

    /**
     * Legt den Wert der application-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplication(String value) {
        this.application = value;
    }

    /**
     * Ruft den Wert der system-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystem() {
        return system;
    }

    /**
     * Legt den Wert der system-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystem(String value) {
        this.system = value;
    }

}
