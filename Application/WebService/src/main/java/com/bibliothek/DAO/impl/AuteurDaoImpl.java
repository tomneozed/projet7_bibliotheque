package com.bibliothek.DAO.impl;

import com.bibliothek.DAO.exceptions.DaoException;
import com.bibliothek.DAO.interfaces.AuteurDao;
import com.bibliothek.pojo.Auteur;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AuteurDaoImpl extends AbstractDao implements AuteurDao {

    public AuteurDaoImpl(){
        super();
    }

    @Override
    public Auteur findById(int id) throws DaoException {

        return (Auteur)super.find(Auteur.class, id);
    }

    @Override
    public int create(Auteur auteur) throws DaoException {
        super.saveOrUpdate(auteur);
        System.out.println(auteur.getId());
        return auteur.getId();
    }

    @Override
    public void delete(Auteur auteur) throws DaoException {
        super.delete(auteur);
    }

    @Override
    public void update(Auteur auteur) throws DaoException {
        super.saveOrUpdate(auteur);
    }

    @Override
    public List findAll() throws DaoException {

        return super.findAll(Auteur.class);
    }

}
