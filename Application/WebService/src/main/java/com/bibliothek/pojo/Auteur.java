package com.bibliothek.pojo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Auteur implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "auteur_gen")
    @SequenceGenerator(name = "auteur_gen", sequenceName = "auteur_id_seq", schema="public" )
    private int id;

    private String nom;

    private String prenom;

    private String nationalite;

    @Column(name="date_naissance")
    private Date dateNaissance;

    @Column(name="date_deces")
    private Date dateDeces;

    public Auteur() {
    }

    public Auteur(int id, String nom, String prenom, String nationalite, Date dateNaissance, Date dateDeces) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nationalite = nationalite;
        this.dateNaissance = dateNaissance;
        this.dateDeces = dateDeces;
    }

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
}
