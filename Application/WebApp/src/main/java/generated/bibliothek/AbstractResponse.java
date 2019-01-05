
package generated.bibliothek;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour abstractResponse complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="abstractResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="messageErreur" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeErreur" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abstractResponse", propOrder = {
    "messageErreur",
    "typeErreur"
})
@XmlSeeAlso({
    PretResponse.class,
    UtilisateurResponse.class,
    OuvrageResponse.class
})
public class AbstractResponse {

    protected String messageErreur;
    protected int typeErreur;

    /**
     * Obtient la valeur de la propri�t� messageErreur.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageErreur() {
        return messageErreur;
    }

    /**
     * D�finit la valeur de la propri�t� messageErreur.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageErreur(String value) {
        this.messageErreur = value;
    }

    /**
     * Obtient la valeur de la propri�t� typeErreur.
     * 
     */
    public int getTypeErreur() {
        return typeErreur;
    }

    /**
     * D�finit la valeur de la propri�t� typeErreur.
     * 
     */
    public void setTypeErreur(int value) {
        this.typeErreur = value;
    }

}
