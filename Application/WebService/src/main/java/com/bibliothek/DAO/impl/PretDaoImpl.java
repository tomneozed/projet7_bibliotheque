package com.bibliothek.DAO.impl;

import com.bibliothek.DAO.exceptions.DaoException;
import com.bibliothek.DAO.interfaces.PretDao;
import com.bibliothek.DAO.pojo.Pret;

import java.util.List;

public class PretDaoImpl extends AbstractDao implements PretDao {

    public PretDaoImpl(){
        super();
    }

    @Override
    public Pret findById(int id) throws DaoException {

        return (Pret)super.find(Pret.class, id);
    }

    @Override
    public int create(Pret pret) throws DaoException {
        super.saveOrUpdate(pret);
        System.out.println(pret.getId());
        return pret.getId();
    }

    @Override
    public void delete(Pret pret) throws DaoException {
        super.delete(pret);
    }

    @Override
    public void update(Pret pret) throws DaoException {
        super.saveOrUpdate(pret);
    }


    @Override
    public List findAll() throws DaoException {

        return super.findAll(Pret.class);
    }
}
