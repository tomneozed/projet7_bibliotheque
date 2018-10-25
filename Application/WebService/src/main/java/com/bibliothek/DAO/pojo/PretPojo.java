package com.bibliothek.DAO.pojo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

@Entity(name="pret")
public class PretPojo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="date_debut_pret")
    private Date dateDebutPret;

    @Column(name="date_fin_pret")
    private Date dateFinPret;

    private boolean prolongation;

    private String etat;

    @Column(name="id_utilisateur")
    private int idUtilisateur;

    @Column(name="id_ouvrage")
    private int idOuvrage;

    public PretPojo() {
    }

    public PretPojo(int id, Date dateDebutPret, Date dateFinPret, boolean prolongation, String etat, int idUtilisateur, int idOuvrage) {
        this.id = id;
        this.dateDebutPret = dateDebutPret;
        this.dateFinPret = dateFinPret;
        this.prolongation = prolongation;
        this.etat = etat;
        this.idUtilisateur = idUtilisateur;
        this.idOuvrage = idOuvrage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateDebutPret() {
        return dateDebutPret;
    }

    public void setDateDebutPret(Date dateDebutPret) {
        this.dateDebutPret = dateDebutPret;
    }

    public Date getDateFinPret() {
        return dateFinPret;
    }

    public void setDateFinPret(Date dateFinPret) {
        this.dateFinPret = dateFinPret;
    }

    public boolean isProlongation() {
        return prolongation;
    }

    public void setProlongation(boolean prolongation) {
        this.prolongation = prolongation;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public int getIdOuvrage() {
        return idOuvrage;
    }

    public void setIdOuvrage(int idOuvrage) {
        this.idOuvrage = idOuvrage;
    }

    public void initializeRandom(){
        setDateDebutPret(new Date());
        setDateFinPret(determinesDateFinPret(getDateDebutPret()));
        setProlongation(false);
        setEtat("en cours");
        setIdUtilisateur(ThreadLocalRandom.current().nextInt(1, 10));
        setIdOuvrage(ThreadLocalRandom.current().nextInt(1, 10));
    }


    public Date determinesDateFinPret(Date dateDebutPret){
        //Convert Date to Calendar
        Calendar c = Calendar.getInstance();
        c.setTime(dateDebutPret);

        //Extending return date
        c.add(Calendar.WEEK_OF_MONTH, 4);

        //Convert Calendar back to Date
        return c.getTime();
    }

    /**
     * Checks date and updates state of the specified loan if necessary
     * @return true if the state changed
     */
    public boolean checkDate(){

        if(this.getDateFinPret().before(new Date())){
            this.setEtat("non rendu");
            return true;
        }else {
            return false;
        }
    }




}
