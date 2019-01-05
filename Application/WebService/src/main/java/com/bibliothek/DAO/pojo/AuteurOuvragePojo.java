package com.bibliothek.DAO.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity(name="auteur_ouvrage")
@Table(name="auteur_ouvrage")
public class AuteurOuvragePojo implements Serializable {

    //ATTRIBUTES
    @Id
    @Column(name = "id_auteur")
    private int auteurId;

    @Id
    @Column(name="id_ouvrage")
    private int ouvrageId;

    //CONTRUCTORS
    public AuteurOuvragePojo() {
    }

    public AuteurOuvragePojo(int auteurId, int ouvrageId) {
        this.auteurId = auteurId;
        this.ouvrageId = ouvrageId;
    }

    //GETTERS & SETTERS
    public int getAuteurId() {
        return auteurId;
    }

    public void setAuteurId(int auteurId) {
        this.auteurId = auteurId;
    }

    public int getOuvrageId() {
        return ouvrageId;
    }

    public void setOuvrageId(int ouvrageId) {
        this.ouvrageId = ouvrageId;
    }
}
