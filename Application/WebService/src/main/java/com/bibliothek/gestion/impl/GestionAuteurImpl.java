package com.bibliothek.gestion.impl;

import com.bibliothek.DAO.exceptions.DaoException;
import com.bibliothek.DAO.impl.AuteurDaoImpl;
import com.bibliothek.DAO.pojo.Auteur;
import com.bibliothek.gestion.beans.AuteurResponse;
import com.bibliothek.gestion.interfaces.GestionAuteur;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class GestionAuteurImpl implements GestionAuteur {

    @Autowired
    AuteurDaoImpl auteurDao = new AuteurDaoImpl();

    @Override
    public AuteurResponse findAuteurById(Auteur auteur)
    {
        AuteurResponse auteurResponse = new AuteurResponse();
        try{
            auteurResponse.setAuteur(auteurDao.findById(auteur.getId()));
        }catch(DaoException daoE){
            auteurResponse.setTypeErreur(2);
            auteurResponse.setMessageErreur(daoE.getMessage());
        }catch(Exception e){
            e.printStackTrace();
        }
        return auteurResponse;
    }

    @Override
    public List<AuteurResponse> findAllAuteurs(){

        List<AuteurResponse> auteurResponseList = new ArrayList<>();
        List<Auteur> auteurs = auteurDao.findAll();

        for(int i = 0; i < auteurs.size(); i++){
            try
            {
                auteurResponseList.get(i).setAuteur(auteurs.get(i));
            }catch(DaoException e){
                auteurResponseList.get(i).setTypeErreur(2);
                auteurResponseList.get(i).setMessageErreur(e.getMessage());
            }catch(Exception e){
                e.printStackTrace();
            }

        }

        return auteurResponseList;
    }

    @Override
    public void createAuteur(Auteur a){
        try{
            auteurDao.create(a);
        }catch(DaoException daoE)
        {
            daoE.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public void deleteAuteur(Auteur a){
        try{
            auteurDao.delete(a);
        }catch(DaoException daoE)
        {
            daoE.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }

    }






}
