package com.bibliothek.gestion.beans;

import com.bibliothek.DAO.pojo.Auteur;

import java.util.Date;

public class AuteurResponse extends AbstractResponse {

    private String nom;

    private String prenom;

    private String nationalite;

    private Date dateNaissance;

    private Date dateDeces;


    public AuteurResponse() {
    }

    public AuteurResponse(String nom, String prenom, String nationalite, Date dateNaissance, Date dateDeces) {
        this.nom = nom;
        this.prenom = prenom;
        this.nationalite = nationalite;
        this.dateNaissance = dateNaissance;
        this.dateDeces = dateDeces;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public Date getDateDeces() {
        return dateDeces;
    }

    public void setDateDeces(Date dateDeces) {
        this.dateDeces = dateDeces;
    }


    public void setAuteur(Auteur a){
        this.nom = a.getNom();
        this.prenom = a.getPrenom();
        this.nationalite = a.getNationalite();
        this.dateNaissance = a.getDateNaissance();
        this.dateDeces = a.getDateDeces();
    }



}
