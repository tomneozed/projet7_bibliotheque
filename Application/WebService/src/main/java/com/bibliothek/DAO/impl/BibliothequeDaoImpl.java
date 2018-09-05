package com.bibliothek.DAO.impl;

import com.bibliothek.DAO.exceptions.DaoException;
import com.bibliothek.DAO.interfaces.BibliothequeDao;
import com.bibliothek.pojo.Bibliotheque;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BibliothequeDaoImpl extends AbstractDao implements BibliothequeDao {

    public BibliothequeDaoImpl(){
        super();
    }


    @Override
    public Bibliotheque findById(int id) throws DaoException {

        return (Bibliotheque)super.find(Bibliotheque.class, id);
    }

    @Override
    public int create(Bibliotheque bibliotheque) throws DaoException {
        super.saveOrUpdate(bibliotheque);
        System.out.println(bibliotheque.getId());
        return bibliotheque.getId();
    }

    @Override
    public void delete(Bibliotheque bibliotheque) throws DaoException {
        super.delete(bibliotheque);
    }

    @Override
    public void update(Bibliotheque bibliotheque) throws DaoException {
        super.saveOrUpdate(bibliotheque);
    }

    @Override
    public List findAll() throws DaoException {

        return super.findAll(Bibliotheque.class);
    }
}
