
package com.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour ouvragePojo complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ouvragePojo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dateParution" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="editeur" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreExemplaires" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nombreExemplairesDispo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nombrePages" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="prix" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="resume" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="titre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ouvragePojo", propOrder = {
    "dateParution",
    "editeur",
    "id",
    "nature",
    "nombreExemplaires",
    "nombreExemplairesDispo",
    "nombrePages",
    "prix",
    "resume",
    "titre"
})
public class OuvragePojo {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateParution;
    protected String editeur;
    protected int id;
    protected String nature;
    protected int nombreExemplaires;
    protected int nombreExemplairesDispo;
    protected int nombrePages;
    protected double prix;
    protected String resume;
    protected String titre;

    /**
     * Obtient la valeur de la propriété dateParution.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateParution() {
        return dateParution;
    }

    /**
     * Définit la valeur de la propriété dateParution.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateParution(XMLGregorianCalendar value) {
        this.dateParution = value;
    }

    /**
     * Obtient la valeur de la propriété editeur.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEditeur() {
        return editeur;
    }

    /**
     * Définit la valeur de la propriété editeur.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEditeur(String value) {
        this.editeur = value;
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
     * Obtient la valeur de la propriété nature.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNature() {
        return nature;
    }

    /**
     * Définit la valeur de la propriété nature.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNature(String value) {
        this.nature = value;
    }

    /**
     * Obtient la valeur de la propriété nombreExemplaires.
     * 
     */
    public int getNombreExemplaires() {
        return nombreExemplaires;
    }

    /**
     * Définit la valeur de la propriété nombreExemplaires.
     * 
     */
    public void setNombreExemplaires(int value) {
        this.nombreExemplaires = value;
    }

    /**
     * Obtient la valeur de la propriété nombreExemplairesDispo.
     * 
     */
    public int getNombreExemplairesDispo() {
        return nombreExemplairesDispo;
    }

    /**
     * Définit la valeur de la propriété nombreExemplairesDispo.
     * 
     */
    public void setNombreExemplairesDispo(int value) {
        this.nombreExemplairesDispo = value;
    }

    /**
     * Obtient la valeur de la propriété nombrePages.
     * 
     */
    public int getNombrePages() {
        return nombrePages;
    }

    /**
     * Définit la valeur de la propriété nombrePages.
     * 
     */
    public void setNombrePages(int value) {
        this.nombrePages = value;
    }

    /**
     * Obtient la valeur de la propriété prix.
     * 
     */
    public double getPrix() {
        return prix;
    }

    /**
     * Définit la valeur de la propriété prix.
     * 
     */
    public void setPrix(double value) {
        this.prix = value;
    }

    /**
     * Obtient la valeur de la propriété resume.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResume() {
        return resume;
    }

    /**
     * Définit la valeur de la propriété resume.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResume(String value) {
        this.resume = value;
    }

    /**
     * Obtient la valeur de la propriété titre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitre() {
        return titre;
    }

    /**
     * Définit la valeur de la propriété titre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitre(String value) {
        this.titre = value;
    }

}
