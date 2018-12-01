
package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour pretRequest complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="pretRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dateDebutPret" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="idOuvrage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idUtilisateur" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pretRequest", propOrder = {
    "dateDebutPret",
    "idOuvrage",
    "idUtilisateur"
})
public class PretRequest {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateDebutPret;
    protected int idOuvrage;
    protected int idUtilisateur;

    /**
     * Obtient la valeur de la propri�t� dateDebutPret.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateDebutPret() {
        return dateDebutPret;
    }

    /**
     * D�finit la valeur de la propri�t� dateDebutPret.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateDebutPret(XMLGregorianCalendar value) {
        this.dateDebutPret = value;
    }

    /**
     * Obtient la valeur de la propri�t� idOuvrage.
     * 
     */
    public int getIdOuvrage() {
        return idOuvrage;
    }

    /**
     * D�finit la valeur de la propri�t� idOuvrage.
     * 
     */
    public void setIdOuvrage(int value) {
        this.idOuvrage = value;
    }

    /**
     * Obtient la valeur de la propri�t� idUtilisateur.
     * 
     */
    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    /**
     * D�finit la valeur de la propri�t� idUtilisateur.
     * 
     */
    public void setIdUtilisateur(int value) {
        this.idUtilisateur = value;
    }

}
