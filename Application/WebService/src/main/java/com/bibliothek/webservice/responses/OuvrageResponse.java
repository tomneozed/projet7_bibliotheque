package com.bibliothek.webservice.responses;

import com.bibliothek.gestion.beans.OuvrageBean;

import java.util.ArrayList;
import java.util.List;

public class OuvrageResponse extends AbstractResponse {

    private List<OuvrageBean> ouvrages = new ArrayList<>();

    public OuvrageResponse() {

    }

    public OuvrageResponse(List<OuvrageBean> ouvrages) {
        this.ouvrages = ouvrages;
    }

    public List<OuvrageBean> getOuvrages() {
        return ouvrages;
    }

    public void setOuvrages(List<OuvrageBean> ouvrages) {
        this.ouvrages = ouvrages;
    }
}
