package com.bibliothek.gestion.impl;

import com.bibliothek.DAO.exceptions.DaoException;
import com.bibliothek.DAO.impl.OuvrageDaoImpl;
import com.bibliothek.DAO.impl.PretDaoImpl;
import com.bibliothek.DAO.impl.UtilisateurDaoImpl;
import com.bibliothek.DAO.interfaces.OuvrageDao;
import com.bibliothek.DAO.pojo.OuvragePojo;
import com.bibliothek.DAO.pojo.PretPojo;
import com.bibliothek.DAO.pojo.UtilisateurPojo;
import com.bibliothek.exceptions.FunctionalException;
import com.bibliothek.gestion.beans.PretBean;
import com.bibliothek.gestion.interfaces.GestionPret;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class GestionPretImpl implements GestionPret {

    @Autowired
    PretDaoImpl pretDao = new PretDaoImpl();

    @Autowired
    UtilisateurDaoImpl utilisateurDao = new UtilisateurDaoImpl();

    @Autowired
    OuvrageDao ouvrageDao = new OuvrageDaoImpl();


    @Override
    public PretPojo prolongerPret(int idPret) throws FunctionalException {
        PretPojo pretPojo;
        pretPojo = pretDao.findById(idPret);

        //Extend time (in weeks)
        int prolongation = 4;

        if (pretPojo.isProlongation()){
            throw new FunctionalException("Loan has already been extend");

        }else if(pretPojo.getEtat().equals("termine")) {
            throw new FunctionalException("Loan is finished");

        } else{
                //Convert Date to Calendar
                Calendar c = Calendar.getInstance();
                c.setTime(pretPojo.getDateFinPret());

                //Extending return date
                c.add(Calendar.WEEK_OF_MONTH, prolongation);

                //Convert Calendar back to Date
                pretPojo.setDateFinPret(c.getTime());

                pretPojo.setProlongation(true);

                //Updating database
                pretDao.update(pretPojo);
        }
        return pretPojo;
    }

    @Override
    public PretPojo prolongerPret(PretPojo pretPojo) throws FunctionalException {
        return prolongerPret(pretPojo.getId());
    }

    @Override
    public List<PretBean> remonterPrets(UtilisateurPojo utilisateurPojo) throws DaoException{
        List<PretBean> pretBeanList = new ArrayList<>();
        List<PretPojo> pretPojoList;

        pretPojoList = pretDao.findAllByUtilisateur(utilisateurPojo);
        for (int i = 0; i< pretPojoList.size(); i++){
            PretBean pretBean = new PretBean();
            pretBean.setPret(pretPojoList.get(i));
            pretBeanList.add(pretBean);
        }
        return pretBeanList;
    }

    @Override
    public List<PretBean> remonterPrets(int utilisateurId){

        return remonterPrets(utilisateurDao.findById(utilisateurId));
    }

    @Override
    public PretBean remonterPret(int pretId){
        PretBean pretBean = new PretBean();
        pretBean.setPret(pretDao.findById(pretId));
        return pretBean;
    }

    @Override
    public List<PretBean> remonterPretsNonRendus(){
        List<PretBean> pretBeanList = new ArrayList<>();
        List<PretPojo> pretPojoList;

        //Filters and extracts non rendered loans
        pretPojoList = filterNonRenderedLoans(pretDao.findAll());

        for (int i = 0; i< pretPojoList.size(); i++){
            PretBean pretBean = new PretBean();
            pretBean.setPret(pretPojoList.get(i));
            pretBeanList.add(pretBean);
        }
        return pretBeanList;
    }

    @Override
    public List<PretBean> remonterTousLesPrets(){
        List<PretBean> pretBeanList = new ArrayList<>();
        List<PretPojo> pretPojoList;

        pretPojoList = pretDao.findAll();
        for (int i = 0; i< pretPojoList.size(); i++){
            PretBean pretBean = new PretBean();
            pretBean.setPret(pretPojoList.get(i));
            pretBeanList.add(pretBean);
        }
        return pretBeanList;
    }

    @Override
    public int nouveauPret(PretPojo pretPojo) throws FunctionalException{
        List<PretPojo> pretsByUtilisateur;
        OuvragePojo ouvrage;
        int id = -1;
        boolean loanAlreadyExists = true;
        UtilisateurPojo utilisateur;
        utilisateur = utilisateurDao.findById(pretPojo.getIdUtilisateur());
        ouvrage = ouvrageDao.findById(pretPojo.getIdOuvrage());
        if(ouvrage.getNombreExemplairesDispo() > 0)
        {
            pretsByUtilisateur = pretDao.findAllByUtilisateur(utilisateur);

            for(PretPojo pret : pretsByUtilisateur){
                if((pret.getIdOuvrage() == pretPojo.getIdOuvrage()))
                {
                    if((pret.getEtat().equals("en cours")))
                    {
                        throw new FunctionalException("You cannot loan an ouvrage 2 times");
                    }
                }else
                {
                    loanAlreadyExists = false;
                }
            }
            if(!loanAlreadyExists){
                id = pretDao.create(pretPojo);
            }
        }else{
            throw new FunctionalException("This book is not available");
        }
        return id ;
    }

    @Override
    public PretBean retourPret(int pretId) throws DaoException{
        PretPojo pretPojo;

        pretPojo = pretDao.findById(pretId);

        if(pretPojo.getEtat().equals("non rendu"))
        {
            pretPojo.setDateFinPret(new Date());
        }
        pretPojo.setEtat("termine");

        pretDao.update(pretPojo);

        return remonterPret(pretId);
    }


    @Override
    public void majPret(){
        List<PretPojo> pretPojoList;
        OuvragePojo ouvrage;


        pretPojoList = pretDao.findAll();

        for (PretPojo pret : pretPojoList){
            if (pret.getEtat().equals("en cours")){
                if(pret.checkDate()){
                    pretDao.update(pret);
                }

            }
            majDispoOuvrages(pretPojoList);
        }
    }


    private void majDispoOuvrages(List<PretPojo> prets)
    {
        OuvragePojo ouvrage;
        List<OuvragePojo> ouvragePojoList = new ArrayList<>();
        ouvragePojoList = ouvrageDao.findAll();

        for(int i = 0; i < ouvragePojoList.size(); i++){
            ouvragePojoList.get(i).setNombreExemplairesDispo(ouvragePojoList.get(i).getNombreExemplaires());
            ouvrageDao.update(ouvragePojoList.get(i));
        }

        for(int i =0; i < prets.size(); i++)
        {
            if(prets.get(i).getEtat().equals("en cours")||prets.get(i).getEtat().equals("non rendu"))
            {
                ouvrage = ouvrageDao.findById(prets.get(i).getIdOuvrage());
                ouvrage.setNombreExemplairesDispo(ouvrage.getNombreExemplairesDispo()-1);
                ouvrageDao.update(ouvrage);
            }
        }
    }


    /**
     * Takes a PretPojo list and returns only non-rendered ones
     * @param pretPojoList
     * @return
     */
    private List<PretPojo> filterNonRenderedLoans(List<PretPojo> pretPojoList){
        List<PretPojo> nonRenderedLoans = new ArrayList<>();

        for (PretPojo pret : pretPojoList){
            if (pret.getEtat().equals("non rendu")){
                nonRenderedLoans.add(pret);
            }
        }
        return nonRenderedLoans;
    }

}
