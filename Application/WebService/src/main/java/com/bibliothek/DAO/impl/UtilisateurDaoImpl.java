package com.bibliothek.DAO.impl;

import com.bibliothek.DAO.exceptions.DaoException;
import com.bibliothek.DAO.interfaces.UtilisateurDao;
import com.bibliothek.DAO.pojo.UtilisateurPojo;
import org.springframework.stereotype.Component;

import javax.inject.Named;
import java.util.List;

@Named
public class UtilisateurDaoImpl extends AbstractDao implements UtilisateurDao {

    public UtilisateurDaoImpl(){
        super();
    }

    @Override
    public UtilisateurPojo findById(int id) throws DaoException {

        return (UtilisateurPojo)super.find(UtilisateurPojo.class, id);
    }

    @Override
    public UtilisateurPojo findByPseudo(String pseudo) throws DaoException {

        return (UtilisateurPojo)super.findByPseudo(pseudo);
    }

    @Override
    public int create(UtilisateurPojo utilisateurPojo) throws DaoException{
        super.update(utilisateurPojo);
        System.out.println(utilisateurPojo.getId());
        return utilisateurPojo.getId();
    }

    @Override
    public void delete(UtilisateurPojo utilisateurPojo) throws DaoException{
        super.delete(utilisateurPojo);
    }

    @Override
    public void update(UtilisateurPojo utilisateurPojo) throws DaoException{
        super.update(utilisateurPojo);
    }


    @Override
    public List findAll() throws DaoException{

        return super.findAll(UtilisateurPojo.class);
    }
}
