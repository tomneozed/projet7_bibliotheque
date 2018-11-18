package com.action;

import com.opensymphony.xwork2.ActionSupport;
import generated.bibliothekservice.OuvrageBean;

import java.util.List;

public class OuvragesAction extends AbstractAction {

    //=========  ATTRIBUTES  =========
    private List<OuvrageBean> ouvrageList;
    private int id;
    private OuvrageBean ouvrage;

    //=========  GETTERS & SETTERS  =========


    public List<OuvrageBean> getOuvrageList() {
        return ouvrageList;
    }

    public void setOuvrageList(List<OuvrageBean> ouvrageList) {
        this.ouvrageList = ouvrageList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public OuvrageBean getOuvrage() {
        return ouvrage;
    }

    public void setOuvrage(OuvrageBean ouvrage) {
        this.ouvrage = ouvrage;
    }

    //=========  METHODS  =========

    public String doList()
    {
        ouvrageList = getBibliothekService().allOuvrages().getOuvrages();

        if(ouvrageList.size() == 0)
        {
            return ActionSupport.ERROR;
        }else
        {
            return ActionSupport.SUCCESS;
        }
    }


    public String doDetail(int id)
    {
        ouvrage = getBibliothekService().allOuvrages().getOuvrages().get(id);

        if(ouvrage == null)
        {
            return ActionSupport.ERROR;
        }else
        {
            return ActionSupport.SUCCESS;
        }

    }
}
