package com.bibliothek.gestion.beans;

import com.bibliothek.DAO.impl.OuvrageDaoImpl;
import com.bibliothek.DAO.pojo.Auteur;
import com.bibliothek.DAO.pojo.Ouvrage;

import java.util.ArrayList;
import java.util.List;

public class AuteurAndOuvragesResponse extends AuteurResponse {

    private List<OuvrageResponse> ouvrageResponseList;

    public AuteurAndOuvragesResponse() {
    }

    public AuteurAndOuvragesResponse(Auteur auteur) {
        this.setAuteur(auteur);
        setOuvrageResponseList(findOuvragesFromAuteur(auteur.getId()));
    }

    public List<OuvrageResponse> getOuvrageResponseList() {
        return ouvrageResponseList;
    }

    public void setOuvrageResponseList(List<OuvrageResponse> ouvrageResponseList) {
        this.ouvrageResponseList = ouvrageResponseList;
    }


    public List<OuvrageResponse> findOuvragesFromAuteur(int auteurId){
        List<OuvrageResponse> ouvrageResponseList = new ArrayList<>();
        List<Ouvrage> ouvragesByAuteur ;

        OuvrageDaoImpl ouvrageDao = new OuvrageDaoImpl();

        ouvragesByAuteur = ouvrageDao.findAllByAuteurId(auteurId);

        for (int i =0 ; i < ouvragesByAuteur.size(); i++ ){
            OuvrageResponse ouvrageResponse = new OuvrageResponse();
            ouvrageResponse.setOuvrage(ouvragesByAuteur.get(i));

            ouvrageResponseList.add(ouvrageResponse);
        }

        return ouvrageResponseList;
    }







}
