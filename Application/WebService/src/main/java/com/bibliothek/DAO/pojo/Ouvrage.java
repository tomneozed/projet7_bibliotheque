package com.bibliothek.DAO.pojo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Ouvrage implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ouvrage_gen")
    @SequenceGenerator(name = "ouvrage_gen", sequenceName = "ouvrage_id_seq", schema = "public")
    private int id;

    private String titre;

    private String editeur;

    private String nature;

    private String resume;

    @Column(name="nombre_pages")
    private int nombrePages;

    @Column(name="date_parution")
    private Date dateParution;

    private double prix;

    @ManyToMany(cascade = CascadeType.ALL )
    @JoinTable(name="auteur_ouvrage", joinColumns = @JoinColumn(name="id_ouvrage"), inverseJoinColumns = @JoinColumn(name="id_auteur"))
    private List<Auteur> auteurs = new ArrayList<Auteur>();

    public Ouvrage() {


    }

    public Ouvrage(int id, String titre, String editeur, String nature, String resume, int nombrePages, Date dateParution, double prix, List<Auteur> auteurs) {
        this.id = id;
        this.titre = titre;
        this.editeur = editeur;
        this.nature = nature;
        this.resume = resume;
        this.nombrePages = nombrePages;
        this.dateParution = dateParution;
        this.prix = prix;
        this.auteurs = auteurs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getEditeur() {
        return editeur;
    }

    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public int getNombrePages() {
        return nombrePages;
    }

    public void setNombrePages(int nombrePages) {
        this.nombrePages = nombrePages;
    }

    public Date getDateParution() {
        return dateParution;
    }

    public void setDateParution(Date dateParution) {
        this.dateParution = dateParution;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public List<Auteur> getAuteurs() {
        return auteurs;
    }

    public void setAuteurs(List<Auteur> auteurs) {
        this.auteurs = auteurs;
    }
}
