package com.bibliothek.DAO.interfaces;

import com.bibliothek.DAO.exceptions.DaoException;
import com.bibliothek.pojo.Bibliotheque;

import java.util.List;

public interface BibliothequeDao {

    Bibliotheque findById(int id) throws DaoException;

    int create(Bibliotheque bibliotheque) throws DaoException;

    void delete(Bibliotheque bibliotheque) throws DaoException;

    void update(Bibliotheque bibliotheque) throws DaoException;

    List findAll() throws DaoException;
}
