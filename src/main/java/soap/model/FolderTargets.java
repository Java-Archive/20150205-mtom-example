
package soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für FolderTargets complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FolderTargets">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FolderTarget" type="{http://vwfsag.de/EnhancedFolder}FolderTarget" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FolderTargets", propOrder = {
    "folderTarget"
})
public class FolderTargets {

    @XmlElement(name = "FolderTarget")
    protected List<FolderTarget> folderTarget;

    /**
     * Gets the value of the folderTarget property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the folderTarget property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFolderTarget().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FolderTarget }
     * 
     * 
     */
    public List<FolderTarget> getFolderTarget() {
        if (folderTarget == null) {
            folderTarget = new ArrayList<FolderTarget>();
        }
        return this.folderTarget;
    }

}
