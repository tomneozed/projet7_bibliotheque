package com.bibliothek.gestion.interfaces;

import com.bibliothek.DAO.pojo.AuteurPojo;
import com.bibliothek.DAO.pojo.OuvragePojo;
import com.bibliothek.gestion.beans.AuteurAndOuvragesBean;
import com.bibliothek.gestion.beans.OuvrageBean;
import org.springframework.stereotype.Component;

import java.util.List;

public interface GestionOuvrage {
    /**
     * Find specified ouvrage from its id
     * @param id
     * @return
     */
    OuvrageBean findOuvrageById(int id);

    /**
     * Returns all ouvrages from the database
     * @return
     */
    List<OuvrageBean> findAllOuvrages();


    /**
     * Returns all ouvrages from database with parameter in the title
     * @param parameter
     * @return
     */
    List<OuvrageBean> findAllOuvragesByParameter(String parameter);

    /**
     * Returns all ouvrages from specified auteurPojo
     * @param auteurPojo
     * @return
     */
    AuteurAndOuvragesBean findAllOuvragesByAuteurId(AuteurPojo auteurPojo);


    /**
     * Saves the specified ouvragePojo in the database
     * @param ouvragePojo
     */
    void createOuvrage(OuvragePojo ouvragePojo);

    /**
     * Deletes the specified ouvragePojo from database
     * @param ouvragePojo
     */
    void deleteOuvrage(OuvragePojo ouvragePojo);
}
