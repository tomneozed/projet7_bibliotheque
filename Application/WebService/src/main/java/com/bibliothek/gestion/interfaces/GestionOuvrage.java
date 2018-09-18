package com.bibliothek.gestion.interfaces;

import com.bibliothek.DAO.pojo.Auteur;
import com.bibliothek.DAO.pojo.Ouvrage;
import com.bibliothek.gestion.beans.AuteurAndOuvragesResponse;
import com.bibliothek.gestion.beans.OuvrageResponse;

import java.util.List;

public interface GestionOuvrage {
    /**
     * Find specified ouvrage from its id
     * @param id
     * @return
     */
    OuvrageResponse findOuvrageById(int id);

    /**
     * Returns all ouvrages from the database
     * @return
     */
    List<OuvrageResponse> findAllOuvrages();


    /**
     * Returns all ouvrages from database with parameter in the title
     * @param parameter
     * @return
     */
    List<OuvrageResponse> findAllOuvragesByParameter(String parameter);

    /**
     * Returns all ouvrages from specified auteur
     * @param auteur
     * @return
     */
    AuteurAndOuvragesResponse findAllOuvragesByAuteurId(Auteur auteur);


    /**
     * Saves the specified ouvrage in the database
     * @param ouvrage
     */
    void createOuvrage(Ouvrage ouvrage);

    /**
     * Deletes the specified ouvrage from database
     * @param ouvrage
     */
    void deleteOuvrage(Ouvrage ouvrage);
}
