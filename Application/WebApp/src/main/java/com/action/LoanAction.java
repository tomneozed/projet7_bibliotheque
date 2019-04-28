package com.action;

import com.model.LoanToDisplay;
import com.model.User;
import com.opensymphony.xwork2.ActionContext;
import com.ws.OuvragePojo;
import com.ws.PretPojo;
import com.ws.PretResponse;
import com.ws.UtilisateurResponse;

import org.apache.struts2.interceptor.SessionAware;
import org.eclipse.jdt.internal.compiler.ast.ThisReference;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class LoanAction extends AbstractAction implements SessionAware {

    //=========  ATTRIBUTES  =========
	//INPUT
	private int loanId;
	
	private OuvragePojo ouvrage;
	
	private int ouvrageId;
	
	//OUTPUT
	private List<PretPojo> userLoans= new ArrayList<PretPojo>();

    private Map<String, Object> session;

    private PretPojo loan;
    
    private String ouvrageTitle = "";
    
    private Date dateDebutToDisplay;
    
    private Date dateFinToDisplay;
    
    private boolean loanAlreadyExists = false;
    
    private List<LoanToDisplay> loansToDisplay = new ArrayList<LoanToDisplay>();
    
    //=========  GETTERS & SETTERS  =========
	public List<LoanToDisplay> getLoansToDisplay() {
		return loansToDisplay;
	}

	public void setLoansToDisplay(List<LoanToDisplay> loansToDisplay) {
		this.loansToDisplay = loansToDisplay;
	}

	public boolean isLoanAlreadyExists() {
		return loanAlreadyExists;
	}

	public void setLoanAlreadyExists(boolean loanAlreadyExists) {
		this.loanAlreadyExists = loanAlreadyExists;
	}

	public Date getDateDebutToDisplay() {
		return dateDebutToDisplay;
	}

	public void setDateDebutToDisplay(Date dateDebutToDisplay) {
		this.dateDebutToDisplay = dateDebutToDisplay;
	}

	public Date getDateFinToDisplay() {
		return dateFinToDisplay;
	}

	public void setDateFinToDisplay(Date dateFinToDisplay) {
		this.dateFinToDisplay = dateFinToDisplay;
	}

	public int getLoanId() {
		return loanId;
	}

	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}

	public List<PretPojo> getUserLoans() {
		return userLoans;
	}

	public void setUserLoans(List<PretPojo> userLoans) {
		this.userLoans = userLoans;
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
	
	public int getOuvrageId() {
		return ouvrageId;
	}

	public void setOuvrageId(int ouvrageId) {
		this.ouvrageId = ouvrageId;
	}
	
	public String getOuvrageTitle() {
		return ouvrageTitle;
	}

	public void setOuvrageTitle(String ouvrageTitle) {
		this.ouvrageTitle = ouvrageTitle;
	}
	
    //=========  METHODS  =========

	public String doListByUser()
    {
        User user = (User) session.get("user");
            
        userLoans = getLoansByUser(user);

        if(userLoans.size() == 0)
        {
            return ERROR;
        }else
        {
        	for(PretPojo p : userLoans) {
        		LoanToDisplay ltd = new LoanToDisplay();
        		ltd.setLoan(p);
        		ltd.setOuvrage(getBibliothekService().getOuvrage(p.getIdOuvrage()).getOuvrages().get(0));
        		this.loansToDisplay.add(ltd);
        	}
            session = ActionContext.getContext().getSession();
            session.put("userLoanList", userLoans);
            return SUCCESS;
        }
    }
	
	private List<PretPojo> getLoansByUser(User user){
		PretResponse allLoans = getBibliothekService().allLoans();
		List<PretPojo> userLoans = new ArrayList<PretPojo>();
		
        for(int i = 0; i < allLoans.getPrets().size(); i++){
        	PretPojo loan = allLoans.getPrets().get(i);
        	if(loan != null && loan.getIdUtilisateur() == user.getId()) {
        		userLoans.add(loan);
        	}
        }
        return userLoans;
	}
	
	public String doDetail()
    {
		userLoans = (List<PretPojo>)session.get("userLoanList");
        if(!userLoans.isEmpty())
        {
            for (PretPojo p : userLoans) {
                if(p.getId() == loanId){
                    loan = p;
                }
            }
            ouvrage = getBibliothekService().getOuvrage(loan.getIdOuvrage()).getOuvrages().get(0);
        }
        if(loan == null)
        {
            return ERROR;
        }else
        {
            return SUCCESS;
        }
    }
	
    
    public String doExtend()
    {
        if(getLoanId() > 0)
        {
            PretResponse pr = getBibliothekService().extendLoan(loanId);
            this.loan = getBibliothekService().getLoan(loanId).getPrets().get(0);
            ouvrage = getBibliothekService().getOuvrage(loan.getIdOuvrage()).getOuvrages().get(0);
            return SUCCESS;
        }
        return ERROR;
    }
    
    public String doReturn()
    {
    	if(getLoanId() > 0) {
    		PretResponse pr = getBibliothekService().loanReturn(loanId);
    		this.loan = getBibliothekService().getLoan(loanId).getPrets().get(0);
    		ouvrage = getBibliothekService().getOuvrage(loan.getIdOuvrage()).getOuvrages().get(0);
    		return SUCCESS;
    	}
    	return ERROR;
    }
	
	
	public String doCreateLoan() {
		User user = (User) session.get("user");
		System.out.println(this.ouvrageId);
		this.loan = new PretPojo();
		 
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(new Date());
		XMLGregorianCalendar xmlCalendar = null;
		try {
			xmlCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
			this.loan.setDateDebutPret(xmlCalendar);	
			this.dateDebutToDisplay = this.loan.getDateDebutPret().toGregorianCalendar().getTime();
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
		}
		
		cal.add(Calendar.WEEK_OF_MONTH, 2);
		
		try {
			xmlCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
			this.loan.setDateFinPret(xmlCalendar);	
			this.dateFinToDisplay = this.loan.getDateFinPret().toGregorianCalendar().getTime();
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
		}
		
		this.loan.setEtat("en cours");
		this.loan.setProlongation(false);
		this.loan.setIdOuvrage(ouvrageId);
		this.loan.setIdUtilisateur(user.getId());
		System.out.println(this.loan);
		
		userLoans = getLoansByUser(user);
		if(userLoans != null) {
			for(PretPojo loan : userLoans){
				if(loan.getIdOuvrage() == this.loan.getIdOuvrage()) {
					System.out.println("Vous avez déjà un emprunt sur ce livre");
					this.loanAlreadyExists = true;
					return SUCCESS;
				}
			}
		}
		
		this.ouvrageTitle = getBibliothekService().getOuvrage(loan.getIdOuvrage()).getOuvrages().get(0).getTitre();
		
		int loanId = getBibliothekService().createLoan(this.loan);
		if(loanId > 0) {
			return SUCCESS;
		}else {
			return ERROR;
		}
	}
}
