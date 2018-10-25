package com.bibliothek.gestion.impl;

import com.bibliothek.DAO.exceptions.DaoException;
import com.bibliothek.DAO.impl.AuteurDaoImpl;
import com.bibliothek.DAO.pojo.AuteurPojo;
import com.bibliothek.gestion.beans.AuteurBean;
import com.bibliothek.gestion.interfaces.GestionAuteur;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class GestionAuteurImpl implements GestionAuteur {

    @Autowired
    AuteurDaoImpl auteurDao = new AuteurDaoImpl();

    @Override
    public AuteurBean findAuteurById(int auteurId) throws DaoException
    {
        AuteurBean auteurBean = new AuteurBean();

        auteurBean.setAuteur(auteurDao.findById(auteurId));

        return auteurBean;
    }

    @Override
    public List<AuteurBean> findAllAuteurs()throws DaoException {

        List<AuteurBean> auteurBeanList = new ArrayList<>();
        List<AuteurPojo> auteurPojoList ;
        auteurPojoList =  auteurDao.findAll();

        for(int i = 0; i < auteurPojoList.size(); i++){

            AuteurBean auteurBean = new AuteurBean();
            auteurBean.setAuteur(auteurPojoList.get(i));
            auteurBeanList.add(auteurBean);
        }

        return auteurBeanList;
    }

    @Override
    public void createAuteur(AuteurPojo a) throws DaoException{

        auteurDao.create(a);
    }

    @Override
    public void deleteAuteur(AuteurPojo a) throws DaoException{

        auteurDao.delete(a);
    }






}
