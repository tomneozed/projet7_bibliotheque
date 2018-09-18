package com.bibliothek.DAO.impl;

import com.bibliothek.DAO.exceptions.DaoException;
import com.bibliothek.DAO.interfaces.UtilisateurDao;
import com.bibliothek.DAO.pojo.Utilisateur;

import java.util.List;

public class UtilisateurDaoImpl extends AbstractDao implements UtilisateurDao {

    public UtilisateurDaoImpl(){
        super();
    }

    @Override
    public Utilisateur findById(int id) throws DaoException {

        return (Utilisateur)super.find(Utilisateur.class, id);
    }

    @Override
    public int create(Utilisateur utilisateur) throws DaoException {
        super.saveOrUpdate(utilisateur);
        System.out.println(utilisateur.getId());
        return utilisateur.getId();
    }

    @Override
    public void delete(Utilisateur utilisateur) throws DaoException {
        super.delete(utilisateur);
    }

    @Override
    public void update(Utilisateur utilisateur) throws DaoException {
        super.saveOrUpdate(utilisateur);
    }


    @Override
    public List findAll() throws DaoException {

        return super.findAll(Utilisateur.class);
    }
}
