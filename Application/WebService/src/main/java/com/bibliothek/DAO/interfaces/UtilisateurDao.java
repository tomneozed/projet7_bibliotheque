package com.bibliothek.DAO.interfaces;

import com.bibliothek.DAO.exceptions.DaoException;
import com.bibliothek.DAO.pojo.UtilisateurPojo;

import java.util.List;

public interface UtilisateurDao {
    UtilisateurPojo findById(int id) throws DaoException;

    UtilisateurPojo findByPseudo(String pseudo) throws DaoException;

    int create(UtilisateurPojo utilisateurPojo) throws DaoException;

    void delete(UtilisateurPojo utilisateurPojo) throws DaoException;

    void update(UtilisateurPojo utilisateurPojo) throws DaoException;

    List findAll() throws DaoException;
}
