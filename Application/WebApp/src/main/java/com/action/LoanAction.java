package com.action;

import com.opensymphony.xwork2.ActionContext;
import com.ws.PretPojo;
import com.ws.PretResponse;
import org.apache.struts2.interceptor.SessionAware;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LoanAction extends AbstractAction implements SessionAware {

    //=========  ATTRIBUTES  =========

    private int loanId;

    private PretResponse userLoans = new PretResponse();

    private List<PretPojo> loansList= new ArrayList<PretPojo>();

    private Map<String, Object> session;

    private PretPojo loan;


    //=========  GETTERS & SETTERS  =========

    public int getLoanId() {
		return loanId;
	}

	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}

	public PretResponse getUserLoans() {
		return userLoans;
	}

	public void setUserLoans(PretResponse userLoans) {
		this.userLoans = userLoans;
	}

	public List<PretPojo> getLoansList() {
		return loansList;
	}

	public void setLoansList(List<PretPojo> loansList) {
		this.loansList = loansList;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public PretPojo getLoan() {
		return loan;
	}

	public void setLoan(PretPojo loan) {
		this.loan = loan;
	}
    

    //=========  METHODS  =========
	/*
    public String doListByUser()
    {
        userLoans = getBibliothekServiceService().userLoansByPseudo("alainTerrieur");

        loansList = userLoans.getPretBeanList();

        if(loansList.size() == 0)
        {
            return ERROR;
            //addActionMessage("You don't have any loans");
        }else
        {
            session = ActionContext.getContext().getSession();
            session.put("userLoanList", loansList);
            return SUCCESS;
        }
    }

	public String doDetail()
    {
        userLoans = getBibliothekService().userLoansByPseudo("alainTerrieur");

        loansList = (List<PretBean>)session.get("userLoanList");
        if(!loansList.isEmpty())
        {
            for (PretBean p : loansList) {
                if(p.getId() == loanId){
                    loan = p;
                }
            }
        }
        if(loan == null)
        {
            return ERROR;
            //addActionMessage("You don't have any loans");
        }else
        {
            return SUCCESS;
        }
    }

    public String doExtend()
    {
        if(getLoanId() > 0)
        {
            getBibliothekService().extendLoan(loanId);
            return SUCCESS;
        }
        return ERROR;
    }
	*/
}
