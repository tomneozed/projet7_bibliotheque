package com.bibliothek.gestion.beans;

import com.bibliothek.DAO.pojo.Utilisateur;

public class UtilisateurResponse extends AbstractResponse {

    private String nom;

    private String prenom;

    private String pseudo;

    private String motDePasse;

    private String email;

    public UtilisateurResponse() {
    }

    public UtilisateurResponse(String nom, String prenom, String pseudo, String motDePasse, String email) {
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

    public void setUtilisateur(Utilisateur utilisateur)
    {
        this.nom = utilisateur.getNom();
        this.prenom = utilisateur.getPrenom();
        this.pseudo = utilisateur.getPseudo();
        this.motDePasse = utilisateur.getMotDePasse();
        this.email = utilisateur.getEmail();
    }

}
