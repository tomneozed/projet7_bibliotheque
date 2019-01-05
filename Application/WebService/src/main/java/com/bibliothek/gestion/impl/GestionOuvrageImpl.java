package com.bibliothek.gestion.impl;

import com.bibliothek.DAO.impl.AuteurDaoImpl;
import com.bibliothek.DAO.impl.OuvrageDaoImpl;
import com.bibliothek.DAO.interfaces.AuteurDao;
import com.bibliothek.DAO.interfaces.OuvrageDao;
import com.bibliothek.DAO.pojo.AuteurPojo;
import com.bibliothek.DAO.pojo.OuvragePojo;
import com.bibliothek.gestion.beans.AuteurAndOuvragesBean;
import com.bibliothek.gestion.beans.OuvrageBean;
import com.bibliothek.gestion.interfaces.GestionOuvrage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Named
public class GestionOuvrageImpl implements GestionOuvrage {

    //ATTRIBUTES
    @Inject
    private OuvrageDao ouvrageDao;

    @Inject
    private AuteurDao auteurDao;

    //CONTRUCTORS
    public GestionOuvrageImpl() {
    }

    public GestionOuvrageImpl(OuvrageDao ouvrageDao, AuteurDao auteurDao)
    {
        this.ouvrageDao = ouvrageDao;
        this.auteurDao = auteurDao;
    }

    //METHODS
    @Override
    public OuvrageBean findOuvrageById(int id)
    {
        OuvrageBean ouvrageBean = new OuvrageBean();

        ouvrageBean.setOuvrage(ouvrageDao.findById(id));

        return ouvrageBean;
    }

    @Override
    public List<OuvrageBean> findAllOuvrages(){

        List<OuvrageBean> ouvrageBeanList = new ArrayList<>();
        List<OuvragePojo> ouvragePojos = ouvrageDao.findAll();

        for (OuvragePojo ouvragePojo : ouvragePojos) {
            OuvrageBean ouvrageBean = new OuvrageBean();
            ouvrageBean.setOuvrage(ouvragePojo);
            ouvrageBeanList.add(ouvrageBean);
        }

        return ouvrageBeanList;
    }

    @Override
    public List<OuvrageBean> findAllOuvragesByParameter(String parameter)
    {
        List<OuvrageBean> ouvrageBeanList = new ArrayList<>();
        List<OuvragePojo> ouvragePojos = ouvrageDao.findAllByParam(parameter);

        for (OuvragePojo ouvragePojo : ouvragePojos) {
            OuvrageBean ouvrageBean = new OuvrageBean();
            ouvrageBean.setOuvrage(ouvragePojo);
            ouvrageBeanList.add(ouvrageBean);
        }

        return ouvrageBeanList;
    }

    @Override
    public AuteurAndOuvragesBean findAllOuvragesByAuteurId(AuteurPojo auteurPojo)
    {
        return new AuteurAndOuvragesBean(auteurDao.findById(auteurPojo.getId()));
    }

    @Override
    public void createOuvrage(OuvragePojo ouvragePojo){
        ouvrageDao.create(ouvragePojo);
    }

    @Override
    public void deleteOuvrage(OuvragePojo ouvragePojo){
        ouvrageDao.delete(ouvragePojo);
    }

    //GETTERS & SETTERS

    public OuvrageDao getOuvrageDao() {
        return ouvrageDao;
    }

    public void setOuvrageDao(OuvrageDao ouvrageDao) {
        this.ouvrageDao = ouvrageDao;
    }

    public AuteurDao getAuteurDao() {
        return auteurDao;
    }

    public void setAuteurDao(AuteurDao auteurDao) {
        this.auteurDao = auteurDao;
    }
}
