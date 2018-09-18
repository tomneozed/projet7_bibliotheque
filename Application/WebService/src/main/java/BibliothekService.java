import com.bibliothek.DAO.pojo.Auteur;
import com.bibliothek.DAO.pojo.Pret;
import com.bibliothek.DAO.pojo.Utilisateur;
import com.bibliothek.exceptions.FunctionalException;
import com.bibliothek.gestion.beans.AuteurAndOuvragesResponse;
import com.bibliothek.gestion.beans.OuvrageResponse;
import com.bibliothek.gestion.beans.PretResponse;
import com.bibliothek.gestion.impl.GestionOuvrageImpl;
import com.bibliothek.gestion.impl.GestionPretImpl;
import com.bibliothek.gestion.impl.GestionUtilisateurImpl;
import org.springframework.beans.factory.annotation.Autowired;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

@WebService(serviceName = "bibliothek")
public class BibliothekService {

    @Autowired
    private GestionOuvrageImpl gestionOuvrage = new GestionOuvrageImpl();

    @Autowired
    private GestionPretImpl gestionPretImpl;

    @Autowired
    private AuteurAndOuvragesResponse ouvragesByAuteur= new AuteurAndOuvragesResponse();


    /**
     * Returns all ouvrages and their disponibilities
     * @return
     */
    @WebMethod
    public List<OuvrageResponse> ouvrageList(){

        return gestionOuvrage.findAllOuvrages();
    }

    /**
     * Returns all ouvrages from specified author
     * @param auteur
     * @return
     */
    @WebMethod
    public List<OuvrageResponse> ouvragesByAuteurList(@XmlElement(name = "auteur") Auteur auteur)
    {
        return ouvragesByAuteur.findOuvragesFromAuteur(auteur.getId());
    }

    /**
     * Return true if pseudo and motDePasse are corresponding in the database
     * @param pseudo
     * @param motDePasse
     * @return
     */
    @WebMethod
    public boolean identification(@XmlElement(name = "pseudo") String pseudo, @XmlElement(name = "motDePasse") String motDePasse) {
        GestionUtilisateurImpl gestionUtilisateurImpl = new GestionUtilisateurImpl();

        return gestionUtilisateurImpl.verifMotDePasse(pseudo, motDePasse);
    }

    /**
     * Returns a list of loans from the specified user
     * @param utilisateur
     * @return
     */
    @WebMethod
    public List<PretResponse> suiviDePret(@XmlElement(name = "utilisateur") Utilisateur utilisateur)
    {
        return gestionPretImpl.remonterPrets(utilisateur);
    }


    /**
     * Extends specified loan for 4 weeks ()
     * @param pret
     */
    @WebMethod
    public void prolongerPret(@XmlElement(name = "pret") Pret pret){
        try{
            gestionPretImpl.prolongerPret(pret.getId());
        }catch(FunctionalException fe)
        {
            fe.printStackTrace();
        }catch(Exception e)

        {
            e.printStackTrace();
        }

    }

}
