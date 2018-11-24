package com.bibliothek;

import com.bibliothek.gestion.beans.OuvrageBean;
import com.bibliothek.webservice.BibliothekService;
import com.bibliothek.webservice.responses.OuvrageResponse;

import java.util.List;

public class main {


    public static void main(String[] args )
    {
        BibliothekService bibliothekService = new BibliothekService();

        OuvrageResponse ouvrages =bibliothekService.allOuvrages();
        System.out.println("bonjour");
    }
}
