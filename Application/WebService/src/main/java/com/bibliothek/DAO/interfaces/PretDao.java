package com.bibliothek.DAO.interfaces;

import com.bibliothek.DAO.exceptions.DaoException;
import com.bibliothek.DAO.pojo.Pret;

import java.util.List;

public interface PretDao {

    Pret findById(int id) throws DaoException;

    int create(Pret pret) throws DaoException;

    void delete(Pret pret) throws DaoException;

    void update(Pret pret) throws DaoException;

    List findAll() throws DaoException;
}
