package com.sab.bt.btges.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class NoteCie implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String annee;
    private String appreciation;
    private double attitudeTenue;
    private double disponbilite;
    private double moralite;
    private double autorite;
    private double espritEquipe;
    private double qualification;
    private double adaptation;
    private double rendement;
    @OneToOne(mappedBy = "noteCie")
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
     * @return String return the appreciation
     */
    public String getAppreciation() {
        return appreciation;
    }

    /**
     * @param appreciation the appreciation to set
     */
    public void setAppreciation(String appreciation) {
        this.appreciation = appreciation;
    }

    /**
     * @return double return the attitudeTenue
     */
    public double getAttitudeTenue() {
        return attitudeTenue;
    }

    /**
     * @param attitudeTenue the attitudeTenue to set
     */
    public void setAttitudeTenue(double attitudeTenue) {
        this.attitudeTenue = attitudeTenue;
    }

    /**
     * @return double return the disponbilite
     */
    public double getDisponbilite() {
        return disponbilite;
    }

    /**
     * @param disponbilite the disponbilite to set
     */
    public void setDisponbilite(double disponbilite) {
        this.disponbilite = disponbilite;
    }

    /**
     * @return double return the moralite
     */
    public double getMoralite() {
        return moralite;
    }

    /**
     * @param moralite the moralite to set
     */
    public void setMoralite(double moralite) {
        this.moralite = moralite;
    }

    /**
     * @return double return the autorite
     */
    public double getAutorite() {
        return autorite;
    }

    /**
     * @param autorite the autorite to set
     */
    public void setAutorite(double autorite) {
        this.autorite = autorite;
    }

    /**
     * @return double return the espritEquipe
     */
    public double getEspritEquipe() {
        return espritEquipe;
    }

    /**
     * @param espritEquipe the espritEquipe to set
     */
    public void setEspritEquipe(double espritEquipe) {
        this.espritEquipe = espritEquipe;
    }

    /**
     * @return double return the qualification
     */
    public double getQualification() {
        return qualification;
    }

    /**
     * @param qualification the qualification to set
     */
    public void setQualification(double qualification) {
        this.qualification = qualification;
    }

    /**
     * @return double return the adaptation
     */
    public double getAdaptation() {
        return adaptation;
    }

    /**
     * @param adaptation the adaptation to set
     */
    public void setAdaptation(double adaptation) {
        this.adaptation = adaptation;
    }

    /**
     * @return double return the rendement
     */
    public double getRendement() {
        return rendement;
    }

    /**
     * @param rendement the rendement to set
     */
    public void setRendement(double rendement) {
        this.rendement = rendement;
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

}