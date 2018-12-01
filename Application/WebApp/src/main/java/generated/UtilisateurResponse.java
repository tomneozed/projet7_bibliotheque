
package generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour utilisateurResponse complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="utilisateurResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.bibliothek.com/}abstractResponse">
 *       &lt;sequence>
 *         &lt;element name="utilisateurBeanList" type="{http://webservice.bibliothek.com/}utilisateurBean" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "utilisateurResponse", propOrder = {
    "utilisateurBeanList"
})
public class UtilisateurResponse
    extends AbstractResponse
{

    @XmlElement(nillable = true)
    protected List<UtilisateurBean> utilisateurBeanList;

    /**
     * Gets the value of the utilisateurBeanList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the utilisateurBeanList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUtilisateurBeanList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UtilisateurBean }
     * 
     * 
     */
    public List<UtilisateurBean> getUtilisateurBeanList() {
        if (utilisateurBeanList == null) {
            utilisateurBeanList = new ArrayList<UtilisateurBean>();
        }
        return this.utilisateurBeanList;
    }

}
