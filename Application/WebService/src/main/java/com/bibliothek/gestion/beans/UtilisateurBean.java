package com.bibliothek.gestion.beans;

import com.bibliothek.DAO.pojo.UtilisateurPojo;
import org.springframework.stereotype.Component;

@Component
public class UtilisateurBean {

    //ATTRIBUTES
    private int id;

    private String nom;

    private String prenom;

    private String pseudo;

    private String motDePasse;

    private String email;

    private String numeroTelephone;

    private String adresse;

    private String departement;

    private String ville;

    private String pays;

    //CONTRUCTORS
    public UtilisateurBean() {
    }

    public UtilisateurBean(int id, String nom, String prenom, String pseudo, String motDePasse, String email, String numeroTelephone, String adresse, String departement, String ville, String pays) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.pseudo = pseudo;
        this.motDePasse = motDePasse;
        this.email = email;
        this.numeroTelephone = numeroTelephone;
        this.adresse = adresse;
        this.departement = departement;
        this.ville = ville;
        this.pays = pays;
    }

    //GETTERS & SETTERS

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumeroTelephone() {
        return numeroTelephone;
    }

    public void setNumeroTelephone(String numeroTelephone) {
        this.numeroTelephone = numeroTelephone;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
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

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUtilisateur(UtilisateurPojo utilisateurPojo)
    {
        this.nom = utilisateurPojo.getNom();
        this.prenom = utilisateurPojo.getPrenom();
        this.pseudo = utilisateurPojo.getPseudo();
        this.motDePasse = utilisateurPojo.getMotDePasse();
        this.email = utilisateurPojo.getEmail();
    }
}
