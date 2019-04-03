package com.DAO.interfaces;

import java.util.List;

import com.DAO.exceptions.DaoException;
import com.DAO.pojo.UtilisateurPojo;

public interface UtilisateurDao {

	List findAll() throws DaoException;

	UtilisateurPojo findById(int id) throws DaoException;

	int create(UtilisateurPojo utilisateur) throws DaoException;

	void update(UtilisateurPojo utilisateur) throws DaoException;

	void delete(UtilisateurPojo utilisateur) throws DaoException;

	UtilisateurPojo findByPseudo(String pseudo) throws DaoException;
	
	boolean checkPassword(String pseudo, String password);

}