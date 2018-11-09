package com.bibliothek.webservice;

import com.bibliothek.DAO.exceptions.DaoException;
import com.bibliothek.DAO.impl.UtilisateurDaoImpl;
import com.bibliothek.DAO.interfaces.UtilisateurDao;
import com.bibliothek.DAO.pojo.PretPojo;
import com.bibliothek.DAO.pojo.UtilisateurPojo;
import com.bibliothek.exceptions.FunctionalException;
import com.bibliothek.gestion.beans.AuteurAndOuvragesBean;
import com.bibliothek.gestion.impl.GestionOuvrageImpl;
import com.bibliothek.gestion.impl.GestionPretImpl;
import com.bibliothek.gestion.impl.GestionUtilisateurImpl;
import com.bibliothek.webservice.request.PretRequest;
import com.bibliothek.webservice.responses.OuvrageResponse;
import com.bibliothek.webservice.responses.PretResponse;
import com.bibliothek.webservice.responses.UtilisateurResponse;
import org.springframework.beans.factory.annotation.Autowired;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;

@WebService()
public class BibliothekService {

    @Autowired
    private GestionOuvrageImpl gestionOuvrage = new GestionOuvrageImpl();

    @Autowired
    private GestionPretImpl gestionPretImpl = new GestionPretImpl();

    @Autowired
    private UtilisateurDao utilisateurDao = new UtilisateurDaoImpl();

    @Autowired
    private AuteurAndOuvragesBean ouvragesByAuteur= new AuteurAndOuvragesBean();

    private OuvrageResponse ouvrageResponse= new OuvrageResponse();

    /**
     * Returns all the ouvrages depending on the research input
     * @param research
     * @return
     */
    @WebMethod(operationName = "ouvragesSearch")
    public OuvrageResponse ouvragesSearch(@XmlElement(name = "research") String research){
        gestionPretImpl.majPret();
        OuvrageResponse ouvragesSearch = new OuvrageResponse();
        try{
            ouvragesSearch.setOuvrages(gestionOuvrage.findAllOuvragesByParameter(research));
        }catch(DaoException e){
            ouvragesSearch.setMessageErreur(e.getMessage());
            ouvragesSearch.setTypeErreur(2);
        }
        return ouvragesSearch;
    }

    /**
     * Returns all ouvrages and their disponibilities
     * @return
     */
    @WebMethod(operationName = "allOuvrages")
    public OuvrageResponse allOuvrages(){
        OuvrageResponse allOuvrages = new OuvrageResponse();

        try {
            allOuvrages.setOuvrages(gestionOuvrage.findAllOuvrages());
            allOuvrages.setTypeErreur(0);
        }catch(Exception e){
            allOuvrages.setTypeErreur(1);
            allOuvrages.setMessageErreur(e.getMessage());
        }
        return allOuvrages;
    }

    /**
     * Return true if pseudo and motDePasse are corresponding in the database
     * @param pseudo
     * @param motDePasse
     * @return
     */
    @WebMethod(operationName = "identification")
    public UtilisateurResponse identification(@XmlElement(name = "pseudo") String pseudo, @XmlElement(name = "motDePasse") String motDePasse) {
        GestionUtilisateurImpl gestionUtilisateurImpl = new GestionUtilisateurImpl();
        UtilisateurResponse utilisateurResponse = new UtilisateurResponse();

        if(gestionUtilisateurImpl.verifMotDePasse(pseudo, motDePasse))
        {
            utilisateurResponse.getUtilisateurBeanList().add(gestionUtilisateurImpl.findUtilisateurByPseudo(pseudo));
        }else
        {
            utilisateurResponse.setTypeErreur(2);
            utilisateurResponse.setMessageErreur("Pseudo or mot de passe is invalid");
        }
        return utilisateurResponse;
    }

    /**
////     * Returns a list of loans from the specified user
////     * @param utilisateurPojo
////     * @return
////     */
////    @WebMethod(operationName = "userLoans")
////    public PretResponse userLoans(@XmlElement(name = "utilisateurPojo") UtilisateurPojo utilisateurPojo)
////    {
////        gestionPretImpl.majPret();
////        PretResponse pretResponse = new PretResponse();
////
////        pretResponse.setPretBeanList(gestionPretImpl.remonterPrets(utilisateurPojo.getId()));
////
////        return pretResponse;
////    }

    /**
     * Returns a list of loans from the specified user's pseudo
     * @param pseudo
     * @return
     */
    @WebMethod(operationName = "userLoansByPseudo")
    public PretResponse userLoansByPseudo(@XmlElement(name = "pseudo") String pseudo)
    {
        gestionPretImpl.majPret();
        PretResponse pretResponse = new PretResponse();
        UtilisateurPojo utilisateur;
        try{
            utilisateur = utilisateurDao.findByPseudo(pseudo);
            pretResponse.setPretBeanList(gestionPretImpl.remonterPrets(utilisateur.getId()));
        }catch (DaoException e) {
            pretResponse.setTypeErreur(2);
            pretResponse.setMessageErreur(e.getMessage());
        }catch(Exception e)
        {
            pretResponse.setTypeErreur(1);
            pretResponse.setMessageErreur(e.getMessage());
        }

        return pretResponse;
    }

    /**
     * Extends specified loan for 4 weeks ()
     * @param idPret
     */
    @WebMethod(operationName = "extendLoan")
    public PretResponse extendLoan(@XmlElement(name = "idPret") int idPret){
        gestionPretImpl.majPret();
        PretResponse extendedLoan = new PretResponse();
        try{
            gestionPretImpl.prolongerPret(idPret);
            extendedLoan.getPretBeanList().add(gestionPretImpl.remonterPret(idPret));
        }catch(FunctionalException fe)
        {
            extendedLoan.setTypeErreur(2);
            extendedLoan.setMessageErreur(fe.getMessage());
        }catch(Exception e)
        {
            extendedLoan.setTypeErreur(1);
            extendedLoan.setMessageErreur(e.getMessage());
        }
        return extendedLoan;
    }

    /**
     * Return the list of not rendered loans
     * @return
     */
    @WebMethod(operationName = "notRenderedLoans")
    public PretResponse notRenderedLoans(){
        gestionPretImpl.majPret();
        PretResponse notRenderedLoans = new PretResponse();

        notRenderedLoans.setPretBeanList(gestionPretImpl.remonterPretsNonRendus());

        return notRenderedLoans;
    }

    /**
     * Returns the ended loan
     * @param idPret
     * @return
     */
    @WebMethod(operationName = "loanReturn")
    public PretResponse loanReturn (@XmlElement(name = "idPret") int idPret){
        gestionPretImpl.majPret();
        PretResponse pretResponse = new PretResponse();
        try{
            pretResponse.getPretBeanList().add(gestionPretImpl.retourPret(idPret));
        }catch(DaoException e){
            pretResponse.setMessageErreur(e.getMessage());
            pretResponse.setTypeErreur(2);
        }
        return pretResponse;
    }

    /**
     * Returns the freshly created loan
     * @param pretReq
     * @return
     */
    @WebMethod(operationName="loanCreation")
    public PretResponse createLoan(PretRequest pretReq){
        gestionPretImpl.majPret();

        PretResponse createdLoan = new PretResponse();
        PretPojo pretPojo;


        int idPret =0;

        try {
            pretPojo = pretReq.toPojo();
            idPret = gestionPretImpl.nouveauPret(pretPojo);
        } catch (FunctionalException e) {
            createdLoan.setTypeErreur(2);
            createdLoan.setMessageErreur(e.getMessage());
        }catch(Exception e)
        {
            createdLoan.setTypeErreur(1);
            createdLoan.setMessageErreur(e.getMessage());
        }
        if(idPret!=0){
            createdLoan.getPretBeanList().add(gestionPretImpl.remonterPret(idPret));
        }
        return createdLoan;
    }

    /**
     * Returns a list of all the loans
     * @return
     */
    @WebMethod(operationName = "allLoans")
    public PretResponse allLoans(){
        gestionPretImpl.majPret();
        PretResponse allLoans = new PretResponse();

        allLoans.setPretBeanList(gestionPretImpl.remonterTousLesPrets());

        return allLoans;
    }

    /**
     * Returns all ouvrages from specified author
     * @param auteurPojo
     * @return
     */
//    @WebMethod
//    public List<OuvrageBean> ouvragesByAuteurList(@XmlElement(name = "auteurPojo") AuteurPojo auteurPojo)
//    {
//        return ouvragesByAuteur.findOuvragesFromAuteur(auteurPojo.getId());
//    }


}
