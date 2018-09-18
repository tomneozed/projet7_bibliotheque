package com.bibliothek.DAO.interfaces;

import com.bibliothek.DAO.exceptions.DaoException;
import com.bibliothek.DAO.pojo.Utilisateur;

import java.util.List;

public interface UtilisateurDao {

    Utilisateur findById(int id) throws DaoException;

    int create(Utilisateur utilisateur) throws DaoException;

    Utilisateur findByPseudo(String pseudo) throws DaoException;

    void delete(Utilisateur utilisateur) throws DaoException;

    void update(Utilisateur utilisateur) throws DaoException;

    List findAll() throws DaoException;
}
