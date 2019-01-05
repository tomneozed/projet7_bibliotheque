package com.bibliothek.DAO.interfaces;

import com.bibliothek.DAO.exceptions.DaoException;
import com.bibliothek.DAO.pojo.OuvragePojo;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OuvrageDao {

    OuvragePojo findById(int id);

    List<OuvragePojo> findAllByParam(String param);

    List<OuvragePojo> findAllByAuteurId(int auteurId);

    int create(OuvragePojo ouvragePojo);

    void delete(OuvragePojo ouvragePojo) throws DaoException;

    void update(OuvragePojo ouvragePojo) throws DaoException;

    List findAll() throws DaoException;
}
