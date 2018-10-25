package com.bibliothek.DAO.interfaces;

import com.bibliothek.DAO.exceptions.DaoException;
import com.bibliothek.DAO.pojo.Ouvrage;

import java.util.List;

public interface OuvrageDao {

    Ouvrage findById(int id) throws DaoException;

    List<Ouvrage> findAllByAuteurId(int auteurId) throws DaoException;

    int create(Ouvrage ouvrage) throws DaoException;

    void delete(Ouvrage ouvrage) throws DaoException;

    void update(Ouvrage ouvrage) throws DaoException;

    List findAll() throws DaoException;
}