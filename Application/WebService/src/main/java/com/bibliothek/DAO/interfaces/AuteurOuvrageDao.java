package com.bibliothek.DAO.interfaces;

import java.util.List;

public interface AuteurOuvrageDao {

    Object findByAuteurId(Class clazz, int auteurId);

    Object findByOuvrageId(Class clazz, int ouvrageId);

    abstract List findAll(Class clazz);
}
