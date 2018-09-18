package com.bibliothek.gestion.impl;

import com.bibliothek.DAO.impl.PretDaoImpl;
import com.bibliothek.DAO.impl.UtilisateurDaoImpl;
import com.bibliothek.DAO.pojo.Pret;
import com.bibliothek.DAO.pojo.Utilisateur;
import com.bibliothek.exceptions.FunctionalException;
import com.bibliothek.gestion.beans.PretResponse;
import com.bibliothek.gestion.interfaces.GestionPret;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class GestionPretImpl implements GestionPret {

    @Autowired
    PretDaoImpl pretDao = new PretDaoImpl();

    @Autowired
    UtilisateurDaoImpl utilisateurDao = new UtilisateurDaoImpl();

    @Override
    public Pret prolongerPret(int idPret) throws FunctionalException {
        Pret pret;
        pret = pretDao.findById(idPret);

        //Extend time (in weeks)
        int prolongation = 4;

        if (pret.isProlongation()){
            throw new FunctionalException("Loan has already been extend");


        }else if(pret.getEtat().equals("termine")) {
            throw new FunctionalException("Loan is finished");

        } else{
                pret.setProlongation(true);

                //Convert Date to Calendar
                Calendar c = Calendar.getInstance();
                c.setTime(pret.getDateFinPret());

                //Extending return date
                c.add(Calendar.WEEK_OF_MONTH, prolongation);

                //Convert Calendar back to Date
                pret.setDateFinPret(c.getTime());

                //Updating database
                pretDao.update(pret);
        }
        return pret;
    }

    @Override
    public Pret prolongerPret(Pret pret) throws FunctionalException {
        return prolongerPret(pret.getId());
    }


    @Override
    public List<PretResponse> remonterPrets(Utilisateur utilisateur){
        List<PretResponse> pretResponseList = new ArrayList<>();

        List<Pret> pretList ;

        pretList = pretDao.findAllByUtilisateur(utilisateur);
        for (int i = 0; i< pretList.size(); i++){
            pretResponseList.get(i).setPret(pretList.get(i));
        }

        return pretResponseList ;
    }

    @Override
    public List<PretResponse> remonterPrets(int utilisateurId){

        return remonterPrets(utilisateurDao.findById(utilisateurId));
    }


    @Override
    public void nouveauPret(Pret pret){
        pretDao.create(pret);
    }

}
