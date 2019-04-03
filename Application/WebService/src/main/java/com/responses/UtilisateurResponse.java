package com.responses;

import java.util.ArrayList;
import java.util.List;

import com.DAO.pojo.UtilisateurPojo;

public class UtilisateurResponse extends AbstractResponse {
	
	private List<UtilisateurPojo> utilisateurs = new ArrayList<UtilisateurPojo>();

	public List<UtilisateurPojo> getUtilisateurs() {
		return utilisateurs;
	}

	public void setUtilisateurs(List<UtilisateurPojo> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}
}