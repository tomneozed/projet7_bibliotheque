package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.ws.BibliothekService;
import com.ws.BibliothekServiceService;
import org.springframework.beans.factory.annotation.Autowired;

public class AbstractAction extends ActionSupport {

    //=========  ATTRIBUTES  =========
    BibliothekServiceService bibliothekServiceService = new BibliothekServiceService();

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