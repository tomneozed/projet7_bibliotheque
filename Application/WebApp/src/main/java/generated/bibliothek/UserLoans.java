
package generated.bibliothek;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour userLoans complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="userLoans">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="utilisateurPojo" type="{http://webservice.bibliothek.com/}utilisateurPojo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userLoans", propOrder = {
    "utilisateurPojo"
})
public class UserLoans {

    protected UtilisateurPojo utilisateurPojo;

    /**
     * Obtient la valeur de la propri�t� utilisateurPojo.
     * 
     * @return
     *     possible object is
     *     {@link UtilisateurPojo }
     *     
     */
    public UtilisateurPojo getUtilisateurPojo() {
        return utilisateurPojo;
    }

    /**
     * D�finit la valeur de la propri�t� utilisateurPojo.
     * 
     * @param value
     *     allowed object is
     *     {@link UtilisateurPojo }
     *     
     */
    public void setUtilisateurPojo(UtilisateurPojo value) {
        this.utilisateurPojo = value;
    }

}
