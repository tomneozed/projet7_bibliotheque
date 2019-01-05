package com.action;

import com.opensymphony.xwork2.ActionSupport;
import generated.bibliothek.Bibliothek;
import generated.bibliothek.BibliothekService;
import org.springframework.beans.factory.annotation.Autowired;

public class AbstractAction extends ActionSupport {

    //=========  ATTRIBUTES  =========
    Bibliothek bibliothekServiceService;

    @Autowired
    private BibliothekService bibliothekService = bibliothekServiceService.getBibliothekServicePort();

    //=========  GETTERS & SETTERS  =========

    public Bibliothek getBibliothekServiceService() {
        return bibliothekServiceService;
    }

    public void setBibliothekServiceService(Bibliothek bibliothekServiceService) {
        this.bibliothekServiceService = bibliothekServiceService;
    }

    public BibliothekService getBibliothekService() {
        return bibliothekService;
    }

    public void setBibliothekService(BibliothekService bibliothekService) {
        this.bibliothekService = bibliothekService;
    }
}
