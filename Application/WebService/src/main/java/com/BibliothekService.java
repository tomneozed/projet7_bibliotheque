package com;

import java.util.List;

import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.DAO.exceptions.DaoException;
import com.DAO.impl.AuteurDaoImpl;
import com.DAO.interfaces.AuteurDao;
import com.DAO.interfaces.OuvrageDao;
import com.DAO.interfaces.PretDao;
import com.DAO.interfaces.UtilisateurDao;
import com.DAO.pojo.AuteurPojo;
import com.DAO.pojo.OuvragePojo;
import com.DAO.pojo.PretPojo;
import com.DAO.pojo.UtilisateurPojo;
import com.responses.AbstractResponse;
import com.responses.AuteurResponse;
import com.responses.OuvrageResponse;
import com.responses.PretResponse;
import com.responses.UtilisateurResponse;

import javax.jws.WebMethod;
import javax.jws.WebService;


@WebService(name = "BibliothekService")
public class BibliothekService {

	ApplicationContext context;
	private AuteurResponse auteurResponse;
	private AuteurDao auteurDao;
	private AuteurPojo auteurPojo;
	
	private OuvrageResponse ouvrageResponse;
	private OuvrageDao ouvrageDao;
	private OuvragePojo ouvragePojo;
	
	private PretResponse pretResponse;
	private PretDao pretDao;
	private PretPojo pretPojo;
	
	private UtilisateurResponse utilisateurResponse;
	private UtilisateurDao utilisateurDao;
	private UtilisateurPojo utilisateurPojo;
	
	private void initBeans() {
		context = new ClassPathXmlApplicationContext("spring.xml");
		
		auteurResponse = (AuteurResponse) context.getBean("auteurResponse");
		auteurDao = (AuteurDao) context.getBean("auteurDAO");
		auteurPojo = (AuteurPojo) context.getBean("auteurPojo");
		
		ouvrageResponse = (OuvrageResponse) context.getBean("ouvrageResponse");
		ouvrageDao = (OuvrageDao) context.getBean("ouvrageDAO");
		ouvragePojo = (OuvragePojo) context.getBean("ouvragePojo");
		
		pretResponse = (PretResponse) context.getBean("pretResponse");
		pretDao = (PretDao) context.getBean("pretDAO");
		pretPojo = (PretPojo) context.getBean("pretPojo");
		
		utilisateurResponse = (UtilisateurResponse) context.getBean("utilisateurResponse");
		utilisateurDao = (UtilisateurDao) context.getBean("utilisateurDAO");
		utilisateurPojo = (UtilisateurPojo) context.getBean("utilisateurPojo");
	}

	/************ AUTEUR CRUD ************/
	//Create auteur
	@WebMethod
	public int createAuteur(AuteurPojo auteur) {
		initBeans();
		int id = 0;
		try {
			id = auteurDao.create(auteur);
		}catch(DaoException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return id;
	}
	
	//Get all the auteurs
	@WebMethod
	public AuteurResponse allAuteurs() {
		initBeans();
		auteurResponse.setAuteurs(auteurDao.findAll());
		return auteurResponse;
	}
	
	//Get the specified auteur
	@WebMethod
	public AuteurResponse getAuteur(int id) {
		initBeans();
		try {
			auteurPojo = auteurDao.findById(id);
			auteurResponse.getAuteurs().add(auteurPojo);
		}catch(DaoException e) {
			auteurResponse.setErrorMessage(e.getMessage());
			auteurResponse.setErrorType(2);
		}catch(Exception e) {
			auteurResponse.setErrorMessage(e.getMessage());
			auteurResponse.setErrorType(1);
		}
		return auteurResponse;
	}
	
	//Update auteur
	@WebMethod
	public void updateAuteur(AuteurPojo auteur) {
		initBeans();
		try {
			auteurDao.update(auteur);
		}catch(DaoException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//Delete auteur
	@WebMethod
	public void deleteAuteur(AuteurPojo auteur) {
		initBeans();
		try {
			auteurDao.delete(auteur);
		}catch(DaoException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/************ OUVRAGES CRUD ************/
	//Create ouvrage
	@WebMethod
	public int createOuvrage(OuvragePojo ouvrage) {
		initBeans();
		int id = 0;
		try {
			id = ouvrageDao.create(ouvrage);
		}catch(DaoException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return id;
	}
	
	//Get all the ouvrages
	@WebMethod
	public OuvrageResponse allOuvrages() {
		initBeans();
		ouvrageResponse.setOuvrages(ouvrageDao.findAll());
		return ouvrageResponse;
	}

	//Get the specified ouvrage
	@WebMethod
	public OuvrageResponse getOuvrage(int id) {
		initBeans();
		try {
			ouvragePojo = ouvrageDao.findById(id);
			ouvrageResponse.getOuvrages().add(ouvragePojo);
		}catch(DaoException e) {
			ouvrageResponse.setErrorMessage(e.getMessage());
			ouvrageResponse.setErrorType(2);
		}catch(Exception e) {
			ouvrageResponse.setErrorMessage(e.getMessage());
			ouvrageResponse.setErrorType(1);
		}
		return ouvrageResponse;
	}
	
	//Deletes the specified ouvrage
	@WebMethod
	public void deleteOuvrage(OuvragePojo ouvrage) {
		initBeans();
		try {
			ouvrageDao.delete(ouvrage);
		}catch(DaoException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/************ PRETS CRUD ************/
	
	//Creates loan
	@WebMethod
	public int createLoan(PretPojo pret) {
		initBeans();
		int id = 0;
		try {
			pretDao.majPrets();
			id = pretDao.create(pret);
		}catch(DaoException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return id;
	}
	
	//Gets all loans
	@WebMethod
	public PretResponse allLoans() {
		initBeans();
		pretDao.majPrets();
		pretResponse.setPrets(pretDao.findAll());
		return pretResponse;
	}
	
	//Gets the specified loan
	@WebMethod
	public PretResponse getLoan(int id) {
		initBeans();
		try {
			pretDao.majPrets();
			pretPojo = pretDao.findById(id);
			pretResponse.getPrets().add(pretPojo);
		}catch(DaoException e) {
			pretResponse.setErrorMessage(e.getMessage());
			pretResponse.setErrorType(2);
		}catch(Exception e) {
			pretResponse.setErrorMessage(e.getMessage());
			pretResponse.setErrorType(1);
		}
		return pretResponse;
	}
	
	//Get all the not rendered loans (for batch use)
	@WebMethod
	public PretResponse notRenderedLoans() {
		initBeans();
		try {
			pretDao.majPrets();
			pretResponse.setPrets(pretDao.notRenderedLoans());
		}catch(DaoException e) {
			pretResponse.setErrorMessage(e.getMessage());
			pretResponse.setErrorType(2);
		}catch(Exception e) {
			pretResponse.setErrorMessage(e.getMessage());
			pretResponse.setErrorType(1);
		}
		return pretResponse;
	}
	
	//Returns loan
	public PretResponse loanReturn(int id) {
		return new PretResponse();
	}
	
	/************ UTILISATEUR CRUD ************/
	//Identification
	@WebMethod()
	public UtilisateurResponse identification(String pseudo, String motDePasse) {
		initBeans();
		if(utilisateurDao.checkPassword(pseudo, motDePasse))
		{
			try {
				utilisateurResponse.getUtilisateurs().add(utilisateurDao.findByPseudo(pseudo));
			}catch(HibernateException e) {
				utilisateurResponse.setErrorType(2);
				utilisateurResponse.setErrorMessage(e.getMessage());
			}
		}else {
			utilisateurResponse.setErrorType(2);
			utilisateurResponse.setErrorMessage("Pseudo or password invalid");
		}
		return utilisateurResponse;
	}
}

	



