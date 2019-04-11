package com.model;

import com.ws.OuvragePojo;
import com.ws.PretPojo;

public class LoanToDisplay {
	
	private PretPojo loan;
	private OuvragePojo ouvrage;
	
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
}