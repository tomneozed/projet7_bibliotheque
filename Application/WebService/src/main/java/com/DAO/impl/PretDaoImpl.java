package com.DAO.impl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.DAO.exceptions.DaoException;
import com.DAO.interfaces.OuvrageDao;
import com.DAO.interfaces.PretDao;
import com.DAO.pojo.OuvragePojo;
import com.DAO.pojo.PretPojo;

public class PretDaoImpl extends AbstractDao implements PretDao {
	
	public PretDaoImpl() {
		super();
	}
	
	@Override
	public PretPojo findById(int id) throws DaoException {
		return (PretPojo)super.find(PretPojo.class, id);
	}
	
	@Override
	public int create(PretPojo pretPojo) throws DaoException {
		return super.save(pretPojo);
	}
	
	@Override
	public void delete(int id) throws DaoException {
		super.delete(id);
	}
	
	@Override
	public void update(PretPojo pretPojo) throws DaoException {
		super.update(pretPojo);
	}
	
	@Override
	public List findAll() throws DaoException {
		return super.findAll(PretPojo.class);
	}
	
	public List<PretPojo> notRenderedLoans() throws DaoException {
		List<PretPojo> allLoans = findAll();
		List<PretPojo> notRenderedLoans = null;
		for(PretPojo pret : allLoans) {
			if(pret.getEtat().equals("non rendu")) {
				notRenderedLoans.add(pret);
			}
		}
		if(notRenderedLoans.size() == 0) {
			throw new DaoException("Not found");
		}
		return notRenderedLoans;
	}
	
	public void majPrets() {
		List<PretPojo> pretPojoList = findAll();
		if(pretPojoList != null) {
			for(PretPojo pret: pretPojoList) {
				if(pret.getEtat().equals("en cours")) {
					majEtat(pret);
				}
			}
			majDisponibilite(pretPojoList);
		}
	}
	
	public void majEtat(PretPojo pret) {
		if(pret.getDateFinPret().before(new Date())) {
			pret.setEtat("non rendu");
			this.update(pret);
		}
	}
	
	public void majDisponibilite(List<PretPojo> prets) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/resources/spring.xml");
		OuvrageDao ouvrageDao = (OuvrageDao) context.getBean("ouvrageDAO");
		
		List<OuvragePojo> ouvrages = ouvrageDao.findAll();
		
		//Init nbrExemplairesDispo at nbrExemplaires
		for(OuvragePojo ouvrage: ouvrages) {
			ouvrage.setNombreExemplairesDispo(ouvrage.getNombreExemplaires());
			ouvrageDao.update(ouvrage);
		}
		
		//Substracts nbrExemplairesDispo from loans 
		for(PretPojo pret: prets) {
			if(pret.getEtat().contentEquals("en cours") || pret.getEtat().contentEquals("non rendu")) {
				OuvragePojo ouvrage = ouvrageDao.findById(pret.getIdOuvrage());
				ouvrage.setNombreExemplairesDispo(ouvrage.getNombreExemplairesDispo() - 1);
				ouvrageDao.update(ouvrage);
			}
		}
	}
	
//	public List<PretPojo> findAllByUser(UtilisateurPojo utilisateur) throws DaoException{
//		return super.findAllPretByUtilisateur(utilisateur);
//	}

}
