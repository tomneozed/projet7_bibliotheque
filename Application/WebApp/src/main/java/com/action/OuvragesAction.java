package com.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import generated.bibliothek.OuvrageBean;
import generated.bibliothek.OuvrageResponse;
import org.apache.struts2.interceptor.SessionAware;

import java.util.List;
import java.util.Map;

public class OuvragesAction extends AbstractAction implements SessionAware {

    //=========  ATTRIBUTES  =========
    private List<OuvrageBean> ouvrageList;
    private OuvrageResponse ouvragesResearch;
    private int ouvrageId;
    private OuvrageBean ouvrage;
    private Map<String, Object> session;
    private String research;

    //=========  GETTERS & SETTERS  =========

    public List<OuvrageBean> getOuvrageList() {
        return ouvrageList;
    }

    public void setOuvrageList(List<OuvrageBean> ouvrageList) {
        this.ouvrageList = ouvrageList;
    }

    public int getOuvrageId() {
        return ouvrageId;
    }

    public void setOuvrageId(int ouvrageId) {
        this.ouvrageId = ouvrageId;
    }

    public OuvrageBean getOuvrage() {
        return ouvrage;
    }

    public void setOuvrage(OuvrageBean ouvrage) {
        this.ouvrage = ouvrage;
    }

    public void setSession(Map<String, Object> map) {
    }

    public String getResearch() {
        return research;
    }

    public void setResearch(String research) {
        this.research = research;
    }

    public OuvrageResponse getOuvragesResearch() {
        return ouvragesResearch;
    }

    public void setOuvragesResearch(OuvrageResponse ouvragesResearch) {
        this.ouvragesResearch = ouvragesResearch;
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
            session = ActionContext.getContext().getSession();
            session.put("allOuvrages", ouvrageList);
            return ActionSupport.SUCCESS;
        }
    }

    public String doDetail()
    {
        session = ActionContext.getContext().getSession();
        ouvrageList = (List<OuvrageBean>)session.get("allOuvrages");
        if(session.get("allOuvrages") != null)
        {
            ouvrage = ouvrageList.get(ouvrageId);
        }

        if(ouvrage == null)
        {
            return ActionSupport.ERROR;
        }else
        {
            return ActionSupport.SUCCESS;
        }
    }

    public String doResearch()
    {
        ouvragesResearch = getBibliothekService().ouvragesSearch("Harry");

        ouvrageList = ouvragesResearch.getOuvrages();

        if(ouvrageList.isEmpty())
        {
            return ActionSupport.ERROR;
        }else
        {
            session = ActionContext.getContext().getSession();
            session.put("ouvragesResearch", ouvrageList);
            return ActionSupport.SUCCESS;
        }
    }
}
