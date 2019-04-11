package com.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import com.ws.OuvragePojo;
import com.ws.OuvrageResponse;
import org.apache.struts2.interceptor.SessionAware;

import java.util.List;
import java.util.Map;

public class OuvragesAction extends AbstractAction implements SessionAware {

    //=========  ATTRIBUTES  =========
    private List<OuvragePojo> ouvrageList;
    private OuvrageResponse ouvragesResearch;
    private int ouvrageId;
    private OuvragePojo ouvrage;
    private Map<String, Object> session;
    private String research;

    //=========  GETTERS & SETTERS  =========
    public List<OuvragePojo> getOuvrageList() {
		return ouvrageList;
	}

	public void setOuvrageList(List<OuvragePojo> ouvrageList) {
		this.ouvrageList = ouvrageList;
	}

	public OuvrageResponse getOuvragesResearch() {
		return ouvragesResearch;
	}

	public void setOuvragesResearch(OuvrageResponse ouvragesResearch) {
		this.ouvragesResearch = ouvragesResearch;
	}

	public int getOuvrageId() {
		return ouvrageId;
	}

	public void setOuvrageId(int ouvrageId) {
		this.ouvrageId = ouvrageId;
	}

	public OuvragePojo getOuvrage() {
		return ouvrage;
	}

	public void setOuvrage(OuvragePojo ouvrage) {
		this.ouvrage = ouvrage;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getResearch() {
		return research;
	}

	public void setResearch(String research) {
		this.research = research;
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
        ouvrageList = (List<OuvragePojo>)session.get("allOuvrages");
        if(session.get("allOuvrages") != null)
        {
            ouvrage = getBibliothekService().getOuvrage(ouvrageId).getOuvrages().get(0);
        }

        if(ouvrage == null)
        {
            return ActionSupport.ERROR;
        }else
        {
            return ActionSupport.SUCCESS;
        }
    }

	/*
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
    */
}
