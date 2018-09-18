package com.bibliothek.DAO.impl;

import com.bibliothek.DAO.HibernateFactory;
import com.bibliothek.DAO.exceptions.DaoException;
import com.bibliothek.DAO.pojo.Ouvrage;
import com.bibliothek.DAO.pojo.Pret;
import com.bibliothek.DAO.pojo.Utilisateur;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;


public abstract class AbstractDao {

    private Session session;
    private Transaction transaction;

    public AbstractDao(){
        HibernateFactory.buildIfNeeded();
    }

    /**
     * CRUD's Create and Update method
     * @param object
     */
    protected void saveOrUpdate(Object object){
        try{
            startOperation();
            session.saveOrUpdate(object);
            transaction.commit();
        }catch(HibernateException e)
        {
            handleException(e);
        }finally{
            HibernateFactory.close(session);
        }
    }

    /**
     * CRUD's Delete method
     * @param object
     */
    protected void delete(Object object) {
        try{
            startOperation();
            session.delete(object);
            transaction.commit();
        }catch(HibernateException e)
        {
            handleException(e);
        }finally{
            HibernateFactory.close(session);
        }
    }

    /**
     * CRUD's Read method
     * @param clazz
     * @param id
     * @return
     */
    protected Object find(Class clazz, int id) {
        Object object = null;
        try{
            startOperation();
            object = session.get(clazz, id);
            transaction.commit();
        }catch(HibernateException e)
        {
            handleException(e);
        }finally{
            HibernateFactory.close(session);
        }
        return object;
    }

    /**
     * Returns all the objects from specified class
     * @param clazz
     * @return
     */
    protected List findAll(Class clazz){
        List<Class> objects = null;
        try{
            startOperation();
            objects = session.createQuery("from " + clazz.getName()).getResultList();
            transaction.commit();
        }catch(HibernateException e)
        {
            handleException(e);
        }finally{
            HibernateFactory.close(session);
        }
        return objects;
    }

    public Object findByPseudo(String pseudo) throws DaoException
    {
        Object object = null;
        try{
            startOperation();
            object = session.createQuery("from Utilisateur where pseudo = :pseudo").setParameter("pseudo", pseudo).getSingleResult();
            if(object == null)
            {
                throw new DaoException("Pseudo " + pseudo +" doesn't seems to correspond to any object from the database " );
            }
            transaction.commit();
        }catch(HibernateException e)
        {
            handleException(e);
        }finally{
            HibernateFactory.close(session);
        }
        return object;
    }

    protected List<Pret> findAllPretByUtilisateur(Utilisateur util) throws DaoException
    {
        List<Pret> prets = null;
        try{
            startOperation();
            prets = session.createQuery("from Pret where idUtilisateur = :idUtil").setParameter("idUtil", util.getId()).getResultList();
            if(prets.isEmpty())
            {
                throw new DaoException("There is no loan for the user : " + util.getNom()+ " " + util.getPrenom()) ;
            }
            transaction.commit();
        }catch(HibernateException e)
        {
            handleException(e);
        }finally{
            HibernateFactory.close(session);
        }
        return prets;
    }

    protected List<Ouvrage> findAllByParam(String param) throws DaoException{
        List<Ouvrage> ouvrages = null;
        try{
            startOperation();

            CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();

            CriteriaQuery<Ouvrage> cr = criteriaBuilder.createQuery(Ouvrage.class);

            Root<Ouvrage> root = cr.from(Ouvrage.class);


            cr.select(root).where(criteriaBuilder.like(root.get("titre"), "%param%"));

            Query<Ouvrage> query = session.createQuery(cr);
            ouvrages = query.getResultList();

            if(ouvrages.isEmpty())
            {
                throw new DaoException(param + " doesn't seems to correspond to any object from the database" ) ;
            }
            transaction.commit();
        }catch(HibernateException e)
        {
            handleException(e);
        }finally{
            HibernateFactory.close(session);
        }
        return ouvrages;
    }

    /**
     * Rollbaks current Transaction and throws DaoException
     * @param e
     * @throws DaoException
     */
    protected void handleException(HibernateException e) throws DaoException {
        HibernateFactory.rollback(transaction);
        throw new DaoException(e);
    }

    /**
     * Opens Session and begins Transaction
     * @throws HibernateException
     */
    protected void startOperation() throws HibernateException{
        session = HibernateFactory.openSession();
        transaction = session.beginTransaction();
    }


}
