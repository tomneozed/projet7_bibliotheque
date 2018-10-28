
package generated.bibliothekservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour pretBean complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="pretBean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dateDebutPret" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateFinPret" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="etat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ouvrage" type="{http://webservice.bibliothek.com/}ouvrageBean" minOccurs="0"/>
 *         &lt;element name="prolongation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "pretBean", propOrder = {
    "dateDebutPret",
    "dateFinPret",
    "etat",
    "id",
    "ouvrage",
    "prolongation",
    "utilisateurPojo"
})
public class PretBean {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateDebutPret;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateFinPret;
    protected String etat;
    protected int id;
    protected OuvrageBean ouvrage;
    protected boolean prolongation;
    protected UtilisateurPojo utilisateurPojo;

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
     * Obtient la valeur de la propriété ouvrage.
     * 
     * @return
     *     possible object is
     *     {@link OuvrageBean }
     *     
     */
    public OuvrageBean getOuvrage() {
        return ouvrage;
    }

    /**
     * Définit la valeur de la propriété ouvrage.
     * 
     * @param value
     *     allowed object is
     *     {@link OuvrageBean }
     *     
     */
    public void setOuvrage(OuvrageBean value) {
        this.ouvrage = value;
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

    /**
     * Obtient la valeur de la propriété utilisateurPojo.
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
     * Définit la valeur de la propriété utilisateurPojo.
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
