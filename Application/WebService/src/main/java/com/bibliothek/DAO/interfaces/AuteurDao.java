package com.bibliothek.DAO.interfaces;

import com.bibliothek.DAO.exceptions.DaoException;
import com.bibliothek.DAO.pojo.AuteurPojo;

import java.util.List;

public interface AuteurDao {

    AuteurPojo findById(int id) throws DaoException;

    int create(AuteurPojo auteurPojo) throws DaoException;

    void delete(AuteurPojo auteurPojo) throws DaoException;

    void update(AuteurPojo auteurPojo) throws DaoException;

    List findAll() throws DaoException;

    List<AuteurPojo> findAllByOuvrageId(int ouvrageId);
}
