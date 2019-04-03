
package generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ouvrageResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ouvrageResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://com/}abstractResponse">
 *       &lt;sequence>
 *         &lt;element name="ouvrages" type="{http://com/}ouvragePojo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ouvrageResponse", propOrder = {
    "ouvrages"
})
public class OuvrageResponse
    extends AbstractResponse
{

    @XmlElement(nillable = true)
    protected List<OuvragePojo> ouvrages;

    /**
     * Gets the value of the ouvrages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ouvrages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOuvrages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OuvragePojo }
     * 
     * 
     */
    public List<OuvragePojo> getOuvrages() {
        if (ouvrages == null) {
            ouvrages = new ArrayList<OuvragePojo>();
        }
        return this.ouvrages;
    }

}
