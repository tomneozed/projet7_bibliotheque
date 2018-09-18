package com.bibliothek.gestion.impl;

import com.bibliothek.DAO.impl.AuteurDaoImpl;
import com.bibliothek.DAO.impl.OuvrageDaoImpl;
import com.bibliothek.DAO.pojo.Auteur;
import com.bibliothek.DAO.pojo.Ouvrage;
import com.bibliothek.gestion.beans.AuteurAndOuvragesResponse;
import com.bibliothek.gestion.beans.OuvrageResponse;
import com.bibliothek.gestion.interfaces.GestionOuvrage;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class GestionOuvrageImpl implements GestionOuvrage {

    @Autowired
    private OuvrageDaoImpl ouvrageDao = new OuvrageDaoImpl();

    @Autowired
    private AuteurDaoImpl auteurDao = new AuteurDaoImpl();

    @Override
    public OuvrageResponse findOuvrageById(int id)
    {
        OuvrageResponse ouvrageResponse = new OuvrageResponse();

        ouvrageResponse.setOuvrage(ouvrageDao.findById(id));

        return ouvrageResponse;
    }

    @Override
    public List<OuvrageResponse> findAllOuvrages(){

        List<OuvrageResponse> ouvrageResponseList = new ArrayList<>();
        List<Ouvrage> ouvrages = ouvrageDao.findAll();

        for (Ouvrage ouvrage : ouvrages) {
            OuvrageResponse ouvrageResponse = new OuvrageResponse();
            ouvrageResponse.setOuvrage(ouvrage);
            ouvrageResponseList.add(ouvrageResponse);
        }

        return ouvrageResponseList;
    }

    @Override
    public List<OuvrageResponse> findAllOuvragesByParameter(String parameter)
    {
        List<OuvrageResponse> ouvrageResponseList = new ArrayList<>();
        List<Ouvrage> ouvrages = ouvrageDao.findAllByParam(parameter);

        for (Ouvrage ouvrage : ouvrages) {
            OuvrageResponse ouvrageResponse = new OuvrageResponse();
            ouvrageResponse.setOuvrage(ouvrage);
            ouvrageResponseList.add(ouvrageResponse);
        }

        return ouvrageResponseList;
    }

    @Override
    public AuteurAndOuvragesResponse findAllOuvragesByAuteurId(Auteur auteur)
    {
        return new AuteurAndOuvragesResponse(auteurDao.findById(auteur.getId()));
    }


    @Override
    public void createOuvrage(Ouvrage ouvrage){
        ouvrageDao.create(ouvrage);
    }

    @Override
    public void deleteOuvrage(Ouvrage ouvrage){
        ouvrageDao.delete(ouvrage);
    }


}
