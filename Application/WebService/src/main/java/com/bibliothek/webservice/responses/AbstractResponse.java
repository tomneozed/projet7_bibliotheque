package com.bibliothek.webservice.responses;

public class AbstractResponse  {

    /**
     * typeErreur = 0 / null : no error
     * typeErreur = 1 : technical error
     * typeErreur = 2 : functional error
     */
    private int typeErreur;

    private String messageErreur;

    public AbstractResponse() {

    }

    public int getTypeErreur() {
        return typeErreur;
    }

    public void setTypeErreur(int typeErreur) {
        this.typeErreur = typeErreur;
    }

    public String getMessageErreur() {
        return messageErreur;
    }

    public void setMessageErreur(String messageErreur) {
        this.messageErreur = messageErreur;
    }
}
