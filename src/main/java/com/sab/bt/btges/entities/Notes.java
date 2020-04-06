package com.sab.bt.btges.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToOne;
@Entity
public class Notes implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String annee;
    private double note;
    @OneToOne(mappedBy = "note")
    private Militaire militaire;
    


    /**
     * @return Long return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return String return the annee
     */
    public String getAnnee() {
        return annee;
    }

    /**
     * @param annee the annee to set
     */
    public void setAnnee(String annee) {
        this.annee = annee;
    }

    /**
     * @return double return the note
     */
    public double getNote() {
        return note;
    }

    /**
     * @param note the note to set
     */
    public void setNote(double note) {
        this.note = note;
    }

    /**
     * @return Militaire return the militaire
     */
    public Militaire getMilitaire() {
        return militaire;
    }

    /**
     * @param militaire the militaire to set
     */
    public void setMilitaire(Militaire militaire) {
        this.militaire = militaire;
    }

    public Notes(String annee, double note) {
        this.annee = annee;
        this.note = note;
        this.militaire = militaire;
    }
    public Notes() {
        
    }
}
