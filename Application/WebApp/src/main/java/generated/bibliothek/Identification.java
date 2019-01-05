
package generated.bibliothek;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour identification complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="identification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pseudo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motDePasse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "identification", propOrder = {
    "pseudo",
    "motDePasse"
})
public class Identification {

    protected String pseudo;
    protected String motDePasse;

    /**
     * Obtient la valeur de la propriété pseudo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPseudo() {
        return pseudo;
    }

    /**
     * Définit la valeur de la propriété pseudo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPseudo(String value) {
        this.pseudo = value;
    }

    /**
     * Obtient la valeur de la propriété motDePasse.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotDePasse() {
        return motDePasse;
    }

    /**
     * Définit la valeur de la propriété motDePasse.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotDePasse(String value) {
        this.motDePasse = value;
    }

}
