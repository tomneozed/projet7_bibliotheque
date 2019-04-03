
package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour pretPojo complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="pretPojo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dateDebutPret" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateFinPret" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="etat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idOuvrage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idUtilisateur" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="prolongation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pretPojo", propOrder = {
    "dateDebutPret",
    "dateFinPret",
    "etat",
    "id",
    "idOuvrage",
    "idUtilisateur",
    "prolongation"
})
public class PretPojo {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateDebutPret;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateFinPret;
    protected String etat;
    protected int id;
    protected int idOuvrage;
    protected int idUtilisateur;
    protected boolean prolongation;

    /**
     * Obtient la valeur de la propriété dateDebutPret.
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
     * Définit la valeur de la propriété dateDebutPret.
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
     * Obtient la valeur de la propriété dateFinPret.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateFinPret() {
        return dateFinPret;
    }

    /**
     * Définit la valeur de la propriété dateFinPret.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateFinPret(XMLGregorianCalendar value) {
        this.dateFinPret = value;
    }

    /**
     * Obtient la valeur de la propriété etat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEtat() {
        return etat;
    }

    /**
     * Définit la valeur de la propriété etat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtat(String value) {
        this.etat = value;
    }

    /**
     * Obtient la valeur de la propriété id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtient la valeur de la propriété idOuvrage.
     * 
     */
    public int getIdOuvrage() {
        return idOuvrage;
    }

    /**
     * Définit la valeur de la propriété idOuvrage.
     * 
     */
    public void setIdOuvrage(int value) {
        this.idOuvrage = value;
    }

    /**
     * Obtient la valeur de la propriété idUtilisateur.
     * 
     */
    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    /**
     * Définit la valeur de la propriété idUtilisateur.
     * 
     */
    public void setIdUtilisateur(int value) {
        this.idUtilisateur = value;
    }

    /**
     * Obtient la valeur de la propriété prolongation.
     * 
     */
    public boolean isProlongation() {
        return prolongation;
    }

    /**
     * Définit la valeur de la propriété prolongation.
     * 
     */
    public void setProlongation(boolean value) {
        this.prolongation = value;
    }

}
