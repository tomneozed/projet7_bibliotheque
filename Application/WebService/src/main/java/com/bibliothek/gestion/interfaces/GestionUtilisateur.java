package com.bibliothek.gestion.interfaces;

import com.bibliothek.DAO.pojo.Utilisateur;

public interface GestionUtilisateur {
    /**
     * Finds user by pseudo and check if the password is correct
     * @param pseudo
     * @param motDePasse
     * @return true or false
     */
    boolean verifMotDePasse(String pseudo, String motDePasse);


    /**
     * Saves the specified user in the database
     * @param utilisateur
     */
    void createUtilisateur(Utilisateur utilisateur);

    /**
     * Delete specified user from the database
     * @param utilisateur
     */
    void deleteUtilisateur(Utilisateur utilisateur);
}
