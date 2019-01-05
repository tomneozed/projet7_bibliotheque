package com.bibliothek.DAO.interfaces;

import com.bibliothek.DAO.exceptions.DaoException;
import com.bibliothek.DAO.pojo.PretPojo;
import com.bibliothek.DAO.pojo.UtilisateurPojo;

import java.util.List;

public interface PretDao {

    PretPojo findById(int id) throws DaoException;

    int create(PretPojo pretPojo) throws DaoException;

    void delete(PretPojo pretPojo) throws DaoException;

    void update(PretPojo pretPojo) throws DaoException;

    List findAll() throws DaoException;

    List<PretPojo> findAllByUtilisateur(UtilisateurPojo utilisateurPojo);
}
