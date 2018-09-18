package com.bibliothek.gestion.impl;

import com.bibliothek.DAO.impl.UtilisateurDaoImpl;
import com.bibliothek.DAO.pojo.Utilisateur;
import com.bibliothek.gestion.interfaces.GestionUtilisateur;
import org.springframework.beans.factory.annotation.Autowired;

public class GestionUtilisateurImpl implements GestionUtilisateur {

    @Autowired
    private UtilisateurDaoImpl utilisateurDao = new UtilisateurDaoImpl();

    @Override
    public boolean verifMotDePasse(String pseudo, String motDePasse) {
        Utilisateur u = utilisateurDao.findByPseudo(pseudo);

        if (u.getMotDePasse().equals(motDePasse)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void createUtilisateur(Utilisateur utilisateur){
        utilisateurDao.create(utilisateur);
    }

    @Override
    public void deleteUtilisateur(Utilisateur utilisateur){
        utilisateurDao.delete(utilisateur);
    }



}
