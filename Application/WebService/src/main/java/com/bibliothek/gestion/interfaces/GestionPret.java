package com.bibliothek.gestion.interfaces;

import com.bibliothek.DAO.exceptions.DaoException;
import com.bibliothek.DAO.pojo.PretPojo;
import com.bibliothek.DAO.pojo.UtilisateurPojo;
import com.bibliothek.exceptions.FunctionalException;
import com.bibliothek.gestion.beans.PretBean;
import org.springframework.stereotype.Component;

import java.util.List;

public interface GestionPret {
    /**
     * Extends the loan of id idPret for 4 weeks
     * @param idPret
     * @return
     */
    PretPojo prolongerPret(int idPret) throws FunctionalException;

    /**
     * Extends the loan of id idPret for 4 weeks
     * @param pretPojo
     * @return
     */
    PretPojo prolongerPret(PretPojo pretPojo) throws FunctionalException;

    /**
     * Returns utilisateurPojo's loans
     * @param utilisateurPojo
     * @return
     */
    List<PretBean> remonterPrets(UtilisateurPojo utilisateurPojo);

    /**
     * Returns utilisateur's loans
     * @param utilisateurId
     * @return
     */
    List<PretBean> remonterPrets(int utilisateurId);

    PretBean remonterPret(int pretId);

    List<PretBean> remonterPretsNonRendus();

    List<PretBean> remonterTousLesPrets();

    /**
     * Saves new PretPojo into database
     * @param pretPojo
     */
    int nouveauPret(PretPojo pretPojo) throws FunctionalException;

    PretBean retourPret(int pretId) throws DaoException;

    /**
     * Check loans date and update their states if needed
     */
    void majPret();
}
