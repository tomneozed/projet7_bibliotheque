
package generated.bibliothekservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ouvragesSearch complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ouvragesSearch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="research" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ouvragesSearch", propOrder = {
    "research"
})
public class OuvragesSearch {

    protected String research;

    /**
     * Obtient la valeur de la propri�t� research.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResearch() {
        return research;
    }

    /**
     * D�finit la valeur de la propri�t� research.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResearch(String value) {
        this.research = value;
    }

}
