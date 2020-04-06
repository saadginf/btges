package com.sab.bt.btges.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
@Entity
public class Origine extends infoMilitaire {
    
    @OneToMany(mappedBy = "origine")
    private Set<Militaire> miltaires;
    public Origine(String libbele) {
        super(libbele);
        // TODO Auto-generated constructor stub
    }
    
    public Origine() {
       
        // TODO Auto-generated constructor stub
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