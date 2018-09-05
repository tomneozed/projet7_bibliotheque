package com.bibliothek.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity(name = "ouvrage_bibliotheque")
public class OuvrageBibliotheque implements Serializable {

    @Id
    @Column(name="id_ouvrage")
    private int idOuvrage;

    @Id
    @Column(name="id_bibliotheque")
    private int idBibliotheque;

    @Column(name="nombre_exemplaire")
    private int nombreExemplaire;

    public OuvrageBibliotheque() {
    }

    public OuvrageBibliotheque(int idOuvrage, int idBibliotheque, int nombreExemplaire) {
        this.idOuvrage = idOuvrage;
        this.idBibliotheque = idBibliotheque;
        this.nombreExemplaire = nombreExemplaire;
    }

    public int getIdOuvrage() {
        return idOuvrage;
    }

    public void setIdOuvrage(int idOuvrage) {
        this.idOuvrage = idOuvrage;
    }

    public int getIdBibliotheque() {
        return idBibliotheque;
    }

    public void setIdBibliotheque(int idBibliotheque) {
        this.idBibliotheque = idBibliotheque;
    }

    public int getNombreExemplaire() {
        return nombreExemplaire;
    }

    public void setNombreExemplaire(int nombreExemplaire) {
        this.nombreExemplaire = nombreExemplaire;
    }
}
