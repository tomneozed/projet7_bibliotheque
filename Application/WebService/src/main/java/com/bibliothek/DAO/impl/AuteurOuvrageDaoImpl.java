package com.bibliothek.DAO.impl;

import com.bibliothek.DAO.interfaces.AuteurOuvrageDao;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AuteurOuvrageDaoImpl extends AbstractDao implements AuteurOuvrageDao {

    public AuteurOuvrageDaoImpl() {super();}

    @Override
    public Object findByAuteurId(Class clazz, int auteurId) {
        return super.find(clazz, auteurId);
    }

    @Override
    public Object findByOuvrageId(Class clazz, int ouvrageId) {
        return super.find(clazz, ouvrageId);
    }

    @Override
    public List findAll(Class clazz) {
        return super.findAll(clazz);
    }
}
