package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.service.TutoFinderService;

public class SimpleAction extends ActionSupport {

    private String bestTutoSite;
    private String language;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getBestTutoSite() {
        return bestTutoSite;
    }

    public void setBestTutoSite(String bestTutoSite) {
        this.bestTutoSite = bestTutoSite;
    }

    public String execute(){
        TutoFinderService service = new TutoFinderService();
        System.out.println(getLanguage());
        setBestTutoSite(service.getBestTutoSite());
        return ActionSupport.SUCCESS;

    }
}
