package com.bibliothek.gestion.impl;

import com.bibliothek.DAO.impl.UtilisateurDaoImpl;
import com.bibliothek.DAO.interfaces.UtilisateurDao;
import com.bibliothek.DAO.pojo.UtilisateurPojo;
import com.bibliothek.gestion.beans.UtilisateurBean;
import com.bibliothek.gestion.interfaces.GestionUtilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GestionUtilisateurImpl implements GestionUtilisateur {

    //ATTRIBUTES
    //@Autowired
    private UtilisateurDao utilisateurDao = new UtilisateurDaoImpl();

    //METHODS
    @Override
    public boolean verifMotDePasse(String pseudo, String motDePasse) {
        UtilisateurPojo u = utilisateurDao.findByPseudo(pseudo);
        return u.getMotDePasse().equals(motDePasse);
    }

    @Override
    public UtilisateurBean findUtilisateurByPseudo(String pseudo){
        UtilisateurBean utilisateurBean = new UtilisateurBean();
        utilisateurBean.setUtilisateur(utilisateurDao.findByPseudo(pseudo));
        return utilisateurBean;
    }

    @Override
    public void createUtilisateur(UtilisateurPojo utilisateurPojo){
        utilisateurDao.create(utilisateurPojo);
    }

    @Override
    public void deleteUtilisateur(UtilisateurPojo utilisateurPojo){
        utilisateurDao.delete(utilisateurPojo);
    }

    //GETTERS & SETTERS
    public UtilisateurDao getUtilisateurDao() {
        return utilisateurDao;
    }

    public void setUtilisateurDao(UtilisateurDao utilisateurDao) {
        this.utilisateurDao = utilisateurDao;
    }
}
