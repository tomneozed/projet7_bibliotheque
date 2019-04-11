package com.action;

import com.model.User;
import com.opensymphony.xwork2.ActionContext;
import com.ws.OuvragePojo;
import com.ws.PretPojo;
import com.ws.PretResponse;
import com.ws.UtilisateurResponse;

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
    
    private OuvragePojo ouvrage;


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
    
	public OuvragePojo getOuvrage() {
		return ouvrage;
	}

	public void setOuvrage(OuvragePojo ouvrage) {
		this.ouvrage = ouvrage;
	}
	
    //=========  METHODS  =========
	
	public String doListByUser()
    {
        PretResponse allLoans = getBibliothekService().allLoans();
        User user = (User) session.get("user");
        
        for(int i = 0; i < allLoans.getPrets().size(); i++){
        	PretPojo loan = allLoans.getPrets().get(i);
        	if(loan != null && loan.getIdUtilisateur() == user.getId()) {
        		loansList.add(loan);
        	}
        }

        //loansList = userLoans.getPretBeanList();

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
        //userLoans = getBibliothekService().userLoansByPseudo("alainTerrieur");

        loansList = (List<PretPojo>)session.get("userLoanList");
        if(!loansList.isEmpty())
        {
        	//loan = loansList.get(loanId);
            for (PretPojo p : loansList) {
                if(p.getId() == loanId){
                    loan = p;
                }
            }
            
            ouvrage = getBibliothekService().getOuvrage(loan.getIdOuvrage()).getOuvrages().get(0);
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
    /*
    public String doExtend()
    {
        if(getLoanId() > 0)
        {
            getBibliothekService().extendLoan(loanId);
            return SUCCESS;
        }
        return ERROR;
    }*/
}
