package com.bibliothek.gestion.beans;

import com.bibliothek.DAO.pojo.OuvragePojo;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class OuvrageBean {

    //ATTRIBUTES
    private int id;

    private String titre;

    private String editeur;

    private String nature;

    private String resume;

    private int nombrePages;

    private Date dateParution;

    private double prix;

    private int nombreExemplaires;

    private int nombreExemplairesDispo;

    //CONTRUCTORS
    public OuvrageBean() {
    }

    public OuvrageBean(int id, String titre, String editeur, String nature, String resume, int nombrePages, Date dateParution, double prix, int nombreExemplaires, int nombreExemplairesDispo) {
        this.id = id;
        this.titre = titre;
        this.editeur = editeur;
        this.nature = nature;
        this.resume = resume;
        this.nombrePages = nombrePages;
        this.dateParution = dateParution;
        this.prix = prix;
        this.nombreExemplaires = nombreExemplaires;
        this.nombreExemplairesDispo = nombreExemplairesDispo;
    }

    //GETTERS & SETTERS
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

    public int getNombreExemplaires() {
        return nombreExemplaires;
    }

    public void setNombreExemplaires(int nombreExemplaires) {
        this.nombreExemplaires = nombreExemplaires;
    }

    public int getNombreExemplairesDispo() {
        return nombreExemplairesDispo;
    }

    public void setNombreExemplairesDispo(int nombreExemplairesDispo) {
        this.nombreExemplairesDispo = nombreExemplairesDispo;
    }

    public void setOuvrage(OuvragePojo o){
        this.id = o.getId();
        this.titre = o.getTitre();
        this.editeur = o.getEditeur();
        this.nature = o.getNature();
        this.resume = o.getResume();
        this.nombrePages = o.getNombrePages();
        this.dateParution = o.getDateParution();
        this.prix = o.getPrix();
        this.nombreExemplaires = o.getNombreExemplaires();
        this.nombreExemplairesDispo = o.getNombreExemplairesDispo();
    }
}
