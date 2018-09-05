package com.bibliothek.DAO.interfaces;

import com.bibliothek.DAO.exceptions.DaoException;
import com.bibliothek.pojo.Auteur;

import java.util.List;

public interface AuteurDao {

    Auteur findById(int id) throws DaoException;

    int create(Auteur auteur) throws DaoException;

    void delete(Auteur auteur) throws DaoException;

    void update(Auteur auteur) throws DaoException;

    List findAll() throws DaoException;
}
