package com.bibliothek;

import com.bibliothek.gestion.beans.OuvrageBean;
import com.bibliothek.webservice.BibliothekService;

import java.util.List;

public class main {


    public static void main(String[] args )
    {
        BibliothekService bibliothekService = new BibliothekService();

        //List<OuvrageBean> loans =bibliothekService.userLoansByPseudo();
        System.out.println("bonjour");
    }
}
