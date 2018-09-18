package com.bibliothek.DAO.impl;

import com.bibliothek.DAO.exceptions.DaoException;
import com.bibliothek.DAO.interfaces.OuvrageDao;
import com.bibliothek.DAO.pojo.AuteurOuvrage;
import com.bibliothek.DAO.pojo.Ouvrage;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class OuvrageDaoImpl extends AbstractDao implements OuvrageDao {

    public OuvrageDaoImpl(){
        super();
    }

    @Override
    public Ouvrage findById(int id) throws DaoException {

        return (Ouvrage)super.find(Ouvrage.class, id);
    }

    @Override
    public List<Ouvrage> findAllByAuteurId(int auteurId) throws DaoException{

        List<AuteurOuvrage> tousLesOuvrages = super.findAll(AuteurOuvrage.class);

        List<Ouvrage> ouvrages = new ArrayList<>();
        for (int i=0; i< tousLesOuvrages.size(); i++ )
        {
            if(tousLesOuvrages.get(i).getAuteurId() == auteurId)
            {
                ouvrages.add((Ouvrage)super.find(Ouvrage.class, tousLesOuvrages.get(i).getOuvrageId()));
            }
        }
        return ouvrages;
    }

    @Override
    public int create(Ouvrage ouvrage) throws DaoException {
        super.saveOrUpdate(ouvrage);
        System.out.println(ouvrage.getId());
        return ouvrage.getId();
    }

    @Override
    public void delete(Ouvrage ouvrage) throws DaoException {
        super.delete(ouvrage);
    }

    @Override
    public void update(Ouvrage ouvrage) throws DaoException {
        super.saveOrUpdate(ouvrage);
    }


    @Override
    public List findAll() throws DaoException {

        return super.findAll(Ouvrage.class);
    }

}
