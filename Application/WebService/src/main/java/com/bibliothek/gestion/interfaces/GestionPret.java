package com.bibliothek.gestion.interfaces;

import com.bibliothek.DAO.pojo.Pret;
import com.bibliothek.DAO.pojo.Utilisateur;
import com.bibliothek.exceptions.FunctionalException;
import com.bibliothek.gestion.beans.PretResponse;

import java.util.List;

public interface GestionPret {
    /**
     * Extends the loan of id idPret for 4 weeks
     * @param idPret
     * @return
     */
    Pret prolongerPret(int idPret) throws FunctionalException;

    /**
     * Extends the loan of id idPret for 4 weeks
     * @param pret
     * @return
     */
    Pret prolongerPret(Pret pret) throws FunctionalException;

    /**
     * Returns utilisateur's loans
     * @param utilisateur
     * @return
     */
    List<PretResponse> remonterPrets(Utilisateur utilisateur);

    /**
     * Returns utilisateur's loans
     * @param utilisateurId
     * @return
     */
    List<PretResponse> remonterPrets(int utilisateurId);

    /**
     * Saves new Pret into database
     * @param pret
     */
    void nouveauPret(Pret pret);
}
