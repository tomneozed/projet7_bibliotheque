package com.action;

import com.model.User;
import com.opensymphony.xwork2.ActionSupport;
import generated.bibliothekservice.BibliothekService;
import generated.bibliothekservice.BibliothekServiceService;
import generated.bibliothekservice.PretBean;
import generated.bibliothekservice.PretResponse;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LoanAction extends AbstractAction implements SessionAware {

    //=========  ATTRIBUTES  =========

    private PretResponse userLoans = new PretResponse();

    private List<PretBean> loansList= new ArrayList<PretBean>();

    private Map<String, Object> session;


    //=========  GETTERS & SETTERS  =========

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

    public void setSession(Map<String, Object> map) {
        this.session = map;
    }


    //=========  METHODS  =========

    public String loansListByUser()
    {
        userLoans = getBibliothekService().userLoansByPseudo("alainTerrieur");

        loansList = userLoans.getPretBeanList();

        if(loansList.size() == 0)
        {
            return ERROR;
            //addActionMessage("You don't have any loans");
        }else
        {
            return SUCCESS;
        }
    }



}
