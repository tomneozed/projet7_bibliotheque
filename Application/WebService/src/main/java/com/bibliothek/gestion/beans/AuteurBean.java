package com.bibliothek.gestion.beans;

import com.bibliothek.DAO.pojo.AuteurPojo;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class AuteurBean {

    //ATTRIBUTES
    private int id;

    private String nom;

    private String prenom;

    private String nationalite;

    private Date dateNaissance;

    private Date dateDeces;

    //CONTRUCTORS
    public AuteurBean() {
    }

    public AuteurBean(int id, String nom, String prenom, String nationalite, Date dateNaissance, Date dateDeces) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nationalite = nationalite;
        this.dateNaissance = dateNaissance;
        this.dateDeces = dateDeces;
    }

    //GETTERS & SETTERS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public void setAuteur(AuteurPojo a){
        this.nom = a.getNom();
        this.prenom = a.getPrenom();
        this.nationalite = a.getNationalite();
        this.dateNaissance = a.getDateNaissance();
        this.dateDeces = a.getDateDeces();
    }
}
