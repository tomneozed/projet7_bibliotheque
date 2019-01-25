package com.bibliothek.DAO;

import com.bibliothek.DAO.exceptions.DaoException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateFactory {

    private static SessionFactory sessionFactory;
    private static Log log = LogFactory.getLog(HibernateFactory.class);

    /**
     * Constructs a new Singleton SessionFactory
     * @return
     * @throws HibernateException
     */
    public static SessionFactory buildSessionFactory() throws HibernateException{
        if(sessionFactory != null){
            closeFactory();
        }
        return configureSessionFactory();
    }

    /**
     * Constructs a new Singleton SessionFactory if it hasn't been already
     * @return
     * @throws HibernateException
     */
    public static SessionFactory buildIfNeeded() throws HibernateException
    {
        if(sessionFactory != null)
        {
            return sessionFactory;
        }
        try{
            return configureSessionFactory();
        }catch(HibernateException e )
        {
            throw new DaoException(e);
        }
    }

    /**
     * Getter for SessionFactory
     * @return
     */
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    /**
     * Checks and creates a SessionFactory if needed, and opens a new Session
     * @return
     * @throws HibernateException
     */
    public static Session openSession() throws HibernateException{
        buildIfNeeded();
        return sessionFactory.openSession();
    }

    /**
     * Closes SessionFactory
     */
    public static void closeFactory(){
        if(sessionFactory != null){
            try{
                sessionFactory.close();
            }catch (HibernateException ignored)
            {
                log.error("Couldn't close SessionFactory", ignored);
            }
        }
    }

    /**
     * Closes Session
     * @param session
     */
    public static void close(Session session){
        if(session != null)
        {
            try{
                session.close();
            }catch(HibernateException ignored)
            {
                log.error("Couldn't close Session", ignored);
            }
        }
    }

    /**
     * Rollbacks transaction
     * @param transaction
     */
    public static void rollback(Transaction transaction){
        try{
            if (transaction != null){
                transaction.rollback();
            }
        }catch(HibernateException ignored)
        {
            log.error("Couldn't rollback Transaction", ignored);
        }
    }

    /**
     * Configures the SessionFactory
     * @return
     * @throws HibernateException
     */
    private static SessionFactory configureSessionFactory() throws HibernateException{
        Configuration configuration = new Configuration();
        configuration.configure();
        sessionFactory = configuration.buildSessionFactory();
        return sessionFactory;
    }
}
