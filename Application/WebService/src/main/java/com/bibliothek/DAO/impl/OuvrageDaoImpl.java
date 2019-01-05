package com.bibliothek.DAO.impl;

import com.bibliothek.DAO.exceptions.DaoException;
import com.bibliothek.DAO.interfaces.OuvrageDao;
import com.bibliothek.DAO.pojo.AuteurOuvragePojo;
import com.bibliothek.DAO.pojo.AuteurPojo;
import com.bibliothek.DAO.pojo.OuvragePojo;
import org.springframework.stereotype.Component;

import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Named
public class OuvrageDaoImpl extends AbstractDao implements OuvrageDao {

    public OuvrageDaoImpl(){
        super();
    }

    @Override
    public OuvragePojo findById(int id) throws DaoException {
        OuvragePojo ouvragePojo = (OuvragePojo) super.find(OuvragePojo.class, id);
        //ouvragePojo.setAuteurPojos(extractAuteurs(id));
        return ouvragePojo;
    }

    @Override
    public List<OuvragePojo> findAllByParam(String param) throws DaoException{
        return super.findAllByParam(param);
    }

    @Override
    public List<OuvragePojo> findAllByAuteurId(int auteurId) throws DaoException{

        List<AuteurOuvragePojo> tousLesOuvrages = super.findAll(AuteurOuvragePojo.class);

        List<OuvragePojo> ouvragePojos = new ArrayList<>();
        for (int i=0; i< tousLesOuvrages.size(); i++ )
        {
            if(tousLesOuvrages.get(i).getAuteurId() == auteurId)
            {
                ouvragePojos.add((OuvragePojo)super.find(OuvragePojo.class, tousLesOuvrages.get(i).getOuvrageId()));
            }
        }
        return ouvragePojos;
    }

    @Override
    public int create(OuvragePojo ouvragePojo) throws DaoException{
        super.update(ouvragePojo);
        System.out.println(ouvragePojo.getId());
        return ouvragePojo.getId();
    }

    @Override
    public void delete(OuvragePojo ouvragePojo) throws DaoException{
        super.delete(ouvragePojo);
    }

    @Override
    public void update(OuvragePojo ouvragePojo) throws DaoException{
        super.update(ouvragePojo);
    }


    /**
     * Find all ouvrages and associated authors
     * @return
     * @throws DaoException
     */
    @Override
    public List findAll() throws DaoException{
        List<OuvragePojo> ouvragePojos = super.findAll(OuvragePojo.class);

//        for (int i = 0; i < ouvragePojos.size(); i++) {
//            ouvragePojos.get(i).setAuteurPojos(extractAuteurs(ouvragePojos.get(i).getId()));
//        }

        return ouvragePojos;
    }

    /**
     * Filters and returns auteurs from specified ouvragePojo
     * @param ouvragePojo
     * @return
     */
    private List<AuteurPojo> extractAuteurs(OuvragePojo ouvragePojo)
    {
        List<AuteurOuvragePojo> tousLesAuteurs = super.findAll(AuteurOuvragePojo.class);

        List<AuteurPojo> auteurPojos = new ArrayList<AuteurPojo>();
        for (int i=0; i< tousLesAuteurs.size(); i++ )
        {
            if(tousLesAuteurs.get(i).getOuvrageId() == ouvragePojo.getId())
            {
                auteurPojos.add((AuteurPojo)super.find(AuteurPojo.class, tousLesAuteurs.get(i).getAuteurId()));
            }
        }
    return auteurPojos;
    }

}
