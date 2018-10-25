package com.bibliothek.gestion.interfaces;

import com.bibliothek.DAO.pojo.AuteurPojo;
import com.bibliothek.gestion.beans.AuteurBean;

import java.util.List;

public interface GestionAuteur {
    /**
     * Returns specified author from database
     * @param auteurId
     * @return
     */
    AuteurBean findAuteurById(int auteurId);

    /**
     * Returns all the auteurs from the database
     * @return
     */
    List<AuteurBean> findAllAuteurs();

    /**
     * Saves the specified auteur in the database
     * @param a
     */
    void createAuteur(AuteurPojo a);

    /**
     * Delete specified auteur from the database
     * @param a
     */
    void deleteAuteur(AuteurPojo a);
}
