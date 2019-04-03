
package generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour auteurResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="auteurResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://com/}abstractResponse">
 *       &lt;sequence>
 *         &lt;element name="auteurs" type="{http://com/}auteurPojo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "auteurResponse", propOrder = {
    "auteurs"
})
public class AuteurResponse
    extends AbstractResponse
{

    @XmlElement(nillable = true)
    protected List<AuteurPojo> auteurs;

    /**
     * Gets the value of the auteurs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the auteurs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuteurs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuteurPojo }
     * 
     * 
     */
    public List<AuteurPojo> getAuteurs() {
        if (auteurs == null) {
            auteurs = new ArrayList<AuteurPojo>();
        }
        return this.auteurs;
    }

}
