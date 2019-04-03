package com.DAO.impl;

import java.util.List;

import com.DAO.exceptions.DaoException;
import com.DAO.interfaces.UtilisateurDao;
import com.DAO.pojo.UtilisateurPojo;

public class UtilisateurDaoImpl extends AbstractDao implements UtilisateurDao {
	
	public UtilisateurDaoImpl() {
		super();
	}
	
	@Override
	public List findAll() throws DaoException {
		return super.findAll(UtilisateurPojo.class);
	}
	
	@Override
	public UtilisateurPojo findById(int id) throws DaoException {
		return (UtilisateurPojo)super.find(UtilisateurPojo.class, id);
	}
	
	@Override
	public int create(UtilisateurPojo utilisateur) throws DaoException {
		return super.save(utilisateur);
	}
	
	@Override
	public void update(UtilisateurPojo utilisateur) throws DaoException {
		super.update(utilisateur);
	}
	
	@Override
	public void delete(UtilisateurPojo utilisateur) throws DaoException {
		super.delete(utilisateur);
	}
	
	@Override
	public UtilisateurPojo findByPseudo(String pseudo) throws DaoException {
		List<UtilisateurPojo> utilisateurs = findAll();
		for(UtilisateurPojo utilisateur: utilisateurs) {
			if(utilisateur.getPseudo().contentEquals(pseudo)) {
				return utilisateur;
			}
		}
		if(utilisateurs == null) {
			throw new DaoException("Not Found");
		}
		return null;		
	}
	
	public boolean checkPassword(String pseudo, String password) {
		UtilisateurPojo u = findByPseudo(pseudo);
		return u.getMotDePasse().equals(password);
	}
	
	
	
	
}