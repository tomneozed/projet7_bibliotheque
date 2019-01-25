package com.bibliothek.gestion.interfaces;

import com.bibliothek.DAO.pojo.UtilisateurPojo;
import com.bibliothek.gestion.beans.UtilisateurBean;

public interface GestionUtilisateur {

    /**
     * Finds user by pseudo and check if the password is correct
     * @param pseudo
     * @param motDePasse
     * @return true or false
     */
    boolean verifMotDePasse(String pseudo, String motDePasse);


    /**
     * Finds user by pseudo and returns it into a UtilisateurBean
     * @param pseudo
     * @return
     */
    UtilisateurBean findUtilisateurByPseudo(String pseudo);

    /**
     * Saves the specified user in the database
     * @param utilisateurPojo
     */
    void createUtilisateur(UtilisateurPojo utilisateurPojo);

    /**
     * Delete specified user from the database
     * @param utilisateurPojo
     */
    void deleteUtilisateur(UtilisateurPojo utilisateurPojo);
}
