package com.action;

import com.opensymphony.xwork2.ActionSupport;
import generated.BibliothekService;
import generated.BibliothekServiceService;
import org.springframework.beans.factory.annotation.Autowired;

public class AbstractAction extends ActionSupport {

    //=========  ATTRIBUTES  =========
    BibliothekServiceService bibliothekServiceService = new BibliothekServiceService();

    @Autowired
    private BibliothekService bibliothekService = bibliothekServiceService.getBibliothekServicePort();

    //=========  GETTERS & SETTERS  =========

    public BibliothekServiceService getBibliothekServiceService() {
        return bibliothekServiceService;
    }

    public void setBibliothekServiceService(BibliothekServiceService bibliothekServiceService) {
        this.bibliothekServiceService = bibliothekServiceService;
    }

    public BibliothekService getBibliothekService() {
        return bibliothekService;
    }

    public void setBibliothekService(BibliothekService bibliothekService) {
        this.bibliothekService = bibliothekService;
    }
}
