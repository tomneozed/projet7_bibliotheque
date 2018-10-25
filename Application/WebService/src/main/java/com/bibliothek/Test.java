package com.bibliothek;

import com.bibliothek.DAO.impl.AuteurOuvrageDaoImpl;
import com.bibliothek.DAO.impl.OuvrageDaoImpl;
import com.bibliothek.DAO.impl.UtilisateurDaoImpl;
import com.bibliothek.DAO.pojo.UtilisateurPojo;
import com.bibliothek.gestion.impl.GestionPretImpl;
import com.bibliothek.webservice.BibliothekService;
import com.bibliothek.webservice.responses.OuvrageResponse;
import org.springframework.beans.factory.annotation.Autowired;

public class Test {

    @Autowired
    private OuvrageDaoImpl ouvrageDao = new OuvrageDaoImpl();

    @Autowired
    private AuteurOuvrageDaoImpl auteurOuvrageDao = new AuteurOuvrageDaoImpl();

    @Autowired
    private UtilisateurDaoImpl utilisateurDao = new UtilisateurDaoImpl();

    @Autowired
    private GestionPretImpl gestionPretImpl = new GestionPretImpl();

    public void test(){

        BibliothekService bs = new BibliothekService();
//
        OuvrageResponse ouvrageResponse = new OuvrageResponse();
//
//        PretResponse pretResponse = new PretResponse();
//
//        UtilisateurResponse utilisateurResponse = new UtilisateurResponse();
//
//        PretPojo pretTest = new PretPojo();
//
//        PretPojo pretTest2 = new PretPojo();
//
//        UtilisateurPojo utilisateurPojo = new UtilisateurPojo();

        //utilisateurPojo = utilisateurDao.findById(1);

        ouvrageResponse = bs.ouvragesSearch("baudelaire Rowling anne ");

        //pretResponse = bs.allLoans();

        //utilisateurResponse = bs.identification("alexTerrieur", "y");

        //pretResponse = bs.userLoans(utilisateurPojo);

        //pretResponse = bs.notRenderedLoans();

        //pretTest.initializeRandom();

        //pretResponse = bs.createLoan(pretTest);

        //pretTest2.initializeRandom();

        //pretResponse = bs.createLoan(pretTest2);

        //pretResponse = bs.loanReturn(0);

        /**
         * ouvrageResponse = bs.ouvragesSearch("Harry");
         */

//        List<OuvragePojo> listTest = new ArrayList();
//
//        listTest = ouvrageDao.findAllByParam("esc");






    }

    private boolean connexion(String pseudo, String motDePasse) {
        UtilisateurPojo u = utilisateurDao.findByPseudo(pseudo);

        if (u.getMotDePasse().equals(motDePasse)) {
            return true;
        } else {
            return false;
        }
    }
}