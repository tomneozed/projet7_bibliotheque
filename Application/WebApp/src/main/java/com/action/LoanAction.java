package com.action;

import com.opensymphony.xwork2.ActionSupport;
import generated.bibliothekservice.BibliothekService;
import generated.bibliothekservice.PretBean;
import generated.bibliothekservice.PretResponse;

import java.util.ArrayList;
import java.util.List;

public class LoanAction extends ActionSupport {

    private BibliothekService bibliothekService;

    private PretResponse userLoans = new PretResponse();

    private List<PretBean> loansList= new ArrayList<PretBean>();

    public String loansList()
    {
        userLoans = bibliothekService.userLoansByPseudo("username");

        loansList = userLoans.getPretBeanList();

        if(userLoans.getPretBeanList().isEmpty())
        {
            return ERROR;
            //addActionMessage("You don't have any loans");
        }else
        {
            return SUCCESS;
        }
    }

    public BibliothekService getBibliothekService() {
        return bibliothekService;
    }

    public void setBibliothekService(BibliothekService bibliothekService) {
        this.bibliothekService = bibliothekService;
    }

    public PretResponse getUserLoans() {
        return userLoans;
    }

    public void setUserLoans(PretResponse userLoans) {
        this.userLoans = userLoans;
    }

    public List<PretBean> getLoansList() {
        return loansList;
    }

    public void setLoansList(List<PretBean> loansList) {
        this.loansList = loansList;
    }
}
