
package generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour pretResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="pretResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.bibliothek.com/}abstractResponse">
 *       &lt;sequence>
 *         &lt;element name="pretBeanList" type="{http://webservice.bibliothek.com/}pretBean" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pretResponse", propOrder = {
    "pretBeanList"
})
public class PretResponse
    extends AbstractResponse
{

    @XmlElement(nillable = true)
    protected List<PretBean> pretBeanList;

    /**
     * Gets the value of the pretBeanList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pretBeanList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPretBeanList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PretBean }
     * 
     * 
     */
    public List<PretBean> getPretBeanList() {
        if (pretBeanList == null) {
            pretBeanList = new ArrayList<PretBean>();
        }
        return this.pretBeanList;
    }

}
