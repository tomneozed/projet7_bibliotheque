package com.bibliothek.gestion.beans;

import com.bibliothek.DAO.pojo.UtilisateurPojo;

public class UtilisateurBean {

    private String nom;

    private String prenom;

    private String pseudo;

    private String motDePasse;

    private String email;

    public UtilisateurBean() {
    }

    public UtilisateurBean(String nom, String prenom, String pseudo, String motDePasse, String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.pseudo = pseudo;
        this.motDePasse = motDePasse;
        this.email = email;
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
