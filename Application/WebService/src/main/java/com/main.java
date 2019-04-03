package com;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;

import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.DAO.exceptions.DaoException;
import com.DAO.interfaces.AuteurDao;
import com.DAO.interfaces.PretDao;
import com.DAO.interfaces.UtilisateurDao;
import com.DAO.pojo.AuteurPojo;
import com.responses.AuteurResponse;
import com.responses.PretResponse;
import com.responses.UtilisateurResponse;

import org.springframework.beans.factory.annotation.Autowired;

public class main {
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//ApplicationContext context = new ClassPathXmlApplicationContext("com/spring.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		AuteurDao auteurDao = (AuteurDao) context.getBean("auteurDAO");
		
		System.out.println(System.getProperty("spring.xml"));
		
		List<AuteurPojo> auteurs = new ArrayList<AuteurPojo>();
		
		auteurs = auteurDao.findAll();
		
		System.out.println(auteurs);
		
		AuteurPojo auteur = (AuteurPojo) context.getBean("auteurPojo");
		
		AuteurResponse AR = (AuteurResponse) context.getBean("auteurResponse");
		
		PretResponse PR = (PretResponse) context.getBean("pretResponse");
		
		PretDao pretDao = (PretDao) context.getBean("pretDAO");
		
		//PR.setPrets(pretDao.findAll());
		
		try {
			PR.setPrets(pretDao.findAll());
		}catch(DaoException e) {
			AR.setErrorMessage(e.getMessage());
		}
		
//		try {
//			auteur = auteurDao.findById(0);
//			AR.getAuteurs().add(auteur);
//		}catch(DaoException e) {
//			AR.setErrorMessage(e.getMessage());
//		}
		
		UtilisateurDao utilisateurDao = (UtilisateurDao) context.getBean("utilisateurDAO");
		UtilisateurResponse UR = (UtilisateurResponse) context.getBean("utilisateurResponse");
		
		if(utilisateurDao.checkPassword("alainTerrieur", "motDePasse"))
		{
			try {
				UR.getUtilisateurs().add(utilisateurDao.findByPseudo("alexTerrieur"));
			}catch(HibernateException e) {
				UR.setErrorType(2);
				UR.setErrorMessage(e.getMessage());
			}
		}else {
			UR.setErrorType(2);
			UR.setErrorMessage("Pseudo or password invalid");
		}
		
		System.out.println(UR);
		
	}
}
