package com.bibliothek.gestion.beans;

import com.bibliothek.DAO.impl.AuteurDaoImpl;
import com.bibliothek.DAO.pojo.Auteur;
import com.bibliothek.DAO.pojo.Ouvrage;

import java.util.ArrayList;
import java.util.List;

public class OuvrageAndAuteursResponse extends OuvrageResponse {

    private List<AuteurResponse> auteurResponseList;

    public OuvrageAndAuteursResponse() {
    }

    public OuvrageAndAuteursResponse(Ouvrage ouvrage) {
        this.setOuvrage(ouvrage);
        setAuteurResponseList(findAuteursFromOuvrage(ouvrage.getId()));
    }

    public List<AuteurResponse> getAuteurResponseList() {
        return auteurResponseList;
    }

    public void setAuteurResponseList(List<AuteurResponse> auteurResponseList) {
        this.auteurResponseList = auteurResponseList;
    }

    private List<AuteurResponse> findAuteursFromOuvrage(int ouvrageId)
    {
        List<AuteurResponse> auteurResponseList = new ArrayList<>();
        List<Auteur> auteursByOuvrage = new ArrayList<>();

        AuteurDaoImpl auteurDao = new AuteurDaoImpl();

        auteursByOuvrage = auteurDao.findAllByOuvrageId(ouvrageId);

        for (int i =0 ; i < auteursByOuvrage.size(); i++ ){
            AuteurResponse auteurResponse = new AuteurResponse();
            auteurResponse.setAuteur(auteursByOuvrage.get(i));

            auteurResponseList.add(auteurResponse);
        }

        return auteurResponseList;
    }
}
