
package generated.bibliothek;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ouvragesSearchResponse complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ouvragesSearchResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://webservice.bibliothek.com/}ouvrageResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ouvragesSearchResponse", propOrder = {
    "_return"
})
public class OuvragesSearchResponse {

    @XmlElement(name = "return")
    protected OuvrageResponse _return;

    /**
     * Obtient la valeur de la propri�t� return.
     * 
     * @return
     *     possible object is
     *     {@link OuvrageResponse }
     *     
     */
    public OuvrageResponse getReturn() {
        return _return;
    }

    /**
     * D�finit la valeur de la propri�t� return.
     * 
     * @param value
     *     allowed object is
     *     {@link OuvrageResponse }
     *     
     */
    public void setReturn(OuvrageResponse value) {
        this._return = value;
    }

}
