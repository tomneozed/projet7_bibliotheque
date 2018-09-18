package com.bibliothek.gestion.beans;

import com.bibliothek.DAO.impl.OuvrageDaoImpl;
import com.bibliothek.DAO.impl.UtilisateurDaoImpl;
import com.bibliothek.DAO.pojo.Pret;
import com.bibliothek.DAO.pojo.Utilisateur;

import java.util.Date;

public class PretResponse extends AbstractResponse {

    private Date dateDebutPret;

    private Date dateFinPret;

    private boolean prolongation;

    private String etat;

    private Utilisateur utilisateur;

    private OuvrageResponse ouvrage;

    public PretResponse() {
    }



    public Date getDateDebutPret() {
        return dateDebutPret;
    }

    public void setDateDebutPret(Date dateDebutPret) {
        this.dateDebutPret = dateDebutPret;
    }

    public Date getDateFinPret() {
        return dateFinPret;
    }

    public void setDateFinPret(Date dateFinPret) {
        this.dateFinPret = dateFinPret;
    }

    public boolean isProlongation() {
        return prolongation;
    }

    public void setProlongation(boolean prolongation) {
        this.prolongation = prolongation;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public OuvrageResponse getOuvrage() {
        return ouvrage;
    }

    public void setOuvrage(OuvrageResponse ouvrage) {
        this.ouvrage = ouvrage;
    }

    public void setPret(Pret p)
    {
        UtilisateurDaoImpl utilisateurDao = new UtilisateurDaoImpl();

        this.dateDebutPret = p.getDateDebutPret();
        this.dateFinPret = p.getDateFinPret();
        this.prolongation = p.isProlongation();
        this.etat = p.getEtat();
        this.utilisateur = utilisateurDao.findById(p.getIdUtilisateur());
        this.ouvrage = convertOuvragePojoToBean(p);
    }

    private OuvrageResponse convertOuvragePojoToBean(Pret p)
    {
        OuvrageResponse ouvrageResponse = new OuvrageResponse();
        OuvrageDaoImpl ouvrageDao = new OuvrageDaoImpl();
        ouvrageResponse.setOuvrage(ouvrageDao.findById(p.getIdOuvrage()));
        return ouvrageResponse;
    }

}
