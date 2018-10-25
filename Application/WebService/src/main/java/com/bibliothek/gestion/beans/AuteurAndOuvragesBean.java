package com.bibliothek.gestion.beans;

import com.bibliothek.DAO.impl.OuvrageDaoImpl;
import com.bibliothek.DAO.pojo.AuteurPojo;
import com.bibliothek.DAO.pojo.OuvragePojo;

import java.util.ArrayList;
import java.util.List;

public class AuteurAndOuvragesBean extends AuteurBean {

    private List<OuvrageBean> ouvrageBeanList;

    public AuteurAndOuvragesBean() {
    }

    public AuteurAndOuvragesBean(AuteurPojo auteurPojo) {
        this.setAuteur(auteurPojo);
        setOuvrageBeanList(findOuvragesFromAuteur(auteurPojo.getId()));
    }

    public List<OuvrageBean> getOuvrageBeanList() {
        return ouvrageBeanList;
    }

    public void setOuvrageBeanList(List<OuvrageBean> ouvrageBeanList) {
        this.ouvrageBeanList = ouvrageBeanList;
    }


    public List<OuvrageBean> findOuvragesFromAuteur(int auteurId){
        List<OuvrageBean> ouvrageBeanList = new ArrayList<>();
        List<OuvragePojo> ouvragesByAuteur ;

        OuvrageDaoImpl ouvrageDao = new OuvrageDaoImpl();

        ouvragesByAuteur = ouvrageDao.findAllByAuteurId(auteurId);

        for (int i =0 ; i < ouvragesByAuteur.size(); i++ ){
            OuvrageBean ouvrageBean = new OuvrageBean();
            ouvrageBean.setOuvrage(ouvragesByAuteur.get(i));

            ouvrageBeanList.add(ouvrageBean);
        }

        return ouvrageBeanList;
    }







}
