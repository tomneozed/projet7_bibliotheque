package com.bibliothek.webservice.request;

import com.bibliothek.DAO.pojo.PretPojo;

import java.util.Date;

public class PretRequest {

    private Date dateDebutPret;

    private int idUtilisateur;

    private int idOuvrage;

    public PretRequest() {
    }

    public PretRequest(Date dateDebutPret, int idUtilisateur, int idOuvrage) {
        this.dateDebutPret = dateDebutPret;
        this.idUtilisateur = idUtilisateur;
        this.idOuvrage = idOuvrage;
    }

    public Date getDateDebutPret() {
        return dateDebutPret;
    }

    public void setDateDebutPret(Date dateDebutPret) {
        this.dateDebutPret = dateDebutPret;
    }

    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public int getIdOuvrage() {
        return idOuvrage;
    }

    public void setIdOuvrage(int idOuvrage) {
        this.idOuvrage = idOuvrage;
    }

    public PretPojo toPojo()
    {
        PretPojo pretPojo = new PretPojo();

        pretPojo.setId(0);
        pretPojo.setDateDebutPret(this.dateDebutPret);
        pretPojo.setDateFinPret(pretPojo.determinesDateFinPret(pretPojo.getDateDebutPret()));
        pretPojo.setProlongation(false);
        pretPojo.setEtat("en cours");
        pretPojo.setIdUtilisateur(this.getIdUtilisateur());
        pretPojo.setIdOuvrage(this.getIdOuvrage());

        return pretPojo;
    }


}
