
package generated.bibliothekservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour extendLoan complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="extendLoan">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idPret" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "extendLoan", propOrder = {
    "idPret"
})
public class ExtendLoan {

    protected int idPret;

    /**
     * Obtient la valeur de la propri�t� idPret.
     * 
     */
    public int getIdPret() {
        return idPret;
    }

    /**
     * D�finit la valeur de la propri�t� idPret.
     * 
     */
    public void setIdPret(int value) {
        this.idPret = value;
    }

}
