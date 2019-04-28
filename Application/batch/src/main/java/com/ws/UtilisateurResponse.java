
package com.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour utilisateurResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="utilisateurResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://com/}abstractResponse">
 *       &lt;sequence>
 *         &lt;element name="utilisateurs" type="{http://com/}utilisateurPojo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "utilisateurResponse", propOrder = {
    "utilisateurs"
})
public class UtilisateurResponse
    extends AbstractResponse
{

    @XmlElement(nillable = true)
    protected List<UtilisateurPojo> utilisateurs;

    /**
     * Gets the value of the utilisateurs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the utilisateurs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUtilisateurs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UtilisateurPojo }
     * 
     * 
     */
    public List<UtilisateurPojo> getUtilisateurs() {
        if (utilisateurs == null) {
            utilisateurs = new ArrayList<UtilisateurPojo>();
        }
        return this.utilisateurs;
    }

}
