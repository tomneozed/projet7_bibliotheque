package com.bibliothek.webservice.responses;

import com.bibliothek.gestion.beans.UtilisateurBean;

import java.util.ArrayList;
import java.util.List;

public class UtilisateurResponse extends AbstractResponse {

    List<UtilisateurBean> utilisateurBeanList = new ArrayList<>();

    public UtilisateurResponse() {
    }

    public UtilisateurResponse(List<UtilisateurBean> utilisateurBeanList) {
        this.utilisateurBeanList = utilisateurBeanList;
    }

    public List<UtilisateurBean> getUtilisateurBeanList() {
        return utilisateurBeanList;
    }

    public void setUtilisateurBeanList(List<UtilisateurBean> utilisateurBeanList) {
        this.utilisateurBeanList = utilisateurBeanList;
    }
}
