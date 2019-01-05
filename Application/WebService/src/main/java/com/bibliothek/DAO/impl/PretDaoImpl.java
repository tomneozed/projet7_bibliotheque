package com.bibliothek.DAO.impl;

import com.bibliothek.DAO.exceptions.DaoException;
import com.bibliothek.DAO.interfaces.PretDao;
import com.bibliothek.DAO.pojo.PretPojo;
import com.bibliothek.DAO.pojo.UtilisateurPojo;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PretDaoImpl extends AbstractDao implements PretDao {

    public PretDaoImpl(){
        super();
    }

    @Override
    public PretPojo findById(int id) throws DaoException {

        return (PretPojo)super.find(PretPojo.class, id);
    }

    @Override
    public int create(PretPojo pretPojo) throws DaoException{
        return super.save(pretPojo);
    }

    @Override
    public void delete(PretPojo pretPojo) throws DaoException{
        super.delete(pretPojo);
    }

    @Override
    public void update(PretPojo pretPojo) throws DaoException{
        super.update(pretPojo);
    }


    @Override
    public List findAll() throws DaoException{

        return super.findAll(PretPojo.class);
    }

    @Override
    public List<PretPojo> findAllByUtilisateur(UtilisateurPojo utilisateurPojo){
        return super.findAllPretByUtilisateur(utilisateurPojo);
    }
}
