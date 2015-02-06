
package soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Clearing complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Clearing">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClearingReasons" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ClearingReason" type="{http://vwfsag.de/EnhancedFolder}ClearingReason" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ClearingResponses" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ClearingResponse" type="{http://vwfsag.de/EnhancedFolder}ClearingResponse" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RedirectTargets" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RedirectTarget" type="{http://vwfsag.de/EnhancedFolder}RedirectTarget" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "Clearing", propOrder = {
    "clearingReasons",
    "clearingResponses",
    "redirectTargets"
})
public class Clearing {

    @XmlElement(name = "ClearingReasons")
    protected Clearing.ClearingReasons clearingReasons;
    @XmlElement(name = "ClearingResponses")
    protected Clearing.ClearingResponses clearingResponses;
    @XmlElement(name = "RedirectTargets")
    protected Clearing.RedirectTargets redirectTargets;

    /**
     * Ruft den Wert der clearingReasons-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Clearing.ClearingReasons }
     *     
     */
    public Clearing.ClearingReasons getClearingReasons() {
        return clearingReasons;
    }

    /**
     * Legt den Wert der clearingReasons-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Clearing.ClearingReasons }
     *     
     */
    public void setClearingReasons(Clearing.ClearingReasons value) {
        this.clearingReasons = value;
    }

    /**
     * Ruft den Wert der clearingResponses-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Clearing.ClearingResponses }
     *     
     */
    public Clearing.ClearingResponses getClearingResponses() {
        return clearingResponses;
    }

    /**
     * Legt den Wert der clearingResponses-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Clearing.ClearingResponses }
     *     
     */
    public void setClearingResponses(Clearing.ClearingResponses value) {
        this.clearingResponses = value;
    }

    /**
     * Ruft den Wert der redirectTargets-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Clearing.RedirectTargets }
     *     
     */
    public Clearing.RedirectTargets getRedirectTargets() {
        return redirectTargets;
    }

    /**
     * Legt den Wert der redirectTargets-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Clearing.RedirectTargets }
     *     
     */
    public void setRedirectTargets(Clearing.RedirectTargets value) {
        this.redirectTargets = value;
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
     *         &lt;element name="ClearingReason" type="{http://vwfsag.de/EnhancedFolder}ClearingReason" maxOccurs="unbounded" minOccurs="0"/>
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
        "clearingReason"
    })
    public static class ClearingReasons {

        @XmlElement(name = "ClearingReason")
        protected List<ClearingReason> clearingReason;

        /**
         * Gets the value of the clearingReason property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the clearingReason property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getClearingReason().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ClearingReason }
         * 
         * 
         */
        public List<ClearingReason> getClearingReason() {
            if (clearingReason == null) {
                clearingReason = new ArrayList<ClearingReason>();
            }
            return this.clearingReason;
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
     *         &lt;element name="ClearingResponse" type="{http://vwfsag.de/EnhancedFolder}ClearingResponse" maxOccurs="unbounded" minOccurs="0"/>
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
        "clearingResponse"
    })
    public static class ClearingResponses {

        @XmlElement(name = "ClearingResponse")
        protected List<ClearingResponse> clearingResponse;

        /**
         * Gets the value of the clearingResponse property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the clearingResponse property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getClearingResponse().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ClearingResponse }
         * 
         * 
         */
        public List<ClearingResponse> getClearingResponse() {
            if (clearingResponse == null) {
                clearingResponse = new ArrayList<ClearingResponse>();
            }
            return this.clearingResponse;
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
     *         &lt;element name="RedirectTarget" type="{http://vwfsag.de/EnhancedFolder}RedirectTarget" maxOccurs="unbounded" minOccurs="0"/>
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
        "redirectTarget"
    })
    public static class RedirectTargets {

        @XmlElement(name = "RedirectTarget")
        protected List<RedirectTarget> redirectTarget;

        /**
         * Gets the value of the redirectTarget property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the redirectTarget property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRedirectTarget().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RedirectTarget }
         * 
         * 
         */
        public List<RedirectTarget> getRedirectTarget() {
            if (redirectTarget == null) {
                redirectTarget = new ArrayList<RedirectTarget>();
            }
            return this.redirectTarget;
        }

    }

}
