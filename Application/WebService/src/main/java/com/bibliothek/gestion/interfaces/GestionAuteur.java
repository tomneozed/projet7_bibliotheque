package com.bibliothek.gestion.interfaces;

import com.bibliothek.DAO.pojo.Auteur;
import com.bibliothek.gestion.beans.AuteurResponse;

import java.util.List;

public interface GestionAuteur {
    /**
     * Returns specified author from database
     * @param auteur
     * @return
     */
    AuteurResponse findAuteurById(Auteur auteur);

    /**
     * Returns all the auteurs from the database
     * @return
     */
    List<AuteurResponse> findAllAuteurs();

    /**
     * Saves the specified auteur in the database
     * @param a
     */
    void createAuteur(Auteur a);

    /**
     * Delete specified auteur from the database
     * @param a
     */
    void deleteAuteur(Auteur a);
}
