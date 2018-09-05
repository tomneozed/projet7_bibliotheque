package com.bibliothek.DAO.impl;

import com.bibliothek.DAO.HibernateFactory;
import com.bibliothek.DAO.exceptions.DaoException;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

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
