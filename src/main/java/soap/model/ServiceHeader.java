
package soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ServiceHeader complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ServiceHeader">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProcessContext" type="{http://vwfsag.de/EnhancedFolder}ProcessContext" minOccurs="0"/>
 *         &lt;element name="TestContext" type="{http://vwfsag.de/EnhancedFolder}TestContext" minOccurs="0"/>
 *         &lt;element name="LandscapeContext" type="{http://vwfsag.de/BaseTypes}LandscapeContext" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceHeader", propOrder = {
    "processContext",
    "testContext",
    "landscapeContext"
})
public class ServiceHeader {

    @XmlElement(name = "ProcessContext")
    protected ProcessContext processContext;
    @XmlElement(name = "TestContext")
    protected TestContext testContext;
    @XmlElement(name = "LandscapeContext")
    protected LandscapeContext landscapeContext;

    /**
     * Ruft den Wert der processContext-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ProcessContext }
     *     
     */
    public ProcessContext getProcessContext() {
        return processContext;
    }

    /**
     * Legt den Wert der processContext-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessContext }
     *     
     */
    public void setProcessContext(ProcessContext value) {
        this.processContext = value;
    }

    /**
     * Ruft den Wert der testContext-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TestContext }
     *     
     */
    public TestContext getTestContext() {
        return testContext;
    }

    /**
     * Legt den Wert der testContext-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TestContext }
     *     
     */
    public void setTestContext(TestContext value) {
        this.testContext = value;
    }

    /**
     * Ruft den Wert der landscapeContext-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LandscapeContext }
     *     
     */
    public LandscapeContext getLandscapeContext() {
        return landscapeContext;
    }

    /**
     * Legt den Wert der landscapeContext-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LandscapeContext }
     *     
     */
    public void setLandscapeContext(LandscapeContext value) {
        this.landscapeContext = value;
    }

}
