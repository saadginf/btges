package com.sab.bt.btges.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
@Entity
public class Stages extends infoMilitaire {
    
    
    @ManyToMany(mappedBy = "stages")
    private Set<Militaire> miltaires= new HashSet<Militaire>();

    @OneToMany(mappedBy = "stageActif")
    private Set<Militaire> miltairesActifSt;
    
    private int valeur;
  
    public Stages() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    
    

    public Stages(String libbele) {
        super(libbele);
        // TODO Auto-generated constructor stub
    }
    
     /**
     * @return int return the valeur
     */
    public int getValeur() {
        return valeur;
    }

    /**
     * @param valeur the valeur to set
     */
    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    /**
     * @return Set<Militaire> return the miltaires
     */
    public Set<Militaire> getMiltaires() {
        return miltaires;
    }

    /**
     * @param miltaires the miltaires to set
     */
    public void setMiltaires(Set<Militaire> miltaires) {
        this.miltaires = miltaires;
    }



}