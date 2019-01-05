package com.bibliothek;

import com.bibliothek.gestion.impl.GestionOuvrageImpl;
import com.bibliothek.gestion.interfaces.GestionOuvrage;
import com.bibliothek.webservice.BibliothekService;
import com.bibliothek.webservice.responses.OuvrageResponse;
import com.bibliothek.webservice.responses.PretResponse;
import com.bibliothek.webservice.responses.UtilisateurResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        BibliothekService bibliothekService = new BibliothekService();

        //SOAP REQUESTS TESTS

        OuvrageResponse search = bibliothekService.ouvragesSearch("Harry");

        OuvrageResponse ouvrages =bibliothekService.allOuvrages();

        UtilisateurResponse identifie = bibliothekService.identification("AlexTerrieur", "motDePasse");

        PretResponse loansByPseudo = bibliothekService.userLoansByPseudo("alexTerrieur");

        PretResponse extendedLoan = bibliothekService.extendLoan(6);

        PretResponse notRenderedLoans = bibliothekService.notRenderedLoans();

        PretResponse loanReturn = bibliothekService.loanReturn(6);

        PretResponse allLoans = bibliothekService.allLoans();
    }
}
