package com.sab.bt.btges.entities;

import java.util.Set;

import javax.persistence.Entity;

import javax.persistence.OneToMany;

@Entity
public class Affectation extends infoMilitaire {
    
    @OneToMany(mappedBy = "affectation")
    private Set<Militaire> miltaires;
    public Affectation( ) {
    
       
    }
    public Affectation( String libbele) {
        super(libbele);
       
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