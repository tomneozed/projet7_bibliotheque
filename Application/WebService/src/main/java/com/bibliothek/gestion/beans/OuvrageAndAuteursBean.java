package com.bibliothek.gestion.beans;

import com.bibliothek.DAO.impl.AuteurDaoImpl;
import com.bibliothek.DAO.pojo.AuteurPojo;
import com.bibliothek.DAO.pojo.OuvragePojo;

import java.util.ArrayList;
import java.util.List;

public class OuvrageAndAuteursBean extends OuvrageBean {

    private List<AuteurBean> auteurBeanList;

    public OuvrageAndAuteursBean() {
    }

    public OuvrageAndAuteursBean(OuvragePojo ouvragePojo) {
        this.setOuvrage(ouvragePojo);
        setAuteurBeanList(findAuteursFromOuvrage(ouvragePojo.getId()));
    }

    public List<AuteurBean> getAuteurBeanList() {
        return auteurBeanList;
    }

    public void setAuteurBeanList(List<AuteurBean> auteurBeanList) {
        this.auteurBeanList = auteurBeanList;
    }

    private List<AuteurBean> findAuteursFromOuvrage(int ouvrageId)
    {
        List<AuteurBean> auteurBeanList = new ArrayList<>();
        List<AuteurPojo> auteursByOuvrage = new ArrayList<>();

        AuteurDaoImpl auteurDao = new AuteurDaoImpl();

        auteursByOuvrage = auteurDao.findAllByOuvrageId(ouvrageId);

        for (int i =0 ; i < auteursByOuvrage.size(); i++ ){
            AuteurBean auteurBean = new AuteurBean();
            auteurBean.setAuteur(auteursByOuvrage.get(i));

            auteurBeanList.add(auteurBean);
        }

        return auteurBeanList;
    }
}
