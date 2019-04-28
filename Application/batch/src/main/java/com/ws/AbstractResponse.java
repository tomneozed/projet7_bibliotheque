
package com.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour abstractResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="abstractResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="errorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorType" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "errorMessage",
    "errorType"
})
@XmlSeeAlso({
    PretResponse.class,
    AuteurResponse.class,
    UtilisateurResponse.class,
    OuvrageResponse.class
})
public class AbstractResponse {

    protected String errorMessage;
    protected int errorType;

    /**
     * Obtient la valeur de la propriété errorMessage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Définit la valeur de la propriété errorMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    /**
     * Obtient la valeur de la propriété errorType.
     * 
     */
    public int getErrorType() {
        return errorType;
    }

    /**
     * Définit la valeur de la propriété errorType.
     * 
     */
    public void setErrorType(int value) {
        this.errorType = value;
    }

}
