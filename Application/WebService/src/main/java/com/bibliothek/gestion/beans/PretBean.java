package com.bibliothek.gestion.beans;

import com.bibliothek.DAO.impl.OuvrageDaoImpl;
import com.bibliothek.DAO.impl.UtilisateurDaoImpl;
import com.bibliothek.DAO.pojo.PretPojo;
import com.bibliothek.DAO.pojo.UtilisateurPojo;

import java.util.Date;

public class PretBean {

    private int id;

    private Date dateDebutPret;

    private Date dateFinPret;

    private boolean prolongation;

    private String etat;

    private UtilisateurPojo utilisateurPojo;

    private OuvrageBean ouvrage;

    public PretBean() {
    }



    public Date getDateDebutPret() {
        return dateDebutPret;
    }

    public void setDateDebutPret(Date dateDebutPret) {
        this.dateDebutPret = dateDebutPret;
    }

    public Date getDateFinPret() {
        return dateFinPret;
    }

    public void setDateFinPret(Date dateFinPret) {
        this.dateFinPret = dateFinPret;
    }

    public boolean isProlongation() {
        return prolongation;
    }

    public void setProlongation(boolean prolongation) {
        this.prolongation = prolongation;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public UtilisateurPojo getUtilisateurPojo() {
        return utilisateurPojo;
    }

    public void setUtilisateurPojo(UtilisateurPojo utilisateurPojo) {
        this.utilisateurPojo = utilisateurPojo;
    }

    public OuvrageBean getOuvrage() {
        return ouvrage;
    }

    public void setOuvrage(OuvrageBean ouvrage) {
        this.ouvrage = ouvrage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPret(PretPojo p)
    {
        UtilisateurDaoImpl utilisateurDao = new UtilisateurDaoImpl();
        this.id = p.getId();
        this.dateDebutPret = p.getDateDebutPret();
        this.dateFinPret = p.getDateFinPret();
        this.prolongation = p.isProlongation();
        this.etat = p.getEtat();
        this.utilisateurPojo = utilisateurDao.findById(p.getIdUtilisateur());
        this.ouvrage = convertOuvragePojoToBean(p);
    }

    private OuvrageBean convertOuvragePojoToBean(PretPojo p)
    {
        OuvrageBean ouvrageBean = new OuvrageBean();
        OuvrageDaoImpl ouvrageDao = new OuvrageDaoImpl();
        ouvrageBean.setOuvrage(ouvrageDao.findById(p.getIdOuvrage()));
        return ouvrageBean;
    }

}
