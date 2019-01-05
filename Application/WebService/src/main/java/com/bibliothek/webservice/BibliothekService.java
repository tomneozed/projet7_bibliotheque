package com.bibliothek.webservice;

import com.bibliothek.DAO.exceptions.DaoException;
import com.bibliothek.DAO.impl.UtilisateurDaoImpl;
import com.bibliothek.DAO.interfaces.UtilisateurDao;
import com.bibliothek.DAO.pojo.AuteurPojo;
import com.bibliothek.DAO.pojo.PretPojo;
import com.bibliothek.DAO.pojo.UtilisateurPojo;
import com.bibliothek.exceptions.FunctionalException;
import com.bibliothek.gestion.beans.AuteurAndOuvragesBean;
import com.bibliothek.gestion.beans.OuvrageBean;
import com.bibliothek.gestion.impl.GestionOuvrageImpl;
import com.bibliothek.gestion.impl.GestionPretImpl;
import com.bibliothek.gestion.impl.GestionUtilisateurImpl;
import com.bibliothek.gestion.interfaces.GestionOuvrage;
import com.bibliothek.gestion.interfaces.GestionPret;
import com.bibliothek.webservice.request.PretRequest;
import com.bibliothek.webservice.responses.OuvrageResponse;
import com.bibliothek.webservice.responses.PretResponse;
import com.bibliothek.webservice.responses.UtilisateurResponse;
import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

@WebService()
public class BibliothekService {

    //ATTRIBUTES
    //@Autowired
    protected GestionOuvrage gestionOuvrage = new GestionOuvrageImpl();

    //@Autowired
    protected GestionPret gestionPret = new GestionPretImpl();

    //CONSTRUCTORS
    public BibliothekService() {
    }

    //WEB METHODS
    /**
     * Returns all the ouvrages depending on the research input
     * @param research
     * @return
     */
    @WebMethod(operationName = "ouvragesSearch")
    public OuvrageResponse ouvragesSearch(@XmlElement(name = "research") String research){
        gestionPret.majPret();
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
            allOuvrages.setOuvrages(getGestionOuvrage().findAllOuvrages());
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
            try{
                utilisateurResponse.getUtilisateurBeanList().add(gestionUtilisateurImpl.findUtilisateurByPseudo(pseudo));
            }catch(HibernateException h)
            {
                utilisateurResponse.setTypeErreur(2);
                utilisateurResponse.setMessageErreur(h.getMessage());
            }
        }else
        {
            utilisateurResponse.setTypeErreur(2);
            utilisateurResponse.setMessageErreur("Pseudo or mot de passe is invalid");
        }
        return utilisateurResponse;
    }

    /**
     * Returns a list of loans from the specified user's pseudo
     * @param pseudo
     * @return
     */
    @WebMethod(operationName = "userLoansByPseudo")
    public PretResponse userLoansByPseudo(@XmlElement(name = "pseudo") String pseudo)
    {
        UtilisateurDao utilisateurDao = new UtilisateurDaoImpl();
        gestionPret.majPret();
        PretResponse pretResponse = new PretResponse();
        UtilisateurPojo utilisateur;
        try{
            utilisateur = utilisateurDao.findByPseudo(pseudo);
            pretResponse.setPretBeanList(gestionPret.remonterPrets(utilisateur.getId()));
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
        gestionPret.majPret();
        PretResponse extendedLoan = new PretResponse();
        try{
            gestionPret.prolongerPret(idPret);
            extendedLoan.getPretBeanList().add(gestionPret.remonterPret(idPret));
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
        gestionPret.majPret();
        PretResponse notRenderedLoans = new PretResponse();

        notRenderedLoans.setPretBeanList(gestionPret.remonterPretsNonRendus());

        return notRenderedLoans;
    }

    /**
     * Returns the ended loan
     * @param idPret
     * @return
     */
    @WebMethod(operationName = "loanReturn")
    public PretResponse loanReturn (@XmlElement(name = "idPret") int idPret){
        gestionPret.majPret();
        PretResponse pretResponse = new PretResponse();
        try{
            pretResponse.getPretBeanList().add(gestionPret.retourPret(idPret));
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
        gestionPret.majPret();

        PretResponse createdLoan = new PretResponse();
        PretPojo pretPojo;

        int idPret =0;

        try {
            pretPojo = pretReq.toPojo();
            idPret = gestionPret.nouveauPret(pretPojo);
        } catch (FunctionalException e) {
            createdLoan.setTypeErreur(2);
            createdLoan.setMessageErreur(e.getMessage());
        }catch(Exception e)
        {
            createdLoan.setTypeErreur(1);
            createdLoan.setMessageErreur(e.getMessage());
        }
        if(idPret!=0){
            createdLoan.getPretBeanList().add(gestionPret.remonterPret(idPret));
        }
        return createdLoan;
    }

    /**
     * Returns a list of all the loans
     * @return
     */
    @WebMethod(operationName = "allLoans")
    public PretResponse allLoans(){
        gestionPret.majPret();
        PretResponse allLoans = new PretResponse();

        allLoans.setPretBeanList(gestionPret.remonterTousLesPrets());

        return allLoans;
    }

    //GETTERS & SETTERS

    public GestionOuvrage getGestionOuvrage() {
        return gestionOuvrage;
    }

    public void setGestionOuvrage(GestionOuvrage gestionOuvrage) {
        this.gestionOuvrage = gestionOuvrage;
    }

    public GestionPret getGestionPret() {
        return gestionPret;
    }

    public void setGestionPret(GestionPret gestionPret) {
        this.gestionPret = gestionPret;
    }
}
