package com.bibliothek;

import com.bibliothek.webservice.BibliothekService;
import com.bibliothek.webservice.responses.OuvrageResponse;
import com.bibliothek.webservice.responses.PretResponse;
import com.bibliothek.webservice.responses.UtilisateurResponse;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args )
    {
        ApplicationContext vApplicationContext = new ClassPathXmlApplicationContext("classpath:/spring.xml");

        BibliothekService vBS = vApplicationContext.getBean("bibliothekService", BibliothekService.class);

        //SOAP REQUESTS TESTS

        OuvrageResponse search = vBS.ouvragesSearch("Harry");

        OuvrageResponse ouvrages = vBS.allOuvrages();

        UtilisateurResponse identifie = vBS.identification("alexTerrieur", "motDePasse");

        PretResponse loansByPseudo = vBS.userLoansByPseudo("alainTerrieur");

        PretResponse extendedLoan = vBS.extendLoan(6);

        PretResponse notRenderedLoans = vBS.notRenderedLoans();

        PretResponse loanReturn = vBS.loanReturn(6);

        PretResponse allLoans = vBS.allLoans();
    }
}
