package com.DAO.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.DAO.HibernateFactory;
import com.DAO.exceptions.DaoException;
import com.DAO.pojo.AuteurPojo;
import com.DAO.pojo.OuvragePojo;

public class AbstractDao {
	
	protected Session session;
	private Transaction transaction;
	
	public AbstractDao() {
		HibernateFactory.buildIfNeeded();
	}

	protected void update(Object object) {
		try {
			startOperation();
			session.saveOrUpdate(object);
			transaction.commit();
		}catch(HibernateException e) {
			handleException(e);
		}finally {
			HibernateFactory.close(session);
		}
	}
	
	/**
     * CRUD's Create method
     * @param objec
     * @return
     */
    protected Integer save(Object object){
        Integer id = -1;
        try{
            startOperation();
            id = (Integer)session.save(object);
            transaction.commit();
            if(id == -1)
            {
                throw new DaoException("Saving object " + object.toString() + " failed");
            }
        }catch(HibernateException e)
        {
            handleException(e);
        }finally{
            HibernateFactory.close(session);
        }
        return id;
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
    protected Object find(Class clazz, int id) throws DaoException{
        Object object = null;
        try{
            startOperation();
            object = session.get(clazz, id);
            if(object == null)
            {
                throw new DaoException("The id " + id +" doesn't seems to correspond to any object from the table " + clazz.getName());
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

    /**
     * Returns all the objects from specified class
     * @param clazz
     * @return
     */
    protected List findAll(Class clazz) throws DaoException {
        List<Class> objects = null;
        String className = parsePojo(clazz.getName());
        try{
            startOperation();
            objects = session.createQuery("from " + clazz.getName()).getResultList();
            if(objects == null)
            {
                throw new DaoException("There is no object from " + clazz.getName() + " in the database" );
            }
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
    protected void handleException(HibernateException e) throws DaoException{
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

    private String parsePojo(String str)
    {
        String value ="";
        for(int i =0 ; i < str.length() -4; i++)
        {
            value += str.charAt(i);
        }
        return value;
    }
}
