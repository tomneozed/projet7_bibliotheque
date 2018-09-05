package com.bibliothek.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Pret implements Serializable {

    @Id
    private int id;

    @Column(name="date_debut_pret")
    private Date dateDebutPret;

    @Column(name="date_fin_pret")
    private Date dateFinPret;

    private boolean prolongation;

    private String etat;

    @Column(name="id_utilisateur")
    private int idUtilisateur;

    @Column(name="id_bibliotheque")
    private int idBibliotheque;

    @Column(name="id_ouvrage")
    private int idOuvrage;

    public Pret() {
    }

    public Pret(int id, Date dateDebutPret, Date dateFinPret, boolean prolongation, String etat, int idUtilisateur, int idBibliotheque, int idOuvrage) {
        this.id = id;
        this.dateDebutPret = dateDebutPret;
        this.dateFinPret = dateFinPret;
        this.prolongation = prolongation;
        this.etat = etat;
        this.idUtilisateur = idUtilisateur;
        this.idBibliotheque = idBibliotheque;
        this.idOuvrage = idOuvrage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public int getIdBibliotheque() {
        return idBibliotheque;
    }

    public void setIdBibliotheque(int idBibliotheque) {
        this.idBibliotheque = idBibliotheque;
    }

    public int getIdOuvrage() {
        return idOuvrage;
    }

    public void setIdOuvrage(int idOuvrage) {
        this.idOuvrage = idOuvrage;
    }
}
