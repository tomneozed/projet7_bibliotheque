package com.action;

import com.opensymphony.xwork2.ActionSupport;
import generated.bibliothekservice.BibliothekService;
import generated.bibliothekservice.UtilisateurResponse;

public class LoginAction extends ActionSupport {
    BibliothekService bibliothekService;

    public String execute()
    {
        UtilisateurResponse utilisateurResponse = bibliothekService.identification("AlainTerrieur", "MotDePasse");

        utilisateurResponse.getUtilisateurBeanList();

        return "success";
    }
}
